package defpackage;

import defpackage.rpy.a;
import defpackage.rpy.b;

/* renamed from: rqe */
final class rqe extends rpl {
    public rqe(b bVar) {
        akcr.b(bVar, "delegate");
        super(bVar, false);
    }

    public final String a() {
        return "VIDEO_CALLING";
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "state");
        return aVar.b() == abjc.VIDEO && super.a(aVar);
    }
}
