package com.traveller.demo1.untils;

import lombok.Data;

@Data
public class Rsg {
    private int code;
    private String msg;
    private Object object;

    public Rsg(int code, String msg, Object object) {
        this.code = code;
        this.msg = msg;
        this.object = object;
    }


    public Rsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
