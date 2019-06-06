package defpackage;

import defpackage.rpy.a;
import defpackage.rpy.b;

/* renamed from: rph */
final class rph extends rpp {
    public rph(b bVar) {
        akcr.b(bVar, "delegate");
        super(0, 3, bVar, false);
    }

    public final String a() {
        return "AVPLAYBACK_A2DP";
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "state");
        return (aVar.a() == abjc.NONE || aVar.c() || !aVar.f()) ? false : true;
    }

    public final boolean b() {
        return false;
    }

    public final void c() {
        rpz.a(this, 1, this.b.f(), 4);
        super.c();
    }

    public final void d() {
        this.b.h();
        super.d();
    }
}
