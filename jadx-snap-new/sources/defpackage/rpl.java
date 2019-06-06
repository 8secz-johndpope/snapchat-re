package defpackage;

import defpackage.rpy.a;
import defpackage.rpy.b;

/* renamed from: rpl */
class rpl extends rpp {
    public rpl(b bVar, boolean z) {
        akcr.b(bVar, "delegate");
        super(3, 0, bVar, z);
    }

    public String a() {
        return "CALLING";
    }

    public final void a(boolean z) {
        super.a(z);
        this.b.i();
    }

    public boolean a(a aVar) {
        akcr.b(aVar, "state");
        return aVar.e() == abix.a.RINGING_OUTGOING;
    }

    public final void c() {
        rpz.a(this, 1, null, 6);
        super.c();
    }

    public final void e() {
        super.e();
        this.b.i();
    }
}
