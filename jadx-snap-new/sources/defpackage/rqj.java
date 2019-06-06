package defpackage;

import defpackage.rpy.a;
import defpackage.rpy.b;

/* renamed from: rqj */
final class rqj extends rqh {
    public rqj(b bVar) {
        akcr.b(bVar, "delegate");
        super(bVar, false);
    }

    public final String a() {
        return "WATCHING_A_CALL";
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "state");
        return aVar.b() == abjc.NONE && super.a(aVar);
    }
}
