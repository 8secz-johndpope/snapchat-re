package defpackage;

import android.view.View;
import defpackage.abzt.a;
import java.util.List;
import java.util.Map;

/* renamed from: ttt */
public final class ttt extends tqi {
    tqm a;
    ajcx b;
    private final ajxe c = ajxh.a(new a(this));

    /* renamed from: ttt$a */
    static final class a extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ ttt a;

        /* renamed from: ttt$a$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                tqn tqn = (tqn) obj;
                akcr.b(tqn, "filterInfo");
                return tqn.a ? ajyl.a(new tug(new tql(null, null, null, null, null, null, 63))) : tqn.c.a() ? ajyl.a(new tug(tqn.c)) : ajyw.a;
            }
        }

        /* renamed from: ttt$a$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return znk.a(ajyu.k(list));
            }
        }

        /* renamed from: ttt$a$3 */
        static final class 3<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ a a;

            3(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                obj = (znh) obj;
                akcr.b(obj, "it");
                ajcx ajcx = this.a.a.b;
                if (ajcx == null) {
                    akcr.a("delayedBind");
                }
                return ajcx.a((ajdt) ajdp.b(obj));
            }
        }

        a(ttt ttt) {
            this.a = ttt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            tqm tqm = this.a.a;
            if (tqm == null) {
                akcr.a("stackedFiltersController");
            }
            return tqm.b().p(1.a).p(2.a).u(new 3(this)).i().a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ttt.class), "myViewModels", "getMyViewModels()Lio/reactivex/Observable;");
    }

    public final ajcx a(a aVar) {
        akcr.b(aVar, "builder");
        Object a = ajvo.a(ajhn.a);
        akcr.a(a, "Completable.complete()");
        return a;
    }

    public final void a(int i) {
    }

    public final void a(ajdp<aesf> ajdp, ajdp<Boolean> ajdp2, ajdp<Boolean> ajdp3, tqm tqm, ajcx ajcx, boolean z, toz toz, tpl tpl, ajdp<zmy> ajdp4) {
        akcr.b(ajdp, "mediaTypeObservable");
        akcr.b(ajdp2, "updateEnabledObservable");
        akcr.b(ajdp3, "previewVisibleObservable");
        akcr.b(tqm, "stackedFiltersController");
        akcr.b(ajcx, "delayedBind");
        akcr.b(toz, "mediaPlayerCapabilities");
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(ajdp4, "currentViewModel");
        super.a(ajdp, ajdp2, ajdp3, tqm, ajcx, z, toz, tpl, ajdp4);
        this.a = tqm;
        this.b = ajcx;
    }

    public final void a(View view, zmy zmy) {
    }

    public final void a(iip iip) {
        akcr.b(iip, "previewAnalyticsWrapper");
    }

    public final void b(abzt abzt) {
        akcr.b(abzt, "filters");
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> d() {
        return (ajdp) this.c.b();
    }

    public final Map<Integer, Integer> e() {
        return ajyx.a;
    }

    public final void onDispose() {
    }
}
