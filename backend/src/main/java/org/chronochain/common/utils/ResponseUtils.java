package org.chronochain.common.utils;


import com.alibaba.fastjson2.JSON;
import org.chronochain.common.exception.BitgetApiException;
import org.chronochain.dto.response.ResponseResult;

public class ResponseUtils {
    public static final String SUCCESS = "200";

    public static ResponseResult handleResponse(ResponseResult response) {
        if (!SUCCESS.equals(response.getHttpCode())) {
            throw new BitgetApiException(JSON.toJSONString(response), response.getHttpCode(), response.getCode(), response.getMsg());
        }

        return response;
    }
}
