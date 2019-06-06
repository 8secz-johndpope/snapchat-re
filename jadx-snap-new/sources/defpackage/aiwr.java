package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.aiuh.a;
import defpackage.aiuq.b;
import defpackage.aivm.c;
import defpackage.aiys.k;
import defpackage.aiys.q;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Logger;

/* renamed from: aiwr */
final class aiwr<ReqT, RespT> extends aiuh<ReqT, RespT> {
    private static final Logger j = Logger.getLogger(aiwr.class.getName());
    private static final byte[] k = "gzip".getBytes(Charset.forName("US-ASCII"));
    final aivm<ReqT, RespT> a;
    final Executor b;
    final aiwm c;
    final aiuq d;
    aiws e;
    volatile boolean f;
    boolean g;
    aiuu h = aiuu.a;
    aiun i = aiun.a;
    private volatile ScheduledFuture<?> l;
    private final boolean m;
    private final aiuf n;
    private final boolean o;
    private boolean p;
    private boolean q;
    private final d r;
    private final b s = new e(this, (byte) 0);
    private final ScheduledExecutorService t;

    /* renamed from: aiwr$d */
    interface d {
        aiwu a(defpackage.aivh.d dVar);

        <ReqT> aiys<ReqT> a(aivm<ReqT, ?> aivm, aiuf aiuf, aivl aivl, aiuq aiuq);
    }

    /* renamed from: aiwr$e */
    final class e implements b {
        private e() {
        }

        /* synthetic */ e(aiwr aiwr, byte b) {
            this();
        }

        public final void a(aiuq aiuq) {
            aiwr.this.e.a(aiur.a(aiuq));
        }
    }

    /* renamed from: aiwr$c */
    class c implements aiwt {
        final a<RespT> a;
        boolean b;

        /* renamed from: aiwr$c$d */
        class d extends aiwz {
            d() {
                super(aiwr.this.d);
            }

            public final void a() {
            }
        }

        /* renamed from: aiwr$c$a */
        class a extends aiwz {
            private /* synthetic */ aivl a;

            a(aivl aivl) {
                this.a = aivl;
                super(aiwr.this.d);
            }

            public final void a() {
                try {
                    boolean z = c.this.b;
                } catch (Throwable th) {
                    aivw a = aivw.c.b(th).a("Failed to read headers");
                    aiwr.this.e.a(a);
                    c.a(c.this, a, new aivl());
                }
            }
        }

        /* renamed from: aiwr$c$b */
        class b extends aiwz {
            private /* synthetic */ aizc.a a;

            b(aizc.a aVar) {
                this.a = aVar;
                super(aiwr.this.d);
            }

            public final void a() {
                if (c.this.b) {
                    aixo.a(this.a);
                    return;
                }
                while (true) {
                    InputStream a;
                    try {
                        a = this.a.a();
                        if (a != null) {
                            c.this.a.a(aiwr.this.a.c.a(a));
                            a.close();
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        aixo.a(this.a);
                        aivw a2 = aivw.c.b(th).a("Failed to read message.");
                        aiwr.this.e.a(a2);
                        c.a(c.this, a2, new aivl());
                        return;
                    }
                }
            }
        }

        /* renamed from: aiwr$c$c */
        class c extends aiwz {
            private /* synthetic */ aivw a;
            private /* synthetic */ aivl b;

            c(aivw aivw, aivl aivl) {
                this.a = aivw;
                this.b = aivl;
                super(aiwr.this.d);
            }

            public final void a() {
                if (!c.this.b) {
                    c.a(c.this, this.a, this.b);
                }
            }
        }

        public c(a<RespT> aVar) {
            this.a = (a) Preconditions.checkNotNull(aVar, "observer");
        }

        public final void a() {
            aiwr.this.b.execute(new d());
        }

        public final void a(aivl aivl) {
            aiwr.this.b.execute(new a(aivl));
        }

        public final void a(aivw aivw, int i, aivl aivl) {
            aius c = aiwr.this.c();
            if (aivw.m == aivw.a.CANCELLED && c != null && c.a()) {
                aivw = aivw.e;
                aivl = new aivl();
            }
            aiwr.this.b.execute(new c(aivw, aivl));
        }

        public final void a(aivw aivw, aivl aivl) {
            a(aivw, 1, aivl);
        }

        public final void a(aizc.a aVar) {
            aiwr.this.b.execute(new b(aVar));
        }
    }

    /* renamed from: aiwr$f */
    class f implements Runnable {
        private final long a;

        f(long j) {
            this.a = j;
        }

        public final void run() {
            aiwr.this.e.a(aivw.e.b(String.format("deadline exceeded after %dns", new Object[]{Long.valueOf(this.a)})));
        }
    }

    /* renamed from: aiwr$a */
    class a extends aiwz {
        private /* synthetic */ defpackage.aiuh.a a;

        a(defpackage.aiuh.a aVar) {
            this.a = aVar;
            super(aiwr.this.d);
        }

        public final void a() {
            this.a.a(aiur.a(aiwr.this.d), new aivl());
        }
    }

    /* renamed from: aiwr$b */
    class b extends aiwz {
        private /* synthetic */ a a;
        private /* synthetic */ String b;

        b(a aVar, String str) {
            this.a = aVar;
            this.b = str;
            super(aiwr.this.d);
        }

        public final void a() {
            this.a.a(aivw.i.a(String.format("Unable to find compressor by name %s", new Object[]{this.b})), new aivl());
        }
    }

    aiwr(aivm<ReqT, RespT> aivm, Executor executor, aiuf aiuf, d dVar, ScheduledExecutorService scheduledExecutorService, aiwm aiwm, boolean z) {
        this.a = aivm;
        this.b = executor == MoreExecutors.directExecutor() ? new aiyu() : new aiyv(executor);
        this.c = aiwm;
        this.d = aiuq.a();
        boolean z2 = aivm.a == c.UNARY || aivm.a == c.SERVER_STREAMING;
        this.m = z2;
        this.n = aiuf;
        this.r = dVar;
        this.t = scheduledExecutorService;
        this.o = false;
    }

    private static aius a(aius aius, aius aius2) {
        return aius == null ? aius2 : aius2 == null ? aius : aius.a(aius2);
    }

    public final void a() {
        Preconditions.checkState(this.e != null, "Not started");
        Preconditions.checkState(this.p ^ 1, "call was cancelled");
        Preconditions.checkState(this.q ^ 1, "call already half-closed");
        this.q = true;
        this.e.d();
    }

    public final void a(int i) {
        boolean z = true;
        Preconditions.checkState(this.e != null, "Not started");
        if (i < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "Number requested must be non-negative");
        this.e.c(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x020d  */
    public final void a(defpackage.aiuh.a<RespT> r11, defpackage.aivl r12) {
        /*
        r10 = this;
        r0 = r10.e;
        r1 = 1;
        r2 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0006:
        r0 = 1;
        goto L_0x0009;
    L_0x0008:
        r0 = 0;
    L_0x0009:
        r3 = "Already started";
        com.google.common.base.Preconditions.checkState(r0, r3);
        r0 = r10.p;
        r0 = r0 ^ r1;
        r3 = "call was cancelled";
        com.google.common.base.Preconditions.checkState(r0, r3);
        r0 = "observer";
        com.google.common.base.Preconditions.checkNotNull(r11, r0);
        r0 = "headers";
        com.google.common.base.Preconditions.checkNotNull(r12, r0);
        r0 = r10.d;
        r0 = r0.d();
        if (r0 == 0) goto L_0x0037;
    L_0x0028:
        r12 = defpackage.aiyh.a;
        r10.e = r12;
        r12 = r10.b;
        r0 = new aiwr$a;
        r0.<init>(r11);
        r12.execute(r0);
        return;
    L_0x0037:
        r0 = r10.n;
        r0 = r0.f;
        if (r0 == 0) goto L_0x0058;
    L_0x003d:
        r3 = r10.i;
        r3 = r3.b;
        r3 = r3.get(r0);
        r3 = (defpackage.aium) r3;
        if (r3 != 0) goto L_0x005a;
    L_0x0049:
        r12 = defpackage.aiyh.a;
        r10.e = r12;
        r12 = r10.b;
        r1 = new aiwr$b;
        r1.<init>(r11, r0);
        r12.execute(r1);
        return;
    L_0x0058:
        r3 = defpackage.aiul.b.a;
    L_0x005a:
        r0 = r10.h;
        r4 = defpackage.aixo.c;
        r12.b(r4);
        r4 = defpackage.aiul.b.a;
        if (r3 == r4) goto L_0x006e;
    L_0x0065:
        r4 = defpackage.aixo.c;
        r5 = r3.a();
        r12.a(r4, r5);
    L_0x006e:
        r4 = defpackage.aixo.d;
        r12.b(r4);
        r0 = r0.c;
        r4 = r0.length;
        if (r4 == 0) goto L_0x007d;
    L_0x0078:
        r4 = defpackage.aixo.d;
        r12.a(r4, r0);
    L_0x007d:
        r0 = defpackage.aixo.e;
        r12.b(r0);
        r0 = defpackage.aixo.f;
        r12.b(r0);
        r0 = r10.c();
        if (r0 == 0) goto L_0x0095;
    L_0x008d:
        r4 = r0.a();
        if (r4 == 0) goto L_0x0095;
    L_0x0093:
        r4 = 1;
        goto L_0x0096;
    L_0x0095:
        r4 = 0;
    L_0x0096:
        if (r4 != 0) goto L_0x0132;
    L_0x0098:
        r4 = r10.n;
        r4 = r4.b;
        r5 = r10.d;
        r5 = r5.f();
        r6 = j;
        r7 = java.util.logging.Level.FINE;
        r6 = r6.isLoggable(r7);
        if (r6 == 0) goto L_0x00f5;
    L_0x00ac:
        if (r0 == 0) goto L_0x00f5;
    L_0x00ae:
        if (r4 == r0) goto L_0x00b1;
    L_0x00b0:
        goto L_0x00f5;
    L_0x00b1:
        r6 = 0;
        r4 = java.util.concurrent.TimeUnit.NANOSECONDS;
        r8 = r0.a(r4);
        r6 = java.lang.Math.max(r6, r8);
        r4 = new java.lang.StringBuilder;
        r8 = new java.lang.Object[r1];
        r6 = java.lang.Long.valueOf(r6);
        r8[r2] = r6;
        r6 = "Call timeout set to '%d' ns, due to context deadline.";
        r6 = java.lang.String.format(r6, r8);
        r4.<init>(r6);
        if (r5 != 0) goto L_0x00d5;
    L_0x00d2:
        r1 = " Explicit call timeout was not set.";
        goto L_0x00e9;
    L_0x00d5:
        r6 = java.util.concurrent.TimeUnit.NANOSECONDS;
        r5 = r5.a(r6);
        r1 = new java.lang.Object[r1];
        r5 = java.lang.Long.valueOf(r5);
        r1[r2] = r5;
        r5 = " Explicit call timeout was '%d' ns.";
        r1 = java.lang.String.format(r5, r1);
    L_0x00e9:
        r4.append(r1);
        r1 = j;
        r4 = r4.toString();
        r1.fine(r4);
    L_0x00f5:
        r1 = r10.o;
        if (r1 == 0) goto L_0x0106;
    L_0x00f9:
        r1 = r10.r;
        r4 = r10.a;
        r5 = r10.n;
        r6 = r10.d;
        r12 = r1.a(r4, r5, r12, r6);
        goto L_0x0147;
    L_0x0106:
        r1 = r10.r;
        r4 = new aiyj;
        r5 = r10.a;
        r6 = r10.n;
        r4.<init>(r5, r12, r6);
        r1 = r1.a(r4);
        r4 = r10.d;
        r4 = r4.c();
        r5 = r10.a;	 Catch:{ all -> 0x012b }
        r6 = r10.n;	 Catch:{ all -> 0x012b }
        r12 = r1.a(r5, r12, r6);	 Catch:{ all -> 0x012b }
        r10.e = r12;	 Catch:{ all -> 0x012b }
        r12 = r10.d;
        r12.a(r4);
        goto L_0x0149;
    L_0x012b:
        r11 = move-exception;
        r12 = r10.d;
        r12.a(r4);
        throw r11;
    L_0x0132:
        r12 = new aixg;
        r1 = defpackage.aivw.e;
        r4 = java.lang.String.valueOf(r0);
        r5 = "deadline exceeded: ";
        r4 = r5.concat(r4);
        r1 = r1.a(r4);
        r12.<init>(r1);
    L_0x0147:
        r10.e = r12;
    L_0x0149:
        r12 = r10.n;
        r12 = r12.d;
        if (r12 == 0) goto L_0x0158;
    L_0x014f:
        r12 = r10.e;
        r1 = r10.n;
        r1 = r1.d;
        r12.a(r1);
    L_0x0158:
        r12 = r10.n;
        r12 = r12.i;
        if (r12 == 0) goto L_0x016b;
    L_0x015e:
        r12 = r10.e;
        r1 = r10.n;
        r1 = r1.i;
        r1 = r1.intValue();
        r12.b(r1);
    L_0x016b:
        r12 = r10.n;
        r12 = r12.j;
        if (r12 == 0) goto L_0x017e;
    L_0x0171:
        r12 = r10.e;
        r1 = r10.n;
        r1 = r1.j;
        r1 = r1.intValue();
        r12.a(r1);
    L_0x017e:
        if (r0 == 0) goto L_0x0185;
    L_0x0180:
        r12 = r10.e;
        r12.a(r0);
    L_0x0185:
        r12 = r10.e;
        r12.a(r3);
        r12 = r10.e;
        r1 = r10.h;
        r12.a(r1);
        r12 = r10.c;
        r12.a();
        r12 = r10.e;
        r1 = new aiwr$c;
        r1.<init>(r11);
        r12.a(r1);
        r11 = r10.d;
        r12 = r10.s;
        r1 = com.google.common.util.concurrent.MoreExecutors.directExecutor();
        r3 = "cancellationListener";
        defpackage.aiuq.a(r12, r3);
        r3 = "executor";
        defpackage.aiuq.a(r1, r3);
        r3 = r11.b();
        if (r3 == 0) goto L_0x01e1;
    L_0x01b8:
        r3 = new aiuq$c;
        r3.<init>(r11, r1, r12, r2);
        monitor-enter(r11);
        r12 = r11.d();	 Catch:{ all -> 0x01de }
        if (r12 == 0) goto L_0x01c8;
    L_0x01c4:
        r3.a();	 Catch:{ all -> 0x01de }
        goto L_0x01dc;
    L_0x01c8:
        r12 = r11.b;	 Catch:{ all -> 0x01de }
        if (r12 != 0) goto L_0x01d9;
    L_0x01cc:
        r12 = new java.util.ArrayList;	 Catch:{ all -> 0x01de }
        r12.<init>();	 Catch:{ all -> 0x01de }
        r11.b = r12;	 Catch:{ all -> 0x01de }
        r12 = r11.b;	 Catch:{ all -> 0x01de }
    L_0x01d5:
        r12.add(r3);	 Catch:{ all -> 0x01de }
        goto L_0x01dc;
    L_0x01d9:
        r12 = r11.b;	 Catch:{ all -> 0x01de }
        goto L_0x01d5;
    L_0x01dc:
        monitor-exit(r11);	 Catch:{ all -> 0x01de }
        goto L_0x01e1;
    L_0x01de:
        r12 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x01de }
        throw r12;
    L_0x01e1:
        if (r0 == 0) goto L_0x0209;
    L_0x01e3:
        r11 = r10.d;
        r11 = r11.f();
        if (r11 == r0) goto L_0x0209;
    L_0x01eb:
        r11 = r10.t;
        if (r11 == 0) goto L_0x0209;
    L_0x01ef:
        r11 = java.util.concurrent.TimeUnit.NANOSECONDS;
        r11 = r0.a(r11);
        r0 = r10.t;
        r1 = new aixy;
        r2 = new aiwr$f;
        r2.<init>(r11);
        r1.<init>(r2);
        r2 = java.util.concurrent.TimeUnit.NANOSECONDS;
        r11 = r0.schedule(r1, r11, r2);
        r10.l = r11;
    L_0x0209:
        r11 = r10.f;
        if (r11 == 0) goto L_0x0210;
    L_0x020d:
        r10.b();
    L_0x0210:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwr.a(aiuh$a, aivl):void");
    }

    public final void a(ReqT reqT) {
        Preconditions.checkState(this.e != null, "Not started");
        Preconditions.checkState(this.p ^ 1, "call was cancelled");
        Preconditions.checkState(this.q ^ 1, "call was half-closed");
        try {
            if (this.e instanceof aiys) {
                aiys aiys = (aiys) this.e;
                q qVar = aiys.m;
                if (qVar.a) {
                    qVar.d.a.a(aiys.c.a((Object) reqT));
                } else {
                    aiys.a(new k(reqT));
                }
            } else {
                this.e.a(this.a.a((Object) reqT));
            }
            if (!this.m) {
                this.e.f();
            }
        } catch (RuntimeException e) {
            this.e.a(aivw.c.b(e).a("Failed to stream message"));
        } catch (Error e2) {
            this.e.a(aivw.c.a("Client sendMessage() failed with Error"));
            throw e2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0040 in {2, 5, 13, 15, 16, 18, 21} preds:[]
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
    public final void a(java.lang.String r4, java.lang.Throwable r5) {
        /*
        r3 = this;
        if (r4 != 0) goto L_0x0014;
        if (r5 != 0) goto L_0x0014;
        r5 = new java.util.concurrent.CancellationException;
        r0 = "Cancelled without a message or cause";
        r5.<init>(r0);
        r0 = j;
        r1 = java.util.logging.Level.WARNING;
        r2 = "Cancelling without a message or cause is suboptimal";
        r0.log(r1, r2, r5);
        r0 = r3.p;
        if (r0 == 0) goto L_0x0019;
        return;
        r0 = 1;
        r3.p = r0;
        r0 = r3.e;	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x0037;	 Catch:{ all -> 0x003b }
        r0 = defpackage.aivw.c;	 Catch:{ all -> 0x003b }
        if (r4 == 0) goto L_0x0029;	 Catch:{ all -> 0x003b }
        r4 = r0.a(r4);	 Catch:{ all -> 0x003b }
        goto L_0x002c;	 Catch:{ all -> 0x003b }
        r4 = "Call cancelled without message";	 Catch:{ all -> 0x003b }
        goto L_0x0024;	 Catch:{ all -> 0x003b }
        if (r5 == 0) goto L_0x0032;	 Catch:{ all -> 0x003b }
        r4 = r4.b(r5);	 Catch:{ all -> 0x003b }
        r5 = r3.e;	 Catch:{ all -> 0x003b }
        r5.a(r4);	 Catch:{ all -> 0x003b }
        r3.b();
        return;
        r4 = move-exception;
        r3.b();
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwr.a(java.lang.String, java.lang.Throwable):void");
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.d.a(this.s);
        ScheduledFuture scheduledFuture = this.l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* Access modifiers changed, original: final */
    public final aius c() {
        return aiwr.a(this.n.b, this.d.f());
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("method", this.a).toString();
    }
}
