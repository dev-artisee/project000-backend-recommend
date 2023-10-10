package xyz.devartisee.recommend.controller.dto.base;

import lombok.Data;

@Data
public class BaseResponse {

    String message = null;
    Integer code = null;
    Object data = null;

    public static BaseResponse of(Integer code, String message, Object data) {
        BaseResponse body = new BaseResponse();
        body.message = message;
        body.code = code;
        body.data = data;
        return body;
    }
}
