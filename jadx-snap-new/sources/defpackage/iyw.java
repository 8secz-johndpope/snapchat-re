package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.query.LegacyAddedMeFriendsQueries;
import com.snap.identity.job.UpdateSeenAddedMeDurableJob;
import com.snap.identity.ui.AddFriendsTakeOverFeedFragment;
import defpackage.ixk.i;
import defpackage.ixk.j;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: iyw */
public final class iyw implements iqy {
    static final long h = TimeUnit.DAYS.toMillis(3);
    public final ajwy<ftl> a;
    final ajwy<ixk> b;
    final ajwy<iqm> c;
    final ajwy<gpb> d;
    public final ajwy<jkd> e;
    final ajwy<isa> f;
    final ajwy<ira> g;
    private final zfw i = zgb.a(irc.t.callsite("FriendingClient"));
    private final ajxe j = ajxh.a(new j(this));
    private final ajxe k = ajxh.a(new e(this));
    private final ajwy<tnj> l;
    private final ajdx<hwl> m;

    /* renamed from: iyw$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: iyw$j */
    static final class j extends akcs implements akbk<isa> {
        private /* synthetic */ iyw a;

        j(iyw iyw) {
            this.a = iyw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (isa) this.a.f.get();
        }
    }

    /* renamed from: iyw$e */
    static final class e extends akcs implements akbk<ira> {
        private /* synthetic */ iyw a;

        e(iyw iyw) {
            this.a = iyw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ira) this.a.g.get();
        }
    }

    /* renamed from: iyw$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ iyw a;

        c(iyw iyw) {
            this.a = iyw;
        }

        public final /* synthetic */ Object call() {
            return (ixk) this.a.b.get();
        }
    }

    /* renamed from: iyw$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ixk ixk = (ixk) obj;
            akcr.b(ixk, "it");
            Object t = ixk.c.t(jic.LAST_SEEN_ADDED_ME_TIMESTAMP);
            akcr.a(t, "configProvider.observeLo…_SEEN_ADDED_ME_TIMESTAMP)");
            DbClient dbClient = ixk.a;
            Object obj2 = LegacyAddedMeFriendsQueries.FACTORY;
            akcr.a(obj2, "LegacyAddedMeFriendsQueries.FACTORY");
            obj2 = obj2.getAddedMeChange();
            akcr.a(obj2, "LegacyAddedMeFriendsQueries.FACTORY.addedMeChange");
            obj = ajdp.a((ajdt) t, (ajdt) dbClient.queryAndMapToList(obj2, new j(LegacyAddedMeFriendsQueries.ADDED_ME_CHANGED_MAPPER)), (ajex) new i(ixk)).b(ixk.b.scheduler()).j(ajfu.a);
            akcr.a(obj, "Observable.combineLatest…  .distinctUntilChanged()");
            return igs.a(obj);
        }
    }

    /* renamed from: iyw$d */
    public static final class d<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
        private /* synthetic */ iyw a;

        public d(iyw iyw) {
            this.a = iyw;
        }

        public final R apply(T1 t1, T2 t2, T3 t3) {
            long longValue = ((Number) t3).longValue();
            int intValue = ((Number) t2).intValue();
            Integer num = (Integer) t1;
            int i = 0;
            if (((num != null && num.intValue() == 1 && longValue < 15) || ((num != null && num.intValue() == 2 && longValue < 30) || (num != null && num.intValue() == 3 && longValue < 150))) && ((ixk) this.a.b.get()).a(System.currentTimeMillis() - iyw.h) <= 6) {
                i = intValue;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: iyw$h */
    static final class h extends akcs implements akcd<List<? extends itm>, Long, Long, Long, Boolean, Boolean, Boolean> {
        private /* synthetic */ iyw a;

        h(iyw iyw) {
            this.a = iyw;
            super(6);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2 A:{SYNTHETIC} */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
        /* JADX WARNING: Missing block: B:37:0x00a5, code skipped:
            if (r9 != null) goto L_0x00a9;
     */
        public final /* synthetic */ java.lang.Object a(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
            /*
            r8 = this;
            r9 = (java.util.List) r9;
            r10 = (java.lang.Number) r10;
            r0 = r10.longValue();
            r11 = (java.lang.Number) r11;
            r10 = r11.longValue();
            r12 = (java.lang.Number) r12;
            r2 = r12.longValue();
            r13 = (java.lang.Boolean) r13;
            r14 = (java.lang.Boolean) r14;
            r12 = "records";
            defpackage.akcr.b(r9, r12);
            r12 = r8.a;
            r12 = r12.b;
            r12 = r12.get();
            r12 = (defpackage.ixk) r12;
            r4 = java.lang.System.currentTimeMillis();
            r6 = defpackage.iyw.h;
            r4 = r4 - r6;
            r12 = r12.a(r4);
            r4 = "isNewUser";
            defpackage.akcr.a(r13, r4);
            r13 = r13.booleanValue();
            r4 = 1;
            r5 = 0;
            if (r13 != 0) goto L_0x004d;
        L_0x003f:
            r13 = "isInChurnUser";
            defpackage.akcr.a(r14, r13);
            r13 = r14.booleanValue();
            if (r13 == 0) goto L_0x004b;
        L_0x004a:
            goto L_0x004d;
        L_0x004b:
            r13 = 0;
            goto L_0x004e;
        L_0x004d:
            r13 = 1;
        L_0x004e:
            r6 = 30;
            r14 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
            if (r14 >= 0) goto L_0x005b;
        L_0x0054:
            if (r13 == 0) goto L_0x0059;
        L_0x0056:
            r13 = 15;
            goto L_0x005c;
        L_0x0059:
            r13 = 6;
            goto L_0x005c;
        L_0x005b:
            r13 = 0;
        L_0x005c:
            r10 = java.lang.Math.max(r10, r2);
            if (r12 >= r13) goto L_0x00a8;
        L_0x0062:
            r9 = (java.lang.Iterable) r9;
            r12 = r9 instanceof java.util.Collection;
            if (r12 == 0) goto L_0x0071;
        L_0x0068:
            r12 = r9;
            r12 = (java.util.Collection) r12;
            r12 = r12.isEmpty();
            if (r12 != 0) goto L_0x00a4;
        L_0x0071:
            r9 = r9.iterator();
        L_0x0075:
            r12 = r9.hasNext();
            if (r12 == 0) goto L_0x00a4;
        L_0x007b:
            r12 = r9.next();
            r12 = (defpackage.itm) r12;
            r13 = r12.g;
            r0 = 0;
            if (r13 == 0) goto L_0x008c;
        L_0x0087:
            r13 = r13.longValue();
            goto L_0x008d;
        L_0x008c:
            r13 = r0;
        L_0x008d:
            r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));
            if (r2 != 0) goto L_0x009f;
        L_0x0091:
            r12 = r12.h;
            if (r12 == 0) goto L_0x0099;
        L_0x0095:
            r0 = r12.longValue();
        L_0x0099:
            r12 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
            if (r12 <= 0) goto L_0x009f;
        L_0x009d:
            r12 = 1;
            goto L_0x00a0;
        L_0x009f:
            r12 = 0;
        L_0x00a0:
            if (r12 == 0) goto L_0x0075;
        L_0x00a2:
            r9 = 1;
            goto L_0x00a5;
        L_0x00a4:
            r9 = 0;
        L_0x00a5:
            if (r9 == 0) goto L_0x00a8;
        L_0x00a7:
            goto L_0x00a9;
        L_0x00a8:
            r4 = 0;
        L_0x00a9:
            r9 = java.lang.Boolean.valueOf(r4);
            return r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.iyw$h.a(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: iyw$f */
    static final class f<T> implements ajfb<ajxm<? extends Boolean, ? extends Integer>> {
        private /* synthetic */ iyw a;
        private /* synthetic */ achb b;
        private /* synthetic */ int c;
        private /* synthetic */ boolean d;
        private /* synthetic */ ith e;
        private /* synthetic */ zjw f;

        f(iyw iyw, achb achb, int i, boolean z, ith ith, zjw zjw) {
            this.a = iyw;
            this.b = achb;
            this.c = i;
            this.d = z;
            this.e = ith;
            this.f = zjw;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00aa  */
        /* JADX WARNING: Missing block: B:15:0x006d, code skipped:
            if (r2 != false) goto L_0x006f;
     */
        public final /* synthetic */ void accept(java.lang.Object r10) {
            /*
            r9 = this;
            r10 = (defpackage.ajxm) r10;
            r0 = r10.a;
            r0 = (java.lang.Boolean) r0;
            r10 = r10.b;
            r10 = (java.lang.Integer) r10;
            r1 = r9.b;
            r2 = defpackage.irc.m;
            r2 = (defpackage.achg) r2;
            r1 = r1.a(r2);
            r2 = 0;
            if (r1 == 0) goto L_0x0021;
        L_0x0017:
            r10 = r9.b;
            r0 = defpackage.irc.m;
            r0 = (defpackage.achg) r0;
            r10.a(r0, r2, r2, null);
            return;
        L_0x0021:
            r1 = r9.a;
            r3 = r9.c;
            r4 = r9.d;
            r5 = r9.e;
            r6 = "addFriendsV11Config";
            defpackage.akcr.a(r0, r6);
            r0 = r0.booleanValue();
            r6 = "addedMePostAcceptV2Config";
            defpackage.akcr.a(r10, r6);
            r10 = r10.intValue();
            r6 = r1.d;
            r6 = r6.get();
            r7 = "userAuthStore.get()";
            defpackage.akcr.a(r6, r7);
            r6 = (defpackage.gpb) r6;
            r6 = r6.a();
            r6 = r6.e;
            r7 = 1;
            if (r6 == 0) goto L_0x0053;
        L_0x0051:
            r6 = 1;
            goto L_0x0054;
        L_0x0053:
            r6 = 0;
        L_0x0054:
            r1 = r1.c;
            r1 = r1.get();
            r1 = (defpackage.iqm) r1;
            r1 = r1.d();
            r8 = "<set-?>";
            if (r4 == 0) goto L_0x0068;
        L_0x0064:
            if (r6 == 0) goto L_0x0068;
        L_0x0066:
            if (r1 != 0) goto L_0x006f;
        L_0x0068:
            if (r4 != 0) goto L_0x0080;
        L_0x006a:
            if (r3 != 0) goto L_0x006d;
        L_0x006c:
            r2 = 1;
        L_0x006d:
            if (r2 == 0) goto L_0x0080;
        L_0x006f:
            r1 = new com.snap.identity.ui.profile.AddFriendsFragmentV2;
            r1.<init>();
            defpackage.akcr.b(r5, r8);
            r1.d = r5;
            r1.e = r0;
            r1.f = r10;
            r1 = (com.snap.ui.deck.MainPageFragment) r1;
            goto L_0x008f;
        L_0x0080:
            r10 = new com.snap.identity.ui.profile.ContactsFragment;
            r10.<init>();
            defpackage.akcr.b(r5, r8);
            r10.e = r5;
            r10.f = r0;
            r1 = r10;
            r1 = (com.snap.ui.deck.MainPageFragment) r1;
        L_0x008f:
            r10 = new zjf;
            r0 = defpackage.irc.m;
            r2 = defpackage.acgv.a();
            r3 = defpackage.irc.p;
            r2 = r2.a(r3);
            r2 = r2.a();
            r10.<init>(r0, r1, r2);
            r3 = r9.f;
            r0 = "IdentityFeature.PROFILE_…D_FRIENDS_PRESENT_DEFAULT";
            if (r3 != 0) goto L_0x00b8;
        L_0x00aa:
            r1 = r9.b;
            r10 = (defpackage.achd) r10;
            r2 = defpackage.irc.n;
            defpackage.akcr.a(r2, r0);
            r0 = 0;
            r1.a(r10, r2, r0);
            return;
        L_0x00b8:
            r4 = defpackage.dnh.a;
            r5 = 1;
            r1 = new acip;
            r2 = r9.b;
            r10 = (defpackage.achd) r10;
            r6 = defpackage.irc.n;
            defpackage.akcr.a(r6, r0);
            r1.<init>(r2, r10, r6);
            r6 = r1;
            r6 = (defpackage.acig) r6;
            r7 = 0;
            r8 = 8;
            defpackage.zjw.a(r3, r4, r5, r6, r7, r8);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.iyw$f.accept(java.lang.Object):void");
        }
    }

    /* renamed from: iyw$g */
    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: iyw$i */
    static final class i<T, R> implements ajfc<hwl, ajdb> {
        private /* synthetic */ long a;

        i(long j) {
            this.a = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            hwl hwl = (hwl) obj;
            akcr.b(hwl, "it");
            return hwl.a((hwg) new UpdateSeenAddedMeDurableJob(new iyc(this.a)));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(iyw.class), "userSegmentApi", "getUserSegmentApi()Lcom/snap/identity/api/UserSegmentApi;"), new akdc(akde.a(iyw.class), "identityApi", "getIdentityApi()Lcom/snap/identity/api/IdentityApi;")};
        a aVar = new a();
    }

    public iyw(ajwy<tnj> ajwy, ajwy<ftl> ajwy2, ajwy<ixk> ajwy3, ajdx<hwl> ajdx, ajwy<iqm> ajwy4, ajwy<gpb> ajwy5, ajwy<jkd> ajwy6, ajwy<isa> ajwy7, ajwy<ira> ajwy8, zgb zgb) {
        akcr.b(ajwy, "prefs");
        akcr.b(ajwy2, "configProvider");
        akcr.b(ajwy3, "friendsWhoAddedMeRepository");
        akcr.b(ajdx, "durableJobManager");
        akcr.b(ajwy4, "contactApi");
        akcr.b(ajwy5, "userAuthStore");
        akcr.b(ajwy6, "dataProvider");
        akcr.b(ajwy7, "userSegmentApiProvider");
        akcr.b(ajwy8, "identityApiProvider");
        akcr.b(zgb, "schedulersProvider");
        this.l = ajwy;
        this.a = ajwy2;
        this.b = ajwy3;
        this.m = ajdx;
        this.c = ajwy4;
        this.d = ajwy5;
        this.e = ajwy6;
        this.f = ajwy7;
        this.g = ajwy8;
    }

    private final isa g() {
        return (isa) this.j.b();
    }

    public final long a() {
        return ((ftl) this.a.get()).h(jic.LAST_SEEN_ADDED_ME_TIMESTAMP);
    }

    public final void a(long j) {
        if (j > c()) {
            ((tnj) this.l.get()).b().a((fth) jic.LAST_SEEN_ADDED_ME_TAKE_OVER_TIMESTAMP, Long.valueOf(j)).b();
        }
    }

    public final void a(long j, boolean z) {
        if (j > a()) {
            ((tnj) this.l.get()).b().a((fth) jic.LAST_SEEN_ADDED_ME_TIMESTAMP, Long.valueOf(j)).b();
            if (z) {
                Object e = this.m.e((ajfc) new i(j));
                akcr.a(e, "durableJobManager.flatMa…oke(timestamp))\n        }");
                e.e();
            }
        }
    }

    public final void a(achb<zjm, zjk> achb) {
        akcr.b(achb, "navigationHost");
        achd zjf = new zjf(irc.q, new AddFriendsTakeOverFeedFragment(), acgv.a().a(irc.s).a());
        Object obj = irc.r;
        akcr.a(obj, "IdentityFeature.PROFILE_…TAKE_OVER_PRESENT_DEFAULT");
        achb.b((acig) new acip(achb, zjf, obj));
    }

    public final void a(achb<zjm, zjk> achb, int i, boolean z, ith ith, zjw zjw) {
        akcr.b(achb, "navigationHost");
        akcr.b(ith, "source");
        Object p = ((ftl) this.a.get()).p(jic.IS_ADD_FRIENDS_V11);
        akcr.a(p, "configProvider.get().obs…onKey.IS_ADD_FRIENDS_V11)");
        Object s = ((ftl) this.a.get()).s(jic.ADDED_ME_POST_ACCEPT_V2_TYPE);
        akcr.a(s, "configProvider.get().obs…D_ME_POST_ACCEPT_V2_TYPE)");
        akcr.a(ajwa.a(p, s).e().b((ajdw) this.i.h()).a((ajdw) this.i.l()).a((ajfb) new f(this, achb, i, z, ith, zjw), (ajfb) g.a), "Observables.combineLates…h Friending Fragment\") })");
    }

    public final ajdp<Integer> b() {
        Object c = ajdx.c((Callable) new c(this));
        akcr.a(c, "Single.fromCallable { fr…AddedMeRepository.get() }");
        c = c.d((ajfc) b.a);
        akcr.a(c, "single.flatMapObservable…it.unseenAddedMeCount() }");
        return c;
    }

    public final long c() {
        return ((ftl) this.a.get()).h(jic.LAST_SEEN_ADDED_ME_TAKE_OVER_TIMESTAMP);
    }

    public final void d() {
        ((tnj) this.l.get()).b().a((fth) jic.LAST_TIME_TO_SEE_RESURRECTION_ADDED_ME_TIMESTAMP, Long.valueOf(System.currentTimeMillis() + iyx.a)).b();
    }

    public final ajdp<Boolean> e() {
        ajdp c = ((jkd) this.e.get()).c();
        ajdp e = ((jkd) this.e.get()).e();
        Object t = ((ftl) this.a.get()).t(jic.LAST_SEEN_ADDED_ME_TAKE_OVER_TIMESTAMP);
        akcr.a(t, "configProvider.get().obs…D_ME_TAKE_OVER_TIMESTAMP)");
        Object t2 = ((ftl) this.a.get()).t(jic.LAST_SEEN_ADDED_ME_TIMESTAMP);
        akcr.a(t2, "configProvider.get().obs…_SEEN_ADDED_ME_TIMESTAMP)");
        Object i = g().a().i();
        akcr.a(i, "userSegmentApi.isInNewUserSegment().toObservable()");
        Object i2 = g().b().i();
        akcr.a(i2, "userSegmentApi.isInChurn…rSegment().toObservable()");
        Object j = igs.a(c, e, t, t2, i, i2, this.i.i(), new h(this)).j(ajfu.a);
        akcr.a(j, "combineLatestOnScheduler… }.distinctUntilChanged()");
        return j;
    }

    public final ajdp<Integer> f() {
        return ((ixk) this.b.get()).c();
    }
}
