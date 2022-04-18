package com.example.demo;

/**
 * All rights Reserved, Designed By www.xakrsoft.com
 *
 * @author 白羊
 * @ClassName NameNotFoundException
 * @Description: TODO
 * @date 2022-04-18 11:15
 * @Copyright: 2022 www.xakrsoft.com All rights reserved.
 */

public class NameNotFoundException extends Exception{
    private int errCode;

    public NameNotFoundException(int errCode, String message) {
        super(message);
        this.errCode = errCode;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }
}
