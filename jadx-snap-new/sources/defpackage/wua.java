package defpackage;

import android.app.Activity;
import com.brightcove.player.event.Event;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.wta.e;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: wua */
public final class wua extends zgi {
    final ajwy<wub> a;
    final ajwy<wta> b;
    private final ajxe c;
    private final ajxe d;
    private final ajwy<wtq> e;
    private final ajwy<ftl> f;
    private final Set<abov> g;

    /* renamed from: wua$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        e(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(wqv.g, "MushroomShake2ReportActivityObserver");
        }
    }

    /* renamed from: wua$f */
    static final class f extends akcs implements akbk<WeakReference<Activity>> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new WeakReference(this.a.get());
        }
    }

    /* renamed from: wua$d */
    static final class d implements ajev {
        private /* synthetic */ wua a;

        d(wua wua) {
            this.a = wua;
        }

        public final void run() {
            ((wub) this.a.a.get()).b();
            wta wta = (wta) this.a.b.get();
            wta.b().a((Runnable) new e(wta));
        }
    }

    /* renamed from: wua$a */
    static final class a implements ajev {
        private /* synthetic */ wua a;

        a(wua wua) {
            this.a = wua;
        }

        public final void run() {
            ((wub) this.a.a.get()).a();
        }
    }

    /* renamed from: wua$b */
    static final class b<T> implements ajfb<Boolean> {
        private /* synthetic */ wua a;

        b(wua wua) {
            this.a = wua;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            wub wub = (wub) this.a.a.get();
            akcr.a(obj, "enabled");
            wub.a(obj.booleanValue());
            ((wub) this.a.a.get()).c();
            abow.a(obj.booleanValue());
        }
    }

    /* renamed from: wua$c */
    static final class c<T> implements ajfb<Boolean> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "enabled");
            abow.b(obj.booleanValue());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(wua.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(wua.class), "weakActivity", "getWeakActivity()Ljava/lang/ref/WeakReference;")};
    }

    public wua(zgk<b> zgk, zgb zgb, ajwy<Activity> ajwy, ajwy<wub> ajwy2, ajwy<wtq> ajwy3, ajwy<ftl> ajwy4, ajwy<wta> ajwy5, Set<abov> set) {
        akcr.b(zgk, "taskScoper");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, Event.ACTIVITY);
        akcr.b(ajwy2, "shakeDetector");
        akcr.b(ajwy3, "shakeFileManager");
        akcr.b(ajwy4, "configProvider");
        akcr.b(ajwy5, "syncManager");
        akcr.b(set, "debugCapturerFileProvider");
        super(zgk);
        this.a = ajwy2;
        this.e = ajwy3;
        this.f = ajwy4;
        this.b = ajwy5;
        this.g = set;
        this.c = ajxh.a(new e(zgb));
        this.d = ajxh.a(new f(ajwy));
    }

    private final zfw c() {
        return (zfw) this.c.b();
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajei.a(ajek.a((ajev) new a(this)));
        ((wta) this.b.get()).c();
        ((wtq) this.e.get()).a(this.g);
        ((wub) this.a.get()).a((WeakReference) this.d.b());
        ajej e = ((ftl) this.f.get()).b((fth) wrc.S2R_ENABLED).b((ajdw) c().j()).e((ajfb) new b(this));
        String str = "configProvider.get().get…nabled)\n                }";
        akcr.a((Object) e, str);
        ajvv.a(e, ajei);
        e = ((ftl) this.f.get()).b((fth) wrc.S2R_ELIGIBILITY_IN_PROD).b((ajdw) c().j()).e((ajfb) c.a);
        akcr.a((Object) e, str);
        ajvv.a(e, ajei);
        return ajei;
    }

    public final ajej b() {
        Object a = ajek.a((ajev) new d(this));
        akcr.a(a, "Disposables.fromAction {…get().cleanUp()\n        }");
        return a;
    }
}
