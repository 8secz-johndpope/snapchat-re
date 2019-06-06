package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.Set;

/* renamed from: fxf */
public final class fxf extends zgi {
    final ajwy<Set<ablj>> a;

    /* renamed from: fxf$b */
    static final class b extends akcq implements akbk<ajxw> {
        b(fxf fxf) {
            super(0, fxf);
        }

        public final String getName() {
            return "onDestroy";
        }

        public final akej getOwner() {
            return akde.a(fxf.class);
        }

        public final String getSignature() {
            return "onDestroy()V";
        }

        public final /* synthetic */ Object invoke() {
            for (ablj c : (Set) ((fxf) this.receiver).a.get()) {
                c.c();
            }
            return ajxw.a;
        }
    }

    /* renamed from: fxf$a */
    static final class a extends akcq implements akbk<ajxw> {
        a(fxf fxf) {
            super(0, fxf);
        }

        public final String getName() {
            return "onPause";
        }

        public final akej getOwner() {
            return akde.a(fxf.class);
        }

        public final String getSignature() {
            return "onPause()V";
        }

        public final /* synthetic */ Object invoke() {
            for (ablj f : (Set) ((fxf) this.receiver).a.get()) {
                f.f();
            }
            return ajxw.a;
        }
    }

    public fxf(ajwy<Set<ablj>> ajwy, zgk<b> zgk) {
        akcr.b(ajwy, "perfMonitors");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.a = ajwy;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0039 in {4, 6, 8} preds:[]
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
    public final defpackage.ajej a() {
        /*
        r2 = this;
        r0 = r2.a;	 Catch:{ all -> 0x0037 }
        r0 = r0.get();	 Catch:{ all -> 0x0037 }
        r0 = (java.util.Set) r0;	 Catch:{ all -> 0x0037 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0037 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x0037 }
        r1 = r0.next();	 Catch:{ all -> 0x0037 }
        r1 = (defpackage.ablj) r1;	 Catch:{ all -> 0x0037 }
        r1.e();	 Catch:{ all -> 0x0037 }
        goto L_0x000c;	 Catch:{ all -> 0x0037 }
        r0 = new fxf$a;	 Catch:{ all -> 0x0037 }
        r1 = r2;	 Catch:{ all -> 0x0037 }
        r1 = (defpackage.fxf) r1;	 Catch:{ all -> 0x0037 }
        r0.<init>(r1);	 Catch:{ all -> 0x0037 }
        r0 = (defpackage.akbk) r0;	 Catch:{ all -> 0x0037 }
        r1 = new fxg;	 Catch:{ all -> 0x0037 }
        r1.<init>(r0);	 Catch:{ all -> 0x0037 }
        r1 = (defpackage.ajev) r1;	 Catch:{ all -> 0x0037 }
        r0 = defpackage.ajek.a(r1);	 Catch:{ all -> 0x0037 }
        r1 = "Disposables.fromAction(::onPause)";	 Catch:{ all -> 0x0037 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0037 }
        return r0;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxf.a():ajej");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0039 in {4, 6, 8} preds:[]
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
    public final defpackage.ajej b() {
        /*
        r2 = this;
        r0 = r2.a;	 Catch:{ all -> 0x0037 }
        r0 = r0.get();	 Catch:{ all -> 0x0037 }
        r0 = (java.util.Set) r0;	 Catch:{ all -> 0x0037 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0037 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x0037 }
        r1 = r0.next();	 Catch:{ all -> 0x0037 }
        r1 = (defpackage.ablj) r1;	 Catch:{ all -> 0x0037 }
        r1.b();	 Catch:{ all -> 0x0037 }
        goto L_0x000c;	 Catch:{ all -> 0x0037 }
        r0 = new fxf$b;	 Catch:{ all -> 0x0037 }
        r1 = r2;	 Catch:{ all -> 0x0037 }
        r1 = (defpackage.fxf) r1;	 Catch:{ all -> 0x0037 }
        r0.<init>(r1);	 Catch:{ all -> 0x0037 }
        r0 = (defpackage.akbk) r0;	 Catch:{ all -> 0x0037 }
        r1 = new fxg;	 Catch:{ all -> 0x0037 }
        r1.<init>(r0);	 Catch:{ all -> 0x0037 }
        r1 = (defpackage.ajev) r1;	 Catch:{ all -> 0x0037 }
        r0 = defpackage.ajek.a(r1);	 Catch:{ all -> 0x0037 }
        r1 = "Disposables.fromAction(::onDestroy)";	 Catch:{ all -> 0x0037 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0037 }
        return r0;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxf.b():ajej");
    }
}
