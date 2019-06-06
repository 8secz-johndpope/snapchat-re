package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: abtm */
public final class abtm {
    private final Supplier<a> a;
    private final Supplier<a> b;
    private final Supplier<a> c;
    private final Supplier<DisplayMetrics> d;

    /* renamed from: abtm$a */
    interface a {
        int a();

        int b();
    }

    /* renamed from: abtm$b */
    static class b {
        static final abtm a = new abtm(AppContext.get());
    }

    protected abtm(Context context) {
        this(context, Suppliers.memoize(new -$$Lambda$abtm$bO7Dkw47gzd0beMwwrsgLqaQevw(context)));
    }

    private abtm(Context context, Supplier<DisplayMetrics> supplier) {
        this(supplier, Suppliers.memoize(-$$Lambda$hiE7QLa4iTiv3GCf3GN2SOSISAg.INSTANCE), Suppliers.memoize(new -$$Lambda$abtm$Vku-hr3jpNFPIC0xxa4g7DsPC78(supplier)), Suppliers.memoize(new -$$Lambda$abtm$8fndJN2h7i5463X3_uqPb-vqdEw(context)));
    }

    private abtm(Supplier<DisplayMetrics> supplier, Supplier<a> supplier2, Supplier<a> supplier3, Supplier<a> supplier4) {
        this.d = supplier;
        this.a = supplier2;
        this.c = supplier3;
        this.b = supplier4;
    }

    @Deprecated
    public static abtm a() {
        return b.a;
    }

    public final abtl b() {
        return new abtl(((a) this.c.get()).b(), ((a) this.c.get()).a());
    }
}
