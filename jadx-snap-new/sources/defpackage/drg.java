package defpackage;

import java.util.List;

/* renamed from: drg */
public final class drg implements dqo {
    public ftl a;
    public tnj b;
    public ebh c;
    private final vjr d;
    private final zfw e = zgb.a(dnh.f.callsite("PreferencesCameraStore"));

    public drg(vjr vjr) {
        this.d = vjr;
    }

    private boolean a(dnd dnd) {
        abmr.a("checkAndSetShouldReportCameraCapacityKey should run on background thread");
        boolean a = this.a.a((fth) dnd);
        if (a) {
            this.b.b().a((fth) dnd, Boolean.FALSE).b();
        }
        return a;
    }

    public final ebz a() {
        return (ebz) this.a.y(dnd.CAMERA2_LEVEL);
    }

    public final void a(ebx ebx) {
        this.c.a(ebx);
    }

    public final void a(ebz ebz) {
        this.e.b().a(new -$$Lambda$drg$Hlf9f2OQxITWsG9-jio5LFpoXSY(this, ebz));
    }

    public final void a(edi edi) {
        this.e.b().a(new -$$Lambda$drg$8m9r3e5ppIkCy7lejStlnMoDNYw(this, edi));
    }

    public final void a(List<abtl> list, List<abtl> list2) {
        this.d.a(list, list2);
    }

    public final boolean a(boolean z) {
        return a(z ? dnd.SHOULD_REPORT_FRONT_CAMERA1_CAPACITY_FOR_MUSHROOM : dnd.SHOULD_REPORT_BACK_CAMERA1_CAPACITY_FOR_MUSHROOM);
    }

    public final edi b() {
        return (edi) this.a.y(dnd.CAMERA_USAGE_TYPE);
    }

    public final ebx c() {
        return this.c.a();
    }

    public final boolean d() {
        return a(dnd.SHOULD_REPORT_CAMERA2_CAPACITY_FOR_MUSHROOM);
    }
}
