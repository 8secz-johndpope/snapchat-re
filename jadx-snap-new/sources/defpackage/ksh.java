package defpackage;

/* renamed from: ksh */
public final class ksh implements ksv {
    private final ilv a;
    private final krw b;

    public ksh(ilv ilv, krw krw) {
        akcr.b(ilv, "graphene");
        akcr.b(krw, "analyticsDeviceClassProvider");
        this.a = ilv;
        this.b = krw;
    }

    private static String a(boolean z) {
        return z ? "VIDEO_CHAT" : "CAMERA";
    }

    public final void a(double d, boolean z) {
        String str = "context";
        ilz a = ioi.FPS.a("start_type", "warm").a("device_class", this.b.a().b).a(str, ksh.a(z));
        this.a.a(a, akdp.b(d));
        this.a.b(a, akdp.b(d));
        this.a.c(a, 1);
    }

    public final void a(long j) {
        ilz a = ioi.APPLY_DELAY.a("success", "true").a("device_class", this.b.a().b);
        this.a.a(a, j);
        this.a.c(a, 1);
    }

    public final void a(long j, boolean z) {
        String str = "device_class";
        ilz a = ioi.TAP_TO_ACTIVATE.a("abandon", String.valueOf(z)).a(str, this.b.a().b);
        this.a.a(a, j);
        this.a.c(a, 1);
    }

    public final void b(double d, boolean z) {
        String str = "context";
        ilz a = ioi.FRAME_TIME.a("start_type", "warm").a("device_class", this.b.a().b).a(str, ksh.a(z));
        this.a.a(a, akdp.b(d));
        this.a.b(a, akdp.b(d));
        this.a.c(a, 1);
    }

    public final void b(long j) {
        ilz a = ioi.INIT_DELAY.a("success", "true").a("core_state", "NOT_READY").a("device_class", this.b.a().b);
        this.a.a(a, j);
        this.a.c(a, 1);
    }

    public final void c(double d, boolean z) {
        String str = "context";
        ilz a = ioi.VIDEO_RECORD_FPS.a("start_type", "warm").a("device_class", this.b.a().b).a(str, ksh.a(z));
        this.a.a(a, akdp.b(d));
        this.a.b(a, akdp.b(d));
        this.a.c(a, 1);
    }

    public final void d(double d, boolean z) {
        String str = "context";
        ilz a = ioi.VIDEO_RECORD_FRAME_TIME.a("start_type", "warm").a("device_class", this.b.a().b).a(str, ksh.a(z));
        this.a.a(a, akdp.b(d));
        this.a.b(a, akdp.b(d));
        this.a.c(a, 1);
    }
}
