package defpackage;

import android.os.Looper;

/* renamed from: ecu */
public final class ecu {
    public final ecw a;
    public final int b;
    public final boolean c;
    public final dpo d;
    public final boolean e;
    public final dpl f;
    public final boolean g;
    public Looper h;

    public ecu(ecw ecw, int i, int i2, boolean z, dpn dpn, boolean z2, boolean z3) {
        this(ecw, i2, z, dpn, z2, new dpm(i), z3);
    }

    private ecu(ecw ecw, int i, boolean z, dpn dpn, boolean z2, dpl dpl, boolean z3) {
        this(ecw, i, z, new dpo(dpn), z2, dpl, z3);
    }

    private ecu(ecw ecw, int i, boolean z, dpo dpo, boolean z2, dpl dpl, boolean z3) {
        this.a = ecw;
        this.b = i;
        this.c = z;
        this.d = dpo;
        this.e = z2;
        this.f = dpl;
        this.g = z3;
    }
}
