package com.google.android.gms.internal;

import java.security.SecureRandom;

public final class zzdyl {
    private static final SecureRandom zzjsn = new SecureRandom();

    public static byte[] zzgy(int i) {
        byte[] bArr = new byte[i];
        zzjsn.nextBytes(bArr);
        return bArr;
    }
}
