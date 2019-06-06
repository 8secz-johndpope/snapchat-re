package defpackage;

import android.content.Context;
import android.view.View;
import com.snapchat.android.R;
import defpackage.akdd.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: jur */
public final class jur extends ajed implements zma {
    final Set<Long> a;
    final Set<Long> b;
    final ajwl<Integer> c;
    final zms d;
    final zke e;
    final zlv f;
    final idj g;
    final String h;
    final jth i;
    private final ajdp<znh<zmy>> j;
    private final ajei k;
    private final juq l;

    /* renamed from: jur$a */
    static final class a<T> implements ajfb<znh<itp>> {
        private /* synthetic */ jur a;
        private /* synthetic */ defpackage.akdd.a b;

        a(jur jur, defpackage.akdd.a aVar) {
            this.a = jur;
            this.b = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (znh) obj;
            this.b.a = false;
            akcr.a(obj, "it");
            for (itp itp : (Iterable) obj) {
                if (itp.g) {
                    this.a.b.add(Long.valueOf(itp.a));
                } else if (!itp.g) {
                    this.a.a.remove(Long.valueOf(itp.a));
                }
            }
        }
    }

    /* renamed from: jur$b */
    static final class b<T> implements ajfb<Boolean> {
        private /* synthetic */ jur a;
        private /* synthetic */ a b;

        b(jur jur, a aVar) {
            this.a = jur;
            this.b = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.b.a = true;
            this.a.a.addAll(this.a.b);
            this.a.b.clear();
        }
    }

    public jur(Context context, zms zms, zke zke, ajdp<znh<itp>> ajdp, ajdp<Boolean> ajdp2, zlv zlv, zlv zlv2, idj idj, String str, ajdp<Boolean> ajdp3, jth jth, juq juq, zkf zkf, ftl ftl, zfw zfw, zmy zmy) {
        zms zms2 = zms;
        zke zke2 = zke;
        ajdp<znh<itp>> ajdp4 = ajdp;
        ajdp<Boolean> ajdp5 = ajdp2;
        zlv zlv3 = zlv2;
        idj idj2 = idj;
        String str2 = str;
        ajdp<Boolean> ajdp6 = ajdp3;
        jth jth2 = jth;
        zkf zkf2 = zkf;
        akcr.b(context, "context");
        akcr.b(zms2, "viewFactory");
        akcr.b(zke2, "eventDispatcher");
        akcr.b(ajdp4, "source");
        akcr.b(ajdp5, "showQuickAddCarousel");
        akcr.b(zlv, "carouselViewType");
        akcr.b(zlv3, "carouselItemViewType");
        akcr.b(idj2, "uiPage");
        akcr.b(str2, "featureName");
        akcr.b(ajdp6, "visibilityChange");
        akcr.b(jth2, "addedMeAndQuickAddSeenLogger");
        akcr.b(zkf2, "rxBus");
        akcr.b(ftl, "configurationProvider");
        akcr.b(zfw, "schedulers");
        this.d = zms2;
        this.e = zke2;
        this.f = zlv3;
        this.g = idj2;
        this.h = str2;
        this.i = jth2;
        this.l = juq;
        this.a = new LinkedHashSet();
        this.b = new LinkedHashSet();
        Object i = ajwl.i(Integer.valueOf(0));
        akcr.a(i, "BehaviorSubject.createDefault(0)");
        this.c = i;
        this.k = new ajei();
        this.k.a(zkf2.a(this));
        final a aVar = new a();
        aVar.a = true;
        final ajdp d = ajdp4.a(zfx.a((ajdw) zfw.b(), 1)).d((ajfb) new a(this, aVar));
        final ajdp d2 = ajdp6.d((ajfb) new b(this, aVar));
        final 1 1 = new akbk<ajdp<List<? extends jvf>>>(this) {
            final /* synthetic */ jur a;

            /* renamed from: jur$1$a */
            public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
                private /* synthetic */ 1 a;

                public a(1 1) {
                    this.a = 1;
                }

                public final R apply(T1 t1, T2 t2) {
                    Object obj = (znh) t1;
                    String str = "records";
                    Collection arrayList;
                    if (aVar.a) {
                        akcr.a(obj, str);
                        arrayList = new ArrayList();
                        for (Object next : (Iterable) obj) {
                            if ((((itp) next).g ^ 1) != 0) {
                                arrayList.add(next);
                            }
                        }
                        return (List) arrayList;
                    }
                    akcr.a(obj, str);
                    arrayList = new ArrayList();
                    for (Object next2 : (Iterable) obj) {
                        itp itp = (itp) next2;
                        Object obj2 = (itp.g && this.a.a.a.contains(Long.valueOf(itp.a))) ? null : 1;
                        if (obj2 != null) {
                            arrayList.add(next2);
                        }
                    }
                    return (List) arrayList;
                }
            }

            /* renamed from: a */
            public final ajdp<List<jvf>> invoke() {
                Object obj = d;
                akcr.a(obj, "dataSource");
                Object obj2 = d2;
                akcr.a(obj2, "visibilitySource");
                ajdp a = ajdp.a((ajdt) obj, (ajdt) obj2, (ajex) new a(this));
                if (a == null) {
                    akcr.a();
                }
                return a.j(ajfu.a).u(new jus(new akbl<List<? extends itp>, ajdp<List<? extends jvf>>>(this.a) {
                    public final String getName() {
                        return "toViewModels";
                    }

                    public final akej getOwner() {
                        return akde.a(jur.class);
                    }

                    public final String getSignature() {
                        return "toViewModels(Ljava/util/List;)Lio/reactivex/Observable;";
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        List list = (List) obj;
                        akcr.b(list, "p1");
                        jur jur = (jur) this.receiver;
                        Iterable iterable = list;
                        Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
                        int i = 0;
                        for (Object next : iterable) {
                            int i2 = i + 1;
                            if (i < 0) {
                                ajym.a();
                            }
                            arrayList.add(new jvf(jur.f, jur.g, (itp) next, i, jur.h, jur.i));
                            i = i2;
                        }
                        obj = ajdp.b((List) arrayList);
                        akcr.a(obj, "Observable.just(suggeste…AddSeenLogger)\n        })");
                        return obj;
                    }
                }));
            }
        };
        final ftl ftl2 = ftl;
        final zlv zlv4 = zlv;
        final Context context2 = context;
        final zmy zmy2 = zmy;
        i = ajdp5.u(new ajfc<T, ajdt<? extends R>>(this) {
            final /* synthetic */ jur a;

            /* renamed from: jur$2$a */
            public static final class a<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
                private /* synthetic */ 2 a;

                public a(2 2) {
                    this.a = 2;
                }

                public final R apply(T1 t1, T2 t2, T3 t3) {
                    Object obj = (Integer) t3;
                    Object obj2 = (Integer) t2;
                    Object obj3 = (List) t1;
                    if (obj3.isEmpty()) {
                        return znk.a;
                    }
                    if (obj3.size() < 4 || (obj != null && obj.intValue() == 1)) {
                        obj = Integer.valueOf(1);
                    }
                    zlv zlv = zlv4;
                    zms zms = this.a.a.d;
                    zke zke = this.a.a.e;
                    akcr.a(obj3, "friends");
                    List h = ajyu.h((Collection) obj3);
                    int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.df_quick_add_carousel_offset);
                    akcr.a(obj2, "position");
                    int intValue = obj2.intValue();
                    akcr.a(obj, "rowCount");
                    R a = znk.a((Object) new jvg(zlv, zms, zke, h, dimensionPixelSize, intValue, obj.intValue()));
                    if (zmy2 != null) {
                        a = znk.a(znk.a(zmy2), a);
                    }
                    return a;
                }
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "showQuickAdd");
                if (!bool.booleanValue()) {
                    return ajdp.b((Object) znk.a);
                }
                obj = 1.invoke();
                akcr.a(obj, "getViewModelSource()");
                ajdp ajdp = this.a.c;
                Object s = ftl2.s(jic.QUICK_ADD_ROWS_IN_DF);
                akcr.a(s, "configurationProvider.ob…Key.QUICK_ADD_ROWS_IN_DF)");
                ajdp a = ajdp.a((ajdt) obj, (ajdt) ajdp, (ajdt) s, (ajfd) new a(this));
                if (a == null) {
                    akcr.a();
                }
                return a;
            }
        });
        akcr.a(i, "showQuickAddCarousel.swi…      }\n                }");
        this.j = i;
    }

    public /* synthetic */ jur(Context context, zms zms, zke zke, ajdp ajdp, ajdp ajdp2, zlv zlv, zlv zlv2, idj idj, String str, ajdp ajdp3, jth jth, zkf zkf, ftl ftl, zfw zfw) {
        this(context, zms, zke, ajdp, ajdp2, zlv, zlv2, idj, str, ajdp3, jth, null, zkf, ftl, zfw, null);
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> c() {
        return this.j;
    }

    public final void onDispose() {
        this.k.dispose();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onQuickAddCarouselPositionUpdateEvent(ita ita) {
        akcr.b(ita, "event");
        Integer num = (Integer) this.c.p();
        int i = ita.a;
        if (num == null || num.intValue() != i) {
            this.c.a(Integer.valueOf(ita.a));
            juq juq = this.l;
            if (juq != null) {
                juq.a();
            }
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onQuickAddCarouselScrolledEvent(itb itb) {
        akcr.b(itb, "event");
        if (itb.a > 0 || itb.b > 0) {
            juq juq = this.l;
            if (juq != null) {
                juq.a();
            }
        }
    }
}
