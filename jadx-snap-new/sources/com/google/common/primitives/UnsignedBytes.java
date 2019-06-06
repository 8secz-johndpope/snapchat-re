package com.google.common.primitives;

public final class UnsignedBytes {
    public static int toInt(byte b) {
        return b & 255;
    }
}
