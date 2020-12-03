package com.codeGao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huanyu
 * @date 2020/12/2 10:31
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{
    private Integer code;
    private String message;
    private T data;

    public CommonResult (Integer code,String message){
        this(code,message,null);
    }

}
