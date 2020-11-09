package com.demo.utils;

public enum Sex {
    OTHER(3),
    MALE(1),
    FEMALE(2);

    public final int code;

    Sex(int i) {
        code = i;
    }
}
