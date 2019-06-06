package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class zzbz implements Runnable {
    private zzbz() {
    }

    public final void run() {
        try {
            zzbx.zzyx = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            zzbx.zzza.countDown();
        }
        zzbx.zzza.countDown();
    }
}
