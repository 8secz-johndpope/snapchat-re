package defpackage;

/* renamed from: gsv */
public final class gsv implements gqx {
    private final aipn<gqa> a;
    private final aipn<abss> b;

    public gsv(aipn<gqa> aipn, aipn<abss> aipn2) {
        this.a = aipn;
        this.b = aipn2;
    }

    /* JADX WARNING: Missing block: B:4:0x001a, code skipped:
            if (r0.createNewFile() == false) goto L_0x001c;
     */
    private /* synthetic */ void a(java.lang.Throwable r5) {
        /*
        r4 = this;
        r5 = android.util.Log.getStackTraceString(r5);
        r0 = r4.a;
        r0 = r0.get();
        r0 = (defpackage.gqa) r0;
        r0 = r0.c();
        r1 = r0.exists();
        if (r1 != 0) goto L_0x001d;
    L_0x0016:
        r1 = r0.createNewFile();	 Catch:{ IOException -> 0x001c }
        if (r1 != 0) goto L_0x001d;
    L_0x001c:
        return;
    L_0x001d:
        r1 = 0;
        r2 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0039, all -> 0x0034 }
        r3 = 0;
        r2.<init>(r0, r3);	 Catch:{ IOException -> 0x0039, all -> 0x0034 }
        r5 = r5.getBytes();	 Catch:{ IOException -> 0x0032, all -> 0x002f }
        r2.write(r5);	 Catch:{ IOException -> 0x0032, all -> 0x002f }
        defpackage.aklc.a(r2);
        return;
    L_0x002f:
        r5 = move-exception;
        r1 = r2;
        goto L_0x0035;
    L_0x0032:
        r1 = r2;
        goto L_0x0039;
    L_0x0034:
        r5 = move-exception;
    L_0x0035:
        defpackage.aklc.a(r1);
        throw r5;
    L_0x0039:
        defpackage.aklc.a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsv.a(java.lang.Throwable):void");
    }

    public final int a() {
        return 1;
    }

    public final ajcx a(Thread thread, Throwable th) {
        return ((abss) this.b.get()).f() ? ajcx.a(new -$$Lambda$gsv$kqUuMaK-ZveC0YqJ3dgWehNjndE(this, th)) : ajvo.a(ajhn.a);
    }
}
