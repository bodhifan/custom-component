package com.rpc.services.imp;

import com.rpc.services.EchoService;

/**
 * Created by bodhi on 6/11/16.
 */
public class EchoServiceImp1 implements EchoService {

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    String msg;
    public EchoServiceImp1()
    {

    }
    public EchoServiceImp1(String msg)
    {
        this.msg = msg;
    }
    public void echo() {
        System.out.println("this is echo:" + msg);
    }
}
