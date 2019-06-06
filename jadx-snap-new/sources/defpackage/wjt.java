package defpackage;

import com.google.common.base.Optional;
import defpackage.ajvy.a;
import java.util.concurrent.Callable;

/* renamed from: wjt */
public final class wjt implements ihf {
    final idd a = rgr.d.callsite(wju.a);
    final zfw b = zgb.a(this.a);
    final odu c;
    final ajwy<wkk> d;
    final ftl e;
    final ajdv<ebm> f;
    final tnj g;
    final ilv h;
    private final zgb i;
    private final wjr j;
    private final ihh k;

    /* renamed from: wjt$a */
    static final class a<T> implements ajfl<Boolean> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: wjt$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ wjt a;
        private /* synthetic */ idd b;

        b(wjt wjt, idd idd) {
            this.a = wjt;
            this.b = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return this.a.c.b(this.b);
        }
    }

    /* renamed from: wjt$c */
    static final class c<T> implements ajfl<Optional<? extends abyk>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return optional.isPresent();
        }
    }

    /* renamed from: wjt$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return (abyk) optional.get();
        }
    }

    /* renamed from: wjt$f */
    static final class f<T, R> implements ajfc<T, ajdn<? extends R>> {
        final /* synthetic */ wjt a;
        private /* synthetic */ long b;

        /* renamed from: wjt$f$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Integer num = (Integer) obj;
                akcr.b(num, "it");
                return Integer.valueOf(num.intValue() + 1);
            }
        }

        f(wjt wjt, long j) {
            this.a = wjt;
            this.b = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdj a;
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            final abyk abyk = (abyk) ajxm.a;
            obj = (Long) ajxm.b;
            Long l = ((abyi) ajyu.f(abyk.c())).e.i;
            long j = this.b;
            long longValue = l.longValue();
            akcr.a(obj, "maximumDuration");
            if (j > longValue + obj.longValue()) {
                a = this.a.c.d(this.a.a, abyk.c()).b((ajdw) this.a.b.f()).a((ajdn) ajvo.a(ajlu.a));
            } else {
                obj = this.a.e.s(dnd.MEDIA_RECOVERY_CRASH_COUNT).d().f(1.a);
                akcr.a(obj, "configProvider.observeIn…tElement().map { it + 1 }");
                ajdn ajdn = (ajdn) obj;
                Object d = this.a.e.s(dnd.MEDIA_RECOVERY_CRASH_MAXIMUM).d();
                akcr.a(d, "configProvider.observeIn…H_MAXIMUM).firstElement()");
                ajdn ajdn2 = (ajdn) d;
                akcr.b(ajdn, "s1");
                akcr.b(ajdn2, "s2");
                obj = ajdj.a(ajdn, ajdn2, (ajex) a.a);
                akcr.a(obj, "Maybe.zip(s1, s2, BiFunc…on { t, u -> Pair(t,u) })");
                a = obj.a((ajfc) new ajfc<T, ajdn<? extends R>>(this) {
                    private /* synthetic */ f a;

                    public final /* synthetic */ Object apply(Object obj) {
                        ajcx b;
                        ajdj a;
                        ajxm ajxm = (ajxm) obj;
                        akcr.b(ajxm, "<name for destructuring parameter 0>");
                        Integer num = (Integer) ajxm.a;
                        obj = (Integer) ajxm.b;
                        int intValue = num.intValue();
                        akcr.a(obj, "max");
                        int a2 = akcr.a(intValue, obj.intValue());
                        String str = "crash_count";
                        if (a2 >= 0) {
                            this.a.a.h.c(inq.CRASH_SNAP_LOOP_EXIT.a(str, String.valueOf(num.intValue())), 1);
                            b = this.a.a.c.c(this.a.a.a, abyk.b()).b((ajdb) this.a.a.g.b().a((fth) dnd.MEDIA_RECOVERY_CRASH_COUNT, Integer.valueOf(0)).c());
                            a = ajvo.a(ajlu.a);
                        } else {
                            this.a.a.h.c(inq.CRASH_SNAP_RECOVERY.a(str, String.valueOf(num.intValue())), 1);
                            b = this.a.a.g.b().a((fth) dnd.MEDIA_RECOVERY_CRASH_COUNT, num).c();
                            a = ajdj.b(new ajxm(abyk, num));
                        }
                        return b.a((ajdn) a);
                    }
                });
            }
            return a;
        }
    }

    /* renamed from: wjt$g */
    static final class g<T> implements ajfb<ajxm<? extends abyk, ? extends Integer>> {
        private /* synthetic */ wjt a;
        private /* synthetic */ long b;

        g(wjt wjt, long j) {
            this.a = wjt;
            this.b = j;
        }

        /* JADX WARNING: Missing block: B:11:0x0077, code skipped:
            if ((r0 != null ? r0.longValue() : 0) > 11000) goto L_0x0079;
     */
        public final /* synthetic */ void accept(java.lang.Object r12) {
            /*
            r11 = this;
            r12 = (defpackage.ajxm) r12;
            r0 = r12.a;
            r0 = (defpackage.abyk) r0;
            r12 = r12.b;
            r12 = (java.lang.Number) r12;
            r12 = r12.intValue();
            r1 = r11.a;
            r1 = r1.f;
            r2 = r0.c();
            r2 = defpackage.ajdx.b(r2);
            r3 = "Single.just(mediaPackageSession.mediaPackages)";
            defpackage.akcr.a(r2, r3);
            r3 = r0.c();
            r3 = (java.lang.Iterable) r3;
            r4 = new java.util.ArrayList;
            r5 = 10;
            r5 = defpackage.ajyn.a(r3, r5);
            r4.<init>(r5);
            r4 = (java.util.Collection) r4;
            r3 = r3.iterator();
        L_0x0036:
            r5 = r3.hasNext();
            if (r5 == 0) goto L_0x004c;
        L_0x003c:
            r5 = r3.next();
            r5 = (defpackage.abyi) r5;
            r5 = r5.e;
            r5 = r5.a();
            r4.add(r5);
            goto L_0x0036;
        L_0x004c:
            r4 = (java.util.List) r4;
            r4 = (java.util.Collection) r4;
            r3 = r0.c();
            r3 = r3.size();
            r5 = 0;
            r6 = 1;
            if (r3 > r6) goto L_0x0079;
        L_0x005c:
            r0 = r0.c();
            r0 = r0.get(r5);
            r0 = (defpackage.abyi) r0;
            r0 = r0.e;
            r0 = r0.u;
            if (r0 == 0) goto L_0x0071;
        L_0x006c:
            r7 = r0.longValue();
            goto L_0x0073;
        L_0x0071:
            r7 = 0;
        L_0x0073:
            r9 = 11000; // 0x2af8 float:1.5414E-41 double:5.4347E-320;
            r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
            if (r0 <= 0) goto L_0x007a;
        L_0x0079:
            r5 = 1;
        L_0x007a:
            r0 = 4;
            r0 = defpackage.ebp.a.a(r4, r5, r0);
            r3 = new ebo;
            r3.<init>(r2, r0);
            r0 = new ebl$a;
            r2 = defpackage.aagz.CRASH;
            r12 = java.lang.Integer.valueOf(r12);
            r12 = defpackage.ajdx.b(r12);
            r4 = "Single.just(recoveryAttemptCount)";
            defpackage.akcr.a(r12, r4);
            r0.<init>(r2, r12);
            r0 = (defpackage.ebl) r0;
            r4 = r11.b;
            r12 = new ebm;
            r12.<init>(r3, r0, r4);
            r1.a(r12);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wjt$g.accept(java.lang.Object):void");
        }
    }

    /* renamed from: wjt$j */
    static final class j<V> implements Callable<Throwable> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ Object call() {
            return new IllegalStateException("Failed to recover expected recoverable snap");
        }
    }

    /* renamed from: wjt$e */
    static final class e<T, R> implements ajfc<abyk, ajdb> {
        private /* synthetic */ wjt a;

        e(wjt wjt) {
            this.a = wjt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abyk abyk = (abyk) obj;
            akcr.b(abyk, "it");
            return this.a.c.c(this.a.a, abyk.b());
        }
    }

    /* renamed from: wjt$h */
    static final class h<T> implements ajfl<Optional<? extends abyk>> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return optional.isPresent();
        }
    }

    /* renamed from: wjt$i */
    static final class i<T, R> implements ajfc<T, R> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return ((abyk) optional.get()).c();
        }
    }

    public wjt(odu odu, ajwy<wkk> ajwy, ftl ftl, zgb zgb, wjr wjr, ajdv<ebm> ajdv, ihh ihh, tnj tnj, ilv ilv) {
        akcr.b(odu, "mediaPackageManager");
        akcr.b(ajwy, "sendToController");
        akcr.b(ftl, "configProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(wjr, "savedInstanceHandler");
        akcr.b(ajdv, "mediaCreationObserver");
        akcr.b(ihh, "clock");
        akcr.b(tnj, "preferences");
        akcr.b(ilv, "graphene");
        this.c = odu;
        this.d = ajwy;
        this.e = ftl;
        this.i = zgb;
        this.j = wjr;
        this.f = ajdv;
        this.k = ihh;
        this.g = tnj;
        this.h = ilv;
    }

    private final ajdj<abyk> a(idd idd) {
        Object f = this.e.p(dnd.ENABLE_MEDIA_RECOVERY).d().a((ajfl) a.a).d((ajfc) new b(this, idd)).a((ajfl) c.a).f(d.a);
        akcr.a(f, "configProvider.observeBo…        .map { it.get() }");
        return f;
    }

    public final ajcx a(boolean z) {
        Object a;
        String str;
        long a2 = this.k.a();
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            ajdn a3 = a(this.a);
            Object d = this.e.t(dnd.MEDIA_RECOVERY_TIMEOUT).d();
            akcr.a(d, "configProvider.observeLo…Y_TIMEOUT).firstElement()");
            ajdn ajdn = (ajdn) d;
            akcr.b(a3, "$receiver");
            akcr.b(ajdn, "other");
            ajex ajex = ajvz.a.a;
            ajfv.a((Object) ajdn, "other is null");
            a = ajdj.a(a3, ajdn, ajex);
            akcr.a(a, "zipWith(other, BiFunction { t, u -> Pair(t,u) })");
            a = a.a((ajfc) new f(this, a2)).b((ajdw) this.b.h()).a((ajdw) this.b.l()).c((ajfb) new g(this, currentTimeMillis)).d();
            str = "lookupRecoverableMediaPa…         .ignoreElement()";
        } else {
            a = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        }
        akcr.a(a, str);
        return a;
    }

    public final ajcx b(boolean z) {
        Object b;
        String str;
        if (z && this.j.a == null) {
            b = a(this.a).e(new e(this)).b((ajdw) this.b.f());
            str = "lookupRecoverableMediaPa…qualifiedSchedulers.io())";
        } else {
            b = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        }
        akcr.a(b, str);
        return b;
    }
}
