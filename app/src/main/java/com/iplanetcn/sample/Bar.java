package com.iplanetcn.sample;


public class Bar {
    // can be simplified to
    // bar = isFoo();
    private boolean bar = isFoo();

    private boolean isFoo() { return false;}
}