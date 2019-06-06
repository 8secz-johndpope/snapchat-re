package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class zzdxk extends zzdym {
    private static final byte[] zzmkm = new byte[16];

    zzdxk(byte[] bArr, int i) {
        super(bArr, i);
    }

    private static void zza(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = zzdym.rotateLeft(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = zzdym.rotateLeft(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = zzdym.rotateLeft(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = zzdym.rotateLeft(iArr[i2] ^ iArr[i3], 7);
    }

    public abstract int[] zzd(byte[] bArr, int i);

    /* Access modifiers changed, original: final */
    public final ByteBuffer zze(byte[] bArr, int i) {
        int i2;
        int[] zzd = zzd(bArr, i);
        int[] iArr = (int[]) zzd.clone();
        for (i2 = 0; i2 < 10; i2++) {
            zza(iArr, 0, 4, 8, 12);
            zza(iArr, 1, 5, 9, 13);
            zza(iArr, 2, 6, 10, 14);
            zza(iArr, 3, 7, 11, 15);
            zza(iArr, 0, 5, 10, 15);
            zza(iArr, 1, 6, 11, 12);
            zza(iArr, 2, 7, 8, 13);
            zza(iArr, 3, 4, 9, 14);
        }
        for (i2 = 0; i2 < zzd.length; i2++) {
            zzd[i2] = zzd[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzd, 0, 16);
        return order;
    }
}
