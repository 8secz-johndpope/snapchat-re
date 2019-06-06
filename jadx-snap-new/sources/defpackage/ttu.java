package defpackage;

import android.view.View;
import com.google.common.base.Optional;
import com.snapchat.android.R;
import defpackage.abzt.a;
import defpackage.ttf.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: ttu */
public final class ttu extends tqi {
    tqm a;
    ajcx b;
    aeht c;
    List<? extends acae> d;
    final ttf e;
    private final ajxe f = ajxh.a(new a(this));

    /* renamed from: ttu$a */
    static final class a extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ ttu a;

        /* renamed from: ttu$a$1 */
        static final class 1<T> implements ajfb<List<? extends acae>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: ttu$a$3 */
        static final class 3<T, R> implements ajfc<T, R> {
            public static final 3 a = new 3();

            3() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return znk.a(ajyu.k(list));
            }
        }

        /* renamed from: ttu$a$4 */
        static final class 4<T> implements ajfb<znh<zmy>> {
            public static final 4 a = new 4();

            4() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: ttu$a$5 */
        static final class 5<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ a a;

            5(a aVar) {
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

        a(ttu ttu) {
            this.a = ttu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object p = this.a.e.c().p(new g(ajyl.a(acae.UNFILTERED), ajym.b((Object[]) new acae[]{acae.SMOOTHING, acae.INSTASNAP, acae.MISS_ETIKATE, acae.GREYSCALE})));
            akcr.a(p, "contextFilterTypesUpdate…defaultFilters)\n        }");
            return p.d((ajfb) 1.a).u(new ttv(new akbl<List<? extends acae>, ajdp<List<? extends zmy>>>(this.a) {
                public final String getName() {
                    return "toViewModels";
                }

                public final akej getOwner() {
                    return akde.a(ttu.class);
                }

                public final String getSignature() {
                    return "toViewModels(Ljava/util/List;)Lio/reactivex/Observable;";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    List list = (List) obj;
                    akcr.b(list, "p1");
                    ttu ttu = (ttu) this.receiver;
                    ttu.d = list;
                    ttu.c = new aeht();
                    aeht aeht = ttu.c;
                    if (aeht != null) {
                        aeht.a = ttu.e.f();
                    }
                    tqm tqm = ttu.a;
                    if (tqm == null) {
                        akcr.a("stackedFiltersController");
                    }
                    obj = tqm.b().k((ajfc) new b(list));
                    akcr.a(obj, "stackedFiltersController…      }\n                }");
                    return obj;
                }
            })).p(3.a).d((ajfb) 4.a).u(new 5(this)).i().a();
        }
    }

    /* renamed from: ttu$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ List a;

        /* renamed from: ttu$b$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                acae acae = (acae) obj;
                akcr.b(acae, "it");
                return new tui(acae);
            }
        }

        b(List list) {
            this.a = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            tqn tqn = (tqn) obj;
            akcr.b(tqn, "filterInfo");
            final boolean z = tqn.a || tqn.b;
            return (tqn.c.a == acae.UNFILTERED || !z) ? ajdp.b((Iterable) this.a).a((ajfl) new ajfl<acae>() {
                public final /* synthetic */ boolean test(Object obj) {
                    acae acae = (acae) obj;
                    akcr.b(acae, "it");
                    return (z && acae == acae.UNFILTERED) ? false : true;
                }
            }).p(2.a).a(16).i() : ajdp.b((Object) ajyw.a);
        }
    }

    /* renamed from: ttu$c */
    static final class c<V> implements Callable<Object> {
        private /* synthetic */ ttu a;
        private /* synthetic */ a b;

        c(ttu ttu, a aVar) {
            this.a = ttu;
            this.b = aVar;
        }

        public final /* synthetic */ Object call() {
            if (this.a.a != null) {
                tqm tqm = this.a.a;
                if (tqm == null) {
                    akcr.a("stackedFiltersController");
                }
                acae a = tqm.a().a();
                List list = this.a.d;
                if (list != null) {
                    a aVar = this.b;
                    Iterable<acae> iterable = list;
                    Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (acae acad : iterable) {
                        arrayList.add(new acad(acad));
                    }
                    aVar.a((List) arrayList);
                    this.b.a(list.indexOf(a));
                }
                this.a.c = new aeht();
                aeht aeht = this.a.c;
                if (aeht != null) {
                    aeht.a = this.a.e.f();
                }
                this.b.a(this.a.c);
                this.b.c(this.a.e.a);
                if (a.c()) {
                    for (Object next : this.a.e.f()) {
                        Object a2 = ((aehv) next).a();
                        akcr.a(a2, "it.skyTypeEnum");
                        if (ttl.a(a2) == a) {
                            a2 = 1;
                            continue;
                        } else {
                            a2 = null;
                            continue;
                        }
                        if (a2 != null) {
                            break;
                        }
                    }
                    Object next2 = null;
                    aehv aehv = (aehv) next2;
                    if (aehv != null) {
                        this.b.a(aehv.a);
                    }
                }
            }
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ttu.class), "myViewModels", "getMyViewModels()Lio/reactivex/Observable;");
    }

    public ttu(ttf ttf) {
        akcr.b(ttf, "source");
        this.e = ttf;
    }

    public final ajcx a(a aVar) {
        akcr.b(aVar, "filtersBuilder");
        Object b = ajcx.b((Callable) new c(this, aVar));
        akcr.a(b, "Completable.fromCallable…}\n            }\n        }");
        return b;
    }

    public final ajdp<Optional<zmy>> a(abzt abzt) {
        akcr.b(abzt, "filters");
        Object a = abzt.a();
        if (a != null) {
            akcr.a(a, "it");
            ajdp b = ajdp.b(Optional.of(new tui(a)));
            if (b != null) {
                return b;
            }
        }
        a = ajdp.b(Optional.absent());
        akcr.a(a, "Observable.just(Optional.absent())");
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
        if (this.a != null) {
            aaim aaim;
            tqm tqm = this.a;
            if (tqm == null) {
                akcr.a("stackedFiltersController");
            }
            acae a = tqm.a().a();
            iip.f.a(a.name());
            for (aaim aaim2 : iip.a()) {
                aaim2.a(a.b());
            }
            Iterator it = iip.a().iterator();
            while (true) {
                Long l = null;
                if (!it.hasNext()) {
                    break;
                }
                aaim2 = (aaim) it.next();
                aeht aeht = this.c;
                if (aeht != null) {
                    List list = aeht.a;
                    if (list != null) {
                        l = Long.valueOf((long) list.size());
                    }
                }
                aaim2.F(l);
            }
            for (aaim aaim22 : iip.a()) {
                aaim22.r(Boolean.valueOf(this.e.a));
            }
            if (a.c()) {
                aeht aeht2 = this.c;
                List list2 = aeht2 != null ? aeht2.a : null;
                if (list2 != null && (list2.isEmpty() ^ 1) != 0) {
                    aehv aehv = (aehv) list2.get(0);
                    for (aaim aaim222 : iip.a()) {
                        aaim222.x(aehv != null ? aehv.c : null);
                    }
                    for (aaim w : iip.a()) {
                        w.w(aehv != null ? aehv.a : null);
                    }
                }
            }
        }
    }

    public final void b(abzt abzt) {
        akcr.b(abzt, "filters");
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> d() {
        return (ajdp) this.f.b();
    }

    public final Map<Integer, Integer> e() {
        return ajzl.a(ajxs.a(Integer.valueOf(R.layout.filter_page_visual), Integer.valueOf(acae.values().length)));
    }

    public final void onDispose() {
    }
}
