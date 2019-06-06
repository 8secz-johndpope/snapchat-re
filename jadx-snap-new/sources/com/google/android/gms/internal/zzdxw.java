package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class zzdxw implements zzdsy {
    private final zzdyi zzmlg;
    private final zzdtj zzmlh;
    private final int zzmli;

    public zzdxw(zzdyi zzdyi, zzdtj zzdtj, int i) {
        this.zzmlg = zzdyi;
        this.zzmlh = zzdtj;
        this.zzmli = i;
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) {
        bArr = this.zzmlg.zzaj(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        copyOf = this.zzmlh.zzaf(zzdxi.zzc(bArr2, bArr, copyOf));
        return zzdxi.zzc(bArr, copyOf);
    }
}
