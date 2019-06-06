package defpackage;

import android.content.Context;

/* renamed from: xbg */
public final class xbg implements aiqc<xay> {
    private final ajwy<Context> a;
    private final ajwy<xjr> b;
    private final ajwy<xbb> c;
    private final ajwy<xbd> d;
    private final ajwy<xhm> e;
    private final ajwy<xhc> f;

    public xbg(ajwy<Context> ajwy, ajwy<xjr> ajwy2, ajwy<xbb> ajwy3, ajwy<xbd> ajwy4, ajwy<xhm> ajwy5, ajwy<xhc> ajwy6) {
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
        this.d = ajwy4;
        this.e = ajwy5;
        this.f = ajwy6;
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        xjr xjr = (xjr) this.b.get();
        xbb xbb = (xbb) this.c.get();
        ajwy ajwy = this.d;
        xhm xhm = (xhm) this.e.get();
        xhc xhc = (xhc) this.f.get();
        akcr.b(context, "context");
        akcr.b(xjr, "clientPowerUtils");
        akcr.b(xbb, "deviceManager");
        akcr.b(ajwy, "coreComponent");
        akcr.b(xhm, "spectaclesUuidUtils");
        akcr.b(xhc, "contentUtils");
        return (xay) aiqf.a(new xay(context, xjr, xbb, xhm, ajwy, xhc), "Cannot return null from a non-@Nullable @Provides method");
    }
}
