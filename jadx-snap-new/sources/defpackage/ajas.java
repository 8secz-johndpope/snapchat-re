package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.util.concurrent.AbstractFuture;
import defpackage.aiuh.a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ajas */
public final class ajas {
    private static final Logger a = Logger.getLogger(ajas.class.getName());
    private static /* synthetic */ boolean b = (ajas.class.desiredAssertionStatus() ^ 1);

    /* renamed from: ajas$a */
    static final class a<RespT> extends AbstractFuture<RespT> {
        private final aiuh<?, RespT> a;

        a(aiuh<?, RespT> aiuh) {
            this.a = aiuh;
        }

        public final void interruptTask() {
            this.a.a("GrpcFuture was cancelled", null);
        }

        public final String pendingToString() {
            return MoreObjects.toStringHelper((Object) this).add("clientCall", this.a).toString();
        }

        public final boolean set(RespT respT) {
            return super.set(respT);
        }

        public final boolean setException(Throwable th) {
            return super.setException(th);
        }
    }

    /* renamed from: ajas$b */
    static final class b implements Executor {
        static final Logger a = Logger.getLogger(b.class.getName());
        final BlockingQueue<Runnable> b = new LinkedBlockingQueue();

        b() {
        }

        public final void execute(Runnable runnable) {
            this.b.add(runnable);
        }
    }

    /* renamed from: ajas$c */
    static final class c<RespT> extends a<RespT> {
        private final a<RespT> a;
        private RespT b;

        c(a<RespT> aVar) {
            this.a = aVar;
        }

        public final void a(aivw aivw, aivl aivl) {
            if (aivw.b()) {
                if (this.b == null) {
                    this.a.setException(aivw.i.a("No value received for unary call").a(aivl));
                }
                this.a.set(this.b);
                return;
            }
            this.a.setException(aivw.a(aivl));
        }

        public final void a(RespT respT) {
            if (this.b == null) {
                this.b = respT;
                return;
            }
            throw aivw.i.a("More than one value received for unary call").c();
        }
    }

    private ajas() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x0087 in {14, 17, 19, 23, 25, 28, 31, 34, 37} preds:[]
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
    public static <ReqT, RespT> RespT a(defpackage.aiug r3, defpackage.aivm<ReqT, RespT> r4, defpackage.aiuf r5, ReqT r6) {
        /*
        r0 = new ajas$b;
        r0.<init>();
        r1 = new aiuf;
        r1.<init>(r5);
        r1.c = r0;
        r3 = r3.a(r4, r1);
        r4 = new ajas$a;	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r4.<init>(r3);	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r5 = new ajas$c;	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r5.<init>(r4);	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r1 = new aivl;	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r3.a(r5, r1);	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r5 = 2;	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r3.a(r5);	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r3.a(r6);	 Catch:{ RuntimeException -> 0x0075, Error -> 0x006f }
        r3.a();	 Catch:{ RuntimeException -> 0x0075, Error -> 0x006f }
        r5 = r4.isDone();	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        if (r5 != 0) goto L_0x006a;
        r5 = r0.b;	 Catch:{ InterruptedException -> 0x0051 }
        r5 = r5.take();	 Catch:{ InterruptedException -> 0x0051 }
        r5 = (java.lang.Runnable) r5;	 Catch:{ InterruptedException -> 0x0051 }
        if (r5 == 0) goto L_0x002c;
        r5.run();	 Catch:{ Throwable -> 0x0040 }
        goto L_0x004a;
        r5 = move-exception;
        r6 = defpackage.ajas.b.a;	 Catch:{ InterruptedException -> 0x0051 }
        r1 = java.util.logging.Level.WARNING;	 Catch:{ InterruptedException -> 0x0051 }
        r2 = "Runnable threw exception";	 Catch:{ InterruptedException -> 0x0051 }
        r6.log(r1, r2, r5);	 Catch:{ InterruptedException -> 0x0051 }
        r5 = r0.b;	 Catch:{ InterruptedException -> 0x0051 }
        r5 = r5.poll();	 Catch:{ InterruptedException -> 0x0051 }
        goto L_0x0038;
        r4 = move-exception;
        r5 = java.lang.Thread.currentThread();	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r5.interrupt();	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r5 = defpackage.aivw.c;	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r6 = "Call was interrupted";	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r5 = r5.a(r6);	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r4 = r5.b(r4);	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r4 = r4.c();	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        throw r4;	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r3 = defpackage.ajas.a(r4);	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        return r3;	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r4 = move-exception;	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r4 = defpackage.ajas.a(r3, r4);	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        throw r4;	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r4 = move-exception;	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r4 = defpackage.ajas.a(r3, r4);	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        throw r4;	 Catch:{ RuntimeException -> 0x0081, Error -> 0x007b }
        r4 = move-exception;
        r3 = defpackage.ajas.a(r3, r4);
        throw r3;
        r4 = move-exception;
        r3 = defpackage.ajas.a(r3, r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajas.a(aiug, aivm, aiuf, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0062 in {2, 10, 11, 12, 13, 14, 17} preds:[]
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
    private static <V> V a(java.util.concurrent.Future<V> r2) {
        /*
        r2 = r2.get();	 Catch:{ InterruptedException -> 0x0049, ExecutionException -> 0x0005 }
        return r2;
        r2 = move-exception;
        r2 = r2.getCause();
        r0 = "t";
        r0 = com.google.common.base.Preconditions.checkNotNull(r2, r0);
        r0 = (java.lang.Throwable) r0;
        if (r0 == 0) goto L_0x0038;
        r1 = r0 instanceof defpackage.aivx;
        if (r1 != 0) goto L_0x002d;
        r1 = r0 instanceof defpackage.aivy;
        if (r1 != 0) goto L_0x0021;
        r0 = r0.getCause();
        goto L_0x0012;
        r0 = (defpackage.aivy) r0;
        r2 = new aivy;
        r1 = r0.a;
        r0 = r0.b;
        r2.<init>(r1, r0);
        goto L_0x0048;
        r0 = (defpackage.aivx) r0;
        r2 = new aivy;
        r0 = r0.a;
        r1 = 0;
        r2.<init>(r0, r1);
        goto L_0x0048;
        r0 = defpackage.aivw.d;
        r1 = "unexpected exception";
        r0 = r0.a(r1);
        r2 = r0.b(r2);
        r2 = r2.c();
        throw r2;
        r2 = move-exception;
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        r0 = defpackage.aivw.c;
        r1 = "Call was interrupted";
        r0 = r0.a(r1);
        r2 = r0.b(r2);
        r2 = r2.c();
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajas.a(java.util.concurrent.Future):java.lang.Object");
    }

    private static RuntimeException a(aiuh<?, ?> aiuh, Throwable th) {
        try {
            aiuh.a(null, th);
        } catch (Throwable th2) {
            if (b || (th2 instanceof RuntimeException) || (th2 instanceof Error)) {
                a.log(Level.SEVERE, "RuntimeException encountered while closing call", th2);
            } else {
                AssertionError assertionError = new AssertionError();
            }
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new AssertionError(th);
        }
    }
}
