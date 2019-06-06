package com.snapchat.laguna.crypto.internal;

import com.snapchat.laguna.crypto.Leb128;

public class g {
    public static byte[] e(byte[] bArr, int i) {
        return Leb128.unserialize(bArr, i);
    }
}
