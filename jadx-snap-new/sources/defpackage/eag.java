package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.edg.a;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* renamed from: eag */
final class eag implements dqm {
    abtl a;
    abtl b;
    ebx c = ebx.NONE;
    edi d;
    eca e = eca.UNDEFINED;
    final dvq f;
    dpp g;
    dqk h;
    protected eaj i;
    protected a j;
    protected Supplier<dvn> k;
    final LinkedList<eae> l;
    final Set<iih<dqh>> m;
    final Set<iih<dqh>> n;
    final Set<iih<dqh>> o;
    private Map<ebx, ede> p = Maps.newEnumMap(ebx.class);
    private final Supplier<abms> q;
    private ajwl<Boolean> r = ajwl.i(Boolean.FALSE);
    private ajwl<Optional<dnm>> s = ajwl.i(Optional.absent());

    eag(dvq dvq, Supplier<abms> supplier) {
        this.f = dvq;
        this.q = supplier;
        this.i = eaj.NOT_INIT;
        this.g = null;
        this.n = new HashSet();
        this.m = new HashSet();
        this.o = new HashSet();
        this.l = new LinkedList();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(dnm dnm) {
        this.s.a(Optional.fromNullable(dnm));
    }

    public final synchronized void a(dot dot) {
        dvq dvq = this.f;
        if (!dvq.a.e(dot)) {
            dvq.a.c(dot);
        }
    }

    public final synchronized void a(dow dow) {
        dvq dvq = this.f;
        if (!dvq.b.e(dow)) {
            dvq.b.c(dow);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x001b in {5, 7, 10} preds:[]
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
    public final synchronized void a(defpackage.ede[] r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.p;	 Catch:{ all -> 0x0018 }
        r0.clear();	 Catch:{ all -> 0x0018 }
        r0 = r6.length;	 Catch:{ all -> 0x0018 }
        r1 = 0;	 Catch:{ all -> 0x0018 }
        if (r1 >= r0) goto L_0x0016;	 Catch:{ all -> 0x0018 }
        r2 = r6[r1];	 Catch:{ all -> 0x0018 }
        r3 = r5.p;	 Catch:{ all -> 0x0018 }
        r4 = r2.a;	 Catch:{ all -> 0x0018 }
        r3.put(r4, r2);	 Catch:{ all -> 0x0018 }
        r1 = r1 + 1;
        goto L_0x0008;
        monitor-exit(r5);
        return;
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eag.a(ede[]):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x000f in {4, 6, 7, 10} preds:[]
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
    public final synchronized boolean a() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.c;	 Catch:{ all -> 0x000c }
        r1 = defpackage.ebx.FRONT_FACING;	 Catch:{ all -> 0x000c }
        if (r0 != r1) goto L_0x000a;
        r0 = 1;
        monitor-exit(r2);
        return r0;
        r0 = 0;
        goto L_0x0008;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eag.a():boolean");
    }

    public final synchronized abtl b() {
        return this.a;
    }

    public final synchronized void b(dot dot) {
        this.f.a.d(dot);
    }

    public final synchronized void b(dow dow) {
        this.f.b.d(dow);
    }

    public final synchronized abtl c() {
        return this.b;
    }

    public final synchronized ebx d() {
        return this.c;
    }

    public final synchronized int e() {
        ede ede = (ede) this.p.get(this.c);
        if (ede == null) {
            return 0;
        }
        return ede.c;
    }

    public final synchronized boolean f() {
        return this.p.size() > 1;
    }

    public final synchronized eca g() {
        return this.e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x001b in {6, 8, 9, 12} preds:[]
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
    public final synchronized boolean h() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.g;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0016;	 Catch:{ all -> 0x0018 }
        r0 = r2.g;	 Catch:{ all -> 0x0018 }
        r0 = r0.c();	 Catch:{ all -> 0x0018 }
        r1 = defpackage.ece.LOW_LIGHT;	 Catch:{ all -> 0x0018 }
        r0 = r0.contains(r1);	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0016;
        r0 = 1;
        monitor-exit(r2);
        return r0;
        r0 = 0;
        goto L_0x0014;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eag.h():boolean");
    }

    public final float i() {
        dpp dpp = this.g;
        return dpp != null ? dpp.k() : MapboxConstants.MINIMUM_ZOOM;
    }

    public final float j() {
        dpp dpp = this.g;
        return dpp != null ? dpp.l() : MapboxConstants.MINIMUM_ZOOM;
    }

    public final boolean k() {
        dpp dpp = this.g;
        return dpp != null && dpp.p() == ecc.SINGLE_FLASH;
    }

    public final ajdp<Boolean> l() {
        return this.r.f();
    }

    public final Optional<dnm> m() {
        return (Optional) this.s.p();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void n() {
        this.a = null;
        this.b = null;
        this.d = null;
        this.c = ebx.NONE;
        this.g = null;
        this.r.a(Boolean.FALSE);
        this.s.a(Optional.absent());
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void o() {
        this.r.a(Boolean.TRUE);
    }
}
