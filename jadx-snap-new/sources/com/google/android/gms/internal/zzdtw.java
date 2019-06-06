package com.google.android.gms.internal;

import java.nio.ByteBuffer;

public final class zzdtw implements zzdsy {
    private static final byte[] zzmfg = new byte[0];
    private final zzdwl zzmfh;
    private final zzdsy zzmfi;

    public zzdtw(zzdwl zzdwl, zzdsy zzdsy) {
        this.zzmfh = zzdwl;
        this.zzmfi = zzdsy;
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) {
        byte[] toByteArray = zzdtn.zzb(this.zzmfh).toByteArray();
        byte[] zzd = this.zzmfi.zzd(toByteArray, zzmfg);
        bArr = ((zzdsy) zzdtn.zzf(this.zzmfh.zzbqu(), toByteArray)).zzd(bArr, bArr2);
        return ByteBuffer.allocate((zzd.length + 4) + bArr.length).putInt(zzd.length).put(zzd).put(bArr).array();
    }
}
