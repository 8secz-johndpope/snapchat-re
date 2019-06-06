package defpackage;

import com.snap.core.db.record.SnapTokenModel;
import com.snap.core.db.record.TalkAuthContextModel;
import com.snap.security.snaptoken.SnapTokenHttpInterface;
import defpackage.wiy.a;
import defpackage.wiy.b;
import defpackage.wiy.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

/* renamed from: wiw */
public final class wiw implements gdh, ryy, wja, wjk {
    volatile a a;
    final ajwo<String> b;
    final wiy c;
    final wjn d;
    final wje e;
    final wiu f;
    final ihh g;
    private final ajxe h = ajxh.a(new x(this));
    private volatile abkq i;
    private ajdx<a> j;
    private zgb k;
    private final ajei l;

    /* renamed from: wiw$x */
    static final class x extends akcs implements akbk<zfw> {
        private /* synthetic */ wiw a;

        x(wiw wiw) {
            this.a = wiw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(whl.a, "DefaultSnapTokenManager");
        }
    }

    /* renamed from: wiw$a */
    static final class a {
        static final List<wjd> c = ajyi.i(wjd.values());
        static final ajex<String, Map<wjd, alqu>, a> d = b.a;
        static final a e = new a(null, ajyx.a);
        final String a;
        final Map<wjd, alqu> b;

        /* renamed from: wiw$a$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: wiw$a$b */
        static final class b<T1, T2, R> implements ajex<String, Map<wjd, ? extends alqu>, a> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                String str = (String) obj;
                Map map = (Map) obj2;
                akcr.b(str, SnapTokenModel.REFRESHTOKEN);
                akcr.b(map, SnapTokenModel.ACCESSTOKENS);
                return new a(str, map);
            }
        }

        static {
            a aVar = new a();
        }

        public a(String str, Map<wjd, alqu> map) {
            akcr.b(map, SnapTokenModel.ACCESSTOKENS);
            this.a = str;
            this.b = map;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.wiw.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.wiw.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wiw$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Map map = this.b;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("TokenCache(refreshToken=");
            stringBuilder.append(this.a);
            stringBuilder.append(", accessTokens=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: wiw$m */
    static final class m<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ wiw a;
        private /* synthetic */ wjd b;

        m(wiw wiw, wjd wjd) {
            this.a = wiw;
            this.b = wjd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return this.a.a(str, this.b, false);
        }
    }

    /* renamed from: wiw$n */
    static final class n<T> implements ajfb<String> {
        private /* synthetic */ wiw a;
        private /* synthetic */ wjd b;

        n(wiw wiw, wjd wjd) {
            this.a = wiw;
            this.b = wjd;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b(this.b);
        }
    }

    /* renamed from: wiw$o */
    static final class o extends akcs implements akbk<ajdx<a>> {
        final /* synthetic */ wiw a;
        private /* synthetic */ String b;

        /* renamed from: wiw$o$1 */
        static final class 1<T> implements ajfb<a> {
            private /* synthetic */ o a;

            1(o oVar) {
                this.a = oVar;
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                this.a.a.a = (a) obj;
            }
        }

        o(wiw wiw, String str) {
            this.a = wiw;
            this.b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = ajdj.a((ajdn) this.a.d.b(this.b), (ajdn) this.a.d.a(this.b), a.d).a((ajeb) ajdx.b(a.e)).c((ajfb) new 1(this)).a();
            akcr.a(a, "Maybe.zip(snapTokenStora…                 .cache()");
            return a;
        }
    }

    /* renamed from: wiw$p */
    static final class p<T, R> implements ajfc<Throwable, a> {
        public static final p a = new p();

        p() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return a.e;
        }
    }

    /* renamed from: wiw$q */
    static final class q<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ wiw a;
        final /* synthetic */ String b;
        private /* synthetic */ boolean c;
        private /* synthetic */ wjd d;
        private /* synthetic */ ajdx e;

        q(wiw wiw, boolean z, wjd wjd, ajdx ajdx, String str) {
            this.a = wiw;
            this.c = z;
            this.d = wjd;
            this.e = ajdx;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (a) obj;
            akcr.b(obj, "it");
            if (!this.a.e.a((alqu) obj.b.get(this.d), this.d) || (this.c && this.a.e.a((alqu) obj.b.get(this.d)))) {
                return this.a.a(this.e, (akbk) new akbk<ajdx<a>>(this) {
                    private /* synthetic */ q a;

                    public final /* synthetic */ Object invoke() {
                        String str = obj.a;
                        if (str == null) {
                            a aVar = this.a.a.a;
                            str = aVar != null ? aVar.a : null;
                        }
                        if (str != null) {
                            return wiw.a(this.a.a, this.a.b, str);
                        }
                        wiw wiw = this.a.a;
                        String str2 = this.a.b;
                        wiy wiy = wiw.c;
                        List list = a.c;
                        akcr.b(str2, "userId");
                        akcr.b(list, "scopes");
                        if (wiy.a != null) {
                            aear aear = new aear();
                            aear.a(str2);
                            Iterable<wjd> iterable = list;
                            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                            for (wjd a : iterable) {
                                arrayList.add(a.a());
                            }
                            Object[] toArray = ((List) arrayList).toArray(new String[0]);
                            if (toArray != null) {
                                aear.a = (String[]) toArray;
                                aipn aipn = wiy.a;
                                if (aipn == null) {
                                    akcr.a("snapTokenHttpInterface");
                                }
                                Object a2 = ((SnapTokenHttpInterface) aipn.get()).fetchSessionRequest(aear).a((ajfc) new d(wiy, str2));
                                akcr.a(a2, "snapTokenHttpInterface.g…TokenResult(userId, it) }");
                                Object a3 = a2.a((ajfb) new j(wiw, str2)).d((ajfb) new k(wiw)).f(l.a).a();
                                akcr.a(a3, "snapTokenNetworkService.…                 .cache()");
                                return a3;
                            }
                            throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        throw new IllegalStateException("DefaultSnapTokenInitializer.initialize is not called");
                    }
                });
            }
            obj = ajdx.b(obj);
            akcr.a(obj, "Single.just(it)");
            return obj;
        }
    }

    /* renamed from: wiw$r */
    static final class r<T> implements ajfb<a> {
        private /* synthetic */ wiw a;

        r(wiw wiw) {
            this.a = wiw;
        }

        public final /* synthetic */ void accept(Object obj) {
            a aVar = (a) obj;
            wiw wiw = this.a;
            wiw.a = aVar;
            wiw.b.a((Object) "DefaultSnapTokenManager");
        }
    }

    /* renamed from: wiw$s */
    static final class s<T, R> implements ajfc<T, ajdn<? extends R>> {
        final /* synthetic */ wjd a;

        s(wjd wjd) {
            this.a = wjd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final a aVar = (a) obj;
            akcr.b(aVar, "it");
            return ajdj.b((Callable) new Callable<T>(this) {
                private /* synthetic */ s a;

                public final /* synthetic */ Object call() {
                    alqu alqu = (alqu) aVar.b.get(this.a.a);
                    Object b = alqu != null ? alqu.b() : null;
                    if (b == null) {
                        akcr.a();
                    }
                    return b;
                }
            });
        }
    }

    /* renamed from: wiw$t */
    static final class t<T> implements ajfb<String> {
        private /* synthetic */ wiw a;
        private /* synthetic */ boolean b;
        private /* synthetic */ wjd c;
        private /* synthetic */ long d;

        t(wiw wiw, boolean z, wjd wjd, long j) {
            this.a = wiw;
            this.b = z;
            this.c = wjd;
            this.d = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (!this.b) {
                this.a.f.a(this.c, false, this.a.g.c() - this.d);
            }
        }
    }

    /* renamed from: wiw$u */
    static final class u<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ wiw a;
        private /* synthetic */ wjd b;

        u(wiw wiw, wjd wjd) {
            this.a = wiw;
            this.b = wjd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return this.a.a(str, this.b, true);
        }
    }

    /* renamed from: wiw$v */
    static final class v<T> implements ajfb<String> {
        public static final v a = new v();

        v() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: wiw$w */
    static final class w<T> implements ajfb<Throwable> {
        public static final w a = new w();

        w() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: wiw$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ wiw a;
        private /* synthetic */ String b;
        private /* synthetic */ wjd c;

        b(wiw wiw, String str, wjd wjd) {
            this.a = wiw;
            this.b = str;
            this.c = wjd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            wiw wiw = this.a;
            String str2 = this.b;
            wjd wjd = this.c;
            ajdx b = wiw.b(str);
            obj = b.a((ajfc) new e(wiw, b, str2, wjd)).a((ajfb) new f(wiw, str, wjd));
            akcr.a(obj, "lastToken\n              …copeId)\n                }");
            return obj;
        }
    }

    /* renamed from: wiw$c */
    static final class c<T> implements ajfb<a> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: wiw$d */
    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: wiw$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ String a;
        final /* synthetic */ wjd b;
        private /* synthetic */ wiw c;
        private /* synthetic */ ajdx d;

        e(wiw wiw, ajdx ajdx, String str, wjd wjd) {
            this.c = wiw;
            this.d = ajdx;
            this.a = str;
            this.b = wjd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final a aVar = (a) obj;
            akcr.b(aVar, "it");
            return this.c.a(this.d, (akbk) new akbk<ajdx<a>>(this) {
                private /* synthetic */ e a;

                public final /* synthetic */ Object invoke() {
                    Object obj = aVar;
                    akcr.a(obj, "it");
                    Object obj2 = this.a.a;
                    wjd wjd = this.a.b;
                    String str = obj.a;
                    Map linkedHashMap = new LinkedHashMap();
                    for (Entry entry : obj.b.entrySet()) {
                        int i = 1;
                        if (((wjd) entry.getKey()) == wjd && (akcr.a(((alqu) entry.getValue()).b(), obj2) ^ 1) == 0) {
                            i = 0;
                        }
                        if (i != 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    obj = ajdx.b(new a(str, linkedHashMap)).a();
                    akcr.a(obj, "Single.just(TokenCache(t…\n                .cache()");
                    return obj;
                }
            });
        }
    }

    /* renamed from: wiw$f */
    static final class f<T> implements ajfb<a> {
        private /* synthetic */ wiw a;
        private /* synthetic */ String b;
        private /* synthetic */ wjd c;

        f(wiw wiw, String str, wjd wjd) {
            this.a = wiw;
            this.b = str;
            this.c = wjd;
        }

        public final /* synthetic */ void accept(Object obj) {
            a aVar = (a) obj;
            wiw wiw = this.a;
            wiw.a = aVar;
            wiw.d.a(this.b, aVar.b);
            this.a.b(this.c);
        }
    }

    /* renamed from: wiw$g */
    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;

        g(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "it");
            return new a(this.a, aVar.a);
        }
    }

    /* renamed from: wiw$h */
    static final class h<T> implements ajfb<a> {
        private /* synthetic */ wiw a;
        private /* synthetic */ String b;

        h(wiw wiw, String str) {
            this.a = wiw;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.d.a(this.b, ((a) obj).b);
        }
    }

    /* renamed from: wiw$i */
    static final class i<T> implements ajfb<Throwable> {
        private /* synthetic */ wiw a;
        private /* synthetic */ String b;

        i(wiw wiw, String str) {
            this.a = wiw;
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:9:0x0022, code skipped:
            if (r3 == null) goto L_0x0024;
     */
        public final /* synthetic */ void accept(java.lang.Object r6) {
            /*
            r5 = this;
            r6 = (java.lang.Throwable) r6;
            r0 = r5.a;
            r0 = r0.f;
            r1 = "it";
            defpackage.akcr.a(r6, r1);
            defpackage.akcr.b(r6, r1);
            r1 = r6 instanceof defpackage.wjo;
            r2 = 0;
            if (r1 != 0) goto L_0x0015;
        L_0x0013:
            r3 = r2;
            goto L_0x0016;
        L_0x0015:
            r3 = r6;
        L_0x0016:
            r3 = (defpackage.wjo) r3;
            if (r3 == 0) goto L_0x0024;
        L_0x001a:
            r3 = r3.a;
            if (r3 == 0) goto L_0x0024;
        L_0x001e:
            r3 = r3.name();
            if (r3 != 0) goto L_0x0026;
        L_0x0024:
            r3 = "UNKNOWN";
        L_0x0026:
            r0 = r0.a();
            r4 = new abak;
            r4.<init>();
            r4.a(r3);
            r4 = (defpackage.aajt) r4;
            r0.a(r4);
            if (r1 != 0) goto L_0x003a;
        L_0x0039:
            r6 = r2;
        L_0x003a:
            r6 = (defpackage.wjo) r6;
            if (r6 == 0) goto L_0x0051;
        L_0x003e:
            r6 = r6.a;
            r0 = defpackage.wjc.SERVER_INVALID_REFRESH_TOKEN;
            if (r6 != r0) goto L_0x0051;
        L_0x0044:
            r6 = r5.a;
            r6 = r6.d;
            r0 = r5.b;
            r6.c(r0);
            r6 = r5.a;
            r6.a = r2;
        L_0x0051:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wiw$i.accept(java.lang.Object):void");
        }
    }

    /* renamed from: wiw$j */
    static final class j<T> implements ajfb<b> {
        private /* synthetic */ wiw a;
        private /* synthetic */ String b;

        j(wiw wiw, String str) {
            this.a = wiw;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            b bVar = (b) obj;
            this.a.d.a(this.b, bVar.b, bVar.a);
        }
    }

    /* renamed from: wiw$k */
    static final class k<T> implements ajfb<Throwable> {
        private /* synthetic */ wiw a;

        k(wiw wiw) {
            this.a = wiw;
        }

        /* JADX WARNING: Missing block: B:8:0x001f, code skipped:
            if (r3 == null) goto L_0x0021;
     */
        public final /* synthetic */ void accept(java.lang.Object r3) {
            /*
            r2 = this;
            r3 = (java.lang.Throwable) r3;
            r0 = r2.a;
            r0 = r0.f;
            r1 = "it";
            defpackage.akcr.a(r3, r1);
            defpackage.akcr.b(r3, r1);
            r1 = r3 instanceof defpackage.wjp;
            if (r1 != 0) goto L_0x0013;
        L_0x0012:
            r3 = 0;
        L_0x0013:
            r3 = (defpackage.wjp) r3;
            if (r3 == 0) goto L_0x0021;
        L_0x0017:
            r3 = r3.a;
            if (r3 == 0) goto L_0x0021;
        L_0x001b:
            r3 = r3.name();
            if (r3 != 0) goto L_0x0023;
        L_0x0021:
            r3 = "UNKNOWN";
        L_0x0023:
            r0 = r0.a();
            r1 = new abau;
            r1.<init>();
            r1.a(r3);
            r1 = (defpackage.aajt) r1;
            r0.a(r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wiw$k.accept(java.lang.Object):void");
        }
    }

    /* renamed from: wiw$l */
    static final class l<T, R> implements ajfc<T, R> {
        public static final l a = new l();

        l() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "it");
            return new a(bVar.a, bVar.b);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(wiw.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public wiw(wiy wiy, wjn wjn, wje wje, wiu wiu, ihh ihh, zgb zgb, ajei ajei) {
        akcr.b(wiy, "snapTokenNetworkService");
        akcr.b(wjn, "snapTokenStorage");
        akcr.b(wje, "snapTokenDiskUtils");
        akcr.b(wiu, "blizzardLogger");
        akcr.b(ihh, "clock");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajei, "clearOnLogout");
        this.c = wiy;
        this.d = wjn;
        this.e = wje;
        this.f = wiu;
        this.g = ihh;
        this.k = zgb;
        this.l = ajei;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create()");
        this.b = ajwo;
    }

    private final ajdx<String> c() {
        String str;
        abkq abkq = this.i;
        Object obj = abkq != null ? abkq.a : null;
        if (obj == null) {
            obj = ajdx.b(wjo.a.a());
            str = "Single.error(SnapAccessT…enException.fromLogOut())";
        } else {
            obj = ajdx.b(obj);
            str = "Single.just(userId)";
        }
        akcr.a(obj, str);
        return obj;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized ajdx<a> a(ajdx<a> ajdx, akbk<? extends ajdx<a>> akbk) {
        if (this.j == ajdx) {
            this.j = (ajdx) akbk.invoke();
        }
        ajdx = this.j;
        if (ajdx == null) {
            ajdx = ajdx.b(a.e);
            akcr.a((Object) ajdx, "Single.just(TokenCache.EMPTY)");
        }
        return ajdx;
    }

    public final ajdx<String> a(String str) {
        akcr.b(str, "serverSideScopeName");
        Object a = wjd.a(str);
        akcr.a(a, "scopeIdOptional");
        if (a.isPresent()) {
            alqu alqu;
            String str2;
            wjd wjd = (wjd) a.get();
            a aVar = this.a;
            if (aVar != null) {
                Map map = aVar.b;
                if (map != null) {
                    alqu = (alqu) map.get(wjd);
                    str2 = TalkAuthContextModel.SCOPEID;
                    if (alqu == null && this.e.a(alqu, wjd)) {
                        wiu wiu = this.f;
                        akcr.a((Object) wjd, str2);
                        wiu.a(wjd, true, 0);
                        b(wjd);
                        a = ajdx.b(alqu.b());
                        akcr.a(a, "Single.just(accessTokens.tokenValue)");
                        return a;
                    }
                    akcr.a((Object) wjd, str2);
                    return a(wjd);
                }
            }
            alqu = null;
            str2 = TalkAuthContextModel.SCOPEID;
            if (alqu == null) {
            }
            akcr.a((Object) wjd, str2);
            return a(wjd);
        }
        throw new IllegalStateException("No scope ID found");
    }

    /* Access modifiers changed, original: final */
    public final ajdx<String> a(String str, wjd wjd, boolean z) {
        long c = this.g.c();
        ajdx b = b(str);
        ajdj b2 = b.g(p.a).a((ajdw) ((zfw) this.h.b()).g()).a((ajfc) new q(this, z, wjd, b, str)).a((ajfb) new r(this)).b((ajfc) new s(wjd));
        akcr.b(wjd, TalkAuthContextModel.SCOPEID);
        Object a = b2.a((ajeb) ajdx.b((Throwable) new wjo(wjc.SERVER_RESPONSE_ERROR, "Didn't find access token in successful server response ".concat(String.valueOf(wjd))))).a((ajfb) new t(this, z, wjd, c));
        akcr.a(a, "lastToken\n              …      }\n                }");
        return a;
    }

    public final ajdx<String> a(wjd wjd) {
        akcr.b(wjd, TalkAuthContextModel.SCOPEID);
        Object a = c().a((ajfc) new m(this, wjd)).a((ajfb) new n(this, wjd));
        akcr.a(a, "userId().flatMap {\n     …hTokenIfNeeded(scopeId) }");
        return a;
    }

    public final synchronized void a() {
        this.l.a();
        this.j = null;
        this.a = null;
        this.i = null;
    }

    public final void a(abkq abkq) {
        akcr.b(abkq, "userSession");
        this.i = abkq;
    }

    public final void a(String str, wjd wjd) {
        akcr.b(str, "accessToken");
        akcr.b(wjd, TalkAuthContextModel.SCOPEID);
        this.l.a(c().a((ajfc) new b(this, str, wjd)).a((ajfb) c.a, (ajfb) d.a));
    }

    public final ajdp<String> b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final ajdx<a> b(String str) {
        return a(null, (akbk) new o(this, str));
    }

    public final void b(wjd wjd) {
        akcr.b(wjd, TalkAuthContextModel.SCOPEID);
        ajej a = c().a((ajfc) new u(this, wjd)).a((ajfb) v.a, (ajfb) w.a);
        akcr.a((Object) a, "userId()\n               …lling getAccessToken\") })");
        this.l.a(a);
    }
}
