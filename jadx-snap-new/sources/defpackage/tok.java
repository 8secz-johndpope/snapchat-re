package defpackage;

import defpackage.tpl.b.d;
import defpackage.tpl.b.f;

/* renamed from: tok */
public final class tok implements tpw {
    private final tpl a;
    private final ajwy<toj> b;

    public tok(tpl tpl, ajwy<toj> ajwy) {
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(ajwy, "previewLoadLatencyTrackerProvider");
        this.a = tpl;
        this.b = ajwy;
    }

    public final String a() {
        return "PreviewLoadLatencyTrackerActivator";
    }

    public final ajej start() {
        tpl tpl = this.a;
        akcr.b(tpl, "receiver$0");
        Object obj = ((tpl.b instanceof f) || (tpl.b instanceof d)) ? 1 : null;
        if (obj == null) {
            return ((toj) this.b.get()).start();
        }
        obj = ajfq.INSTANCE;
        akcr.a(obj, "Disposables.disposed()");
        return obj;
    }
}
