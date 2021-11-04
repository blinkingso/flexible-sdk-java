package com.shitu.api.model;

import java.io.Serializable;

/**
 * @author andrew
 * @date 2021-10-28 11:47 AM
 */
public final class PayInfoDetail implements Serializable {

    private static final long serialVersionUID = -6492348714228694207L;

    /**
     * 会员ID
     */
    private String memberId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 金额
     */
    private String fee;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public static final class Builder {
        private String memberId;
        private String name;
        private String idCard;
        private String fee;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder idCard(String idCard) {
            this.idCard = idCard;
            return this;
        }

        public Builder fee(String fee) {
            this.fee = fee;
            return this;
        }

        public PayInfoDetail build() {
            PayInfoDetail payInfoDetail = new PayInfoDetail();
            payInfoDetail.setMemberId(memberId);
            payInfoDetail.setName(name);
            payInfoDetail.setIdCard(idCard);
            payInfoDetail.setFee(fee);
            return payInfoDetail;
        }
    }
}
