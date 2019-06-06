package defpackage;

import android.net.Uri;
import com.brightcove.player.event.EventType;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.pfl.a;
import defpackage.ygm.b;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: pef */
public abstract class pef extends ggm {
    final gee a;
    final geo b;
    final gel c;
    final ygi d;
    final odu e;
    final owc f;
    final pfl g;
    final ajwy<gqr> h;
    private final String i;
    private final ajxe j;
    private final ajxe k;
    private final pij l;

    /* renamed from: pef$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ pef a;
        private /* synthetic */ a b;
        private /* synthetic */ oqr c;

        /* renamed from: pef$d$a */
        static final class a extends akcs implements akbk<yeu> {
            private /* synthetic */ d a;
            private /* synthetic */ yeu b;
            private /* synthetic */ b c;
            private /* synthetic */ oyc d;

            a(d dVar, yeu yeu, b bVar, oyc oyc) {
                this.a = dVar;
                this.b = yeu;
                this.c = bVar;
                this.d = oyc;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return this.b;
            }
        }

        /* renamed from: pef$d$b */
        static final class b extends akcs implements akbk<defpackage.ygm.b<ygk, ygh>> {
            private /* synthetic */ d a;
            private /* synthetic */ yeu b;
            private /* synthetic */ defpackage.ygm.b c;
            private /* synthetic */ oyc d;

            b(d dVar, yeu yeu, defpackage.ygm.b bVar, oyc oyc) {
                this.a = dVar;
                this.b = yeu;
                this.c = bVar;
                this.d = oyc;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return this.c;
            }
        }

        d(pef pef, a aVar, oqr oqr) {
            this.a = pef;
            this.b = aVar;
            this.c = oqr;
        }

        public final /* synthetic */ Object call() {
            this.b.e.a(phi.FM_LOOKUP);
            oyc a = pef.a(this.a, false);
            ygp ygp = a;
            Object l = this.a.d.l(ygp, this.c.a);
            akcr.a(l, "fileManager.acquireLease…Type, requestInfo.fileId)");
            yeu c = this.a.d.c(ygp, this.c.a);
            this.b.e.b(phi.FM_LOOKUP);
            if (c == null || !this.a.d.j(ygp, this.c.a)) {
                if (c != null) {
                    c.close();
                    this.b.c = true;
                }
                l.a();
                return null;
            }
            this.b.e.a(phi.FM_CREATE);
            gfl.a a2 = this.a.a(this.c).a();
            if (a2 != null) {
                gje gje = new gje(c, l, new a(this, c, l, a), new b(this, c, l, a));
                gel gel = this.a.c;
                gez gez = gje;
                gff gff = r6;
                gff gff2 = new gff(gfc.CACHE, false, 0, null, new gdz(gje.b(), 0, false, 6), null, null, 238);
                StringBuilder stringBuilder = new StringBuilder("memories_");
                stringBuilder.append(a.a());
                return gel.a(gez, a2, gff, stringBuilder.toString());
            }
            l.a();
            throw new IllegalStateException("getAssetDescriptorListFactory returned null");
        }
    }

    /* renamed from: pef$l */
    static final class l<V> implements Callable<T> {
        private /* synthetic */ pef a;
        private /* synthetic */ Uri b;

        l(pef pef, Uri uri) {
            this.a = pef;
            this.b = uri;
        }

        public final /* synthetic */ Object call() {
            return ghx.a.a((Throwable) new pfk("request failed", 2), null);
        }
    }

    /* renamed from: pef$m */
    static final class m<V> implements Callable<T> {
        private /* synthetic */ pef a;
        private /* synthetic */ Uri b;

        m(pef pef, Uri uri) {
            this.a = pef;
            this.b = uri;
        }

        public final /* synthetic */ Object call() {
            return ghx.a.a((Throwable) new IllegalArgumentException("missing ID"), null);
        }
    }

    /* renamed from: pef$p */
    static final class p<V> implements Callable<T> {
        private /* synthetic */ pef a;
        private /* synthetic */ Uri b;

        p(pef pef, Uri uri) {
            this.a = pef;
            this.b = uri;
        }

        public final /* synthetic */ Object call() {
            geo geo = this.a.b;
            return ((geo instanceof pey) || (geo instanceof pfh) || (geo instanceof pex)) ? new ghx(new gey(-3, new peh(this.a.b, "Content does not exist.", (byte) 0))) : ghx.a.a((Throwable) new pfk("request failed", 2), null);
        }
    }

    /* renamed from: pef$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ pef a;
        private /* synthetic */ oqr b;
        private /* synthetic */ Set c;
        private /* synthetic */ gfl d;
        private /* synthetic */ Set e;

        a(pef pef, oqr oqr, Set set, gfl gfl, Set set2) {
            this.a = pef;
            this.b = oqr;
            this.c = set;
            this.d = gfl;
            this.e = set2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return this.a.a(str, this.b, this.c, this.d, this.e);
        }
    }

    /* renamed from: pef$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ pef a;

        b(pef pef) {
            this.a = pef;
        }

        public final /* synthetic */ Object apply(Object obj) {
            agtt agtt = (agtt) obj;
            akcr.b(agtt, EventType.RESPONSE);
            oyc a = pef.a(this.a, true);
            obj = agtt.a;
            akcr.a(obj, "response.snaps");
            agtc agtc = (agtc) ajyu.f((List) obj);
            if (agtc.f() == agvr.SERVICE_OK) {
                int i = peg.a[a.ordinal()];
                if (i == 1) {
                    return agtc.O;
                }
                if (i == 2) {
                    return agtc.P;
                }
                if (i == 3) {
                    return agtc.M;
                }
                if (i == 4) {
                    return agtc.N;
                }
                throw new IllegalArgumentException("[buildNetworkContentRequest] Unexpected file type ".concat(String.valueOf(a)));
            }
            StringBuilder stringBuilder = new StringBuilder("[buildNetworkContentRequest] error from server: ");
            stringBuilder.append(agtc.F);
            throw new pfj(stringBuilder.toString(), 2);
        }
    }

    /* renamed from: pef$e */
    static final class e<T> implements ajfb<gej> {
        private /* synthetic */ pef a;
        private /* synthetic */ a b;
        private /* synthetic */ oqr c;

        e(pef pef, a aVar, oqr oqr) {
            this.a = pef;
            this.b = aVar;
            this.c = oqr;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (gej) obj;
            this.b.e.b(phi.FM_CREATE);
            a aVar = this.b;
            pej pej = pej.FileManager;
            akcr.a(obj, "it");
            aVar.a(pej, obj.f().a);
            obj.a();
        }
    }

    /* renamed from: pef$f */
    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ pef a;
        private /* synthetic */ oqr b;

        f(pef pef, oqr oqr) {
            this.a = pef;
            this.b = oqr;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: pef$g */
    static final class g<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pef a;
        private /* synthetic */ Uri b;
        private /* synthetic */ oqr c;
        private /* synthetic */ Set d;
        private /* synthetic */ boolean e;
        private /* synthetic */ Set f;
        private /* synthetic */ a g;

        g(pef pef, Uri uri, oqr oqr, Set set, boolean z, Set set2, a aVar) {
            this.a = pef;
            this.b = uri;
            this.c = oqr;
            this.d = set;
            this.e = z;
            this.f = set2;
            this.g = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            orl orl = (orl) obj;
            akcr.b(orl, "it");
            ajdx a = pef.a(this.a, this.b, this.c, this.d, this.e, this.f, orl, this.g);
            if (!this.a.e()) {
                return a;
            }
            a = this.a.a.a(new gew(this.a.b(this.c), null, gem.c(a), this.a.f(), this.a.b, this.d, this.f, 260)).a(this.e);
            akcr.a((Object) a, "contentManager\n         …tResult(closeOnTerminate)");
            return pnk.a(a, phi.MPM_FETCH, this.g.e, false);
        }
    }

    /* renamed from: pef$h */
    static final class h<T> implements ajfb<gej> {
        private /* synthetic */ a a;

        h(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (gej) obj;
            a aVar = this.a;
            pej pej = pej.MediaPackageManager;
            akcr.a(obj, "it");
            aVar.a(pej, obj.f().a);
        }
    }

    /* renamed from: pef$i */
    static final class i<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pef a;
        private /* synthetic */ boolean b;
        private /* synthetic */ a c;

        i(pef pef, boolean z, a aVar) {
            this.a = pef;
            this.b = z;
            this.c = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            geg geg = (geg) obj;
            akcr.b(geg, "it");
            ajdx a = this.a.a.a(geg).a(this.b);
            akcr.a((Object) a, "contentManager.submit(it…tResult(closeOnTerminate)");
            return pnk.a(a, phi.NET_FETCH, this.c.e, false);
        }
    }

    /* renamed from: pef$j */
    static final class j<T> implements ajfb<gej> {
        private /* synthetic */ a a;

        j(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (gej) obj;
            a aVar = this.a;
            pej pej = pej.ContentManager;
            akcr.a(obj, "it");
            aVar.a(pej, obj.f().a);
        }
    }

    /* renamed from: pef$k */
    static final class k<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pef a;
        private /* synthetic */ ajdx b;
        private /* synthetic */ Set c;
        private /* synthetic */ Set d;
        private /* synthetic */ boolean e;

        k(pef pef, ajdx ajdx, Set set, Set set2, boolean z) {
            this.a = pef;
            this.b = ajdx;
            this.c = set;
            this.d = set2;
            this.e = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            oqr oqr = (oqr) obj;
            akcr.b(oqr, "requestInfo");
            return this.a.a.a(new gew(this.a.b(oqr), null, gem.c(this.b), null, this.a.b, this.c, this.d, 276)).a(this.e);
        }
    }

    /* renamed from: pef$n */
    static final class n<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ pef a;
        final /* synthetic */ a b;
        final /* synthetic */ Uri c;
        final /* synthetic */ Set d;
        final /* synthetic */ boolean e;
        final /* synthetic */ Set f;

        n(pef pef, a aVar, Uri uri, Set set, boolean z, Set set2) {
            this.a = pef;
            this.b = aVar;
            this.c = uri;
            this.d = set;
            this.e = z;
            this.f = set2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final oqr oqr = (oqr) obj;
            akcr.b(oqr, "requestInfo");
            pef pef = this.a;
            a aVar = this.b;
            Object a = ajdj.b((Callable) new d(pef, aVar, oqr)).b((ajdw) pef.b().f()).c((ajfb) new e(pef, aVar, oqr)).a((ajfb) new f(pef, oqr));
            akcr.a(a, "Maybe\n                .f…sage}\")\n                }");
            return a.b((ajdn) ajdj.a((Callable) new Callable<ajdn<? extends T>>(this) {
                private /* synthetic */ n a;

                public final /* synthetic */ Object call() {
                    pef pef = this.a.a;
                    Uri uri = this.a.c;
                    Object obj = oqr;
                    akcr.a(obj, "requestInfo");
                    Set set = this.a.d;
                    boolean z = this.a.e;
                    Set set2 = this.a.f;
                    a aVar = this.a.b;
                    Object c = pnk.a(pef.f.a(obj.b), phi.MPM_LOOKUP, aVar.e, false).d((ajfc) new g(pef, uri, obj, set, z, set2, aVar)).c((ajfb) new h(aVar));
                    akcr.a(c, "uploadSessionsRepository…      )\n                }");
                    return c;
                }
            })).a((ajeb) ajdx.a((Callable) new Callable<ajeb<? extends T>>(this) {
                private /* synthetic */ n a;

                public final /* synthetic */ Object call() {
                    pef pef = this.a.a;
                    Object obj = oqr;
                    akcr.a(obj, "requestInfo");
                    return pef.a(pef, obj, this.a.d, this.a.e, this.a.f, this.a.b);
                }
            }));
        }
    }

    /* renamed from: pef$o */
    static final class o<T, R> implements ajfc<Throwable, gej> {
        private /* synthetic */ pef a;
        private /* synthetic */ Uri b;

        o(pef pef, Uri uri) {
            this.a = pef;
            this.b = uri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            return ghx.a.a(th, null);
        }
    }

    /* renamed from: pef$q */
    static final class q<T> implements ajfb<gej> {
        private /* synthetic */ a a;

        q(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (gej) obj;
            boolean a = obj.a();
            a aVar = this.a;
            aVar.b = a;
            if (!a) {
                akcr.a(obj, "it");
                obj = obj.e();
                akcr.a(obj, "it.failureReason");
                aVar.a = pfo.a(obj);
            }
        }
    }

    /* renamed from: pef$r */
    static final class r<T> implements ajfb<Throwable> {
        private /* synthetic */ a a;

        r(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a = new phl(phh.UNKNOWN);
        }
    }

    /* renamed from: pef$s */
    static final class s implements ajev {
        private /* synthetic */ pef a;
        private /* synthetic */ a b;

        s(pef pef, a aVar) {
            this.a = pef;
            this.b = aVar;
        }

        public final void run() {
            this.a.g.a(this.b);
        }
    }

    /* renamed from: pef$u */
    static final class u<T, R> implements ajfc<T, R> {
        private /* synthetic */ pef a;
        private /* synthetic */ Uri b;
        private /* synthetic */ akbw c;

        u(pef pef, Uri uri, akbw akbw) {
            this.a = pef;
            this.b = uri;
            this.c = akbw;
        }

        private gej a(odx odx) {
            akcr.b(odx, "reader");
            try {
                return new odq(this.b, odx, this.a.e, this.a.a(), this.c);
            } catch (Exception e) {
                odx.close();
                Throwable th = e;
                ((gqr) this.a.h.get()).a(gqt.NORMAL, th, this.a.a());
                return ghx.a.a(th, null);
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((odx) obj);
        }
    }

    /* renamed from: pef$v */
    static final class v<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ a a;
        private /* synthetic */ pef b;
        private /* synthetic */ String c;
        private /* synthetic */ orl d;
        private /* synthetic */ Uri e;
        private /* synthetic */ boolean f;
        private /* synthetic */ oqr g;
        private /* synthetic */ Set h;
        private /* synthetic */ Set i;

        /* renamed from: pef$v$1 */
        static final class 1<T> implements ajfb<gej> {
            private /* synthetic */ v a;

            1(v vVar) {
                this.a = vVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a.e.b(phi.MPM_CREATE);
            }
        }

        v(pef pef, String str, orl orl, Uri uri, boolean z, a aVar, oqr oqr, Set set, Set set2) {
            this.b = pef;
            this.c = str;
            this.d = orl;
            this.e = uri;
            this.f = z;
            this.a = aVar;
            this.g = oqr;
            this.h = set;
            this.i = set2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r13) {
            /*
            r12 = this;
            r13 = (com.google.common.base.Optional) r13;
            r0 = "it";
            defpackage.akcr.b(r13, r0);
            r13 = r13.orNull();
            r13 = (defpackage.abyk) r13;
            if (r13 == 0) goto L_0x00bc;
        L_0x000f:
            r0 = "it.orNull()\n            …                        }";
            defpackage.akcr.a(r13, r0);
            r13 = r13.c();
            r0 = r12.d;
            r0 = r0.b;
            r13 = r13.get(r0);
            r13 = (defpackage.abyi) r13;
            r0 = r12.b;
            r0 = r0.e();
            r1 = 0;
            if (r0 != 0) goto L_0x0050;
        L_0x002b:
            r0 = r12.e;
            r2 = "IMPORT_SPECS";
            r0 = r0.getQueryParameter(r2);
            r2 = "true";
            r0 = defpackage.akcr.a(r0, r2);
            if (r0 == 0) goto L_0x0050;
        L_0x003b:
            r0 = r13.e;
            r0 = r0.a;
            r2 = "this.mediaType";
            defpackage.akcr.a(r0, r2);
            r0 = r0.intValue();
            r0 = defpackage.abyp.i(r0);
            if (r0 == 0) goto L_0x0050;
        L_0x004e:
            r0 = 1;
            goto L_0x0051;
        L_0x0050:
            r0 = 0;
        L_0x0051:
            r2 = r12.b;
            r3 = r12.e;
            r4 = r12.d;
            r5 = r12.f;
            r13 = r2.a(r3, r13, r4, r5);
            if (r0 == 0) goto L_0x00ab;
        L_0x005f:
            r0 = r12.a;
            r0 = r0.e;
            r2 = defpackage.phi.MPM_CREATE;
            r0.b(r2);
            r0 = r12.b;
            r0 = r0.a;
            r11 = new gew;
            r2 = r12.b;
            r3 = r12.g;
            r3 = r2.b(r3);
            r2 = r12.b;
            r7 = r2.b;
            r8 = r12.h;
            r5 = defpackage.gem.c(r13);
            r13 = r12.b;
            r6 = r13.f();
            r9 = r12.i;
            r4 = 0;
            r10 = 260; // 0x104 float:3.64E-43 double:1.285E-321;
            r2 = r11;
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);
            r11 = (defpackage.geg) r11;
            r13 = r0.a(r11);
            r0 = r12.f;
            r13 = r13.a(r0);
            r0 = "contentManager\n         …tResult(closeOnTerminate)";
            defpackage.akcr.a(r13, r0);
            r0 = defpackage.phi.MPM_FETCH;
            r2 = r12.a;
            r2 = r2.e;
            r13 = defpackage.pnk.a(r13, r0, r2, r1);
            return r13;
        L_0x00ab:
            r0 = new pef$v$1;
            r0.<init>(r12);
            r0 = (defpackage.ajfb) r0;
            r13 = r13.c(r0);
            r0 = "result\n                 …                        }";
            defpackage.akcr.a(r13, r0);
            return r13;
        L_0x00bc:
            r13 = new java.lang.IllegalStateException;
            r0 = "failed to lookup media package session";
            r13.<init>(r0);
            r13 = (java.lang.Throwable) r13;
            throw r13;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pef$v.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: pef$c */
    static final class c extends akcs implements akbk<idd> {
        private /* synthetic */ pef a;
        private /* synthetic */ oiy b;

        c(pef pef, oiy oiy) {
            this.a = pef;
            this.b = oiy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.b.callsite(this.a.c());
        }
    }

    /* renamed from: pef$t */
    static final class t extends akcs implements akbk<zfw> {
        private /* synthetic */ pef a;
        private /* synthetic */ zgb b;

        t(pef pef, zgb zgb) {
            this.a = pef;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.a());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(pef.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(pef.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public pef(Uri uri, gee gee, geo geo, gel gel, oiy oiy, ygi ygi, odu odu, zgb zgb, pij pij, owc owc, pfl pfl, ajwy<gqr> ajwy) {
        akcr.b(uri, "baseUrl");
        akcr.b(gee, "contentManager");
        akcr.b(geo, "contentType");
        akcr.b(gel, "contentResultFactory");
        akcr.b(oiy, "attributedFeature");
        akcr.b(ygi, "fileManager");
        akcr.b(odu, "mediaPackageManager");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(pij, "snapMetadataDownloader");
        akcr.b(owc, "uploadSessionsRepository");
        akcr.b(pfl, "uriHandlerAnalytics");
        akcr.b(ajwy, "exceptionTrackerProvider");
        this.a = gee;
        this.b = geo;
        this.c = gel;
        this.d = ygi;
        this.e = odu;
        this.l = pij;
        this.f = owc;
        this.g = pfl;
        this.h = ajwy;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri);
        stringBuilder.append("/gallery/redirect");
        this.i = stringBuilder.toString();
        this.j = ajxh.a(new c(this, oiy));
        this.k = ajxh.a(new t(this, zgb));
    }

    public static final /* synthetic */ ajdx a(pef pef, Uri uri, oqr oqr, Set set, boolean z, Set set2, orl orl, a aVar) {
        orl orl2 = orl;
        String str = orl2.a;
        a aVar2 = aVar;
        aVar2.e.a(phi.MPM_CREATE);
        Object a = pef.e.b(pef.a(), str).a((ajfc) new v(pef, str, orl2, uri, z, aVar2, oqr, set, set2));
        akcr.a(a, "mediaPackageManager\n    …      }\n                }");
        oqr oqr2 = oqr;
        return pfq.a(a, pef.c(), oqr, pej.MediaPackageManager);
    }

    public static final /* synthetic */ ajdx a(pef pef, oqr oqr, Set set, boolean z, Set set2, a aVar) {
        Object c = pnk.a(pef.a(oqr, set, pef.a(oqr), set2), phi.NET_LOOKUP, aVar.e, false).a((ajfc) new i(pef, z, aVar)).c((ajfb) new j(aVar));
        akcr.a(c, "buildNetworkContentReque…      )\n                }");
        return pfq.a(c, pef.c(), oqr, pej.ContentManager);
    }

    public static final /* synthetic */ oyc a(pef pef, boolean z) {
        geo geo = pef.b;
        if (geo instanceof pev) {
            return oyc.MEDIA;
        }
        if (geo instanceof pfh) {
            return z ? oyc.THUMBNAIL_PACKAGE : oyc.THUMBNAIL;
        } else {
            if (geo instanceof pey) {
                return oyc.OVERLAY;
            }
            if (geo instanceof pfc) {
                return oyc.OVERLAY_METADATA;
            }
            StringBuilder stringBuilder = new StringBuilder("[getFileType] unexpected type ");
            stringBuilder.append(pef.b.c());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public abstract ajdj<oqr> a(String str);

    public final ajdx<gej> a(abyi abyi, Uri uri, akbw<? super idd, ? super odx, odp> akbw) {
        akcr.b(abyi, "receiver$0");
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(akbw, "mediaPackageAssetDescriptionFactory");
        Object f = this.e.c(a(), abyi).f(new u(this, uri, akbw));
        akcr.a(f, "mediaPackageManager\n    …      }\n                }");
        return f;
    }

    public abstract ajdx<gej> a(Uri uri, abyi abyi, orl orl, boolean z);

    public final ajdx<gej> a(Uri uri, ajdj<oqr> ajdj, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(ajdj, "requestInfoMaybe");
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        a a = this.g.a(this.b);
        ajdx a2 = pnk.a((ajdj) ajdj, phi.REQUEST_INFO, a.e, false).a((ajdw) b().f()).d((ajfc) new n(this, a, uri, set, z, set2)).h(new o(this, uri)).a((ajeb) ajdx.c((Callable) new p(this, uri)));
        akcr.a((Object) a2, "requestInfoMaybe\n       …     }\n                })");
        a2 = pnk.a(a2, phi.ALL, a.e, false).c((ajfb) new q(a)).d((ajfb) new r(a)).b((ajev) new s(this, a));
        akcr.a((Object) a2, "requestInfoMaybe\n       …lytics)\n                }");
        return gem.a(a2, z);
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String queryParameter = uri.getQueryParameter("ID");
        if (queryParameter == null) {
            pef pef = this;
            a a = pef.g.a(pef.b);
            a.a = new phl(phh.MISSING_ID);
            pef.g.a(a);
            Object b = ajdx.b(ghx.a.a((Throwable) new IllegalArgumentException("missing ID"), null));
            akcr.a(b, "Single.just(FailedConten…\")\n                    ))");
            return b;
        }
        return a(uri, a(queryParameter), (Set) set, z, (Set) set2);
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2, ajdx<gej> ajdx) {
        Object c;
        String str;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        akcr.b(ajdx, "contentResultFrom");
        String queryParameter = uri.getQueryParameter("ID");
        if (queryParameter == null) {
            c = ajdx.c((Callable) new m(this, uri));
            str = "Single.fromCallable {\n  …      )\n                }";
        } else {
            c = a(queryParameter).d((ajfc) new k(this, ajdx, set, set2, z)).a((ajeb) ajdx.c((Callable) new l(this, uri)));
            str = "getContentManagerRequest…     )\n                })";
        }
        akcr.a(c, str);
        return c;
    }

    /* Access modifiers changed, original: protected */
    public ajdx<geg> a(oqr oqr, Set<rzg> set, gfl gfl, Set<? extends gdy> set2) {
        akcr.b(oqr, "requestInfo");
        akcr.b(set, "schedulingContexts");
        akcr.b(gfl, "payloadProcessor");
        akcr.b(set2, "cacheAccessControls");
        Object b = oqr.c != null ? ajdx.b(oqr.c) : this.l.a(ajyl.a(oqr.b), pij.b.REFERENCE_METADATA).f(new b(this));
        akcr.a(b, "if (requestInfo.url != n…              }\n        }");
        Object f = b.f(new a(this, oqr, set, gfl, set2));
        akcr.a(f, "url.map {\n            in…s\n            )\n        }");
        return f;
    }

    /* Access modifiers changed, original: protected */
    public geg a(String str, oqr oqr, Set<rzg> set, gfl gfl, Set<? extends gdy> set2) {
        akcr.b(str, "downloadUrl");
        akcr.b(oqr, "requestInfo");
        akcr.b(set, "schedulingContexts");
        akcr.b(gfl, "payloadProcessor");
        akcr.b(set2, "cacheAccessControls");
        agtp agtp = new agtp();
        agtp.a = str;
        return new gew(b(oqr), new sbm.a(this.i, sac.POST).b(new gmb(agtp)).e(), null, gfl, this.b, set, set2, 268);
    }

    public abstract gfl a(oqr oqr);

    /* Access modifiers changed, original: final */
    public final idd a() {
        return (idd) this.j.b();
    }

    public final String b(oqr oqr) {
        akcr.b(oqr, "requestInfo");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(oqr.a);
        stringBuilder.append(d());
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final zfw b() {
        return (zfw) this.k.b();
    }

    public abstract String c();

    public abstract String d();

    public abstract boolean e();

    public abstract gfl f();
}
