package defpackage;

import defpackage.aivh.d;
import defpackage.aivh.f;
import defpackage.aiyd.a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* renamed from: aixb */
final class aixb implements aiyd {
    final Object a = new Object();
    final aiwp b;
    Runnable c;
    Runnable d;
    a e;
    Collection<a> f = new LinkedHashSet();
    aivw g;
    private final aivc h = aivc.a(getClass().getName());
    private final Executor i;
    private Runnable j;
    private f k;
    private long l;

    /* renamed from: aixb$a */
    class a extends aixc {
        final d a;
        final aiuq b;

        private a(d dVar) {
            this.b = aiuq.a();
            this.a = dVar;
        }

        /* synthetic */ a(aixb aixb, d dVar, byte b) {
            this(dVar);
        }

        public final void a(aivw aivw) {
            super.a(aivw);
            synchronized (aixb.this.a) {
                if (aixb.this.d != null) {
                    boolean remove = aixb.this.f.remove(this);
                    if (!aixb.this.a() && remove) {
                        aixb.this.b.a(aixb.this.c);
                        if (aixb.this.g != null) {
                            aixb.this.b.a(aixb.this.d);
                            aixb.this.d = null;
                        }
                    }
                }
            }
            aixb.this.b.a();
        }
    }

    /* renamed from: aixb$5 */
    class 5 implements Runnable {
        private /* synthetic */ a a;
        private /* synthetic */ aiwu b;

        5(a aVar, aiwu aiwu) {
            this.a = aVar;
            this.b = aiwu;
        }

        public final void run() {
            a aVar = this.a;
            aiwu aiwu = this.b;
            aiuq c = aVar.b.c();
            try {
                aiws a = aiwu.a(aVar.a.c(), aVar.a.b(), aVar.a.a());
                aVar.a(a);
            } finally {
                aVar = aVar.b;
                aVar.a(c);
            }
        }
    }

    aixb(Executor executor, aiwp aiwp) {
        this.i = executor;
        this.b = aiwp;
    }

    private a a(d dVar) {
        a aVar = new a(this, dVar, (byte) 0);
        this.f.add(aVar);
        if (c() == 1) {
            this.b.a(this.j);
        }
        return aVar;
    }

    private int c() {
        int size;
        synchronized (this.a) {
            size = this.f.size();
        }
        return size;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:49:0x0078 in {8, 9, 11, 20, 27, 29, 32, 35, 39, 41, 45, 48} preds:[]
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
    public final defpackage.aiws a(defpackage.aivm<?, ?> r6, defpackage.aivl r7, defpackage.aiuf r8) {
        /*
        r5 = this;
        r0 = new aiyj;	 Catch:{ all -> 0x0071 }
        r0.<init>(r6, r7, r8);	 Catch:{ all -> 0x0071 }
        r6 = r5.a;	 Catch:{ all -> 0x0071 }
        monitor-enter(r6);	 Catch:{ all -> 0x0071 }
        r7 = r5.g;	 Catch:{ all -> 0x006e }
        if (r7 != 0) goto L_0x0066;	 Catch:{ all -> 0x006e }
        r7 = r5.k;	 Catch:{ all -> 0x006e }
        if (r7 != 0) goto L_0x001b;	 Catch:{ all -> 0x006e }
        r7 = r5.a(r0);	 Catch:{ all -> 0x006e }
        monitor-exit(r6);	 Catch:{ all -> 0x006e }
        r6 = r5.b;
        r6.a();
        return r7;
        r7 = r5.k;	 Catch:{ all -> 0x006e }
        r1 = r5.l;	 Catch:{ all -> 0x006e }
        monitor-exit(r6);	 Catch:{ all -> 0x006e }
        r6 = r7.a(r0);	 Catch:{ all -> 0x0071 }
        r7 = r8.h;	 Catch:{ all -> 0x0071 }
        r6 = defpackage.aixo.a(r6, r7);	 Catch:{ all -> 0x0071 }
        if (r6 == 0) goto L_0x0042;	 Catch:{ all -> 0x0071 }
        r7 = r0.c();	 Catch:{ all -> 0x0071 }
        r8 = r0.b();	 Catch:{ all -> 0x0071 }
        r0 = r0.a();	 Catch:{ all -> 0x0071 }
        r6 = r6.a(r7, r8, r0);	 Catch:{ all -> 0x0071 }
        r7 = r5.b;
        r7.a();
        return r6;
        r6 = r5.a;	 Catch:{ all -> 0x0071 }
        monitor-enter(r6);	 Catch:{ all -> 0x0071 }
        r7 = r5.g;	 Catch:{ all -> 0x0063 }
        if (r7 == 0) goto L_0x0052;	 Catch:{ all -> 0x0063 }
        r7 = new aixg;	 Catch:{ all -> 0x0063 }
        r8 = r5.g;	 Catch:{ all -> 0x0063 }
        r7.<init>(r8);	 Catch:{ all -> 0x0063 }
        monitor-exit(r6);	 Catch:{ all -> 0x0063 }
        goto L_0x0015;	 Catch:{ all -> 0x0063 }
        r3 = r5.l;	 Catch:{ all -> 0x0063 }
        r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ all -> 0x0063 }
        if (r7 != 0) goto L_0x005d;	 Catch:{ all -> 0x0063 }
        r7 = r5.a(r0);	 Catch:{ all -> 0x0063 }
        goto L_0x0050;	 Catch:{ all -> 0x0063 }
        r7 = r5.k;	 Catch:{ all -> 0x0063 }
        r1 = r5.l;	 Catch:{ all -> 0x0063 }
        monitor-exit(r6);	 Catch:{ all -> 0x0063 }
        goto L_0x0020;	 Catch:{ all -> 0x0063 }
        r7 = move-exception;	 Catch:{ all -> 0x0063 }
        monitor-exit(r6);	 Catch:{ all -> 0x0063 }
        throw r7;	 Catch:{ all -> 0x0071 }
        r7 = new aixg;	 Catch:{ all -> 0x006e }
        r8 = r5.g;	 Catch:{ all -> 0x006e }
        r7.<init>(r8);	 Catch:{ all -> 0x006e }
        goto L_0x0014;	 Catch:{ all -> 0x006e }
        r7 = move-exception;	 Catch:{ all -> 0x006e }
        monitor-exit(r6);	 Catch:{ all -> 0x006e }
        throw r7;	 Catch:{ all -> 0x0071 }
        r6 = move-exception;
        r7 = r5.b;
        r7.a();
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixb.a(aivm, aivl, aiuf):aiws");
    }

    public final Runnable a(final a aVar) {
        this.e = aVar;
        this.j = new Runnable() {
            public final void run() {
                aVar.a(true);
            }
        };
        this.c = new Runnable() {
            public final void run() {
                aVar.a(false);
            }
        };
        this.d = new Runnable() {
            public final void run() {
                aVar.b();
            }
        };
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:49:0x00a8 in {7, 17, 18, 25, 28, 35, 38, 42, 45, 48} preds:[]
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
    final void a(defpackage.aivh.f r8) {
        /*
        r7 = this;
        r0 = r7.a;
        monitor-enter(r0);
        r7.k = r8;	 Catch:{ all -> 0x00a5 }
        r1 = r7.l;	 Catch:{ all -> 0x00a5 }
        r3 = 1;	 Catch:{ all -> 0x00a5 }
        r1 = r1 + r3;	 Catch:{ all -> 0x00a5 }
        r7.l = r1;	 Catch:{ all -> 0x00a5 }
        if (r8 == 0) goto L_0x00a3;	 Catch:{ all -> 0x00a5 }
        r1 = r7.a();	 Catch:{ all -> 0x00a5 }
        if (r1 != 0) goto L_0x0016;	 Catch:{ all -> 0x00a5 }
        goto L_0x00a3;	 Catch:{ all -> 0x00a5 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x00a5 }
        r2 = r7.f;	 Catch:{ all -> 0x00a5 }
        r1.<init>(r2);	 Catch:{ all -> 0x00a5 }
        monitor-exit(r0);	 Catch:{ all -> 0x00a5 }
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r1.iterator();
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x005b;
        r2 = r1.next();
        r2 = (defpackage.aixb.a) r2;
        r3 = r2.a;
        r3 = r8.a(r3);
        r4 = r2.a;
        r4 = r4.a();
        r5 = r4.h;
        r3 = defpackage.aixo.a(r3, r5);
        if (r3 == 0) goto L_0x0027;
        r5 = r7.i;
        r6 = r4.c;
        if (r6 == 0) goto L_0x004f;
        r5 = r4.c;
        r4 = new aixb$5;
        r4.<init>(r2, r3);
        r5.execute(r4);
        r0.add(r2);
        goto L_0x0027;
        r8 = r7.a;
        monitor-enter(r8);
        r1 = r7.a();	 Catch:{ all -> 0x00a0 }
        if (r1 != 0) goto L_0x0066;	 Catch:{ all -> 0x00a0 }
        monitor-exit(r8);	 Catch:{ all -> 0x00a0 }
        return;	 Catch:{ all -> 0x00a0 }
        r1 = r7.f;	 Catch:{ all -> 0x00a0 }
        r1.removeAll(r0);	 Catch:{ all -> 0x00a0 }
        r0 = r7.f;	 Catch:{ all -> 0x00a0 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00a0 }
        if (r0 == 0) goto L_0x007a;	 Catch:{ all -> 0x00a0 }
        r0 = new java.util.LinkedHashSet;	 Catch:{ all -> 0x00a0 }
        r0.<init>();	 Catch:{ all -> 0x00a0 }
        r7.f = r0;	 Catch:{ all -> 0x00a0 }
        r0 = r7.a();	 Catch:{ all -> 0x00a0 }
        if (r0 != 0) goto L_0x0099;	 Catch:{ all -> 0x00a0 }
        r0 = r7.b;	 Catch:{ all -> 0x00a0 }
        r1 = r7.c;	 Catch:{ all -> 0x00a0 }
        r0.a(r1);	 Catch:{ all -> 0x00a0 }
        r0 = r7.g;	 Catch:{ all -> 0x00a0 }
        if (r0 == 0) goto L_0x0099;	 Catch:{ all -> 0x00a0 }
        r0 = r7.d;	 Catch:{ all -> 0x00a0 }
        if (r0 == 0) goto L_0x0099;	 Catch:{ all -> 0x00a0 }
        r0 = r7.b;	 Catch:{ all -> 0x00a0 }
        r1 = r7.d;	 Catch:{ all -> 0x00a0 }
        r0.a(r1);	 Catch:{ all -> 0x00a0 }
        r0 = 0;	 Catch:{ all -> 0x00a0 }
        r7.d = r0;	 Catch:{ all -> 0x00a0 }
        monitor-exit(r8);	 Catch:{ all -> 0x00a0 }
        r8 = r7.b;
        r8.a();
        return;
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x00a0 }
        throw r0;
        monitor-exit(r0);	 Catch:{ all -> 0x00a5 }
        return;	 Catch:{ all -> 0x00a5 }
        r8 = move-exception;	 Catch:{ all -> 0x00a5 }
        monitor-exit(r0);	 Catch:{ all -> 0x00a5 }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixb.a(aivh$f):void");
    }

    /* JADX WARNING: Missing block: B:13:0x002a, code skipped:
            r3.b.a();
     */
    /* JADX WARNING: Missing block: B:14:0x002f, code skipped:
            return;
     */
    public final void a(final defpackage.aivw r4) {
        /*
        r3 = this;
        r0 = r3.a;
        monitor-enter(r0);
        r1 = r3.g;	 Catch:{ all -> 0x0030 }
        if (r1 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return;
    L_0x0009:
        r3.g = r4;	 Catch:{ all -> 0x0030 }
        r1 = r3.b;	 Catch:{ all -> 0x0030 }
        r2 = new aixb$4;	 Catch:{ all -> 0x0030 }
        r2.<init>(r4);	 Catch:{ all -> 0x0030 }
        r1.a(r2);	 Catch:{ all -> 0x0030 }
        r4 = r3.a();	 Catch:{ all -> 0x0030 }
        if (r4 != 0) goto L_0x0029;
    L_0x001b:
        r4 = r3.d;	 Catch:{ all -> 0x0030 }
        if (r4 == 0) goto L_0x0029;
    L_0x001f:
        r4 = r3.b;	 Catch:{ all -> 0x0030 }
        r1 = r3.d;	 Catch:{ all -> 0x0030 }
        r4.a(r1);	 Catch:{ all -> 0x0030 }
        r4 = 0;
        r3.d = r4;	 Catch:{ all -> 0x0030 }
    L_0x0029:
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        r4 = r3.b;
        r4.a();
        return;
    L_0x0030:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixb.a(aivw):void");
    }

    public final void a(aiwu.a aVar, Executor executor) {
        throw new UnsupportedOperationException("This method is not expected to be called");
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = !this.f.isEmpty();
        }
        return z;
    }

    public final aivc b() {
        return this.h;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x003f in {5, 11, 12, 13, 17} preds:[]
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
    public final void b(defpackage.aivw r5) {
        /*
        r4 = this;
        r4.a(r5);
        r0 = r4.a;
        monitor-enter(r0);
        r1 = r4.f;	 Catch:{ all -> 0x003c }
        r2 = r4.d;	 Catch:{ all -> 0x003c }
        r3 = 0;	 Catch:{ all -> 0x003c }
        r4.d = r3;	 Catch:{ all -> 0x003c }
        r3 = r4.f;	 Catch:{ all -> 0x003c }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x003c }
        if (r3 != 0) goto L_0x001b;	 Catch:{ all -> 0x003c }
        r3 = java.util.Collections.emptyList();	 Catch:{ all -> 0x003c }
        r4.f = r3;	 Catch:{ all -> 0x003c }
        monitor-exit(r0);	 Catch:{ all -> 0x003c }
        if (r2 == 0) goto L_0x003b;
        r0 = r1.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0032;
        r1 = r0.next();
        r1 = (defpackage.aixb.a) r1;
        r1.a(r5);
        goto L_0x0022;
        r5 = r4.b;
        r5 = r5.a(r2);
        r5.a();
        return;
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003c }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixb.b(aivw):void");
    }
}
