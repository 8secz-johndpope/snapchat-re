package defpackage;

import android.net.TrafficStats;
import android.os.Process;

/* renamed from: dbg */
public final class dbg extends dat<dbf> {
    private final long[] a = new long[8];
    private final long[] b = new long[8];
    private final long[] c = new long[8];
    private final long[] d = new long[8];
    private final int e = Process.myUid();
    private final long[] f = new long[8];
    private final long[] g = new long[8];
    private long h = TrafficStats.getUidTxBytes(this.e);
    private long i = TrafficStats.getUidRxBytes(this.e);
    private long j = TrafficStats.getUidTxPackets(this.e);
    private long k = TrafficStats.getUidRxPackets(this.e);
    private int l = 0;
    private final ajwy<zgb> m;
    private final ajwy<ifa> n;
    private ajej o;

    public dbg(ajwy<ifa> ajwy, ajwy<zgb> ajwy2) {
        this.m = ajwy2;
        this.n = ajwy;
        this.o = ajfq.INSTANCE;
    }

    /* JADX WARNING: Missing block: B:27:0x0091, code skipped:
            return false;
     */
    private synchronized boolean a(defpackage.dbf r11) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.isDisposed();	 Catch:{ all -> 0x0092 }
        r1 = 0;
        if (r0 != 0) goto L_0x0090;
    L_0x0008:
        r0 = r10.a;	 Catch:{ all -> 0x0092 }
        r0 = r10.a(r0);	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x0090;
    L_0x0010:
        r0 = r10.c;	 Catch:{ all -> 0x0092 }
        r0 = r10.b(r0);	 Catch:{ all -> 0x0092 }
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x0090;
    L_0x0019:
        r0 = r10.a;	 Catch:{ all -> 0x0094 }
        r2 = r10.b;	 Catch:{ all -> 0x0094 }
        r0 = defpackage.dbg.a(r0, r2);	 Catch:{ all -> 0x0094 }
        r2 = 1;
        if (r0 == 0) goto L_0x0030;
    L_0x0024:
        r0 = r10.c;	 Catch:{ all -> 0x0094 }
        r3 = r10.d;	 Catch:{ all -> 0x0094 }
        r0 = defpackage.dbg.a(r0, r3);	 Catch:{ all -> 0x0094 }
        if (r0 == 0) goto L_0x0030;
    L_0x002e:
        r0 = 1;
        goto L_0x0031;
    L_0x0030:
        r0 = 0;
    L_0x0031:
        if (r0 != 0) goto L_0x0036;
    L_0x0033:
        r10.dispose();	 Catch:{ all -> 0x0094 }
    L_0x0036:
        r0 = r10.isDisposed();	 Catch:{ all -> 0x0094 }
        if (r0 == 0) goto L_0x003e;
    L_0x003c:
        monitor-exit(r10);
        return r1;
    L_0x003e:
        r3 = 0;
        r11.a = r3;	 Catch:{ all -> 0x0094 }
        r11.b = r3;	 Catch:{ all -> 0x0094 }
        r11.c = r3;	 Catch:{ all -> 0x0094 }
        r11.d = r3;	 Catch:{ all -> 0x0094 }
        r11.e = r3;	 Catch:{ all -> 0x0094 }
        r11.f = r3;	 Catch:{ all -> 0x0094 }
        r11.g = r3;	 Catch:{ all -> 0x0094 }
        r11.h = r3;	 Catch:{ all -> 0x0094 }
        r0 = r10.a;	 Catch:{ all -> 0x0094 }
        r3 = r10.c;	 Catch:{ all -> 0x0094 }
        r4 = r11.a;	 Catch:{ all -> 0x0094 }
        r6 = 3;
        r7 = r0[r6];	 Catch:{ all -> 0x0094 }
        r4 = r4 + r7;
        r11.a = r4;	 Catch:{ all -> 0x0094 }
        r4 = r11.b;	 Catch:{ all -> 0x0094 }
        r7 = 2;
        r8 = r0[r7];	 Catch:{ all -> 0x0094 }
        r4 = r4 + r8;
        r11.b = r4;	 Catch:{ all -> 0x0094 }
        r4 = r11.c;	 Catch:{ all -> 0x0094 }
        r8 = r0[r2];	 Catch:{ all -> 0x0094 }
        r4 = r4 + r8;
        r11.c = r4;	 Catch:{ all -> 0x0094 }
        r4 = r11.d;	 Catch:{ all -> 0x0094 }
        r8 = r0[r1];	 Catch:{ all -> 0x0094 }
        r4 = r4 + r8;
        r11.d = r4;	 Catch:{ all -> 0x0094 }
        r4 = r11.e;	 Catch:{ all -> 0x0094 }
        r8 = r3[r6];	 Catch:{ all -> 0x0094 }
        r4 = r4 + r8;
        r11.e = r4;	 Catch:{ all -> 0x0094 }
        r4 = r11.f;	 Catch:{ all -> 0x0094 }
        r6 = r3[r7];	 Catch:{ all -> 0x0094 }
        r4 = r4 + r6;
        r11.f = r4;	 Catch:{ all -> 0x0094 }
        r4 = r11.g;	 Catch:{ all -> 0x0094 }
        r6 = r3[r2];	 Catch:{ all -> 0x0094 }
        r4 = r4 + r6;
        r11.g = r4;	 Catch:{ all -> 0x0094 }
        r4 = r11.h;	 Catch:{ all -> 0x0094 }
        r0 = r3[r1];	 Catch:{ all -> 0x0094 }
        r4 = r4 + r0;
        r11.h = r4;	 Catch:{ all -> 0x0094 }
        monitor-exit(r10);
        return r2;
    L_0x0090:
        monitor-exit(r10);
        return r1;
    L_0x0092:
        r11 = move-exception;
        throw r11;	 Catch:{ all -> 0x0094 }
    L_0x0094:
        r11 = move-exception;
        throw r11;	 Catch:{ all -> 0x0096 }
    L_0x0096:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbg.a(dbf):boolean");
    }

    private synchronized boolean a(long[] jArr) {
        if (isDisposed()) {
            return false;
        }
        e();
        System.arraycopy(this.f, 0, jArr, 0, jArr.length);
        return !isDisposed();
    }

    private static boolean a(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] < jArr2[i]) {
                return false;
            }
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return true;
    }

    private synchronized boolean b(long[] jArr) {
        if (isDisposed()) {
            return false;
        }
        e();
        System.arraycopy(this.g, 0, jArr, 0, jArr.length);
        return !isDisposed();
    }

    private synchronized void e() {
        synchronized (this) {
            long uidTxBytes = TrafficStats.getUidTxBytes(this.e);
            long uidRxBytes = TrafficStats.getUidRxBytes(this.e);
            long uidTxPackets = TrafficStats.getUidTxPackets(this.e);
            long uidRxPackets = TrafficStats.getUidRxPackets(this.e);
            if (!(uidRxBytes == -1 || uidTxBytes == -1 || uidRxPackets == -1)) {
                if (uidTxPackets != -1) {
                    int i = this.l == 1 ? 0 : 2;
                    long[] jArr = this.f;
                    int i2 = i | 1;
                    jArr[i2] = jArr[i2] + (uidTxBytes - this.h);
                    long[] jArr2 = this.f;
                    i |= 0;
                    long j = uidTxBytes;
                    jArr2[i] = jArr2[i] + (uidRxBytes - this.i);
                    long[] jArr3 = this.g;
                    jArr3[i2] = jArr3[i2] + (uidTxPackets - this.j);
                    jArr3 = this.g;
                    jArr3[i] = jArr3[i] + (uidRxPackets - this.k);
                    this.h = j;
                    this.i = uidRxBytes;
                    this.j = uidTxPackets;
                    this.k = uidRxPackets;
                    return;
                }
            }
            dispose();
        }
    }

    public final /* synthetic */ das b() {
        return new dbf();
    }

    public final synchronized void d() {
        if (!isDisposed()) {
            ajdp e = ((ifa) this.n.get()).e();
            this.m.get();
            this.o = e.b((ajdw) zgb.a(dad.a.callsite("NetworkMetricsCollector")).j()).a(-$$Lambda$Ak8QL176mRumGTfug98PPjKgiWY.INSTANCE).p(-$$Lambda$vXGM0H5Yl_rA94tLCo0jBnSyXeg.INSTANCE).p(-$$Lambda$qRMvwc6xchxdkuV6zXxiD_AT3nA.INSTANCE).j(ajfu.a).f(new -$$Lambda$dbg$Mbe4Du7datenJaoagYuLaI_abu8(this));
        }
    }

    public final synchronized void dispose() {
        if (!isDisposed()) {
            this.o.dispose();
            super.dispose();
        }
    }
}
