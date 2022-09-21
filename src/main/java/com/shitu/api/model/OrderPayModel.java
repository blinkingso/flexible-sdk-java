package com.shitu.api.model;

import java.io.Serializable;
import java.util.List;

import com.shitu.api.constants.PayPass;

/**
 * @author andrew
 * @date 2021-10-27 10:48 AM
 */
public final class OrderPayModel implements Serializable {
    private static final long serialVersionUID = 4287550960485509838L;

    /**
     * 商户号
     */
    private String merchantNo;
    /**
     * 服务商号
     */
    private String providerNo;
    /**
     * 任务编号
     */
    private String taskCode;
    /**
     * 产品编号
     */
    private String productCode;
    /**
     * 手续费承担方
     */
    private String costUndertaker;
    /**
     * 业务类型
     */
    private String busType;
    /**
     * 批次流水号
     */
    private String batchNumber;
    /**
     * 支付通道
     */
    private String payPass;

    /**
     * 支付信息
     */
    private List<PayInfoDetail> payList;

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

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getCostUndertaker() {
        return costUndertaker;
    }

    public void setCostUndertaker(String costUndertaker) {
        this.costUndertaker = costUndertaker;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass;
    }

    public List<PayInfoDetail> getPayList() {
        return payList;
    }

    public void setPayList(List<PayInfoDetail> payList) {
        this.payList = payList;
    }

    public static final class Builder {
        private String merchantNo;
        private String providerNo;
        private String taskCode;
        private String productCode;
        private String costUndertaker;
        private String busType;
        private String batchNumber;
        private String payPass;
        private List<PayInfoDetail> payList;

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

        public Builder taskCode(String taskCode) {
            this.taskCode = taskCode;
            return this;
        }

        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        public Builder costUndertaker(String costUndertaker) {
            this.costUndertaker = costUndertaker;
            return this;
        }

        public Builder busType(String busType) {
            this.busType = busType;
            return this;
        }

        public Builder batchNumber(String batchNumber) {
            this.batchNumber = batchNumber;
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

        public Builder payList(List<PayInfoDetail> payList) {
            this.payList = payList;
            return this;
        }

        public OrderPayModel build() {
            OrderPayModel orderPayModel = new OrderPayModel();
            orderPayModel.setMerchantNo(merchantNo);
            orderPayModel.setProviderNo(providerNo);
            orderPayModel.setTaskCode(taskCode);
            orderPayModel.setProductCode(productCode);
            orderPayModel.setCostUndertaker(costUndertaker);
            orderPayModel.setBusType(busType);
            orderPayModel.setBatchNumber(batchNumber);
            orderPayModel.setPayPass(payPass);
            orderPayModel.setPayList(payList);
            return orderPayModel;
        }
    }
}
