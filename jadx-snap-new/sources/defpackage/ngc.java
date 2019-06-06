package defpackage;

import defpackage.ncn.b;

/* renamed from: ngc */
public final class ngc implements b {
    private final long a;
    private final dis b;

    public ngc(long j, dis dis) {
        this.a = j;
        this.b = dis;
    }

    public ngc(dis dis) {
        this.a = 0;
        this.b = dis;
    }

    private void a(abbd abbd, aapt aapt, aapt aapt2, boolean z, long j, long j2, aapu aapu, long j3) {
        aarl aarl = new aarl();
        long j4 = this.a;
        long j5 = 0;
        if (j4 > 0) {
            aarl.a = Long.valueOf(j4);
        }
        if (j3 < 0) {
            j5 = Math.min(-1, j3 / 1000);
        } else if (j3 > 0) {
            j5 = Math.max(1, j3 / 1000);
        }
        aarl.b = abbd;
        aarl.c = aapt;
        aarl.d = aapt2;
        aarl.e = Boolean.valueOf(z);
        aarl.f = Long.valueOf(j);
        aarl.g = Long.valueOf(j2);
        aarl.h = aapu;
        aarl.i = Long.valueOf(j5);
        this.b.a(aarl);
    }

    public final void a(ncn ncn, long j) {
        a(null, ncn.l(), ncn.k(), ncn.b(), (long) ncn.f().size(), (long) ncn.g().size(), aapu.LOGIN, j);
    }

    public final void a(ncn ncn, nca nca, long j) {
        nca nca2 = nca;
        a(nca2.a, ncn.l(), ncn.k(), ncn.b(), (long) ncn.f().size(), (long) ncn.g().size(), nca2.b, j);
    }
}
