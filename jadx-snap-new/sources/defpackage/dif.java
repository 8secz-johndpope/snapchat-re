package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.common.base.MoreObjects;
import com.snap.blizzard.BlizzardDurableJob;
import defpackage.dit.a;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: dif */
public final class dif implements dkx {
    private List<dks> A;
    private BlockingQueue<String> B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private Set<String> J;
    private long K;
    private AtomicBoolean L = new AtomicBoolean(false);
    private AtomicBoolean M = new AtomicBoolean(false);
    private ajei N = new ajei();
    private final ajdw O;
    private long P;
    private ajwr<Boolean> Q = null;
    private int R = 0;
    @Deprecated
    private Runnable S = new -$$Lambda$dif$3lll3uiy7tl9YA7QFcTK4_jk_I4(this);
    zyq a;
    final dij b;
    final ilv c;
    AtomicBoolean d = new AtomicBoolean(true);
    boolean e;
    ajwo<aajt> f;
    @Deprecated
    Runnable g = new -$$Lambda$d7JrjbUzGzHy2BQDb0zp33xOVVc(this);
    private final din h;
    private final abss i;
    private final dii j;
    private final dle k;
    private final dje l;
    private final dku m;
    private final dio n;
    private final dll o;
    private final diz p;
    private final ifa q;
    private final aipn<hwl> r;
    private final AtomicBoolean s = new AtomicBoolean();
    private final AtomicBoolean t = new AtomicBoolean();
    private final AtomicBoolean u = new AtomicBoolean();
    private final AtomicBoolean v = new AtomicBoolean();
    private final AtomicLong w = new AtomicLong();
    private final AtomicLong x = new AtomicLong();
    private final AtomicLong y = new AtomicLong();
    private final AtomicBoolean z = new AtomicBoolean();

    public dif(zyq zyq, dij dij, ajdw ajdw, abss abss, dii dii, dje dje, ilv ilv, dku dku, dio dio, dle dle, din din, dll dll, ifa ifa, diz diz, aipn<hwl> aipn) {
        this.a = zyq;
        this.h = din;
        this.b = dij;
        this.i = abss;
        this.j = dii;
        this.k = dle;
        this.O = ajdw;
        dle dle2 = this.k;
        akcr.b(this, "<set-?>");
        dle2.a = this;
        this.m = dku;
        this.n = dio;
        this.l = dje;
        this.c = ilv;
        this.o = dll;
        this.q = ifa;
        this.p = diz;
        this.A = new LinkedList();
        this.r = aipn;
    }

    private ajej a(BlizzardDurableJob blizzardDurableJob) {
        return ((hwl) this.r.get()).a((hwg) blizzardDurableJob).a(new -$$Lambda$dif$N0JpHNASgEu5l5GLo9VnPEtpBmQ(blizzardDurableJob), new -$$Lambda$dif$s5-qkCZ6dlGgt90cBKjRVRqzL28(blizzardDurableJob));
    }

    @Deprecated
    private void a(long j) {
        f();
        if (this.s.compareAndSet(false, true)) {
            this.b.a(this.S, j);
        }
    }

    private void a(dks dks) {
        BlockingQueue blockingQueue = this.B;
        if (blockingQueue != null) {
            blockingQueue.offer(dih.a(dks.a));
        }
    }

    private void a(dks dks, boolean z) {
        this.A.add(dks);
        if (dhx.c.contains(dks.c())) {
            this.R++;
        }
        if (z && !f()) {
            c();
        }
    }

    private void a(dkt dkt) {
        try {
            this.n.a(dkt);
        } catch (diq unused) {
            i();
        }
    }

    private void a(dlf dlf) {
        aajt aaaj = new aaaj();
        aaaj.i = Long.valueOf((long) dlf.k.b());
        aaaj.g = Long.valueOf(dlf.k.c);
        aaaj.d = Long.valueOf(dlf.f);
        aaaj.c = Long.valueOf(dlf.d);
        aaaj.a = Long.valueOf((long) dlf.g);
        boolean z = dlf.c && dlf.g >= Callback.DEFAULT_DRAG_ANIMATION_DURATION && dlf.g <= 299;
        aaaj.b = Boolean.valueOf(z);
        aaaj.e = Double.valueOf((double) dlf.b);
        aaaj.f = dlf.i;
        aaaj.setLogQueueName(this.a.a);
        aaaj.h = this.l.c();
        this.j.a(aaaj);
        a(aaaj, true, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x008e in {6, 12, 20, 21, 23, 27, 28, 30} preds:[]
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
    private void a(java.util.List<defpackage.aajt> r7) {
        /*
        r6 = this;
        r0 = r6.c;	 Catch:{ all -> 0x008c }
        r1 = defpackage.ino.EVENT_BURST_BATCH_SIZE;	 Catch:{ all -> 0x008c }
        r2 = "logQ";	 Catch:{ all -> 0x008c }
        r3 = r6.a;	 Catch:{ all -> 0x008c }
        r3 = r3.a;	 Catch:{ all -> 0x008c }
        r3 = defpackage.dih.b(r3);	 Catch:{ all -> 0x008c }
        r1 = r1.a(r2, r3);	 Catch:{ all -> 0x008c }
        r2 = r7.size();	 Catch:{ all -> 0x008c }
        r2 = (long) r2;	 Catch:{ all -> 0x008c }
        r0.b(r1, r2);	 Catch:{ all -> 0x008c }
        r7 = r7.iterator();	 Catch:{ all -> 0x008c }
        r0 = 0;	 Catch:{ all -> 0x008c }
        r1 = 0;	 Catch:{ all -> 0x008c }
        r2 = 0;	 Catch:{ all -> 0x008c }
        r3 = r7.hasNext();	 Catch:{ all -> 0x008c }
        if (r3 == 0) goto L_0x004c;	 Catch:{ all -> 0x008c }
        r3 = r7.next();	 Catch:{ all -> 0x008c }
        r3 = (defpackage.aajt) r3;	 Catch:{ all -> 0x008c }
        r6.a(r3, r0, r0);	 Catch:{ all -> 0x008c }
        r4 = r3 instanceof defpackage.aaaf;	 Catch:{ all -> 0x008c }
        r5 = 1;	 Catch:{ all -> 0x008c }
        if (r4 == 0) goto L_0x0036;	 Catch:{ all -> 0x008c }
        r2 = 1;	 Catch:{ all -> 0x008c }
        r4 = r6.f();	 Catch:{ all -> 0x008c }
        if (r4 != 0) goto L_0x0021;	 Catch:{ all -> 0x008c }
        if (r1 != 0) goto L_0x0021;	 Catch:{ all -> 0x008c }
        r4 = defpackage.dhx.b;	 Catch:{ all -> 0x008c }
        r3 = r3.getEventName();	 Catch:{ all -> 0x008c }
        r3 = r4.contains(r3);	 Catch:{ all -> 0x008c }
        if (r3 != 0) goto L_0x0021;	 Catch:{ all -> 0x008c }
        r1 = 1;	 Catch:{ all -> 0x008c }
        goto L_0x0021;	 Catch:{ all -> 0x008c }
        r7 = r6.m;	 Catch:{ all -> 0x008c }
        r7.b();	 Catch:{ all -> 0x008c }
        r7 = r6.G;	 Catch:{ all -> 0x008c }
        if (r7 == 0) goto L_0x0080;	 Catch:{ all -> 0x008c }
        r7 = r6.O;	 Catch:{ all -> 0x008c }
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x008c }
        r0 = r7.a(r0);	 Catch:{ all -> 0x008c }
        r7 = r6.w;	 Catch:{ all -> 0x008c }
        r3 = r7.get();	 Catch:{ all -> 0x008c }
        r0 = r0 - r3;	 Catch:{ all -> 0x008c }
        if (r2 != 0) goto L_0x0074;	 Catch:{ all -> 0x008c }
        r7 = r6.A;	 Catch:{ all -> 0x008c }
        r7 = r7.isEmpty();	 Catch:{ all -> 0x008c }
        if (r7 != 0) goto L_0x007c;	 Catch:{ all -> 0x008c }
        r2 = r6.P;	 Catch:{ all -> 0x008c }
        r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ all -> 0x008c }
        if (r7 < 0) goto L_0x007c;	 Catch:{ all -> 0x008c }
        r7 = "logEventBatch";	 Catch:{ all -> 0x008c }
        defpackage.dit.a.a(r7);	 Catch:{ all -> 0x008c }
        r6.e();	 Catch:{ all -> 0x008c }
        r6.j();	 Catch:{ all -> 0x008c }
        return;	 Catch:{ all -> 0x008c }
        r7 = r6.f();	 Catch:{ all -> 0x008c }
        if (r7 != 0) goto L_0x008b;	 Catch:{ all -> 0x008c }
        if (r1 == 0) goto L_0x008b;	 Catch:{ all -> 0x008c }
        r6.c();	 Catch:{ all -> 0x008c }
        return;
        r7 = move-exception;
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dif.a(java.util.List):void");
    }

    private void b(long j) {
        this.b.c();
        this.h.a(j);
    }

    private boolean c(dit dit) {
        ilv ilv;
        ino ino;
        if (dit.b == diu.DURABLE_JOB || dit.b == diu.DURABLE_JOB_FORCED) {
            if (!this.F) {
                return false;
            }
            if (!(this.G || this.d.get())) {
                return false;
            }
        } else if (this.F && !dit.a) {
            return false;
        }
        String str = "logQ";
        if (this.d.get() && this.C && !this.q.k()) {
            ilv = this.c;
            ino = ino.BACKGROUND_UPLOAD_AVOIDED;
        } else if (!this.D || this.q.l()) {
            return h() > 0;
        } else {
            ilv = this.c;
            ino = ino.NO_NETWORK_UPLOAD_AVOIDED;
        }
        ilv.c(ino.a(str, dih.b(this.a.a)), 1);
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:81:0x0219 in {4, 7, 8, 10, 15, 26, 28, 40, 41, 47, 51, 55, 57, 59, 61, 64, 66, 67, 73, 74, 76, 77, 80} preds:[]
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
    private defpackage.ajdx<java.lang.Boolean> d(defpackage.dit r21) {
        /*
        r20 = this;
        r1 = r20;
        r0 = r21;
        r2 = "bg";
        r3 = "trigger";
        r4 = "logQ";
        r5 = r1.b;
        r5.c();
        r5 = 0;
        r6 = r1.c;	 Catch:{ all -> 0x0212 }
        r7 = defpackage.ino.UPLOAD_REQUESTED;	 Catch:{ all -> 0x0212 }
        r8 = r1.a;	 Catch:{ all -> 0x0212 }
        r8 = r8.a;	 Catch:{ all -> 0x0212 }
        r8 = defpackage.dih.b(r8);	 Catch:{ all -> 0x0212 }
        r7 = r7.a(r4, r8);	 Catch:{ all -> 0x0212 }
        r8 = r1.d;	 Catch:{ all -> 0x0212 }
        r8 = r8.get();	 Catch:{ all -> 0x0212 }
        r7 = r7.a(r2, r8);	 Catch:{ all -> 0x0212 }
        r8 = r0.b;	 Catch:{ all -> 0x0212 }
        r7 = r7.a(r3, r8);	 Catch:{ all -> 0x0212 }
        r8 = 1;	 Catch:{ all -> 0x0212 }
        r6.c(r7, r8);	 Catch:{ all -> 0x0212 }
        r6 = r1.A;	 Catch:{ all -> 0x0212 }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x0212 }
        if (r6 != 0) goto L_0x0040;	 Catch:{ all -> 0x0212 }
        r20.e();	 Catch:{ all -> 0x0212 }
        r6 = r20.c(r21);	 Catch:{ all -> 0x0212 }
        if (r6 != 0) goto L_0x0052;	 Catch:{ all -> 0x0212 }
        r0 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0212 }
        r0 = defpackage.ajdx.b(r0);	 Catch:{ all -> 0x0212 }
        r2 = r1.s;
        r2.set(r5);
        return r0;
        r6 = r1.t;	 Catch:{ all -> 0x0212 }
        r7 = 1;	 Catch:{ all -> 0x0212 }
        r6 = r6.compareAndSet(r5, r7);	 Catch:{ all -> 0x0212 }
        if (r6 != 0) goto L_0x005e;	 Catch:{ all -> 0x0212 }
        r0 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0212 }
        goto L_0x0048;
        r6 = 0;
        r14 = r20.g();	 Catch:{ Exception -> 0x01f7, all -> 0x01f3 }
        r10 = r1.n;	 Catch:{ all -> 0x01f1 }
        r11 = r1.a;	 Catch:{ all -> 0x01f1 }
        r11 = r11.i;	 Catch:{ all -> 0x01f1 }
        r11 = r11.longValue();	 Catch:{ all -> 0x01f1 }
        r10 = r10.a(r11);	 Catch:{ all -> 0x01f1 }
        r11 = r10.second;	 Catch:{ Exception -> 0x01f7, all -> 0x01f3 }
        r16 = r11;	 Catch:{ Exception -> 0x01f7, all -> 0x01f3 }
        r16 = (java.util.List) r16;	 Catch:{ Exception -> 0x01f7, all -> 0x01f3 }
        r11 = r16.isEmpty();	 Catch:{ Exception -> 0x01f7, all -> 0x01f3 }
        if (r11 == 0) goto L_0x008b;	 Catch:{ Exception -> 0x01f7, all -> 0x01f3 }
        r0 = java.lang.Boolean.FALSE;	 Catch:{ Exception -> 0x01f7, all -> 0x01f3 }
        r0 = defpackage.ajdx.b(r0);	 Catch:{ Exception -> 0x01f7, all -> 0x01f3 }
        r1.Q = r6;	 Catch:{ all -> 0x0212 }
        r2 = r1.t;	 Catch:{ all -> 0x0212 }
        r2.set(r5);	 Catch:{ all -> 0x0212 }
        goto L_0x004c;
        r12 = new dkt;	 Catch:{ all -> 0x01ed }
        r10 = r10.first;	 Catch:{ all -> 0x01ed }
        r10 = (java.lang.Long) r10;	 Catch:{ all -> 0x01ed }
        r17 = r10.longValue();	 Catch:{ all -> 0x01ed }
        r10 = r12;	 Catch:{ all -> 0x01ed }
        r11 = r16;	 Catch:{ all -> 0x01ed }
        r7 = r12;	 Catch:{ all -> 0x01ed }
        r12 = r17;	 Catch:{ all -> 0x01ed }
        r17 = r14;	 Catch:{ all -> 0x01ed }
        r10.<init>(r11, r12, r14);	 Catch:{ all -> 0x01ed }
        r10 = r1.h;	 Catch:{ all -> 0x01ed }
        r10 = r10.a();	 Catch:{ all -> 0x01ed }
        if (r10 == 0) goto L_0x0115;	 Catch:{ all -> 0x01ed }
        r10 = r1.O;	 Catch:{ all -> 0x01ed }
        r11 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x01ed }
        r10 = r10.a(r11);	 Catch:{ all -> 0x01ed }
        r10 = (double) r10;
        r12 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r10);
        r10 = r10 / r12;
        r14 = r1.h;	 Catch:{ all -> 0x01ed }
        r15 = new aaan;	 Catch:{ all -> 0x01ed }
        r15.<init>();	 Catch:{ all -> 0x01ed }
        r8 = r14.g;	 Catch:{ all -> 0x01ed }
        r8 = (double) r8;
        java.lang.Double.isNaN(r8);
        r8 = r8 / r12;
        r8 = java.lang.Double.valueOf(r8);	 Catch:{ all -> 0x01ed }
        r15.d = r8;	 Catch:{ all -> 0x01ed }
        r8 = r14.d;	 Catch:{ all -> 0x01ed }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x01ed }
        r15.a = r8;	 Catch:{ all -> 0x01ed }
        r8 = r14.e;	 Catch:{ all -> 0x01ed }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x01ed }
        r15.b = r8;	 Catch:{ all -> 0x01ed }
        r8 = r14.f;	 Catch:{ all -> 0x01ed }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x01ed }
        r15.c = r8;	 Catch:{ all -> 0x01ed }
        r8 = r14.a;	 Catch:{ all -> 0x01ed }
        r15.setLogQueueName(r8);	 Catch:{ all -> 0x01ed }
        r8 = r1.j;	 Catch:{ all -> 0x01ed }
        r8.a(r15);	 Catch:{ all -> 0x01ed }
        r8 = r1.j;	 Catch:{ all -> 0x01ed }
        r8 = r8.a();	 Catch:{ all -> 0x01ed }
        r15.setUserId(r8);	 Catch:{ all -> 0x01ed }
        r8 = java.lang.Double.valueOf(r10);	 Catch:{ all -> 0x01ed }
        r15.setClientUploadTs(r8);	 Catch:{ all -> 0x01ed }
        r8 = new dks;	 Catch:{ all -> 0x01ed }
        r8.<init>(r15);	 Catch:{ all -> 0x01ed }
        r9 = r1.i;	 Catch:{ all -> 0x01ed }
        r9 = r9.c();	 Catch:{ all -> 0x01ed }
        if (r9 == 0) goto L_0x0110;	 Catch:{ all -> 0x01ed }
        r15.getEventName();	 Catch:{ all -> 0x01ed }
        r9 = r7.a;	 Catch:{ all -> 0x01ed }
        r9.add(r8);	 Catch:{ all -> 0x01ed }
        r8 = r1.E;	 Catch:{ all -> 0x01ed }
        if (r8 == 0) goto L_0x014b;	 Catch:{ all -> 0x01ed }
        r0 = r1.o;	 Catch:{ all -> 0x01ed }
        r2 = r1.a;	 Catch:{ all -> 0x01ed }
        r2 = r2.a;	 Catch:{ all -> 0x01ed }
        r2 = defpackage.dih.b(r2);	 Catch:{ all -> 0x01ed }
        r3 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x01ed }
        r8 = "queueName";	 Catch:{ all -> 0x01ed }
        defpackage.akcr.b(r2, r8);	 Catch:{ all -> 0x01ed }
        r8 = "eventBatch";	 Catch:{ all -> 0x01ed }
        defpackage.akcr.b(r7, r8);	 Catch:{ all -> 0x01ed }
        r0 = r0.a;	 Catch:{ all -> 0x01ed }
        r0 = r0.get();	 Catch:{ all -> 0x01ed }
        r0 = (defpackage.dlr) r0;	 Catch:{ all -> 0x01ed }
        r0.a(r2, r7, r3);	 Catch:{ all -> 0x01ed }
        r1.a(r7);	 Catch:{ all -> 0x01ed }
        r0 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x01ed }
        r0 = defpackage.ajdx.b(r0);	 Catch:{ all -> 0x01ed }
        r1.Q = r6;	 Catch:{ all -> 0x0212 }
        r2 = r1.t;	 Catch:{ all -> 0x0212 }
        goto L_0x0087;
        r8 = new ajwr;	 Catch:{ all -> 0x01ed }
        r8.<init>();	 Catch:{ all -> 0x01ed }
        r1.Q = r8;	 Catch:{ all -> 0x01ed }
        r8 = r1.k;	 Catch:{ all -> 0x01ed }
        r9 = new dkw;	 Catch:{ all -> 0x01ed }
        r10 = r1.d;	 Catch:{ all -> 0x01ed }
        r10 = r10.get();	 Catch:{ all -> 0x01ed }
        r11 = r16.size();	 Catch:{ all -> 0x01ed }
        r12 = r17;	 Catch:{ all -> 0x01ed }
        r9.<init>(r10, r11, r12);	 Catch:{ all -> 0x01ed }
        r8.a(r7, r9);	 Catch:{ all -> 0x01ed }
        r8 = r1.c;	 Catch:{ all -> 0x01ed }
        r9 = defpackage.ino.UPLOAD_DISPATCHED;	 Catch:{ all -> 0x01ed }
        r10 = r1.a;	 Catch:{ all -> 0x01ed }
        r10 = r10.a;	 Catch:{ all -> 0x01ed }
        r10 = defpackage.dih.b(r10);	 Catch:{ all -> 0x01ed }
        r9 = r9.a(r4, r10);	 Catch:{ all -> 0x01ed }
        r10 = r1.d;	 Catch:{ all -> 0x01ed }
        r10 = r10.get();	 Catch:{ all -> 0x01ed }
        r2 = r9.a(r2, r10);	 Catch:{ all -> 0x01ed }
        r9 = r0.b;	 Catch:{ all -> 0x01ed }
        r2 = r2.a(r3, r9);	 Catch:{ all -> 0x01ed }
        r9 = 1;	 Catch:{ all -> 0x01ed }
        r8.c(r2, r9);	 Catch:{ all -> 0x01ed }
        r2 = r1.c;	 Catch:{ all -> 0x01ed }
        r8 = defpackage.ino.UPLOAD_BATCH_SIZE;	 Catch:{ all -> 0x01ed }
        r9 = r1.a;	 Catch:{ all -> 0x01ed }
        r9 = r9.a;	 Catch:{ all -> 0x01ed }
        r9 = defpackage.dih.b(r9);	 Catch:{ all -> 0x01ed }
        r8 = r8.a(r4, r9);	 Catch:{ all -> 0x01ed }
        r9 = r0.b;	 Catch:{ all -> 0x01ed }
        r8 = r8.a(r3, r9);	 Catch:{ all -> 0x01ed }
        r7 = r7.b();	 Catch:{ all -> 0x01ed }
        r9 = (long) r7;	 Catch:{ all -> 0x01ed }
        r2.b(r8, r9);	 Catch:{ all -> 0x01ed }
        r2 = r1.O;	 Catch:{ all -> 0x01ed }
        r7 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x01ed }
        r7 = r2.a(r7);	 Catch:{ all -> 0x01ed }
        r2 = r1.x;	 Catch:{ all -> 0x01ed }
        r9 = r2.get();	 Catch:{ all -> 0x01ed }
        r11 = 0;	 Catch:{ all -> 0x01ed }
        r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));	 Catch:{ all -> 0x01ed }
        if (r2 <= 0) goto L_0x01e0;	 Catch:{ all -> 0x01ed }
        r2 = r1.c;	 Catch:{ all -> 0x01ed }
        r9 = defpackage.ino.INTER_UPLOAD_TIME_MILLI;	 Catch:{ all -> 0x01ed }
        r10 = r1.a;	 Catch:{ all -> 0x01ed }
        r10 = r10.a;	 Catch:{ all -> 0x01ed }
        r10 = defpackage.dih.b(r10);	 Catch:{ all -> 0x01ed }
        r4 = r9.a(r4, r10);	 Catch:{ all -> 0x01ed }
        r0 = r0.b;	 Catch:{ all -> 0x01ed }
        r0 = r4.a(r3, r0);	 Catch:{ all -> 0x01ed }
        r3 = r1.x;	 Catch:{ all -> 0x01ed }
        r3 = r3.get();	 Catch:{ all -> 0x01ed }
        r3 = r7 - r3;	 Catch:{ all -> 0x01ed }
        r2.a(r0, r3);	 Catch:{ all -> 0x01ed }
        r0 = r1.x;	 Catch:{ all -> 0x01ed }
        r0.set(r7);	 Catch:{ all -> 0x01ed }
        r0 = r1.Q;	 Catch:{ all -> 0x01e9 }
        goto L_0x004c;
        r0 = move-exception;
        r19 = 1;
        goto L_0x01f0;
        r0 = move-exception;
        r19 = 0;
        throw r0;	 Catch:{ Exception -> 0x01f9 }
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01f7, all -> 0x01f3 }
        r0 = move-exception;
        r19 = 0;
        goto L_0x0208;
        r19 = 0;
    L_0x01f9:
        r0 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0207 }
        r0 = defpackage.ajdx.b(r0);	 Catch:{ all -> 0x0207 }
        if (r19 != 0) goto L_0x004c;
        r1.Q = r6;	 Catch:{ all -> 0x0212 }
        r2 = r1.t;	 Catch:{ all -> 0x0212 }
        goto L_0x0087;	 Catch:{ all -> 0x0212 }
        r0 = move-exception;	 Catch:{ all -> 0x0212 }
        if (r19 != 0) goto L_0x0211;	 Catch:{ all -> 0x0212 }
        r1.Q = r6;	 Catch:{ all -> 0x0212 }
        r2 = r1.t;	 Catch:{ all -> 0x0212 }
        r2.set(r5);	 Catch:{ all -> 0x0212 }
        throw r0;	 Catch:{ all -> 0x0212 }
        r0 = move-exception;
        r2 = r1.s;
        r2.set(r5);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dif.d(dit):ajdx");
    }

    private long g() {
        try {
            return this.n.a() + ((long) this.A.size());
        } catch (diq unused) {
            i();
            return 0;
        }
    }

    private long h() {
        try {
            return (this.n.b() + ((long) this.A.size())) - ((long) this.R);
        } catch (diq unused) {
            i();
            return 0;
        }
    }

    private void i() {
        this.c.c(ino.DB_ERROR_ON_FLUSH.a("logQ", dih.b(this.a.a)), 1);
    }

    private void j() {
        if (h() >= this.a.c.longValue()) {
            this.b.c();
            if (this.L.compareAndSet(false, true)) {
                this.N.a(a(BlizzardDurableJob.a(dia.QUEUE_READY, this.a.a, this.K, TimeUnit.SECONDS)));
            }
        }
    }

    private /* synthetic */ void k() {
        d(a.b("UploadNowRunnable"));
    }

    /* Access modifiers changed, original: final */
    public final ajdx<Boolean> a(dit dit) {
        return ajdx.c(new -$$Lambda$dif$C8Mlw-aE7LzlmTkrrgc4V6Cpwrg(this, dit)).a(-$$Lambda$dif$MpUORNK_GXwwrg1MZUAJgMEnxpw.INSTANCE).b(this.O);
    }

    public final void a() {
        if ((akly.a(this.a.a, (CharSequence) "shadow") || akly.a(this.a.a, (CharSequence) "gce_critical") || akly.a(this.a.a, (CharSequence) "gce_best_effort")) && this.i.a) {
            this.B = new LinkedBlockingQueue(this.a.d.intValue());
        }
        this.G = this.p.k();
        boolean z = false;
        boolean z2 = this.G || this.p.d();
        this.F = z2;
        this.H = this.p.f();
        this.K = (long) this.p.l();
        this.I = this.p.g();
        this.J = this.p.h();
        z2 = !this.F && this.p.c().contains(dih.b(this.a.a));
        this.C = z2;
        if (!this.F && this.p.b().contains(dih.b(this.a.a))) {
            z = true;
        }
        this.D = z;
        this.e = this.p.m();
        this.E = this.p.n();
        this.P = ((Long) MoreObjects.firstNonNull(this.a.g, Long.valueOf(5000))).longValue();
        if (this.e) {
            Long l = this.a.h;
            if (l == null) {
                l = Long.valueOf(500);
            }
            this.f = new ajwo();
            this.f.b(this.O).a(l.longValue(), TimeUnit.MILLISECONDS, this.O, Integer.MAX_VALUE, ajuk.INSTANCE).a(-$$Lambda$dif$9VgpKVmQ74B8JYUcLjXfsPPIV8Y.INSTANCE).a(ajcw.BUFFER).a(this.O).e(new -$$Lambda$dif$VBPaEudi1c6dvamaTQoJ9bxL46A(this));
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(aajt aajt, boolean z, boolean z2) {
        String eventName = aajt.getEventName();
        if (this.a.k == null || !this.a.k.contains(eventName)) {
            aajt.setLogQueueSequenceId(Long.valueOf(this.m.a(z)));
            aajt.setLogQueueName(this.a.a);
            dks dks = new dks(aajt);
            if (dks.a("event_name")) {
                a(dks, z2);
                a(dks);
                return;
            } else if (this.i.c()) {
                StringBuilder stringBuilder = new StringBuilder("Logged event missing event_name: ");
                stringBuilder.append(dih.a(dks.a));
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                return;
            }
        }
        this.c.c(ino.BLACKLISTED_EVENT.a("logQ", dih.b(this.a.a)).a("eventName", eventName), 1);
    }

    public final void a(dkz dkz) {
        this.b.a(new -$$Lambda$dif$91mTXCYeVm72haF9YDvNtU70wpM(this, dkz));
    }

    /* Access modifiers changed, original: final */
    /* renamed from: b */
    public final ajdx<Boolean> e(dit dit) {
        this.b.c();
        if (dit.b == diu.DURABLE_JOB || dit.b == diu.DURABLE_JOB_FORCED) {
            this.L.set(false);
            this.N.a();
        }
        if (!this.z.compareAndSet(false, true)) {
            return ajdx.b(Boolean.FALSE);
        }
        try {
            ajdx<Boolean> b;
            long a = this.O.a(TimeUnit.MILLISECONDS);
            if (this.y.get() > 0) {
                this.c.a(ino.INTER_PROCESS_TIME_MILLI.a("logQ", dih.b(this.a.a)), a - this.y.get());
            }
            this.y.set(a);
            Object obj = (this.A.isEmpty() || (!dit.a && this.O.a(TimeUnit.MILLISECONDS) - this.w.get() < this.P)) ? null : 1;
            if (obj != null) {
                e();
            }
            boolean z = dit.a;
            if (!z) {
                if (c(dit)) {
                    a = this.O.a(TimeUnit.MILLISECONDS) - this.x.get();
                    z = g() >= this.a.c.longValue();
                    if (!z) {
                        z = ((h() > 0 ? 1 : (h() == 0 ? 0 : -1)) > 0 ? 1 : null) != null && a > this.a.e.longValue();
                    }
                }
                b = ajdx.b(Boolean.FALSE);
                this.z.set(false);
                return b;
            }
            if (z) {
                b = d(dit);
                this.z.set(false);
                return b;
            }
            b = ajdx.b(Boolean.FALSE);
            this.z.set(false);
            return b;
        } catch (Throwable th) {
            this.z.set(false);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        boolean z = false;
        this.d.set(false);
        if (!f()) {
            this.b.b(this.g);
            this.b.a(this.g);
        }
        if (this.M.compareAndSet(false, true)) {
            BlizzardDurableJob a = BlizzardDurableJob.a(dia.PERIODIC, this.a.a, (long) this.I, TimeUnit.MINUTES);
            if (this.H) {
                Set set = this.J;
                if (set == null || set.contains(this.a.a)) {
                    z = true;
                }
            }
            if (z) {
                a(a);
            } else {
                String b = a.b();
                ((hwl) this.r.get()).a(b).a(new -$$Lambda$dif$pc03YrH0oPMkuiS5PCZvErdwitg(b), new -$$Lambda$dif$QwazxwGIZF6k0q-su6O04pnirwU(b));
            }
        }
    }

    public final void b(dkz dkz) {
        this.b.a(new -$$Lambda$dif$6QVX15MQjErsP7uj-YOfH6NqYpQ(this, dkz));
    }

    @Deprecated
    public final void c() {
        f();
        if ((!this.A.isEmpty() || h() > 0) && this.u.compareAndSet(false, true)) {
            this.b.a(this.g, 5000);
        }
    }

    /* Access modifiers changed, original: final */
    @Deprecated
    public final void d() {
        f();
        try {
            a.b("flushAndUpload()");
            e();
            f();
            this.b.c();
            if (!this.t.get()) {
                dit b = a.b("uploadNowOrSchedule()");
                if (!this.A.isEmpty()) {
                    e();
                }
                if (g() >= this.a.c.longValue()) {
                    d(b);
                } else {
                    a(this.a.e.longValue());
                }
            }
            this.u.set(false);
        } catch (Throwable th) {
            this.u.set(false);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x009c in {2, 7, 12, 17, 19} preds:[]
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
    final void e() {
        /*
        r7 = this;
        r0 = "logQ";
        r1 = r7.b;
        r1.c();
        r1 = r7.v;
        r2 = 0;
        r3 = 1;
        r1 = r1.compareAndSet(r2, r3);
        if (r1 != 0) goto L_0x0012;
        return;
        r1 = r7.A;	 Catch:{ diq -> 0x0092 }
        r1 = r1.isEmpty();	 Catch:{ diq -> 0x0092 }
        if (r1 == 0) goto L_0x0020;
        r0 = r7.v;
        r0.set(r2);
        return;
        r1 = r7.c;	 Catch:{ diq -> 0x0092 }
        r3 = defpackage.ino.FLUSH_EVENTS;	 Catch:{ diq -> 0x0092 }
        r4 = r7.a;	 Catch:{ diq -> 0x0092 }
        r4 = r4.a;	 Catch:{ diq -> 0x0092 }
        r4 = defpackage.dih.b(r4);	 Catch:{ diq -> 0x0092 }
        r3 = r3.a(r0, r4);	 Catch:{ diq -> 0x0092 }
        r4 = "trigger";	 Catch:{ diq -> 0x0092 }
        r5 = r7.d;	 Catch:{ diq -> 0x0092 }
        r5 = r5.get();	 Catch:{ diq -> 0x0092 }
        r3 = r3.a(r4, r5);	 Catch:{ diq -> 0x0092 }
        r4 = r7.A;	 Catch:{ diq -> 0x0092 }
        r4 = r4.size();	 Catch:{ diq -> 0x0092 }
        r4 = (long) r4;	 Catch:{ diq -> 0x0092 }
        r1.b(r3, r4);	 Catch:{ diq -> 0x0092 }
        r1 = r7.n;	 Catch:{ diq -> 0x0092 }
        r3 = r7.A;	 Catch:{ diq -> 0x0092 }
        r1.a(r3);	 Catch:{ diq -> 0x0092 }
        r1 = r7.A;	 Catch:{ diq -> 0x0092 }
        r1.clear();	 Catch:{ diq -> 0x0092 }
        r7.R = r2;	 Catch:{ diq -> 0x0092 }
        r1 = r7.O;	 Catch:{ diq -> 0x0092 }
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ diq -> 0x0092 }
        r3 = r1.a(r3);	 Catch:{ diq -> 0x0092 }
        r1 = r7.c;	 Catch:{ diq -> 0x0092 }
        r5 = defpackage.ino.INTER_FLUSH_TIME_MILLI;	 Catch:{ diq -> 0x0092 }
        r6 = r7.a;	 Catch:{ diq -> 0x0092 }
        r6 = r6.a;	 Catch:{ diq -> 0x0092 }
        r6 = defpackage.dih.b(r6);	 Catch:{ diq -> 0x0092 }
        r0 = r5.a(r0, r6);	 Catch:{ diq -> 0x0092 }
        r5 = r7.w;	 Catch:{ diq -> 0x0092 }
        r5 = r5.get();	 Catch:{ diq -> 0x0092 }
        r5 = r3 - r5;	 Catch:{ diq -> 0x0092 }
        r1.a(r0, r5);	 Catch:{ diq -> 0x0092 }
        r0 = r7.w;	 Catch:{ diq -> 0x0092 }
        r0.set(r3);	 Catch:{ diq -> 0x0092 }
        r0 = r7.g();	 Catch:{ diq -> 0x0092 }
        r3 = r7.a;	 Catch:{ diq -> 0x0092 }
        r3 = r3.d;	 Catch:{ diq -> 0x0092 }
        r3 = r3.longValue();	 Catch:{ diq -> 0x0092 }
        r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));	 Catch:{ diq -> 0x0092 }
        if (r5 <= 0) goto L_0x001a;	 Catch:{ diq -> 0x0092 }
        r7.b(r0);	 Catch:{ diq -> 0x0092 }
        goto L_0x001a;
        r0 = move-exception;
        goto L_0x0096;
    L_0x0092:
        r7.i();	 Catch:{ all -> 0x0090 }
        goto L_0x001a;
        r1 = r7.v;
        r1.set(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dif.e():void");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dif)) {
            return false;
        }
        return this.a.a.equals(((dif) obj).a.a);
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return this.G || (this.F && this.d.get());
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.a);
        stringBuilder.append("...");
        stringBuilder.append(this.l.c());
        return stringBuilder.toString();
    }
}
