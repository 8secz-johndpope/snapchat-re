package defpackage;

import androidx.work.impl.WorkDatabase;
import defpackage.pv.a;

/* renamed from: sc */
public abstract class sc implements Runnable {
    public final qa a = new qa();

    public static sc a(final String str, final qg qgVar, final boolean z) {
        return new sc() {
            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x005e in {8, 12, 13, 16} preds:[]
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
            final void a() {
                /*
                r5 = this;
                r0 = r2;
                r0 = r0.c;
                r0.c();
                r1 = r0.g();	 Catch:{ all -> 0x0059 }
                r2 = r1;	 Catch:{ all -> 0x0059 }
                r1 = r1.h(r2);	 Catch:{ all -> 0x0059 }
                r1 = r1.iterator();	 Catch:{ all -> 0x0059 }
                r2 = r1.hasNext();	 Catch:{ all -> 0x0059 }
                if (r2 == 0) goto L_0x0043;	 Catch:{ all -> 0x0059 }
                r2 = r1.next();	 Catch:{ all -> 0x0059 }
                r2 = (java.lang.String) r2;	 Catch:{ all -> 0x0059 }
                r3 = r2;	 Catch:{ all -> 0x0059 }
                r4 = r3.c;	 Catch:{ all -> 0x0059 }
                super.a(r4, r2);	 Catch:{ all -> 0x0059 }
                r4 = r3.f;	 Catch:{ all -> 0x0059 }
                r4.b(r2);	 Catch:{ all -> 0x0059 }
                r3 = r3.e;	 Catch:{ all -> 0x0059 }
                r3 = r3.iterator();	 Catch:{ all -> 0x0059 }
                r4 = r3.hasNext();	 Catch:{ all -> 0x0059 }
                if (r4 == 0) goto L_0x0015;	 Catch:{ all -> 0x0059 }
                r4 = r3.next();	 Catch:{ all -> 0x0059 }
                r4 = (defpackage.qc) r4;	 Catch:{ all -> 0x0059 }
                r4.a(r2);	 Catch:{ all -> 0x0059 }
                goto L_0x0033;	 Catch:{ all -> 0x0059 }
                r0.e();	 Catch:{ all -> 0x0059 }
                r0.d();
                r0 = r3;
                if (r0 == 0) goto L_0x0058;
                r0 = r2;
                r1 = r0.b;
                r2 = r0.c;
                r0 = r0.e;
                defpackage.qd.a(r1, r2, r0);
                return;
                r1 = move-exception;
                r0.d();
                throw r1;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.sc$1.a():void");
            }
        };
    }

    public abstract void a();

    /* Access modifiers changed, original: final */
    public final void a(WorkDatabase workDatabase, String str) {
        rw g = workDatabase.g();
        for (String a : workDatabase.h().b(str)) {
            a(workDatabase, a);
        }
        a f = g.f(str);
        if (f != a.SUCCEEDED && f != a.FAILED) {
            g.a(a.CANCELLED, str);
        }
    }

    public void run() {
        try {
            a();
            this.a.a(ps.a);
        } catch (Throwable th) {
            this.a.a(new ps.a.a(th));
        }
    }
}
