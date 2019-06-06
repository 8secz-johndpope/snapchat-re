package defpackage;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: aisu */
public final class aisu implements aisx {
    private final aiqr a;
    private aisy b;
    private SSLSocketFactory c;
    private boolean d;

    /* renamed from: aisu$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[aisv.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0019 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:5|6)|7|9|10|11|12|14) */
        /* JADX WARNING: Missing block: B:15:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.aisv.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = 3;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x001e }
            r2 = 4;
            r1[r0] = r2;	 Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aisu$1.<clinit>():void");
        }
    }

    public aisu() {
        this(new aiqi());
    }

    public aisu(aiqr aiqr) {
        this.a = aiqr;
    }

    private synchronized void a() {
        this.d = false;
        this.c = null;
    }

    private synchronized SSLSocketFactory b() {
        if (this.c == null && !this.d) {
            this.c = c();
        }
        return this.c;
    }

    private synchronized SSLSocketFactory c() {
        SSLSocketFactory socketFactory;
        this.d = true;
        try {
            aisy aisy = this.b;
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[]{new aisz(new aita(aisy.a(), aisy.b()), aisy)}, null);
            socketFactory = instance.getSocketFactory();
            this.a.a("Fabric", "Custom SSL pinning enabled");
        } catch (Exception e) {
            this.a.c("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return socketFactory;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    public final defpackage.aisw a(int r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
        r2 = this;
        r0 = defpackage.aisu.1.a;
        r1 = 1;
        r3 = r3 - r1;
        r3 = r0[r3];
        if (r3 == r1) goto L_0x0039;
    L_0x0008:
        r0 = 2;
        if (r3 == r0) goto L_0x0029;
    L_0x000b:
        r5 = 3;
        if (r3 == r5) goto L_0x0021;
    L_0x000e:
        r5 = 4;
        if (r3 != r5) goto L_0x0019;
    L_0x0011:
        r3 = new aisw;
        r5 = "DELETE";
        r3.<init>(r4, r5);
        goto L_0x0049;
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;
        r4 = "Unsupported HTTP method!";
        r3.<init>(r4);
        throw r3;
    L_0x0021:
        r3 = new aisw;
        r5 = "PUT";
        r3.<init>(r4, r5);
        goto L_0x0049;
    L_0x0029:
        r3 = defpackage.aisw.a(r4, r5);
        r3 = defpackage.aisw.a(r3);
        r5 = new aisw;
        r0 = "POST";
        r5.<init>(r3, r0);
        goto L_0x0048;
    L_0x0039:
        r3 = defpackage.aisw.a(r4, r5);
        r3 = defpackage.aisw.a(r3);
        r5 = new aisw;
        r0 = "GET";
        r5.<init>(r3, r0);
    L_0x0048:
        r3 = r5;
    L_0x0049:
        if (r4 == 0) goto L_0x005a;
    L_0x004b:
        r5 = java.util.Locale.US;
        r4 = r4.toLowerCase(r5);
        r5 = "https";
        r4 = r4.startsWith(r5);
        if (r4 == 0) goto L_0x005a;
    L_0x0059:
        goto L_0x005b;
    L_0x005a:
        r1 = 0;
    L_0x005b:
        if (r1 == 0) goto L_0x0070;
    L_0x005d:
        r4 = r2.b;
        if (r4 == 0) goto L_0x0070;
    L_0x0061:
        r4 = r2.b();
        if (r4 == 0) goto L_0x0070;
    L_0x0067:
        r5 = r3.a();
        r5 = (javax.net.ssl.HttpsURLConnection) r5;
        r5.setSSLSocketFactory(r4);
    L_0x0070:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisu.a(int, java.lang.String, java.util.Map):aisw");
    }

    public final void a(aisy aisy) {
        if (this.b != aisy) {
            this.b = aisy;
            a();
        }
    }
}
