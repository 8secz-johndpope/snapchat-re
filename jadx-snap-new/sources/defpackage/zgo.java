package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.EvictingQueue;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zgo */
public final class zgo {
    private static final Supplier<Method> a = Suppliers.memoize(-$$Lambda$zgo$4wPAA0cD5sMzzOh0vpPMoKxfUEE.INSTANCE);
    private static final Supplier<Method> b = Suppliers.memoize(-$$Lambda$zgo$rHxJE9WkVdx4Cts7Xi9wlDcWiHY.INSTANCE);
    private static volatile AtomicInteger c = new AtomicInteger(0);

    /* renamed from: zgo$1 */
    static class 1 extends ThreadLocal<Stack<Object>> {
        1() {
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object initialValue() {
            return new Stack();
        }
    }

    static {
        Suppliers.memoize(-$$Lambda$zgo$mGRsg-N7EgHCvegyLLHufVQsB2o.INSTANCE);
        EvictingQueue.create(0);
        abmk abmk = new abmk();
        HashMap hashMap = new HashMap();
        1 1 = new 1();
        Suppliers.memoize(-$$Lambda$zgo$nFEZ3Efp1WpMSyNdxCH5HcMWU64.INSTANCE);
    }

    public static int a() {
        a.get();
        return -1;
    }

    private static Method a(String str, Class<?>... clsArr) {
        try {
            return Trace.class.getMethod(str, clsArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static zgm a(String str) {
        return zgm.a(str);
    }

    public static void a(int i) {
        SystemClock.uptimeMillis();
        if (i != -1) {
            b.get();
        }
    }

    public static void b() {
        zgo.a();
        zgo.a(-1);
    }

    public static void c() {
    }

    private static boolean d() {
        try {
            SystemClock.uptimeMillis();
            return false;
        } catch (Error | RuntimeException unused) {
            return true;
        }
    }
}
