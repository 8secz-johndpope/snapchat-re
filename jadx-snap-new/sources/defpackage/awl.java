package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

/* renamed from: awl */
public final class awl {
    private static awl d;
    public final Set<a> a = new HashSet();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Runnable c = new 1();

    /* renamed from: awl$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            awl.b();
            for (a e_ : awl.this.a) {
                e_.e_();
            }
            awl.this.a.clear();
        }
    }

    /* renamed from: awl$a */
    public interface a {
        void e_();
    }

    public static synchronized awl a() {
        awl awl;
        synchronized (awl.class) {
            if (d == null) {
                d = new awl();
            }
            awl = d;
        }
        return awl;
    }

    public static void b() {
        auh.b(Looper.getMainLooper().getThread() == Thread.currentThread());
    }

    public final void a(a aVar) {
        awl.b();
        this.a.remove(aVar);
    }
}
