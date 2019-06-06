package defpackage;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;

/* renamed from: tsn */
public final class tsn implements tpy {
    final ajxe a;
    final LayoutInflater b;
    final ViewGroup c;
    private final ajxe d = ajxh.a(new a(this));
    private final ajei e = new ajei();
    private final SparseArray<View> f = new SparseArray();
    private final Set<tpx> g;

    /* renamed from: tsn$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        b(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(toc.d.callsite("PreviewToolInflatorImpl"));
        }
    }

    /* renamed from: tsn$a */
    static final class a extends akcs implements akbk<zmv> {
        private /* synthetic */ tsn a;

        a(tsn tsn) {
            this.a = tsn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zmv(((zfw) this.a.a.b()).d(), this.a.b, this.a.c);
        }
    }

    /* renamed from: tsn$c */
    static final class c<T> implements ajfb<View> {
        private /* synthetic */ tpx a;
        private /* synthetic */ tsn b;

        c(tpx tpx, tsn tsn) {
            this.a = tpx;
            this.b = tsn;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (View) obj;
            tsn tsn = this.b;
            int a = this.a.a();
            akcr.a(obj, "view");
            tsn.a(a, obj);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tsn.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(tsn.class), "prefetcher", "getPrefetcher()Lcom/snap/ui/recycling/prefetch/CompletableViewPrefetcher;")};
    }

    public tsn(LayoutInflater layoutInflater, zgb zgb, Set<? extends tpx> set, ViewGroup viewGroup) {
        akcr.b(layoutInflater, "inflater");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(set, "previewResourceIdProviders");
        akcr.b(viewGroup, "parent");
        this.b = layoutInflater;
        this.g = set;
        this.c = viewGroup;
        this.a = ajxh.a(new b(zgb));
    }

    public final synchronized View a(int i) {
        if (this.f.get(i) != null) {
            Object obj = this.f.get(i);
            akcr.a(obj, "inflatedViews.get(id)");
            return (View) obj;
        }
        View view = (View) this.f.get(i);
        if (view != null) {
            return view;
        }
        this.e.dispose();
        Object inflate = this.b.inflate(i, this.c, false);
        this.f.put(i, inflate);
        akcr.a(inflate, "view");
        return inflate;
    }

    public final synchronized void a(int i, View view) {
        akcr.b(view, "view");
        this.f.put(i, view);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x004d in {5, 8, 11} preds:[]
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
    public final synchronized defpackage.ajej start() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f;	 Catch:{ all -> 0x004a }
        r0.clear();	 Catch:{ all -> 0x004a }
        r0 = r4.g;	 Catch:{ all -> 0x004a }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x004a }
        r0 = r0.iterator();	 Catch:{ all -> 0x004a }
        r1 = r0.hasNext();	 Catch:{ all -> 0x004a }
        if (r1 == 0) goto L_0x0044;	 Catch:{ all -> 0x004a }
        r1 = r0.next();	 Catch:{ all -> 0x004a }
        r1 = (defpackage.tpx) r1;	 Catch:{ all -> 0x004a }
        r2 = r4.d;	 Catch:{ all -> 0x004a }
        r2 = r2.b();	 Catch:{ all -> 0x004a }
        r2 = (defpackage.zmv) r2;	 Catch:{ all -> 0x004a }
        r3 = r1.a();	 Catch:{ all -> 0x004a }
        r2 = r2.b(r3);	 Catch:{ all -> 0x004a }
        r3 = new tsn$c;	 Catch:{ all -> 0x004a }
        r3.<init>(r1, r4);	 Catch:{ all -> 0x004a }
        r3 = (defpackage.ajfb) r3;	 Catch:{ all -> 0x004a }
        r1 = r2.c(r3);	 Catch:{ all -> 0x004a }
        r1 = r1.c();	 Catch:{ all -> 0x004a }
        r2 = "prefetcher.load<View>(it…             .subscribe()";	 Catch:{ all -> 0x004a }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x004a }
        r2 = r4.e;	 Catch:{ all -> 0x004a }
        defpackage.ajvv.a(r1, r2);	 Catch:{ all -> 0x004a }
        goto L_0x000e;	 Catch:{ all -> 0x004a }
        r0 = r4.e;	 Catch:{ all -> 0x004a }
        r0 = (defpackage.ajej) r0;	 Catch:{ all -> 0x004a }
        monitor-exit(r4);
        return r0;
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsn.start():ajej");
    }
}
