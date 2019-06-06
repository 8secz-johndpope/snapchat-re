package defpackage;

import defpackage.akhn.a;
import java.util.Random;

/* renamed from: wil */
public final class wil extends saa implements akhn {
    private final Random a = new Random();
    private final gcw b;
    private final abnm c;
    private final dib d;

    /* renamed from: wil$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public wil(gcw gcw, abnm abnm, dib dib) {
        akcr.b(gcw, "endpointManager");
        akcr.b(abnm, "crasher");
        akcr.b(dib, "blizzardEventLogger");
        this.b = gcw;
        this.c = abnm;
        this.d = dib;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    public final void a(defpackage.sak<defpackage.sai> r9, defpackage.sab r10) {
        /*
        r8 = this;
        r0 = "request";
        defpackage.akcr.b(r9, r0);
        r1 = "chain";
        defpackage.akcr.b(r10, r1);
        defpackage.akcr.b(r9, r0);
        r1 = r9.l();
        r2 = "req_token";
        r1 = r1.get(r2);
        r1 = (java.lang.CharSequence) r1;
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0026;
    L_0x001d:
        r1 = r1.length();
        if (r1 != 0) goto L_0x0024;
    L_0x0023:
        goto L_0x0026;
    L_0x0024:
        r1 = 0;
        goto L_0x0027;
    L_0x0026:
        r1 = 1;
    L_0x0027:
        r1 = r1 ^ r2;
        r4 = 0;
        r5 = "request.url";
        if (r1 != 0) goto L_0x00a3;
    L_0x002d:
        defpackage.akcr.b(r9, r0);
        r0 = r9.m();
        if (r0 == 0) goto L_0x003d;
    L_0x0036:
        r1 = "isauth";
        r0 = r0.get(r1);
        goto L_0x003e;
    L_0x003d:
        r0 = r4;
    L_0x003e:
        r1 = r9.k();
        r6 = defpackage.sac.GET;
        if (r1 != r6) goto L_0x0048;
    L_0x0046:
        r0 = 0;
        goto L_0x009f;
    L_0x0048:
        if (r0 == 0) goto L_0x0056;
    L_0x004a:
        r1 = r0 instanceof java.lang.Boolean;
        if (r1 != 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0056;
    L_0x004f:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        goto L_0x009f;
    L_0x0056:
        r0 = r8.a;
        r0 = r0.nextFloat();
        r1 = 1008981770; // 0x3c23d70a float:0.01 double:4.9850323E-315;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x0065;
    L_0x0063:
        r0 = 1;
        goto L_0x0066;
    L_0x0065:
        r0 = 0;
    L_0x0066:
        if (r0 == 0) goto L_0x0046;
    L_0x0068:
        r0 = new aaxs;
        r0.<init>();
        r1 = r9.i();
        defpackage.akcr.a(r1, r5);
        r1 = android.net.Uri.parse(r1);
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = "parsedUrl";
        defpackage.akcr.a(r1, r7);
        r7 = r1.getHost();
        r6.append(r7);
        r1 = r1.getPath();
        r6.append(r1);
        r1 = r6.toString();
        r0.a(r1);
        r1 = r8.d;
        r0 = (defpackage.aajt) r0;
        r1.a(r0);
        goto L_0x0046;
    L_0x009f:
        if (r0 == 0) goto L_0x00a2;
    L_0x00a1:
        goto L_0x00a3;
    L_0x00a2:
        r2 = 0;
    L_0x00a3:
        r0 = r9.k();
        r1 = "request.method";
        defpackage.akcr.a(r0, r1);
        r1 = r9.i();
        defpackage.akcr.a(r1, r5);
        r3 = "requestMethod";
        defpackage.akcr.b(r0, r3);
        r0 = "requestUrl";
        defpackage.akcr.b(r1, r0);
        r0 = "url";
        defpackage.akcr.b(r1, r0);
        r0 = r1;
        r0 = (java.lang.CharSequence) r0;
        r3 = "req_token=";
        r3 = (java.lang.CharSequence) r3;
        r0 = defpackage.akgc.a(r0, r3, false);
        r3 = "Request to ";
        if (r0 == 0) goto L_0x00e6;
    L_0x00d1:
        r0 = new java.lang.StringBuilder;
        r0.<init>(r3);
        r0.append(r1);
        r1 = " should not contain request token in the URL. Sending authorization params with the URL leads to logging of these params with third parties. Please contact the Security team for questions.";
    L_0x00db:
        r0.append(r1);
        r0 = r0.toString();
        defpackage.abnm.a(r0);
        goto L_0x010f;
    L_0x00e6:
        r0 = android.net.Uri.parse(r1);
        if (r0 == 0) goto L_0x00f0;
    L_0x00ec:
        r4 = r0.getHost();
    L_0x00f0:
        if (r2 == 0) goto L_0x010f;
    L_0x00f2:
        if (r4 == 0) goto L_0x00fc;
    L_0x00f4:
        r0 = r8.b;
        r0 = r0.a(r4);
        if (r0 != 0) goto L_0x010f;
    L_0x00fc:
        r0 = new java.lang.StringBuilder;
        r0.<init>(r3);
        r0.append(r1);
        r2 = " should not be authorized. ";
        r0.append(r2);
        r0.append(r1);
        r1 = " is a non-Snapchat entity, and should not be receiving our users' authorization information. Please contact the Security team for questions.";
        goto L_0x00db;
    L_0x010f:
        r10.a(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wil.a(sak, sab):void");
    }

    public final akhv intercept(a aVar) {
        akcr.b(aVar, "chain");
        Object a = aVar.a(aVar.a());
        akcr.a(a, "chain.proceed(chain.request())");
        return a;
    }
}
