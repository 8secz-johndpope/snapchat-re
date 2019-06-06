package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: tnv */
public final class tnv {
    final ImmutableMap<tno, ConcurrentMap<tnm, Optional<Object>>> a;

    public tnv() {
        Object of = ImmutableMap.of(tno.TWEAK, new ConcurrentHashMap(), tno.SERVER, new ConcurrentHashMap(), tno.EXPERIMENT, new ConcurrentHashMap(), tno.SETTING, new ConcurrentHashMap(), tno.FEATURE, new ConcurrentHashMap());
        akcr.a(of, "ImmutableMap.of(\n       …ConcurrentHashMap()\n    )");
        this.a = of;
    }

    public final Map<tnm, Object> a(tno tno) {
        akcr.b(tno, "setting");
        Object obj = this.a.get(tno);
        if (obj == null) {
            akcr.a();
        }
        return (Map) obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x002f in {6, 7, 9} preds:[]
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
    public final <T extends defpackage.tnm> void a(java.util.Map<T, ? extends java.lang.Object> r3, defpackage.tno r4) {
        /*
        r2 = this;
        r0 = "values";
        defpackage.akcr.b(r3, r0);
        r0 = "setting";
        defpackage.akcr.b(r4, r0);
        r3 = r3.entrySet();	 Catch:{ all -> 0x002d }
        r3 = r3.iterator();	 Catch:{ all -> 0x002d }
        r0 = r3.hasNext();	 Catch:{ all -> 0x002d }
        if (r0 == 0) goto L_0x002c;	 Catch:{ all -> 0x002d }
        r0 = r3.next();	 Catch:{ all -> 0x002d }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x002d }
        r1 = r0.getKey();	 Catch:{ all -> 0x002d }
        r1 = (defpackage.tnm) r1;	 Catch:{ all -> 0x002d }
        r0 = r0.getValue();	 Catch:{ all -> 0x002d }
        r2.a(r1, r4, r0);	 Catch:{ all -> 0x002d }
        goto L_0x0012;
        return;
        r3 = move-exception;
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnv.a(java.util.Map, tno):void");
    }

    public final void a(tnm tnm, tno tno, Object obj) {
        akcr.b(tnm, "key");
        akcr.b(tno, "setting");
        Object obj2 = this.a.get(tno);
        if (obj2 == null) {
            akcr.a();
        }
        akcr.a(obj2, "cache[setting]!!");
        ConcurrentMap concurrentMap = (ConcurrentMap) obj2;
        if (!concurrentMap.containsKey(tnm)) {
            concurrentMap.put(tnm, Optional.fromNullable(obj));
        }
    }

    public final boolean a(tnm tnm, tno tno) {
        akcr.b(tnm, "key");
        akcr.b(tno, "setting");
        Object obj = this.a.get(tno);
        if (obj == null) {
            akcr.a();
        }
        return ((ConcurrentMap) obj).containsKey(tnm);
    }

    public final Object b(tnm tnm, tno tno) {
        akcr.b(tnm, "key");
        akcr.b(tno, "setting");
        Object obj = this.a.get(tno);
        if (obj == null) {
            akcr.a();
        }
        Optional optional = (Optional) ((ConcurrentMap) obj).get(tnm);
        return optional != null ? optional.orNull() : null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x004a in {9, 11, 14, 15, 17} preds:[]
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
    public final <T extends defpackage.tnm> void b(java.util.Map<T, ? extends java.lang.Object> r5, defpackage.tno r6) {
        /*
        r4 = this;
        r0 = "values";
        defpackage.akcr.b(r5, r0);
        r0 = "setting";
        defpackage.akcr.b(r6, r0);
        r5 = r5.entrySet();	 Catch:{ all -> 0x0048 }
        r5 = r5.iterator();	 Catch:{ all -> 0x0048 }
        r1 = r5.hasNext();	 Catch:{ all -> 0x0048 }
        if (r1 == 0) goto L_0x0047;	 Catch:{ all -> 0x0048 }
        r1 = r5.next();	 Catch:{ all -> 0x0048 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x0048 }
        r2 = r1.getKey();	 Catch:{ all -> 0x0048 }
        r2 = (defpackage.tnm) r2;	 Catch:{ all -> 0x0048 }
        r1 = r1.getValue();	 Catch:{ all -> 0x0048 }
        r3 = "key";	 Catch:{ all -> 0x0048 }
        defpackage.akcr.b(r2, r3);	 Catch:{ all -> 0x0048 }
        defpackage.akcr.b(r6, r0);	 Catch:{ all -> 0x0048 }
        r3 = r4.a;	 Catch:{ all -> 0x0045 }
        r3 = r3.get(r6);	 Catch:{ all -> 0x0045 }
        if (r3 != 0) goto L_0x003b;	 Catch:{ all -> 0x0045 }
        defpackage.akcr.a();	 Catch:{ all -> 0x0045 }
        r3 = (java.util.concurrent.ConcurrentMap) r3;	 Catch:{ all -> 0x0045 }
        r1 = com.google.common.base.Optional.fromNullable(r1);	 Catch:{ all -> 0x0045 }
        r3.put(r2, r1);	 Catch:{ all -> 0x0045 }
        goto L_0x0012;
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0048 }
        return;
        r5 = move-exception;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnv.b(java.util.Map, tno):void");
    }
}
