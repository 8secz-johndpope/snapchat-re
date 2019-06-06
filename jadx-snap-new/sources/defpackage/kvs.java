package defpackage;

/* renamed from: kvs */
public final class kvs implements kqf {
    private final dpr a;
    private final kqf b;

    public kvs(dpr dpr, kqf kqf) {
        akcr.b(dpr, "lensesCameraContext");
        akcr.b(kqf, "analyticsEventHandler");
        this.a = dpr;
        this.b = kqf;
    }

    public final void a(kqe kqe) {
        akcr.b(kqe, "event");
        String str = this.a.a;
        akcr.b(str, "<set-?>");
        kqe.a = str;
        this.b.a(kqe);
    }
}
