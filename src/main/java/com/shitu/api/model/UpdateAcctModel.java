package com.shitu.api.model;

import java.io.Serializable;

/**
 * @author andrew
 * @date 2021-10-27 10:32 AM
 */
public final class UpdateAcctModel implements Serializable {
    private static final long serialVersionUID = -8640158084754123370L;

    /**
     * 商户号
     */
    private String merchantNo;
    /**
     * 服务商号
     */
    private String providerNo;
    /**
     * 会员ID
     */
    private String memberId;
    /**
     * 变更类型 1:变更注册手机号 2:变更影像件 3:拓展业务类型 4：变更结算卡信息
     */
    private String changeType;
    /**
     * 支付通道
     */
    private String payPass;
    /**
     * 银行编号
     */
    private String bankNo;
    /**
     * 开户行名称
     */
    private String bankName;
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 银行预留手机号
     */
    private String bankPhone;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 身份证正面
     */
    private String imgIdCardFront;
    /**
     * 身份证反面
     */
    private String imgIdCardBack;
    /**
     * 业务类型  1委托代征2.个体户注册(分包)3.自然人代开4.临时税务登记
     */
    private String busType;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getProviderNo() {
        return providerNo;
    }

    public void setProviderNo(String providerNo) {
        this.providerNo = providerNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgIdCardFront() {
        return imgIdCardFront;
    }

    public void setImgIdCardFront(String imgIdCardFront) {
        this.imgIdCardFront = imgIdCardFront;
    }

    public String getImgIdCardBack() {
        return imgIdCardBack;
    }

    public void setImgIdCardBack(String imgIdCardBack) {
        this.imgIdCardBack = imgIdCardBack;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public static final class Builder {
        private String merchantNo;
        private String providerNo;
        private String memberId;
        private String changeType;
        private String payPass;
        private String bankNo;
        private String bankName;
        private String cardNo;
        private String bankPhone;
        private String phone;
        private String imgIdCardFront;
        private String imgIdCardBack;
        private String busType;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder merchantNo(String merchantNo) {
            this.merchantNo = merchantNo;
            return this;
        }

        public Builder providerNo(String providerNo) {
            this.providerNo = providerNo;
            return this;
        }

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        public Builder changeType(String changeType) {
            this.changeType = changeType;
            return this;
        }

        public Builder payPass(String payPass) {
            this.payPass = payPass;
            return this;
        }

        public Builder bankNo(String bankNo) {
            this.bankNo = bankNo;
            return this;
        }

        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public Builder cardNo(String cardNo) {
            this.cardNo = cardNo;
            return this;
        }

        public Builder bankPhone(String bankPhone) {
            this.bankPhone = bankPhone;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder imgIdCardFront(String imgIdCardFront) {
            this.imgIdCardFront = imgIdCardFront;
            return this;
        }

        public Builder imgIdCardBack(String imgIdCardBack) {
            this.imgIdCardBack = imgIdCardBack;
            return this;
        }

        public Builder busType(String busType) {
            this.busType = busType;
            return this;
        }

        public UpdateAcctModel build() {
            UpdateAcctModel updateAcctModel = new UpdateAcctModel();
            updateAcctModel.setMerchantNo(merchantNo);
            updateAcctModel.setProviderNo(providerNo);
            updateAcctModel.setMemberId(memberId);
            updateAcctModel.setChangeType(changeType);
            updateAcctModel.setPayPass(payPass);
            updateAcctModel.setBankNo(bankNo);
            updateAcctModel.setBankName(bankName);
            updateAcctModel.setCardNo(cardNo);
            updateAcctModel.setBankPhone(bankPhone);
            updateAcctModel.setPhone(phone);
            updateAcctModel.setImgIdCardFront(imgIdCardFront);
            updateAcctModel.setImgIdCardBack(imgIdCardBack);
            updateAcctModel.setBusType(busType);
            return updateAcctModel;
        }
    }
}
