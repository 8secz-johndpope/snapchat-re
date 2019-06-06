package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: qzn */
public final class qzn implements qxr {
    public final ajwl<a> a;
    public final ConcurrentHashMap<Long, prl> b = new ConcurrentHashMap();
    public final ConcurrentHashMap<Long, Long> c = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, Long> d = new ConcurrentHashMap();
    private final qvd e;

    /* renamed from: qzn$a */
    public static final class a {
        private final Map<Long, prl> a;

        public a(Map<Long, ? extends prl> map) {
            akcr.b(map, "prefetchedItems");
            this.a = map;
        }

        public final prl a(long j) {
            prl prl = (prl) this.a.get(Long.valueOf(j));
            return prl == null ? prl.NOT_STARTED : prl;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.qzn.a) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.qzn.a;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.qzn.a) r2;
            r0 = r1.a;
            r2 = r2.a;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qzn$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Map map = this.a;
            return map != null ? map.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("State(prefetchedItems=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public qzn(qvd qvd) {
        akcr.b(qvd, "messagingRepository");
        this.e = qvd;
        Object i = ajwl.i(new a(ajyx.a));
        akcr.a(i, "BehaviorSubject.createDefault(emptyState())");
        this.a = i;
    }

    private final synchronized void b(long j, prl prl) {
        if (prl == prl.NOT_STARTED) {
            this.b.remove(Long.valueOf(j));
        } else {
            this.b.put(Long.valueOf(j), prl);
        }
        this.a.a(c());
    }

    private final synchronized void b(String str, prl prl, boolean z) {
        Object obj = (Long) this.d.get(str);
        if (obj == null) {
            obj = Long.valueOf(z ? this.e.f(str) : this.e.d(str));
        }
        akcr.a(obj, "conversationIdToFeedIdMa…dIdForKey(conversationId)");
        long longValue = obj.longValue();
        if (longValue > 0) {
            this.d.put(str, Long.valueOf(longValue));
            b(longValue, prl);
        }
    }

    private final a c() {
        return new a(ajzm.c((Map) this.b));
    }

    public final prl a(long j) {
        return (prl) this.b.get(Long.valueOf(j));
    }

    public final void a() {
        this.b.clear();
        this.d.clear();
        this.c.clear();
    }

    public final void a(long j, prl prl) {
        akcr.b(prl, "state");
        b(j, prl);
    }

    public final void a(String str, prl prl, boolean z) {
        akcr.b(str, "conversationId");
        akcr.b(prl, "state");
        b(str, prl, z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x004d in {8, 10, 12, 15} preds:[]
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
    public final synchronized void b() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = 0;
        r1 = r6.b;	 Catch:{ all -> 0x004a }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x004a }
        r1 = r1.entrySet();	 Catch:{ all -> 0x004a }
        r1 = r1.iterator();	 Catch:{ all -> 0x004a }
        r2 = r1.hasNext();	 Catch:{ all -> 0x004a }
        if (r2 == 0) goto L_0x003d;	 Catch:{ all -> 0x004a }
        r2 = r1.next();	 Catch:{ all -> 0x004a }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x004a }
        r3 = r2.getKey();	 Catch:{ all -> 0x004a }
        r3 = (java.lang.Number) r3;	 Catch:{ all -> 0x004a }
        r3 = r3.longValue();	 Catch:{ all -> 0x004a }
        r2 = r2.getValue();	 Catch:{ all -> 0x004a }
        r2 = (defpackage.prl) r2;	 Catch:{ all -> 0x004a }
        r5 = defpackage.prl.FAIL;	 Catch:{ all -> 0x004a }
        if (r2 != r5) goto L_0x000e;	 Catch:{ all -> 0x004a }
        r0 = 1;	 Catch:{ all -> 0x004a }
        r2 = r6.b;	 Catch:{ all -> 0x004a }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x004a }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x004a }
        r4 = defpackage.prl.NOT_STARTED;	 Catch:{ all -> 0x004a }
        r2.put(r3, r4);	 Catch:{ all -> 0x004a }
        goto L_0x000e;	 Catch:{ all -> 0x004a }
        if (r0 == 0) goto L_0x0048;	 Catch:{ all -> 0x004a }
        r0 = r6.a;	 Catch:{ all -> 0x004a }
        r1 = r6.c();	 Catch:{ all -> 0x004a }
        r0.a(r1);	 Catch:{ all -> 0x004a }
        monitor-exit(r6);
        return;
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qzn.b():void");
    }
}
