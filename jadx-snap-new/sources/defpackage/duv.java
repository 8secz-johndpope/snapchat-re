package defpackage;

/* renamed from: duv */
public final class duv implements dnl {
    private final dql a;
    private final eam b;
    private final ftl c;
    private final dod d;

    public duv(dql dql, eam eam, dod dod, ftl ftl) {
        this.a = dql;
        this.b = eam;
        this.d = dod;
        this.c = ftl;
    }

    private /* synthetic */ void a() {
        this.a.a(dnh.f.callsite("CameraPreparerImpl").a("onPause"));
        this.d.b();
    }

    private void b(idd idd) {
        this.a.a(this.b, idd);
    }

    public final ajej a(boolean z, idd idd, boolean z2) {
        if (!z) {
            if (this.c.a(dnd.OPEN_CAMERA_ON_CAMERA_PAGE_ONLY)) {
                this.b.a.set(z2);
            }
            b(idd);
        }
        return ajek.a(new -$$Lambda$duv$1sPq4aUfvEa6lwjVyC5yB49yNdM(this));
    }

    public final void a(idd idd) {
        b(idd);
    }
}
