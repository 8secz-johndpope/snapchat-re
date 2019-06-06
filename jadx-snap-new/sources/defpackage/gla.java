package defpackage;

import defpackage.ryx.a;
import defpackage.ryx.b;
import defpackage.ryx.d;

/* renamed from: gla */
public final class gla {
    final ajxe a = ajxh.a(new a(this));
    final ajwy<ilv> b;
    final ajwy<glb> c;
    final ajwy<gkp> d;
    final ajwy<ftl> e;
    final ajwy<fwt> f;

    /* renamed from: gla$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ gla a;

        a(gla gla) {
            this.a = gla;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Boolean) ((ftl) this.a.e.get()).b((fth) rxp.NETWORK_OPS_GRAPHENE_METRICS_ENABLED).b();
        }
    }

    /* renamed from: gla$f */
    static final class f extends akcs implements akbk<ajxw> {
        private /* synthetic */ gla a;
        private /* synthetic */ iff b;

        f(gla gla, iff iff) {
            this.a = gla;
            this.b = iff;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ilv ilv = (ilv) this.a.b.get();
            this.a.c.get();
            ryz ryz = ((d) this.b.a).a;
            idl idl = ((d) this.b.a).d;
            akcr.b(ryz, "networkRequest");
            akcr.b(idl, "currentUiPage");
            ilv.c(glb.a(ioo.REQUEST_SUBMITTED_COUNT, ryz, idl), 1);
            return ajxw.a;
        }
    }

    /* renamed from: gla$e */
    static final class e extends akcs implements akbk<ajxw> {
        private /* synthetic */ gla a;
        private /* synthetic */ iff b;

        e(gla gla, iff iff) {
            this.a = gla;
            this.b = iff;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ilv ilv = (ilv) this.a.b.get();
            this.a.c.get();
            ryz ryz = ((a) this.b.a).a;
            idl idl = ((a) this.b.a).c;
            akcr.b(ryz, "networkRequest");
            akcr.b(idl, "currentUiPage");
            ilv.c(glb.a(ioo.REQUEST_EXECUTED_COUNT, ryz, idl), 1);
            return ajxw.a;
        }
    }

    /* renamed from: gla$d */
    static final class d extends akcs implements akbk<ajxw> {
        private /* synthetic */ gla a;
        private /* synthetic */ iff b;

        d(gla gla, iff iff) {
            this.a = gla;
            this.b = iff;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            long longValue;
            ilv ilv;
            ryz ryz = ((b) this.b.a).a;
            idl idl = ((b) this.b.a).e;
            Long c = ((b) this.b.a).c.e.c();
            String str = "currentUiPage";
            String str2 = "networkRequest";
            if (c != null) {
                longValue = c.longValue();
                ilv = (ilv) this.a.b.get();
                this.a.c.get();
                akcr.b(ryz, str2);
                akcr.b(idl, str);
                ilv.a(glb.a(ioo.USER_BLOCKING_QUEUING_LATENCY, ryz, idl), longValue);
            }
            c = ((b) this.b.a).c.e.d();
            if (c != null) {
                longValue = c.longValue();
                ilv = (ilv) this.a.b.get();
                this.a.c.get();
                akcr.b(ryz, str2);
                akcr.b(idl, str);
                ilv.a(glb.a(ioo.USER_BLOCKING_NETWORK_LATENCY, ryz, idl), longValue);
            }
            return ajxw.a;
        }
    }

    /* renamed from: gla$c */
    static final class c extends akcs implements akbk<ajxw> {
        private /* synthetic */ gla a;
        private /* synthetic */ iff b;

        c(gla gla, iff iff) {
            this.a = gla;
            this.b = iff;
            super(0);
        }

        /* JADX WARNING: Missing block: B:3:0x0037, code skipped:
            if (r0 == null) goto L_0x0039;
     */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
            r11 = this;
            r0 = r11.b;
            r0 = r0.a;
            r0 = (defpackage.ryx.b) r0;
            r0 = r0.a;
            r1 = r11.b;
            r1 = r1.a;
            r1 = (defpackage.ryx.b) r1;
            r1 = r1.b;
            r2 = r11.b;
            r2 = r2.a;
            r2 = (defpackage.ryx.b) r2;
            r2 = r2.d;
            r3 = r11.b;
            r3 = r3.a;
            r3 = (defpackage.ryx.b) r3;
            r3 = r3.c;
            r10 = new gko;
            r5 = r0.j();
            r4 = "request.host";
            defpackage.akcr.a(r5, r4);
            r0 = (defpackage.sak) r0;
            r0 = defpackage.sbi.c(r0);
            if (r0 == 0) goto L_0x0039;
        L_0x0033:
            r0 = r0.getPath();
            if (r0 != 0) goto L_0x003b;
        L_0x0039:
            r0 = "invalid";
        L_0x003b:
            r6 = r0;
            r0 = r1.a();
            r4 = "result.response";
            defpackage.akcr.a(r0, r4);
            r0 = r0.j();
            if (r0 != 0) goto L_0x004d;
        L_0x004b:
            r0 = "UNKNOWN";
        L_0x004d:
            r7 = r0;
            r0 = r1.a();
            defpackage.akcr.a(r0, r4);
            r0 = r0.a();
            r8 = java.lang.String.valueOf(r0);
            r0 = r2.c;
            r9 = r0.name();
            r4 = r10;
            r4.<init>(r5, r6, r7, r8, r9);
            r0 = r11.a;
            r0 = r0.b;
            r0 = r0.get();
            r0 = (defpackage.ilv) r0;
            r1 = r11.a;
            r1 = r1.d;
            r1.get();
            r1 = defpackage.gkp.a(r10);
            r0.c(r1, 1);
            r0 = r11.a;
            r0 = r0.b;
            r0 = r0.get();
            r0 = (defpackage.ilv) r0;
            r1 = r11.a;
            r1 = r1.d;
            r1.get();
            r1 = defpackage.gkp.a(r10);
            r2 = r3.e;
            r2 = r2.b();
            r0.a(r1, r2);
            r0 = defpackage.ajxw.a;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gla$c.invoke():java.lang.Object");
        }
    }

    /* renamed from: gla$b */
    static final class b extends akcq implements akbl<Double, Boolean> {
        b(fwt fwt) {
            super(1, fwt);
        }

        public final String getName() {
            return "shouldLogEvent";
        }

        public final akej getOwner() {
            return akde.a(fwt.class);
        }

        public final String getSignature() {
            return "shouldLogEvent(D)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(((fwt) this.receiver).a(((Number) obj).doubleValue()));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gla.class), "expEnabled", "getExpEnabled()Ljava/lang/Boolean;");
    }

    public gla(ajwy<ilv> ajwy, ajwy<glb> ajwy2, ajwy<gkp> ajwy3, ajwy<ftl> ajwy4, ajwy<fwt> ajwy5) {
        akcr.b(ajwy, "graphene");
        akcr.b(ajwy2, "networkManagerMetricsTracker");
        akcr.b(ajwy3, "contentDeliveryMetricsTracker");
        akcr.b(ajwy4, "configurationProvider");
        akcr.b(ajwy5, "perUserSampler");
        this.b = ajwy;
        this.c = ajwy2;
        this.d = ajwy3;
        this.e = ajwy4;
        this.f = ajwy5;
    }
}
