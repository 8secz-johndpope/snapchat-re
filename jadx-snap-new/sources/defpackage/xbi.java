package defpackage;

import android.content.Context;

/* renamed from: xbi */
public final class xbi implements aiqc<xbb> {
    private final ajwy<xaz> a;
    private final ajwy<xbd> b;
    private final ajwy<xhl> c;
    private final ajwy<xgk> d;
    private final ajwy<Context> e;
    private final ajwy<ajdw> f;
    private final ajwy<xed> g;
    private final ajwy<xhc> h;
    private final ajwy<xfn> i;
    private final ajwy<xfu> j;

    public xbi(ajwy<xaz> ajwy, ajwy<xbd> ajwy2, ajwy<xhl> ajwy3, ajwy<xgk> ajwy4, ajwy<Context> ajwy5, ajwy<ajdw> ajwy6, ajwy<xed> ajwy7, ajwy<xhc> ajwy8, ajwy<xfn> ajwy9, ajwy<xfu> ajwy10) {
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
        this.d = ajwy4;
        this.e = ajwy5;
        this.f = ajwy6;
        this.g = ajwy7;
        this.h = ajwy8;
        this.i = ajwy9;
        this.j = ajwy10;
    }

    public final /* synthetic */ Object get() {
        xaz xaz = (xaz) this.a.get();
        ajwy ajwy = this.b;
        xhl xhl = (xhl) this.c.get();
        xgk xgk = (xgk) this.d.get();
        Context context = (Context) this.e.get();
        ajdw ajdw = (ajdw) this.f.get();
        xed xed = (xed) this.g.get();
        xhc xhc = (xhc) this.h.get();
        xfn xfn = (xfn) this.i.get();
        xfu xfu = (xfu) this.j.get();
        akcr.b(xaz, "holder");
        akcr.b(ajwy, "coreComponent");
        akcr.b(xhl, "toastUtils");
        akcr.b(xgk, "eventObservables");
        akcr.b(context, "context");
        akcr.b(ajdw, "scheduler");
        akcr.b(xed, "bleScanner");
        akcr.b(xhc, "contentUtils");
        akcr.b(xfn, "preferences");
        akcr.b(xfu, "spectaclesFileManager");
        return (xbb) aiqf.a(new xbb(xaz, ajwy, xgk, xhl, context, ajdw, xed, xfn, xfu), "Cannot return null from a non-@Nullable @Provides method");
    }
}
