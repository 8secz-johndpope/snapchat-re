package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.regex.Pattern;

public final class zzdyp {
    private static final Pattern zzmmd;
    private static final Pattern zzmme;

    static {
        r1 = new Object[4];
        String str = "([0-9a-zA-Z\\-\\.\\_~])+";
        r1[0] = str;
        r1[1] = str;
        r1[2] = str;
        r1[3] = str;
        zzmmd = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", r1), 2);
        zzmme = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[]{str, str, str, str, str}), 2);
    }

    public static void zzgz(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new GeneralSecurityException("invalid AES key size");
        }
    }

    public static void zzw(int i, int i2) {
        if (i < 0 || i > 0) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[]{Integer.valueOf(i), Integer.valueOf(0)}));
        }
    }
}
