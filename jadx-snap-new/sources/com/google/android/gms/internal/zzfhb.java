package com.google.android.gms.internal;

public abstract class zzfhb {
    private static volatile boolean zzpog = true;
    int zzpoc;
    int zzpod;
    int zzpoe;
    private boolean zzpof;

    private zzfhb() {
        this.zzpod = 100;
        this.zzpoe = Integer.MAX_VALUE;
        this.zzpof = false;
    }

    /* synthetic */ zzfhb(zzfhc zzfhc) {
        this();
    }

    static zzfhb zzb(byte[] bArr, int i, int i2, boolean z) {
        zzfhd zzfhd = new zzfhd(bArr, i, i2, z, null);
        try {
            zzfhd.zzli(i2);
            return zzfhd;
        } catch (zzfie e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static zzfhb zzbb(byte[] bArr) {
        return zzb(bArr, 0, bArr.length, false);
    }

    public abstract <T extends zzfhu<T, ?>> T zza(T t, zzfhm zzfhm);

    public abstract int zzcxx();

    public abstract long zzcxz();

    public abstract long zzcyb();

    public abstract int zzcyc();

    public abstract boolean zzcyd();

    public abstract String zzcye();

    public abstract zzfgs zzcyf();

    public abstract int zzcyg();

    public abstract int zzcyh();

    public abstract int zzcym();

    public abstract long zzcyn();

    public abstract boolean zzcyp();

    public abstract int zzcyq();

    public abstract void zzlf(int i);

    public abstract int zzli(int i);

    public abstract void zzlj(int i);
}
