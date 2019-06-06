package defpackage;

import java.util.List;

/* renamed from: txy */
public final class txy implements toe {
    final ajxe a = ajxh.a(new b(this));
    final toc b;
    final txv c;
    final twz d;
    private final String e = "ScanPreloader";
    private final tvd f;
    private final ftl g;
    private final zgb h;

    /* renamed from: txy$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ txy a;

        b(txy txy) {
            this.a = txy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.b.callsite("ScanPreloader"));
        }
    }

    /* renamed from: txy$c */
    static final class c<T, R> implements ajfc<List<? extends abyi>, ajdb> {
        private /* synthetic */ txy a;

        c(txy txy) {
            this.a = txy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "mediaPackages");
            txy txy = this.a;
            abyi abyi = (abyi) ajyu.f(list);
            obj = txy.d.a(abyi).a((ajdw) ((zfw) txy.a.b()).b()).e((ajfc) new a(txy, abyi));
            akcr.a(obj, "previewMediaReaderManage…      }\n                }");
            return obj;
        }
    }

    /* renamed from: txy$a */
    static final class a<T, R> implements ajfc<odx, ajdb> {
        private /* synthetic */ txy a;
        private /* synthetic */ abyi b;

        /* renamed from: txy$a$a */
        static final class a implements ajev {
            private /* synthetic */ kaz a;

            a(kaz kaz) {
                this.a = kaz;
            }

            public final void run() {
                this.a.dispose();
            }
        }

        a(txy txy, abyi abyi) {
            this.a = txy;
            this.b = abyi;
        }

        /* JADX WARNING: Missing block: B:12:0x00cb, code skipped:
            if (r0 == null) goto L_0x00cd;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r5) {
            /*
            r4 = this;
            r5 = (defpackage.odx) r5;
            r0 = "reader";
            defpackage.akcr.b(r5, r0);
            r0 = r4.b;
            r0 = r0.e;
            r0 = r0.a;
            r1 = "mediaPackage.media.mediaType";
            defpackage.akcr.a(r0, r1);
            r0 = r0.intValue();
            r0 = defpackage.abyp.c(r0);
            if (r0 == 0) goto L_0x00ef;
        L_0x001c:
            r5 = r5.h();
            if (r5 == 0) goto L_0x00ef;
        L_0x0022:
            r0 = "ScanPreloader";
            r5 = defpackage.kaz.a(r5, r0);
            if (r5 == 0) goto L_0x0031;
        L_0x002a:
            r0 = r5.a();
            r0 = (defpackage.jwj) r0;
            goto L_0x0032;
        L_0x0031:
            r0 = 0;
        L_0x0032:
            if (r0 == 0) goto L_0x00e4;
        L_0x0034:
            r0 = r4.a;
            r0 = r0.c;
            r1 = r5.a();
            r2 = "refCountBitmap.get()";
            defpackage.akcr.a(r1, r2);
            r1 = (defpackage.jwj) r1;
            r1 = r1.a();
            if (r1 == 0) goto L_0x00cd;
        L_0x0049:
            r1 = defpackage.ajdp.b(r1);
            r2 = new txv$b;
            r2.<init>(r0);
            r2 = (defpackage.ajfc) r2;
            r1 = r1.p(r2);
            r2 = new txv$d;
            r3 = r0.d;
            r2.<init>(r3);
            r2 = (defpackage.akbl) r2;
            r3 = new txx;
            r3.<init>(r2);
            r3 = (defpackage.ajfl) r3;
            r1 = r1.a(r3);
            r2 = r0.a();
            r2 = r2.f();
            r2 = (defpackage.ajdw) r2;
            r1 = r1.b(r2);
            r2 = r0.a();
            r2 = r2.l();
            r2 = (defpackage.zfr) r2;
            r2 = (defpackage.ajdw) r2;
            r1 = r1.a(r2);
            r2 = new txv$c;
            r2.<init>(r0);
            r2 = (defpackage.ajfc) r2;
            r1 = r1.k(r2);
            r2 = r0.a();
            r2 = r2.l();
            r2 = (defpackage.zfr) r2;
            r2 = (defpackage.ajdw) r2;
            r1 = r1.a(r2);
            r2 = new txv$e;
            r0 = (defpackage.txv) r0;
            r2.<init>(r0);
            r2 = (defpackage.akbl) r2;
            r0 = new txw;
            r0.<init>(r2);
            r0 = (defpackage.ajfc) r0;
            r0 = r1.p(r0);
            r0 = r0.g();
            r1 = defpackage.txv.f.a;
            r1 = (defpackage.ajfb) r1;
            r0 = r0.a(r1);
            r1 = defpackage.ajfu.g;
            r0 = r0.a(r1);
            if (r0 != 0) goto L_0x00d8;
        L_0x00cd:
            r0 = defpackage.ajhn.a;
            r0 = defpackage.ajvo.a(r0);
            r1 = "Completable.complete()";
            defpackage.akcr.a(r0, r1);
        L_0x00d8:
            r1 = new txy$a$a;
            r1.<init>(r5);
            r1 = (defpackage.ajev) r1;
            r5 = r0.f(r1);
            goto L_0x00ea;
        L_0x00e4:
            r5 = defpackage.ajhn.a;
            r5 = defpackage.ajvo.a(r5);
        L_0x00ea:
            if (r5 == 0) goto L_0x00ef;
        L_0x00ec:
            r5 = (defpackage.ajdb) r5;
            return r5;
        L_0x00ef:
            r5 = defpackage.ajhn.a;
            r5 = defpackage.ajvo.a(r5);
            r5 = (defpackage.ajdb) r5;
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.txy$a.apply(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(txy.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public txy(toc toc, txv txv, tvd tvd, twz twz, ftl ftl, zgb zgb) {
        akcr.b(toc, "previewFeature");
        akcr.b(txv, "scanController");
        akcr.b(tvd, "previewDataSource");
        akcr.b(twz, "previewMediaReaderManager");
        akcr.b(ftl, "configProvider");
        akcr.b(zgb, "schedulersProvider");
        this.b = toc;
        this.c = txv;
        this.f = tvd;
        this.d = twz;
        this.g = ftl;
        this.h = zgb;
    }

    public final ajej start() {
        Object e;
        String str;
        if (this.g.a((fth) dnd.SCAN_ENABLED)) {
            e = this.f.b.e((ajfc) new c(this)).e();
            str = "previewDataSource.mediaP…             .subscribe()";
        } else {
            e = ajek.a(ajfu.b);
            str = "Disposables.empty()";
        }
        akcr.a(e, str);
        return e;
    }
}
