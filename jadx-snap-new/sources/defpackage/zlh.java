package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import com.snap.ui.deck.MainPageFragment;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* renamed from: zlh */
public final class zlh extends zgi implements achk<zjm, zjk> {
    public final ajwo<achg> a;
    final CopyOnWriteArraySet<achk<zjm, zjk>> b = new CopyOnWriteArraySet();
    ajej c;
    public final achb<zjm, zjk> d;
    private final zgb e;

    /* renamed from: zlh$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zlh$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajxw) obj, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: zlh$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Long) obj, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* renamed from: zlh$d */
    static final class d<T> implements ajfb<Boolean> {
        private /* synthetic */ zlh a;
        private /* synthetic */ zjm b;

        d(zlh zlh, zjm zjm) {
            this.a = zlh;
            this.b = zjm;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            zlh zlh = this.a;
            zjm zjm = this.b;
            akcr.a((Object) zjm, "pageType");
            akcr.a(obj, "isTimeout");
            obj.booleanValue();
            zlh.a(zjm);
        }
    }

    /* renamed from: zlh$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ zlh a;
        private /* synthetic */ zjm b;

        e(zlh zlh, zjm zjm) {
            this.a = zlh;
            this.b = zjm;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zlh$c */
    static final class c implements ajev {
        private /* synthetic */ zlh a;

        c(zlh zlh) {
            this.a = zlh;
        }

        public final void run() {
            this.a.d.b((achk) this.a);
            this.a.b.clear();
            ajej ajej = this.a.c;
            if (ajej != null) {
                ajej.dispose();
            }
            this.a.c = null;
        }
    }

    static {
        a aVar = new a();
    }

    public zlh(achb<zjm, zjk> achb, zgk<b> zgk, zgb zgb) {
        akcr.b(achb, "navigationHost");
        akcr.b(zgk, "taskScoper");
        akcr.b(zgb, "schedulersProvider");
        super(zgk);
        this.d = achb;
        this.e = zgb;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<PageType>()");
        this.a = ajwo;
    }

    private static ajdp<Boolean> a(ajdw ajdw) {
        Object p = ajdp.a(5000, TimeUnit.MILLISECONDS, ajdw).p(b.a);
        akcr.a(p, "Observable.timer(TIMEOUT…eduler).map { _ -> true }");
        return p;
    }

    private static zlg b(aciv<zjm, zjk> aciv) {
        achd d = aciv.d();
        if (!(d instanceof zlg)) {
            d = null;
        }
        zlg zlg = (zlg) d;
        if (zlg != null) {
            return zlg;
        }
        achd d2 = aciv.d();
        if (!(d2 instanceof zjf)) {
            d2 = null;
        }
        zjf zjf = (zjf) d2;
        MainPageFragment b = zjf != null ? zjf.c() : null;
        if (!(b instanceof zlg)) {
            b = null;
        }
        return (zlg) b;
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        for (achk a : this.b) {
            a.a(achi);
        }
        if (achi.l) {
            a(achi.f);
        }
    }

    public final void a(aciv<zjm, zjk> aciv) {
        akcr.b(aciv, "page");
        ajej ajej = this.c;
        if (ajej != null) {
            ajej.dispose();
        }
        this.c = null;
        zjm zjm = (zjm) aciv.e();
        zlg b = zlh.b((aciv) aciv);
        if (b != null) {
            zfw a = zgb.a(zjm.d.c.callsite("PageReadyController"));
            this.c = b.g().p(f.a).b((ajdw) a.l()).e((ajdt) zlh.a((ajdw) a.l())).c(1).a((ajdw) a.l()).a((ajfb) new d(this, zjm), (ajfb) new e(this, zjm));
            return;
        }
        akcr.a((Object) zjm, "pageType");
        a(zjm);
    }

    /* Access modifiers changed, original: final */
    public final void a(zjm zjm) {
        this.a.a((Object) zjm);
    }

    public final ajej b() {
        Object a = ajek.a((ajev) new c(this));
        akcr.a(a, "Disposables.fromAction {…sposable = null\n        }");
        return a;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        for (achk b : this.b) {
            b.b(achi);
        }
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        for (achk c : this.b) {
            c.c(achi);
        }
        a(achi.e);
    }
}
