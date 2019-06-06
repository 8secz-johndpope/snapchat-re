package com.google.android.gms.internal;

public final class zzffa {
    private final byte[] zzpjv = new byte[256];
    private int zzpjw;
    private int zzpjx;

    public zzffa(byte[] bArr) {
        int i;
        for (i = 0; i < 256; i++) {
            this.zzpjv[i] = (byte) i;
        }
        int i2 = 0;
        for (i = 0; i < 256; i++) {
            byte[] bArr2 = this.zzpjv;
            i2 = ((i2 + bArr2[i]) + bArr[i % bArr.length]) & 255;
            byte b = bArr2[i];
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
        }
        this.zzpjw = 0;
        this.zzpjx = 0;
    }

    public final void zzay(byte[] bArr) {
        int i = this.zzpjw;
        int i2 = this.zzpjx;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.zzpjv;
            i2 = (i2 + bArr2[i]) & 255;
            byte b = bArr2[i];
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + bArr2[i2]) & 255] ^ bArr[i3]);
        }
        this.zzpjw = i;
        this.zzpjx = i2;
    }
}
