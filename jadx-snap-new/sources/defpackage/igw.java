package defpackage;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: igw */
public final class igw implements ajej, ajfo {
    private final List<ajej> a = new LinkedList();
    private final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: igw$a */
    static final class a extends akcq implements akbl<ajej, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final String getName() {
            return "isDisposed";
        }

        public final akej getOwner() {
            return akde.a(ajej.class);
        }

        public final String getSignature() {
            return "isDisposed()Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ajej ajej = (ajej) obj;
            akcr.b(ajej, "p1");
            return Boolean.valueOf(ajej.isDisposed());
        }
    }

    private synchronized void a() {
        ajyr.a(this.a, (akbl) a.a);
    }

    public final boolean a(ajej ajej) {
        akcr.b(ajej, "d");
        if (isDisposed()) {
            ajej.dispose();
            return false;
        }
        synchronized (this) {
            this.a.add(ajej);
            a();
        }
        return true;
    }

    public final boolean b(ajej ajej) {
        akcr.b(ajej, "d");
        if (!c(ajej)) {
            return false;
        }
        ajej.dispose();
        return true;
    }

    public final boolean c(ajej ajej) {
        akcr.b(ajej, "d");
        if (isDisposed()) {
            return false;
        }
        synchronized (this) {
            if (isDisposed()) {
                return false;
            } else if (this.a.remove(ajej)) {
                return true;
            } else {
                return false;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0028 in {6, 9, 12} preds:[]
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
    public final void dispose() {
        /*
        r3 = this;
        r0 = r3.b;
        r1 = 1;
        r0.getAndSet(r1);
        monitor-enter(r3);
        r0 = r3.a;	 Catch:{ all -> 0x0025 }
        r1 = r0;	 Catch:{ all -> 0x0025 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0025 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0025 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0025 }
        if (r2 == 0) goto L_0x0020;	 Catch:{ all -> 0x0025 }
        r2 = r1.next();	 Catch:{ all -> 0x0025 }
        r2 = (defpackage.ajej) r2;	 Catch:{ all -> 0x0025 }
        r2.dispose();	 Catch:{ all -> 0x0025 }
        goto L_0x0010;	 Catch:{ all -> 0x0025 }
        r0.clear();	 Catch:{ all -> 0x0025 }
        monitor-exit(r3);
        return;
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igw.dispose():void");
    }

    public final boolean isDisposed() {
        return this.b.get();
    }
}
