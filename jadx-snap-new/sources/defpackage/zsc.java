package defpackage;

import defpackage.iib.a;

/* renamed from: zsc */
public final class zsc {
    final ajxe a;
    public final ajxe b;
    private final ajxe c;
    private final ajxe d;

    /* renamed from: zsc$e */
    static final class e extends akcs implements akbk<zsh> {
        private /* synthetic */ aipn a;

        e(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zsh) this.a.get();
        }
    }

    /* renamed from: zsc$c */
    static final class c extends akcs implements akbk<gcz> {
        private /* synthetic */ aipn a;

        c(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gcz) this.a.get();
        }
    }

    /* renamed from: zsc$d */
    static final class d extends akcs implements akbk<ajdx<a>> {
        private /* synthetic */ aipn a;

        d(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((iib) this.a.get()).b();
        }
    }

    /* renamed from: zsc$a */
    static final class a extends akcs implements akbk<ftl> {
        private /* synthetic */ aipn a;

        a(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: zsc$b */
    public static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ zsc a;
        private /* synthetic */ zsq b;

        public b(zsc zsc, zsq zsq) {
            this.a = zsc;
            this.b = zsq;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x00f6  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r13) {
            /*
            r12 = this;
            r13 = (defpackage.iib.a) r13;
            r0 = "screenParamsProvider";
            defpackage.akcr.b(r13, r0);
            r0 = new alrt;
            r0.<init>();
            r1 = r12.a;
            r2 = "screenParams";
            defpackage.akcr.b(r13, r2);
            r3 = new alrv;
            r3.<init>();
            r4 = r1.b();
            r5 = defpackage.zpt.LAST_KNOWN_COUNTRY_CODE;
            r5 = (defpackage.fth) r5;
            r4 = r4.j(r5);
            r3.a(r4);
            defpackage.akcr.b(r13, r2);
            r2 = new alrv$a;
            r2.<init>();
            r4 = r13.e;
            r2.a(r4);
            r4 = r13.f;
            r2.b(r4);
            r4 = r13.g;
            r2.a(r4);
            r13 = r13.h;
            r2.b(r13);
            r3.a = r2;
            r13 = java.util.TimeZone.getDefault();
            r2 = "TimeZone.getDefault()";
            defpackage.akcr.a(r13, r2);
            r13 = r13.getID();
            r3.b(r13);
            r13 = r1.a;
            r13 = r13.b();
            r13 = (defpackage.gcz) r13;
            r13 = r13.a();
            r3.c(r13);
            r0.c = r3;
            r13 = r12.b;
            r13 = r13.a;
            r1 = defpackage.zsw.SNAPCHAT_USER_CONTEXT;
            if (r13 != r1) goto L_0x009e;
        L_0x006e:
            r13 = r12.a;
            r1 = new alsd;
            r1.<init>();
            r2 = r13.b();
            r3 = defpackage.zpt.SERVER_CONFIG_ENCODED_USER_EXPERIMENT;
            r3 = (defpackage.fth) r3;
            r2 = r2.j(r3);
            r3 = r13.a();
            r2 = r3.a(r2);
            if (r2 == 0) goto L_0x008d;
        L_0x008b:
            r1.a = r2;
        L_0x008d:
            r13 = r13.b();
            r2 = defpackage.zpt.SNAP_SCORE;
            r2 = (defpackage.fth) r2;
            r13 = r13.f(r2);
            r1.a(r13);
            r0.e = r1;
        L_0x009e:
            r13 = r12.a;
            r1 = new alrz;
            r1.<init>();
            r2 = r13.a();
            r3 = r2.a();
            r4 = defpackage.zpt.LAST_LOW_SENSITIVITY_RESPONSE_TIME_MILLIS;
            r4 = (defpackage.fth) r4;
            r3 = r3.h(r4);
            r5 = r2.a();
            r6 = defpackage.zpt.TWEAK_FORCE_LOW_SENSITIVITY_REQUEST;
            r6 = (defpackage.fth) r6;
            r5 = r5.a(r6);
            r6 = 3;
            r7 = 2;
            if (r5 != 0) goto L_0x00ec;
        L_0x00c5:
            r8 = 0;
            r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
            if (r5 != 0) goto L_0x00cc;
        L_0x00cb:
            goto L_0x00ec;
        L_0x00cc:
            r5 = r2.a();
            r8 = defpackage.zpt.SERVER_CONFIG_LOW_SENSITIVITY_REQUEST_EXPIRY_MILLIS;
            r8 = (defpackage.fth) r8;
            r8 = r5.h(r8);
            r2 = r2.a;
            r2 = r2.b();
            r2 = (defpackage.ihh) r2;
            r10 = r2.a();
            r10 = r10 - r3;
            r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
            if (r2 <= 0) goto L_0x00ea;
        L_0x00e9:
            goto L_0x00ec;
        L_0x00ea:
            r2 = 3;
            goto L_0x00ed;
        L_0x00ec:
            r2 = 2;
        L_0x00ed:
            r3 = defpackage.zsi.a;
            r4 = 1;
            r2 = r2 - r4;
            r2 = r3[r2];
            r3 = 0;
            if (r2 == r4) goto L_0x010b;
        L_0x00f6:
            if (r2 == r7) goto L_0x0106;
        L_0x00f8:
            if (r2 != r6) goto L_0x0100;
        L_0x00fa:
            r2 = new int[r7];
            r2 = {1, 0};
            goto L_0x010f;
        L_0x0100:
            r13 = new ajxk;
            r13.<init>();
            throw r13;
        L_0x0106:
            r2 = new int[r4];
            r2[r3] = r3;
            goto L_0x010f;
        L_0x010b:
            r2 = new int[r4];
            r2[r3] = r4;
        L_0x010f:
            r1.b = r2;
            r13 = r13.b();
            r2 = defpackage.zpt.LAST_LOW_SENSITIVITY_RESPONSE_TIME_MILLIS;
            r2 = (defpackage.fth) r2;
            r2 = r13.h(r2);
            r13 = new com.google.protobuf.nano.Timestamp;
            r13.<init>();
            r4 = java.util.concurrent.TimeUnit.MILLISECONDS;
            r4 = r4.toSeconds(r2);
            r6 = 1;
            r4 = java.lang.Math.max(r4, r6);
            r13.setSeconds(r4);
            r4 = java.util.concurrent.TimeUnit.MILLISECONDS;
            r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r2 = r2 % r5;
            r2 = r4.toNanos(r2);
            r3 = (int) r2;
            r13.setNanos(r3);
            r1.a = r13;
            r0.d = r1;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zsc$b.apply(java.lang.Object):java.lang.Object");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zsc.class), "unlockablesRequestDataSupplier", "getUnlockablesRequestDataSupplier()Lcom/snap/unlockables/lib/network/util/UnlockablesRequestDataSupplier;"), new akdc(akde.a(zsc.class), "httpHeaderUtils", "getHttpHeaderUtils()Lcom/snap/core/net/HttpHeaderProvider;"), new akdc(akde.a(zsc.class), "screenParameters", "getScreenParameters()Lio/reactivex/Single;"), new akdc(akde.a(zsc.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;")};
    }

    public zsc(aipn<zsh> aipn, aipn<gcz> aipn2, aipn<iib> aipn3, aipn<ftl> aipn4) {
        akcr.b(aipn, "unlockablesRequestDataSupplierLazy");
        akcr.b(aipn2, "httpHeaderProviderLazy");
        akcr.b(aipn3, "screenParameterProviderLazy");
        akcr.b(aipn4, "configProviderLazy");
        this.c = ajxh.a(new e(aipn));
        this.a = ajxh.a(new c(aipn2));
        this.b = ajxh.a(new d(aipn3));
        this.d = ajxh.a(new a(aipn4));
    }

    /* Access modifiers changed, original: final */
    public final zsh a() {
        return (zsh) this.c.b();
    }

    /* Access modifiers changed, original: final */
    public final ftl b() {
        return (ftl) this.d.b();
    }
}
