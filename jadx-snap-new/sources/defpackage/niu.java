package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: niu */
public final class niu implements ajdr<Boolean> {
    final abpt<ajdq<Boolean>> a = new abpt();
    private boolean b;

    /* renamed from: niu$a */
    static final class a implements ajev {
        private /* synthetic */ niu a;
        private /* synthetic */ ajdq b;

        a(niu niu, ajdq ajdq) {
            this.a = niu;
            this.b = ajdq;
        }

        public final void run() {
            this.a.a.d(this.b);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x002d in {9, 10, 13} preds:[]
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
    public final void a(boolean r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r3.b = r4;	 Catch:{ all -> 0x002a }
        monitor-exit(r3);
        r0 = r3.a;
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0029;
        r1 = r0.next();
        r1 = (defpackage.ajdq) r1;
        r2 = "emitter";
        defpackage.akcr.a(r1, r2);
        r2 = r1.isDisposed();
        if (r2 != 0) goto L_0x000a;
        r2 = java.lang.Boolean.valueOf(r4);
        r1.a(r2);
        goto L_0x000a;
        return;
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.niu.a(boolean):void");
    }

    public final synchronized boolean a() {
        return this.b;
    }

    public final void subscribe(ajdq<Boolean> ajdq) {
        akcr.b(ajdq, Event.EMITTER);
        this.a.c(ajdq);
        ajdq.a(ajek.a((ajev) new a(this, ajdq)));
    }
}
