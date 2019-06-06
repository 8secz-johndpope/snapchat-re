package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;

/* renamed from: ajef */
public final class ajef {
    public static final ajdw a;

    /* renamed from: ajef$1 */
    static class 1 implements Callable<ajdw> {
        1() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return a.a;
        }
    }

    /* renamed from: ajef$a */
    static final class a {
        static final ajdw a = new ajeg(new Handler(Looper.getMainLooper()));
    }

    static {
        ajdw a;
        Callable 1 = new 1();
        ajfc ajfc = ajee.a;
        if (ajfc == null) {
            a = ajee.a(1);
        } else {
            a = (ajdw) ajee.a(ajfc, 1);
            if (a == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
        }
        a = a;
    }

    public static ajdw a() {
        return ajee.a(a);
    }

    public static ajdw a(Looper looper) {
        if (looper != null) {
            return new ajeg(new Handler(looper));
        }
        throw new NullPointerException("looper == null");
    }
}
