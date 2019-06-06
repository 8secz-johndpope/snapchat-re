package defpackage;

import defpackage.kqe.al;
import defpackage.kqe.b;

/* renamed from: ksq */
public final class ksq implements ksu {
    private final kri a;
    private final ksi b;

    public ksq(kre kre, ilv ilv) {
        akcr.b(kre, "blizzardEventLogger");
        akcr.b(ilv, "graphene");
        this.a = new kri(kre);
        this.b = new ksi(ilv);
    }

    public final void a(al alVar, krv krv) {
        akcr.b(alVar, "event");
        akcr.b(krv, "analyticsDeviceClass");
        this.b.a(alVar, krv);
        this.a.a(alVar, krv);
    }

    public final void a(b bVar, krv krv) {
        akcr.b(bVar, "event");
        akcr.b(krv, "analyticsDeviceClass");
        this.a.a(bVar, krv);
        this.b.a(bVar, krv);
    }
}
