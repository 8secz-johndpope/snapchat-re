package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.LegacySearchQueries.Friend;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: wdx */
public final class wdx extends vzb {
    final Resources a;
    final ihh b;
    final ajdp<List<Friend>> c;
    final wal d;
    final ajdp<Map<String, String>> e;
    private final ajwl<Integer> g;
    private final ajdp<vzu> h;

    /* renamed from: wdx$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ wdx a;

        /* renamed from: wdx$a$a */
        public static final class a<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
            private /* synthetic */ a a;
            private /* synthetic */ vzu b;

            public a(a aVar, vzu vzu) {
                this.a = aVar;
                this.b = vzu;
            }

            public final R apply(T1 t1, T2 t2, T3 t3) {
                Map map = (Map) t3;
                Map map2 = (Map) t2;
                List list = (List) t1;
                List arrayList = new ArrayList();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Friend friend = (Friend) list.get(i);
                    Object obj = (friend.snapProId() != null || friend.isOfficial() || friend.isPopular()) ? 1 : null;
                    if (obj == null || friend.friendLinkType() == FriendLinkType.MUTUAL) {
                        if (map.containsKey(friend.username())) {
                            wak wak = (wak) map.get(friend.username());
                            if (wak != null) {
                                if (wak.c != 0) {
                                }
                            }
                        }
                        arrayList.add(friend);
                    }
                }
                return new vzx(this.b.a, wdx.a(this.a.a, arrayList, this.b.b, map2));
            }
        }

        a(wdx wdx) {
            this.a = wdx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            vzu vzu = (vzu) obj;
            akcr.b(vzu, "normalizedQuery");
            if ((((CharSequence) vzu.b).length() == 0 ? 1 : null) != null) {
                return ajdp.b(new vzx(vzu.a, ajyw.a));
            }
            ajdp a = ajdp.a((ajdt) this.a.c, (ajdt) this.a.e, (ajdt) this.a.d.a(), (ajfd) new a(this, vzu));
            if (a == null) {
                akcr.a();
            }
            return a;
        }
    }

    /* renamed from: wdx$c */
    public static final class c<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
        private /* synthetic */ wdx a;

        public c(wdx wdx) {
            this.a = wdx;
        }

        public final R apply(T1 t1, T2 t2, T3 t3) {
            Map map = (Map) t3;
            Object obj = (Integer) t2;
            vzx vzx = (vzx) t1;
            if (vzx.b.isEmpty()) {
                return znk.a((List) ajyw.a);
            }
            wdx wdx = this.a;
            List list = vzx.b;
            if (list != null) {
                akcr.a(obj, "limit");
                int intValue = obj.intValue();
                Object string = wdx.a.getString(R.string.search_my_friends_section);
                akcr.a(string, "resources.getString(R.st…earch_my_friends_section)");
                return wds.a(list, intValue, string, wdx.f, map, new b(wdx));
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.collections.List<com.snap.search.ranking.ScoredResult>");
        }
    }

    /* renamed from: wdx$b */
    static final class b extends akcq implements akcb<wau, Integer, Map<String, ? extends String>, Integer, zmy> {
        b(wdx wdx) {
            super(4, wdx);
        }

        public final String getName() {
            return "toViewModel";
        }

        public final akej getOwner() {
            return akde.a(wdx.class);
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
            wdx wdx = (wdx) this.receiver;
            Friend friend = wau.a;
            if (friend == null) {
                akcr.a();
            }
            return new wfz(friend, intValue, new vzv(String.valueOf(intValue2), "user_#".concat(String.valueOf(intValue2)), wdx.f), wdx.b, map);
        }
    }

    public wdx(Context context, ihh ihh, ajdp<List<Friend>> ajdp, ajdp<vzu> ajdp2, wal wal, ajdp<Map<String, String>> ajdp3) {
        akcr.b(context, "context");
        akcr.b(ihh, "clock");
        akcr.b(ajdp, "source");
        akcr.b(ajdp2, "normalizedSearchQuery");
        akcr.b(wal, "friendingManager");
        akcr.b(ajdp3, "friendmojiMapObservable");
        super(24);
        this.b = ihh;
        this.c = ajdp;
        this.h = ajdp2;
        this.d = wal;
        this.e = ajdp3;
        this.a = context.getResources();
        Object i = ajwl.i(Integer.valueOf(10));
        akcr.a(i, "BehaviorSubject.createDe…TIAL_DISPLAY_ITEMS_LIMIT)");
        this.g = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0014 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c5  */
    public static final /* synthetic */ java.util.List a(defpackage.wdx r21, java.util.List r22, java.lang.String r23, java.util.Map r24) {
        /*
        r0 = r23;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = defpackage.abqc.a(r23);
        r3 = new jjj;
        r3.<init>();
        r3 = r22.iterator();
    L_0x0014:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x00d6;
    L_0x001a:
        r4 = r3.next();
        r7 = r4;
        r7 = (com.snap.core.db.query.LegacySearchQueries.Friend) r7;
        r4 = r7.username();
        r5 = "friend.username()";
        defpackage.akcr.a(r4, r5);
        r5 = r7.displayName();
        r4 = defpackage.vxf.a(r4, r5);
        r4 = defpackage.vxf.a(r0, r4);
        r5 = -1;
        if (r4 != r5) goto L_0x00be;
    L_0x0039:
        if (r2 == 0) goto L_0x00be;
    L_0x003b:
        r6 = r7.friendmojiCategories();
        r8 = 0;
        if (r6 == 0) goto L_0x00a9;
    L_0x0042:
        r9 = "it";
        defpackage.akcr.a(r6, r9);
        r6 = (java.lang.CharSequence) r6;
        r9 = ",";
        r9 = new java.lang.String[]{r9};
        r10 = 6;
        r6 = defpackage.akgc.a(r6, r9, r8, r10);
        r6 = (java.lang.Iterable) r6;
        r9 = new java.util.ArrayList;
        r10 = 10;
        r10 = defpackage.ajyn.a(r6, r10);
        r9.<init>(r10);
        r9 = (java.util.Collection) r9;
        r6 = r6.iterator();
    L_0x0067:
        r10 = r6.hasNext();
        if (r10 == 0) goto L_0x007f;
    L_0x006d:
        r10 = r6.next();
        r10 = (java.lang.String) r10;
        r12 = r24;
        r10 = r12.get(r10);
        r10 = (java.lang.String) r10;
        r9.add(r10);
        goto L_0x0067;
    L_0x007f:
        r12 = r24;
        r9 = (java.util.List) r9;
        r13 = r9;
        r13 = (java.lang.Iterable) r13;
        r6 = "";
        r14 = r6;
        r14 = (java.lang.CharSequence) r14;
        r6 = r7.birthday();
        r11 = r21;
        r9 = r11.b;
        r6 = defpackage.jjj.a(r6, r9);
        r15 = r6;
        r15 = (java.lang.CharSequence) r15;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 60;
        r6 = defpackage.ajyu.a(r13, r14, r15, r16, r17, r18, r19, r20);
        goto L_0x00ae;
    L_0x00a9:
        r11 = r21;
        r12 = r24;
        r6 = 0;
    L_0x00ae:
        if (r6 == 0) goto L_0x00b9;
    L_0x00b0:
        r6 = (java.lang.CharSequence) r6;
        r8 = r0;
        r8 = (java.lang.CharSequence) r8;
        r8 = defpackage.akgc.c(r6, r8);
    L_0x00b9:
        if (r8 == 0) goto L_0x00c2;
    L_0x00bb:
        r4 = 4;
        r6 = 4;
        goto L_0x00c3;
    L_0x00be:
        r11 = r21;
        r12 = r24;
    L_0x00c2:
        r6 = r4;
    L_0x00c3:
        if (r6 == r5) goto L_0x0014;
    L_0x00c5:
        r4 = new wau;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r13 = 28;
        r5 = r4;
        r11 = r13;
        r5.<init>(r6, r7, r8, r9, r10, r11);
        r1.add(r4);
        goto L_0x0014;
    L_0x00d6:
        r1 = (java.util.List) r1;
        defpackage.ajyq.c(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdx.a(wdx, java.util.List, java.lang.String, java.util.Map):java.util.List");
    }

    public final ajdp<vzx> a() {
        Object u = this.h.u(new a(this));
        akcr.a(u, "normalizedSearchQuery.sw…}\n            }\n        }");
        return u;
    }

    public final ajdp<znh<zmy>> b() {
        ajdp a = ajdp.a((ajdt) a(), (ajdt) this.g, (ajdt) this.e, (ajfd) new c(this));
        if (a == null) {
            akcr.a();
        }
        return a;
    }

    @akqq
    public final void onViewMoreEvent(wcx wcx) {
        akcr.b(wcx, "viewMoreEvent");
        if (wcx.a == this.f) {
            ajwl ajwl = this.g;
            Object p = ajwl.p();
            if (p == null) {
                akcr.a();
            }
            ajwl.a(Integer.valueOf(((Number) p).intValue() + 10));
        }
    }
}
