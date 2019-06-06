package defpackage;

import android.content.res.Resources;
import com.snapchat.android.R;
import defpackage.oby.c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: oca */
public final class oca extends vzb {
    final Resources a;
    final oby b;
    final acsk c;
    final obq d;
    private final ajwl<Integer> e;
    private final ajdp<vzu> g;
    private final ajdp<Map<String, String>> h;

    /* renamed from: oca$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ oca a;

        a(oca oca) {
            this.a = oca;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final vzu vzu = (vzu) obj;
            akcr.b(vzu, "normalizedQuery");
            oby oby = this.a.b;
            String str = vzu.b;
            akcr.b(str, "normalizedQueryText");
            Object b = ajdp.b((Callable) new c(oby, str)).b((ajdw) oby.a.f());
            akcr.a(b, "Observable.fromCallable …scribeOn(schedulers.io())");
            return b.p(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    akcr.b(list, "it");
                    return new vzx(vzu.a, list);
                }
            });
        }
    }

    /* renamed from: oca$b */
    public static final class b<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
        private /* synthetic */ oca a;

        public b(oca oca) {
            this.a = oca;
        }

        public final R apply(T1 t1, T2 t2, T3 t3) {
            Map map = (Map) t3;
            Object obj = (Integer) t2;
            vzx vzx = (vzx) t1;
            if (vzx.b.isEmpty()) {
                return znk.a((List) ajyw.a);
            }
            oca oca = this.a;
            List list = vzx.b;
            if (list != null) {
                akcr.a(obj, "limit");
                int intValue = obj.intValue();
                Object string = oca.a.getString(R.string.nyc_map_search_headline_friends_on_map);
                akcr.a(string, "resources.getString(R.st…_headline_friends_on_map)");
                return wds.a(list, intValue, string, oca.f, map, new c(oca));
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.collections.List<kotlin.Pair<com.snap.map.core.MapFriendStory, snapchat.map.nano.FriendLocation>>");
        }
    }

    /* renamed from: oca$c */
    static final class c extends akcq implements akcb<ajxm<? extends njx, ? extends alhq>, Integer, Map<String, ? extends String>, Integer, zmy> {
        c(oca oca) {
            super(4, oca);
        }

        public final String getName() {
            return "toViewModel";
        }

        public final akej getOwner() {
            return akde.a(oca.class);
        }

        public final String getSignature() {
            return "toViewModel(Lkotlin/Pair;ILjava/util/Map;I)Lcom/snap/ui/recycling/viewmodel/AdapterViewModel;";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            ajxm ajxm = (ajxm) obj;
            int intValue = ((Number) obj2).intValue();
            Map map = (Map) obj3;
            int intValue2 = ((Number) obj4).intValue();
            akcr.b(ajxm, "p1");
            akcr.b(map, "p3");
            oca oca = (oca) this.receiver;
            return new oce((njx) ajxm.a, (alhq) ajxm.b, ((njx) ajxm.a).a(), intValue, new vzv(String.valueOf(intValue2), "user_#".concat(String.valueOf(intValue2)), oca.f), oca.c, oca.d);
        }
    }

    public oca(Resources resources, oby oby, ajdp<vzu> ajdp, ajdp<Map<String, String>> ajdp2, acsk acsk, int i, obq obq) {
        akcr.b(resources, "resources");
        akcr.b(oby, "mapSearchDataProvider");
        akcr.b(ajdp, "normalizedSearchQuery");
        akcr.b(ajdp2, "friendmojiMap");
        akcr.b(acsk, "mapPlaybackManager");
        akcr.b(obq, "mapSearchCallback");
        super(i);
        this.a = resources;
        this.b = oby;
        this.g = ajdp;
        this.h = ajdp2;
        this.c = acsk;
        this.d = obq;
        Object i2 = ajwl.i(Integer.valueOf(3));
        akcr.a(i2, "BehaviorSubject.createDe…TIAL_DISPLAY_ITEMS_LIMIT)");
        this.e = i2;
    }

    public final ajdp<vzx> a() {
        Object u = this.g.u(new a(this));
        akcr.a(u, "normalizedSearchQuery.sw…)\n            }\n        }");
        return u;
    }

    public final ajdp<znh<zmy>> b() {
        ajdp a = ajdp.a((ajdt) a(), (ajdt) this.e, (ajdt) this.h, (ajfd) new b(this));
        if (a == null) {
            akcr.a();
        }
        return a;
    }

    @akqq
    public final void onViewMoreEvent(wcx wcx) {
        akcr.b(wcx, "viewMoreEvent");
        if (wcx.a == this.f) {
            ajwl ajwl = this.e;
            Object p = ajwl.p();
            if (p == null) {
                akcr.a();
            }
            ajwl.a(Integer.valueOf(((Number) p).intValue() + 10));
        }
    }
}
