package defpackage;

import android.util.Log;

/* renamed from: ajk */
public final class ajk implements akk, Runnable {
    public final ajc<?, ?, ?> a;
    public volatile boolean b;
    private final aia c;
    private final a d;
    private int e = 1;

    /* renamed from: ajk$a */
    interface a extends aoo {
        void a(ajk ajk);
    }

    public ajk(a aVar, ajc<?, ?, ?> ajc, aia aia) {
        this.d = aVar;
        this.a = ajc;
        this.c = aia;
    }

    private boolean b() {
        return this.e == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    private defpackage.ajn<?> c() {
        /*
        r8 = this;
        r0 = "DecodeJob";
        r1 = 2;
        r2 = 0;
        r3 = r8.a;	 Catch:{ Exception -> 0x0036 }
        r4 = r3.c;	 Catch:{ Exception -> 0x0036 }
        r4 = r4.cacheResult;	 Catch:{ Exception -> 0x0036 }
        if (r4 != 0) goto L_0x000d;
    L_0x000c:
        goto L_0x004d;
    L_0x000d:
        r4 = defpackage.apo.a();	 Catch:{ Exception -> 0x0036 }
        r6 = r3.a;	 Catch:{ Exception -> 0x0036 }
        r6 = r3.a(r6);	 Catch:{ Exception -> 0x0036 }
        r7 = android.util.Log.isLoggable(r0, r1);	 Catch:{ Exception -> 0x0036 }
        if (r7 == 0) goto L_0x0022;
    L_0x001d:
        r7 = "Decoded transformed from cache";
        r3.a(r7, r4);	 Catch:{ Exception -> 0x0036 }
    L_0x0022:
        r4 = defpackage.apo.a();	 Catch:{ Exception -> 0x0036 }
        r6 = r3.b(r6);	 Catch:{ Exception -> 0x0036 }
        r7 = android.util.Log.isLoggable(r0, r1);	 Catch:{ Exception -> 0x0036 }
        if (r7 == 0) goto L_0x004e;
    L_0x0030:
        r7 = "Transcoded transformed from cache";
        r3.a(r7, r4);	 Catch:{ Exception -> 0x0036 }
        goto L_0x004e;
    L_0x0036:
        r3 = move-exception;
        r4 = 3;
        r5 = "EngineRunnable";
        r4 = android.util.Log.isLoggable(r5, r4);
        if (r4 == 0) goto L_0x004d;
    L_0x0040:
        r3 = java.lang.String.valueOf(r3);
        r4 = "Exception decoding result from cache: ";
        r3 = r4.concat(r3);
        android.util.Log.d(r5, r3);
    L_0x004d:
        r6 = r2;
    L_0x004e:
        if (r6 != 0) goto L_0x0078;
    L_0x0050:
        r3 = r8.a;
        r4 = r3.c;
        r4 = r4.cacheSource;
        if (r4 != 0) goto L_0x005a;
    L_0x0058:
        r6 = r2;
        goto L_0x0078;
    L_0x005a:
        r4 = defpackage.apo.a();
        r2 = r3.a;
        r2 = r2.a();
        r2 = r3.a(r2);
        r0 = android.util.Log.isLoggable(r0, r1);
        if (r0 == 0) goto L_0x0073;
    L_0x006e:
        r0 = "Decoded source from cache";
        r3.a(r0, r4);
    L_0x0073:
        r2 = r3.a(r2);
        goto L_0x0058;
    L_0x0078:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajk.c():ajn");
    }

    public final int a() {
        return this.c.ordinal();
    }

    /* Access modifiers changed, original: final */
    public final void a(Exception exception) {
        if (b()) {
            this.e = 2;
            this.d.a(this);
            return;
        }
        this.d.a(exception);
    }

    public final void run() {
        Exception e;
        if (!this.b) {
            ajn ajn = null;
            try {
                ajn c;
                if (b()) {
                    c = c();
                } else {
                    ajc ajc = this.a;
                    c = ajc.a(ajc.a());
                }
                ajn ajn2 = c;
                e = null;
                ajn = ajn2;
            } catch (Error e2) {
                e = new ajl(e2);
            } catch (Exception e3) {
                e = e3;
                String str = "EngineRunnable";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Exception decoding", e);
                }
            }
            if (this.b) {
                if (ajn != null) {
                    ajn.c();
                }
            } else if (ajn == null) {
                a(e);
            } else {
                this.d.a(ajn);
            }
        }
    }
}
