package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: snv */
public final class snv {
    private final int a;
    private final Map<Class<? extends slk>, List<slk>> b;

    public snv() {
        this(2);
    }

    public snv(int i) {
        this.b = new HashMap();
        this.a = i;
    }

    public final synchronized slk a(Class<? extends slk> cls) {
        List list = (List) this.b.get(cls);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (slk) list.remove(0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x005d in {7, 11, 14, 17} preds:[]
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
        r4 = this;
        monitor-enter(r4);
        r0 = new java.util.HashMap;	 Catch:{ all -> 0x005a }
        r0.<init>();	 Catch:{ all -> 0x005a }
        r1 = r4.b;	 Catch:{ all -> 0x005a }
        r1 = r1.values();	 Catch:{ all -> 0x005a }
        r1 = r1.iterator();	 Catch:{ all -> 0x005a }
        r2 = r1.hasNext();	 Catch:{ all -> 0x005a }
        if (r2 == 0) goto L_0x0039;	 Catch:{ all -> 0x005a }
        r2 = r1.next();	 Catch:{ all -> 0x005a }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x005a }
        r3 = r2.isEmpty();	 Catch:{ all -> 0x005a }
        if (r3 != 0) goto L_0x0010;	 Catch:{ all -> 0x005a }
        r3 = 0;	 Catch:{ all -> 0x005a }
        r3 = r2.get(r3);	 Catch:{ all -> 0x005a }
        r3 = (defpackage.slk) r3;	 Catch:{ all -> 0x005a }
        r3 = r3.f();	 Catch:{ all -> 0x005a }
        r2 = r2.size();	 Catch:{ all -> 0x005a }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x005a }
        r0.put(r3, r2);	 Catch:{ all -> 0x005a }
        goto L_0x0010;	 Catch:{ all -> 0x005a }
        r0 = r4.b;	 Catch:{ all -> 0x005a }
        r0 = r0.values();	 Catch:{ all -> 0x005a }
        r0 = r0.iterator();	 Catch:{ all -> 0x005a }
        r1 = r0.hasNext();	 Catch:{ all -> 0x005a }
        if (r1 == 0) goto L_0x0053;	 Catch:{ all -> 0x005a }
        r1 = r0.next();	 Catch:{ all -> 0x005a }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x005a }
        r1.clear();	 Catch:{ all -> 0x005a }
        goto L_0x0043;	 Catch:{ all -> 0x005a }
        r0 = r4.b;	 Catch:{ all -> 0x005a }
        r0.clear();	 Catch:{ all -> 0x005a }
        monitor-exit(r4);
        return;
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snv.a():void");
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
    public final synchronized void a(java.util.List<? extends defpackage.slk> r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r2 = r2.iterator();	 Catch:{ all -> 0x0017 }
        r0 = r2.hasNext();	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x0015;	 Catch:{ all -> 0x0017 }
        r0 = r2.next();	 Catch:{ all -> 0x0017 }
        r0 = (defpackage.slk) r0;	 Catch:{ all -> 0x0017 }
        r1.a(r0);	 Catch:{ all -> 0x0017 }
        goto L_0x0005;
        monitor-exit(r1);
        return;
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snv.a(java.util.List):void");
    }

    /* JADX WARNING: Missing block: B:19:0x0045, code skipped:
            return;
     */
    public final synchronized void a(defpackage.slk r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        if (r4 != 0) goto L_0x0005;
    L_0x0003:
        monitor-exit(r3);
        return;
    L_0x0005:
        r0 = r4.F;	 Catch:{ all -> 0x005f }
        r1 = defpackage.sjo.DESTROYED;	 Catch:{ all -> 0x005f }
        if (r0 != r1) goto L_0x0046;
    L_0x000b:
        r0 = r4.h();	 Catch:{ all -> 0x005f }
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r3);
        return;
    L_0x0013:
        r0 = r4.getClass();	 Catch:{ all -> 0x005f }
        r1 = r3.b;	 Catch:{ all -> 0x005f }
        r1 = r1.get(r0);	 Catch:{ all -> 0x005f }
        if (r1 != 0) goto L_0x0029;
    L_0x001f:
        r1 = r3.b;	 Catch:{ all -> 0x005f }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x005f }
        r2.<init>();	 Catch:{ all -> 0x005f }
        r1.put(r0, r2);	 Catch:{ all -> 0x005f }
    L_0x0029:
        r1 = r3.b;	 Catch:{ all -> 0x005f }
        r1 = r1.get(r0);	 Catch:{ all -> 0x005f }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x005f }
        r1 = r1.size();	 Catch:{ all -> 0x005f }
        r2 = r3.a;	 Catch:{ all -> 0x005f }
        if (r1 >= r2) goto L_0x0044;
    L_0x0039:
        r1 = r3.b;	 Catch:{ all -> 0x005f }
        r0 = r1.get(r0);	 Catch:{ all -> 0x005f }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x005f }
        r0.add(r4);	 Catch:{ all -> 0x005f }
    L_0x0044:
        monitor-exit(r3);
        return;
    L_0x0046:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x005f }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005f }
        r2 = "OperaLayerRecycler: tried to recycle ";
        r1.<init>(r2);	 Catch:{ all -> 0x005f }
        r1.append(r4);	 Catch:{ all -> 0x005f }
        r4 = " but wasn't destroyed";
        r1.append(r4);	 Catch:{ all -> 0x005f }
        r4 = r1.toString();	 Catch:{ all -> 0x005f }
        r0.<init>(r4);	 Catch:{ all -> 0x005f }
        throw r0;	 Catch:{ all -> 0x005f }
    L_0x005f:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snv.a(slk):void");
    }

    public final synchronized int b(Class<? extends slk> cls) {
        List list = (List) this.b.get(cls);
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
