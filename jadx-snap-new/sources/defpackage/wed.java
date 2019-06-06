package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.LegacySearchQueries.Friend;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: wed */
public final class wed extends vzb {
    final Resources a = this.c.getResources();
    final ajwl<Integer> b;
    final Context c;
    final ajdp<Map<String, wak>> d;
    private final ajxe e;
    private final ajxe g;
    private wbm h;

    /* renamed from: wed$a */
    static final class a extends akcs implements akbk<ajdp<vzx>> {
        final /* synthetic */ wed a;
        final /* synthetic */ int b = 26;
        private /* synthetic */ ajdp c;
        private /* synthetic */ ajdp d;
        private /* synthetic */ ajdp e;
        private /* synthetic */ ajdp f;

        /* renamed from: wed$a$a */
        public static final class a<T1, T2, T3, T4, T5, R> implements ajff<T1, T2, T3, T4, T5, R> {
            private /* synthetic */ a a;

            public a(a aVar) {
                this.a = aVar;
            }

            public final R a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                List list = (List) t5;
                Map map = (Map) t4;
                wbk wbk = (wbk) t3;
                List list2 = (List) t2;
                vzu vzu = (vzu) t1;
                if ((((CharSequence) vzu.b).length() == 0 ? 1 : null) != null || (akcr.a(wbk.a.b, vzu.a.b) ^ 1) != 0) {
                    return new vzx(vzu.a, ajyw.a);
                }
                Object obj;
                waa waa;
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    Friend friend = (Friend) next;
                    obj = (friend.snapProId() == null || friend.friendLinkType() != FriendLinkType.FOLLOWING) ? null : 1;
                    if (obj != null) {
                        arrayList.add(next);
                    }
                }
                Iterable<Friend> iterable = (List) arrayList;
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (Friend userId : iterable) {
                    arrayList2.add(userId.userId());
                }
                list = (List) arrayList2;
                list2 = wed.a(list2, vzu.b);
                arrayList = new ArrayList();
                for (Object next2 : wbk.b) {
                    vzk vzk = (vzk) next2;
                    obj = (!(vzk instanceof waa) || list.contains(((waa) vzk).b)) ? null : 1;
                    if (obj != null) {
                        arrayList.add(next2);
                    }
                }
                Collection arrayList3 = new ArrayList();
                for (vzk vzk2 : (List) arrayList) {
                    if (vzk2 != null) {
                        Object obj2;
                        waa = (waa) vzk2;
                        waa a = wbe.a(waa, 26, (wak) map.get(waa.a));
                        if (a != null) {
                            wau wau = new wau(0, null, a, null, null, 26);
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            arrayList3.add(obj2);
                        }
                    } else {
                        throw new ajxt("null cannot be cast to non-null type com.snap.search.framework.SearchSuggestedFriend");
                    }
                }
                List list3 = (List) arrayList3;
                List<wau> h = ajyu.h((Collection) list2);
                h.addAll(list3);
                list3 = new ArrayList();
                Set linkedHashSet = new LinkedHashSet();
                for (wau wau2 : h) {
                    waa = wau2.b;
                    if (!(waa == null || linkedHashSet.contains(waa.a))) {
                        list3.add(wau2);
                        linkedHashSet.add(waa.a);
                    }
                }
                return new vzx(vzu.a, list3);
            }
        }

        /* renamed from: wed$a$b */
        static final class b<T> implements ajfb<vzu> {
            private /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a.b.a(Integer.valueOf(3));
            }
        }

        a(wed wed, ajdp ajdp, ajdp ajdp2, ajdp ajdp3, ajdp ajdp4) {
            this.a = wed;
            this.c = ajdp;
            this.d = ajdp2;
            this.e = ajdp3;
            this.f = ajdp4;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object d = this.c.d((ajfb) new b(this));
            akcr.a(d, "newQueryObservable");
            ajdp a = ajdp.a((ajdt) d, this.d, this.e, this.a.d, this.f, new a(this));
            if (a == null) {
                akcr.a();
            }
            return a;
        }
    }

    /* renamed from: wed$c */
    static final class c extends akcs implements akbk<ajdp<znh<zmy>>> {
        final /* synthetic */ wed a;

        /* renamed from: wed$c$a */
        public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
            private /* synthetic */ c a;

            public a(c cVar) {
                this.a = cVar;
            }

            public final R apply(T1 t1, T2 t2) {
                Object obj = (Integer) t2;
                vzx vzx = (vzx) t1;
                wed wed = this.a.a;
                List list = vzx.b;
                if (list != null) {
                    akcr.a(obj, "limit");
                    int intValue = obj.intValue();
                    Object string = wed.a.getString(R.string.search_suggested_friends_section);
                    akcr.a(string, "resources.getString(R.st…uggested_friends_section)");
                    return wds.a(list, intValue, string, wed.f, ajyx.a, new b(wed));
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.collections.List<com.snap.search.ranking.ScoredResult>");
            }
        }

        c(wed wed) {
            this.a = wed;
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

    /* renamed from: wed$b */
    static final class b extends akcq implements akcb<wau, Integer, Map<String, ? extends String>, Integer, wgv> {
        b(wed wed) {
            super(4, wed);
        }

        public final String getName() {
            return "toViewModel";
        }

        public final akej getOwner() {
            return akde.a(wed.class);
        }

        public final String getSignature() {
            return "toViewModel(Lcom/snap/search/ranking/ScoredResult;ILjava/util/Map;I)Lcom/snap/search/ui/viewmodel/SearchSuggestedFriendViewModel;";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            wau wau = (wau) obj;
            int intValue = ((Number) obj2).intValue();
            Map map = (Map) obj3;
            int intValue2 = ((Number) obj4).intValue();
            akcr.b(wau, "p1");
            akcr.b(map, "p3");
            wed wed = (wed) this.receiver;
            waa waa = wau.b;
            if (waa == null) {
                akcr.a();
            }
            return wbm.a(waa, new wbo(intValue, intValue2, wed.f), wed.c);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(wed.class), "currentQueryToDataModels", "getCurrentQueryToDataModels()Lio/reactivex/Observable;"), new akdc(akde.a(wed.class), "viewModelSource", "getViewModelSource()Lio/reactivex/Observable;")};
    }

    public wed(Context context, wbm wbm, ajdp<List<waa>> ajdp, ajdp<wbk> ajdp2, ajdp<List<Friend>> ajdp3, ajdp<vzu> ajdp4, ajdp<Map<String, wak>> ajdp5) {
        akcr.b(context, "context");
        akcr.b(wbm, "viewModelConverter");
        akcr.b(ajdp, "localDataSource");
        akcr.b(ajdp2, "remoteDataSource");
        akcr.b(ajdp3, "friendsDataSource");
        akcr.b(ajdp4, "normalizedSearchQuery");
        akcr.b(ajdp5, "friendInfo");
        super(26);
        this.c = context;
        this.h = wbm;
        this.d = ajdp5;
        Object i = ajwl.i(Integer.valueOf(3));
        akcr.a(i, "BehaviorSubject.createDe…TIAL_DISPLAY_ITEMS_LIMIT)");
        this.b = i;
        this.e = ajxh.a(new a(this, ajdp4, ajdp, ajdp2, ajdp3));
        this.g = ajxh.a(new c(this));
    }

    public static final /* synthetic */ List a(List list, String str) {
        ArrayList arrayList = new ArrayList();
        for (waa waa : list) {
            int a = vxf.a(str, vxf.a(waa.a, waa.c));
            if (a != -1) {
                arrayList.add(new wau(a, null, waa, null, null, 26));
            }
        }
        List list2 = arrayList;
        ajyq.c(list2);
        return list2;
    }

    public final ajdp<vzx> a() {
        return (ajdp) this.e.b();
    }

    public final ajdp<znh<zmy>> b() {
        return (ajdp) this.g.b();
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
            ajwl.a(Integer.valueOf(((Number) p).intValue() + 10));
        }
    }
}
