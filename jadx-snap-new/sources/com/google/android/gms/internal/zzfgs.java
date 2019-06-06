package com.google.android.gms.internal;

import defpackage.ppy;
import java.io.Serializable;
import java.util.Iterator;

public abstract class zzfgs implements Serializable, Iterable<Byte> {
    public static final zzfgs zzpnw = new zzfgz(zzfhz.EMPTY_BYTE_ARRAY);
    private static final zzfgw zzpnx = (zzfgo.zzcxm() ? new zzfha() : new zzfgu());
    private int zzmmk = 0;

    zzfgs() {
    }

    static void zzab(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(22);
            stringBuilder.append("Index < 0: ");
            stringBuilder.append(i);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("Index > length: ");
        stringBuilder2.append(i);
        stringBuilder2.append(ppy.d);
        stringBuilder2.append(i2);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }

    public static zzfgs zzaz(byte[] bArr) {
        return zzf(bArr, 0, bArr.length);
    }

    static zzfgs zzba(byte[] bArr) {
        return new zzfgz(bArr);
    }

    public static zzfgs zzf(byte[] bArr, int i, int i2) {
        return new zzfgz(zzpnx.zzg(bArr, i, i2));
    }

    static int zzh(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((((i | i2) | i4) | (i3 - i2)) >= 0) {
            return i4;
        }
        StringBuilder stringBuilder;
        if (i < 0) {
            StringBuilder stringBuilder2 = new StringBuilder(32);
            stringBuilder2.append("Beginning index: ");
            stringBuilder2.append(i);
            stringBuilder2.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder2.toString());
        } else if (i2 < i) {
            stringBuilder = new StringBuilder(66);
            stringBuilder.append("Beginning index larger than ending index: ");
            stringBuilder.append(i);
            stringBuilder.append(ppy.d);
            stringBuilder.append(i2);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else {
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("End index: ");
            stringBuilder.append(i2);
            stringBuilder.append(" >= ");
            stringBuilder.append(i3);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    static zzfgx zzle(int i) {
        return new zzfgx(i, null);
    }

    public static zzfgs zztv(String str) {
        return new zzfgz(str.getBytes(zzfhz.UTF_8));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzmmk;
        if (i == 0) {
            i = size();
            i = zzg(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.zzmmk = i;
        }
        return i;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzfgt(this);
    }

    public abstract int size();

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return zzfhz.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        zzb(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public abstract void zza(zzfgr zzfgr);

    public abstract zzfgs zzaa(int i, int i2);

    public abstract void zzb(byte[] bArr, int i, int i2, int i3);

    public abstract zzfhb zzcxq();

    /* Access modifiers changed, original: protected|final */
    public final int zzcxt() {
        return this.zzmmk;
    }

    public abstract int zzg(int i, int i2, int i3);

    public abstract byte zzld(int i);
}
