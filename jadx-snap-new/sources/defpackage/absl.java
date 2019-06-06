package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import defpackage.absi.a;

/* renamed from: absl */
public final class absl {
    private static final LoadingCache<Context, absi> a = CacheBuilder.newBuilder().weakKeys().build(new 1());
    private static final LoadingCache<Context, absn> b = CacheBuilder.newBuilder().weakKeys().build(new 2());
    private final Context c;
    private final Supplier<absi> d;
    private final Supplier<absn> e;

    /* renamed from: absl$1 */
    static class 1 extends CacheLoader<Context, absi> {
        1() {
        }

        public final /* bridge */ /* synthetic */ Object load(Object obj) {
            return a.a;
        }
    }

    /* renamed from: absl$2 */
    static class 2 extends CacheLoader<Context, absn> {
        2() {
        }

        public final /* bridge */ /* synthetic */ Object load(Object obj) {
            return absn.a.a;
        }
    }

    public absl(Context context) {
        this.c = context;
        this.d = Suppliers.memoize(Suppliers.compose(a, Suppliers.ofInstance(context)));
        this.e = Suppliers.memoize(Suppliers.compose(b, Suppliers.ofInstance(context)));
    }

    private int d() {
        int i = this.c.getResources().getDisplayMetrics().heightPixels;
        WindowManager windowManager = (WindowManager) this.c.getSystemService("window");
        if (windowManager == null) {
            return i;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            return i;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final int a() {
        return this.c.getResources().getDisplayMetrics().widthPixels;
    }

    public final int b() {
        return this.c.getResources().getDisplayMetrics().heightPixels;
    }

    public final int c() {
        if (Build.MANUFACTURER.equalsIgnoreCase("huawei") && abrw.a.a.b()) {
            return d();
        }
        this.d.get();
        if (absn.a.a.a) {
            return b() + ((absi) this.d.get()).a;
        }
        if (!((absn) this.e.get()).c()) {
            return b();
        }
        Display defaultDisplay = ((WindowManager) this.c.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
