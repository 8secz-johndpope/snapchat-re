package defpackage;

import android.view.View;
import com.google.common.base.Optional;
import com.snapchat.android.R;
import defpackage.abzt.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ttr */
public final class ttr extends tqi {
    ajdp<Boolean> a;
    ajdp<Boolean> b;
    tqm c;
    ajcx d;
    ajdp<aesf> e;
    List<? extends abzx> f;
    private tpl g;
    private Map<aesf, znh<zmy>> h;
    private final ajxe i = ajxh.a(new e(this));
    private final ttf j;

    /* renamed from: ttr$e */
    static final class e extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ ttr a;

        /* renamed from: ttr$e$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ e a;

            1(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List b;
                Object b2;
                String str;
                aesf aesf = (aesf) obj;
                akcr.b(aesf, "it");
                Object obj2 = (znh) ttr.a(this.a.a).get(aesf);
                if (obj2 != null) {
                    ajdp b3 = ajdp.b(obj2);
                    if (b3 != null) {
                        return b3;
                    }
                }
                ttr ttr = this.a.a;
                if (abyp.a(aesf)) {
                    b = ajym.b((Object[]) new abzx[]{abzx.SLOW, abzx.FAST, abzx.REWIND});
                } else {
                    b = ajyw.a;
                }
                ttr.f = b;
                if (b.isEmpty()) {
                    b2 = ajdp.b((Object) ajyw.a);
                    str = "Observable.just(emptyList())";
                } else {
                    tqm tqm = ttr.c;
                    if (tqm == null) {
                        akcr.a("stackedFiltersController");
                    }
                    b2 = tqm.b().k((ajfc) new f(ttr, b));
                    str = "stackedFiltersController…  }\n                    }";
                }
                akcr.a(b2, str);
                obj2 = b2.d((ajfb) a.a).p(b.a).d((ajfb) c.a).d((ajfb) new d(ttr, aesf));
                akcr.a(obj2, "toViewModels(source.getM…elCache[mediaType] = it }");
                return obj2;
            }
        }

        /* renamed from: ttr$e$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ e a;

            2(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                obj = (znh) obj;
                akcr.b(obj, "it");
                ajcx ajcx = this.a.a.d;
                if (ajcx == null) {
                    akcr.a("delayedBind");
                }
                return ajcx.a((ajdt) ajdp.b(obj));
            }
        }

        e(ttr ttr) {
            this.a = ttr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp ajdp = this.a.e;
            if (ajdp == null) {
                akcr.a("mediaTypeObservable");
            }
            return ajdp.k((ajfc) new 1(this)).u(new 2(this));
        }
    }

    /* renamed from: ttr$a */
    static final class a<T> implements ajfb<List<? extends zmy>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ttr$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return znk.a(ajyu.k(list));
        }
    }

    /* renamed from: ttr$c */
    static final class c<T> implements ajfb<znh<zmy>> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ttr$d */
    static final class d<T> implements ajfb<znh<zmy>> {
        private /* synthetic */ ttr a;
        private /* synthetic */ aesf b;

        d(ttr ttr, aesf aesf) {
            this.a = ttr;
            this.b = aesf;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (znh) obj;
            Map a = ttr.a(this.a);
            aesf aesf = this.b;
            akcr.a(obj, "it");
            a.put(aesf, obj);
        }
    }

    /* renamed from: ttr$g */
    static final class g<V> implements Callable<Object> {
        private /* synthetic */ ttr a;
        private /* synthetic */ a b;

        g(ttr ttr, a aVar) {
            this.a = ttr;
            this.b = aVar;
        }

        public final /* synthetic */ Object call() {
            List list = this.a.f;
            if (list == null) {
                return null;
            }
            a aVar = this.b;
            Iterable<abzx> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (abzx acaa : iterable) {
                arrayList.add(new acaa(acaa));
            }
            aVar.c((List) arrayList);
            tqm tqm = this.a.c;
            if (tqm == null) {
                akcr.a("stackedFiltersController");
            }
            abzx b = tqm.a().b();
            int indexOf = b != null ? list.indexOf(b) : -1;
            this.b.a(b == abzx.REWIND);
            return this.b.c(indexOf);
        }
    }

    /* renamed from: ttr$f */
    static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ List a;
        private /* synthetic */ ttr b;

        /* renamed from: ttr$f$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ f a;

            1(f fVar) {
                this.a = fVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                boolean booleanValue = ((Boolean) ajxm.a).booleanValue();
                boolean booleanValue2 = ((Boolean) ajxm.b).booleanValue();
                Collection arrayList = new ArrayList();
                for (Object next : this.a.a) {
                    int i = tts.a[((abzx) next).ordinal()];
                    boolean z = true;
                    if (i == 1) {
                        z = booleanValue;
                    } else if (i == 2) {
                        z = booleanValue2;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                Iterable<abzx> iterable = (List) arrayList;
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (abzx tuf : iterable) {
                    arrayList2.add(new tuf(tuf));
                }
                return (List) arrayList2;
            }
        }

        f(ttr ttr, List list) {
            this.b = ttr;
            this.a = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            tqn tqn = (tqn) obj;
            akcr.b(tqn, "filterInfo");
            if (tqn.c.b != null && (tqn.a || tqn.b)) {
                return ajdp.b((Object) ajyw.a);
            }
            ajdp ajdp = this.b.a;
            if (ajdp == null) {
                akcr.a("isRewindVideoSupported");
            }
            ajdp ajdp2 = this.b.b;
            if (ajdp2 == null) {
                akcr.a("isFastMotionSupported");
            }
            return ajwa.a(ajdp, ajdp2).p(new 1(this));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ttr.class), "myViewModels", "getMyViewModels()Lio/reactivex/Observable;");
    }

    public ttr(ttf ttf) {
        akcr.b(ttf, "source");
        this.j = ttf;
    }

    public final ajcx a(a aVar) {
        akcr.b(aVar, "filtersBuilder");
        Object b = ajcx.b((Callable) new g(this, aVar));
        akcr.a(b, "Completable.fromCallable…)\n            }\n        }");
        return b;
    }

    public final ajdp<Optional<zmy>> a(abzt abzt) {
        akcr.b(abzt, "filters");
        acaa l = abzt.l();
        if (l != null) {
            abzx a = l.a();
            if (a != null) {
                ajdp b = ajdp.b(Optional.of(new tuf(a)));
                if (b != null) {
                    return b;
                }
            }
        }
        Object b2 = ajdp.b(Optional.absent());
        akcr.a(b2, "Observable.just(Optional.absent())");
        return b2;
    }

    public final void a(int i) {
    }

    public final void a(ajdp<aesf> ajdp, ajdp<Boolean> ajdp2, ajdp<Boolean> ajdp3, tqm tqm, ajcx ajcx, boolean z, toz toz, tpl tpl, ajdp<zmy> ajdp4) {
        ajdp b;
        akcr.b(ajdp, "mediaTypeObservable");
        akcr.b(ajdp2, "updateEnabledObservable");
        akcr.b(ajdp3, "previewVisibleObservable");
        akcr.b(tqm, "stackedFiltersController");
        akcr.b(ajcx, "delayedBind");
        akcr.b(toz, "mediaPlayerCapabilities");
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(ajdp4, "currentViewModel");
        super.a(ajdp, ajdp2, ajdp3, tqm, ajcx, z, toz, tpl, ajdp4);
        this.e = ajdp;
        this.c = tqm;
        this.d = ajcx;
        if (z) {
            b = ajdp.b(Boolean.FALSE);
            akcr.a((Object) b, "Observable.just(false)");
        } else {
            b = toz.a();
        }
        this.a = b;
        this.b = toz.b();
        this.h = new ConcurrentHashMap();
        this.g = tpl;
    }

    public final void a(View view, zmy zmy) {
    }

    public final void a(iip iip) {
        akcr.b(iip, "previewAnalyticsWrapper");
        ttr ttr = this;
        if (ttr.g != null) {
            tpl tpl = this.g;
            if (tpl == null) {
                akcr.a("previewStartUpConfig");
            }
            if (tpt.b(tpl) && ttr.c != null) {
                double d;
                tqm tqm = this.c;
                if (tqm == null) {
                    akcr.a("stackedFiltersController");
                }
                abzx b = tqm.a().b();
                for (aaim aaim : iip.a()) {
                    aama aama;
                    aaim.n(Boolean.valueOf(b == abzx.REWIND));
                    if (b != null) {
                        int i = tts.b[b.ordinal()];
                        if (i == 1) {
                            aama = aama.SLOW;
                        } else if (i == 2) {
                            aama = aama.FAST;
                        }
                        aaim.a(aama);
                    }
                    aama = aama.NORMAL;
                    aaim.a(aama);
                }
                aahr aahr = iip.f;
                if (b != null) {
                    int i2 = tts.c[b.ordinal()];
                    if (i2 == 1) {
                        d = -1.0d;
                    } else if (i2 == 2) {
                        d = 0.5d;
                    } else if (i2 == 3) {
                        d = 2.0d;
                    }
                    aahr.a(Double.valueOf(d));
                }
                d = 1.0d;
                aahr.a(Double.valueOf(d));
            }
        }
    }

    public final void b(abzt abzt) {
        akcr.b(abzt, "filters");
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> d() {
        return (ajdp) this.i.b();
    }

    public final Map<Integer, Integer> e() {
        return ajzl.a(ajxs.a(Integer.valueOf(R.layout.filter_page_motion), Integer.valueOf(abzx.values().length)));
    }

    public final void onDispose() {
        Map map = this.h;
        if (map == null) {
            akcr.a("seekableViewModelCache");
        }
        map.clear();
    }
}
