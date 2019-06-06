package defpackage;

import defpackage.acbm.a;
import defpackage.rpy.b;

/* renamed from: rpv */
final class rpv extends rpz {
    public rpv(b bVar) {
        akcr.b(bVar, "delegate");
        super(bVar);
    }

    private final void m() {
        boolean z = !k() && j().getRingerMode() == 2;
        j().setSpeakerphoneOn(z);
        a d = acbm.d();
        new StringBuilder("BT: Turning speakerphone ").append(z ? "ON" : "OFF");
        d.a("RoutingStrategies");
        if (j().getRingerMode() == 2) {
            rpz.a(this, 3, null, 6);
        } else {
            l();
        }
    }

    public final String a() {
        return "RINGING";
    }

    public final boolean a(rpy.a aVar) {
        akcr.b(aVar, "state");
        return !aVar.c() && aVar.e() == abix.a.RINGING_INCOMING;
    }

    public final void c() {
        if (j().getRingerMode() == 2) {
            rpz.a(this, 3, null, 6);
        }
        super.c();
        m();
    }

    public final void e() {
        super.e();
        this.b.i();
    }

    /* Access modifiers changed, original: protected|final */
    public final void f() {
        m();
    }
}
