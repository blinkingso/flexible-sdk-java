package com.shitu.api.model;

import java.io.Serializable;

import com.shitu.api.constants.PayPass;

/**
 * 用户信息查询接口
 *
 * @author andrew
 * @date 2021-10-27 9:16 AM
 */
public final class QueryAcctModel implements Serializable {
    private static final long serialVersionUID = 1186795870925489678L;

    /**
     * 会员ID
     */
    private String memberId;
    /**
     * 查询类型 1:查询基本信息 2:查询开户信息 3: 查询会员ID
     */
    private String type;
    /**
     * 支付通道
     */
    private String payPass;
    /**
     * 身份证号(查询类型3必传)
     */
    private String idCard;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public static final class Builder {
        private String memberId;
        private String type;
        private String payPass;
        private String idCard;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        @Deprecated
        public Builder payPass(String payPass) {
            this.payPass = payPass;
            return this;
        }

        public Builder payPass(PayPass payPass) {
            this.payPass = payPass.getPayPass();
            return this;
        }

        public Builder idCard(String idCard) {
            this.idCard = idCard;
            return this;
        }

        public QueryAcctModel build() {
            QueryAcctModel queryAcctModel = new QueryAcctModel();
            queryAcctModel.setMemberId(memberId);
            queryAcctModel.setType(type);
            queryAcctModel.setPayPass(payPass);
            queryAcctModel.setIdCard(idCard);
            return queryAcctModel;
        }
    }
}
