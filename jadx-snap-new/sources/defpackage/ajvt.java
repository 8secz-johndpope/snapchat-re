package defpackage;

import defpackage.ajuu.c;

/* renamed from: ajvt */
final class ajvt<T> extends ajvq<T> {
    private ajvq<T> b;
    private boolean c;
    private ajuj<Object> d;
    private volatile boolean e;

    ajvt(ajvq<T> ajvq) {
        this.b = ajvq;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0017 in {6, 9, 13} preds:[]
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
    private void l() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.d;	 Catch:{ all -> 0x0014 }
        if (r0 != 0) goto L_0x000a;	 Catch:{ all -> 0x0014 }
        r0 = 0;	 Catch:{ all -> 0x0014 }
        r2.c = r0;	 Catch:{ all -> 0x0014 }
        monitor-exit(r2);	 Catch:{ all -> 0x0014 }
        return;	 Catch:{ all -> 0x0014 }
        r1 = 0;	 Catch:{ all -> 0x0014 }
        r2.d = r1;	 Catch:{ all -> 0x0014 }
        monitor-exit(r2);	 Catch:{ all -> 0x0014 }
        r1 = r2.b;
        r0.a(r1);
        goto L_0x0000;
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0014 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajvt.l():void");
    }

    public final void a() {
        if (!this.e) {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                this.e = true;
                if (this.c) {
                    ajuj ajuj = this.d;
                    if (ajuj == null) {
                        ajuj = new ajuj();
                        this.d = ajuj;
                    }
                    ajuj.a(ajuu.COMPLETE);
                    return;
                }
                this.c = true;
                this.b.a();
            }
        }
    }

    public final void a(akuy akuy) {
        boolean z = true;
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    if (this.c) {
                        ajuj ajuj = this.d;
                        if (ajuj == null) {
                            ajuj = new ajuj();
                            this.d = ajuj;
                        }
                        ajuj.a(new c(akuy));
                        return;
                    }
                    this.c = true;
                    z = false;
                }
            }
        }
        if (z) {
            akuy.b();
            return;
        }
        this.b.a(akuy);
        l();
    }

    public final void a(T t) {
        if (!this.e) {
            synchronized (this) {
                if (this.e) {
                } else if (this.c) {
                    ajuj ajuj = this.d;
                    if (ajuj == null) {
                        ajuj = new ajuj();
                        this.d = ajuj;
                    }
                    ajuj.a((Object) t);
                } else {
                    this.c = true;
                    this.b.a((Object) t);
                    l();
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:19:0x002f, code skipped:
            if (r1 == 0) goto L_0x0035;
     */
    /* JADX WARNING: Missing block: B:20:0x0031, code skipped:
            defpackage.ajvo.a(r4);
     */
    /* JADX WARNING: Missing block: B:21:0x0034, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:22:0x0035, code skipped:
            r3.b.a(r4);
     */
    /* JADX WARNING: Missing block: B:23:0x003a, code skipped:
            return;
     */
    public final void a(java.lang.Throwable r4) {
        /*
        r3 = this;
        r0 = r3.e;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        defpackage.ajvo.a(r4);
        return;
    L_0x0008:
        monitor-enter(r3);
        r0 = r3.e;	 Catch:{ all -> 0x003b }
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        r1 = 1;
        goto L_0x002e;
    L_0x0011:
        r3.e = r2;	 Catch:{ all -> 0x003b }
        r0 = r3.c;	 Catch:{ all -> 0x003b }
        if (r0 == 0) goto L_0x002c;
    L_0x0017:
        r0 = r3.d;	 Catch:{ all -> 0x003b }
        if (r0 != 0) goto L_0x0022;
    L_0x001b:
        r0 = new ajuj;	 Catch:{ all -> 0x003b }
        r0.<init>();	 Catch:{ all -> 0x003b }
        r3.d = r0;	 Catch:{ all -> 0x003b }
    L_0x0022:
        r4 = defpackage.ajuu.a(r4);	 Catch:{ all -> 0x003b }
        r0 = r0.a;	 Catch:{ all -> 0x003b }
        r0[r1] = r4;	 Catch:{ all -> 0x003b }
        monitor-exit(r3);	 Catch:{ all -> 0x003b }
        return;
    L_0x002c:
        r3.c = r2;	 Catch:{ all -> 0x003b }
    L_0x002e:
        monitor-exit(r3);	 Catch:{ all -> 0x003b }
        if (r1 == 0) goto L_0x0035;
    L_0x0031:
        defpackage.ajvo.a(r4);
        return;
    L_0x0035:
        r0 = r3.b;
        r0.a(r4);
        return;
    L_0x003b:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x003b }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajvt.a(java.lang.Throwable):void");
    }

    public final void a_(akux<? super T> akux) {
        this.b.a((akux) akux);
    }
}
