package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qj */
public final class qj implements pz, qc, qv {
    private static final String a = pq.a("GreedyScheduler");
    private qg b;
    private qw c;
    private List<rv> d = new ArrayList();
    private boolean e;
    private final Object f;

    public qj(Context context, qg qgVar) {
        this.b = qgVar;
        this.c = new qw(context, this);
        this.f = new Object();
    }

    private void a() {
        if (!this.e) {
            this.b.f.a((pz) this);
            this.e = true;
        }
    }

    public final void a(String str) {
        a();
        pq.a().a(a, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        this.b.b(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0048 in {7, 8, 10, 13} preds:[]
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
    public final void a(java.lang.String r7, boolean r8) {
        /*
        r6 = this;
        r8 = r6.f;
        monitor-enter(r8);
        r0 = r6.d;	 Catch:{ all -> 0x0045 }
        r0 = r0.size();	 Catch:{ all -> 0x0045 }
        r1 = 0;	 Catch:{ all -> 0x0045 }
        r2 = 0;	 Catch:{ all -> 0x0045 }
        if (r2 >= r0) goto L_0x0043;	 Catch:{ all -> 0x0045 }
        r3 = r6.d;	 Catch:{ all -> 0x0045 }
        r3 = r3.get(r2);	 Catch:{ all -> 0x0045 }
        r3 = (defpackage.rv) r3;	 Catch:{ all -> 0x0045 }
        r3 = r3.b;	 Catch:{ all -> 0x0045 }
        r3 = r3.equals(r7);	 Catch:{ all -> 0x0045 }
        if (r3 == 0) goto L_0x0040;	 Catch:{ all -> 0x0045 }
        r0 = defpackage.pq.a();	 Catch:{ all -> 0x0045 }
        r3 = a;	 Catch:{ all -> 0x0045 }
        r4 = "Stopping tracking for %s";	 Catch:{ all -> 0x0045 }
        r5 = 1;	 Catch:{ all -> 0x0045 }
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0045 }
        r5[r1] = r7;	 Catch:{ all -> 0x0045 }
        r7 = java.lang.String.format(r4, r5);	 Catch:{ all -> 0x0045 }
        r1 = new java.lang.Throwable[r1];	 Catch:{ all -> 0x0045 }
        r0.a(r3, r7, r1);	 Catch:{ all -> 0x0045 }
        r7 = r6.d;	 Catch:{ all -> 0x0045 }
        r7.remove(r2);	 Catch:{ all -> 0x0045 }
        r7 = r6.c;	 Catch:{ all -> 0x0045 }
        r0 = r6.d;	 Catch:{ all -> 0x0045 }
        r7.a(r0);	 Catch:{ all -> 0x0045 }
        goto L_0x0043;	 Catch:{ all -> 0x0045 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0045 }
        goto L_0x000b;	 Catch:{ all -> 0x0045 }
        monitor-exit(r8);	 Catch:{ all -> 0x0045 }
        return;	 Catch:{ all -> 0x0045 }
        r7 = move-exception;	 Catch:{ all -> 0x0045 }
        monitor-exit(r8);	 Catch:{ all -> 0x0045 }
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.a(java.lang.String, boolean):void");
    }

    public final void a(List<String> list) {
        for (String str : list) {
            pq.a().a(a, String.format("Constraints met: Scheduling work ID %s", new Object[]{str}), new Throwable[0]);
            this.b.a(str, null);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00a3 in {16, 17, 18, 19, 25, 27, 30} preds:[]
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
    public final void a(defpackage.rv... r13) {
        /*
        r12 = this;
        r12.a();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = r13.length;
        r3 = 0;
        r4 = 0;
        r5 = 1;
        if (r4 >= r2) goto L_0x006e;
        r6 = r13[r4];
        r7 = r6.c;
        r8 = defpackage.pv.a.ENQUEUED;
        if (r7 != r8) goto L_0x006b;
        r7 = r6.a();
        if (r7 != 0) goto L_0x006b;
        r7 = r6.h;
        r9 = 0;
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 != 0) goto L_0x006b;
        r7 = r6.b();
        if (r7 != 0) goto L_0x006b;
        r7 = r6.d();
        if (r7 == 0) goto L_0x004c;
        r5 = android.os.Build.VERSION.SDK_INT;
        r7 = 24;
        if (r5 < r7) goto L_0x0043;
        r5 = r6.k;
        r5 = r5.a();
        if (r5 != 0) goto L_0x006b;
        r0.add(r6);
        r5 = r6.b;
        r1.add(r5);
        goto L_0x006b;
        r7 = defpackage.pq.a();
        r8 = a;
        r5 = new java.lang.Object[r5];
        r9 = r6.b;
        r5[r3] = r9;
        r9 = "Starting work for %s";
        r5 = java.lang.String.format(r9, r5);
        r9 = new java.lang.Throwable[r3];
        r7.a(r8, r5, r9);
        r5 = r12.b;
        r6 = r6.b;
        r7 = 0;
        r5.a(r6, r7);
        r4 = r4 + 1;
        goto L_0x0010;
        r13 = r12.f;
        monitor-enter(r13);
        r2 = r0.isEmpty();	 Catch:{ all -> 0x00a0 }
        if (r2 != 0) goto L_0x009e;	 Catch:{ all -> 0x00a0 }
        r2 = defpackage.pq.a();	 Catch:{ all -> 0x00a0 }
        r4 = a;	 Catch:{ all -> 0x00a0 }
        r6 = "Starting tracking for [%s]";	 Catch:{ all -> 0x00a0 }
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x00a0 }
        r7 = ",";	 Catch:{ all -> 0x00a0 }
        r1 = android.text.TextUtils.join(r7, r1);	 Catch:{ all -> 0x00a0 }
        r5[r3] = r1;	 Catch:{ all -> 0x00a0 }
        r1 = java.lang.String.format(r6, r5);	 Catch:{ all -> 0x00a0 }
        r3 = new java.lang.Throwable[r3];	 Catch:{ all -> 0x00a0 }
        r2.a(r4, r1, r3);	 Catch:{ all -> 0x00a0 }
        r1 = r12.d;	 Catch:{ all -> 0x00a0 }
        r1.addAll(r0);	 Catch:{ all -> 0x00a0 }
        r0 = r12.c;	 Catch:{ all -> 0x00a0 }
        r1 = r12.d;	 Catch:{ all -> 0x00a0 }
        r0.a(r1);	 Catch:{ all -> 0x00a0 }
        monitor-exit(r13);	 Catch:{ all -> 0x00a0 }
        return;	 Catch:{ all -> 0x00a0 }
        r0 = move-exception;	 Catch:{ all -> 0x00a0 }
        monitor-exit(r13);	 Catch:{ all -> 0x00a0 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.a(rv[]):void");
    }

    public final void b(List<String> list) {
        for (String str : list) {
            pq.a().a(a, String.format("Constraints not met: Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
            this.b.b(str);
        }
    }
}
