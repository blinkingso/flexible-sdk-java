package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.UpdateAcctModel;
import com.shitu.api.response.UpdateAcctResponse;
import com.shitu.api.utils.FileUtil;

import java.io.File;
import java.util.Base64;
import java.util.Objects;

/**
 * 用户信息变更接口
 * @author andrew
 * @date 2021-10-28 5:36 PM
 */
public class UpdateAcctRequest extends AbstractFlexibleRequest<UpdateAcctResponse> {

    private final UpdateAcctModel bizModel;

    public UpdateAcctRequest(UpdateAcctModel bizModel) {
        Objects.requireNonNull(bizModel);
        this.bizModel = bizModel;
    }

    public UpdateAcctModel getBizModel() {
        return bizModel;
    }


    public void setIdCardFrontImg(File idCardFrontImg) {
        if (null != idCardFrontImg && getBizModel().getImgIdCardFront() == null) {
            getBizModel().setImgIdCardFront(Base64
                    .getEncoder()
                    .encodeToString(FileUtil.fileToBytes(idCardFrontImg)));
        }
    }

    public void setIdCardBackImg(File idCardBackImg) {
        if (null != idCardBackImg && getBizModel().getImgIdCardBack() == null) {
            getBizModel().setImgIdCardBack(Base64
                    .getEncoder()
                    .encodeToString(FileUtil.fileToBytes(idCardBackImg)));
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
     * API route
     *
     * @return route
     */
    @Override
    public String getApi() {
        return Constant.Api.API_ACCT_UPDATE;
    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型R
     */
    @Override
    public Class<UpdateAcctResponse> getResponseClass() {
        return UpdateAcctResponse.class;
    }
}
