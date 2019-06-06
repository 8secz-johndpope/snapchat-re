package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.gdm.a;

/* renamed from: gdk */
public final class gdk extends zgi {
    final gel a;
    final ajwy<gpf> b;
    private final gdm c;

    /* renamed from: gdk$a */
    static final class a implements ajev {
        private /* synthetic */ gdk a;

        a(gdk gdk) {
            this.a = gdk;
        }

        public final void run() {
            this.a.a.a();
        }
    }

    /* renamed from: gdk$b */
    static final class b implements ajev {
        private /* synthetic */ gdk a;

        b(gdk gdk) {
            this.a = gdk;
        }

        public final void run() {
            gpf gpf = (gpf) this.a.b.get();
            for (ajwy ajwy : gpf.a) {
                Object obj = (zfl) ajwy.get();
                int i = obj.a;
                obj.a = 0;
                String str = "name";
                ((ilv) gpf.b.get()).b(iot.THREAD_MAX.a(str, obj.b), (long) obj.getLargestPoolSize());
                ilv ilv = (ilv) gpf.b.get();
                ilz a = iot.THREAD_CURRENT_ACTIVE.a(str, obj.b);
                akcr.a(obj, "pool");
                ilv.b(a, (long) obj.getActiveCount());
                ((ilv) gpf.b.get()).b(iot.THREAD_MAX_ACTIVE.a(str, obj.b), (long) i);
            }
        }
    }

    public gdk(gdm gdm, gel gel, ajwy<gpf> ajwy, zgk<b> zgk) {
        akcr.b(gdm, "baseAppStateActivityObserver");
        akcr.b(gel, "contentResultFactory");
        akcr.b(ajwy, "cachedThreadPoolAnalytics");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.c = gdm;
        this.a = gel;
        this.b = ajwy;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        gdm gdm = this.c;
        Thread currentThread = Thread.currentThread();
        gdm.a.a().a((Object) gdj.FOREGROUND);
        ajej a = ajek.a((ajev) new a(gdm, currentThread));
        akcr.a((Object) a, "Disposables.fromAction {…ate.BACKGROUND)\n        }");
        ajvv.a(a, ajei);
        a = ajek.a((ajev) new a(this));
        akcr.a((Object) a, "Disposables.fromAction {…AppBackground()\n        }");
        ajvv.a(a, ajei);
        a = ajek.a((ajev) new b(this));
        akcr.a((Object) a, "Disposables.fromAction {….get().report()\n        }");
        ajvv.a(a, ajei);
        return ajei;
    }
}
