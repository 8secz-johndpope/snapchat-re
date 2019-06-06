package defpackage;

import defpackage.kqe.al;
import defpackage.kqe.b;

/* renamed from: ksi */
public final class ksi implements ksu {
    private final ilv a;

    public ksi(ilv ilv) {
        akcr.b(ilv, "graphene");
        this.a = ilv;
    }

    public final void a(al alVar, krv krv) {
        akcr.b(alVar, "event");
        akcr.b(krv, "analyticsDeviceClass");
        r1 = new String[2];
        int i = 0;
        r1[0] = alVar.b;
        r1[1] = alVar.c;
        while (i < 2) {
            if (r1[i] != null) {
                this.a.c(ioi.FLAG_STILL_SET.a("device_class", krv.b), 1);
            }
            i++;
        }
    }

    public final void a(b bVar, krv krv) {
        akcr.b(bVar, "event");
        akcr.b(krv, "analyticsDeviceClass");
        r1 = new String[2];
        int i = 0;
        r1[0] = bVar.d;
        r1[1] = bVar.e;
        while (i < 2) {
            if (r1[i] != null) {
                this.a.c(ioi.HANDLED_EXCEPTION.a("device_class", krv.b), 1);
            }
            i++;
        }
    }
}
