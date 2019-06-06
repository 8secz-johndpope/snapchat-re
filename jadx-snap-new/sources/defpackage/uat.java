package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.snap.preview.tooltip.SnapPreviewAnimatedTooltipController;
import com.snap.preview.tooltip.SnapPreviewAnimatedTooltipController.a;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.Tooltip;
import defpackage.txi.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: uat */
public final class uat implements zgj {
    final ajxe a = ajxh.a(new b(this));
    Context b;
    FrameLayout c;
    FrameLayout d;
    final toc e;
    final aipn<ftl> f;
    final aipn<uav> g;
    final txi h;
    private final ajxe i = ajxh.a(new k(this));
    private final ajxe j = ajxh.a(new j(this));
    private final HashMap<uaj, uai> k = new HashMap();
    private final ajei l = new ajei();
    private final zgb m;
    private final ajdp<uaq> n;
    private final ajdp<ajxw> o;
    private final uan p;
    private final Map<uaj, String> q;

    /* renamed from: uat$i */
    public static final class i implements a {
        private /* synthetic */ uat a;

        i(uat uat) {
            this.a = uat;
        }

        public final View a() {
            return this.a.c(uaj.NEW_USER_CAPTION);
        }

        public final View b() {
            return this.a.c(uaj.NEW_USER_DRAW);
        }

        public final View c() {
            return this.a.c(uaj.NEW_USER_STICKER);
        }

        public final View d() {
            return this.a.c(uaj.NEW_USER_FACECRAFT);
        }
    }

    /* renamed from: uat$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: uat$k */
    static final class k extends akcs implements akbk<zfw> {
        private /* synthetic */ uat a;

        k(uat uat) {
            this.a = uat;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.e.callsite("PreviewTooltipPresenter"));
        }
    }

    /* renamed from: uat$j */
    static final class j extends akcs implements akbk<uav> {
        private /* synthetic */ uat a;

        j(uat uat) {
            this.a = uat;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (uav) this.a.g.get();
        }
    }

    /* renamed from: uat$b */
    static final class b extends akcs implements akbk<ftl> {
        private /* synthetic */ uat a;

        b(uat uat) {
            this.a = uat;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.f.get();
        }
    }

    /* renamed from: uat$c */
    static final class c<T> implements ajfb<ajxw> {
        private /* synthetic */ uat a;

        c(uat uat) {
            this.a = uat;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(uaj.SWIPE_FILTER);
            this.a.a(new uaf());
        }
    }

    /* renamed from: uat$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ uat a;

        d(uat uat) {
            this.a = uat;
        }

        public final /* synthetic */ Object call() {
            Object a = ((uav) this.a.j.b());
            akcr.a(a, "previewTooltipRepository");
            c cVar = this.a.h.C;
            aeew aeew = cVar != null ? cVar.a : null;
            Object obj = (ftl) this.a.a.b();
            akcr.a(obj, "compositeConfigurationProvider");
            return uay.a(a, aeew, obj);
        }
    }

    /* renamed from: uat$e */
    static final class e<T> implements ajfb<uaj> {
        private /* synthetic */ uat a;

        e(uat uat) {
            this.a = uat;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2 = (uaj) obj;
            uat uat = this.a;
            akcr.a(obj2, "it");
            uat.a(new uak(obj2, false, null, null, false, 30));
        }
    }

    /* renamed from: uat$f */
    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: uat$g */
    static final class g<T> implements ajfb<uaq> {
        private /* synthetic */ uat a;

        g(uat uat) {
            this.a = uat;
        }

        public final /* synthetic */ void accept(Object obj) {
            uaq uaq = (uaq) obj;
            if (uaq instanceof uak) {
                this.a.a((uak) uaq);
            } else if (uaq instanceof uag) {
                this.a.a((uag) uaq);
            } else {
                if (uaq instanceof uaf) {
                    this.a.a((uaf) uaq);
                }
            }
        }
    }

    /* renamed from: uat$h */
    static final class h implements uah {
        private /* synthetic */ uat a;
        private /* synthetic */ uaj b;

        h(uat uat, uaj uaj) {
            this.a = uat;
            this.b = uaj;
        }

        public final void a() {
            this.a.b(this.b);
        }
    }

    /* renamed from: uat$l */
    static final class l implements ajev {
        private /* synthetic */ uat a;
        private /* synthetic */ uaj b;

        l(uat uat, uaj uaj) {
            this.a = uat;
            this.b = uaj;
        }

        public final void run() {
            ((uav) this.a.j.b()).b(this.b);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(uat.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(uat.class), "previewTooltipRepository", "getPreviewTooltipRepository()Lcom/snap/preview/tooltips/PreviewTooltipRepository;"), new akdc(akde.a(uat.class), "compositeConfigurationProvider", "getCompositeConfigurationProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;")};
        a aVar = new a();
    }

    public uat(toc toc, aipn<ftl> aipn, aipn<uav> aipn2, zgb zgb, txi txi, ajdp<uaq> ajdp, ajdp<ajxw> ajdp2, uan uan, Map<uaj, String> map) {
        akcr.b(toc, "previewFeature");
        akcr.b(aipn, "compositeConfigurationProviderLazy");
        akcr.b(aipn2, "previewTooltipRepositoryLazy");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(txi, "previewMediaPlayer");
        akcr.b(ajdp, "tooltipVisibilityObservable");
        akcr.b(ajdp2, "scrollInFilterEventObservable");
        akcr.b(uan, "tooltipViewProvider");
        akcr.b(map, "tooltipTypeToToolIdMap");
        this.e = toc;
        this.f = aipn;
        this.g = aipn2;
        this.m = zgb;
        this.h = txi;
        this.n = ajdp;
        this.o = ajdp2;
        this.p = uan;
        this.q = map;
    }

    private final SnapPreviewAnimatedTooltipController a(boolean z) {
        SnapPreviewAnimatedTooltipController snapPreviewAnimatedTooltipController = new SnapPreviewAnimatedTooltipController(new i(this));
        Context context = this.b;
        if (context == null) {
            akcr.a("context");
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            akcr.a("previewLayout");
        }
        snapPreviewAnimatedTooltipController.a(context, (View) frameLayout);
        frameLayout = this.d;
        if (frameLayout == null) {
            akcr.a("tooltipLayer");
        }
        snapPreviewAnimatedTooltipController.a((uai) new ual(frameLayout, R.id.caption_onboarding_stub, R.id.caption_onboarding_view));
        snapPreviewAnimatedTooltipController.c(z);
        return snapPreviewAnimatedTooltipController;
    }

    private final uam a(uaj uaj, String str, int i, Tooltip.a aVar) {
        View c = c(uaj);
        FrameLayout frameLayout = this.d;
        if (frameLayout == null) {
            akcr.a("tooltipLayer");
        }
        return new uam(c, frameLayout, str, true, i, aVar, -1, new h(this, uaj));
    }

    private final zfw a() {
        return (zfw) this.i.b();
    }

    /* JADX WARNING: Missing block: B:66:0x017f, code skipped:
            defpackage.akcr.a(r2, r4);
            r2 = defpackage.uat.a(r0, r1, r2);
     */
    /* JADX WARNING: Missing block: B:77:0x01be, code skipped:
            r2 = r2;
     */
    /* JADX WARNING: Missing block: B:78:0x01c0, code skipped:
            if (r2 == null) goto L_0x01ca;
     */
    /* JADX WARNING: Missing block: B:79:0x01c2, code skipped:
            r0.k.put(r1, r2);
     */
    /* JADX WARNING: Missing block: B:80:0x01c9, code skipped:
            return r2;
     */
    /* JADX WARNING: Missing block: B:81:0x01ca, code skipped:
            r2 = null;
     */
    private final defpackage.uai d(defpackage.uaj r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r0.k;
        r2 = r2.get(r1);
        r2 = (defpackage.uai) r2;
        r3 = 0;
        if (r2 != 0) goto L_0x01cb;
    L_0x000f:
        r2 = defpackage.uau.a;
        r4 = r18.ordinal();
        r2 = r2[r4];
        r4 = 1;
        r5 = "tooltipLayer";
        r6 = "context";
        switch(r2) {
            case 1: goto L_0x01ba;
            case 2: goto L_0x01b4;
            case 3: goto L_0x01a1;
            case 4: goto L_0x0187;
            case 5: goto L_0x016f;
            case 6: goto L_0x014d;
            case 7: goto L_0x011e;
            case 8: goto L_0x00fb;
            case 9: goto L_0x00e9;
            case 10: goto L_0x00d7;
            case 11: goto L_0x00c5;
            case 12: goto L_0x00b3;
            case 13: goto L_0x009f;
            case 14: goto L_0x008d;
            case 15: goto L_0x007b;
            case 16: goto L_0x0048;
            case 17: goto L_0x0022;
            default: goto L_0x001f;
        };
    L_0x001f:
        r2 = r3;
        goto L_0x01c0;
    L_0x0022:
        r2 = new uam;
        r8 = 0;
        r9 = r0.d;
        if (r9 != 0) goto L_0x002c;
    L_0x0029:
        defpackage.akcr.a(r5);
    L_0x002c:
        r4 = r0.b;
        if (r4 != 0) goto L_0x0033;
    L_0x0030:
        defpackage.akcr.a(r6);
    L_0x0033:
        r5 = 2131888255; // 0x7f12087f float:1.941114E38 double:1.0532927476E-314;
        r10 = r4.getString(r5);
        r11 = 1;
        r12 = 1;
        r13 = com.snapchat.android.framework.ui.views.Tooltip.a.POINTER_DOWN;
        r14 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r16 = 0;
        r7 = r2;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14, r16);
        goto L_0x01be;
    L_0x0048:
        r2 = new uam;
        r7 = 0;
        r8 = r0.d;
        if (r8 != 0) goto L_0x0052;
    L_0x004f:
        defpackage.akcr.a(r5);
    L_0x0052:
        r9 = 2131559054; // 0x7f0d028e float:1.8743441E38 double:1.0531301007E-314;
        r4 = r0.b;
        if (r4 != 0) goto L_0x005c;
    L_0x0059:
        defpackage.akcr.a(r6);
    L_0x005c:
        r5 = 2131888254; // 0x7f12087e float:1.9411138E38 double:1.053292747E-314;
        r10 = r4.getString(r5);
        r11 = 0;
        r12 = 1;
        r13 = com.snapchat.android.framework.ui.views.Tooltip.a.POINTER_DOWN;
        r14 = -1;
        r16 = 0;
        r4 = r2;
        r5 = r7;
        r6 = r8;
        r7 = r9;
        r8 = r10;
        r9 = r11;
        r10 = r12;
        r11 = r13;
        r12 = r14;
        r14 = r16;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14);
        goto L_0x01be;
    L_0x007b:
        r2 = r0.b;
        if (r2 != 0) goto L_0x0082;
    L_0x007f:
        defpackage.akcr.a(r6);
    L_0x0082:
        r4 = 2131887194; // 0x7f12045a float:1.9408988E38 double:1.0532922234E-314;
        r2 = r2.getString(r4);
        r4 = "context.getString(R.stri…_onboarding_tooltip_text)";
        goto L_0x017f;
    L_0x008d:
        r2 = r0.b;
        if (r2 != 0) goto L_0x0094;
    L_0x0091:
        defpackage.akcr.a(r6);
    L_0x0094:
        r4 = 2131887435; // 0x7f12054b float:1.9409477E38 double:1.0532923424E-314;
        r2 = r2.getString(r4);
        r4 = "context.getString(R.string.giphy_sticker_intro)";
        goto L_0x017f;
    L_0x009f:
        r2 = new ual;
        r4 = r0.d;
        if (r4 != 0) goto L_0x00a8;
    L_0x00a5:
        defpackage.akcr.a(r5);
    L_0x00a8:
        r5 = 2131429970; // 0x7f0b0a52 float:1.8481628E38 double:1.0530663247E-314;
        r6 = 2131429971; // 0x7f0b0a53 float:1.848163E38 double:1.053066325E-314;
        r2.<init>(r4, r5, r6);
        goto L_0x01be;
    L_0x00b3:
        r2 = r0.b;
        if (r2 != 0) goto L_0x00ba;
    L_0x00b7:
        defpackage.akcr.a(r6);
    L_0x00ba:
        r4 = 2131889797; // 0x7f120e85 float:1.9414268E38 double:1.0532935094E-314;
        r2 = r2.getString(r4);
        r4 = "context.getString(R.string.snap_crop_tooltip)";
        goto L_0x017f;
    L_0x00c5:
        r2 = r0.b;
        if (r2 != 0) goto L_0x00cc;
    L_0x00c9:
        defpackage.akcr.a(r6);
    L_0x00cc:
        r4 = 2131886224; // 0x7f120090 float:1.940702E38 double:1.053291744E-314;
        r2 = r2.getString(r4);
        r4 = "context.getString(R.string.animated_sticker_intro)";
        goto L_0x017f;
    L_0x00d7:
        r2 = r0.b;
        if (r2 != 0) goto L_0x00de;
    L_0x00db:
        defpackage.akcr.a(r6);
    L_0x00de:
        r4 = 2131890283; // 0x7f12106b float:1.9415253E38 double:1.0532937495E-314;
        r2 = r2.getString(r4);
        r4 = "context.getString(R.stri…unlockable_sticker_intro)";
        goto L_0x017f;
    L_0x00e9:
        r2 = r0.b;
        if (r2 != 0) goto L_0x00f0;
    L_0x00ed:
        defpackage.akcr.a(r6);
    L_0x00f0:
        r4 = 2131889952; // 0x7f120f20 float:1.9414582E38 double:1.053293586E-314;
        r2 = r2.getString(r4);
        r4 = "context.getString(R.stri…ker_picker_hometab_intro)";
        goto L_0x017f;
    L_0x00fb:
        r2 = new uam;
        r6 = r17.c(r18);
        r7 = r0.d;
        if (r7 != 0) goto L_0x0108;
    L_0x0105:
        defpackage.akcr.a(r5);
    L_0x0108:
        r8 = 0;
        r9 = 0;
        r10 = 1;
        r11 = com.snapchat.android.framework.ui.views.Tooltip.a.POINTER_DOWN;
        r12 = 1200; // 0x4b0 float:1.682E-42 double:5.93E-321;
        r14 = 0;
        r4 = r2;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r13 = r14;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13);
        goto L_0x01be;
    L_0x011e:
        r2 = new uam;
        r7 = r17.c(r18);
        r8 = r0.d;
        if (r8 != 0) goto L_0x012b;
    L_0x0128:
        defpackage.akcr.a(r5);
    L_0x012b:
        r4 = r0.b;
        if (r4 != 0) goto L_0x0132;
    L_0x012f:
        defpackage.akcr.a(r6);
    L_0x0132:
        r5 = 2131888897; // 0x7f120b01 float:1.9412442E38 double:1.053293065E-314;
        r9 = r4.getString(r5);
        r10 = 1;
        r11 = 2;
        r12 = com.snapchat.android.framework.ui.views.Tooltip.a.MOVE_VERTICAL_TO_FIT;
        r13 = -1;
        r15 = 0;
        r4 = r2;
        r5 = r7;
        r6 = r8;
        r7 = r9;
        r8 = r10;
        r9 = r11;
        r10 = r12;
        r11 = r13;
        r13 = r15;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13);
        goto L_0x01be;
    L_0x014d:
        r2 = new uam;
        r6 = r17.c(r18);
        r7 = r0.d;
        if (r7 != 0) goto L_0x015a;
    L_0x0157:
        defpackage.akcr.a(r5);
    L_0x015a:
        r8 = 0;
        r9 = 1;
        r10 = 2;
        r11 = com.snapchat.android.framework.ui.views.Tooltip.a.MOVE_VERTICAL_TO_FIT;
        r12 = -1;
        r14 = 0;
        r4 = r2;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r13 = r14;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13);
        goto L_0x01be;
    L_0x016f:
        r2 = r0.b;
        if (r2 != 0) goto L_0x0176;
    L_0x0173:
        defpackage.akcr.a(r6);
    L_0x0176:
        r4 = 2131887011; // 0x7f1203a3 float:1.9408617E38 double:1.053292133E-314;
        r2 = r2.getString(r4);
        r4 = "context.getString(R.stri…stom_stickers_v2_tooltip)";
    L_0x017f:
        defpackage.akcr.a(r2, r4);
        r2 = r0.a(r1, r2, 2, com.snapchat.android.framework.ui.views.Tooltip.a.MOVE_VERTICAL_TO_FIT);
        goto L_0x01be;
    L_0x0187:
        r2 = r0.b;
        if (r2 != 0) goto L_0x018e;
    L_0x018b:
        defpackage.akcr.a(r6);
    L_0x018e:
        r5 = 2131889822; // 0x7f120e9e float:1.9414318E38 double:1.053293522E-314;
        r2 = r2.getString(r5);
        r5 = "context.getString(R.stri…tools_onboarding_tooltip)";
        defpackage.akcr.a(r2, r5);
        r5 = com.snapchat.android.framework.ui.views.Tooltip.a.MOVE_VERTICAL_TO_FIT;
        r2 = r0.a(r1, r2, r4, r5);
        goto L_0x01be;
    L_0x01a1:
        r2 = new ual;
        r4 = r0.d;
        if (r4 != 0) goto L_0x01aa;
    L_0x01a7:
        defpackage.akcr.a(r5);
    L_0x01aa:
        r5 = 2131430606; // 0x7f0b0cce float:1.8482918E38 double:1.053066639E-314;
        r6 = 2131430607; // 0x7f0b0ccf float:1.848292E38 double:1.0530666394E-314;
        r2.<init>(r4, r5, r6);
        goto L_0x01be;
    L_0x01b4:
        r2 = 0;
        r2 = r0.a(r2);
        goto L_0x01be;
    L_0x01ba:
        r2 = r0.a(r4);
    L_0x01be:
        r2 = (defpackage.uai) r2;
    L_0x01c0:
        if (r2 == 0) goto L_0x01ca;
    L_0x01c2:
        r3 = r0.k;
        r3 = (java.util.Map) r3;
        r3.put(r1, r2);
        return r2;
    L_0x01ca:
        r2 = r3;
    L_0x01cb:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uat.d(uaj):uai");
    }

    public final void a(uaf uaf) {
        akcr.b(uaf, "t");
        Object values = this.k.values();
        akcr.a(values, "tooltipControllers.values");
        for (uai b : (Iterable) values) {
            b.b(false);
        }
    }

    public final void a(uag uag) {
        akcr.b(uag, "t");
        if (uag.a != uaj.UNDEFINED) {
            uai d = d(uag.a);
            if (d != null) {
                d.b(true);
            }
        }
    }

    public final void a(uaj uaj) {
        akcr.b(uaj, "tooltipType");
        if (uaj != uaj.UNDEFINED) {
            uai d = d(uaj);
            if (d != null && d.a()) {
                b(uaj);
            }
        }
    }

    public final void a(uak uak) {
        akcr.b(uak, "t");
        if (uak.a != uaj.UNDEFINED) {
            uai d = d(uak.a);
            if (d != null) {
                View view = uak.c;
                if (view != null) {
                    d.a(view);
                }
                uai.a aVar = uak.d;
                if (aVar != null) {
                    d.a(aVar);
                }
                if (!(uak.e && d.a())) {
                    d.a(uak.b);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(uaj uaj) {
        this.l.a(ajcx.a((ajev) new l(this, uaj)).b((ajdw) a().f()).e());
    }

    /* Access modifiers changed, original: final */
    public final View c(uaj uaj) {
        if (this.q.get(uaj) == null) {
            return null;
        }
        uan uan = this.p;
        Object obj = this.q.get(uaj);
        if (obj == null) {
            akcr.a();
        }
        return uan.a((String) obj);
    }

    public final ajej start() {
        this.l.a(this.o.a((ajdw) a().l()).f((ajfb) new c(this)));
        this.l.a(ajdx.c((Callable) new d(this)).b((ajdw) a().f()).a((ajdw) a().l()).a((ajfb) new e(this), (ajfb) f.a));
        this.l.a(this.n.a((ajdw) a().l()).f((ajfb) new g(this)));
        return this.l;
    }
}
