package defpackage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.mh.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zmh */
public class zmh extends Adapter<zmt<? super zmy>> implements ajej, zml {
    private final ajwl<List<zma>> a;
    private final AtomicBoolean b;
    private final ajei c;
    private final zke d;
    private final ajdw e;
    private final zmn f;
    final AtomicLong i;
    final AtomicReference<znh<c>> j;
    final zne<zmy> k;
    final ajdp<zne<zmy>> l;
    public volatile boolean m;
    protected final ajwo<zkd> n;
    final zms o;
    final ajdw p;

    /* renamed from: zmh$a */
    static final class a extends defpackage.mh.a {
        private final znh<c> a;
        private final znh<c> b;

        public a(znh<c> znh, znh<c> znh2) {
            akcr.b(znh, "oldModels");
            akcr.b(znh2, "newModels");
            this.a = znh;
            this.b = znh2;
        }

        public final int a() {
            return this.a.a();
        }

        public final /* bridge */ /* synthetic */ Object a(int i) {
            return (c) this.a.a(i);
        }

        public final boolean a(int i, int i2) {
            return ((c) this.a.a(i)).a != ((c) this.b.a(i2)).a ? false : ((c) this.a.a(i)).b.areItemsTheSame(((c) this.b.a(i2)).b);
        }

        public final int b() {
            return this.b.a();
        }

        public final boolean b(int i, int i2) {
            return ((c) this.a.a(i)).b.areContentsTheSame(((c) this.b.a(i2)).b);
        }
    }

    /* renamed from: zmh$i */
    static final class i<T> implements ajfl<d> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, "it");
            return dVar.b != null;
        }
    }

    /* renamed from: zmh$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ zma a;
        private /* synthetic */ int b;
        private /* synthetic */ zmh c;

        f(zma zma, int i, zmh zmh) {
            this.a = zma;
            this.b = i;
            this.c = zmh;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x006a in {4, 9, 11, 12, 14} preds:[]
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
        private defpackage.znh<? extends java.lang.Object> a(defpackage.znh<defpackage.zmy> r11) {
            /*
            r10 = this;
            r0 = "models";
            defpackage.akcr.b(r11, r0);
            r0 = r10.c;	 Catch:{ all -> 0x0068 }
            r0 = r0.k;	 Catch:{ all -> 0x0068 }
            if (r11 != r0) goto L_0x0012;	 Catch:{ all -> 0x0068 }
            r11 = r10.c;	 Catch:{ all -> 0x0068 }
            r11 = r11.k;	 Catch:{ all -> 0x0068 }
            r11 = (defpackage.znh) r11;	 Catch:{ all -> 0x0068 }
            goto L_0x0067;	 Catch:{ all -> 0x0068 }
            r11 = (java.lang.Iterable) r11;	 Catch:{ all -> 0x0068 }
            r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0068 }
            r1 = 10;	 Catch:{ all -> 0x0068 }
            r1 = defpackage.ajyn.a(r11, r1);	 Catch:{ all -> 0x0068 }
            r0.<init>(r1);	 Catch:{ all -> 0x0068 }
            r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0068 }
            r11 = r11.iterator();	 Catch:{ all -> 0x0068 }
            r1 = r11.hasNext();	 Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x005f;	 Catch:{ all -> 0x0068 }
            r1 = r11.next();	 Catch:{ all -> 0x0068 }
            r4 = r1;	 Catch:{ all -> 0x0068 }
            r4 = (defpackage.zmy) r4;	 Catch:{ all -> 0x0068 }
            r1 = r10.c;	 Catch:{ all -> 0x0068 }
            r1 = r1.o;	 Catch:{ all -> 0x0068 }
            r2 = "model";	 Catch:{ all -> 0x0068 }
            defpackage.akcr.a(r4, r2);	 Catch:{ all -> 0x0068 }
            r2 = r4.getType();	 Catch:{ all -> 0x0068 }
            r5 = r1.getViewTypeId(r2);	 Catch:{ all -> 0x0068 }
            r1 = new zmh$c;	 Catch:{ all -> 0x0068 }
            r3 = r10.a;	 Catch:{ all -> 0x0068 }
            r2 = r10.b;	 Catch:{ all -> 0x0068 }
            r6 = r4.getId();	 Catch:{ all -> 0x0068 }
            r8 = (long) r2;	 Catch:{ all -> 0x0068 }
            r2 = 40;	 Catch:{ all -> 0x0068 }
            r8 = r8 << r2;	 Catch:{ all -> 0x0068 }
            r6 = r6 ^ r8;	 Catch:{ all -> 0x0068 }
            r8 = (long) r5;	 Catch:{ all -> 0x0068 }
            r2 = 52;	 Catch:{ all -> 0x0068 }
            r8 = r8 << r2;	 Catch:{ all -> 0x0068 }
            r6 = r6 ^ r8;	 Catch:{ all -> 0x0068 }
            r2 = r1;	 Catch:{ all -> 0x0068 }
            r2.<init>(r3, r4, r5, r6);	 Catch:{ all -> 0x0068 }
            r0.add(r1);	 Catch:{ all -> 0x0068 }
            goto L_0x0025;	 Catch:{ all -> 0x0068 }
            r0 = (java.util.List) r0;	 Catch:{ all -> 0x0068 }
            r11 = new znf;	 Catch:{ all -> 0x0068 }
            r11.<init>(r0);	 Catch:{ all -> 0x0068 }
            goto L_0x000f;
            return r11;
            r11 = move-exception;
            throw r11;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zmh$f.a(znh):znh");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((znh) obj);
        }
    }

    /* renamed from: zmh$g */
    static final class g extends akcq implements akbl<List<? extends zma>, ajdp<b>> {
        g(zmh zmh) {
            super(1, zmh);
        }

        public final String getName() {
            return "combineSections";
        }

        public final akej getOwner() {
            return akde.a(zmh.class);
        }

        public final String getSignature() {
            return "combineSections(Ljava/util/List;)Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            zmh zmh = (zmh) this.receiver;
            Iterable iterable = list;
            Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
            int i = 0;
            for (Object next : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    ajym.a();
                }
                zma zma = (zma) next;
                arrayList.add(zma.c().h((ajdt) zmh.l).a(zmh.p).p(new f(zma, i, zmh)));
                i = i2;
            }
            ajdp a = ajdp.a((Iterable) (List) arrayList, (ajfc) new e(zmh));
            if (a == null) {
                akcr.a();
            }
            return a;
        }
    }

    /* renamed from: zmh$h */
    static final class h extends akcq implements akbl<b, d> {
        h(zmh zmh) {
            super(1, zmh);
        }

        public final String getName() {
            return "calculateDiff";
        }

        public final akej getOwner() {
            return akde.a(zmh.class);
        }

        public final String getSignature() {
            return "calculateDiff(Lcom/snap/ui/recycling/adapter/ObservableViewModelSectionAdapter2$ItemUpdates;)Lcom/snap/ui/recycling/adapter/ObservableViewModelSectionAdapter2$SectionUpdates;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "p1");
            return ((zmh) this.receiver).a(bVar);
        }
    }

    /* renamed from: zmh$j */
    static final class j extends akcq implements akbl<d, ajxw> {
        j(zmh zmh) {
            super(1, zmh);
        }

        public final String getName() {
            return "applyAdapterUpdates";
        }

        public final akej getOwner() {
            return akde.a(zmh.class);
        }

        public final String getSignature() {
            return "applyAdapterUpdates(Lcom/snap/ui/recycling/adapter/ObservableViewModelSectionAdapter2$SectionUpdates;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, "p1");
            zmh zmh = (zmh) this.receiver;
            if (dVar.b != null) {
                Object obj2;
                synchronized (zmh.i) {
                    if (dVar.c == zmh.i.get()) {
                        zmh.j.set(dVar.a);
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                }
                if (obj2 != null) {
                    zmh.j.set(dVar.a);
                    dVar.b.a((Adapter) zmh);
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: zmh$e */
    public static final class e<T, R> implements ajfc<Object[], R> {
        private /* synthetic */ zmh a;

        public e(zmh zmh) {
            this.a = zmh;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:53:0x00b6 in {2, 3, 9, 10, 11, 16, 17, 19, 20, 22, 23, 26, 41, 42, 44, 45, 47, 49, 52} preds:[]
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
        private R a(java.lang.Object[] r10) {
            /*
            r9 = this;
            r0 = "t1";
            defpackage.akcr.b(r10, r0);
            r0 = r10.length;
            r1 = 1;
            r2 = 0;
            if (r0 != 0) goto L_0x000c;
            r0 = 1;
            goto L_0x000d;
            r0 = 0;
            r0 = r0 ^ r1;
            if (r0 == 0) goto L_0x003b;
            r0 = r9.a;
            r0 = r0.m;
            if (r0 == 0) goto L_0x0022;
            r0 = r10[r2];
            r3 = r9.a;
            r3 = r3.k;
            if (r0 == r3) goto L_0x0020;
            r0 = 1;
            goto L_0x0037;
            r0 = 0;
            goto L_0x0037;
            r0 = r10.length;
            r3 = 0;
            if (r3 >= r0) goto L_0x0020;
            r4 = r10[r3];
            r5 = r9.a;
            r5 = r5.k;
            if (r4 == r5) goto L_0x0030;
            r4 = 1;
            goto L_0x0031;
            r4 = 0;
            if (r4 == 0) goto L_0x0034;
            goto L_0x001e;
            r3 = r3 + 1;
            goto L_0x0024;
            if (r0 == 0) goto L_0x003b;
            r0 = 1;
            goto L_0x003c;
            r0 = 0;
            if (r0 != 0) goto L_0x004e;
            r10 = new zmh$b;
            r0 = defpackage.znk.a;
            r0 = (defpackage.znh) r0;
            r1 = defpackage.znk.a;
            r1 = (defpackage.znh) r1;
            r2 = -1;
            r10.<init>(r0, r1, r2);
            return r10;
            r0 = r9.a;
            r0 = r0.i;
            monitor-enter(r0);
            r3 = r9.a;	 Catch:{ all -> 0x00b3 }
            r3 = r3.i;	 Catch:{ all -> 0x00b3 }
            r3 = r3.incrementAndGet();	 Catch:{ all -> 0x00b3 }
            r5 = r9.a;	 Catch:{ all -> 0x00b3 }
            r5 = r5.j;	 Catch:{ all -> 0x00b3 }
            r5 = r5.get();	 Catch:{ all -> 0x00b3 }
            r6 = "mainThreadData.get()";	 Catch:{ all -> 0x00b3 }
            defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x00b3 }
            r5 = (defpackage.znh) r5;	 Catch:{ all -> 0x00b3 }
            monitor-exit(r0);
            r10 = defpackage.ajyi.i(r10);
            if (r10 == 0) goto L_0x00ab;
            r0 = r9.a;
            r0 = r0.m;
            if (r0 == 0) goto L_0x00a1;
            r10 = (java.lang.Iterable) r10;
            r0 = new java.util.ArrayList;
            r0.<init>();
            r10 = r10.iterator();
            r6 = r10.hasNext();
            if (r6 == 0) goto L_0x009e;
            r6 = r10.next();
            r7 = r6;
            r7 = (defpackage.znh) r7;
            r8 = r9.a;
            r8 = r8.k;
            if (r7 == r8) goto L_0x0097;
            r7 = 1;
            goto L_0x0098;
            r7 = 0;
            if (r7 == 0) goto L_0x009e;
            r0.add(r6);
            goto L_0x0082;
            r10 = r0;
            r10 = (java.util.List) r10;
            r10 = defpackage.znk.b(r10);
            r0 = new zmh$b;
            r0.<init>(r5, r10, r3);
            return r0;
            r10 = new ajxt;
            r0 = "null cannot be cast to non-null type kotlin.collections.List<com.snap.ui.seeking.Seekable<com.snap.ui.recycling.adapter.ObservableViewModelSectionAdapter2.SectionItemInfo>>";
            r10.<init>(r0);
            throw r10;
            r10 = move-exception;
            monitor-exit(r0);
            throw r10;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zmh$e.a(java.lang.Object[]):java.lang.Object");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((Object[]) obj);
        }
    }

    /* renamed from: zmh$c */
    public static final class c {
        final zma a;
        final zmy b;
        final int c;
        final long d;

        public c(zma zma, zmy zmy, int i, long j) {
            akcr.b(zma, "section");
            akcr.b(zmy, MapboxEvent.KEY_MODEL);
            this.a = zma;
            this.b = zmy;
            this.c = i;
            this.d = j;
        }
    }

    /* renamed from: zmh$b */
    public static final class b {
        final znh<c> a;
        final znh<c> b;
        final long c;

        public b(znh<c> znh, znh<c> znh2, long j) {
            akcr.b(znh, "old");
            akcr.b(znh2, UnlockablesModel.DATA);
            this.a = znh;
            this.b = znh2;
            this.c = j;
        }
    }

    /* renamed from: zmh$d */
    public static final class d {
        final znh<c> a;
        final b b;
        final long c;

        public d(znh<c> znh, b bVar, long j) {
            akcr.b(znh, UnlockablesModel.DATA);
            this.a = znh;
            this.b = bVar;
            this.c = j;
        }
    }

    public zmh(zms zms, zke zke, ajdw ajdw, ajdw ajdw2, List<? extends zma> list) {
        this(zms, zke, ajdw, ajdw2, (List) list, 32);
    }

    public zmh(zms zms, zke zke, ajdw ajdw, ajdw ajdw2, List<? extends zma> list, zmn zmn) {
        akcr.b(zms, "viewFactory");
        akcr.b(zke, "eventDispatcher");
        akcr.b(ajdw, "computationScheduler");
        akcr.b(ajdw2, "mainThreadScheduler");
        this.o = zms;
        this.d = zke;
        this.p = ajdw;
        this.e = ajdw2;
        this.f = null;
        this.i = new AtomicLong(0);
        this.j = new AtomicReference(znk.a);
        Object i = ajwl.i(list);
        akcr.a(i, "BehaviorSubject.createDefault(defaultSections)");
        this.a = i;
        this.b = new AtomicBoolean(false);
        this.c = new ajei();
        this.k = new zne();
        i = ajdp.b(this.k);
        akcr.a(i, "Observable.just(emptySeekable)");
        this.l = i;
        i = new ajwo();
        akcr.a(i, "PublishSubject.create<AttachToRecyclerViewEvent>()");
        this.n = i;
    }

    private zmt<? super zmy> a(ViewGroup viewGroup, int i) {
        akcr.b(viewGroup, "parent");
        try {
            Object createViewHolder = this.o.createViewHolder(viewGroup.getContext(), i, viewGroup);
            akcr.a(createViewHolder, "viewFactory.createViewHo…ontext, viewType, parent)");
            return createViewHolder;
        } catch (Exception e) {
            zmn zmn = this.f;
            if (zmn != null) {
                viewGroup.getContext();
                zmt d = zmn.d();
                if (d != null) {
                    return d;
                }
            }
            throw e;
        }
    }

    private boolean a(zmt<? super zmy> zmt) {
        akcr.b(zmt, "holder");
        try {
            return zmt.b();
        } catch (Exception e) {
            if (this.f != null) {
                return true;
            }
            throw e;
        }
    }

    /* Access modifiers changed, original: final */
    public final d a(b bVar) {
        return new d(bVar.b, bVar.c == this.i.get() ? mh.a(new a(bVar.a, bVar.b), false) : null, bVar.c);
    }

    public final zmy a(int i) {
        return ((c) ((znh) this.j.get()).a(i)).b;
    }

    public final void a(List<? extends zma> list) {
        akcr.b(list, "sections");
        for (zma a : list) {
            this.c.a((ajej) a);
        }
        ajwl ajwl = this.a;
        Object p = ajwl.p();
        if (p == null) {
            akcr.a();
        }
        akcr.a(p, "sectionsSource.value!!");
        p = ajyu.h((Collection) p);
        p.addAll(list);
        ajwl.a(p);
    }

    public final void a(zma zma) {
        akcr.b(zma, "section");
        this.c.a((ajej) zma);
        ajwl ajwl = this.a;
        Object p = ajwl.p();
        if (p == null) {
            akcr.a();
        }
        akcr.a(p, "sectionsSource.value!!");
        p = ajyu.h((Collection) p);
        p.add(zma);
        ajwl.a(p);
    }

    public final zlv b(int i) {
        return ((c) ((znh) this.j.get()).a(i)).b.getType();
    }

    public final zma c(int i) {
        return ((c) ((znh) this.j.get()).a(i)).a;
    }

    public void dispose() {
        if (this.b.compareAndSet(false, true)) {
            this.c.dispose();
            this.a.a((Object) ajyw.a);
        }
    }

    public final ajej e() {
        zmh zmh = this;
        Object f = this.a.a(this.p).u(new zmj(new g(zmh))).b(2, TimeUnit.MILLISECONDS, this.p).p(new zmj(new h(zmh))).a((ajfl) i.a).a(this.e).f((ajfb) new zmi(new j(zmh)));
        akcr.a(f, "sectionsSource\n         …be(::applyAdapterUpdates)");
        return f;
    }

    public int getItemCount() {
        return ((znh) this.j.get()).a();
    }

    public long getItemId(int i) {
        return ((c) ((znh) this.j.get()).a(i)).d;
    }

    public int getItemViewType(int i) {
        return ((c) ((znh) this.j.get()).a(i)).c;
    }

    public boolean isDisposed() {
        return this.c.isDisposed();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        akcr.b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.n.a(new zkd(1, recyclerView));
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        zmt zmt = (zmt) viewHolder;
        akcr.b(zmt, "holder");
        try {
            c cVar = (c) ((znh) this.j.get()).a(i);
            zmt.a(cVar.b, this.d, cVar.a);
        } catch (Exception e) {
            if (this.f != null) {
                zmo zmo = new zmo(i);
                return;
            }
            throw e;
        }
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return a(viewGroup, i);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        akcr.b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.n.a(new zkd(2, recyclerView));
    }

    public /* synthetic */ boolean onFailedToRecycleView(ViewHolder viewHolder) {
        return a((zmt) viewHolder);
    }

    public /* synthetic */ void onViewRecycled(ViewHolder viewHolder) {
        zmt zmt = (zmt) viewHolder;
        akcr.b(zmt, "holder");
        try {
            zmt.a();
        } catch (Exception e) {
            if (this.f == null) {
                throw e;
            }
        }
    }
}
