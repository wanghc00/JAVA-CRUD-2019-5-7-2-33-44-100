/*
 * Copyright (C), 1992-2019
 * Package com.employee.crud.exception 
 * FileName: BusinessException.java
 * Author:   wang-hc
 * Date:     2019年8月1日 下午7:16:08
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月1日下午7:16:08                     1.0                  
 *===============================================================================================
 */
package com.employee.crud.exception;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2019年8月1日 <br>
 * 作者：wang-hc <br>
 * 说明：<br>
 */
public class BusinessException extends Exception {
    /**
     */
    private static final long serialVersionUID = 1L;
    private String message;

    public BusinessException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
