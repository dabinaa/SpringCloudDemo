package com.dabin.springcloud.entities;

import lombok.Data;

/**
 * @ClassName:CommonResult
 * @author: dabin
 * @date: 2020/12/2823:54
 */
@Data
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }
}
