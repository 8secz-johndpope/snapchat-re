package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: akn */
public final class akn {
    private static final akw c = new 1();
    private final Map<Class, Map<Class, akx>> a = new HashMap();
    private final Map<Class, Map<Class, akw>> b = new HashMap();
    private final Context d;

    /* renamed from: akn$1 */
    static class 1 implements akw {
        1() {
        }

        public final aiv a(Object obj, int i, int i2) {
            throw new NoSuchMethodError("This should never be called!");
        }

        public final String toString() {
            return "NULL_MODEL_LOADER";
        }
    }

    public akn(Context context) {
        this.d = context.getApplicationContext();
    }

    private <T, Y> void a(Class<T> cls, Class<Y> cls2, akw<T, Y> akw) {
        Map map = (Map) this.b.get(cls);
        if (map == null) {
            map = new HashMap();
            this.b.put(cls, map);
        }
        map.put(cls2, akw);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x0079 in {4, 5, 10, 12, 16, 27, 29, 30, 32, 35} preds:[]
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
    public final synchronized <T, Y> defpackage.akw<T, Y> a(java.lang.Class<T> r6, java.lang.Class<Y> r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.b;	 Catch:{ all -> 0x0076 }
        r0 = r0.get(r6);	 Catch:{ all -> 0x0076 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0076 }
        r1 = 0;	 Catch:{ all -> 0x0076 }
        if (r0 == 0) goto L_0x0013;	 Catch:{ all -> 0x0076 }
        r0 = r0.get(r7);	 Catch:{ all -> 0x0076 }
        r0 = (defpackage.akw) r0;	 Catch:{ all -> 0x0076 }
        goto L_0x0014;	 Catch:{ all -> 0x0076 }
        r0 = r1;	 Catch:{ all -> 0x0076 }
        if (r0 == 0) goto L_0x0022;	 Catch:{ all -> 0x0076 }
        r6 = c;	 Catch:{ all -> 0x0076 }
        r6 = r6.equals(r0);	 Catch:{ all -> 0x0076 }
        if (r6 == 0) goto L_0x0020;
        monitor-exit(r5);
        return r1;
        monitor-exit(r5);
        return r0;
        r2 = r5.a;	 Catch:{ all -> 0x0076 }
        r2 = r2.get(r6);	 Catch:{ all -> 0x0076 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x0076 }
        if (r2 == 0) goto L_0x0032;	 Catch:{ all -> 0x0076 }
        r1 = r2.get(r7);	 Catch:{ all -> 0x0076 }
        r1 = (defpackage.akx) r1;	 Catch:{ all -> 0x0076 }
        if (r1 != 0) goto L_0x0063;	 Catch:{ all -> 0x0076 }
        r2 = r5.a;	 Catch:{ all -> 0x0076 }
        r2 = r2.keySet();	 Catch:{ all -> 0x0076 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0076 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0076 }
        if (r3 == 0) goto L_0x0063;	 Catch:{ all -> 0x0076 }
        r3 = r2.next();	 Catch:{ all -> 0x0076 }
        r3 = (java.lang.Class) r3;	 Catch:{ all -> 0x0076 }
        r4 = r3.isAssignableFrom(r6);	 Catch:{ all -> 0x0076 }
        if (r4 == 0) goto L_0x003e;	 Catch:{ all -> 0x0076 }
        r4 = r5.a;	 Catch:{ all -> 0x0076 }
        r3 = r4.get(r3);	 Catch:{ all -> 0x0076 }
        r3 = (java.util.Map) r3;	 Catch:{ all -> 0x0076 }
        if (r3 == 0) goto L_0x003e;	 Catch:{ all -> 0x0076 }
        r1 = r3.get(r7);	 Catch:{ all -> 0x0076 }
        r1 = (defpackage.akx) r1;	 Catch:{ all -> 0x0076 }
        if (r1 != 0) goto L_0x0063;	 Catch:{ all -> 0x0076 }
        goto L_0x003e;	 Catch:{ all -> 0x0076 }
        if (r1 == 0) goto L_0x006f;	 Catch:{ all -> 0x0076 }
        r0 = r5.d;	 Catch:{ all -> 0x0076 }
        r0 = r1.a(r0, r5);	 Catch:{ all -> 0x0076 }
        r5.a(r6, r7, r0);	 Catch:{ all -> 0x0076 }
        goto L_0x0074;	 Catch:{ all -> 0x0076 }
        r1 = c;	 Catch:{ all -> 0x0076 }
        r5.a(r6, r7, r1);	 Catch:{ all -> 0x0076 }
        monitor-exit(r5);
        return r0;
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akn.a(java.lang.Class, java.lang.Class):akw");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0044 in {4, 12, 14, 17} preds:[]
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
    public final synchronized <T, Y> defpackage.akx<T, Y> a(java.lang.Class<T> r3, java.lang.Class<Y> r4, defpackage.akx<T, Y> r5) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.b;	 Catch:{ all -> 0x0041 }
        r0.clear();	 Catch:{ all -> 0x0041 }
        r0 = r2.a;	 Catch:{ all -> 0x0041 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0041 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0041 }
        if (r0 != 0) goto L_0x001a;	 Catch:{ all -> 0x0041 }
        r0 = new java.util.HashMap;	 Catch:{ all -> 0x0041 }
        r0.<init>();	 Catch:{ all -> 0x0041 }
        r1 = r2.a;	 Catch:{ all -> 0x0041 }
        r1.put(r3, r0);	 Catch:{ all -> 0x0041 }
        r3 = r0.put(r4, r5);	 Catch:{ all -> 0x0041 }
        r3 = (defpackage.akx) r3;	 Catch:{ all -> 0x0041 }
        if (r3 == 0) goto L_0x003f;	 Catch:{ all -> 0x0041 }
        r4 = r2.a;	 Catch:{ all -> 0x0041 }
        r4 = r4.values();	 Catch:{ all -> 0x0041 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0041 }
        r5 = r4.hasNext();	 Catch:{ all -> 0x0041 }
        if (r5 == 0) goto L_0x003f;	 Catch:{ all -> 0x0041 }
        r5 = r4.next();	 Catch:{ all -> 0x0041 }
        r5 = (java.util.Map) r5;	 Catch:{ all -> 0x0041 }
        r5 = r5.containsValue(r3);	 Catch:{ all -> 0x0041 }
        if (r5 == 0) goto L_0x002c;
        r3 = 0;
        monitor-exit(r2);
        return r3;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akn.a(java.lang.Class, java.lang.Class, akx):akx");
    }
}
