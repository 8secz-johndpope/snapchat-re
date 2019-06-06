package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: wdv */
public final class wdv extends vzb {
    final Resources a;
    final ajwl<Integer> b;
    final ajdp<List<vzq>> c;
    private final ajxe d = ajxh.a(new c(this));
    private final wbm e;
    private final ajdp<vzu> g;

    /* renamed from: wdv$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ wdv a;

        a(wdv wdv) {
            this.a = wdv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final vzu vzu = (vzu) obj;
            akcr.b(vzu, "normalizedQuery");
            return (((CharSequence) vzu.b).length() == 0 ? 1 : null) != null ? ajdp.b(new vzx(vzu.a, ajyw.a)) : this.a.c.p(new ajfc<T, R>(this) {
                private /* synthetic */ a a;

                public final /* synthetic */ Object apply(Object obj) {
                    List<vzq> list = (List) obj;
                    akcr.b(list, "it");
                    String str = vzu.b;
                    ArrayList arrayList = new ArrayList();
                    for (vzq vzq : list) {
                        if (vzq.b != null) {
                            Object a = vxg.a(vzq.b);
                            akcr.a(a, "SearchTextUtil.makeSearc…e(groupStory.displayName)");
                            int a2 = vxf.a(str, ajyl.a(a));
                            if (a2 != -1) {
                                arrayList.add(new wau(a2, null, null, null, vzq, 14));
                            }
                        }
                    }
                    List list2 = arrayList;
                    ajyq.c(list2);
                    return new vzx(vzu.a, list2);
                }
            });
        }
    }

    /* renamed from: wdv$c */
    static final class c extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ wdv a;

        /* renamed from: wdv$c$a */
        public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
            private /* synthetic */ c a;

            public a(c cVar) {
                this.a = cVar;
            }

            public final R apply(T1 t1, T2 t2) {
                Object obj = (Integer) t2;
                vzx vzx = (vzx) t1;
                if (vzx.b.isEmpty()) {
                    return znk.a((List) ajyw.a);
                }
                wdv wdv = this.a.a;
                List list = vzx.b;
                if (list != null) {
                    akcr.a(obj, "limit");
                    int intValue = obj.intValue();
                    Object string = wdv.a.getString(R.string.search_group_stories_section);
                    akcr.a(string, "resources.getString(R.st…ch_group_stories_section)");
                    return wds.a(list, intValue, string, wdv.f, ajyx.a, new b(wdv));
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.collections.List<com.snap.search.ranking.ScoredResult>");
            }
        }

        c(wdv wdv) {
            this.a = wdv;
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

    /* renamed from: wdv$b */
    static final class b extends akcq implements akcb<wau, Integer, Map<String, ? extends String>, Integer, zmy> {
        b(wdv wdv) {
            super(4, wdv);
        }

        public final String getName() {
            return "toViewModel";
        }

        public final akej getOwner() {
            return akde.a(wdv.class);
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
            wdv wdv = (wdv) this.receiver;
            vzq vzq = wau.d;
            if (vzq == null) {
                akcr.a();
            }
            return wbm.a(vzq, new wbo(intValue, intValue2, wdv.f));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(wdv.class), "viewModelSource", "getViewModelSource()Lio/reactivex/Observable;");
    }

    public wdv(Context context, wbm wbm, ajdp<List<vzq>> ajdp, ajdp<vzu> ajdp2) {
        akcr.b(context, "context");
        akcr.b(wbm, "viewModelConverter");
        akcr.b(ajdp, "source");
        akcr.b(ajdp2, "normalizedSearchQuery");
        super(45);
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
        akcr.a(u, "normalizedSearchQuery.sw…\n\n            }\n        }");
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
