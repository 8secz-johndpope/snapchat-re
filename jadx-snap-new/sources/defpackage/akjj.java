package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;

/* renamed from: akjj */
public final class akjj {
    static final /* synthetic */ boolean l = (akjj.class.desiredAssertionStatus() ^ 1);
    long a = 0;
    long b;
    final int c;
    final akjh d;
    List<akjd> e;
    boolean f;
    final b g;
    final a h;
    final c i = new c();
    final c j = new c();
    akjc k = null;
    private final List<akjd> m;

    /* renamed from: akjj$a */
    final class a implements akku {
        private static /* synthetic */ boolean d = (akjj.class.desiredAssertionStatus() ^ 1);
        boolean a;
        boolean b;
        private final akkd c = new akkd();

        a() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:39:0x0088 in {14, 24, 25, 28, 31, 35, 38} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private void a(boolean r12) {
            /*
            r11 = this;
            r0 = defpackage.akjj.this;
            monitor-enter(r0);
            r1 = defpackage.akjj.this;	 Catch:{ all -> 0x0085 }
            r1 = r1.j;	 Catch:{ all -> 0x0085 }
            r1.aq_();	 Catch:{ all -> 0x0085 }
            r1 = defpackage.akjj.this;	 Catch:{ all -> 0x007c }
            r1 = r1.b;	 Catch:{ all -> 0x007c }
            r3 = 0;	 Catch:{ all -> 0x007c }
            r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ all -> 0x007c }
            if (r5 > 0) goto L_0x0028;	 Catch:{ all -> 0x007c }
            r1 = r11.b;	 Catch:{ all -> 0x007c }
            if (r1 != 0) goto L_0x0028;	 Catch:{ all -> 0x007c }
            r1 = r11.a;	 Catch:{ all -> 0x007c }
            if (r1 != 0) goto L_0x0028;	 Catch:{ all -> 0x007c }
            r1 = defpackage.akjj.this;	 Catch:{ all -> 0x007c }
            r1 = r1.k;	 Catch:{ all -> 0x007c }
            if (r1 != 0) goto L_0x0028;	 Catch:{ all -> 0x007c }
            r1 = defpackage.akjj.this;	 Catch:{ all -> 0x007c }
            r1.h();	 Catch:{ all -> 0x007c }
            goto L_0x000a;
            r1 = defpackage.akjj.this;	 Catch:{ all -> 0x0085 }
            r1 = r1.j;	 Catch:{ all -> 0x0085 }
            r1.b();	 Catch:{ all -> 0x0085 }
            r1 = defpackage.akjj.this;	 Catch:{ all -> 0x0085 }
            r1.g();	 Catch:{ all -> 0x0085 }
            r1 = defpackage.akjj.this;	 Catch:{ all -> 0x0085 }
            r1 = r1.b;	 Catch:{ all -> 0x0085 }
            r3 = r11.c;	 Catch:{ all -> 0x0085 }
            r3 = r3.b;	 Catch:{ all -> 0x0085 }
            r9 = java.lang.Math.min(r1, r3);	 Catch:{ all -> 0x0085 }
            r1 = defpackage.akjj.this;	 Catch:{ all -> 0x0085 }
            r2 = r1.b;	 Catch:{ all -> 0x0085 }
            r2 = r2 - r9;	 Catch:{ all -> 0x0085 }
            r1.b = r2;	 Catch:{ all -> 0x0085 }
            monitor-exit(r0);	 Catch:{ all -> 0x0085 }
            r0 = defpackage.akjj.this;
            r0 = r0.j;
            r0.aq_();
            r0 = defpackage.akjj.this;	 Catch:{ all -> 0x0073 }
            r5 = r0.d;	 Catch:{ all -> 0x0073 }
            r0 = defpackage.akjj.this;	 Catch:{ all -> 0x0073 }
            r6 = r0.c;	 Catch:{ all -> 0x0073 }
            if (r12 == 0) goto L_0x0064;	 Catch:{ all -> 0x0073 }
            r12 = r11.c;	 Catch:{ all -> 0x0073 }
            r0 = r12.b;	 Catch:{ all -> 0x0073 }
            r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));	 Catch:{ all -> 0x0073 }
            if (r12 != 0) goto L_0x0064;	 Catch:{ all -> 0x0073 }
            r12 = 1;	 Catch:{ all -> 0x0073 }
            r7 = 1;	 Catch:{ all -> 0x0073 }
            goto L_0x0066;	 Catch:{ all -> 0x0073 }
            r12 = 0;	 Catch:{ all -> 0x0073 }
            r7 = 0;	 Catch:{ all -> 0x0073 }
            r8 = r11.c;	 Catch:{ all -> 0x0073 }
            r5.a(r6, r7, r8, r9);	 Catch:{ all -> 0x0073 }
            r12 = defpackage.akjj.this;
            r12 = r12.j;
            r12.b();
            return;
            r12 = move-exception;
            r0 = defpackage.akjj.this;
            r0 = r0.j;
            r0.b();
            throw r12;
            r12 = move-exception;
            r1 = defpackage.akjj.this;	 Catch:{ all -> 0x0085 }
            r1 = r1.j;	 Catch:{ all -> 0x0085 }
            r1.b();	 Catch:{ all -> 0x0085 }
            throw r12;	 Catch:{ all -> 0x0085 }
            r12 = move-exception;	 Catch:{ all -> 0x0085 }
            monitor-exit(r0);	 Catch:{ all -> 0x0085 }
            throw r12;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akjj$a.a(boolean):void");
        }

        public final akkw a() {
            return akjj.this.j;
        }

        public final void a_(akkd akkd, long j) {
            if (d || !Thread.holdsLock(akjj.this)) {
                this.c.a_(akkd, j);
                while (this.c.b >= 16384) {
                    a(false);
                }
                return;
            }
            throw new AssertionError();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x0066 in {4, 6, 13, 21, 22, 29, 33, 37} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void close() {
            /*
            r8 = this;
            r0 = d;
            if (r0 != 0) goto L_0x0013;
            r0 = defpackage.akjj.this;
            r0 = java.lang.Thread.holdsLock(r0);
            if (r0 != 0) goto L_0x000d;
            goto L_0x0013;
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
            r0 = defpackage.akjj.this;
            monitor-enter(r0);
            r1 = r8.a;	 Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x0063 }
            monitor-exit(r0);	 Catch:{ all -> 0x0063 }
            return;	 Catch:{ all -> 0x0063 }
            monitor-exit(r0);	 Catch:{ all -> 0x0063 }
            r0 = defpackage.akjj.this;
            r0 = r0.h;
            r0 = r0.b;
            r1 = 1;
            if (r0 != 0) goto L_0x004b;
            r0 = r8.c;
            r2 = r0.b;
            r4 = 0;
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x003c;
            r0 = r8.c;
            r2 = r0.b;
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x004b;
            r8.a(r1);
            goto L_0x0030;
            r0 = defpackage.akjj.this;
            r2 = r0.d;
            r0 = defpackage.akjj.this;
            r3 = r0.c;
            r4 = 1;
            r5 = 0;
            r6 = 0;
            r2.a(r3, r4, r5, r6);
            r2 = defpackage.akjj.this;
            monitor-enter(r2);
            r8.a = r1;	 Catch:{ all -> 0x0060 }
            monitor-exit(r2);	 Catch:{ all -> 0x0060 }
            r0 = defpackage.akjj.this;
            r0 = r0.d;
            r0 = r0.p;
            r0.b();
            r0 = defpackage.akjj.this;
            r0.f();
            return;
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0060 }
            throw r0;
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0063 }
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akjj$a.close():void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0038 in {4, 6, 14, 15, 19} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void flush() {
            /*
            r5 = this;
            r0 = d;
            if (r0 != 0) goto L_0x0013;
            r0 = defpackage.akjj.this;
            r0 = java.lang.Thread.holdsLock(r0);
            if (r0 != 0) goto L_0x000d;
            goto L_0x0013;
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
            r0 = defpackage.akjj.this;
            monitor-enter(r0);
            r1 = defpackage.akjj.this;	 Catch:{ all -> 0x0035 }
            r1.g();	 Catch:{ all -> 0x0035 }
            monitor-exit(r0);	 Catch:{ all -> 0x0035 }
            r0 = r5.c;
            r0 = r0.b;
            r2 = 0;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 <= 0) goto L_0x0034;
            r0 = 0;
            r5.a(r0);
            r0 = defpackage.akjj.this;
            r0 = r0.d;
            r0 = r0.p;
            r0.b();
            goto L_0x001c;
            return;
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0035 }
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akjj$a.flush():void");
        }
    }

    /* renamed from: akjj$b */
    final class b implements akkv {
        private static /* synthetic */ boolean f = (akjj.class.desiredAssertionStatus() ^ 1);
        boolean a;
        boolean b;
        private final akkd c = new akkd();
        private final akkd d = new akkd();
        private final long e;

        b(long j) {
            this.e = j;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0036 in {11, 13, 16} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private void b() {
            /*
            r5 = this;
            r0 = defpackage.akjj.this;
            r0 = r0.i;
            r0.aq_();
            r0 = r5.d;	 Catch:{ all -> 0x002d }
            r0 = r0.b;	 Catch:{ all -> 0x002d }
            r2 = 0;	 Catch:{ all -> 0x002d }
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x0025;	 Catch:{ all -> 0x002d }
            r0 = r5.b;	 Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x0025;	 Catch:{ all -> 0x002d }
            r0 = r5.a;	 Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x0025;	 Catch:{ all -> 0x002d }
            r0 = defpackage.akjj.this;	 Catch:{ all -> 0x002d }
            r0 = r0.k;	 Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x0025;	 Catch:{ all -> 0x002d }
            r0 = defpackage.akjj.this;	 Catch:{ all -> 0x002d }
            r0.h();	 Catch:{ all -> 0x002d }
            goto L_0x0007;
            r0 = defpackage.akjj.this;
            r0 = r0.i;
            r0.b();
            return;
            r0 = move-exception;
            r1 = defpackage.akjj.this;
            r1 = r1.i;
            r1.b();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akjj$b.b():void");
        }

        /* JADX WARNING: Missing block: B:18:0x0060, code skipped:
            r10 = r7.g.d;
     */
        /* JADX WARNING: Missing block: B:19:0x0064, code skipped:
            monitor-enter(r10);
     */
        /* JADX WARNING: Missing block: B:21:?, code skipped:
            r2 = r7.g.d;
            r2.k += r8;
     */
        /* JADX WARNING: Missing block: B:22:0x0083, code skipped:
            if (r7.g.d.k < ((long) (r7.g.d.m.b() / 2))) goto L_0x0099;
     */
        /* JADX WARNING: Missing block: B:23:0x0085, code skipped:
            r7.g.d.a(0, r7.g.d.k);
            r7.g.d.k = 0;
     */
        /* JADX WARNING: Missing block: B:24:0x0099, code skipped:
            monitor-exit(r10);
     */
        /* JADX WARNING: Missing block: B:25:0x009a, code skipped:
            return r8;
     */
        public final long a(defpackage.akkd r8, long r9) {
            /*
            r7 = this;
            r0 = 0;
            r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
            if (r2 < 0) goto L_0x00b3;
        L_0x0006:
            r2 = defpackage.akjj.this;
            monitor-enter(r2);
            r7.b();	 Catch:{ all -> 0x00b0 }
            r3 = r7.a;	 Catch:{ all -> 0x00b0 }
            if (r3 != 0) goto L_0x00a8;
        L_0x0010:
            r3 = defpackage.akjj.this;	 Catch:{ all -> 0x00b0 }
            r3 = r3.k;	 Catch:{ all -> 0x00b0 }
            if (r3 != 0) goto L_0x009e;
        L_0x0016:
            r3 = r7.d;	 Catch:{ all -> 0x00b0 }
            r3 = r3.b;	 Catch:{ all -> 0x00b0 }
            r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
            if (r5 != 0) goto L_0x0022;
        L_0x001e:
            r8 = -1;
            monitor-exit(r2);	 Catch:{ all -> 0x00b0 }
            return r8;
        L_0x0022:
            r3 = r7.d;	 Catch:{ all -> 0x00b0 }
            r4 = r7.d;	 Catch:{ all -> 0x00b0 }
            r4 = r4.b;	 Catch:{ all -> 0x00b0 }
            r9 = java.lang.Math.min(r9, r4);	 Catch:{ all -> 0x00b0 }
            r8 = r3.a(r8, r9);	 Catch:{ all -> 0x00b0 }
            r10 = defpackage.akjj.this;	 Catch:{ all -> 0x00b0 }
            r3 = r10.a;	 Catch:{ all -> 0x00b0 }
            r3 = r3 + r8;
            r10.a = r3;	 Catch:{ all -> 0x00b0 }
            r10 = defpackage.akjj.this;	 Catch:{ all -> 0x00b0 }
            r3 = r10.a;	 Catch:{ all -> 0x00b0 }
            r10 = defpackage.akjj.this;	 Catch:{ all -> 0x00b0 }
            r10 = r10.d;	 Catch:{ all -> 0x00b0 }
            r10 = r10.m;	 Catch:{ all -> 0x00b0 }
            r10 = r10.b();	 Catch:{ all -> 0x00b0 }
            r10 = r10 / 2;
            r5 = (long) r10;	 Catch:{ all -> 0x00b0 }
            r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r10 < 0) goto L_0x005f;
        L_0x004c:
            r10 = defpackage.akjj.this;	 Catch:{ all -> 0x00b0 }
            r10 = r10.d;	 Catch:{ all -> 0x00b0 }
            r3 = defpackage.akjj.this;	 Catch:{ all -> 0x00b0 }
            r3 = r3.c;	 Catch:{ all -> 0x00b0 }
            r4 = defpackage.akjj.this;	 Catch:{ all -> 0x00b0 }
            r4 = r4.a;	 Catch:{ all -> 0x00b0 }
            r10.a(r3, r4);	 Catch:{ all -> 0x00b0 }
            r10 = defpackage.akjj.this;	 Catch:{ all -> 0x00b0 }
            r10.a = r0;	 Catch:{ all -> 0x00b0 }
        L_0x005f:
            monitor-exit(r2);	 Catch:{ all -> 0x00b0 }
            r10 = defpackage.akjj.this;
            r10 = r10.d;
            monitor-enter(r10);
            r2 = defpackage.akjj.this;	 Catch:{ all -> 0x009b }
            r2 = r2.d;	 Catch:{ all -> 0x009b }
            r3 = r2.k;	 Catch:{ all -> 0x009b }
            r3 = r3 + r8;
            r2.k = r3;	 Catch:{ all -> 0x009b }
            r2 = defpackage.akjj.this;	 Catch:{ all -> 0x009b }
            r2 = r2.d;	 Catch:{ all -> 0x009b }
            r2 = r2.k;	 Catch:{ all -> 0x009b }
            r4 = defpackage.akjj.this;	 Catch:{ all -> 0x009b }
            r4 = r4.d;	 Catch:{ all -> 0x009b }
            r4 = r4.m;	 Catch:{ all -> 0x009b }
            r4 = r4.b();	 Catch:{ all -> 0x009b }
            r4 = r4 / 2;
            r4 = (long) r4;	 Catch:{ all -> 0x009b }
            r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r6 < 0) goto L_0x0099;
        L_0x0085:
            r2 = defpackage.akjj.this;	 Catch:{ all -> 0x009b }
            r2 = r2.d;	 Catch:{ all -> 0x009b }
            r3 = 0;
            r4 = defpackage.akjj.this;	 Catch:{ all -> 0x009b }
            r4 = r4.d;	 Catch:{ all -> 0x009b }
            r4 = r4.k;	 Catch:{ all -> 0x009b }
            r2.a(r3, r4);	 Catch:{ all -> 0x009b }
            r2 = defpackage.akjj.this;	 Catch:{ all -> 0x009b }
            r2 = r2.d;	 Catch:{ all -> 0x009b }
            r2.k = r0;	 Catch:{ all -> 0x009b }
        L_0x0099:
            monitor-exit(r10);	 Catch:{ all -> 0x009b }
            return r8;
        L_0x009b:
            r8 = move-exception;
            monitor-exit(r10);	 Catch:{ all -> 0x009b }
            throw r8;
        L_0x009e:
            r8 = new akjp;	 Catch:{ all -> 0x00b0 }
            r9 = defpackage.akjj.this;	 Catch:{ all -> 0x00b0 }
            r9 = r9.k;	 Catch:{ all -> 0x00b0 }
            r8.<init>(r9);	 Catch:{ all -> 0x00b0 }
            throw r8;	 Catch:{ all -> 0x00b0 }
        L_0x00a8:
            r8 = new java.io.IOException;	 Catch:{ all -> 0x00b0 }
            r9 = "stream closed";
            r8.<init>(r9);	 Catch:{ all -> 0x00b0 }
            throw r8;	 Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r8 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x00b0 }
            throw r8;
        L_0x00b3:
            r8 = new java.lang.IllegalArgumentException;
            r9 = java.lang.String.valueOf(r9);
            r10 = "byteCount < 0: ";
            r9 = r10.concat(r9);
            r8.<init>(r9);
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akjj$b.a(akkd, long):long");
        }

        public final akkw a() {
            return akjj.this.i;
        }

        /* Access modifiers changed, original: final */
        public final void a(akkf akkf, long j) {
            if (f || !Thread.holdsLock(akjj.this)) {
                while (j > 0) {
                    boolean z;
                    Object obj;
                    Object obj2;
                    synchronized (akjj.this) {
                        z = this.b;
                        obj = 1;
                        obj2 = this.d.b + j > this.e ? 1 : null;
                    }
                    if (obj2 != null) {
                        akkf.f(j);
                        akjj.this.b(akjc.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        akkf.f(j);
                        return;
                    } else {
                        long a = akkf.a(this.c, j);
                        if (a != -1) {
                            j -= a;
                            synchronized (akjj.this) {
                                if (this.d.b != 0) {
                                    obj = null;
                                }
                                this.d.a(this.c);
                                if (obj != null) {
                                    akjj.this.notifyAll();
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError();
        }

        public final void close() {
            synchronized (akjj.this) {
                this.a = true;
                this.d.r();
                akjj.this.notifyAll();
            }
            akjj.this.f();
        }
    }

    /* renamed from: akjj$c */
    class c extends akkb {
        c() {
        }

        public final IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void a() {
            akjj.this.b(akjc.CANCEL);
        }

        public final void b() {
            if (ar_()) {
                throw a(null);
            }
        }
    }

    akjj(int i, akjh akjh, boolean z, boolean z2, List<akjd> list) {
        if (akjh == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.c = i;
            this.d = akjh;
            this.b = (long) akjh.n.b();
            this.g = new b((long) akjh.m.b());
            this.h = new a();
            this.g.b = z2;
            this.h.b = z;
            this.m = list;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    private boolean d(akjc akjc) {
        if (l || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.k != null) {
                    return false;
                } else if (this.g.b && this.h.b) {
                    return false;
                } else {
                    this.k = akjc;
                    notifyAll();
                    this.d.b(this.c);
                    return true;
                }
            }
        }
        throw new AssertionError();
    }

    /* Access modifiers changed, original: final */
    public final void a(long j) {
        this.b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void a(akjc akjc) {
        if (d(akjc)) {
            this.d.b(this.c, akjc);
        }
    }

    public final synchronized boolean a() {
        return this.k != null ? false : ((this.g.b || this.g.a) && ((this.h.b || this.h.a) && this.f)) ? false : true;
    }

    public final void b(akjc akjc) {
        if (d(akjc)) {
            this.d.a(this.c, akjc);
        }
    }

    public final boolean b() {
        return this.d.b == ((this.c & 1) == 1);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0040 in {11, 17, 20, 23, 25, 28} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized java.util.List<defpackage.akjd> c() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.b();	 Catch:{ all -> 0x003d }
        if (r0 == 0) goto L_0x0035;	 Catch:{ all -> 0x003d }
        r0 = r2.i;	 Catch:{ all -> 0x003d }
        r0.aq_();	 Catch:{ all -> 0x003d }
        r0 = r2.e;	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x0018;	 Catch:{ all -> 0x002e }
        r0 = r2.k;	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x0018;	 Catch:{ all -> 0x002e }
        r2.h();	 Catch:{ all -> 0x002e }
        goto L_0x000c;
        r0 = r2.i;	 Catch:{ all -> 0x003d }
        r0.b();	 Catch:{ all -> 0x003d }
        r0 = r2.e;	 Catch:{ all -> 0x003d }
        if (r0 == 0) goto L_0x0026;	 Catch:{ all -> 0x003d }
        r1 = 0;	 Catch:{ all -> 0x003d }
        r2.e = r1;	 Catch:{ all -> 0x003d }
        monitor-exit(r2);
        return r0;
        r0 = new akjp;	 Catch:{ all -> 0x003d }
        r1 = r2.k;	 Catch:{ all -> 0x003d }
        r0.<init>(r1);	 Catch:{ all -> 0x003d }
        throw r0;	 Catch:{ all -> 0x003d }
        r0 = move-exception;	 Catch:{ all -> 0x003d }
        r1 = r2.i;	 Catch:{ all -> 0x003d }
        r1.b();	 Catch:{ all -> 0x003d }
        throw r0;	 Catch:{ all -> 0x003d }
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x003d }
        r1 = "servers cannot read response headers";	 Catch:{ all -> 0x003d }
        r0.<init>(r1);	 Catch:{ all -> 0x003d }
        throw r0;	 Catch:{ all -> 0x003d }
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjj.c():java.util.List");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void c(akjc akjc) {
        if (this.k == null) {
            this.k = akjc;
            notifyAll();
        }
    }

    public final akku d() {
        synchronized (this) {
            if (!this.f) {
                if (!b()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.h;
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        if (l || !Thread.holdsLock(this)) {
            boolean a;
            synchronized (this) {
                this.g.b = true;
                a = a();
                notifyAll();
            }
            if (!a) {
                this.d.b(this.c);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        if (l || !Thread.holdsLock(this)) {
            Object obj;
            boolean a;
            synchronized (this) {
                obj = (!this.g.b && this.g.a && (this.h.b || this.h.a)) ? 1 : null;
                a = a();
            }
            if (obj != null) {
                a(akjc.CANCEL);
                return;
            }
            if (!a) {
                this.d.b(this.c);
            }
            return;
        }
        throw new AssertionError();
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        if (this.h.a) {
            throw new IOException("stream closed");
        } else if (this.h.b) {
            throw new IOException("stream finished");
        } else {
            akjc akjc = this.k;
            if (akjc != null) {
                throw new akjp(akjc);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void h() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }
}
