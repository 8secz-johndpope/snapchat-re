package defpackage;

import android.bluetooth.le.ScanFilter;
import android.content.Context;
import android.os.Build.VERSION;
import java.util.List;

/* renamed from: xbe */
public final class xbe implements aiqc<xed> {
    private final ajwy<xgk> a;
    private final ajwy<xhl> b;
    private final ajwy<xfn> c;
    private final ajwy<Context> d;
    private final ajwy<ajdw> e;
    private final ajwy<List<ScanFilter>> f;

    public xbe(ajwy<xgk> ajwy, ajwy<xhl> ajwy2, ajwy<xfn> ajwy3, ajwy<Context> ajwy4, ajwy<ajdw> ajwy5, ajwy<List<ScanFilter>> ajwy6) {
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
        this.d = ajwy4;
        this.e = ajwy5;
        this.f = ajwy6;
    }

    public final /* synthetic */ Object get() {
        xgk xgk = (xgk) this.a.get();
        xhl xhl = (xhl) this.b.get();
        aipn b = aiqb.b(this.c);
        Context context = (Context) this.d.get();
        ajdw ajdw = (ajdw) this.e.get();
        List list = (List) this.f.get();
        akcr.b(xgk, "eventObservables");
        akcr.b(xhl, "toastUtils");
        akcr.b(b, "preferences");
        akcr.b(context, "context");
        akcr.b(ajdw, "scheduler");
        akcr.b(list, "filters");
        if (VERSION.SDK_INT >= 21) {
            xee xee = new xee(xgk, xhl, b, context, ajdw, list);
        } else {
            xed xef = new xef(xgk, xhl, b, context, ajdw);
        }
        return (xed) aiqf.a(r0, "Cannot return null from a non-@Nullable @Provides method");
    }
}
