package com.google.android.gms.internal;

import java.nio.ByteBuffer;

final class zzdxj extends zzdxk {
    zzdxj(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* Access modifiers changed, original: final */
    public final int zzbsp() {
        return 12;
    }

    /* Access modifiers changed, original: final */
    public final int[] zzd(byte[] bArr, int i) {
        int[] iArr = new int[16];
        System.arraycopy(zzdym.zzmly, 0, iArr, 0, zzdxk.zzmly.length);
        int[] zza = zzdym.zza(ByteBuffer.wrap(this.zzmlz.getBytes()));
        System.arraycopy(zza, 0, iArr, 4, zza.length);
        iArr[12] = i;
        System.arraycopy(zzdym.zza(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        return iArr;
    }
}
