package defpackage;

import defpackage.ily.a;

/* renamed from: ibo */
public final class ibo implements hyr {
    private final ilz a;
    private long b;
    private long c;
    private final hyt d;
    private final ajwy<ilv> e;
    private final ajwy<abss> f;

    public ibo(hyt hyt, ajwy<ilv> ajwy, ajwy<abss> ajwy2) {
        akcr.b(hyt, "fideliusMetricName");
        akcr.b(ajwy, "graphene");
        akcr.b(ajwy2, "releaseManager");
        this.d = hyt;
        this.e = ajwy;
        this.f = ajwy2;
        ioa ioa = (ioa) icr.a.get(this.d);
        this.a = ioa != null ? a.a(ioa) : null;
        this.b = -1;
        this.c = -1;
    }

    public final synchronized hyr a() {
        if (this.a != null) {
            this.b = System.currentTimeMillis();
        }
        return this;
    }

    public final synchronized hyr a(long j) {
        if (this.a != null) {
            this.c = j;
        }
        return this;
    }

    public final hyr a(String str) {
        akcr.b(str, "key");
        return this;
    }

    public final hyr a(String str, Object obj) {
        akcr.b(str, "key");
        if (obj != null) {
            ilz ilz = this.a;
            if (ilz != null) {
                ilz.a(str, obj.toString());
            }
        }
        return this;
    }

    public final synchronized long b() {
        if (!(this.a == null || this.b == -1 || this.c != -1)) {
            this.c = System.currentTimeMillis() - this.b;
        }
        return this.c;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0014 in {5, 7, 8, 11} preds:[]
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
    public final synchronized long c() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.a;	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x000e;	 Catch:{ all -> 0x0011 }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0011 }
        r2 = r4.b;	 Catch:{ all -> 0x0011 }
        r0 = r0 - r2;
        monitor-exit(r4);
        return r0;
        r0 = -1;
        goto L_0x000c;
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibo.c():long");
    }

    /* JADX WARNING: Missing block: B:13:0x0042, code skipped:
            return;
     */
    public final synchronized void d() {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.a;	 Catch:{ all -> 0x005b }
        if (r0 == 0) goto L_0x0033;
    L_0x0005:
        r0 = r5.e;	 Catch:{ all -> 0x005b }
        r0 = r0.get();	 Catch:{ all -> 0x005b }
        r0 = (defpackage.ilv) r0;	 Catch:{ all -> 0x005b }
        r1 = r5.a;	 Catch:{ all -> 0x005b }
        r2 = 1;
        r0.c(r1, r2);	 Catch:{ all -> 0x005b }
        r0 = r5.b();	 Catch:{ all -> 0x005b }
        r5.c = r0;	 Catch:{ all -> 0x005b }
        r0 = r5.c;	 Catch:{ all -> 0x005b }
        r2 = -1;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x0041;
    L_0x0022:
        r0 = r5.e;	 Catch:{ all -> 0x005b }
        r0 = r0.get();	 Catch:{ all -> 0x005b }
        r0 = (defpackage.ilv) r0;	 Catch:{ all -> 0x005b }
        r1 = r5.a;	 Catch:{ all -> 0x005b }
        r2 = r5.c;	 Catch:{ all -> 0x005b }
        r0.a(r1, r2);	 Catch:{ all -> 0x005b }
        monitor-exit(r5);
        return;
    L_0x0033:
        r0 = r5.f;	 Catch:{ all -> 0x005b }
        r0 = r0.get();	 Catch:{ all -> 0x005b }
        r0 = (defpackage.abss) r0;	 Catch:{ all -> 0x005b }
        r0 = r0.d();	 Catch:{ all -> 0x005b }
        if (r0 != 0) goto L_0x0043;
    L_0x0041:
        monitor-exit(r5);
        return;
    L_0x0043:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x005b }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005b }
        r2 = "Error in Fidelius logging: No graphene metric implemented for ";
        r1.<init>(r2);	 Catch:{ all -> 0x005b }
        r2 = r5.d;	 Catch:{ all -> 0x005b }
        r1.append(r2);	 Catch:{ all -> 0x005b }
        r1 = r1.toString();	 Catch:{ all -> 0x005b }
        r0.<init>(r1);	 Catch:{ all -> 0x005b }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x005b }
        throw r0;	 Catch:{ all -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibo.d():void");
    }

    public final String e() {
        ilz ilz = this.a;
        return ilz != null ? ilz.c() : null;
    }

    public final String f() {
        StringBuilder stringBuilder = new StringBuilder();
        ilz ilz = this.a;
        String str = null;
        stringBuilder.append(ilz != null ? ilz.c() : null);
        stringBuilder.append(".");
        ilz = this.a;
        if (ilz != null) {
            str = ilz.a();
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
