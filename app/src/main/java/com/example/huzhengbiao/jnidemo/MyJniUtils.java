package com.example.huzhengbiao.jnidemo;

/**
 * 主要功能:
 * author huzhengbiao
 * date : On 2018/10/30
 */
public class MyJniUtils {

    static {
        System.loadLibrary("main");
    }

    public native String getName();
}
