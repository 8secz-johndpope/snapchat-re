package defpackage;

import com.google.common.base.Optional;
import com.snap.core.db.column.FriendLinkType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: yii */
public final class yii implements yhw {
    final Map<String, Long> a = new LinkedHashMap();
    final iqw b;
    final yhz c;
    final ihh d;
    private final zfw e = zgb.a(yhy.j.callsite("PublicUserStorySyncerImpl"));

    /* renamed from: yii$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ yii a;
        private /* synthetic */ List b;

        a(yii yii, List list) {
            this.a = yii;
            this.b = list;
        }

        public final /* synthetic */ Object call() {
            return this.a.b.b(this.b);
        }
    }

    /* renamed from: yii$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ List a;

        b(List list) {
            this.a = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            akcr.b(map, "friendLinkMap");
            Iterable<String> iterable = this.a;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (String str : iterable) {
                arrayList.add(new ajxm(str, Optional.fromNullable(map.get(str))));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: yii$c */
    static final class c<T, R> implements ajfc<T, Iterable<? extends U>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return list;
        }
    }

    /* renamed from: yii$d */
    static final class d<T, R> implements ajfc<ajxm<? extends String, ? extends Optional<FriendLinkType>>, ajdb> {
        private /* synthetic */ yii a;

        d(yii yii) {
            this.a = yii;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
        /* JADX WARNING: Missing block: B:8:0x0040, code skipped:
            if ((r2 - ((java.lang.Number) r7).longValue()) > 300000) goto L_0x0042;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r7) {
            /*
            r6 = this;
            r7 = (defpackage.ajxm) r7;
            r0 = "<name for destructuring parameter 0>";
            defpackage.akcr.b(r7, r0);
            r0 = r7.a;
            r0 = (java.lang.String) r0;
            r7 = r7.b;
            r7 = (com.google.common.base.Optional) r7;
            r1 = r6.a;
            r7 = r7.orNull();
            r7 = (com.snap.core.db.column.FriendLinkType) r7;
            r2 = com.snap.core.db.column.FriendLinkType.MUTUAL;
            if (r7 == r2) goto L_0x0044;
        L_0x001b:
            r7 = r1.a;
            r7 = r7.containsKey(r0);
            if (r7 == 0) goto L_0x0042;
        L_0x0023:
            r7 = r1.d;
            r2 = r7.a();
            r7 = r1.a;
            r7 = r7.get(r0);
            if (r7 != 0) goto L_0x0034;
        L_0x0031:
            defpackage.akcr.a();
        L_0x0034:
            r7 = (java.lang.Number) r7;
            r4 = r7.longValue();
            r2 = r2 - r4;
            r4 = 300000; // 0x493e0 float:4.2039E-40 double:1.482197E-318;
            r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r7 <= 0) goto L_0x0044;
        L_0x0042:
            r7 = 1;
            goto L_0x0045;
        L_0x0044:
            r7 = 0;
        L_0x0045:
            if (r7 == 0) goto L_0x0070;
        L_0x0047:
            r7 = r6.a;
            r7 = r7.a;
            r1 = r6.a;
            r1 = r1.d;
            r1 = r1.a();
            r1 = java.lang.Long.valueOf(r1);
            r7.put(r0, r1);
            r7 = r6.a;
            r7 = r7.c;
            r7 = r7.a(r0);
            r1 = new yii$d$1;
            r1.<init>(r0);
            r1 = (defpackage.ajev) r1;
            r7 = r7.b(r1);
        L_0x006d:
            r7 = (defpackage.ajdb) r7;
            return r7;
        L_0x0070:
            r7 = defpackage.ajhn.a;
            r7 = defpackage.ajvo.a(r7);
            goto L_0x006d;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yii$d.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: yii$e */
    static final class e<T> implements ajfb<Throwable> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public yii(iqw iqw, yhz yhz, ihh ihh, zgb zgb) {
        akcr.b(iqw, "friendApi");
        akcr.b(yhz, "storiesNetworkApi");
        akcr.b(ihh, "clock");
        akcr.b(zgb, "schedulersProvider");
        this.b = iqw;
        this.c = yhz;
        this.d = ihh;
    }

    public final ajcx a(List<String> list) {
        akcr.b(list, "usernames");
        if ((list.isEmpty() ^ 1) != 0) {
            Object a = ajdp.b((Callable) new a(this, list)).p(new b(list)).l(c.a).a((ajdw) this.e.g()).b((ajdw) this.e.i()).a((ajfc) new d(this), false).a((ajfb) e.a).a(ajfu.g);
            akcr.a(a, "Observable.fromCallable …       .onErrorComplete()");
            return a;
        }
        throw new IllegalStateException("Must provide non-empty list of users to sync public user stories!".toString());
    }
}
