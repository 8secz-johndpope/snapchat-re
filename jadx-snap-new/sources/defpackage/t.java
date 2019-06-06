package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import defpackage.u.a;

/* renamed from: t */
public final class t implements l {
    public static final t i = new t();
    int a = 0;
    int b = 0;
    boolean c = true;
    boolean d = true;
    public Handler e;
    public final m f = new m(this);
    Runnable g = new 1();
    a h = new 2();

    /* renamed from: t$3 */
    public class 3 extends h {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            ((u) activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = t.this.h;
        }

        public final void onActivityPaused(Activity activity) {
            t tVar = t.this;
            tVar.b--;
            if (tVar.b == 0) {
                tVar.e.postDelayed(tVar.g, 700);
            }
        }

        public final void onActivityStopped(Activity activity) {
            t tVar = t.this;
            tVar.a--;
            tVar.b();
        }
    }

    /* renamed from: t$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            t tVar = t.this;
            if (tVar.b == 0) {
                tVar.c = true;
                tVar.f.a(j.a.ON_PAUSE);
            }
            t.this.b();
        }
    }

    /* renamed from: t$2 */
    class 2 implements a {
        2() {
        }

        public final void a() {
            t tVar = t.this;
            tVar.a++;
            if (tVar.a == 1 && tVar.d) {
                tVar.f.a(j.a.ON_START);
                tVar.d = false;
            }
        }

        public final void b() {
            t tVar = t.this;
            tVar.b++;
            if (tVar.b == 1) {
                if (tVar.c) {
                    tVar.f.a(j.a.ON_RESUME);
                    tVar.c = false;
                    return;
                }
                tVar.e.removeCallbacks(tVar.g);
            }
        }
    }

    private t() {
    }

    public static l a() {
        return i;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (this.a == 0 && this.c) {
            this.f.a(j.a.ON_STOP);
            this.d = true;
        }
    }

    public final j getLifecycle() {
        return this.f;
    }
}
