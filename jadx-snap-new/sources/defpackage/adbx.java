package defpackage;

import defpackage.adbv.b;
import defpackage.adbv.c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adbx */
public final class adbx {
    public b a;
    public c b;
    private final adcf<adbw> c = new adcf(new adbw[]{new adbw()}, 20);
    private final List<adbn> d = new ArrayList();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x001c in {6, 8, 11} preds:[]
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
    public final synchronized void a() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.c;	 Catch:{ all -> 0x0019 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0019 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0019 }
        if (r1 == 0) goto L_0x0017;	 Catch:{ all -> 0x0019 }
        r1 = r0.next();	 Catch:{ all -> 0x0019 }
        r1 = (defpackage.adbw) r1;	 Catch:{ all -> 0x0019 }
        r1.a();	 Catch:{ all -> 0x0019 }
        goto L_0x0007;
        monitor-exit(r2);
        return;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbx.a():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0026 in {5, 8, 11} preds:[]
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
    public final synchronized void a(defpackage.acmj r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "controller";	 Catch:{ all -> 0x0023 }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x0023 }
        r0 = r2.d;	 Catch:{ all -> 0x0023 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0023 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0023 }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x0023 }
        r1 = r0.next();	 Catch:{ all -> 0x0023 }
        r1 = (defpackage.adbn) r1;	 Catch:{ all -> 0x0023 }
        r1.a(r3);	 Catch:{ all -> 0x0023 }
        goto L_0x000c;	 Catch:{ all -> 0x0023 }
        r3 = r2.d;	 Catch:{ all -> 0x0023 }
        r3.clear();	 Catch:{ all -> 0x0023 }
        monitor-exit(r2);
        return;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbx.a(acmj):void");
    }

    public final synchronized void a(adbn adbn) {
        akcr.b(adbn, "listener");
        this.d.add(adbn);
    }

    public final synchronized void a(adbw adbw) {
        akcr.b(adbw, "listener");
        this.c.a((Object) adbw);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x002b in {7, 9, 10, 13} preds:[]
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
    public final synchronized boolean a(android.view.View r3, android.view.MotionEvent r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "v";	 Catch:{ all -> 0x0028 }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x0028 }
        r0 = "event";	 Catch:{ all -> 0x0028 }
        defpackage.akcr.b(r4, r0);	 Catch:{ all -> 0x0028 }
        r0 = r2.c;	 Catch:{ all -> 0x0028 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0028 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x0026;	 Catch:{ all -> 0x0028 }
        r1 = r0.next();	 Catch:{ all -> 0x0028 }
        r1 = (defpackage.adbw) r1;	 Catch:{ all -> 0x0028 }
        r1 = r1.a(r3, r4);	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x0011;
        r3 = 1;
        monitor-exit(r2);
        return r3;
        r3 = 0;
        goto L_0x0024;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbx.a(android.view.View, android.view.MotionEvent):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0020 in {6, 8, 11} preds:[]
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
    public final synchronized void b(defpackage.acmj r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "controller";	 Catch:{ all -> 0x001d }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x001d }
        r0 = r2.c;	 Catch:{ all -> 0x001d }
        r0 = r0.iterator();	 Catch:{ all -> 0x001d }
        r1 = r0.hasNext();	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x001b;	 Catch:{ all -> 0x001d }
        r0.next();	 Catch:{ all -> 0x001d }
        r1 = "controller";	 Catch:{ all -> 0x001d }
        defpackage.akcr.b(r3, r1);	 Catch:{ all -> 0x001d }
        goto L_0x000c;
        monitor-exit(r2);
        return;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbx.b(acmj):void");
    }

    public final synchronized void b(adbn adbn) {
        akcr.b(adbn, "listener");
        this.d.remove(adbn);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0021 in {6, 8, 11} preds:[]
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
    public final synchronized void c(defpackage.acmj r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "controller";	 Catch:{ all -> 0x001e }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x001e }
        r0 = r2.c;	 Catch:{ all -> 0x001e }
        r0 = r0.iterator();	 Catch:{ all -> 0x001e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x001e }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x001e }
        r1 = r0.next();	 Catch:{ all -> 0x001e }
        r1 = (defpackage.adbw) r1;	 Catch:{ all -> 0x001e }
        r1.c(r3);	 Catch:{ all -> 0x001e }
        goto L_0x000c;
        monitor-exit(r2);
        return;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbx.c(acmj):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0021 in {6, 8, 11} preds:[]
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
    public final synchronized void d(defpackage.acmj r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "controller";	 Catch:{ all -> 0x001e }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x001e }
        r0 = r2.c;	 Catch:{ all -> 0x001e }
        r0 = r0.iterator();	 Catch:{ all -> 0x001e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x001e }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x001e }
        r1 = r0.next();	 Catch:{ all -> 0x001e }
        r1 = (defpackage.adbw) r1;	 Catch:{ all -> 0x001e }
        r1.d(r3);	 Catch:{ all -> 0x001e }
        goto L_0x000c;
        monitor-exit(r2);
        return;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbx.d(acmj):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0021 in {6, 8, 11} preds:[]
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
    public final synchronized void e(defpackage.acmj r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "controller";	 Catch:{ all -> 0x001e }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x001e }
        r0 = r2.c;	 Catch:{ all -> 0x001e }
        r0 = r0.iterator();	 Catch:{ all -> 0x001e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x001e }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x001e }
        r1 = r0.next();	 Catch:{ all -> 0x001e }
        r1 = (defpackage.adbw) r1;	 Catch:{ all -> 0x001e }
        r1.f(r3);	 Catch:{ all -> 0x001e }
        goto L_0x000c;
        monitor-exit(r2);
        return;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbx.e(acmj):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0021 in {6, 8, 11} preds:[]
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
    public final synchronized void f(defpackage.acmj r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "controller";	 Catch:{ all -> 0x001e }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x001e }
        r0 = r2.c;	 Catch:{ all -> 0x001e }
        r0 = r0.iterator();	 Catch:{ all -> 0x001e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x001e }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x001e }
        r1 = r0.next();	 Catch:{ all -> 0x001e }
        r1 = (defpackage.adbw) r1;	 Catch:{ all -> 0x001e }
        r1.b(r3);	 Catch:{ all -> 0x001e }
        goto L_0x000c;
        monitor-exit(r2);
        return;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbx.f(acmj):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0021 in {6, 8, 11} preds:[]
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
    public final synchronized void g(defpackage.acmj r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "controller";	 Catch:{ all -> 0x001e }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x001e }
        r0 = r2.c;	 Catch:{ all -> 0x001e }
        r0 = r0.iterator();	 Catch:{ all -> 0x001e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x001e }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x001e }
        r1 = r0.next();	 Catch:{ all -> 0x001e }
        r1 = (defpackage.adbw) r1;	 Catch:{ all -> 0x001e }
        r1.a(r3);	 Catch:{ all -> 0x001e }
        goto L_0x000c;
        monitor-exit(r2);
        return;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbx.g(acmj):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0021 in {6, 8, 11} preds:[]
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
    public final synchronized void h(defpackage.acmj r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "controller";	 Catch:{ all -> 0x001e }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x001e }
        r0 = r2.c;	 Catch:{ all -> 0x001e }
        r0 = r0.iterator();	 Catch:{ all -> 0x001e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x001e }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x001e }
        r1 = r0.next();	 Catch:{ all -> 0x001e }
        r1 = (defpackage.adbw) r1;	 Catch:{ all -> 0x001e }
        r1.e(r3);	 Catch:{ all -> 0x001e }
        goto L_0x000c;
        monitor-exit(r2);
        return;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbx.h(acmj):void");
    }
}
