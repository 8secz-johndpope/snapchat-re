package com.snap.lenses.explorer.subscription;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
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
import defpackage.ajpy;
import defpackage.ajvv;
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
import defpackage.mrj;
import defpackage.mrm;
import defpackage.mro;
import defpackage.msr;
import defpackage.msy;
import defpackage.mtf;
import defpackage.mth;
import defpackage.zfw;
import defpackage.zke;
import defpackage.zlx;
import defpackage.zmh;
import defpackage.zms;
import java.util.List;

public final class DefaultSubscriptionLensFeedView extends ConstraintLayout implements mrd, msy {
    RecyclerView d;
    final ajws<defpackage.msy.a> e;
    private final ajws<Boolean> f;
    private final ajws<List<mpx>> g;
    private final ajei h;
    private mtf i;
    private zmh j;
    private final ajxe k;

    static final class b<T> implements ajfb<mqx> {
        private /* synthetic */ DefaultSubscriptionLensFeedView a;

        b(DefaultSubscriptionLensFeedView defaultSubscriptionLensFeedView) {
            this.a = defaultSubscriptionLensFeedView;
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
            r0 = r0.e;
            r1 = "action";
            defpackage.akcr.a(r5, r1);
            r1 = r5 instanceof defpackage.mqx.a.a;
            if (r1 == 0) goto L_0x001d;
            r1 = new msy$a$a$a;
            r5 = (defpackage.mqx.a.a) r5;
            r2 = r5.a;
            r5 = r5.b;
            r1.<init>(r2, r5);
            r1 = (defpackage.msy.a) r1;
            goto L_0x004b;
            r1 = r5 instanceof defpackage.mqx.a.b;
            if (r1 == 0) goto L_0x002b;
            r1 = new msy$a$a$b;
            r5 = (defpackage.mqx.a.b) r5;
            r5 = r5.a;
            r1.<init>(r5);
            goto L_0x001a;
            r1 = r5 instanceof defpackage.mqx.a.d;
            if (r1 == 0) goto L_0x003d;
            r1 = new msy$a$a$d;
            r5 = (defpackage.mqx.a.d) r5;
            r2 = r5.a;
            r3 = r5.b;
            r5 = r5.c;
            r1.<init>(r2, r3, r5);
            goto L_0x001a;
            r1 = r5 instanceof defpackage.mqx.a.c;
            if (r1 == 0) goto L_0x004f;
            r1 = new msy$a$a$c;
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
            throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.explorer.subscription.DefaultSubscriptionLensFeedView$b.accept(java.lang.Object):void");
        }
    }

    static final class a implements msr {
        private final ide a;
        private final zfw b;
        private final ajfb<mqx> c;

        public a(ide ide, zfw zfw, ajfb<mqx> ajfb) {
            akcr.b(ide, "attributedFeature");
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(ajfb, "tileActionHandler");
            this.a = ide;
            this.b = zfw;
            this.c = ajfb;
        }

        public final ide a() {
            return this.a;
        }

        public final zfw b() {
            return this.b;
        }

        public final ajfb<mqx> c() {
            return this.c;
        }
    }

    static final class c extends akcs implements akbk<ajdp<defpackage.msy.a>> {
        private /* synthetic */ DefaultSubscriptionLensFeedView a;

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
                return defpackage.msy.a.b.a;
            }
        }

        c(DefaultSubscriptionLensFeedView defaultSubscriptionLensFeedView) {
            this.a = defaultSubscriptionLensFeedView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            RecyclerView recyclerView = this.a.d;
            if (recyclerView == null) {
                akcr.a("subscriptionList");
            }
            Object b = mro.a(recyclerView, 1).b(defpackage.mrn.a.class);
            akcr.a(b, "ofType(R::class.java)");
            b = b.a((ajey) a.a);
            akcr.a(b, "subscriptionList.edgeScr…mCount == new.itemCount }");
            return ajpy.k(ajdp.b((ajdt) this.a.e, (ajdt) b.p(b.a))).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultSubscriptionLensFeedView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultSubscriptionLensFeedView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultSubscriptionLensFeedView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, (byte) 0);
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Su…w.Event>().toSerialized()");
        this.e = r;
        r = new ajwl().r();
        akcr.a(r, "BehaviorSubject.create<Boolean>().toSerialized()");
        this.f = r;
        r = new ajwl().r();
        akcr.a(r, "BehaviorSubject.create<L…erLens>>().toSerialized()");
        this.g = r;
        this.h = new ajei();
        this.k = ajxh.a(new c(this));
    }

    public final void a(mrm mrm) {
        akcr.b(mrm, "attribution");
        a aVar = new a(mrm.a(), mrm.b(), new b(this));
        Object intArray = getResources().getIntArray(R.array.tile_background_colors);
        akcr.a(intArray, "resources.getIntArray(R.…y.tile_background_colors)");
        Object f = this.g.f();
        akcr.a(f, "lenses.hide()");
        Object f2 = this.f.f();
        akcr.a(f2, "hasMore.hide()");
        this.i = new mtf(intArray, f, f2);
        zms zms = new zms((zlx) aVar, mth.class);
        zke zke = mri.a;
        mtf mtf = this.i;
        if (mtf == null) {
            akcr.a("controller");
        }
        this.j = new zmh(zms, zke, (ajdw) mrm.b().b(), (ajdw) mrm.b().l(), ajyl.a(mtf), 32);
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            akcr.a("subscriptionList");
        }
        zmh zmh = this.j;
        String str = "viewModelAdapter";
        if (zmh == null) {
            akcr.a(str);
        }
        recyclerView.setAdapter(zmh);
        ajei ajei = this.h;
        zmh = this.j;
        if (zmh == null) {
            akcr.a(str);
        }
        ajvv.a(ajei, zmh.e());
    }

    public final /* synthetic */ void accept(Object obj) {
        defpackage.msy.b bVar = (defpackage.msy.b) obj;
        akcr.b(bVar, MapboxEvent.KEY_MODEL);
        if (bVar instanceof defpackage.msy.b.b) {
            setVisibility(8);
            return;
        }
        if (bVar instanceof defpackage.msy.b.a) {
            setVisibility(0);
            defpackage.msy.b.a aVar = (defpackage.msy.b.a) bVar;
            this.g.a((Object) aVar.a);
            this.f.a((Object) Boolean.valueOf(aVar.b));
        }
    }

    public final ajdp<defpackage.msy.a> b() {
        return (ajdp) this.k.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.tile_default_spacing);
        Object findViewById = findViewById(R.id.lenses_explorer_subscription_feed_list);
        akcr.a(findViewById, "findViewById(R.id.lenses…r_subscription_feed_list)");
        this.d = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.d;
        String str = "subscriptionList";
        if (recyclerView == null) {
            akcr.a(str);
        }
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView = this.d;
        if (recyclerView == null) {
            akcr.a(str);
        }
        recyclerView.addItemDecoration(new mrj(dimensionPixelOffset));
        RecyclerView recyclerView2 = this.d;
        if (recyclerView2 == null) {
            akcr.a(str);
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
    }
}
