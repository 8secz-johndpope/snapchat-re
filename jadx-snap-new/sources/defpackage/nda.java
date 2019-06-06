package defpackage;

import android.location.Location;
import defpackage.ndz.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: nda */
public final class nda implements ajdr<Location>, ajej, a {
    private ajdq<Location> a;
    private AtomicBoolean b = new AtomicBoolean(false);
    private Location c;
    private final ndz d;
    private final ndw e;
    private final ndg f;

    public nda(ndz ndz, ndw ndw, ndg ndg) {
        akcr.b(ndz, "userCurrentLocationProvider");
        akcr.b(ndg, "gpsPoller");
        this.d = ndz;
        this.e = ndw;
        this.f = ndg;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:52:0x00b4 in {2, 4, 9, 10, 15, 18, 19, 21, 24, 25, 27, 30, 31, 35, 36, 38, 39, 42, 47, 48, 51} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(android.location.Location r12) {
        /*
        r11 = this;
        r0 = r11.b;
        r0 = r0.get();
        if (r0 == 0) goto L_0x0009;
        return;
        if (r12 != 0) goto L_0x000c;
        return;
        r0 = r11.e;
        if (r0 != 0) goto L_0x0018;
        r0 = r11.a;
        if (r0 == 0) goto L_0x0017;
        r0.a(r12);
        return;
        monitor-enter(r11);
        r0 = r11.e;	 Catch:{ all -> 0x00b1 }
        r1 = r11.c;	 Catch:{ all -> 0x00b1 }
        r2 = "current";	 Catch:{ all -> 0x00b1 }
        defpackage.akcr.b(r12, r2);	 Catch:{ all -> 0x00b1 }
        r2 = 0;	 Catch:{ all -> 0x00b1 }
        r3 = 1;	 Catch:{ all -> 0x00b1 }
        if (r1 != 0) goto L_0x0028;	 Catch:{ all -> 0x00b1 }
        r0 = 1;	 Catch:{ all -> 0x00b1 }
        goto L_0x00a1;	 Catch:{ all -> 0x00b1 }
        r4 = r0.a;	 Catch:{ all -> 0x00b1 }
        r4 = r4.a;	 Catch:{ all -> 0x00b1 }
        r6 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x00b1 }
        r7 = r12.getElapsedRealtimeNanos();	 Catch:{ all -> 0x00b1 }
        r9 = r1.getElapsedRealtimeNanos();	 Catch:{ all -> 0x00b1 }
        r7 = r7 - r9;	 Catch:{ all -> 0x00b1 }
        r6 = r6.toMillis(r7);	 Catch:{ all -> 0x00b1 }
        r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));	 Catch:{ all -> 0x00b1 }
        if (r8 <= 0) goto L_0x0041;	 Catch:{ all -> 0x00b1 }
        r4 = 1;	 Catch:{ all -> 0x00b1 }
        goto L_0x0042;	 Catch:{ all -> 0x00b1 }
        r4 = 0;	 Catch:{ all -> 0x00b1 }
        if (r4 == 0) goto L_0x0045;	 Catch:{ all -> 0x00b1 }
        goto L_0x0026;	 Catch:{ all -> 0x00b1 }
        r4 = r0.a;	 Catch:{ all -> 0x00b1 }
        r4 = r4.c;	 Catch:{ all -> 0x00b1 }
        r5 = "current";	 Catch:{ all -> 0x00b1 }
        defpackage.akcr.b(r12, r5);	 Catch:{ all -> 0x00b1 }
        r5 = "previous";	 Catch:{ all -> 0x00b1 }
        defpackage.akcr.b(r1, r5);	 Catch:{ all -> 0x00b1 }
        r5 = r1.getAccuracy();	 Catch:{ all -> 0x00b1 }
        r6 = r12.getAccuracy();	 Catch:{ all -> 0x00b1 }
        r4 = r4 * r6;	 Catch:{ all -> 0x00b1 }
        r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));	 Catch:{ all -> 0x00b1 }
        if (r4 <= 0) goto L_0x0062;	 Catch:{ all -> 0x00b1 }
        r4 = 1;	 Catch:{ all -> 0x00b1 }
        goto L_0x0063;	 Catch:{ all -> 0x00b1 }
        r4 = 0;	 Catch:{ all -> 0x00b1 }
        if (r4 == 0) goto L_0x0066;	 Catch:{ all -> 0x00b1 }
        goto L_0x0026;	 Catch:{ all -> 0x00b1 }
        r4 = "current";	 Catch:{ all -> 0x00b1 }
        defpackage.akcr.b(r12, r4);	 Catch:{ all -> 0x00b1 }
        r4 = "previous";	 Catch:{ all -> 0x00b1 }
        defpackage.akcr.b(r1, r4);	 Catch:{ all -> 0x00b1 }
        r4 = r12.getAccuracy();	 Catch:{ all -> 0x00b1 }
        r5 = r1.getAccuracy();	 Catch:{ all -> 0x00b1 }
        r4 = r4 / r5;	 Catch:{ all -> 0x00b1 }
        r5 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;	 Catch:{ all -> 0x00b1 }
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));	 Catch:{ all -> 0x00b1 }
        if (r4 < 0) goto L_0x0081;	 Catch:{ all -> 0x00b1 }
        r4 = 1;	 Catch:{ all -> 0x00b1 }
        goto L_0x0082;	 Catch:{ all -> 0x00b1 }
        r4 = 0;	 Catch:{ all -> 0x00b1 }
        if (r4 != 0) goto L_0x00a0;	 Catch:{ all -> 0x00b1 }
        r0 = r0.a;	 Catch:{ all -> 0x00b1 }
        r0 = r0.b;	 Catch:{ all -> 0x00b1 }
        r4 = "current";	 Catch:{ all -> 0x00b1 }
        defpackage.akcr.b(r12, r4);	 Catch:{ all -> 0x00b1 }
        r4 = "previous";	 Catch:{ all -> 0x00b1 }
        defpackage.akcr.b(r1, r4);	 Catch:{ all -> 0x00b1 }
        r1 = r12.distanceTo(r1);	 Catch:{ all -> 0x00b1 }
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));	 Catch:{ all -> 0x00b1 }
        if (r0 < 0) goto L_0x009c;	 Catch:{ all -> 0x00b1 }
        r0 = 1;	 Catch:{ all -> 0x00b1 }
        goto L_0x009d;	 Catch:{ all -> 0x00b1 }
        r0 = 0;	 Catch:{ all -> 0x00b1 }
        if (r0 == 0) goto L_0x00a0;	 Catch:{ all -> 0x00b1 }
        goto L_0x0026;	 Catch:{ all -> 0x00b1 }
        r0 = 0;	 Catch:{ all -> 0x00b1 }
        if (r0 == 0) goto L_0x00a6;	 Catch:{ all -> 0x00b1 }
        r11.c = r12;	 Catch:{ all -> 0x00b1 }
        r2 = 1;
        monitor-exit(r11);
        if (r2 == 0) goto L_0x00b0;
        r0 = r11.a;
        if (r0 == 0) goto L_0x00b0;
        r0.a(r12);
        return;
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nda.a(android.location.Location):void");
    }

    public final void dispose() {
        this.b.set(true);
        this.d.b((a) this);
        ajdq ajdq = this.a;
        if (ajdq != null) {
            ajdq.a(null);
        }
    }

    public final boolean isDisposed() {
        return this.b.get();
    }

    public final void subscribe(ajdq<Location> ajdq) {
        akcr.b(ajdq, "observableEmitter");
        this.a = ajdq;
        ajdq ajdq2 = this.a;
        if (ajdq2 != null) {
            ajdq2.a((ajej) this);
        }
        this.d.a((a) this);
        this.f.a();
    }
}
