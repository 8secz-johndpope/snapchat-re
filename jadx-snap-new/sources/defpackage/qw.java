package defpackage;

import android.content.Context;
import defpackage.qz.a;
import java.util.List;

/* renamed from: qw */
public final class qw implements a {
    private static final String a = pq.a("WorkConstraintsTracker");
    private final qv b;
    private final qz[] c;
    private final Object d = new Object();

    public qw(Context context, qv qvVar) {
        context = context.getApplicationContext();
        this.b = qvVar;
        this.c = new qz[]{new qx(context), new qy(context), new re(context), new ra(context), new rd(context), new rc(context), new rb(context)};
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0025 in {8, 9, 11, 14} preds:[]
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
    public final void a() {
        /*
        r5 = this;
        r0 = r5.d;
        monitor-enter(r0);
        r1 = r5.c;	 Catch:{ all -> 0x0022 }
        r2 = 0;	 Catch:{ all -> 0x0022 }
        r3 = 7;	 Catch:{ all -> 0x0022 }
        if (r2 >= r3) goto L_0x0020;	 Catch:{ all -> 0x0022 }
        r3 = r1[r2];	 Catch:{ all -> 0x0022 }
        r4 = r3.a;	 Catch:{ all -> 0x0022 }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x0022 }
        if (r4 != 0) goto L_0x001d;	 Catch:{ all -> 0x0022 }
        r4 = r3.a;	 Catch:{ all -> 0x0022 }
        r4.clear();	 Catch:{ all -> 0x0022 }
        r4 = r3.c;	 Catch:{ all -> 0x0022 }
        r4.b(r3);	 Catch:{ all -> 0x0022 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0022 }
        goto L_0x0006;	 Catch:{ all -> 0x0022 }
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        return;	 Catch:{ all -> 0x0022 }
        r1 = move-exception;	 Catch:{ all -> 0x0022 }
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw.a():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0031 in {6, 9, 12, 14, 17} preds:[]
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
    public final void a(java.util.List<defpackage.rv> r7) {
        /*
        r6 = this;
        r0 = r6.d;
        monitor-enter(r0);
        r1 = r6.c;	 Catch:{ all -> 0x002e }
        r2 = 0;	 Catch:{ all -> 0x002e }
        r3 = 0;	 Catch:{ all -> 0x002e }
        r4 = 7;	 Catch:{ all -> 0x002e }
        if (r3 >= r4) goto L_0x0013;	 Catch:{ all -> 0x002e }
        r4 = r1[r3];	 Catch:{ all -> 0x002e }
        r5 = 0;	 Catch:{ all -> 0x002e }
        r4.a(r5);	 Catch:{ all -> 0x002e }
        r3 = r3 + 1;	 Catch:{ all -> 0x002e }
        goto L_0x0007;	 Catch:{ all -> 0x002e }
        r1 = r6.c;	 Catch:{ all -> 0x002e }
        r3 = 0;	 Catch:{ all -> 0x002e }
        if (r3 >= r4) goto L_0x0020;	 Catch:{ all -> 0x002e }
        r5 = r1[r3];	 Catch:{ all -> 0x002e }
        r5.a(r7);	 Catch:{ all -> 0x002e }
        r3 = r3 + 1;	 Catch:{ all -> 0x002e }
        goto L_0x0016;	 Catch:{ all -> 0x002e }
        r7 = r6.c;	 Catch:{ all -> 0x002e }
        if (r2 >= r4) goto L_0x002c;	 Catch:{ all -> 0x002e }
        r1 = r7[r2];	 Catch:{ all -> 0x002e }
        r1.a(r6);	 Catch:{ all -> 0x002e }
        r2 = r2 + 1;	 Catch:{ all -> 0x002e }
        goto L_0x0022;	 Catch:{ all -> 0x002e }
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        return;	 Catch:{ all -> 0x002e }
        r7 = move-exception;	 Catch:{ all -> 0x002e }
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw.a(java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0050 in {12, 13, 17, 18, 20, 23} preds:[]
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
    public final boolean a(java.lang.String r9) {
        /*
        r8 = this;
        r0 = r8.d;
        monitor-enter(r0);
        r1 = r8.c;	 Catch:{ all -> 0x004d }
        r2 = 0;	 Catch:{ all -> 0x004d }
        r3 = 0;	 Catch:{ all -> 0x004d }
        r4 = 7;	 Catch:{ all -> 0x004d }
        r5 = 1;	 Catch:{ all -> 0x004d }
        if (r3 >= r4) goto L_0x004b;	 Catch:{ all -> 0x004d }
        r4 = r1[r3];	 Catch:{ all -> 0x004d }
        r6 = r4.b;	 Catch:{ all -> 0x004d }
        if (r6 == 0) goto L_0x0023;	 Catch:{ all -> 0x004d }
        r6 = r4.b;	 Catch:{ all -> 0x004d }
        r6 = r4.b(r6);	 Catch:{ all -> 0x004d }
        if (r6 == 0) goto L_0x0023;	 Catch:{ all -> 0x004d }
        r6 = r4.a;	 Catch:{ all -> 0x004d }
        r6 = r6.contains(r9);	 Catch:{ all -> 0x004d }
        if (r6 == 0) goto L_0x0023;	 Catch:{ all -> 0x004d }
        r6 = 1;	 Catch:{ all -> 0x004d }
        goto L_0x0024;	 Catch:{ all -> 0x004d }
        r6 = 0;	 Catch:{ all -> 0x004d }
        if (r6 == 0) goto L_0x0048;	 Catch:{ all -> 0x004d }
        r1 = defpackage.pq.a();	 Catch:{ all -> 0x004d }
        r3 = a;	 Catch:{ all -> 0x004d }
        r6 = "Work %s constrained by %s";	 Catch:{ all -> 0x004d }
        r7 = 2;	 Catch:{ all -> 0x004d }
        r7 = new java.lang.Object[r7];	 Catch:{ all -> 0x004d }
        r7[r2] = r9;	 Catch:{ all -> 0x004d }
        r9 = r4.getClass();	 Catch:{ all -> 0x004d }
        r9 = r9.getSimpleName();	 Catch:{ all -> 0x004d }
        r7[r5] = r9;	 Catch:{ all -> 0x004d }
        r9 = java.lang.String.format(r6, r7);	 Catch:{ all -> 0x004d }
        r4 = new java.lang.Throwable[r2];	 Catch:{ all -> 0x004d }
        r1.a(r3, r9, r4);	 Catch:{ all -> 0x004d }
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        return r2;	 Catch:{ all -> 0x004d }
        r3 = r3 + 1;	 Catch:{ all -> 0x004d }
        goto L_0x0007;	 Catch:{ all -> 0x004d }
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        return r5;	 Catch:{ all -> 0x004d }
        r9 = move-exception;	 Catch:{ all -> 0x004d }
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw.a(java.lang.String):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0047 in {8, 11, 13, 16} preds:[]
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
    public final void b(java.util.List<java.lang.String> r9) {
        /*
        r8 = this;
        r0 = r8.d;
        monitor-enter(r0);
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0044 }
        r1.<init>();	 Catch:{ all -> 0x0044 }
        r9 = r9.iterator();	 Catch:{ all -> 0x0044 }
        r2 = r9.hasNext();	 Catch:{ all -> 0x0044 }
        if (r2 == 0) goto L_0x0039;	 Catch:{ all -> 0x0044 }
        r2 = r9.next();	 Catch:{ all -> 0x0044 }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x0044 }
        r3 = r8.a(r2);	 Catch:{ all -> 0x0044 }
        if (r3 == 0) goto L_0x000c;	 Catch:{ all -> 0x0044 }
        r3 = defpackage.pq.a();	 Catch:{ all -> 0x0044 }
        r4 = a;	 Catch:{ all -> 0x0044 }
        r5 = "Constraints met for %s";	 Catch:{ all -> 0x0044 }
        r6 = 1;	 Catch:{ all -> 0x0044 }
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x0044 }
        r7 = 0;	 Catch:{ all -> 0x0044 }
        r6[r7] = r2;	 Catch:{ all -> 0x0044 }
        r5 = java.lang.String.format(r5, r6);	 Catch:{ all -> 0x0044 }
        r6 = new java.lang.Throwable[r7];	 Catch:{ all -> 0x0044 }
        r3.a(r4, r5, r6);	 Catch:{ all -> 0x0044 }
        r1.add(r2);	 Catch:{ all -> 0x0044 }
        goto L_0x000c;	 Catch:{ all -> 0x0044 }
        r9 = r8.b;	 Catch:{ all -> 0x0044 }
        if (r9 == 0) goto L_0x0042;	 Catch:{ all -> 0x0044 }
        r9 = r8.b;	 Catch:{ all -> 0x0044 }
        r9.a(r1);	 Catch:{ all -> 0x0044 }
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        return;	 Catch:{ all -> 0x0044 }
        r9 = move-exception;	 Catch:{ all -> 0x0044 }
        monitor-exit(r0);	 Catch:{ all -> 0x0044 }
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw.b(java.util.List):void");
    }

    public final void c(List<String> list) {
        synchronized (this.d) {
            if (this.b != null) {
                this.b.b(list);
            }
        }
    }
}
