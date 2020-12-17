package com.yu.localmapcache.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @Author yu
 * @DateTime 2020/12/17 22:26
 */
@Data
@Builder
public class CommonResp {

    private String status;
    private String message;
    private Object data;

    public static CommonResp success(Object data) {
        return CommonResp.builder().status("success").message("success").data(data).build();
    }

    public static CommonResp success(String message, Object data) {
        return CommonResp.builder().status("success").message(message).data(data).build();
    }

    public static CommonResp fail(Object data) {
        return CommonResp.builder().status("fail").message("fail").data(data).build();
    }

    public static CommonResp fail(String message, Object data) {
        return CommonResp.builder().status("fail").message(message).data(data).build();
    }
}
