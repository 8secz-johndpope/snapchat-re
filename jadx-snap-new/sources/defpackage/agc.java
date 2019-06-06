package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: agc */
public final class agc {
    private final List<String> a = new ArrayList();
    private final Map<String, List<a<?, ?>>> b = new HashMap();

    /* renamed from: agc$a */
    static class a<T, R> {
        final Class<R> a;
        final zg<T, R> b;
        private final Class<T> c;

        public a(Class<T> cls, Class<R> cls2, zg<T, R> zgVar) {
            this.c = cls;
            this.a = cls2;
            this.b = zgVar;
        }

        public final boolean a(Class<?> cls, Class<?> cls2) {
            return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
        }
    }

    private synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = (List) this.b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.b.put(str, list);
        }
        return list;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0043 in {13, 15, 18} preds:[]
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
    public final synchronized <T, R> java.util.List<defpackage.zg<T, R>> a(java.lang.Class<T> r6, java.lang.Class<R> r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0040 }
        r0.<init>();	 Catch:{ all -> 0x0040 }
        r1 = r5.a;	 Catch:{ all -> 0x0040 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0040 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0040 }
        if (r2 == 0) goto L_0x003e;	 Catch:{ all -> 0x0040 }
        r2 = r1.next();	 Catch:{ all -> 0x0040 }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x0040 }
        r3 = r5.b;	 Catch:{ all -> 0x0040 }
        r2 = r3.get(r2);	 Catch:{ all -> 0x0040 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x0040 }
        if (r2 == 0) goto L_0x000c;	 Catch:{ all -> 0x0040 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0040 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0040 }
        if (r3 == 0) goto L_0x000c;	 Catch:{ all -> 0x0040 }
        r3 = r2.next();	 Catch:{ all -> 0x0040 }
        r3 = (defpackage.agc.a) r3;	 Catch:{ all -> 0x0040 }
        r4 = r3.a(r6, r7);	 Catch:{ all -> 0x0040 }
        if (r4 == 0) goto L_0x0026;	 Catch:{ all -> 0x0040 }
        r3 = r3.b;	 Catch:{ all -> 0x0040 }
        r0.add(r3);	 Catch:{ all -> 0x0040 }
        goto L_0x0026;
        monitor-exit(r5);
        return r0;
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agc.a(java.lang.Class, java.lang.Class):java.util.List");
    }

    public final synchronized <T, R> void a(String str, zg<T, R> zgVar, Class<T> cls, Class<R> cls2) {
        a(str).add(new a(cls, cls2, zgVar));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0033 in {8, 10, 13} preds:[]
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
    public final synchronized void a(java.util.List<java.lang.String> r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0030 }
        r1 = r3.a;	 Catch:{ all -> 0x0030 }
        r0.<init>(r1);	 Catch:{ all -> 0x0030 }
        r1 = r3.a;	 Catch:{ all -> 0x0030 }
        r1.clear();	 Catch:{ all -> 0x0030 }
        r1 = r3.a;	 Catch:{ all -> 0x0030 }
        r1.addAll(r4);	 Catch:{ all -> 0x0030 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0030 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0030 }
        if (r1 == 0) goto L_0x002e;	 Catch:{ all -> 0x0030 }
        r1 = r0.next();	 Catch:{ all -> 0x0030 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0030 }
        r2 = r4.contains(r1);	 Catch:{ all -> 0x0030 }
        if (r2 != 0) goto L_0x0016;	 Catch:{ all -> 0x0030 }
        r2 = r3.a;	 Catch:{ all -> 0x0030 }
        r2.add(r1);	 Catch:{ all -> 0x0030 }
        goto L_0x0016;
        monitor-exit(r3);
        return;
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agc.a(java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x004b in {15, 17, 20} preds:[]
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
    public final synchronized <T, R> java.util.List<java.lang.Class<R>> b(java.lang.Class<T> r6, java.lang.Class<R> r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0048 }
        r0.<init>();	 Catch:{ all -> 0x0048 }
        r1 = r5.a;	 Catch:{ all -> 0x0048 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0048 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0048 }
        if (r2 == 0) goto L_0x0046;	 Catch:{ all -> 0x0048 }
        r2 = r1.next();	 Catch:{ all -> 0x0048 }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x0048 }
        r3 = r5.b;	 Catch:{ all -> 0x0048 }
        r2 = r3.get(r2);	 Catch:{ all -> 0x0048 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x0048 }
        if (r2 == 0) goto L_0x000c;	 Catch:{ all -> 0x0048 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0048 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x000c;	 Catch:{ all -> 0x0048 }
        r3 = r2.next();	 Catch:{ all -> 0x0048 }
        r3 = (defpackage.agc.a) r3;	 Catch:{ all -> 0x0048 }
        r4 = r3.a(r6, r7);	 Catch:{ all -> 0x0048 }
        if (r4 == 0) goto L_0x0026;	 Catch:{ all -> 0x0048 }
        r4 = r3.a;	 Catch:{ all -> 0x0048 }
        r4 = r0.contains(r4);	 Catch:{ all -> 0x0048 }
        if (r4 != 0) goto L_0x0026;	 Catch:{ all -> 0x0048 }
        r3 = r3.a;	 Catch:{ all -> 0x0048 }
        r0.add(r3);	 Catch:{ all -> 0x0048 }
        goto L_0x0026;
        monitor-exit(r5);
        return r0;
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agc.b(java.lang.Class, java.lang.Class):java.util.List");
    }
}
