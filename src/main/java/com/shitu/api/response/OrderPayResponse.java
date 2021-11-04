package com.shitu.api.response;

import java.io.Serializable;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author andrew
 * @date 2021-10-27 1:57 PM
 */
public final class OrderPayResponse extends AbstractApiResponse implements Serializable {
    private static final long serialVersionUID = -8161842676428008367L;

    /**
     * 系统批次流水号
     */
    private String batchOrderId;

    /**
     * code = 1001 时有值, 表示提交成功
     */
    private List<PayOrderDetail> payList;
    /**
     * code = 1002 时有值, 表示提交失败
     */
    private List<FailOrderDetail> failList;

    public String getBatchOrderId() {
        return batchOrderId;
    }

    public void setBatchOrderId(String batchOrderId) {
        this.batchOrderId = batchOrderId;
    }

    public List<PayOrderDetail> getPayList() {
        return payList;
    }

    public void setPayList(List<PayOrderDetail> payList) {
        this.payList = payList;
    }

    public List<FailOrderDetail> getFailList() {
        return failList;
    }

    public void setFailList(List<FailOrderDetail> failList) {
        this.failList = failList;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OrderPayResponse.class.getSimpleName() + "[", "]")
                .add("batchOrderId='" + batchOrderId + "'")
                .add("payList=" + payList)
                .add("failList=" + failList)
                .toString();
    }

    public static final class PayOrderDetail implements Serializable {
        private static final long serialVersionUID = -4783731287360513408L;

        /**
         * 会员ID
         */
        private String memberId;
        /**
         * 会员名称
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
        /**
         * 交易流水号
         */
        private String orderNo;
        /**
         * 支付状态[0:待支付 1:支付中 2:支付成功 3:支付失败4:已撤回]
         */
        private String payStatus;

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

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getPayStatus() {
            return payStatus;
        }

        public void setPayStatus(String payStatus) {
            this.payStatus = payStatus;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", PayOrderDetail.class.getSimpleName() + "[", "]")
                    .add("memberId='" + memberId + "'")
                    .add("name='" + name + "'")
                    .add("idCard='" + idCard + "'")
                    .add("fee='" + fee + "'")
                    .add("orderNo='" + orderNo + "'")
                    .add("payStatus='" + payStatus + "'")
                    .toString();
        }
    }

    public static final class FailOrderDetail implements Serializable {

        private static final long serialVersionUID = -7688186465347172599L;

        /**
         * 会员ID
         */
        private String memberId;
        /**
         * 会员名称
         */
        private String name;
        /**
         * 身份证号
         */
        private String idCard;
        /**
         * 支付宝号 支付通道2返回
         */
        private String aliPayNo;

        /**
         * 金额
         */
        private String fee;
        /**
         * 备注
         */
        private String remark;

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

        public String getAliPayNo() {
            return aliPayNo;
        }

        public void setAliPayNo(String aliPayNo) {
            this.aliPayNo = aliPayNo;
        }

        public String getFee() {
            return fee;
        }

        public void setFee(String fee) {
            this.fee = fee;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", FailOrderDetail.class.getSimpleName() + "[", "]")
                    .add("memberId='" + memberId + "'")
                    .add("name='" + name + "'")
                    .add("idCard='" + idCard + "'")
                    .add("aliPayNo='" + aliPayNo + "'")
                    .add("fee='" + fee + "'")
                    .add("remark='" + remark + "'")
                    .toString();
        }
    }
}
