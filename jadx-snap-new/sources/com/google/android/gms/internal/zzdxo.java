package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

public final class zzdxo implements zzdte {
    private static final byte[] zzmfg = new byte[0];
    private final String zzmkp;
    private final byte[] zzmkq;
    private final zzdxv zzmkr;
    private final zzdxm zzmks;
    private final zzdxq zzmkt;

    public zzdxo(ECPublicKey eCPublicKey, byte[] bArr, String str, zzdxv zzdxv, zzdxm zzdxm) {
        zzdxs.zza(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zzmkt = new zzdxq(eCPublicKey);
        this.zzmkq = bArr;
        this.zzmkp = str;
        this.zzmkr = zzdxv;
        this.zzmks = zzdxm;
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) {
        zzdxr zza = this.zzmkt.zza(this.zzmkp, this.zzmkq, bArr2, this.zzmks.zzbok(), this.zzmkr);
        bArr = this.zzmks.zzah(zza.zzbsr()).zzd(bArr, zzmfg);
        bArr2 = zza.zzbsq();
        return ByteBuffer.allocate(bArr2.length + bArr.length).put(bArr2).put(bArr).array();
    }
}
