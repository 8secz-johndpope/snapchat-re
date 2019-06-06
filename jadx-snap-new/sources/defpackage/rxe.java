package defpackage;

import defpackage.rxk.a;

/* renamed from: rxe */
public final class rxe implements rxl {
    private final Object a = new Object();
    private rxk b;
    private final ajwy<rxj> c;
    private final ajwy<ryk> d;

    public rxe(ajwy<rxj> ajwy, ajwy<ryk> ajwy2) {
        akcr.b(ajwy, "bandwidthClassManager");
        akcr.b(ajwy2, "rxNetworkStatusManager");
        this.c = ajwy;
        this.d = ajwy2;
    }

    private rxk a() {
        Object a;
        a aVar = new a();
        ryk ryk = (ryk) this.d.get();
        if (ryk != null) {
            a = ryk.a();
            if (a != null) {
                akcr.a(a, "it");
                akcr.b(a, "<set-?>");
                aVar.a = a;
            }
            a = ryk.b();
            if (a != null) {
                akcr.a(a, "it");
                akcr.b(a, "<set-?>");
                aVar.b = a;
            }
            Object g = ryk.g();
            if (g != null) {
                akcr.a(g, "it");
                akcr.b(g, "<set-?>");
                aVar.c = g;
            }
        }
        rxj rxj = (rxj) this.c.get();
        if (rxj != null) {
            a = rxj.a();
            akcr.a(a, "currentDownloadConnectionClass");
            akcr.b(a, "<set-?>");
            aVar.e = a;
            aVar.d = rxj.d();
            a = rxj.b();
            akcr.a(a, "currentUploadConnectionClass");
            akcr.b(a, "<set-?>");
            aVar.g = a;
            aVar.f = rxj.e();
        }
        rxk rxk = new rxk(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h);
        synchronized (this.a) {
            if (!akcr.a(this.b, (Object) rxk)) {
                this.b = rxk;
            }
        }
        return rxk;
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}
