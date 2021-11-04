package com.shitu.api.response;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * 注册返回
 *
 * @author andrew
 * @date 2021-10-27 10:27 AM
 */
public final class RegisterResponse extends AbstractApiResponse implements Serializable {
    private static final long serialVersionUID = -7632922750024768354L;

    /**
     * 会员id
     */
    private String memberId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RegisterResponse.class.getSimpleName() + "[", "]")
                .add("memberId='" + memberId + "'")
                .toString();
    }
}
