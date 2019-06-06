package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* renamed from: die */
public final class die implements did {
    private boolean a;
    private final dib b;
    private final dje c;
    private final dij d;
    private final aipn<Map<String, dif>> e;
    private final aipn<Map<String, din>> f;
    private final Context g;
    private final aipn<Set<String>> h;
    private final aipn<dim> i;
    private final dlk j;
    private final zfw k;

    /* renamed from: die$a */
    static final class a implements Runnable {
        private /* synthetic */ die a;

        a(die die) {
            this.a = die;
        }

        public final void run() {
            this.a.a();
        }
    }

    public die(dib dib, dje dje, dij dij, aipn<Map<String, dif>> aipn, aipn<Map<String, din>> aipn2, Context context, aipn<Set<String>> aipn3, aipn<dim> aipn4, dlk dlk, zfw zfw) {
        akcr.b(dib, "logger");
        akcr.b(dje, "configProvider");
        akcr.b(dij, "taskScheduler");
        akcr.b(aipn, "logQueues");
        akcr.b(aipn2, "datalossManagers");
        akcr.b(context, "context");
        akcr.b(aipn3, "viewerBlacklist");
        akcr.b(aipn4, "dataClientIdProvider");
        akcr.b(dlk, "blizzardFileInitializer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.b = dib;
        this.c = dje;
        this.d = dij;
        this.e = aipn;
        this.f = aipn2;
        this.g = context;
        this.h = aipn3;
        this.i = aipn4;
        this.j = dlk;
        this.k = zfw;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0081 in {5, 10, 14, 17, 20} preds:[]
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
    public final synchronized void a() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.a;	 Catch:{ all -> 0x007e }
        if (r0 == 0) goto L_0x0007;
        monitor-exit(r3);
        return;
        r0 = r3.i;	 Catch:{ all -> 0x007e }
        r0 = r0.get();	 Catch:{ all -> 0x007e }
        r0 = (defpackage.dim) r0;	 Catch:{ all -> 0x007e }
        r0.a();	 Catch:{ all -> 0x007e }
        r0 = r3.f;	 Catch:{ all -> 0x007e }
        r0 = r0.get();	 Catch:{ all -> 0x007e }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x007e }
        r0 = r0.values();	 Catch:{ all -> 0x007e }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x007e }
        r0 = r0.iterator();	 Catch:{ all -> 0x007e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x007e }
        if (r1 == 0) goto L_0x0036;	 Catch:{ all -> 0x007e }
        r1 = r0.next();	 Catch:{ all -> 0x007e }
        r1 = (defpackage.din) r1;	 Catch:{ all -> 0x007e }
        r2 = r3.g;	 Catch:{ all -> 0x007e }
        r1.a(r2);	 Catch:{ all -> 0x007e }
        goto L_0x0024;	 Catch:{ all -> 0x007e }
        r0 = r3.e;	 Catch:{ all -> 0x007e }
        r0 = r0.get();	 Catch:{ all -> 0x007e }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x007e }
        r0 = r0.values();	 Catch:{ all -> 0x007e }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x007e }
        r0 = r0.iterator();	 Catch:{ all -> 0x007e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x007e }
        if (r1 == 0) goto L_0x0058;	 Catch:{ all -> 0x007e }
        r1 = r0.next();	 Catch:{ all -> 0x007e }
        r1 = (defpackage.dif) r1;	 Catch:{ all -> 0x007e }
        r1.a();	 Catch:{ all -> 0x007e }
        goto L_0x0048;	 Catch:{ all -> 0x007e }
        r0 = r3.c;	 Catch:{ all -> 0x007e }
        r0.a();	 Catch:{ all -> 0x007e }
        r0 = r3.b;	 Catch:{ all -> 0x007e }
        r1 = r3.h;	 Catch:{ all -> 0x007e }
        r1 = r1.get();	 Catch:{ all -> 0x007e }
        r1 = (java.util.Set) r1;	 Catch:{ all -> 0x007e }
        r0.a(r1);	 Catch:{ all -> 0x007e }
        r0 = r3.k;	 Catch:{ all -> 0x007e }
        r0 = r0.f();	 Catch:{ all -> 0x007e }
        r0 = (defpackage.ajdw) r0;	 Catch:{ all -> 0x007e }
        r1 = r3.j;	 Catch:{ all -> 0x007e }
        r1 = (java.lang.Runnable) r1;	 Catch:{ all -> 0x007e }
        r0.a(r1);	 Catch:{ all -> 0x007e }
        r0 = 1;	 Catch:{ all -> 0x007e }
        r3.a = r0;	 Catch:{ all -> 0x007e }
        monitor-exit(r3);
        return;
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.die.a():void");
    }

    public final void b() {
        this.d.a(new a(this));
    }
}
