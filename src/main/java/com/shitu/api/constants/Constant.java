package com.shitu.api.constants;

/**
 * 常量定义
 *
 * @author andrew
 * @date 2021-10-27 11:19 AM
 */
public enum Constant {
    ;

    /**
     * 上传文件最大限制为2Mb(base64编码后)
     */
    public static final int FILE_MAX_SIZE = 2 * 1024 * 1024;
    /**
     * 活体认证视频最大5mb(base64编码后)
     */
    public static final int VIDEO_FILE_MAX_SIZE = 5 * 1024 * 1024;

    public enum Api {
        ;

        /**
         * 商户信息查询
         */
        public static final String API_MERCHANT_QUERY = "/acct/info";
        /**
         * 注册用户
         */
        public static final String API_ACCT_REGISTER = "/acct/register";
        /**
         * 开通银行账户
         */
        public static final String API_ACCT_OPEN = "/acct/open";

        /**
         * 活体认证开户接口
         */
        public static final String API_ACCT_OPEN_VIDEO = "/acct/open/video";
        /**
         * 查询账户信息
         */
        public static final String API_ACCT_QUERY = "/acct/query";
        /**
         * 修改账户信息
         */
        public static final String API_ACCT_UPDATE = "/acct/update";
        /**
         * 下单支付(提现)
         */
        public static final String API_ORDER_PAY = "/order/pay";
        /**
         * 批次号查询所有订单信息
         */
        public static final String API_ORDER_QUERY_BATCH = "/order/query/batch";
        /**
         * 查询子订单信息
         */
        public static final String API_ORDER_QUERY_SUB = "/order/query/detail";

    }
}
