package defpackage;

import defpackage.acbm.a;
import defpackage.rpy.b;

/* renamed from: rpp */
abstract class rpp extends rpz {
    public /* synthetic */ rpp(int i, int i2, b bVar) {
        this(i, i2, bVar, false);
    }

    protected rpp(int i, int i2, b bVar, boolean z) {
        akcr.b(bVar, "dependencies");
        super(i, i2, bVar, z);
    }

    private final void m() {
        boolean z = true;
        boolean z2 = this.a && this.c && !k();
        b(z2);
        if (k() || g()) {
            z = false;
        }
        j().setSpeakerphoneOn(z);
        a d = acbm.d();
        new StringBuilder("BT: Turning speakerphone ").append(z ? "ON" : "OFF");
        d.a("RoutingStrategies");
    }

    public void a(boolean z) {
        m();
    }

    public void c() {
        super.c();
        m();
    }

    public void e() {
        m();
    }
}
