package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.constants.Constant;
import com.shitu.api.response.SubOrderQueryResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author andrew
 * @date 2021-10-28 5:47 PM
 */
public class SubOrderQueryRequest extends AbstractFlexibleRequest<SubOrderQueryResponse> {

    private final String orderNo;

    public SubOrderQueryRequest(String orderNo) {
        Objects.requireNonNull(orderNo);
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    private Map<String, String> getParamMap() {
        Map<String, String> params = new HashMap<>(1);
        params.put("orderNo", getOrderNo());
        return params;
    }

    /**
     * 实际的请求参数的json格式的字符串
     *
     * @return json字符串
     */
    @Override
    protected String doGetParams() {
        return JSON.toJSONString(getParamMap());
    }

    /**
     * API route
     *
     * @return route
     */
    @Override
    public String getApi() {
        return Constant.Api.API_ORDER_QUERY_SUB;
    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型R
     */
    @Override
    public Class<SubOrderQueryResponse> getResponseClass() {
        return SubOrderQueryResponse.class;
    }
}
