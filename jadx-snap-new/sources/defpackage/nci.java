package defpackage;

import android.location.Location;
import defpackage.nct.d;
import java.lang.ref.WeakReference;

/* renamed from: nci */
public final class nci implements Runnable {
    WeakReference<ncu> a;
    d b;
    private Location c;
    private long d;
    private int e = 15000;
    private long f;

    public static int b(boolean z) {
        return z ? 5000 : 15000;
    }

    public final synchronized int a() {
        return this.e;
    }

    public final synchronized boolean a(boolean z) {
        boolean z2;
        int b = nci.b(z);
        z2 = this.e != b;
        this.e = b;
        return z2;
    }

    public final void b() {
        this.c = null;
        this.d = 0;
        synchronized (this) {
            this.f = 0;
        }
    }

    /* JADX WARNING: Missing block: B:11:0x001e, code skipped:
            r3 = r12.b.a();
     */
    /* JADX WARNING: Missing block: B:12:0x0024, code skipped:
            if (r3 != null) goto L_0x0027;
     */
    /* JADX WARNING: Missing block: B:13:0x0026, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:14:0x0027, code skipped:
            monitor-enter(r12);
     */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r12.f = r1;
     */
    /* JADX WARNING: Missing block: B:17:0x002a, code skipped:
            monitor-exit(r12);
     */
    /* JADX WARNING: Missing block: B:19:0x002f, code skipped:
            if (defpackage.ncu.b(r3) == false) goto L_0x007c;
     */
    /* JADX WARNING: Missing block: B:20:0x0031, code skipped:
            r4 = r12.c;
     */
    /* JADX WARNING: Missing block: B:21:0x0033, code skipped:
            if (r4 == null) goto L_0x006a;
     */
    /* JADX WARNING: Missing block: B:22:0x0035, code skipped:
            r9 = 1;
     */
    /* JADX WARNING: Missing block: B:23:0x0040, code skipped:
            if ((r1 - r12.d) <= 60000) goto L_0x0044;
     */
    /* JADX WARNING: Missing block: B:24:0x0042, code skipped:
            r5 = 1;
     */
    /* JADX WARNING: Missing block: B:25:0x0044, code skipped:
            r5 = null;
     */
    /* JADX WARNING: Missing block: B:26:0x0045, code skipped:
            if (r5 != null) goto L_0x006a;
     */
    /* JADX WARNING: Missing block: B:28:0x0053, code skipped:
            if (((double) r4.distanceTo(r3)) <= 0.1d) goto L_0x0057;
     */
    /* JADX WARNING: Missing block: B:29:0x0055, code skipped:
            r5 = 1;
     */
    /* JADX WARNING: Missing block: B:30:0x0057, code skipped:
            r5 = null;
     */
    /* JADX WARNING: Missing block: B:31:0x0058, code skipped:
            if (r5 != null) goto L_0x006a;
     */
    /* JADX WARNING: Missing block: B:33:0x0064, code skipped:
            if (r3.getAccuracy() >= r4.getAccuracy()) goto L_0x0067;
     */
    /* JADX WARNING: Missing block: B:34:0x0067, code skipped:
            r9 = null;
     */
    /* JADX WARNING: Missing block: B:35:0x0068, code skipped:
            if (r9 == null) goto L_0x007c;
     */
    /* JADX WARNING: Missing block: B:36:0x006a, code skipped:
            r0.a(r3);
     */
    /* JADX WARNING: Missing block: B:37:0x006d, code skipped:
            if (r3 == null) goto L_0x0078;
     */
    /* JADX WARNING: Missing block: B:39:0x0073, code skipped:
            if (defpackage.ncu.b(r3) == false) goto L_0x0078;
     */
    /* JADX WARNING: Missing block: B:40:0x0075, code skipped:
            r0.i();
     */
    /* JADX WARNING: Missing block: B:41:0x0078, code skipped:
            r12.c = r3;
            r12.d = r1;
     */
    /* JADX WARNING: Missing block: B:42:0x007c, code skipped:
            return;
     */
    public final void run() {
        /*
        r12 = this;
        r0 = r12.a;
        r0 = r0.get();
        r0 = (defpackage.ncu) r0;
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r1 = java.lang.System.currentTimeMillis();
        monitor-enter(r12);
        r3 = r12.f;	 Catch:{ all -> 0x0080 }
        r3 = r1 - r3;
        r5 = r12.e;	 Catch:{ all -> 0x0080 }
        r5 = (long) r5;	 Catch:{ all -> 0x0080 }
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 >= 0) goto L_0x001d;
    L_0x001b:
        monitor-exit(r12);	 Catch:{ all -> 0x0080 }
        return;
    L_0x001d:
        monitor-exit(r12);	 Catch:{ all -> 0x0080 }
        r3 = r12.b;
        r3 = r3.a();
        if (r3 != 0) goto L_0x0027;
    L_0x0026:
        return;
    L_0x0027:
        monitor-enter(r12);
        r12.f = r1;	 Catch:{ all -> 0x007d }
        monitor-exit(r12);	 Catch:{ all -> 0x007d }
        r4 = defpackage.ncu.b(r3);
        if (r4 == 0) goto L_0x007c;
    L_0x0031:
        r4 = r12.c;
        if (r4 == 0) goto L_0x006a;
    L_0x0035:
        r5 = r12.d;
        r5 = r1 - r5;
        r7 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r9 = 1;
        r10 = 0;
        r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r11 <= 0) goto L_0x0044;
    L_0x0042:
        r5 = 1;
        goto L_0x0045;
    L_0x0044:
        r5 = 0;
    L_0x0045:
        if (r5 != 0) goto L_0x006a;
    L_0x0047:
        r5 = r4.distanceTo(r3);
        r5 = (double) r5;
        r7 = 4591870180066957722; // 0x3fb999999999999a float:-1.5881868E-23 double:0.1;
        r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r11 <= 0) goto L_0x0057;
    L_0x0055:
        r5 = 1;
        goto L_0x0058;
    L_0x0057:
        r5 = 0;
    L_0x0058:
        if (r5 != 0) goto L_0x006a;
    L_0x005a:
        r5 = r3.getAccuracy();
        r4 = r4.getAccuracy();
        r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r4 >= 0) goto L_0x0067;
    L_0x0066:
        goto L_0x0068;
    L_0x0067:
        r9 = 0;
    L_0x0068:
        if (r9 == 0) goto L_0x007c;
    L_0x006a:
        r0.a(r3);
        if (r3 == 0) goto L_0x0078;
    L_0x006f:
        r4 = defpackage.ncu.b(r3);
        if (r4 == 0) goto L_0x0078;
    L_0x0075:
        r0.i();
    L_0x0078:
        r12.c = r3;
        r12.d = r1;
    L_0x007c:
        return;
    L_0x007d:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x007d }
        throw r0;
    L_0x0080:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x0080 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nci.run():void");
    }
}
