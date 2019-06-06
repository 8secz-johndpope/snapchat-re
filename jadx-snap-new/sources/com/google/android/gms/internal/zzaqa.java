package com.google.android.gms.internal;

@zzabh
public final class zzaqa {
    public final int heightPixels;
    private final int type;
    public final int widthPixels;

    private zzaqa(int i, int i2, int i3) {
        this.type = i;
        this.widthPixels = i2;
        this.heightPixels = i3;
    }

    public static zzaqa zzc(zzko zzko) {
        return zzko.zzbib ? new zzaqa(3, 0, 0) : zzko.zzbie ? new zzaqa(2, 0, 0) : zzko.zzbid ? zzvj() : zzi(zzko.widthPixels, zzko.heightPixels);
    }

    public static zzaqa zzi(int i, int i2) {
        return new zzaqa(1, i, i2);
    }

    public static zzaqa zzvj() {
        return new zzaqa(0, 0, 0);
    }

    public static zzaqa zzvk() {
        return new zzaqa(4, 0, 0);
    }

    public final boolean isFluid() {
        return this.type == 2;
    }

    public final boolean zzvl() {
        return this.type == 3;
    }

    public final boolean zzvm() {
        return this.type == 0;
    }

    public final boolean zzvn() {
        return this.type == 4;
    }
}
