package defpackage;

/* renamed from: adjo */
public abstract class adjo {
    private final adjp a;
    private boolean b = false;
    private int c = 100;
    private boolean d = false;

    protected adjo(adjp adjp) {
        this.a = adjp;
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void a(int i) {
        this.c = i;
    }

    public abstract int ak_();

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void al_() {
        this.c = 100;
        this.b = false;
    }

    public synchronized void e() {
        this.d = true;
    }

    public final synchronized boolean l() {
        return this.b;
    }

    public final synchronized int m() {
        return this.c;
    }

    public final synchronized boolean n() {
        return this.d;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:8:0x0018, code skipped:
            r0 = r1.a;
     */
    /* JADX WARNING: Missing block: B:9:0x001a, code skipped:
            if (r0 == null) goto L_0x001f;
     */
    /* JADX WARNING: Missing block: B:10:0x001c, code skipped:
            r0.a();
     */
    /* JADX WARNING: Missing block: B:11:0x001f, code skipped:
            return;
     */
    public final void o() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.l();	 Catch:{ all -> 0x0020 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0020 }
        return;
    L_0x0009:
        r0 = r1.getClass();	 Catch:{ all -> 0x0020 }
        r0.getSimpleName();	 Catch:{ all -> 0x0020 }
        r0 = 100;
        r1.c = r0;	 Catch:{ all -> 0x0020 }
        r0 = 1;
        r1.b = r0;	 Catch:{ all -> 0x0020 }
        monitor-exit(r1);	 Catch:{ all -> 0x0020 }
        r0 = r1.a;
        if (r0 == 0) goto L_0x001f;
    L_0x001c:
        r0.a();
    L_0x001f:
        return;
    L_0x0020:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0020 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adjo.o():void");
    }
}
