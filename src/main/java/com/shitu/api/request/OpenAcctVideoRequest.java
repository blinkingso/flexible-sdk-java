package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.ClientSdkException;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.OpenAcctModel;
import com.shitu.api.response.OpenAcctResponse;
import com.shitu.api.utils.FileUtil;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;

/**
 * @author andrew
 * @date 2021-10-28 2:03 PM
 */
public class OpenAcctVideoRequest extends AbstractFlexibleRequest<OpenAcctResponse> {

    private static final String IMG_TOO_LARGE = "银行卡图片不能超过2MB";
    private static final String VIDEO_TOO_LARGE = "活体视频不能超过5MB";

    private final OpenAcctModel bizModel;
    private File imgBank;
    private byte[] imgBankBytes;
    private File videoBase64;
    private byte[] videoBase64Bytes;

    public OpenAcctVideoRequest(OpenAcctModel bizModel) {
        Objects.requireNonNull(bizModel);
        this.bizModel = bizModel;
    }

    public OpenAcctModel getBizModel() {
        return bizModel;
    }

    public File getImgBank() {
        return imgBank;
    }

    public void setImgBank(File imgBank) {
        this.imgBank = imgBank;
    }

    public byte[] getImgBankBytes() {
        return imgBankBytes;
    }

    public void setImgBankBytes(byte[] imgBankBytes) {
        this.imgBankBytes = imgBankBytes;
    }

    public File getVideoBase64() {
        return videoBase64;
    }

    public void setVideoBase64(File videoBase64) {
        this.videoBase64 = videoBase64;
    }

    public byte[] getVideoBase64Bytes() {
        return videoBase64Bytes;
    }

    public void setVideoBase64Bytes(byte[] videoBase64Bytes) {
        this.videoBase64Bytes = videoBase64Bytes;
    }

    /**
     * API route
     *
     * @return route
     */
    @Override
    public String getApi() {
        return Constant.Api.API_ACCT_OPEN_VIDEO;
    }

    @Override
    protected void checkParams() throws ClientSdkException {
        if (getBizModel().getImgBank() == null) {
            if (getImgBank() == null && getImgBankBytes() == null) {
                throw new ClientSdkException("银行卡图片未设置");
            }
            if (getImgBankBytes() != null) {
                getBizModel().setImgBank(Base64.getEncoder().encodeToString(getImgBankBytes()));
            } else if (getImgBank() != null) {
                getBizModel().setImgBank(Base64.getEncoder()
                        .encodeToString(FileUtil.fileToBytes(getImgBank())));
            }
        }

        if (getBizModel().getVideoBase64() == null) {
            if (getVideoBase64() == null && getVideoBase64Bytes() == null) {
                throw new ClientSdkException("活体认证未设置");
            }
            if (getVideoBase64Bytes() != null) {
                getBizModel().setVideoBase64(Base64.getEncoder().encodeToString(getVideoBase64Bytes()));
            } else if (getVideoBase64() != null) {
                getBizModel().setVideoBase64(Base64.getEncoder()
                        .encodeToString(FileUtil.fileToBytes(getVideoBase64())));
            }
        }

        try {
            byte[] img = getBizModel().getImgBank().getBytes(StandardCharsets.UTF_8);
            if (img.length > Constant.FILE_MAX_SIZE) {
                throw new ClientSdkException(IMG_TOO_LARGE);
            }

            byte[] video = getBizModel().getVideoBase64().getBytes(StandardCharsets.UTF_8);
            if (video.length > Constant.VIDEO_FILE_MAX_SIZE) {
                throw new ClientSdkException(VIDEO_TOO_LARGE);
            }
        } catch (Exception e) {
            throw new ClientSdkException(e);
        }
    }

    /**
     * 实际的请求参数的json格式的字符串
     *
     * @return json字符串
     */
    @Override
    protected String doGetParams() {
        return JSON.toJSONString(getBizModel());
    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型R
     */
    @Override
    public Class<OpenAcctResponse> getResponseClass() {
        return OpenAcctResponse.class;
    }
}
