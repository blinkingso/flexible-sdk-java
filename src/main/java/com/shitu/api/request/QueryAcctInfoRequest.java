package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.constants.Constant;
import com.shitu.api.response.QueryAcctInfoResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author andrew
 * @date 2021-10-28 5:49 PM
 */
public class QueryAcctInfoRequest extends AbstractFlexibleRequest<QueryAcctInfoResponse> {

    private final String payPass;

    public QueryAcctInfoRequest(String payPass) {
        this.payPass = payPass;
    }

    public String getPayPass() {
        return payPass;
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

    private Map<String, String> getParamMap() {
        Map<String, String> params = new HashMap<>(1);
        params.put("payPass", getPayPass());
        return params;
    }

    /**
     * API route
     *
     * @return route
     */
    @Override
    public String getApi() {
        return Constant.Api.API_MERCHANT_QUERY;
    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型R
     */
    @Override
    public Class<QueryAcctInfoResponse> getResponseClass() {
        return QueryAcctInfoResponse.class;
    }
}
