package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: absc */
public final class absc {
    final Supplier<Integer> a;
    private final Supplier<Integer> b;
    private final Supplier<Integer> c;

    /* renamed from: absc$a */
    public static final class a {
        public static final absc a = new absc();
    }

    /* renamed from: absc$1 */
    class 1 implements Supplier<Integer> {
        1() {
        }

        public final /* synthetic */ Object get() {
            Context applicationContext = AppContext.get().getApplicationContext();
            WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
            Configuration configuration = applicationContext.getResources().getConfiguration();
            int rotation = windowManager.getDefaultDisplay().getRotation();
            Object obj = null;
            int i = 1;
            Object obj2 = (rotation == 1 || rotation == 3) ? 1 : null;
            Object obj3 = configuration.orientation == 2 ? 1 : null;
            if (configuration.orientation == 1) {
                obj = 1;
            }
            if ((obj2 == null && obj3 != null) || !(obj2 == null || obj == null)) {
                i = 2;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: absc$2 */
    class 2 implements Supplier<Integer> {
        2() {
        }

        public final /* synthetic */ Object get() {
            return Integer.valueOf(((WindowManager) AppContext.get().getApplicationContext().getSystemService("window")).getDefaultDisplay().getRotation());
        }
    }

    /* renamed from: absc$4 */
    class 4 implements Supplier<Integer> {
        4() {
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return (Integer) absc.this.a.get();
        }
    }

    private absc() {
        final Supplier memoize = Suppliers.memoize(new 1());
        this.a = Suppliers.memoize(new 2());
        this.b = Suppliers.memoize(new Supplier<Integer>() {
            public final /* synthetic */ Object get() {
                return Integer.valueOf(((Integer) memoize.get()).intValue() == 1 ? 0 : 3);
            }
        });
        this.c = Suppliers.memoize(new 4());
    }

    /* synthetic */ absc(byte b) {
        this();
    }

    public final int a() {
        return ((Integer) (abrr.b ? this.c : this.b).get()).intValue();
    }

    public final int b() {
        return ((Integer) this.a.get()).intValue();
    }
}
