package com.google.android.gms.internal;

import java.util.Arrays;

public final class zzdtm<P> {
    private final P zzmex;
    private final byte[] zzmey;
    private final zzdwj zzmez;
    private final zzdxb zzmfa;

    public zzdtm(P p, byte[] bArr, zzdwj zzdwj, zzdxb zzdxb) {
        this.zzmex = p;
        this.zzmey = Arrays.copyOf(bArr, bArr.length);
        this.zzmez = zzdwj;
        this.zzmfa = zzdxb;
    }

    public final P zzbog() {
        return this.zzmex;
    }

    public final byte[] zzboh() {
        byte[] bArr = this.zzmey;
        return bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
    }
}
