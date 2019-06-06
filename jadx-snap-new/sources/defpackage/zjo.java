package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import com.snap.ui.deck.MainPageFragment;
import java.util.concurrent.TimeUnit;

/* renamed from: zjo */
public final class zjo extends zgi {
    public final ajei a = new ajei();
    final achb<zjm, zjk> b;
    private final ajxe c = ajxh.a(new e(this));
    private final zgb d;

    /* renamed from: zjo$b */
    static final class b extends akcq implements akbk<ajxw> {
        b(zjo zjo) {
            super(0, zjo);
        }

        public final String getName() {
            return "onPause";
        }

        public final akej getOwner() {
            return akde.a(zjo.class);
        }

        public final String getSignature() {
            return "onPause()V";
        }

        public final /* synthetic */ Object invoke() {
            zjo zjo = (zjo) this.receiver;
            int size = zjo.b.g().size();
            int i = 0;
            long j = 0;
            for (Object next : zjo.b.g()) {
                int i2 = i + 1;
                if (i < 0) {
                    ajym.a();
                }
                Object next2 = (aciv) next2;
                akcr.a(next2, "page");
                achd d = next2.d();
                if (!(d instanceof zjq)) {
                    d = null;
                }
                zjq zjq = (zjq) d;
                if (zjq == null) {
                    d = next2.d();
                    if (!(d instanceof zjf)) {
                        d = null;
                    }
                    zjf zjf = (zjf) d;
                    MainPageFragment b = zjf != null ? zjf.c() : null;
                    if (!(b instanceof zjq)) {
                        b = null;
                    }
                    zjq = (zjq) b;
                }
                long S_ = zjq != null ? zjq.S_() : 0;
                String str = "page.pageType";
                if (S_ < 0 || i == size - 1) {
                    if (i != 0) {
                        Object e = next2.e();
                        akcr.a(e, str);
                        zjo.a(j, (zjm) e);
                    }
                    return ajxw.a;
                }
                if (S_ > j) {
                    if (i != 0) {
                        Object e2 = next2.e();
                        akcr.a(e2, str);
                        zjo.a(j, (zjm) e2);
                    }
                    j = S_;
                }
                i = i2;
            }
            return ajxw.a;
        }
    }

    /* renamed from: zjo$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zjo$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ zjo a;

        e(zjo zjo) {
            this.a = zjo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(zjc.a.callsite("OnPausePagePopper"));
        }
    }

    /* renamed from: zjo$c */
    static final class c implements ajev {
        private /* synthetic */ zjo a;

        c(zjo zjo) {
            this.a = zjo;
        }

        public final void run() {
            this.a.a.a();
        }
    }

    /* renamed from: zjo$d */
    static final class d<T> implements ajfb<Long> {
        private /* synthetic */ zjo a;
        private /* synthetic */ zjm b;

        d(zjo zjo, zjm zjm) {
            this.a = zjo;
            this.b = zjm;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b.a((achg) this.b, false, false, null);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zjo.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public zjo(achb<zjm, zjk> achb, zgb zgb, zgk<b> zgk) {
        akcr.b(achb, "navigationHost");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.b = achb;
        this.d = zgb;
    }

    public final ajej a() {
        Object a = ajek.a((ajev) new zjp(new b(this)));
        akcr.a(a, "Disposables.fromAction(::onPause)");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final void a(long j, zjm zjm) {
        ajej f = ajdp.a(j, TimeUnit.MILLISECONDS, (ajdw) ((zfw) this.c.b()).l()).f((ajfb) new d(this, zjm));
        akcr.a((Object) f, "Observable.timer(duratio… false)\n                }");
        this.a.a(f);
    }

    public final ajej b() {
        Object a = ajek.a((ajev) new c(this));
        akcr.a(a, "Disposables.fromAction { disposeAll() }");
        return a;
    }
}
