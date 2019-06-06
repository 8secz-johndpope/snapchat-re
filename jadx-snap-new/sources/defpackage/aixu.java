package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import defpackage.aiva.a.a.b;
import defpackage.aiwk.a;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aixu */
final class aixu implements aivb<Object> {
    static final Logger a = Logger.getLogger(aixu.class.getName());
    final aivc b = aivc.a(getClass().getName());
    final a c;
    final c d;
    final ScheduledExecutorService e;
    final aiva f;
    final Object g = new Object();
    final aiwp h;
    d i;
    aiwk j;
    final Stopwatch k;
    ScheduledFuture<?> l;
    boolean m;
    final Collection<aiwx> n = new ArrayList();
    final aixt<aiwx> o = new 1();
    aiwx p;
    volatile aiyd q;
    aiup r = aiup.a(aiuo.IDLE);
    aivw s;
    private final String t;
    private final String u;
    private final aiwv v;
    private final aiwm w;
    private final aiwq x;
    private final aizd y;

    /* renamed from: aixu$b */
    static final class b extends aixk {
        final aiwm a;
        private final aiwx b;

        private b(aiwx aiwx, aiwm aiwm) {
            this.b = aiwx;
            this.a = aiwm;
        }

        /* synthetic */ b(aiwx aiwx, aiwm aiwm, byte b) {
            this(aiwx, aiwm);
        }

        public final aiws a(aivm<?, ?> aivm, aivl aivl, aiuf aiuf) {
            final aiws a = super.a(aivm, aivl, aiuf);
            return new aixi() {
                /* Access modifiers changed, original: protected|final */
                public final aiws a() {
                    return a;
                }

                public final void a(final aiwt aiwt) {
                    b.this.a.a();
                    super.a(new aixj() {
                        public final void a(aivw aivw, int i, aivl aivl) {
                            b.this.a.a(aivw.b());
                            super.a(aivw, i, aivl);
                        }

                        public final void a(aivw aivw, aivl aivl) {
                            b.this.a.a(aivw.b());
                            super.a(aivw, aivl);
                        }

                        /* Access modifiers changed, original: protected|final */
                        public final aiwt b() {
                            return aiwt;
                        }
                    });
                }
            };
        }

        /* Access modifiers changed, original: protected|final */
        public final aiwx a() {
            return this.b;
        }
    }

    /* renamed from: aixu$1 */
    class 1 extends aixt<aiwx> {
        1() {
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            aixu.this.d.b(aixu.this);
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            aixu.this.d.c(aixu.this);
        }
    }

    /* renamed from: aixu$d */
    static final class d {
        List<aiuw> a;
        int b;
        int c;

        public d(List<aiuw> list) {
            this.a = list;
        }

        public final boolean a() {
            return this.b == 0 && this.c == 0;
        }

        public final boolean a(SocketAddress socketAddress) {
            for (int i = 0; i < this.a.size(); i++) {
                int indexOf = ((aiuw) this.a.get(i)).a.indexOf(socketAddress);
                if (indexOf != -1) {
                    this.b = i;
                    this.c = indexOf;
                    return true;
                }
            }
            return false;
        }

        public final void b() {
            this.b = 0;
            this.c = 0;
        }

        public final SocketAddress c() {
            return (SocketAddress) ((aiuw) this.a.get(this.b)).a.get(this.c);
        }

        public final aiud d() {
            return ((aiuw) this.a.get(this.b)).b;
        }
    }

    /* renamed from: aixu$e */
    class e implements aiyd.a {
        private aiwx a;
        private SocketAddress b;

        e(aiwx aiwx, SocketAddress socketAddress) {
            this.a = aiwx;
            this.b = socketAddress;
        }

        public final void a() {
            boolean z = true;
            if (aixu.a.isLoggable(Level.FINE)) {
                aixu.a.log(Level.FINE, "[{0}] {1} for {2} is ready", new Object[]{aixu.this.b, this.a.b(), this.b});
            }
            try {
                aivw aivw;
                synchronized (aixu.this.g) {
                    aivw = aixu.this.s;
                    aixu.this.j = null;
                    if (aivw != null) {
                        if (aixu.this.q != null) {
                            z = false;
                        }
                        Preconditions.checkState(z, "Unexpected non-null activeTransport");
                    } else if (aixu.this.p == this.a) {
                        aixu.this.a(aiuo.READY);
                        aixu.this.q = this.a;
                        aixu.this.p = null;
                    }
                }
                aixu.this.h.a();
                if (aivw != null) {
                    this.a.a(aivw);
                }
            } catch (Throwable th) {
                aixu.this.h.a();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:53:0x014e in {2, 11, 15, 20, 21, 24, 27, 28, 32, 33, 36, 39, 42, 43, 44, 45, 49, 52} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void a(defpackage.aivw r11) {
            /*
            r10 = this;
            r0 = defpackage.aixu.a;
            r1 = java.util.logging.Level.FINE;
            r0 = r0.isLoggable(r1);
            r1 = 2;
            r2 = 1;
            r3 = 0;
            if (r0 == 0) goto L_0x002e;
            r0 = defpackage.aixu.a;
            r4 = java.util.logging.Level.FINE;
            r5 = 4;
            r5 = new java.lang.Object[r5];
            r6 = defpackage.aixu.this;
            r6 = r6.b;
            r5[r3] = r6;
            r6 = r10.a;
            r6 = r6.b();
            r5[r2] = r6;
            r6 = r10.b;
            r5[r1] = r6;
            r6 = 3;
            r5[r6] = r11;
            r6 = "[{0}] {1} for {2} is being shutdown with status {3}";
            r0.log(r4, r6, r5);
            r0 = defpackage.aixu.this;	 Catch:{ all -> 0x0145 }
            r0 = r0.g;	 Catch:{ all -> 0x0145 }
            monitor-enter(r0);	 Catch:{ all -> 0x0145 }
            r4 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r4 = r4.r;	 Catch:{ all -> 0x0142 }
            r4 = r4.a;	 Catch:{ all -> 0x0142 }
            r5 = defpackage.aiuo.SHUTDOWN;	 Catch:{ all -> 0x0142 }
            if (r4 != r5) goto L_0x0046;	 Catch:{ all -> 0x0142 }
            monitor-exit(r0);	 Catch:{ all -> 0x0142 }
            r11 = defpackage.aixu.this;
            r11 = r11.h;
            r11.a();
            return;
            r4 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r4 = r4.q;	 Catch:{ all -> 0x0142 }
            r5 = r10.a;	 Catch:{ all -> 0x0142 }
            r6 = 0;	 Catch:{ all -> 0x0142 }
            if (r4 != r5) goto L_0x0062;	 Catch:{ all -> 0x0142 }
            r11 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r1 = defpackage.aiuo.IDLE;	 Catch:{ all -> 0x0142 }
            r11.a(r1);	 Catch:{ all -> 0x0142 }
            r11 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r11.q = r6;	 Catch:{ all -> 0x0142 }
            r11 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r11 = r11.i;	 Catch:{ all -> 0x0142 }
            r11.b();	 Catch:{ all -> 0x0142 }
            goto L_0x003d;	 Catch:{ all -> 0x0142 }
            r4 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r4 = r4.p;	 Catch:{ all -> 0x0142 }
            r5 = r10.a;	 Catch:{ all -> 0x0142 }
            if (r4 != r5) goto L_0x003d;	 Catch:{ all -> 0x0142 }
            r4 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r4 = r4.r;	 Catch:{ all -> 0x0142 }
            r4 = r4.a;	 Catch:{ all -> 0x0142 }
            r5 = defpackage.aiuo.CONNECTING;	 Catch:{ all -> 0x0142 }
            if (r4 != r5) goto L_0x0076;	 Catch:{ all -> 0x0142 }
            r4 = 1;	 Catch:{ all -> 0x0142 }
            goto L_0x0077;	 Catch:{ all -> 0x0142 }
            r4 = 0;	 Catch:{ all -> 0x0142 }
            r5 = "Expected state is CONNECTING, actual state is %s";	 Catch:{ all -> 0x0142 }
            r7 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r7 = r7.r;	 Catch:{ all -> 0x0142 }
            r7 = r7.a;	 Catch:{ all -> 0x0142 }
            com.google.common.base.Preconditions.checkState(r4, r5, r7);	 Catch:{ all -> 0x0142 }
            r4 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r4 = r4.i;	 Catch:{ all -> 0x0142 }
            r5 = r4.a;	 Catch:{ all -> 0x0142 }
            r7 = r4.b;	 Catch:{ all -> 0x0142 }
            r5 = r5.get(r7);	 Catch:{ all -> 0x0142 }
            r5 = (defpackage.aiuw) r5;	 Catch:{ all -> 0x0142 }
            r7 = r4.c;	 Catch:{ all -> 0x0142 }
            r7 = r7 + r2;	 Catch:{ all -> 0x0142 }
            r4.c = r7;	 Catch:{ all -> 0x0142 }
            r7 = r4.c;	 Catch:{ all -> 0x0142 }
            r5 = r5.a;	 Catch:{ all -> 0x0142 }
            r5 = r5.size();	 Catch:{ all -> 0x0142 }
            if (r7 < r5) goto L_0x00a6;	 Catch:{ all -> 0x0142 }
            r5 = r4.b;	 Catch:{ all -> 0x0142 }
            r5 = r5 + r2;	 Catch:{ all -> 0x0142 }
            r4.b = r5;	 Catch:{ all -> 0x0142 }
            r4.c = r3;	 Catch:{ all -> 0x0142 }
            r4 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r4 = r4.i;	 Catch:{ all -> 0x0142 }
            r5 = r4.b;	 Catch:{ all -> 0x0142 }
            r4 = r4.a;	 Catch:{ all -> 0x0142 }
            r4 = r4.size();	 Catch:{ all -> 0x0142 }
            if (r5 >= r4) goto L_0x00b6;	 Catch:{ all -> 0x0142 }
            r4 = 1;	 Catch:{ all -> 0x0142 }
            goto L_0x00b7;	 Catch:{ all -> 0x0142 }
            r4 = 0;	 Catch:{ all -> 0x0142 }
            if (r4 != 0) goto L_0x013b;	 Catch:{ all -> 0x0142 }
            r4 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r4.p = r6;	 Catch:{ all -> 0x0142 }
            r4 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r4 = r4.i;	 Catch:{ all -> 0x0142 }
            r4.b();	 Catch:{ all -> 0x0142 }
            r4 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r5 = r11.b();	 Catch:{ all -> 0x0142 }
            if (r5 != 0) goto L_0x00ce;	 Catch:{ all -> 0x0142 }
            r5 = 1;	 Catch:{ all -> 0x0142 }
            goto L_0x00cf;	 Catch:{ all -> 0x0142 }
            r5 = 0;	 Catch:{ all -> 0x0142 }
            r6 = "The error status must not be OK";	 Catch:{ all -> 0x0142 }
            com.google.common.base.Preconditions.checkArgument(r5, r6);	 Catch:{ all -> 0x0142 }
            r5 = new aiup;	 Catch:{ all -> 0x0142 }
            r6 = defpackage.aiuo.TRANSIENT_FAILURE;	 Catch:{ all -> 0x0142 }
            r5.<init>(r6, r11);	 Catch:{ all -> 0x0142 }
            r4.a(r5);	 Catch:{ all -> 0x0142 }
            r11 = r4.j;	 Catch:{ all -> 0x0142 }
            if (r11 != 0) goto L_0x00ea;	 Catch:{ all -> 0x0142 }
            r11 = r4.c;	 Catch:{ all -> 0x0142 }
            r11 = r11.a();	 Catch:{ all -> 0x0142 }
            r4.j = r11;	 Catch:{ all -> 0x0142 }
            r11 = r4.j;	 Catch:{ all -> 0x0142 }
            r5 = r11.a();	 Catch:{ all -> 0x0142 }
            r11 = r4.k;	 Catch:{ all -> 0x0142 }
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x0142 }
            r7 = r11.elapsed(r7);	 Catch:{ all -> 0x0142 }
            r5 = r5 - r7;	 Catch:{ all -> 0x0142 }
            r11 = defpackage.aixu.a;	 Catch:{ all -> 0x0142 }
            r7 = java.util.logging.Level.FINE;	 Catch:{ all -> 0x0142 }
            r11 = r11.isLoggable(r7);	 Catch:{ all -> 0x0142 }
            if (r11 == 0) goto L_0x0118;	 Catch:{ all -> 0x0142 }
            r11 = defpackage.aixu.a;	 Catch:{ all -> 0x0142 }
            r7 = java.util.logging.Level.FINE;	 Catch:{ all -> 0x0142 }
            r8 = "[{0}] Scheduling backoff for {1} ns";	 Catch:{ all -> 0x0142 }
            r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x0142 }
            r9 = r4.b;	 Catch:{ all -> 0x0142 }
            r1[r3] = r9;	 Catch:{ all -> 0x0142 }
            r9 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x0142 }
            r1[r2] = r9;	 Catch:{ all -> 0x0142 }
            r11.log(r7, r8, r1);	 Catch:{ all -> 0x0142 }
            r11 = r4.l;	 Catch:{ all -> 0x0142 }
            if (r11 != 0) goto L_0x011d;	 Catch:{ all -> 0x0142 }
            goto L_0x011e;	 Catch:{ all -> 0x0142 }
            r2 = 0;	 Catch:{ all -> 0x0142 }
            r11 = "previous reconnectTask is not done";	 Catch:{ all -> 0x0142 }
            com.google.common.base.Preconditions.checkState(r2, r11);	 Catch:{ all -> 0x0142 }
            r4.m = r3;	 Catch:{ all -> 0x0142 }
            r11 = r4.e;	 Catch:{ all -> 0x0142 }
            r1 = new aixy;	 Catch:{ all -> 0x0142 }
            r2 = new aixu$a;	 Catch:{ all -> 0x0142 }
            r2.<init>();	 Catch:{ all -> 0x0142 }
            r1.<init>(r2);	 Catch:{ all -> 0x0142 }
            r2 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x0142 }
            r11 = r11.schedule(r1, r5, r2);	 Catch:{ all -> 0x0142 }
            r4.l = r11;	 Catch:{ all -> 0x0142 }
            goto L_0x003d;	 Catch:{ all -> 0x0142 }
            r11 = defpackage.aixu.this;	 Catch:{ all -> 0x0142 }
            r11.c();	 Catch:{ all -> 0x0142 }
            goto L_0x003d;	 Catch:{ all -> 0x0142 }
            r11 = move-exception;	 Catch:{ all -> 0x0142 }
            monitor-exit(r0);	 Catch:{ all -> 0x0142 }
            throw r11;	 Catch:{ all -> 0x0145 }
            r11 = move-exception;
            r0 = defpackage.aixu.this;
            r0 = r0.h;
            r0.a();
            throw r11;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aixu$e.a(aivw):void");
        }

        public final void a(boolean z) {
            aixu.this.h.a(new Runnable(this.a, z) {
                public final void run() {
                    aixu.this.o.a(r3, r4);
                }
            }).a();
        }

        public final void b() {
            boolean z = true;
            if (aixu.a.isLoggable(Level.FINE)) {
                aixu.a.log(Level.FINE, "[{0}] {1} for {2} is terminated", new Object[]{aixu.this.b, this.a.b(), this.b});
            }
            aiva aiva = aixu.this.f;
            aiva.b(aiva.e, this.a);
            aixu.this.h.a(/* anonymous class already generated */).a();
            try {
                synchronized (aixu.this.g) {
                    aixu.this.n.remove(this.a);
                    if (aixu.this.r.a == aiuo.SHUTDOWN && aixu.this.n.isEmpty()) {
                        if (aixu.a.isLoggable(Level.FINE)) {
                            aixu.a.log(Level.FINE, "[{0}] Terminated in transportTerminated()", aixu.this.b);
                        }
                        aixu.this.d();
                    }
                }
                aixu.this.h.a();
                if (aixu.this.q == this.a) {
                    z = false;
                }
                Preconditions.checkState(z, "activeTransport still points to this transport. Seems transportShutdown() was not called.");
            } catch (Throwable th) {
                aixu.this.h.a();
            }
        }
    }

    /* renamed from: aixu$c */
    static abstract class c {
        c() {
        }

        /* Access modifiers changed, original: 0000 */
        public void a(aiup aiup) {
        }

        /* Access modifiers changed, original: 0000 */
        public void a(aixu aixu) {
        }

        /* Access modifiers changed, original: 0000 */
        public void b(aixu aixu) {
        }

        /* Access modifiers changed, original: 0000 */
        public void c(aixu aixu) {
        }
    }

    /* renamed from: aixu$3 */
    class 3 implements Runnable {
        3() {
        }

        public final void run() {
            aixu.this.d.a(aixu.this);
        }
    }

    /* renamed from: aixu$a */
    class a implements Runnable {
        a() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x003e in {6, 8, 10, 14, 20, 22} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void run() {
            /*
            r4 = this;
            r0 = defpackage.aixu.this;	 Catch:{ Throwable -> 0x002b }
            r0 = r0.g;	 Catch:{ Throwable -> 0x002b }
            monitor-enter(r0);	 Catch:{ Throwable -> 0x002b }
            r1 = defpackage.aixu.this;	 Catch:{ all -> 0x0026 }
            r2 = 0;	 Catch:{ all -> 0x0026 }
            r1.l = r2;	 Catch:{ all -> 0x0026 }
            r1 = defpackage.aixu.this;	 Catch:{ all -> 0x0026 }
            r1 = r1.m;	 Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0019;	 Catch:{ all -> 0x0026 }
            monitor-exit(r0);	 Catch:{ all -> 0x0026 }
            r0 = defpackage.aixu.this;
            r0 = r0.h;
            r0.a();
            return;
            r1 = defpackage.aixu.this;	 Catch:{ all -> 0x0026 }
            r2 = defpackage.aiuo.CONNECTING;	 Catch:{ all -> 0x0026 }
            r1.a(r2);	 Catch:{ all -> 0x0026 }
            r1 = defpackage.aixu.this;	 Catch:{ all -> 0x0026 }
            r1.c();	 Catch:{ all -> 0x0026 }
            goto L_0x0010;	 Catch:{ all -> 0x0026 }
            r1 = move-exception;	 Catch:{ all -> 0x0026 }
            monitor-exit(r0);	 Catch:{ all -> 0x0026 }
            throw r1;	 Catch:{ Throwable -> 0x002b }
            r0 = move-exception;
            goto L_0x0036;
            r0 = move-exception;
            r1 = defpackage.aixu.a;	 Catch:{ all -> 0x0029 }
            r2 = java.util.logging.Level.WARNING;	 Catch:{ all -> 0x0029 }
            r3 = "Exception handling end of backoff";	 Catch:{ all -> 0x0029 }
            r1.log(r2, r3, r0);	 Catch:{ all -> 0x0029 }
            goto L_0x0011;
            r1 = defpackage.aixu.this;
            r1 = r1.h;
            r1.a();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aixu$a.run():void");
        }
    }

    aixu(List<aiuw> list, String str, String str2, a aVar, aiwv aiwv, ScheduledExecutorService scheduledExecutorService, Supplier<Stopwatch> supplier, aiwp aiwp, c cVar, aiva aiva, aiwm aiwm, aiwq aiwq, aizd aizd) {
        Preconditions.checkNotNull(list, "addressGroups");
        Preconditions.checkArgument(list.isEmpty() ^ 1, "addressGroups is empty");
        aixu.a(list, "addressGroups contains null entry");
        this.i = new d(Collections.unmodifiableList(new ArrayList(list)));
        this.t = str;
        this.u = str2;
        this.c = aVar;
        this.v = aiwv;
        this.e = scheduledExecutorService;
        this.k = (Stopwatch) supplier.get();
        this.h = aiwp;
        this.d = cVar;
        this.f = aiva;
        this.w = aiwm;
        this.x = null;
        this.y = aizd;
    }

    static void a(List<?> list, String str) {
        for (Object checkNotNull : list) {
            Preconditions.checkNotNull(checkNotNull, str);
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:17:0x0024, code skipped:
            r3.h.a();
     */
    /* JADX WARNING: Missing block: B:18:0x002a, code skipped:
            return null;
     */
    public final defpackage.aiwu a() {
        /*
        r3 = this;
        r0 = r3.q;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r0 = r3.g;	 Catch:{ all -> 0x002e }
        monitor-enter(r0);	 Catch:{ all -> 0x002e }
        r1 = r3.q;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x0013;
    L_0x000c:
        monitor-exit(r0);	 Catch:{ all -> 0x002b }
        r0 = r3.h;
        r0.a();
        return r1;
    L_0x0013:
        r1 = r3.r;	 Catch:{ all -> 0x002b }
        r1 = r1.a;	 Catch:{ all -> 0x002b }
        r2 = defpackage.aiuo.IDLE;	 Catch:{ all -> 0x002b }
        if (r1 != r2) goto L_0x0023;
    L_0x001b:
        r1 = defpackage.aiuo.CONNECTING;	 Catch:{ all -> 0x002b }
        r3.a(r1);	 Catch:{ all -> 0x002b }
        r3.c();	 Catch:{ all -> 0x002b }
    L_0x0023:
        monitor-exit(r0);	 Catch:{ all -> 0x002b }
        r0 = r3.h;
        r0.a();
        r0 = 0;
        return r0;
    L_0x002b:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002b }
        throw r1;	 Catch:{ all -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        r1 = r3.h;
        r1.a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixu.a():aiwu");
    }

    /* Access modifiers changed, original: final */
    public final void a(aiuo aiuo) {
        a(aiup.a(aiuo));
    }

    /* Access modifiers changed, original: final */
    public final void a(final aiup aiup) {
        if (this.r.a != aiup.a) {
            Preconditions.checkState(this.r.a != aiuo.SHUTDOWN, "Cannot transition out of SHUTDOWN to ".concat(String.valueOf(aiup)));
            this.r = aiup;
            aiwq aiwq = this.x;
            if (aiwq != null) {
                aiva.a.a.a aVar = new aiva.a.a.a();
                StringBuilder stringBuilder = new StringBuilder("Entering ");
                stringBuilder.append(this.r);
                stringBuilder.append(" state");
                aVar.a = stringBuilder.toString();
                aVar.b = b.CT_INFO;
                aiwq.a(aVar.a(this.y.a()).a());
            }
            this.h.a(new Runnable() {
                public final void run() {
                    aixu.this.d.a(aiup);
                }
            });
        }
    }

    /* JADX WARNING: Missing block: B:19:0x0059, code skipped:
            r8.h.a();
     */
    /* JADX WARNING: Missing block: B:20:0x005e, code skipped:
            if (r1 == null) goto L_0x0063;
     */
    /* JADX WARNING: Missing block: B:21:0x0060, code skipped:
            r1.a(r9);
     */
    /* JADX WARNING: Missing block: B:22:0x0063, code skipped:
            if (r2 == null) goto L_0x0068;
     */
    /* JADX WARNING: Missing block: B:23:0x0065, code skipped:
            r2.a(r9);
     */
    /* JADX WARNING: Missing block: B:24:0x0068, code skipped:
            return;
     */
    public final void a(defpackage.aivw r9) {
        /*
        r8 = this;
        r0 = r8.g;	 Catch:{ all -> 0x006c }
        monitor-enter(r0);	 Catch:{ all -> 0x006c }
        r1 = r8.r;	 Catch:{ all -> 0x0069 }
        r1 = r1.a;	 Catch:{ all -> 0x0069 }
        r2 = defpackage.aiuo.SHUTDOWN;	 Catch:{ all -> 0x0069 }
        if (r1 != r2) goto L_0x0012;
    L_0x000b:
        monitor-exit(r0);	 Catch:{ all -> 0x0069 }
        r9 = r8.h;
        r9.a();
        return;
    L_0x0012:
        r8.s = r9;	 Catch:{ all -> 0x0069 }
        r1 = defpackage.aiuo.SHUTDOWN;	 Catch:{ all -> 0x0069 }
        r8.a(r1);	 Catch:{ all -> 0x0069 }
        r1 = r8.q;	 Catch:{ all -> 0x0069 }
        r2 = r8.p;	 Catch:{ all -> 0x0069 }
        r3 = 0;
        r8.q = r3;	 Catch:{ all -> 0x0069 }
        r8.p = r3;	 Catch:{ all -> 0x0069 }
        r4 = r8.i;	 Catch:{ all -> 0x0069 }
        r4.b();	 Catch:{ all -> 0x0069 }
        r4 = r8.n;	 Catch:{ all -> 0x0069 }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x0069 }
        if (r4 == 0) goto L_0x0047;
    L_0x002f:
        r8.d();	 Catch:{ all -> 0x0069 }
        r4 = a;	 Catch:{ all -> 0x0069 }
        r5 = java.util.logging.Level.FINE;	 Catch:{ all -> 0x0069 }
        r4 = r4.isLoggable(r5);	 Catch:{ all -> 0x0069 }
        if (r4 == 0) goto L_0x0047;
    L_0x003c:
        r4 = a;	 Catch:{ all -> 0x0069 }
        r5 = java.util.logging.Level.FINE;	 Catch:{ all -> 0x0069 }
        r6 = "[{0}] Terminated in shutdown()";
        r7 = r8.b;	 Catch:{ all -> 0x0069 }
        r4.log(r5, r6, r7);	 Catch:{ all -> 0x0069 }
    L_0x0047:
        r4 = r8.l;	 Catch:{ all -> 0x0069 }
        if (r4 == 0) goto L_0x0058;
    L_0x004b:
        r4 = r8.l;	 Catch:{ all -> 0x0069 }
        r5 = 0;
        r4.cancel(r5);	 Catch:{ all -> 0x0069 }
        r4 = 1;
        r8.m = r4;	 Catch:{ all -> 0x0069 }
        r8.l = r3;	 Catch:{ all -> 0x0069 }
        r8.j = r3;	 Catch:{ all -> 0x0069 }
    L_0x0058:
        monitor-exit(r0);	 Catch:{ all -> 0x0069 }
        r0 = r8.h;
        r0.a();
        if (r1 == 0) goto L_0x0063;
    L_0x0060:
        r1.a(r9);
    L_0x0063:
        if (r2 == 0) goto L_0x0068;
    L_0x0065:
        r2.a(r9);
    L_0x0068:
        return;
    L_0x0069:
        r9 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0069 }
        throw r9;	 Catch:{ all -> 0x006c }
    L_0x006c:
        r9 = move-exception;
        r0 = r8.h;
        r0.a();
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixu.a(aivw):void");
    }

    public final aivc b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        Preconditions.checkState(this.l == null, "Should have no reconnectTask scheduled");
        if (this.i.a()) {
            this.k.reset().start();
        }
        SocketAddress c = this.i.c();
        aiym aiym = null;
        if (c instanceof aiyn) {
            aiyn aiyn = (aiyn) c;
            aiym = aiyn.b;
            c = aiyn.a;
        }
        aiwv.a a = new aiwv.a().a(this.t).a(this.i.d());
        a.b = this.u;
        a.c = aiym;
        b bVar = new b(this.v.a(c, a), this.w, (byte) 0);
        this.f.a(bVar);
        if (a.isLoggable(Level.FINE)) {
            a.log(Level.FINE, "[{0}] Created {1} for {2}", new Object[]{this.b, bVar.b(), c});
        }
        this.p = bVar;
        this.n.add(bVar);
        Runnable a2 = bVar.a((aiyd.a) new e(bVar, c));
        if (a2 != null) {
            this.h.a(a2);
        }
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.h.a(new 3());
    }

    /* Access modifiers changed, original: final */
    public final List<aiuw> e() {
        try {
            List list;
            synchronized (this.g) {
                list = this.i.a;
            }
            this.h.a();
            return list;
        } catch (Throwable th) {
            this.h.a();
        }
    }

    public final String toString() {
        Object obj;
        synchronized (this.g) {
            obj = this.i.a;
        }
        return MoreObjects.toStringHelper((Object) this).add("logId", this.b.a).add("addressGroups", obj).toString();
    }
}
