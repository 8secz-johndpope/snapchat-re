package defpackage;

/* renamed from: qdn */
public final class qdn {
    private final ryn a;

    /* renamed from: qdn$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static psj a(boolean z, Long l) {
            return z ? psj.TWENTY_FOUR_HOUR_AFTER_SEND : (l != null && l.longValue() == 0) ? psj.RELEASE_AFTER_SEEN : psj.TWENTY_FOUR_HOUR_AFTER_SEEN;
        }
    }

    static {
        a aVar = new a();
    }

    public qdn(ryn ryn) {
        akcr.b(ryn, "serverTimeProvider");
        this.a = ryn;
    }

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (r6.c.longValue() < (r8 - java.util.concurrent.TimeUnit.MINUTES.toMillis(r2))) goto L_0x004b;
     */
    /* JADX WARNING: Missing block: B:16:0x0049, code skipped:
            if (r6.b < (r8 - 86400000)) goto L_0x004b;
     */
    /* JADX WARNING: Missing block: B:18:0x004d, code skipped:
            r7 = false;
     */
    public static boolean a(defpackage.qdk r6, defpackage.psj r7, long r8, java.lang.Long r10) {
        /*
        r0 = "message";
        defpackage.akcr.b(r6, r0);
        r0 = "retentionPolicy";
        defpackage.akcr.b(r7, r0);
        r0 = defpackage.qdo.a;
        r7 = r7.ordinal();
        r7 = r0[r7];
        r0 = 0;
        r1 = 1;
        if (r7 == r1) goto L_0x004f;
    L_0x0016:
        r2 = 2;
        if (r7 == r2) goto L_0x0041;
    L_0x0019:
        r2 = 3;
        if (r7 != r2) goto L_0x003b;
    L_0x001c:
        if (r10 == 0) goto L_0x0023;
    L_0x001e:
        r2 = r10.longValue();
        goto L_0x0025;
    L_0x0023:
        r2 = 1440; // 0x5a0 float:2.018E-42 double:7.115E-321;
    L_0x0025:
        r7 = r6.c;
        if (r7 == 0) goto L_0x004f;
    L_0x0029:
        r7 = r6.c;
        r4 = r7.longValue();
        r7 = java.util.concurrent.TimeUnit.MINUTES;
        r2 = r7.toMillis(r2);
        r8 = r8 - r2;
        r7 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x004d;
    L_0x003a:
        goto L_0x004b;
    L_0x003b:
        r6 = new ajxk;
        r6.<init>();
        throw r6;
    L_0x0041:
        r2 = r6.b;
        r4 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r8 = r8 - r4;
        r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x004d;
    L_0x004b:
        r7 = 1;
        goto L_0x0051;
    L_0x004d:
        r7 = 0;
        goto L_0x0051;
    L_0x004f:
        r7 = r6.a;
    L_0x0051:
        r8 = r6.e;
        if (r8 != 0) goto L_0x0062;
    L_0x0055:
        r8 = r6.f;
        if (r8 != 0) goto L_0x0062;
    L_0x0059:
        r6 = r6.d;
        r8 = com.snap.core.db.column.MessageClientStatus.FAILED;
        if (r6 != r8) goto L_0x0060;
    L_0x005f:
        goto L_0x0062;
    L_0x0060:
        r6 = 0;
        goto L_0x0063;
    L_0x0062:
        r6 = 1;
    L_0x0063:
        if (r7 == 0) goto L_0x0068;
    L_0x0065:
        if (r6 != 0) goto L_0x0068;
    L_0x0067:
        return r1;
    L_0x0068:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdn.a(qdk, psj, long, java.lang.Long):boolean");
    }
}
