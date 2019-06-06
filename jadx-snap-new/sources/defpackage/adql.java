package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.concurrent.TimeUnit;

/* renamed from: adql */
public final class adql extends zgi {
    final ajei a = new ajei();
    final ajwy<pqt> b;
    private final zfw c = zgb.a(pql.j.callsite("ChatSessionActivityObserver"));

    /* renamed from: adql$c */
    static final class c implements ajev {
        private /* synthetic */ adql a;

        c(adql adql) {
            this.a = adql;
        }

        public final void run() {
            adql adql = this.a;
            ((pqt) adql.b.get()).d();
            adql.a.a();
        }
    }

    /* renamed from: adql$a */
    static final class a implements Runnable {
        private /* synthetic */ adql a;

        /* renamed from: adql$a$1 */
        static final class 1<T> implements ajfb<pqs> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: adql$a$2 */
        static final class 2<T> implements ajfb<Throwable> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        a(adql adql) {
            this.a = adql;
        }

        public final void run() {
            this.a.a.a(((pqt) this.a.b.get()).a().a((ajfb) 1.a, (ajfb) 2.a));
        }
    }

    /* renamed from: adql$b */
    static final class b implements ajev {
        private /* synthetic */ adql a;

        b(adql adql) {
            this.a = adql;
        }

        public final void run() {
            adql adql = this.a;
            ((pqt) adql.b.get()).c();
            adql.a.a();
        }
    }

    public adql(ajwy<pqt> ajwy, zgb zgb, zgk<b> zgk) {
        akcr.b(ajwy, "chatSessionController");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.b = ajwy;
    }

    public final ajej a() {
        ((pqt) this.b.get()).b();
        this.a.a(this.c.b().a(new a(this), 2, TimeUnit.SECONDS));
        Object a = ajek.a((ajev) new b(this));
        akcr.a(a, "Disposables.fromAction { onPause() }");
        return a;
    }

    public final ajej b() {
        Object a = ajek.a((ajev) new c(this));
        akcr.a(a, "Disposables.fromAction { onDestroy() }");
        return a;
    }
}
