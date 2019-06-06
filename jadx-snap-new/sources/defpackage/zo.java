package defpackage;

import defpackage.zn.a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zo */
public final class zo {
    private static final a<?> b = new 1();
    private final Map<Class<?>, a<?>> a = new HashMap();

    /* renamed from: zo$1 */
    class 1 implements a<Object> {
        1() {
        }

        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public final zn<Object> a(Object obj) {
            return new a(obj);
        }
    }

    /* renamed from: zo$a */
    static final class a implements zn<Object> {
        private final Object a;

        a(Object obj) {
            this.a = obj;
        }

        public final Object a() {
            return this.a;
        }

        public final void b() {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0046 in {9, 11, 14, 17} preds:[]
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
    public final synchronized <T> defpackage.zn<T> a(T r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = "Argument must not be null";	 Catch:{ all -> 0x0043 }
        defpackage.ahl.a(r6, r0);	 Catch:{ all -> 0x0043 }
        r0 = r5.a;	 Catch:{ all -> 0x0043 }
        r1 = r6.getClass();	 Catch:{ all -> 0x0043 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0043 }
        r0 = (defpackage.zn.a) r0;	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0039;	 Catch:{ all -> 0x0043 }
        r1 = r5.a;	 Catch:{ all -> 0x0043 }
        r1 = r1.values();	 Catch:{ all -> 0x0043 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0043 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0043 }
        if (r2 == 0) goto L_0x0039;	 Catch:{ all -> 0x0043 }
        r2 = r1.next();	 Catch:{ all -> 0x0043 }
        r2 = (defpackage.zn.a) r2;	 Catch:{ all -> 0x0043 }
        r3 = r2.a();	 Catch:{ all -> 0x0043 }
        r4 = r6.getClass();	 Catch:{ all -> 0x0043 }
        r3 = r3.isAssignableFrom(r4);	 Catch:{ all -> 0x0043 }
        if (r3 == 0) goto L_0x001e;	 Catch:{ all -> 0x0043 }
        r0 = r2;	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x003d;	 Catch:{ all -> 0x0043 }
        r0 = b;	 Catch:{ all -> 0x0043 }
        r6 = r0.a(r6);	 Catch:{ all -> 0x0043 }
        monitor-exit(r5);
        return r6;
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo.a(java.lang.Object):zn");
    }

    public final synchronized void a(a<?> aVar) {
        this.a.put(aVar.a(), aVar);
    }
}
