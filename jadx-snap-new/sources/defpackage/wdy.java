package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: wdy */
public final class wdy extends vzb {
    final Resources a;
    final ajwl<Integer> b;
    final ajdp<List<vzo>> c;
    private final ajxe d = ajxh.a(new c(this));
    private final wbm e;
    private final ajdp<vzu> g;

    /* renamed from: wdy$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ wdy a;

        a(wdy wdy) {
            this.a = wdy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final vzu vzu = (vzu) obj;
            akcr.b(vzu, "normalizedQuery");
            return (((CharSequence) vzu.b).length() == 0 ? 1 : null) != null ? ajdp.b(new vzx(vzu.a, ajyw.a)) : this.a.c.p(new ajfc<T, R>(this) {
                private /* synthetic */ a a;

                public final /* synthetic */ Object apply(Object obj) {
                    List<vzo> list = (List) obj;
                    akcr.b(list, "it");
                    String str = vzu.b;
                    ArrayList arrayList = new ArrayList();
                    for (vzo vzo : list) {
                        int a = vxf.a(str, vzo.a());
                        if (a != -1) {
                            arrayList.add(new wau(a, null, null, vzo, null, 22));
                        }
                    }
                    List list2 = arrayList;
                    ajyq.c(list2);
                    return new vzx(vzu.a, list2);
                }
            });
        }
    }

    /* renamed from: wdy$c */
    static final class c extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ wdy a;

        /* renamed from: wdy$c$a */
        public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
            private /* synthetic */ c a;

            public a(c cVar) {
                this.a = cVar;
            }

            public final R apply(T1 t1, T2 t2) {
                Object obj = (Integer) t2;
                vzx vzx = (vzx) t1;
                wdy wdy = this.a.a;
                List list = vzx.b;
                if (list != null) {
                    akcr.a(obj, "limit");
                    int intValue = obj.intValue();
                    Object string = wdy.a.getString(R.string.search_my_groups_section);
                    akcr.a(string, "resources.getString(R.st…search_my_groups_section)");
                    return wds.a(list, intValue, string, wdy.f, ajyx.a, new b(wdy));
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.collections.List<com.snap.search.ranking.ScoredResult>");
            }
        }

        c(wdy wdy) {
            this.a = wdy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp a = ajdp.a((ajdt) this.a.a(), (ajdt) this.a.b, (ajex) new a(this));
            if (a == null) {
                akcr.a();
            }
            return a;
        }
    }

    /* renamed from: wdy$b */
    static final class b extends akcq implements akcb<wau, Integer, Map<String, ? extends String>, Integer, zmy> {
        b(wdy wdy) {
            super(4, wdy);
        }

        public final String getName() {
            return "toViewModel";
        }

        public final akej getOwner() {
            return akde.a(wdy.class);
        }

        public final String getSignature() {
            return "toViewModel(Lcom/snap/search/ranking/ScoredResult;ILjava/util/Map;I)Lcom/snap/ui/recycling/viewmodel/AdapterViewModel;";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            wau wau = (wau) obj;
            int intValue = ((Number) obj2).intValue();
            Map map = (Map) obj3;
            int intValue2 = ((Number) obj4).intValue();
            akcr.b(wau, "p1");
            akcr.b(map, "p3");
            wdy wdy = (wdy) this.receiver;
            vzo vzo = wau.c;
            if (vzo == null) {
                akcr.a();
            }
            return wbm.a(vzo, new wbo(intValue, intValue2, wdy.f));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(wdy.class), "viewModelSource", "getViewModelSource()Lio/reactivex/Observable;");
    }

    public wdy(Context context, wbm wbm, ajdp<List<vzo>> ajdp, ajdp<vzu> ajdp2) {
        akcr.b(context, "context");
        akcr.b(wbm, "viewModelConverter");
        akcr.b(ajdp, "source");
        akcr.b(ajdp2, "normalizedSearchQuery");
        super(25);
        this.e = wbm;
        this.c = ajdp;
        this.g = ajdp2;
        this.a = context.getResources();
        Object i = ajwl.i(Integer.valueOf(4));
        akcr.a(i, "BehaviorSubject.createDe…TIAL_DISPLAY_ITEMS_LIMIT)");
        this.b = i;
    }

    public final ajdp<vzx> a() {
        Object u = this.g.u(new a(this));
        akcr.a(u, "normalizedSearchQuery.sw…}\n            }\n        }");
        return u;
    }

    public final ajdp<znh<zmy>> b() {
        return (ajdp) this.d.b();
    }

    @akqq
    public final void onViewMoreEvent(wcx wcx) {
        akcr.b(wcx, "viewMoreEvent");
        if (wcx.a == this.f) {
            ajwl ajwl = this.b;
            Object p = ajwl.p();
            if (p == null) {
                akcr.a();
            }
            ajwl.a(Integer.valueOf(((Number) p).intValue() + 4));
        }
    }
}
