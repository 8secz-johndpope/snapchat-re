package defpackage;

import defpackage.ryx.f;
import defpackage.ryx.g;

/* renamed from: dbj */
public final class dbj extends dbh {
    private final ajei e = new ajei();

    public dbj(ajwy<ifa> ajwy, zgb zgb, abqo abqo) {
        super(ajwy, abqo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    private /* synthetic */ void b(defpackage.iff r3) {
        /*
        r2 = this;
        r3 = r3.a;
        r3 = (defpackage.ryx.f) r3;
        r3 = r3.a;
        r0 = r3.a;
        r1 = defpackage.ryz.c.METADATA;
        if (r0 != r1) goto L_0x000f;
    L_0x000c:
        r3 = r3.d;
        goto L_0x0017;
    L_0x000f:
        r0 = defpackage.sap.b(r3);
        if (r0 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x000c;
    L_0x0016:
        r3 = r0;
    L_0x0017:
        r0 = r2.isDisposed();
        if (r0 != 0) goto L_0x003a;
    L_0x001d:
        r0 = r2.d;
        if (r0 == 0) goto L_0x0029;
    L_0x0021:
        super.g();
        r0 = r2.c;
        r0.incrementAndGet(r3);
    L_0x0029:
        r3 = r2.a;
        r3 = r3.getAndIncrement();
        if (r3 != 0) goto L_0x003a;
    L_0x0031:
        r3 = r2.b;
        r0 = android.os.SystemClock.elapsedRealtime();
        r3.set(r0);
    L_0x003a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbj.b(iff):void");
    }

    public final synchronized void a(ifg ifg) {
        if (!isDisposed()) {
            this.e.a(ifg.a(f.class, new -$$Lambda$dbj$zWWxpPMOMk0PMyvMV9_2tbcIlmo(this)));
            this.e.a(ifg.a(g.class, new -$$Lambda$dbj$NB2hB4A6Ahe4xYQwDOarzhfzex4(this)));
        }
    }

    public final synchronized void dispose() {
        if (!isDisposed()) {
            this.e.dispose();
            super.dispose();
        }
    }
}
