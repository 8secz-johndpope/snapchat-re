package com.snap.lenses.explorer.community;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snapchat.android.R;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajey;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfu;
import defpackage.ajpy;
import defpackage.ajwl;
import defpackage.ajwo;
import defpackage.ajws;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajyl;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.ide;
import defpackage.mpx;
import defpackage.mqx;
import defpackage.mrd;
import defpackage.mri;
import defpackage.mrm;
import defpackage.mro;
import defpackage.mru;
import defpackage.msb;
import defpackage.msc;
import defpackage.mse;
import defpackage.zfw;
import defpackage.zha;
import defpackage.zke;
import defpackage.zlx;
import defpackage.zmh;
import defpackage.zms;
import java.util.List;

public final class DefaultCommunityLensListView extends RecyclerView implements mrd, msb {
    final ajws<defpackage.msb.a> a;
    private final ajws<Boolean> b;
    private final ajws<List<mpx>> c;
    private final ajei d;
    private msc e;
    private zmh f;
    private final ajxe g;

    static final class b<T> implements ajfb<mqx> {
        private /* synthetic */ DefaultCommunityLensListView a;

        b(DefaultCommunityLensListView defaultCommunityLensListView) {
            this.a = defaultCommunityLensListView;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0055 in {2, 6, 9, 12, 14, 16} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ void accept(java.lang.Object r5) {
            /*
            r4 = this;
            r5 = (defpackage.mqx) r5;
            r0 = r4.a;
            r0 = r0.a;
            r1 = "action";
            defpackage.akcr.a(r5, r1);
            r1 = r5 instanceof defpackage.mqx.a.a;
            if (r1 == 0) goto L_0x001d;
            r1 = new msb$a$a$a;
            r5 = (defpackage.mqx.a.a) r5;
            r2 = r5.a;
            r5 = r5.b;
            r1.<init>(r2, r5);
            r1 = (defpackage.msb.a) r1;
            goto L_0x004b;
            r1 = r5 instanceof defpackage.mqx.a.b;
            if (r1 == 0) goto L_0x002b;
            r1 = new msb$a$a$b;
            r5 = (defpackage.mqx.a.b) r5;
            r5 = r5.a;
            r1.<init>(r5);
            goto L_0x001a;
            r1 = r5 instanceof defpackage.mqx.a.d;
            if (r1 == 0) goto L_0x003d;
            r1 = new msb$a$a$d;
            r5 = (defpackage.mqx.a.d) r5;
            r2 = r5.a;
            r3 = r5.b;
            r5 = r5.c;
            r1.<init>(r2, r3, r5);
            goto L_0x001a;
            r1 = r5 instanceof defpackage.mqx.a.c;
            if (r1 == 0) goto L_0x004f;
            r1 = new msb$a$a$c;
            r5 = (defpackage.mqx.a.c) r5;
            r5 = r5.a;
            r1.<init>(r5);
            goto L_0x001a;
            r0.a(r1);
            return;
            r5 = new ajxk;
            r5.<init>();
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.explorer.community.DefaultCommunityLensListView$b.accept(java.lang.Object):void");
        }
    }

    static final class a implements mru {
        private final ide a;
        private final ajfb<mqx> b;
        private final zfw c;

        public a(ide ide, ajfb<mqx> ajfb, zfw zfw) {
            akcr.b(ide, "attributedFeature");
            akcr.b(ajfb, "tileActionHandler");
            akcr.b(zfw, "schedulers");
            this.a = ide;
            this.b = ajfb;
            this.c = zfw;
        }

        public final ide a() {
            return this.a;
        }

        public final ajfb<mqx> b() {
            return this.b;
        }

        public final zfw c() {
            return this.c;
        }
    }

    static final class c extends akcs implements akbk<ajdp<defpackage.msb.a>> {
        private /* synthetic */ DefaultCommunityLensListView a;

        static final class a<T1, T2> implements ajey<defpackage.mrn.a, defpackage.mrn.a> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ boolean test(Object obj, Object obj2) {
                defpackage.mrn.a aVar = (defpackage.mrn.a) obj;
                defpackage.mrn.a aVar2 = (defpackage.mrn.a) obj2;
                akcr.b(aVar, "old");
                akcr.b(aVar2, "new");
                return aVar.a() == aVar2.a();
            }
        }

        static final class b<T, R> implements ajfc<T, R> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((defpackage.mrn.a) obj, "it");
                return defpackage.msb.a.b.a;
            }
        }

        c(DefaultCommunityLensListView defaultCommunityLensListView) {
            this.a = defaultCommunityLensListView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object b = mro.a(this.a, 3).b(defpackage.mrn.a.class);
            akcr.a(b, "ofType(R::class.java)");
            b = b.a((ajey) a.a);
            akcr.a(b, "edgeScrollEvents(SPAN_CO…mCount == new.itemCount }");
            return ajpy.k(ajdp.b((ajdt) this.a.a, (ajdt) b.p(b.a))).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultCommunityLensListView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultCommunityLensListView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultCommunityLensListView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Co…w.Event>().toSerialized()");
        this.a = r;
        r = new ajwl().r();
        akcr.a(r, "BehaviorSubject.create<Boolean>().toSerialized()");
        this.b = r;
        r = new ajwl().r();
        akcr.a(r, "BehaviorSubject.create<L…erLens>>().toSerialized()");
        this.c = r;
        this.d = new ajei();
        this.g = ajxh.a(new c(this));
    }

    public final ajdp<defpackage.msb.a> a() {
        return (ajdp) this.g.b();
    }

    public final void a(mrm mrm) {
        akcr.b(mrm, "attribution");
        a aVar = new a(mrm.a(), new b(this), mrm.b());
        Object intArray = getResources().getIntArray(R.array.tile_background_colors);
        akcr.a(intArray, "resources.getIntArray(R.…y.tile_background_colors)");
        ajdp ajdp = this.c;
        Object j = this.b.j(ajfu.a);
        akcr.a(j, "hasMore.distinctUntilChanged()");
        this.e = new msc(intArray, ajdp, j, (byte) 0);
        zms zms = new zms((zlx) aVar, mse.class);
        zke zke = mri.a;
        msc msc = this.e;
        if (msc == null) {
            akcr.a("controller");
        }
        this.f = new zmh(zms, zke, (ajdw) mrm.b().b(), (ajdw) mrm.b().l(), ajyl.a(msc), 32);
        zmh zmh = this.f;
        String str = "viewModelAdapter";
        if (zmh == null) {
            akcr.a(str);
        }
        setAdapter(zmh);
        zmh = this.f;
        if (zmh == null) {
            akcr.a(str);
        }
        zmh.e();
    }

    public final /* synthetic */ void accept(Object obj) {
        defpackage.msb.b bVar = (defpackage.msb.b) obj;
        akcr.b(bVar, MapboxEvent.KEY_MODEL);
        if (bVar instanceof defpackage.msb.b.a) {
            stopScroll();
            defpackage.msb.b.a aVar = (defpackage.msb.b.a) bVar;
            this.c.a((Object) aVar.a);
            this.b.a((Object) Boolean.valueOf(aVar.b));
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        addItemDecoration(new zha(getResources().getDimensionPixelOffset(R.dimen.tile_default_spacing), 3));
        setLayoutManager(new GridLayoutManager(getContext(), 3, 1, false));
    }
}
