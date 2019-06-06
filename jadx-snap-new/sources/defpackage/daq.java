package defpackage;

/* renamed from: daq */
public final class daq extends dat<dap> {
    private final jh<Class<? extends das>, dat<?>> a = new jh();

    /* renamed from: daq$a */
    public static class a {
        public final jh<Class<? extends das>, dat<?>> a = new jh();

        public final daq a() {
            return new daq(this);
        }
    }

    protected daq(a aVar) {
        this.a.a(aVar.a);
    }

    public final void a() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((dat) this.a.c(i)).a();
        }
    }

    public final /* synthetic */ boolean a(das das) {
        Object obj = (dap) das;
        dau.a(obj, "Null value passed to getSnapshot!");
        jh jhVar = obj.a;
        int size = jhVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Class cls = (Class) jhVar.b(i2);
            dat dat = (dat) this.a.get(cls);
            boolean a = dat != null ? dat.a(obj.a(cls)) : false;
            obj.a(cls, a);
            i |= a;
        }
        return i;
    }

    public final /* synthetic */ das b() {
        dap dap = new dap();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            Class cls = (Class) this.a.b(i);
            dap.a.put(cls, ((dat) this.a.c(i)).b());
            dap.b.put(cls, Boolean.FALSE);
        }
        return dap;
    }

    public final void c() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((dat) this.a.c(i)).c();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0028 in {5, 10, 13, 16} preds:[]
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
    public final synchronized void dispose() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.isDisposed();	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x0009;
        monitor-exit(r3);
        return;
        r0 = 0;
        r1 = r3.a;	 Catch:{ all -> 0x0025 }
        r1 = r1.size();	 Catch:{ all -> 0x0025 }
        if (r0 >= r1) goto L_0x0020;	 Catch:{ all -> 0x0025 }
        r2 = r3.a;	 Catch:{ all -> 0x0025 }
        r2 = r2.c(r0);	 Catch:{ all -> 0x0025 }
        r2 = (defpackage.dat) r2;	 Catch:{ all -> 0x0025 }
        r2.dispose();	 Catch:{ all -> 0x0025 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0025 }
        goto L_0x0010;	 Catch:{ all -> 0x0025 }
        super.dispose();	 Catch:{ all -> 0x0025 }
        monitor-exit(r3);
        return;
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daq.dispose():void");
    }

    public final synchronized boolean isDisposed() {
        return super.isDisposed();
    }
}
