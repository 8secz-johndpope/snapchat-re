package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

abstract class zzdyn implements zzdsy {
    private final byte[] key;
    private final zzdym zzmmb;
    private final zzdym zzmmc;

    zzdyn(byte[] bArr) {
        this.key = (byte[]) bArr.clone();
        this.zzmmb = zzf(bArr, 1);
        this.zzmmc = zzf(bArr, 0);
    }

    public byte[] zzd(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        this.zzmmb.zzbsp();
        if (length <= 2147483619) {
            ByteBuffer allocate = ByteBuffer.allocate((bArr.length + this.zzmmb.zzbsp()) + 16);
            if (allocate.remaining() >= (bArr.length + this.zzmmb.zzbsp()) + 16) {
                int position = allocate.position();
                this.zzmmb.zza(allocate, bArr);
                allocate.position(position);
                bArr = new byte[this.zzmmb.zzbsp()];
                allocate.get(bArr);
                allocate.limit(allocate.limit() - 16);
                byte[] bArr3 = new byte[32];
                this.zzmmc.zze(bArr, 0).get(bArr3);
                int length2 = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
                int remaining = allocate.remaining();
                int i = remaining % 16;
                i = (i == 0 ? remaining : (remaining + 16) - i) + length2;
                ByteBuffer order = ByteBuffer.allocate(i + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(length2);
                order.put(allocate);
                order.position(i);
                order.putLong((long) bArr2.length);
                order.putLong((long) remaining);
                bArr = zzdyk.zzf(bArr3, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(bArr);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public abstract zzdym zzf(byte[] bArr, int i);
}
