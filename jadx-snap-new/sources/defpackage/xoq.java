package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xoq */
public final class xoq implements abov {
    final AtomicBoolean a = new AtomicBoolean(false);
    String b;
    String c;
    private final ajxe d;
    private final ajxe e;
    private final ajwy<xba> f;
    private final ftl g;
    private final ajei h;

    /* renamed from: xoq$b */
    static final class b extends akcs implements akbk<xbd> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xbd) this.a.get();
        }
    }

    /* renamed from: xoq$a */
    static final class a extends akcs implements akbk<xoz> {
        private /* synthetic */ xoq a;

        a(xoq xoq) {
            this.a = xoq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            xfu m = this.a.d().m();
            if (m != null) {
                return (xoz) m;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.spectacles.lib.main.filemanager.SpectaclesFileManagerImpl");
        }
    }

    /* renamed from: xoq$c */
    static final class c<T> implements ajfb<xgf> {
        private /* synthetic */ xoq a;

        c(xoq xoq) {
            this.a = xoq;
        }

        public final /* synthetic */ void accept(Object obj) {
            xgf xgf = (xgf) obj;
            if (xor.a[xgf.b.ordinal()] == 1) {
                xcp xcp = xgf.e;
                if (xcp != null && xcp == xcp.S2R) {
                    this.a.b = xgf.d;
                    this.a.c = xgf.a.d;
                    this.a.a.set(false);
                }
            }
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(xoq.class), "specsCoreComponent", "getSpecsCoreComponent()Lcom/snap/spectacles/base/di/components/SpectaclesCoreComponent;"), new akdc(akde.a(xoq.class), "fileManager", "getFileManager()Lcom/snap/spectacles/lib/main/filemanager/SpectaclesFileManagerImpl;")};
    }

    public xoq(ajwy<xbd> ajwy, ajwy<xba> ajwy2, ftl ftl, ajei ajei) {
        akcr.b(ajwy, "specsCoreComponentProvider");
        akcr.b(ajwy2, "debugCapturerProvider");
        akcr.b(ftl, "configProvider");
        akcr.b(ajei, "disposable");
        this.f = ajwy2;
        this.g = ftl;
        this.h = ajei;
        this.d = ajxh.a(new b(ajwy));
        this.e = ajxh.a(new a(this));
        this.h.a(d().e().c().f((ajfb) new c(this)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a A:{Catch:{ IOException -> 0x0115 }} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7 A:{Catch:{ IOException -> 0x0115 }} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015b  */
    public final java.io.File a(android.content.Context r10, java.io.File r11) {
        /*
        r9 = this;
        r0 = "context";
        defpackage.akcr.b(r10, r0);
        r10 = "outputFile";
        defpackage.akcr.b(r11, r10);
        r10 = r9.f;
        r10 = r10.get();
        r0 = "debugCapturerProvider.get()";
        defpackage.akcr.a(r10, r0);
        r10 = (defpackage.xba) r10;
        r10 = r10.a();
        r0 = new java.io.File;
        r1 = r11.getAbsolutePath();
        r2 = 0;
        r3 = 1;
        r4 = 0;
        if (r1 != 0) goto L_0x0028;
    L_0x0026:
        r1 = r4;
        goto L_0x008f;
    L_0x0028:
        r5 = defpackage.akla.a(r1);
        if (r5 >= 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0026;
    L_0x002f:
        r6 = r1.length();
        r7 = 47;
        if (r5 < r6) goto L_0x0071;
    L_0x0037:
        if (r1 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x0026;
    L_0x003a:
        r5 = defpackage.akla.a(r1);
        if (r5 >= 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0026;
    L_0x0041:
        r6 = r1.length();
        if (r5 <= r6) goto L_0x0069;
    L_0x0047:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5.append(r1);
        r5.append(r7);
        r5 = r5.toString();
        defpackage.akla.b(r5);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5.append(r1);
        r5.append(r7);
        r1 = r5.toString();
        goto L_0x008f;
    L_0x0069:
        r1 = r1.substring(r2, r5);
        defpackage.akla.b(r1);
        goto L_0x008f;
    L_0x0071:
        if (r1 != 0) goto L_0x0075;
    L_0x0073:
        r6 = -1;
        goto L_0x0083;
    L_0x0075:
        r6 = r1.lastIndexOf(r7);
        r7 = 92;
        r7 = r1.lastIndexOf(r7);
        r6 = java.lang.Math.max(r6, r7);
    L_0x0083:
        if (r6 < 0) goto L_0x008b;
    L_0x0085:
        r5 = r6 + 1;
        if (r5 != 0) goto L_0x008b;
    L_0x0089:
        r5 = r5 + 1;
    L_0x008b:
        r1 = r1.substring(r2, r5);
    L_0x008f:
        r5 = "spectacles_debug.txt";
        r0.<init>(r1, r5);
        r1 = r0.exists();	 Catch:{ IOException -> 0x0115 }
        if (r1 == 0) goto L_0x009d;
    L_0x009a:
        r0.delete();	 Catch:{ IOException -> 0x0115 }
    L_0x009d:
        r1 = r9.d();	 Catch:{ IOException -> 0x0115 }
        r1 = r1.n();	 Catch:{ IOException -> 0x0115 }
        if (r1 == 0) goto L_0x010c;
    L_0x00a7:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0115 }
        r5.<init>();	 Catch:{ IOException -> 0x0115 }
        r5.append(r10);	 Catch:{ IOException -> 0x0115 }
        r10 = "SPECTACLES_WIFI_MANAGER";
        r5.append(r10);	 Catch:{ IOException -> 0x0115 }
        r10 = r5.toString();	 Catch:{ IOException -> 0x0115 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0115 }
        r5.<init>();	 Catch:{ IOException -> 0x0115 }
        r5.append(r10);	 Catch:{ IOException -> 0x0115 }
        r10 = r1.b();	 Catch:{ IOException -> 0x0115 }
        r10 = r10.g();	 Catch:{ IOException -> 0x0115 }
        r5.append(r10);	 Catch:{ IOException -> 0x0115 }
        r10 = r5.toString();	 Catch:{ IOException -> 0x0115 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0115 }
        r5.<init>();	 Catch:{ IOException -> 0x0115 }
        r5.append(r10);	 Catch:{ IOException -> 0x0115 }
        r10 = "line.separator";
        r10 = java.lang.System.getProperty(r10);	 Catch:{ IOException -> 0x0115 }
        r5.append(r10);	 Catch:{ IOException -> 0x0115 }
        r10 = r5.toString();	 Catch:{ IOException -> 0x0115 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0115 }
        r5.<init>();	 Catch:{ IOException -> 0x0115 }
        r5.append(r10);	 Catch:{ IOException -> 0x0115 }
        r10 = "SPECTACLES_BT_CLASSIC_MANAGER";
        r5.append(r10);	 Catch:{ IOException -> 0x0115 }
        r10 = r5.toString();	 Catch:{ IOException -> 0x0115 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0115 }
        r5.<init>();	 Catch:{ IOException -> 0x0115 }
        r5.append(r10);	 Catch:{ IOException -> 0x0115 }
        r10 = r1.d();	 Catch:{ IOException -> 0x0115 }
        r10 = r10.g();	 Catch:{ IOException -> 0x0115 }
        r5.append(r10);	 Catch:{ IOException -> 0x0115 }
        r10 = r5.toString();	 Catch:{ IOException -> 0x0115 }
    L_0x010c:
        r1 = "UTF-8";
        r1 = java.nio.charset.Charset.forName(r1);	 Catch:{ IOException -> 0x0115 }
        defpackage.akkz.a(r0, r10, r1);	 Catch:{ IOException -> 0x0115 }
    L_0x0115:
        r10 = r9.d();
        r10 = r10.j();
        r10 = r10.f();
        if (r10 == 0) goto L_0x0135;
    L_0x0123:
        r0 = r9.a;
        r0.set(r3);
        r0 = r9.d();
        r0 = r0.h();
        r1 = defpackage.xcp.S2R;
        r0.a(r10, r1);
    L_0x0135:
        r0 = android.os.SystemClock.elapsedRealtime();
    L_0x0139:
        r10 = r9.a;
        r10 = r10.get();
        if (r10 == 0) goto L_0x0152;
    L_0x0141:
        r5 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        android.os.SystemClock.sleep(r5);
        r5 = android.os.SystemClock.elapsedRealtime();
        r5 = r5 - r0;
        r7 = 90000; // 0x15f90 float:1.26117E-40 double:4.4466E-319;
        r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r10 <= 0) goto L_0x0139;
    L_0x0152:
        r10 = r9.a;
        r10.set(r2);
        r10 = r9.b;
        if (r10 == 0) goto L_0x0176;
    L_0x015b:
        r0 = r9.e;
        r0 = r0.b();
        r0 = (defpackage.xoz) r0;
        r1 = defpackage.xjh.FILE_ZIP;
        r5 = r9.c;
        r10 = r0.c(r1, r10, r5);
        r0 = r10.length;
        if (r0 != 0) goto L_0x016f;
    L_0x016e:
        r2 = 1;
    L_0x016f:
        r0 = r2 ^ 1;
        if (r0 == 0) goto L_0x0176;
    L_0x0173:
        com.google.common.io.Files.write(r10, r11);
    L_0x0176:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xoq.a(android.content.Context, java.io.File):java.io.File");
    }

    public final String a() {
        return "spectacles_logs.zip";
    }

    public final boolean b() {
        return this.g.a((fth) xjd.HAS_USED_SPECTACLES);
    }

    public final long c() {
        return 90;
    }

    /* Access modifiers changed, original: final */
    public final xbd d() {
        return (xbd) this.d.b();
    }
}
