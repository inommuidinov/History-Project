package com.core;

public enum Variant {
    A, B, C, D, NO;

    public int toNum() {
        switch (this) {
            case A:
                return 0;
            case B:
                return 1;
            case C:
                return 2;
            case D:
                return 3;
            default:
                return -1;
        }
    }
}
