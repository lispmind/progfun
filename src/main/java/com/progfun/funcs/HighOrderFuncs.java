package com.progfun.funcs;

public class HighOrderFuncs {

    public int sumInt(int a, int b) {
        if (a > b) {
            return 0;
        } else {
            return a + sumInt(a + 1, b);
        }
    }
}