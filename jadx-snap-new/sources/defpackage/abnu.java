package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: abnu */
public final class abnu {
    private Class[] a;
    private final HashMap<Class<?>, Set<Object>> b;

    public abnu(Class[] clsArr) {
        this(clsArr, new HashMap());
    }

    private abnu(Class[] clsArr, HashMap<Class<?>, Set<Object>> hashMap) {
        this.a = clsArr;
        this.b = hashMap;
    }

    public final synchronized <T> Set<T> a(Class<T> cls) {
        LinkedHashSet linkedHashSet;
        linkedHashSet = new LinkedHashSet();
        Set set = (Set) this.b.get(cls);
        if (set != null) {
            linkedHashSet.addAll(set);
        }
        return linkedHashSet;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0032 in {8, 9, 10, 12, 15} preds:[]
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
    public final synchronized void a(java.lang.Object r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.a;	 Catch:{ all -> 0x002f }
        r1 = r0.length;	 Catch:{ all -> 0x002f }
        r2 = 0;	 Catch:{ all -> 0x002f }
        if (r2 >= r1) goto L_0x002d;	 Catch:{ all -> 0x002f }
        r3 = r0[r2];	 Catch:{ all -> 0x002f }
        r4 = r7.getClass();	 Catch:{ all -> 0x002f }
        r4 = r3.isAssignableFrom(r4);	 Catch:{ all -> 0x002f }
        if (r4 == 0) goto L_0x002a;	 Catch:{ all -> 0x002f }
        r4 = r6.b;	 Catch:{ all -> 0x002f }
        r4 = r4.get(r3);	 Catch:{ all -> 0x002f }
        r4 = (java.util.Set) r4;	 Catch:{ all -> 0x002f }
        if (r4 != 0) goto L_0x0027;	 Catch:{ all -> 0x002f }
        r4 = new java.util.LinkedHashSet;	 Catch:{ all -> 0x002f }
        r4.<init>();	 Catch:{ all -> 0x002f }
        r5 = r6.b;	 Catch:{ all -> 0x002f }
        r5.put(r3, r4);	 Catch:{ all -> 0x002f }
        r4.add(r7);	 Catch:{ all -> 0x002f }
        r2 = r2 + 1;
        goto L_0x0005;
        monitor-exit(r6);
        return;
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abnu.a(java.lang.Object):void");
    }

    public final synchronized void a(Class[] clsArr) {
        this.a = (Class[]) aklq.a(this.a, (Object[]) clsArr);
    }
}
