package com.google.android.gms.internal;

public final class zzflo implements Cloneable {
    private static final zzflp zzpvn = new zzflp();
    private int mSize;
    private boolean zzpvo;
    private int[] zzpvp;
    private zzflp[] zzpvq;

    zzflo() {
        this(10);
    }

    private zzflo(int i) {
        this.zzpvo = false;
        i = idealIntArraySize(i);
        this.zzpvp = new int[i];
        this.zzpvq = new zzflp[i];
        this.mSize = 0;
    }

    private static int idealIntArraySize(int i) {
        i <<= 2;
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                i = i3;
                break;
            }
        }
        return i / 4;
    }

    private final int zznb(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.zzpvp[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    public final /* synthetic */ Object clone() {
        int i = this.mSize;
        zzflo zzflo = new zzflo(i);
        int i2 = 0;
        System.arraycopy(this.zzpvp, 0, zzflo.zzpvp, 0, i);
        while (i2 < i) {
            zzflp[] zzflpArr = this.zzpvq;
            if (zzflpArr[i2] != null) {
                zzflo.zzpvq[i2] = (zzflp) zzflpArr[i2].clone();
            }
            i2++;
        }
        zzflo.mSize = i;
        return zzflo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzflo)) {
            return false;
        }
        zzflo zzflo = (zzflo) obj;
        int i = this.mSize;
        if (i != zzflo.mSize) {
            return false;
        }
        Object obj2;
        int[] iArr = this.zzpvp;
        int[] iArr2 = zzflo.zzpvp;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                obj2 = null;
                break;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            zzflp[] zzflpArr = this.zzpvq;
            zzflp[] zzflpArr2 = zzflo.zzpvq;
            int i3 = this.mSize;
            for (int i4 = 0; i4 < i3; i4++) {
                if (!zzflpArr[i4].equals(zzflpArr2[i4])) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = (((i * 31) + this.zzpvp[i2]) * 31) + this.zzpvq[i2].hashCode();
        }
        return i;
    }

    /* Access modifiers changed, original: final */
    public final int size() {
        return this.mSize;
    }

    /* Access modifiers changed, original: final */
    public final void zza(int i, zzflp zzflp) {
        int zznb = zznb(i);
        if (zznb >= 0) {
            this.zzpvq[zznb] = zzflp;
            return;
        }
        zzflp[] zzflpArr;
        int[] iArr;
        zznb ^= -1;
        if (zznb < this.mSize) {
            zzflpArr = this.zzpvq;
            if (zzflpArr[zznb] == zzpvn) {
                this.zzpvp[zznb] = i;
                zzflpArr[zznb] = zzflp;
                return;
            }
        }
        int i2 = this.mSize;
        if (i2 >= this.zzpvp.length) {
            i2 = idealIntArraySize(i2 + 1);
            iArr = new int[i2];
            zzflpArr = new zzflp[i2];
            int[] iArr2 = this.zzpvp;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            zzflp[] zzflpArr2 = this.zzpvq;
            System.arraycopy(zzflpArr2, 0, zzflpArr, 0, zzflpArr2.length);
            this.zzpvp = iArr;
            this.zzpvq = zzflpArr;
        }
        i2 = this.mSize;
        if (i2 - zznb != 0) {
            iArr = this.zzpvp;
            int i3 = zznb + 1;
            System.arraycopy(iArr, zznb, iArr, i3, i2 - zznb);
            zzflpArr = this.zzpvq;
            System.arraycopy(zzflpArr, zznb, zzflpArr, i3, this.mSize - zznb);
        }
        this.zzpvp[zznb] = i;
        this.zzpvq[zznb] = zzflp;
        this.mSize++;
    }

    /* Access modifiers changed, original: final */
    public final zzflp zzmz(int i) {
        i = zznb(i);
        if (i >= 0) {
            zzflp[] zzflpArr = this.zzpvq;
            if (zzflpArr[i] != zzpvn) {
                return zzflpArr[i];
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final zzflp zzna(int i) {
        return this.zzpvq[i];
    }
}
