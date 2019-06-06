package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.common.util.concurrent.SettableFuture;
import defpackage.igg.g;
import defpackage.igg.h;

@Deprecated
/* renamed from: ncr */
public final class ncr {
    private final igg a;
    private final aipn<GoogleApiClient> b;
    private SettableFuture<a> c;
    private ajej d = ajfq.INSTANCE;

    /* renamed from: ncr$a */
    enum a {
        ENABLED,
        DENIED,
        EXTERNAL
    }

    public ncr(igg igg, aipn<GoogleApiClient> aipn) {
        this.b = aipn;
        this.a = igg;
    }

    private synchronized void a() {
        this.d.dispose();
        Object p = ((ajwo) this.a.a.b()).a((ajfl) g.a).p(h.a);
        akcr.a(p, "resultDispatcher.filter …p { it as ActvityResult }");
        this.d = p.a(-$$Lambda$ncr$xH7BWtv97yfS5fvcmG37f23jJAA.INSTANCE).p(-$$Lambda$ncr$oeA9_rqXuEEqWO_3aDGMYqNQkzk.INSTANCE).f(new -$$Lambda$ncr$kpkNrpTwynE6-V8Z2gK9RAj3YwY(this));
    }

    private void a(a aVar) {
        SettableFuture settableFuture;
        synchronized (this) {
            settableFuture = this.c;
            this.c = null;
            b();
        }
        if (settableFuture != null) {
            settableFuture.set(aVar);
        }
    }

    private synchronized void b() {
        this.d.dispose();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x006b in {2, 3, 5, 7, 14, 17, 21} preds:[]
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
    public final defpackage.abmn<defpackage.ncr.a> a(defpackage.nbw r4, android.content.Context r5) {
        /*
        r3 = this;
        r0 = r4.b();
        if (r0 != 0) goto L_0x0008;
        r4 = 0;
        goto L_0x0011;
        r0 = r4.a;
        r0.b();
        r4 = r4.a();
        if (r4 == 0) goto L_0x001e;
        r4 = defpackage.ncr.a.ENABLED;
        r4 = com.google.common.util.concurrent.Futures.immediateFuture(r4);
        r4 = defpackage.abmm.a(r4);
        return r4;
        monitor-enter(r3);
        r4 = r3.c;	 Catch:{ all -> 0x0068 }
        if (r4 == 0) goto L_0x002b;	 Catch:{ all -> 0x0068 }
        r4 = r3.c;	 Catch:{ all -> 0x0068 }
        r4 = defpackage.abmm.a(r4);	 Catch:{ all -> 0x0068 }
        monitor-exit(r3);	 Catch:{ all -> 0x0068 }
        return r4;	 Catch:{ all -> 0x0068 }
        r4 = com.google.common.util.concurrent.SettableFuture.create();	 Catch:{ all -> 0x0068 }
        r3.c = r4;	 Catch:{ all -> 0x0068 }
        r3.a();	 Catch:{ all -> 0x0068 }
        r4 = r3.c;	 Catch:{ all -> 0x0068 }
        monitor-exit(r3);	 Catch:{ all -> 0x0068 }
        r0 = r3.b;
        r0 = r0.get();
        r0 = (com.google.android.gms.common.api.GoogleApiClient) r0;
        r0.connect();
        r1 = com.google.android.gms.location.LocationRequest.create();
        r2 = 100;
        r1 = r1.setPriority(r2);
        r2 = new com.google.android.gms.location.LocationSettingsRequest$Builder;
        r2.<init>();
        r1 = r2.addLocationRequest(r1);
        r1 = r1.build();
        r2 = com.google.android.gms.location.LocationServices.SettingsApi;
        r0 = r2.checkLocationSettings(r0, r1);
        r1 = new -$$Lambda$ncr$So9gPoUOc_yD4ki8f2Qe-6pmq90;
        r1.<init>(r3, r5);
        r0.setResultCallback(r1);
        goto L_0x0019;
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0068 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncr.a(nbw, android.content.Context):abmn");
    }
}
