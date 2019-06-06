package defpackage;

/* renamed from: ajwx */
public final class ajwx<T> implements ajdh<T>, akuy {
    private akux<? super T> a;
    private boolean b;
    private akuy c;
    private boolean d;
    private ajuj<Object> e;
    private volatile boolean f;

    public ajwx(akux<? super T> akux) {
        this(akux, (byte) 0);
    }

    private ajwx(akux<? super T> akux, byte b) {
        this.a = akux;
        this.b = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x001a in {6, 11, 15} preds:[]
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
    private void c() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.e;	 Catch:{ all -> 0x0017 }
        if (r0 != 0) goto L_0x000a;	 Catch:{ all -> 0x0017 }
        r0 = 0;	 Catch:{ all -> 0x0017 }
        r2.d = r0;	 Catch:{ all -> 0x0017 }
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        return;	 Catch:{ all -> 0x0017 }
        r1 = 0;	 Catch:{ all -> 0x0017 }
        r2.e = r1;	 Catch:{ all -> 0x0017 }
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        r1 = r2.a;
        r0 = r0.a(r1);
        if (r0 == 0) goto L_0x0000;
        return;
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwx.c():void");
    }

    public final void a() {
        if (!this.f) {
            synchronized (this) {
                if (this.f) {
                } else if (this.d) {
                    ajuj ajuj = this.e;
                    if (ajuj == null) {
                        ajuj = new ajuj();
                        this.e = ajuj;
                    }
                    ajuj.a(ajuu.COMPLETE);
                } else {
                    this.f = true;
                    this.d = true;
                    this.a.a();
                }
            }
        }
    }

    public final void a(long j) {
        this.c.a(j);
    }

    public final void a(akuy akuy) {
        if (ajui.a(this.c, akuy)) {
            this.c = akuy;
            this.a.a((akuy) this);
        }
    }

    public final void a(T t) {
        if (!this.f) {
            if (t == null) {
                this.c.b();
                a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (this.f) {
                } else if (this.d) {
                    ajuj ajuj = this.e;
                    if (ajuj == null) {
                        ajuj = new ajuj();
                        this.e = ajuj;
                    }
                    ajuj.a((Object) t);
                } else {
                    this.d = true;
                    this.a.a((Object) t);
                    c();
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:19:0x0031, code skipped:
            if (r1 == 0) goto L_0x0037;
     */
    /* JADX WARNING: Missing block: B:20:0x0033, code skipped:
            defpackage.ajvo.a(r4);
     */
    /* JADX WARNING: Missing block: B:21:0x0036, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:22:0x0037, code skipped:
            r3.a.a(r4);
     */
    /* JADX WARNING: Missing block: B:23:0x003c, code skipped:
            return;
     */
    public final void a(java.lang.Throwable r4) {
        /*
        r3 = this;
        r0 = r3.f;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        defpackage.ajvo.a(r4);
        return;
    L_0x0008:
        monitor-enter(r3);
        r0 = r3.f;	 Catch:{ all -> 0x003d }
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        r1 = 1;
        goto L_0x0030;
    L_0x0011:
        r0 = r3.d;	 Catch:{ all -> 0x003d }
        if (r0 == 0) goto L_0x002c;
    L_0x0015:
        r3.f = r2;	 Catch:{ all -> 0x003d }
        r0 = r3.e;	 Catch:{ all -> 0x003d }
        if (r0 != 0) goto L_0x0022;
    L_0x001b:
        r0 = new ajuj;	 Catch:{ all -> 0x003d }
        r0.<init>();	 Catch:{ all -> 0x003d }
        r3.e = r0;	 Catch:{ all -> 0x003d }
    L_0x0022:
        r4 = defpackage.ajuu.a(r4);	 Catch:{ all -> 0x003d }
        r0 = r0.a;	 Catch:{ all -> 0x003d }
        r0[r1] = r4;	 Catch:{ all -> 0x003d }
        monitor-exit(r3);	 Catch:{ all -> 0x003d }
        return;
    L_0x002c:
        r3.f = r2;	 Catch:{ all -> 0x003d }
        r3.d = r2;	 Catch:{ all -> 0x003d }
    L_0x0030:
        monitor-exit(r3);	 Catch:{ all -> 0x003d }
        if (r1 == 0) goto L_0x0037;
    L_0x0033:
        defpackage.ajvo.a(r4);
        return;
    L_0x0037:
        r0 = r3.a;
        r0.a(r4);
        return;
    L_0x003d:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x003d }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwx.a(java.lang.Throwable):void");
    }

    public final void b() {
        this.c.b();
    }
}
