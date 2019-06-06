package defpackage;

import android.support.v7.widget.RecyclerView.Adapter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* renamed from: zmg */
public final class zmg implements ajej, zml {
    final zmk a;
    private ajdw b;
    private boolean c;
    private final AtomicBoolean d;
    private final LinkedHashMap<zma, ajej> e;
    private a f;

    /* renamed from: zmg$a */
    public interface a {
    }

    public zmg(zms zms, zke zke, ajdw ajdw) {
        this(zms, zke, ajdw, Collections.emptyList());
    }

    public zmg(zms zms, zke zke, ajdw ajdw, List<zma> list) {
        this(zms, zke, ajdw, list, (byte) 0);
    }

    private zmg(zms zms, zke zke, ajdw ajdw, List<zma> list, byte b) {
        this.d = new AtomicBoolean(false);
        this.e = new LinkedHashMap();
        this.b = ajdw;
        this.f = null;
        this.a = new zmk(zms, zke, list);
        for (zma zma : list) {
            this.e.put(zma, ajfq.INSTANCE);
            if (this.c) {
                e(zma);
            }
        }
    }

    private void d(zma zma) {
        ajej ajej = (ajej) this.e.get(zma);
        if (ajej != null) {
            ajej.dispose();
            return;
        }
        throw new IllegalArgumentException("Section not registered");
    }

    private synchronized void e(final zma zma) {
        this.e.put(zma, zma.c().b(this.b).a(ajcw.LATEST).a(ajee.a(ajef.a), 1).a(new ajfb<znh<zmy>>() {
            public final /* synthetic */ void accept(Object obj) {
                zmg.this.a.a(zma, (znh) obj);
            }
        }, new ajfb<Throwable>() {
            public final /* synthetic */ void accept(Object obj) {
                throw new RuntimeException((Throwable) obj);
            }
        }));
    }

    public final Adapter<zmt> a() {
        return this.a.a;
    }

    public final zmy a(int i) {
        return this.a.a(i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x001a in {6, 8, 11} preds:[]
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
    public final synchronized void a(java.util.List<defpackage.zma> r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r2 = r2.iterator();	 Catch:{ all -> 0x0017 }
        r0 = r2.hasNext();	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x0015;	 Catch:{ all -> 0x0017 }
        r0 = r2.next();	 Catch:{ all -> 0x0017 }
        r0 = (defpackage.zma) r0;	 Catch:{ all -> 0x0017 }
        r1.a(r0);	 Catch:{ all -> 0x0017 }
        goto L_0x0005;
        monitor-exit(r1);
        return;
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmg.a(java.util.List):void");
    }

    public final synchronized void a(zma zma) {
        this.e.put(zma, ajfq.INSTANCE);
        this.a.a(zma, znk.a);
        if (this.c) {
            e(zma);
        }
    }

    public final Set<zma> b() {
        return this.e.keySet();
    }

    public final zlv b(int i) {
        return this.a.b(i);
    }

    public final synchronized void b(zma zma) {
        d(zma);
        if (this.c) {
            e(zma);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0023 in {7, 9, 12} preds:[]
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
    public final synchronized defpackage.ajej c() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = 1;
        r2.c = r0;	 Catch:{ all -> 0x0020 }
        r0 = r2.e;	 Catch:{ all -> 0x0020 }
        r0 = r0.keySet();	 Catch:{ all -> 0x0020 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0020 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x001e;	 Catch:{ all -> 0x0020 }
        r1 = r0.next();	 Catch:{ all -> 0x0020 }
        r1 = (defpackage.zma) r1;	 Catch:{ all -> 0x0020 }
        r2.e(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x000e;
        monitor-exit(r2);
        return r2;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmg.c():ajej");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x006a in {7, 8, 11, 13, 16, 19} preds:[]
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
    public final synchronized void c(defpackage.zma r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r7.d(r8);	 Catch:{ all -> 0x0067 }
        r8.dispose();	 Catch:{ all -> 0x0067 }
        r0 = r7.e;	 Catch:{ all -> 0x0067 }
        r0.remove(r8);	 Catch:{ all -> 0x0067 }
        r0 = r7.a;	 Catch:{ all -> 0x0067 }
        r1 = r0.a;	 Catch:{ all -> 0x0067 }
        r0 = r1.a;	 Catch:{ all -> 0x0067 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0067 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0067 }
        r2 = 0;	 Catch:{ all -> 0x0067 }
        r3 = 0;	 Catch:{ all -> 0x0067 }
        r4 = r0.hasNext();	 Catch:{ all -> 0x0067 }
        if (r4 == 0) goto L_0x003c;	 Catch:{ all -> 0x0067 }
        r4 = r0.next();	 Catch:{ all -> 0x0067 }
        r4 = (java.util.Map.Entry) r4;	 Catch:{ all -> 0x0067 }
        r5 = r4.getKey();	 Catch:{ all -> 0x0067 }
        if (r8 != r5) goto L_0x0030;	 Catch:{ all -> 0x0067 }
        r2 = 1;	 Catch:{ all -> 0x0067 }
        goto L_0x003c;	 Catch:{ all -> 0x0067 }
        r4 = r4.getValue();	 Catch:{ all -> 0x0067 }
        r4 = (defpackage.znh) r4;	 Catch:{ all -> 0x0067 }
        r4 = r4.a();	 Catch:{ all -> 0x0067 }
        r3 = r3 + r4;	 Catch:{ all -> 0x0067 }
        goto L_0x001c;	 Catch:{ all -> 0x0067 }
        r5 = r1.b;	 Catch:{ all -> 0x0067 }
        r0 = r1.a;	 Catch:{ all -> 0x0067 }
        r8 = r0.remove(r8);	 Catch:{ all -> 0x0067 }
        r8 = (defpackage.znh) r8;	 Catch:{ all -> 0x0067 }
        r0 = r1.a();	 Catch:{ all -> 0x0067 }
        r1.b = r0;	 Catch:{ all -> 0x0067 }
        if (r2 == 0) goto L_0x0053;	 Catch:{ all -> 0x0067 }
        r0 = r1.c;	 Catch:{ all -> 0x0067 }
        r0.evictAll();	 Catch:{ all -> 0x0067 }
        if (r8 != 0) goto L_0x0059;	 Catch:{ all -> 0x0067 }
        r8 = defpackage.znk.a;	 Catch:{ all -> 0x0067 }
        r8 = (defpackage.znh) r8;	 Catch:{ all -> 0x0067 }
        r0 = defpackage.znk.a;	 Catch:{ all -> 0x0067 }
        r4 = r0;	 Catch:{ all -> 0x0067 }
        r4 = (defpackage.znh) r4;	 Catch:{ all -> 0x0067 }
        r6 = r1.b;	 Catch:{ all -> 0x0067 }
        r2 = r3;	 Catch:{ all -> 0x0067 }
        r3 = r8;	 Catch:{ all -> 0x0067 }
        r1.a(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0067 }
        monitor-exit(r7);
        return;
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmg.c(zma):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x003b in {7, 8, 10, 13} preds:[]
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
    public final synchronized void dispose() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.d;	 Catch:{ all -> 0x0038 }
        r1 = 1;	 Catch:{ all -> 0x0038 }
        r2 = 0;	 Catch:{ all -> 0x0038 }
        r0 = r0.compareAndSet(r2, r1);	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0036;	 Catch:{ all -> 0x0038 }
        r0 = r4.e;	 Catch:{ all -> 0x0038 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0038 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0038 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0038 }
        if (r1 == 0) goto L_0x0034;	 Catch:{ all -> 0x0038 }
        r1 = r0.next();	 Catch:{ all -> 0x0038 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x0038 }
        r3 = r1.getKey();	 Catch:{ all -> 0x0038 }
        r3 = (defpackage.zma) r3;	 Catch:{ all -> 0x0038 }
        r3.dispose();	 Catch:{ all -> 0x0038 }
        r1 = r1.getValue();	 Catch:{ all -> 0x0038 }
        r1 = (defpackage.ajej) r1;	 Catch:{ all -> 0x0038 }
        r1.dispose();	 Catch:{ all -> 0x0038 }
        goto L_0x0015;	 Catch:{ all -> 0x0038 }
        r4.c = r2;	 Catch:{ all -> 0x0038 }
        monitor-exit(r4);
        return;
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmg.dispose():void");
    }

    public final int getItemCount() {
        return this.a.getItemCount();
    }

    public final synchronized boolean isDisposed() {
        return this.d.get();
    }
}
