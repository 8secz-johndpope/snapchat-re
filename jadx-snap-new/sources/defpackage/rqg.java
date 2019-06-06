package defpackage;

import defpackage.rpy.a;
import defpackage.rpy.b;

/* renamed from: rqg */
final class rqg extends rqh {
    public rqg(b bVar) {
        akcr.b(bVar, "delegate");
        super(bVar, false);
    }

    public final String a() {
        return "VIDEO_VOIP_CALL";
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "state");
        return aVar.b() == abjc.VIDEO && super.a(aVar);
    }
}
