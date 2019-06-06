package defpackage;

import defpackage.rpy.a;
import defpackage.rpy.b;

/* renamed from: rpu */
final class rpu extends rpy {
    public rpu(b bVar) {
        akcr.b(bVar, "delegate");
        super(bVar);
    }

    public final String a() {
        return "PHONE_CALL";
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "state");
        return aVar.g();
    }
}
