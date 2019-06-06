package com.google.common.primitives;

public final class Bytes {
    public static byte[] concat(byte[]... bArr) {
        int i = 0;
        for (byte[] length : bArr) {
            i += length.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (Object obj : bArr) {
            System.arraycopy(obj, 0, bArr2, i2, obj.length);
            i2 += obj.length;
        }
        return bArr2;
    }
}
