package com.snap.spectacles.lib.fragments;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.spectacles.api.SpectaclesFragment;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesManageSaveToPresenter;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesManageSaveToPresenter.h;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesManageSaveToPresenter.i;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesManageSaveToPresenter.n;
import com.snapchat.android.R;
import defpackage.abdv;
import defpackage.acgu;
import defpackage.achb;
import defpackage.achd;
import defpackage.achg;
import defpackage.achi;
import defpackage.acis;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.vjm;
import defpackage.xai;
import defpackage.xmh;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

public final class SpectaclesManageSaveToFragment extends SpectaclesFragment implements xmh {
    static final zjm e = new zjm(xai.f, "SpectaclesManageSaveToFragment", false, false, false, false, null, false, false, false, false, null, 4092);
    public static final acgu<zjm> f;
    public static final acgu<zjm> g;
    public achb<zjm, zjk> a;
    public SpectaclesManageSaveToPresenter b;
    private CheckBox h;
    private CheckBox i;
    private LinearLayout j;
    private SpectaclesSaveToExportFormatView k;
    private SpectaclesSaveToExportFormatView l;
    private SpectaclesSaveToExportFormatView m;
    private SpectaclesSaveToExportFormatView n;
    private SpectaclesSaveToExportFormatView o;
    private SpectaclesSaveToExportFormatView p;
    private final ajei q = new ajei();
    private Map<vjm, SpectaclesSaveToExportFormatView> r = new LinkedHashMap();
    private final ajxe s = ajxh.a(b.a);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class e implements OnClickListener {
        private /* synthetic */ SpectaclesManageSaveToFragment a;

        e(SpectaclesManageSaveToFragment spectaclesManageSaveToFragment) {
            this.a = spectaclesManageSaveToFragment;
        }

        public final void onClick(View view) {
            this.a.h().a(abdv.AUTO_IMPORT_TO_MEMORIES);
            this.a.h().a(false);
        }
    }

    static final class f implements OnClickListener {
        private /* synthetic */ SpectaclesManageSaveToFragment a;

        f(SpectaclesManageSaveToFragment spectaclesManageSaveToFragment) {
            this.a = spectaclesManageSaveToFragment;
        }

        public final void onClick(View view) {
            this.a.h().a(abdv.AUTO_IMPORT_TO_MEMORIES_AND_CAMERA_ROLL);
            this.a.h().a(true);
        }
    }

    static final class g<T> implements ajfb<vjm> {
        private /* synthetic */ SpectaclesManageSaveToFragment a;

        g(SpectaclesManageSaveToFragment spectaclesManageSaveToFragment) {
            this.a = spectaclesManageSaveToFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (vjm) obj;
            SpectaclesManageSaveToPresenter h = this.a.h();
            akcr.a(obj, "it");
            akcr.b(obj, "exportType");
            ajej c = ajdx.c((Callable) new h(h, obj)).b((ajdw) h.c().i()).a((ajdw) h.c().l()).c((ajfb) new i(h)).c();
            akcr.a((Object) c, "Single.fromCallable {\n  …            }.subscribe()");
            ajvv.a(c, h.c);
        }
    }

    static final class b extends akcs implements akbk<DecelerateInterpolator> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DecelerateInterpolator();
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(SpectaclesManageSaveToFragment.class), "decelerateInterpolatorLazy", "getDecelerateInterpolatorLazy()Landroid/view/animation/DecelerateInterpolator;");
        a aVar = new a();
        acgu a = acgu.a(acis.b, (achg) e, true);
        f = a;
        g = a.j();
    }

    public final void a(String str) {
        akcr.b(str, "exportFormatName");
        zjm zjm = new zjm(xai.f, "spectacles_export_format_alert_dialog", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str2 = "navigationHost";
        if (achb == null) {
            akcr.a(str2);
        }
        defpackage.zgy.a a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.spectacles_save_to_export_format_dialog_title);
        String string = getString(R.string.spectacles_save_to_export_format_dialog_description, string);
        akcr.a((Object) string, "getString(com.snap.spect…iption, exportFormatName)");
        zgy a2 = a.b(string).a((int) R.string.okay, (akbl) c.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str2);
        }
        achb2.a((achd) a2, a2.a, null);
    }

    public final void a(boolean z, vjm vjm, boolean z2) {
        CheckBox checkBox = this.h;
        if (checkBox == null) {
            akcr.a("saveToMemoriesCheckbox");
        }
        checkBox.setChecked(z ^ 1);
        checkBox = this.i;
        if (checkBox == null) {
            akcr.a("saveToMemoriesAndCameraRollCheckbox");
        }
        checkBox.setChecked(z);
        LinearLayout linearLayout = this.j;
        String str = "saveToExportFormatsContainer";
        if (linearLayout == null) {
            akcr.a(str);
        }
        linearLayout.setVisibility(0);
        linearLayout = this.j;
        if (linearLayout == null) {
            akcr.a(str);
        }
        linearLayout.animate().alpha(z ? 1.0f : MapboxConstants.MINIMUM_ZOOM).setDuration(z2 ? 300 : 0).setInterpolator((DecelerateInterpolator) this.s.b()).start();
        if (vjm != null) {
            for (Entry entry : this.r.entrySet()) {
                ((SpectaclesSaveToExportFormatView) entry.getValue()).a(((vjm) entry.getKey()) == vjm);
            }
        }
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter = this.b;
        if (spectaclesManageSaveToPresenter == null) {
            akcr.a("managePresenter");
        }
        ajej f = spectaclesManageSaveToPresenter.d().e().j().b((ajdw) spectaclesManageSaveToPresenter.c().f()).f((ajfb) new n(spectaclesManageSaveToPresenter));
        akcr.a((Object) f, "specsCoreComponent.event…      }\n                }");
        ajvv.a(f, spectaclesManageSaveToPresenter.d);
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter = this.b;
        if (spectaclesManageSaveToPresenter == null) {
            akcr.a("managePresenter");
        }
        spectaclesManageSaveToPresenter.d.a();
    }

    public final SpectaclesManageSaveToPresenter h() {
        SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter = this.b;
        if (spectaclesManageSaveToPresenter == null) {
            akcr.a("managePresenter");
        }
        return spectaclesManageSaveToPresenter;
    }

    public final void i() {
        zjm zjm = new zjm(xai.f, "spectacles_import_alert_dialog", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.spectacles_save_to_change_in_next_import_title).b((int) R.string.spectacles_save_to_change_in_next_import_description).a((int) R.string.okay, (akbl) d.a, true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a, a.a, null);
    }

    /* JADX WARNING: Missing block: B:6:0x001d, code skipped:
            if (r1 == null) goto L_0x001f;
     */
    public final void onAttach(android.content.Context r4) {
        /*
        r3 = this;
        r0 = "context";
        defpackage.akcr.b(r4, r0);
        super.onAttach(r4);
        r4 = r3.b;
        r0 = "managePresenter";
        if (r4 != 0) goto L_0x0011;
    L_0x000e:
        defpackage.akcr.a(r0);
    L_0x0011:
        r1 = r3.getArguments();
        if (r1 == 0) goto L_0x001f;
    L_0x0017:
        r2 = "ARG_KEY_DEVICE_SERIAL_NUMBER";
        r1 = r1.getString(r2);
        if (r1 != 0) goto L_0x0021;
    L_0x001f:
        r1 = "";
    L_0x0021:
        r2 = "<set-?>";
        defpackage.akcr.b(r1, r2);
        r4.a = r1;
        r4 = r3.b;
        if (r4 != 0) goto L_0x002f;
    L_0x002c:
        defpackage.akcr.a(r0);
    L_0x002f:
        r0 = r3;
        r0 = (defpackage.xmh) r0;
        r4.takeTarget(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesManageSaveToFragment.onAttach(android.content.Context):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:59:0x0181 in {20, 23, 26, 29, 32, 35, 39, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58} preds:[]
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
    public final android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
        r2 = this;
        r5 = "inflater";
        defpackage.akcr.b(r3, r5);
        r5 = 2131558985; // 0x7f0d0249 float:1.8743301E38 double:1.0531300666E-314;
        r0 = 0;
        r3 = r3.inflate(r5, r4, r0);
        r4 = 2131429906; // 0x7f0b0a12 float:1.8481498E38 double:1.053066293E-314;
        r4 = r3.findViewById(r4);
        r5 = "null cannot be cast to non-null type android.widget.CheckBox";
        if (r4 == 0) goto L_0x017b;
        r4 = (android.widget.CheckBox) r4;
        r2.h = r4;
        r4 = 2131429903; // 0x7f0b0a0f float:1.8481492E38 double:1.0530662916E-314;
        r4 = r3.findViewById(r4);
        if (r4 == 0) goto L_0x0175;
        r4 = (android.widget.CheckBox) r4;
        r2.i = r4;
        r4 = 2131430370; // 0x7f0b0be2 float:1.848244E38 double:1.0530665223E-314;
        r4 = r3.findViewById(r4);
        if (r4 == 0) goto L_0x016d;
        r4 = (android.widget.LinearLayout) r4;
        r2.j = r4;
        r4 = 2131429902; // 0x7f0b0a0e float:1.848149E38 double:1.053066291E-314;
        r4 = r3.findViewById(r4);
        r5 = "null cannot be cast to non-null type com.snap.spectacles.lib.fragments.SpectaclesSaveToExportFormatView";
        if (r4 == 0) goto L_0x0167;
        r4 = (com.snap.spectacles.lib.fragments.SpectaclesSaveToExportFormatView) r4;
        r2.k = r4;
        r4 = 2131429897; // 0x7f0b0a09 float:1.848148E38 double:1.0530662886E-314;
        r4 = r3.findViewById(r4);
        if (r4 == 0) goto L_0x0161;
        r4 = (com.snap.spectacles.lib.fragments.SpectaclesSaveToExportFormatView) r4;
        r2.l = r4;
        r4 = 2131429901; // 0x7f0b0a0d float:1.8481488E38 double:1.0530662906E-314;
        r4 = r3.findViewById(r4);
        if (r4 == 0) goto L_0x015b;
        r4 = (com.snap.spectacles.lib.fragments.SpectaclesSaveToExportFormatView) r4;
        r2.m = r4;
        r4 = 2131429899; // 0x7f0b0a0b float:1.8481484E38 double:1.0530662896E-314;
        r4 = r3.findViewById(r4);
        if (r4 == 0) goto L_0x0155;
        r4 = (com.snap.spectacles.lib.fragments.SpectaclesSaveToExportFormatView) r4;
        r2.n = r4;
        r4 = 2131429898; // 0x7f0b0a0a float:1.8481482E38 double:1.053066289E-314;
        r4 = r3.findViewById(r4);
        if (r4 == 0) goto L_0x014f;
        r4 = (com.snap.spectacles.lib.fragments.SpectaclesSaveToExportFormatView) r4;
        r2.o = r4;
        r4 = 2131429900; // 0x7f0b0a0c float:1.8481486E38 double:1.05306629E-314;
        r4 = r3.findViewById(r4);
        if (r4 == 0) goto L_0x0149;
        r4 = (com.snap.spectacles.lib.fragments.SpectaclesSaveToExportFormatView) r4;
        r2.p = r4;
        r4 = 2131429907; // 0x7f0b0a13 float:1.84815E38 double:1.0530662936E-314;
        r4 = r3.findViewById(r4);
        r5 = "view.findViewById(R.id.save_to_memories_container)";
        defpackage.akcr.a(r4, r5);
        r5 = 2131429904; // 0x7f0b0a10 float:1.8481494E38 double:1.053066292E-314;
        r5 = r3.findViewById(r5);
        r0 = "view.findViewById(R.id.s…nd_camera_roll_container)";
        defpackage.akcr.a(r5, r0);
        r0 = new com.snap.spectacles.lib.fragments.SpectaclesManageSaveToFragment$e;
        r0.<init>(r2);
        r0 = (android.view.View.OnClickListener) r0;
        r4.setOnClickListener(r0);
        r4 = new com.snap.spectacles.lib.fragments.SpectaclesManageSaveToFragment$f;
        r4.<init>(r2);
        r4 = (android.view.View.OnClickListener) r4;
        r5.setOnClickListener(r4);
        r4 = r2.r;
        r5 = defpackage.vjm.SPECTACLES_CIRCLE_WHITE;
        r0 = r2.k;
        if (r0 != 0) goto L_0x00bf;
        r1 = "saveToExportFormatWhiteBGView";
        defpackage.akcr.a(r1);
        r4.put(r5, r0);
        r4 = r2.r;
        r5 = defpackage.vjm.SPECTACLES_CIRCLE_BLACK;
        r0 = r2.l;
        if (r0 != 0) goto L_0x00cf;
        r1 = "saveToExportFormatBlackBGView";
        defpackage.akcr.a(r1);
        r4.put(r5, r0);
        r4 = r2.r;
        r5 = defpackage.vjm.SPECTACLES_SQUARE;
        r0 = r2.m;
        if (r0 != 0) goto L_0x00df;
        r1 = "saveToExportFormatSquareView";
        defpackage.akcr.a(r1);
        r4.put(r5, r0);
        r4 = r2.r;
        r5 = defpackage.vjm.SPECTACLES_HORIZONTAL_4_3;
        r0 = r2.n;
        if (r0 != 0) goto L_0x00ef;
        r1 = "saveToExportFormatHorizontalView";
        defpackage.akcr.a(r1);
        r4.put(r5, r0);
        r4 = r2.r;
        r5 = defpackage.vjm.SPECTACLES_HORIZONTAL_16_9;
        r0 = r2.o;
        if (r0 != 0) goto L_0x00ff;
        r1 = "saveToExportFormatHorizontalWideView";
        defpackage.akcr.a(r1);
        r4.put(r5, r0);
        r4 = r2.r;
        r5 = defpackage.vjm.SPECTACLES_PORTRAIT_9_16;
        r0 = r2.p;
        if (r0 != 0) goto L_0x010f;
        r1 = "saveToExportFormatPortraitView";
        defpackage.akcr.a(r1);
        r4.put(r5, r0);
        r4 = r2.r;
        r4 = r4.entrySet();
        r4 = r4.iterator();
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0148;
        r5 = r4.next();
        r5 = (java.util.Map.Entry) r5;
        r5 = r5.getValue();
        r5 = (com.snap.spectacles.lib.fragments.SpectaclesSaveToExportFormatView) r5;
        r5 = r5.d;
        r5 = (defpackage.ajdp) r5;
        r0 = new com.snap.spectacles.lib.fragments.SpectaclesManageSaveToFragment$g;
        r0.<init>(r2);
        r0 = (defpackage.ajfb) r0;
        r5 = r5.f(r0);
        r0 = "spectaclesSaveToExportFo…it)\n                    }";
        defpackage.akcr.a(r5, r0);
        r0 = r2.q;
        defpackage.ajvv.a(r5, r0);
        goto L_0x011c;
        return r3;
        r3 = new ajxt;
        r3.<init>(r5);
        throw r3;
        r3 = new ajxt;
        r3.<init>(r5);
        throw r3;
        r3 = new ajxt;
        r3.<init>(r5);
        throw r3;
        r3 = new ajxt;
        r3.<init>(r5);
        throw r3;
        r3 = new ajxt;
        r3.<init>(r5);
        throw r3;
        r3 = new ajxt;
        r3.<init>(r5);
        throw r3;
        r3 = new ajxt;
        r4 = "null cannot be cast to non-null type android.widget.LinearLayout";
        r3.<init>(r4);
        throw r3;
        r3 = new ajxt;
        r3.<init>(r5);
        throw r3;
        r3 = new ajxt;
        r3.<init>(r5);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesManageSaveToFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        this.q.a();
        SpectaclesManageSaveToPresenter spectaclesManageSaveToPresenter = this.b;
        if (spectaclesManageSaveToPresenter == null) {
            akcr.a("managePresenter");
        }
        spectaclesManageSaveToPresenter.dropTarget();
        super.onDetach();
    }
}
