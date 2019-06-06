package defpackage;

import com.google.common.base.Preconditions;
import defpackage.sbt.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: sbu */
public final class sbu {

    /* renamed from: sbu$a */
    static class a<T> implements sbt<T> {
        private T a = null;
        private final List<sad<T>> b = new ArrayList();
        private final Object c = new Object();
        private final Executor d;
        private final sbw e;
        private final boolean f;

        a(Executor executor, sbw sbw, boolean z) {
            this.d = executor;
            this.f = z;
            this.e = sbw;
        }

        private void a(T t, sad<T> sad) {
            try {
                sad.onResult(t);
            } catch (Throwable th) {
                sbw sbw = this.e;
                if (sbw != null) {
                    sbw.onError(th);
                }
            }
        }

        private /* synthetic */ void b(Object obj, sad sad) {
            a(obj, sad);
        }

        public final T a() {
            return this.a;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0035 in {8, 12, 14, 17} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void a(T r6) {
            /*
            r5 = this;
            r0 = r5.c;
            monitor-enter(r0);
            r1 = r5.a;	 Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x000d;	 Catch:{ all -> 0x0032 }
            r1 = r5.f;	 Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x000d;	 Catch:{ all -> 0x0032 }
            monitor-exit(r0);	 Catch:{ all -> 0x0032 }
            return;	 Catch:{ all -> 0x0032 }
            r1 = com.google.common.base.Preconditions.checkNotNull(r6);	 Catch:{ all -> 0x0032 }
            r5.a = r1;	 Catch:{ all -> 0x0032 }
            r1 = r5.b;	 Catch:{ all -> 0x0032 }
            r1 = r1.iterator();	 Catch:{ all -> 0x0032 }
            r2 = r1.hasNext();	 Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0030;	 Catch:{ all -> 0x0032 }
            r2 = r1.next();	 Catch:{ all -> 0x0032 }
            r2 = (defpackage.sad) r2;	 Catch:{ all -> 0x0032 }
            r3 = r5.d;	 Catch:{ all -> 0x0032 }
            r4 = new -$$Lambda$sbu$a$8kMKmTECPGnwcqfQ0BbTw2bSsBg;	 Catch:{ all -> 0x0032 }
            r4.<init>(r5, r6, r2);	 Catch:{ all -> 0x0032 }
            r3.execute(r4);	 Catch:{ all -> 0x0032 }
            goto L_0x0019;	 Catch:{ all -> 0x0032 }
            monitor-exit(r0);	 Catch:{ all -> 0x0032 }
            return;	 Catch:{ all -> 0x0032 }
            r6 = move-exception;	 Catch:{ all -> 0x0032 }
            monitor-exit(r0);	 Catch:{ all -> 0x0032 }
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.sbu$a.a(java.lang.Object):void");
        }

        public final void addListener(sad<T> sad) {
            synchronized (this.c) {
                if (this.a != null) {
                    a(this.a, sad);
                }
                this.b.add(sad);
            }
        }
    }

    public static a a(final Executor executor, final sbw sbw) {
        Preconditions.checkNotNull(executor);
        return new a() {
            public final <T> sbt<T> a() {
                return new a(executor, sbw, false);
            }

            public final <T> sbt<T> b() {
                return new a(executor, sbw, true);
            }
        };
    }
}
