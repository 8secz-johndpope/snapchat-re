package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class zzj extends zzh {
    private static final WeakReference<byte[]> zzfrg = new WeakReference(null);
    private WeakReference<byte[]> zzfrf = zzfrg;

    zzj(byte[] bArr) {
        super(bArr);
    }

    /* Access modifiers changed, original: final */
    public final byte[] getBytes() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.zzfrf.get();
            if (bArr == null) {
                bArr = zzahi();
                this.zzfrf = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] zzahi();
}
