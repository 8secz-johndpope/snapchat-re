package defpackage;

import android.os.SystemClock;
import defpackage.kom.b;
import java.util.Collections;
import java.util.List;

/* renamed from: kpe */
public final class kpe implements kpc {
    final kos a;
    final koy b;
    private final kpi c;
    private final zfw d;
    private final Object e = new Object();
    private final aipn<ilv> f;
    private final aipn<dib> g;
    private boolean h = true;
    private long i = 120000;

    public kpe(kos kos, kpi kpi, koy koy, aipn<kpd> aipn, aipn<ilv> aipn2, aipn<dib> aipn3) {
        this.a = kos;
        this.c = kpi;
        this.b = koy;
        this.d = zgb.a(kot.a.callsite("CodecLeasingEngineImpl"));
        this.f = aipn2;
        this.g = aipn3;
        ((kpd) aipn.get()).a().b((ajdw) this.d.f()).e(new -$$Lambda$kpe$IUs7GZA9X2SK-1veexAwKEvVjDw(this));
        ((kpd) aipn.get()).b().b((ajdw) this.d.f()).e(new -$$Lambda$kpe$rsKHHRevKHMWPFtAguz4QpA5f3o(this));
    }

    private void a(aadv aadv) {
        koo d = this.a.d();
        aadv.e = Long.valueOf((long) this.a.c());
        aadv.f = d.a.toString();
        aadv.g = d.b.toString();
        aadv.h = Long.valueOf(this.b.b());
        aadv.i = Long.valueOf(this.b.c());
        ((dib) this.g.get()).a((aajt) aadv);
    }

    private void b() {
        for (kor kor : this.c.a(this.a.c)) {
            b(c(kor));
            this.a.a(kor);
            kos kos = this.a;
            String name = kor.c.a.getName();
            List list = (List) kos.c.get(name);
            if (list != null && list.remove(kor)) {
                if (list.isEmpty()) {
                    kos.c.remove(name);
                }
                kos.d.remove(kor);
            }
        }
    }

    private kom c(kor kor) {
        kom kom = new kom(kor);
        this.b.a(kom);
        return kom;
    }

    private void d(kor kor) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - kor.e;
        aadv aadv = new aadv();
        aadv.a = Boolean.FALSE;
        aadv.b = kor.a;
        aadv.c = kor.b.toString();
        aadv.d = kor.c.toString();
        aadv.j = Long.valueOf(elapsedRealtime);
        a(aadv);
        String str = "use_case";
        ((ilv) this.f.get()).c(iol.CODEC_LEASE_GRANT.a(str, kor.b), 1);
        ((ilv) this.f.get()).a(iol.CODEC_LEASE_GRANT.a(str, kor.b), elapsedRealtime);
        ((ilv) this.f.get()).b(iol.CODEC_LEASE_GRANT.a(str, kor.b), (long) this.a.c());
    }

    /* JADX WARNING: Missing block: B:22:0x007a, code skipped:
            return r1;
     */
    public final defpackage.kom a(defpackage.kor r8) {
        /*
        r7 = this;
        r0 = r7.e;
        monitor-enter(r0);
        r1 = r7.h;	 Catch:{ all -> 0x007b }
        if (r1 != 0) goto L_0x0013;
    L_0x0007:
        r1 = new kom;	 Catch:{ all -> 0x007b }
        r1.<init>(r8);	 Catch:{ all -> 0x007b }
        r8 = defpackage.kom.b.GRANTED;	 Catch:{ all -> 0x007b }
        r1.a(r8);	 Catch:{ all -> 0x007b }
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        return r1;
    L_0x0013:
        r1 = r8.b;	 Catch:{ all -> 0x007b }
        r1 = r1.mPriority;	 Catch:{ all -> 0x007b }
        r2 = defpackage.kop.HIGH;	 Catch:{ all -> 0x007b }
        if (r1 == r2) goto L_0x0021;
    L_0x001b:
        r8 = r7.b(r8);	 Catch:{ all -> 0x007b }
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        return r8;
    L_0x0021:
        r1 = r7.c(r8);	 Catch:{ all -> 0x007b }
        r2 = defpackage.kom.b.GRANTING;	 Catch:{ all -> 0x007b }
        r1.a(r2);	 Catch:{ all -> 0x007b }
        r2 = r7.a;	 Catch:{ all -> 0x007b }
        r2.a(r1);	 Catch:{ all -> 0x007b }
        r2 = r8.d;	 Catch:{ all -> 0x007b }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ all -> 0x007b }
        r2 = defpackage.koy.a(r2);	 Catch:{ all -> 0x007b }
        r2 = r2.a();	 Catch:{ all -> 0x007b }
        r4 = r7.b;	 Catch:{ all -> 0x007b }
        r4 = r4.a();	 Catch:{ all -> 0x007b }
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x0076;
    L_0x0047:
        r4 = r7.a;	 Catch:{ all -> 0x007b }
        r4 = r4.b();	 Catch:{ all -> 0x007b }
        if (r4 <= 0) goto L_0x0060;
    L_0x004f:
        r8 = r7.d;	 Catch:{ all -> 0x007b }
        r8 = r8.h();	 Catch:{ all -> 0x007b }
        r8 = (defpackage.ajdw) r8;	 Catch:{ all -> 0x007b }
        r4 = new kpe$1;	 Catch:{ all -> 0x007b }
        r4.<init>(r2, r1);	 Catch:{ all -> 0x007b }
        r8.a(r4);	 Catch:{ all -> 0x007b }
        goto L_0x0079;
    L_0x0060:
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x007b }
        r2 = "The total codec resources is not enough for the request(%s)";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x007b }
        r4 = 0;
        r8 = r8.toString();	 Catch:{ all -> 0x007b }
        r3[r4] = r8;	 Catch:{ all -> 0x007b }
        r8 = java.lang.String.format(r2, r3);	 Catch:{ all -> 0x007b }
        r1.<init>(r8);	 Catch:{ all -> 0x007b }
        throw r1;	 Catch:{ all -> 0x007b }
    L_0x0076:
        r7.b(r1);	 Catch:{ all -> 0x007b }
    L_0x0079:
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        return r1;
    L_0x007b:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpe.a(kor):kom");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003a */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|12|13|14|15) */
    public final void a() {
        /*
        r7 = this;
        r0 = r7.e;
        monitor-enter(r0);
        r1 = r7.h;	 Catch:{ all -> 0x0050 }
        if (r1 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x0050 }
        return;
    L_0x0009:
        r1 = r7.a;	 Catch:{ all -> 0x0050 }
        r1 = r1.a();	 Catch:{ all -> 0x0050 }
        if (r1 != 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x0050 }
        return;
    L_0x0013:
        r1 = 1;
        r3 = r7.f;	 Catch:{ InterruptedException -> 0x003a }
        r3 = r3.get();	 Catch:{ InterruptedException -> 0x003a }
        r3 = (defpackage.ilv) r3;	 Catch:{ InterruptedException -> 0x003a }
        r4 = defpackage.iol.CODEC_LEASE_AWAITED;	 Catch:{ InterruptedException -> 0x003a }
        r5 = "leases";
        r6 = r7.a;	 Catch:{ InterruptedException -> 0x003a }
        r6 = r6.c();	 Catch:{ InterruptedException -> 0x003a }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ InterruptedException -> 0x003a }
        r4 = r4.a(r5, r6);	 Catch:{ InterruptedException -> 0x003a }
        r3.c(r4, r1);	 Catch:{ InterruptedException -> 0x003a }
        r3 = r7.e;	 Catch:{ InterruptedException -> 0x003a }
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r3.wait(r4);	 Catch:{ InterruptedException -> 0x003a }
        goto L_0x004e;
    L_0x003a:
        r3 = r7.f;	 Catch:{ all -> 0x0050 }
        r3 = r3.get();	 Catch:{ all -> 0x0050 }
        r3 = (defpackage.ilv) r3;	 Catch:{ all -> 0x0050 }
        r4 = defpackage.iol.CODEC_LEASE_AWAIT_INTERRUPTED;	 Catch:{ all -> 0x0050 }
        r3.c(r4, r1);	 Catch:{ all -> 0x0050 }
        r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0050 }
        r1.interrupt();	 Catch:{ all -> 0x0050 }
    L_0x004e:
        monitor-exit(r0);	 Catch:{ all -> 0x0050 }
        return;
    L_0x0050:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0050 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpe.a():void");
    }

    public final void a(koj koj, idd idd) {
        aadv aadv = new aadv();
        aadv.a = Boolean.TRUE;
        aadv.c = koj.toString();
        aadv.d = idd.toString();
        synchronized (this.e) {
            a(aadv);
        }
        ((ilv) this.f.get()).c(iol.CODEC_EXHAUSTION.a("use_case", (Enum) koj), 1);
        ((ilv) this.f.get()).b(iol.CODEC_EXHAUSTION.a("use_case", (Enum) koj), (long) this.a.c());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x00c0 in {5, 10, 13, 16, 17, 20, 23, 30, 32, 35} preds:[]
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
    public final void a(defpackage.kom r10) {
        /*
        r9 = this;
        r0 = r9.e;
        monitor-enter(r0);
        if (r10 != 0) goto L_0x0007;
        monitor-exit(r0);	 Catch:{ all -> 0x00bd }
        return;	 Catch:{ all -> 0x00bd }
        r1 = r9.h;	 Catch:{ all -> 0x00bd }
        if (r1 != 0) goto L_0x0012;	 Catch:{ all -> 0x00bd }
        r1 = defpackage.kom.b.INVALID;	 Catch:{ all -> 0x00bd }
        r10.a(r1);	 Catch:{ all -> 0x00bd }
        monitor-exit(r0);	 Catch:{ all -> 0x00bd }
        return;	 Catch:{ all -> 0x00bd }
        r1 = r9.a;	 Catch:{ all -> 0x00bd }
        r2 = r1.a;	 Catch:{ all -> 0x00bd }
        r2 = r2.remove(r10);	 Catch:{ all -> 0x00bd }
        r3 = 0;	 Catch:{ all -> 0x00bd }
        r4 = 1;	 Catch:{ all -> 0x00bd }
        if (r2 == 0) goto L_0x0020;	 Catch:{ all -> 0x00bd }
        r1 = 1;	 Catch:{ all -> 0x00bd }
        goto L_0x0031;	 Catch:{ all -> 0x00bd }
        r2 = r1.b;	 Catch:{ all -> 0x00bd }
        r2 = r2.remove(r10);	 Catch:{ all -> 0x00bd }
        if (r2 == 0) goto L_0x0030;	 Catch:{ all -> 0x00bd }
        r2 = r10.c;	 Catch:{ all -> 0x00bd }
        r1 = r1.d;	 Catch:{ all -> 0x00bd }
        r1.remove(r2);	 Catch:{ all -> 0x00bd }
        goto L_0x001e;	 Catch:{ all -> 0x00bd }
        r1 = 0;	 Catch:{ all -> 0x00bd }
        if (r1 != 0) goto L_0x0035;	 Catch:{ all -> 0x00bd }
        monitor-exit(r0);	 Catch:{ all -> 0x00bd }
        return;	 Catch:{ all -> 0x00bd }
        r1 = r9.a;	 Catch:{ all -> 0x00bd }
        r1 = r1.a();	 Catch:{ all -> 0x00bd }
        if (r1 != 0) goto L_0x0042;	 Catch:{ all -> 0x00bd }
        r1 = r9.e;	 Catch:{ all -> 0x00bd }
        r1.notify();	 Catch:{ all -> 0x00bd }
        r1 = defpackage.kom.b.INVALID;	 Catch:{ all -> 0x00bd }
        r10.a(r1);	 Catch:{ all -> 0x00bd }
        r1 = r9.b;	 Catch:{ all -> 0x00bd }
        r10 = r10.c;	 Catch:{ all -> 0x00bd }
        r10 = r10.d;	 Catch:{ all -> 0x00bd }
        r10 = java.util.Collections.unmodifiableList(r10);	 Catch:{ all -> 0x00bd }
        r1 = r1.a;	 Catch:{ all -> 0x00bd }
        r10 = defpackage.koy.a(r10);	 Catch:{ all -> 0x00bd }
        r1 = r1.b;	 Catch:{ all -> 0x00bd }
        r2 = "other";	 Catch:{ all -> 0x00bd }
        defpackage.akcr.b(r10, r2);	 Catch:{ all -> 0x00bd }
        r5 = r1.a;	 Catch:{ all -> 0x00bd }
        r7 = r10.a;	 Catch:{ all -> 0x00bd }
        r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));	 Catch:{ all -> 0x00bd }
        if (r2 < 0) goto L_0x0081;	 Catch:{ all -> 0x00bd }
        r5 = r1.b;	 Catch:{ all -> 0x00bd }
        r7 = r10.b;	 Catch:{ all -> 0x00bd }
        r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));	 Catch:{ all -> 0x00bd }
        if (r2 < 0) goto L_0x0081;	 Catch:{ all -> 0x00bd }
        r2 = r1.a;	 Catch:{ all -> 0x00bd }
        r4 = r10.a;	 Catch:{ all -> 0x00bd }
        r2 = r2 - r4;	 Catch:{ all -> 0x00bd }
        r1.a = r2;	 Catch:{ all -> 0x00bd }
        r2 = r1.b;	 Catch:{ all -> 0x00bd }
        r4 = r10.b;	 Catch:{ all -> 0x00bd }
        r2 = r2 - r4;	 Catch:{ all -> 0x00bd }
        r1.b = r2;	 Catch:{ all -> 0x00bd }
        r9.b();	 Catch:{ all -> 0x00bd }
        monitor-exit(r0);	 Catch:{ all -> 0x00bd }
        return;	 Catch:{ all -> 0x00bd }
        r2 = "The working codec resource is not enough. encoder pixel count=%d, decoder pixel count=%d, to be removed encoder pixel count=%d, to be removed decoder pixel count=%d";	 Catch:{ all -> 0x00bd }
        r5 = 4;	 Catch:{ all -> 0x00bd }
        r6 = new java.lang.Object[r5];	 Catch:{ all -> 0x00bd }
        r7 = r1.a;	 Catch:{ all -> 0x00bd }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x00bd }
        r6[r3] = r7;	 Catch:{ all -> 0x00bd }
        r7 = r1.b;	 Catch:{ all -> 0x00bd }
        r1 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x00bd }
        r6[r4] = r1;	 Catch:{ all -> 0x00bd }
        r1 = 2;	 Catch:{ all -> 0x00bd }
        r3 = r10.a;	 Catch:{ all -> 0x00bd }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x00bd }
        r6[r1] = r3;	 Catch:{ all -> 0x00bd }
        r1 = 3;	 Catch:{ all -> 0x00bd }
        r3 = r10.b;	 Catch:{ all -> 0x00bd }
        r10 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x00bd }
        r6[r1] = r10;	 Catch:{ all -> 0x00bd }
        r10 = java.util.Arrays.copyOf(r6, r5);	 Catch:{ all -> 0x00bd }
        r10 = java.lang.String.format(r2, r10);	 Catch:{ all -> 0x00bd }
        r1 = "java.lang.String.format(format, *args)";	 Catch:{ all -> 0x00bd }
        defpackage.akcr.a(r10, r1);	 Catch:{ all -> 0x00bd }
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x00bd }
        r1.<init>(r10);	 Catch:{ all -> 0x00bd }
        r1 = (java.lang.Throwable) r1;	 Catch:{ all -> 0x00bd }
        throw r1;	 Catch:{ all -> 0x00bd }
        r10 = move-exception;	 Catch:{ all -> 0x00bd }
        monitor-exit(r0);	 Catch:{ all -> 0x00bd }
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpe.a(kom):void");
    }

    public final kom b(kor kor) {
        synchronized (this.e) {
            kom a;
            if (!this.h) {
                kom kom = new kom(kor);
                kom.a(b.GRANTED);
                return kom;
            } else if (kor.b.mPriority == kop.HIGH) {
                a = a(kor);
                return a;
            } else {
                a = c(kor);
                this.a.a(a);
                b(a);
                return a;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(kom kom) {
        kom.a(b.GRANTED);
        this.b.b(Collections.unmodifiableList(kom.c.d));
        for (kom a : this.a.a(this.i)) {
            a(a);
        }
        d(kom.c);
    }
}
