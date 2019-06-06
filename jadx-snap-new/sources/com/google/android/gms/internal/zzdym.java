package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class zzdym implements zzdyi {
    static final int[] zzmly = zza(ByteBuffer.wrap(new byte[]{(byte) 101, (byte) 120, (byte) 112, (byte) 97, (byte) 110, (byte) 100, (byte) 32, (byte) 51, (byte) 50, (byte) 45, (byte) 98, (byte) 121, (byte) 116, (byte) 101, (byte) 32, (byte) 107}));
    final zzdyh zzmlz;
    private final int zzmma;

    zzdym(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.zzmlz = zzdyh.zzal(bArr);
            this.zzmma = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    static int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer zze = zze(bArr, this.zzmma + i2);
            if (i2 == i - 1) {
                zzdxi.zza(byteBuffer, byteBuffer2, zze, remaining % 64);
            } else {
                zzdxi.zza(byteBuffer, byteBuffer2, zze, 64);
            }
        }
    }

    static int[] zza(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* Access modifiers changed, original: final */
    public final void zza(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - zzbsp() >= bArr.length) {
            byte[] zzgy = zzdyl.zzgy(zzbsp());
            byteBuffer.put(zzgy);
            zza(zzgy, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final byte[] zzaj(byte[] bArr) {
        int length = bArr.length;
        zzbsp();
        if (length <= 2147483635) {
            ByteBuffer allocate = ByteBuffer.allocate(zzbsp() + bArr.length);
            zza(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public abstract int zzbsp();

    public abstract ByteBuffer zze(byte[] bArr, int i);
}
