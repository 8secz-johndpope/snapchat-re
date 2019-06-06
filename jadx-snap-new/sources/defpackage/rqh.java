package defpackage;

import defpackage.rpy.a;
import defpackage.rpy.b;

/* renamed from: rqh */
class rqh extends rpp {
    public rqh(b bVar, boolean z) {
        akcr.b(bVar, "delegate");
        super(3, 0, bVar, z);
    }

    public String a() {
        return "VOIP_CALL";
    }

    public boolean a(a aVar) {
        akcr.b(aVar, "state");
        return !aVar.d() && aVar.c();
    }

    public final void c() {
        rpz.a(this, 1, null, 6);
        super.c();
    }

    public final void d() {
        this.b.h();
        super.d();
    }
}
