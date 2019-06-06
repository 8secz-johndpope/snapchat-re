package defpackage;

/* renamed from: wij */
public final class wij extends saa implements akhn {
    private final ajxe a;
    private final ajwy<fwy> b;

    /* renamed from: wij$a */
    static final class a extends akcs implements akbk<iha> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iha) this.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(wij.class), "serializationHelper", "getSerializationHelper()Lcom/snap/framework/serialization/SerializationHelper;");
    }

    public wij(ajwy<iha> ajwy, ajwy<fwy> ajwy2) {
        akcr.b(ajwy, "_serializationHelper");
        akcr.b(ajwy2, "logoutHelper");
        this.b = ajwy2;
        this.a = ajxh.a(new a(ajwy));
    }

    private final iha a() {
        return (iha) this.a.b();
    }

    private final void a(String str) {
        try {
            afnt afnt = (afnt) a().a(str, afnt.class);
            if (akcr.a(afnt != null ? afnt.a : null, Boolean.TRUE)) {
                str = afnt.b;
                if (str != null && str.equals("FORCE_LOGOUT")) {
                    ((fwy) this.b.get()).a(fww.AUTHENTICATION_ERROR, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARNING: Missing block: B:9:0x003e, code skipped:
            if (r1 == null) goto L_0x0040;
     */
    public final void a(defpackage.saq<defpackage.sai> r6, defpackage.sab r7) {
        /*
        r5 = this;
        r0 = "response";
        defpackage.akcr.b(r6, r0);
        r0 = "chain";
        defpackage.akcr.b(r7, r0);
        r0 = r6.a();
        r1 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r0 != r1) goto L_0x00a4;
    L_0x0012:
        r0 = r7.a();
        r1 = "chain.context()";
        defpackage.akcr.a(r0, r1);
        r0 = r0.b();
        r1 = "chain.context().request";
        defpackage.akcr.a(r0, r1);
        r1 = r6.g();
        r1 = (defpackage.sai) r1;
        if (r1 == 0) goto L_0x0040;
    L_0x002c:
        r1 = r1.b();
        if (r1 == 0) goto L_0x0040;
    L_0x0032:
        r1 = r1.charset();
        if (r1 == 0) goto L_0x0040;
    L_0x0038:
        r1 = r1.orNull();
        r1 = (java.nio.charset.Charset) r1;
        if (r1 != 0) goto L_0x0042;
    L_0x0040:
        r1 = defpackage.akfp.a;
    L_0x0042:
        r2 = "response.payload?.conten…rNull() ?: Charsets.UTF_8";
        defpackage.akcr.a(r1, r2);
        r2 = r6.g();
        r2 = (defpackage.sai) r2;
        r3 = 0;
        if (r2 == 0) goto L_0x006b;
    L_0x0050:
        r2 = r2.e();
        if (r2 == 0) goto L_0x006b;
    L_0x0056:
        r4 = new java.io.InputStreamReader;
        r4.<init>(r2, r1);
        r4 = (java.io.Reader) r4;
        r1 = new java.io.BufferedReader;
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r1.<init>(r4, r2);
        r1 = (java.io.Reader) r1;
        r1 = defpackage.akbh.a(r1);
        goto L_0x006c;
    L_0x006b:
        r1 = r3;
    L_0x006c:
        r2 = r0.k();
        r2.name();
        r0 = r0.i();
        r2 = "request.url";
        defpackage.akcr.a(r0, r2);
        r5.a(r1);
        r0 = r6.f();
        r6 = r6.g();
        r6 = (defpackage.sai) r6;
        if (r6 == 0) goto L_0x008f;
    L_0x008b:
        r3 = r6.b();
    L_0x008f:
        if (r1 != 0) goto L_0x0093;
    L_0x0091:
        r1 = "";
    L_0x0093:
        r6 = defpackage.sbg.a(r3, r1);
        r6 = r0.a(r6);
        r6 = r6.a();
        r0 = "response.builder\n       …                 .build()";
        defpackage.akcr.a(r6, r0);
    L_0x00a4:
        r7.a(r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wij.a(saq, sab):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Missing block: B:7:0x0025, code skipped:
            if (r1 == null) goto L_0x0027;
     */
    public final defpackage.akhv intercept(defpackage.akhn.a r6) {
        /*
        r5 = this;
        r0 = "chain";
        defpackage.akcr.b(r6, r0);
        r0 = r6.a();
        r6 = r6.a(r0);
        r1 = r6.b();
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r1 != r2) goto L_0x008a;
    L_0x0015:
        r1 = r6.d();
        if (r1 == 0) goto L_0x0027;
    L_0x001b:
        r1 = r1.a();
        if (r1 == 0) goto L_0x0027;
    L_0x0021:
        r1 = r1.a();
        if (r1 != 0) goto L_0x0029;
    L_0x0027:
        r1 = defpackage.akfp.a;
    L_0x0029:
        r2 = "response.body()?.content…arset() ?: Charsets.UTF_8";
        defpackage.akcr.a(r1, r2);
        r2 = r6.d();
        r3 = 0;
        if (r2 == 0) goto L_0x0050;
    L_0x0035:
        r2 = r2.c();
        if (r2 == 0) goto L_0x0050;
    L_0x003b:
        r4 = new java.io.InputStreamReader;
        r4.<init>(r2, r1);
        r4 = (java.io.Reader) r4;
        r1 = new java.io.BufferedReader;
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r1.<init>(r4, r2);
        r1 = (java.io.Reader) r1;
        r1 = defpackage.akbh.a(r1);
        goto L_0x0051;
    L_0x0050:
        r1 = r3;
    L_0x0051:
        r2 = r0.b();
        r4 = "request.method()";
        defpackage.akcr.a(r2, r4);
        r2 = r0.a();
        r4 = "request.url()";
        defpackage.akcr.a(r2, r4);
        r5.a(r1);
        r6 = r6.e();
        r0 = r0.c();
        if (r0 == 0) goto L_0x0074;
    L_0x0070:
        r3 = r0.contentType();
    L_0x0074:
        if (r1 != 0) goto L_0x0078;
    L_0x0076:
        r1 = "";
    L_0x0078:
        r0 = defpackage.akhw.a(r3, r1);
        r6 = r6.a(r0);
        r6 = r6.a();
        r0 = "response\n               …                 .build()";
    L_0x0086:
        defpackage.akcr.a(r6, r0);
        return r6;
    L_0x008a:
        r0 = "response";
        goto L_0x0086;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wij.intercept(akhn$a):akhv");
    }
}
