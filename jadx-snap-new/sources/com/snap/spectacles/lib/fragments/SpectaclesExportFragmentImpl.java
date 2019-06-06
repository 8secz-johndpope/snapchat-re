package com.snap.spectacles.lib.fragments;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import android.widget.Toast;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.imageloading.view.SnapImageView;
import com.snap.spectacles.api.SpectaclesExportFragment;
import com.snap.spectacles.lib.fragments.export.SpectaclesExportFormatLabelsView;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesExportPresenter;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesExportPresenter.k;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesExportPresenter.l;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesExportPresenter.m;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesExportPresenter.n;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.view.button.ScButton;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.abyi;
import defpackage.abyp;
import defpackage.achb;
import defpackage.acih;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajvv;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxk;
import defpackage.ajym;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.fth;
import defpackage.tnj;
import defpackage.vjm;
import defpackage.xaf;
import defpackage.xag;
import defpackage.xai;
import defpackage.xjd;
import defpackage.xmb;
import defpackage.xmc;
import defpackage.xmd;
import defpackage.xmf;
import defpackage.xms;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class SpectaclesExportFragmentImpl extends SpectaclesExportFragment implements xmf {
    public SpectaclesExportPresenter e;
    public achb<zjm, zjk> f;
    public zgb g;
    public tnj h;
    TextView i;
    SnapImageView j;
    ViewPager k;
    xmd l;
    private final ajxe m = ajxh.a(new h(this));
    private final ajxe n = ajxh.a(b.a);
    private TextView o;
    private SpectaclesExportFormatLabelsView p;
    private ScButton q;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class d implements OnClickListener {
        private /* synthetic */ SpectaclesExportFragmentImpl a;

        d(SpectaclesExportFragmentImpl spectaclesExportFragmentImpl) {
            this.a = spectaclesExportFragmentImpl;
        }

        public final void onClick(View view) {
            SpectaclesExportPresenter h = this.a.h();
            h.a(h, com.snap.spectacles.lib.fragments.presenters.SpectaclesExportPresenter.b.a);
            h.b(h, com.snap.spectacles.lib.fragments.presenters.SpectaclesExportPresenter.c.a);
        }
    }

    static final class e implements OnClickListener {
        private /* synthetic */ SpectaclesExportFragmentImpl a;

        e(SpectaclesExportFragmentImpl spectaclesExportFragmentImpl) {
            this.a = spectaclesExportFragmentImpl;
        }

        public final void onClick(View view) {
            xmd xmd = this.a.l;
            if (xmd != null) {
                Object xag;
                SpectaclesExportFragmentImpl spectaclesExportFragmentImpl = this.a;
                vjm vjm = ((xmc) xmd.a.get(SpectaclesExportFragmentImpl.a(spectaclesExportFragmentImpl).b())).a;
                tnj tnj = spectaclesExportFragmentImpl.h;
                if (tnj == null) {
                    akcr.a("preferences");
                }
                ajej b = tnj.b().a((fth) xjd.SPECTACLES_LAST_EXPORT_TYPE, (Enum) vjm).b();
                akcr.a((Object) b, "preferences.edit()\n     …\n                .apply()");
                ajvv.a(b, spectaclesExportFragmentImpl.d);
                SpectaclesExportPresenter spectaclesExportPresenter = spectaclesExportFragmentImpl.e;
                if (spectaclesExportPresenter == null) {
                    akcr.a("exportPresenter");
                }
                akcr.b(vjm, "selectedOption");
                spectaclesExportPresenter.a(spectaclesExportPresenter, new com.snap.spectacles.lib.fragments.presenters.SpectaclesExportPresenter.i(vjm));
                String str = "request";
                switch (xms.b[vjm.ordinal()]) {
                    case 1:
                        xag xag2 = spectaclesExportPresenter.a;
                        if (xag2 == null) {
                            akcr.a(str);
                        }
                        Collection arrayList = new ArrayList();
                        for (Object next : xag2.a) {
                            Object obj = ((abyi) next).e.a;
                            akcr.a(obj, "this.mediaType");
                            if (abyp.j(obj.intValue())) {
                                arrayList.add(next);
                            }
                        }
                        List list = (List) arrayList;
                        xag xag3 = spectaclesExportPresenter.a;
                        if (xag3 == null) {
                            akcr.a(str);
                        }
                        xag = new xag(list, xag3.b);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        xag = spectaclesExportPresenter.a;
                        if (xag == null) {
                            akcr.a(str);
                            break;
                        }
                        break;
                    case 8:
                        throw new IllegalStateException("export type not supported ".concat(String.valueOf(vjm)));
                    default:
                        throw new ajxk();
                }
                achb achb = spectaclesExportFragmentImpl.f;
                if (achb == null) {
                    akcr.a("navigationHost");
                }
                achb.a(true);
                akbw akbw = spectaclesExportFragmentImpl.a;
                if (akbw != null) {
                    akbw.invoke(xag, vjm);
                }
            }
        }
    }

    public static final class j implements OnGlobalLayoutListener {
        private /* synthetic */ SpectaclesExportFragmentImpl a;
        private /* synthetic */ List b;
        private /* synthetic */ vjm c;

        j(SpectaclesExportFragmentImpl spectaclesExportFragmentImpl, List list, vjm vjm) {
            this.a = spectaclesExportFragmentImpl;
            this.b = list;
            this.c = vjm;
        }

        public final void onGlobalLayout() {
            SpectaclesExportFragmentImpl.a(this.a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int i = 0;
            for (Object next : this.b) {
                int i2 = i + 1;
                if (i < 0) {
                    ajym.a();
                }
                if (((xmc) next).a == this.c) {
                    SpectaclesExportFragmentImpl.a(this.a).a(i, false);
                    if (i == 0) {
                        SpectaclesExportFragmentImpl.d(this.a).a(i);
                    }
                    SpectaclesExportFragmentImpl spectaclesExportFragmentImpl = this.a;
                    AnimatorSet animatorSet = new AnimatorSet();
                    ViewPager viewPager = spectaclesExportFragmentImpl.k;
                    String str = "spectaclesExportViewPager";
                    if (viewPager == null) {
                        akcr.a(str);
                    }
                    View view = viewPager;
                    r7 = new PropertyValuesHolder[3];
                    r7[0] = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f});
                    r7[1] = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f});
                    r7[2] = PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f});
                    Object duration = ObjectAnimator.ofPropertyValuesHolder(view, r7).setDuration(300);
                    akcr.a(duration, "fadeInAndScale");
                    duration.setInterpolator(spectaclesExportFragmentImpl.i());
                    duration.setStartDelay(150);
                    ViewPager viewPager2 = spectaclesExportFragmentImpl.k;
                    if (viewPager2 == null) {
                        akcr.a(str);
                    }
                    View view2 = viewPager2;
                    PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
                    propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat("translationX", new float[]{MapboxConstants.MINIMUM_ZOOM});
                    Object duration2 = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr).setDuration(300);
                    akcr.a(duration2, "translateX");
                    duration2.setInterpolator(spectaclesExportFragmentImpl.i());
                    animatorSet.playTogether(new Animator[]{(Animator) duration2, (Animator) duration});
                    animatorSet.start();
                    spectaclesExportFragmentImpl = this.a;
                    SnapImageView snapImageView = spectaclesExportFragmentImpl.j;
                    if (snapImageView == null) {
                        akcr.a("spectaclesBackImageView");
                    }
                    snapImageView.animate().alpha(1.0f).translationX(MapboxConstants.MINIMUM_ZOOM).setDuration(300).setInterpolator(spectaclesExportFragmentImpl.i()).start();
                    spectaclesExportFragmentImpl = this.a;
                    SpectaclesExportFragmentImpl.c(spectaclesExportFragmentImpl).animate().alpha(1.0f).translationX(MapboxConstants.MINIMUM_ZOOM).setDuration(300).setInterpolator(spectaclesExportFragmentImpl.i()).start();
                    spectaclesExportFragmentImpl = this.a;
                    TextView textView = spectaclesExportFragmentImpl.i;
                    if (textView == null) {
                        akcr.a("spectaclesTitleTextView");
                    }
                    textView.animate().alpha(1.0f).translationX(MapboxConstants.MINIMUM_ZOOM).setDuration(300).setInterpolator(spectaclesExportFragmentImpl.i()).start();
                    spectaclesExportFragmentImpl = this.a;
                    SpectaclesExportFragmentImpl.b(spectaclesExportFragmentImpl).animate().alpha(1.0f).translationX(MapboxConstants.MINIMUM_ZOOM).setDuration(300).setInterpolator(spectaclesExportFragmentImpl.i()).start();
                }
                i = i2;
            }
        }
    }

    static final class c<T> implements ajfb<Integer> {
        private /* synthetic */ SpectaclesExportFragmentImpl a;

        c(SpectaclesExportFragmentImpl spectaclesExportFragmentImpl) {
            this.a = spectaclesExportFragmentImpl;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            ViewPager a = SpectaclesExportFragmentImpl.a(this.a);
            akcr.a(obj, "selectedIndex");
            a.b(obj.intValue());
        }
    }

    static final class f<T> implements ajfb<xag> {
        private /* synthetic */ SpectaclesExportFragmentImpl a;

        f(SpectaclesExportFragmentImpl spectaclesExportFragmentImpl) {
            this.a = spectaclesExportFragmentImpl;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (xag) obj;
            String str = "request";
            if (obj.a == null) {
                SpectaclesExportFragmentImpl spectaclesExportFragmentImpl = this.a;
                akcr.a(obj, str);
                spectaclesExportFragmentImpl.a(true, (xag) obj);
                return;
            }
            SpectaclesExportFragmentImpl.b(this.a).setText(this.a.getResources().getQuantityString(R.plurals.spectacles_export_customization_description, obj.a.size()));
            SpectaclesExportPresenter h = this.a.h();
            Context context = this.a.getContext();
            akcr.a(obj, str);
            akcr.b(context, "context");
            akcr.b(obj, "exportRequest");
            h.a = obj;
            h.a(h, com.snap.spectacles.lib.fragments.presenters.SpectaclesExportPresenter.j.a);
            xag xag = h.a;
            if (xag == null) {
                akcr.a(str);
            }
            ajej c = ajdp.b(xag.a.get(0)).k((ajfc) new k(h)).b((ajdw) h.a().f()).e().a((ajdw) h.a().i()).a((ajdw) h.a().b()).f(new l(h, context)).a((ajdw) h.a().i()).a((ajfc) new m(h)).a((ajdw) h.a().l()).c((ajfb) new n(h)).b((ajdw) h.a().h()).c();
            akcr.a((Object) c, "Observable.just(request.…             .subscribe()");
            ajvv.a(c, h.d);
            if (obj.b) {
                SpectaclesExportFragmentImpl.c(this.a).setText(this.a.getContext().getString(R.string.spectacles_export_format_export_other_apps_button));
            } else {
                SpectaclesExportFragmentImpl.c(this.a).setText(this.a.getContext().getString(R.string.spectacles_export_format_save_button));
            }
        }
    }

    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class i implements android.support.v4.view.ViewPager.e {
        private /* synthetic */ SpectaclesExportFragmentImpl a;

        i(SpectaclesExportFragmentImpl spectaclesExportFragmentImpl) {
            this.a = spectaclesExportFragmentImpl;
        }

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            SpectaclesExportFragmentImpl.d(this.a).a(i);
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

    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ SpectaclesExportFragmentImpl a;

        h(SpectaclesExportFragmentImpl spectaclesExportFragmentImpl) {
            this.a = spectaclesExportFragmentImpl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.a.g == null) {
                akcr.a("schedulersProvider");
            }
            return zgb.a(xai.f.callsite("SpectaclesExportFragmentImpl"));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SpectaclesExportFragmentImpl.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(SpectaclesExportFragmentImpl.class), "decelerateInterpolator", "getDecelerateInterpolator()Landroid/view/animation/DecelerateInterpolator;")};
        a aVar = new a();
    }

    public static final /* synthetic */ TextView b(SpectaclesExportFragmentImpl spectaclesExportFragmentImpl) {
        TextView textView = spectaclesExportFragmentImpl.o;
        if (textView == null) {
            akcr.a("spectaclesDescriptionTextView");
        }
        return textView;
    }

    public static final /* synthetic */ ScButton c(SpectaclesExportFragmentImpl spectaclesExportFragmentImpl) {
        ScButton scButton = spectaclesExportFragmentImpl.q;
        if (scButton == null) {
            akcr.a("spectaclesExportSaveButton");
        }
        return scButton;
    }

    public static final /* synthetic */ SpectaclesExportFormatLabelsView d(SpectaclesExportFragmentImpl spectaclesExportFragmentImpl) {
        SpectaclesExportFormatLabelsView spectaclesExportFormatLabelsView = spectaclesExportFragmentImpl.p;
        if (spectaclesExportFormatLabelsView == null) {
            akcr.a("spectaclesExportLabelsView");
        }
        return spectaclesExportFormatLabelsView;
    }

    public final void a(acih acih) {
        super.a(acih);
        if (acih instanceof xaf) {
            ScopedFragment.a((ScopedFragment) this, ((xaf) acih).a.b((ajdw) ((zfw) this.m.b()).l()).a((ajfb) new f(this), (ajfb) g.a), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x00ff in {2, 5, 8, 16, 23, 24, 26, 28, 31, 33, 35} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(java.util.List<defpackage.xmc> r13, defpackage.vjm r14) {
        /*
        r12 = this;
        r0 = "exportViewDataList";
        defpackage.akcr.b(r13, r0);
        r0 = "lastExportType";
        defpackage.akcr.b(r14, r0);
        r0 = new xmd;
        r0.<init>(r13);
        r12.l = r0;
        r0 = r12.k;
        r1 = "spectaclesExportViewPager";
        if (r0 != 0) goto L_0x001a;
        defpackage.akcr.a(r1);
        r2 = r12.l;
        r2 = (defpackage.jz) r2;
        r0.a(r2);
        r0 = r12.k;
        if (r0 != 0) goto L_0x0028;
        defpackage.akcr.a(r1);
        r2 = new com.snap.spectacles.lib.fragments.SpectaclesExportFragmentImpl$i;
        r2.<init>(r12);
        r2 = (android.support.v4.view.ViewPager.e) r2;
        r0.a(r2);
        r0 = r12.p;
        if (r0 != 0) goto L_0x003b;
        r2 = "spectaclesExportLabelsView";
        defpackage.akcr.a(r2);
        r2 = "exportViewData";
        defpackage.akcr.b(r13, r2);
        r2 = r0.getContext();
        r3 = "layout_inflater";
        r2 = r2.getSystemService(r3);
        if (r2 == 0) goto L_0x00f7;
        r2 = (android.view.LayoutInflater) r2;
        r0.d = r13;
        r3 = r13;
        r3 = (java.lang.Iterable) r3;
        r3 = r3.iterator();
        r4 = 0;
        r5 = 0;
        r6 = r3.hasNext();
        r7 = 1;
        if (r6 == 0) goto L_0x00d2;
        r6 = r3.next();
        r8 = r5 + 1;
        if (r5 >= 0) goto L_0x006b;
        defpackage.ajym.a();
        r6 = (defpackage.xmc) r6;
        r9 = 2131559397; // 0x7f0d03e5 float:1.8744137E38 double:1.05313027E-314;
        r10 = 0;
        r9 = r2.inflate(r9, r10);
        if (r9 == 0) goto L_0x00ca;
        r9 = (com.snap.ui.view.SnapFontTextView) r9;
        r6 = r6.c;
        r10 = java.util.Locale.US;
        r11 = "Locale.US";
        defpackage.akcr.a(r10, r11);
        if (r6 == 0) goto L_0x00c2;
        r6 = r6.toUpperCase(r10);
        r10 = "(this as java.lang.String).toUpperCase(locale)";
        defpackage.akcr.a(r6, r10);
        r6 = (java.lang.CharSequence) r6;
        r9.setText(r6);
        r6 = -1;
        r9.setTextColor(r6);
        r6 = r0.b;
        r9.setPadding(r4, r4, r6, r4);
        r6 = r0.e;
        if (r5 == r6) goto L_0x00a5;
        r6 = 1051931443; // 0x3eb33333 float:0.35 double:5.19723188E-315;
        r9.setAlpha(r6);
        r9.setClickable(r7);
        r6 = new com.snap.spectacles.lib.fragments.export.SpectaclesExportFormatLabelsView$c;
        r6.<init>(r5, r0, r2);
        r6 = (android.view.View.OnClickListener) r6;
        r9.setOnClickListener(r6);
        r6 = r0.a;
        r5 = java.lang.Integer.valueOf(r5);
        r6.put(r5, r9);
        r9 = (android.view.View) r9;
        r0.addView(r9);
        r5 = r8;
        goto L_0x0059;
        r13 = new ajxt;
        r14 = "null cannot be cast to non-null type java.lang.String";
        r13.<init>(r14);
        throw r13;
        r13 = new ajxt;
        r14 = "null cannot be cast to non-null type com.snap.ui.view.SnapFontTextView";
        r13.<init>(r14);
        throw r13;
        r2 = r0.getLayoutParams();
        r0 = r0.getContext();
        r0 = defpackage.abtp.a(r0);
        r0 = r0 << r7;
        r2.width = r0;
        r0 = r12.k;
        if (r0 != 0) goto L_0x00e8;
        defpackage.akcr.a(r1);
        r0 = r0.getViewTreeObserver();
        r1 = new com.snap.spectacles.lib.fragments.SpectaclesExportFragmentImpl$j;
        r1.<init>(r12, r13, r14);
        r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1;
        r0.addOnGlobalLayoutListener(r1);
        return;
        r13 = new ajxt;
        r14 = "null cannot be cast to non-null type android.view.LayoutInflater";
        r13.<init>(r14);
        throw r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesExportFragmentImpl.a(java.util.List, vjm):void");
    }

    public final void a(boolean z, xag xag) {
        akcr.b(xag, "request");
        if (z) {
            Toast.makeText(getContext().getApplicationContext(), R.string.spectacles_export_customization_error, 0).show();
        }
        achb achb = this.f;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        achb.a(true);
        akbl akbl = this.b;
        if (akbl != null) {
            akbl.invoke(xag);
        }
    }

    public final SpectaclesExportPresenter h() {
        SpectaclesExportPresenter spectaclesExportPresenter = this.e;
        if (spectaclesExportPresenter == null) {
            akcr.a("exportPresenter");
        }
        return spectaclesExportPresenter;
    }

    /* Access modifiers changed, original: final */
    public final DecelerateInterpolator i() {
        return (DecelerateInterpolator) this.n.b();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        SpectaclesExportPresenter spectaclesExportPresenter = this.e;
        if (spectaclesExportPresenter == null) {
            akcr.a("exportPresenter");
        }
        spectaclesExportPresenter.takeTarget((xmf) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.spectacles_export_fragment, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.spectacles_export_format_selector_title);
        akcr.a(findViewById, "view.findViewById(R.id.s…rt_format_selector_title)");
        this.i = (TextView) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_export_format_selector_description);
        akcr.a(findViewById, "view.findViewById(R.id.s…mat_selector_description)");
        this.o = (TextView) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_export_format_cancel_button);
        akcr.a(findViewById, "view.findViewById(R.id.s…ort_format_cancel_button)");
        this.j = (SnapImageView) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_export_format_view_pager);
        akcr.a(findViewById, "view.findViewById(R.id.s…export_format_view_pager)");
        this.k = (ViewPager) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_export_format_label_container);
        akcr.a(findViewById, "view.findViewById(R.id.s…t_format_label_container)");
        this.p = (SpectaclesExportFormatLabelsView) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_export_format_save_button);
        akcr.a(findViewById, "view.findViewById(R.id.s…xport_format_save_button)");
        this.q = (ScButton) findViewById;
        ViewPager viewPager = this.k;
        String str = "spectaclesExportViewPager";
        if (viewPager == null) {
            akcr.a(str);
        }
        viewPager.c(vjm.values().length);
        viewPager = this.k;
        if (viewPager == null) {
            akcr.a(str);
        }
        viewPager.a((android.support.v4.view.ViewPager.f) new xmb());
        findViewById = abtp.f(getContext());
        ViewPager viewPager2 = this.k;
        if (viewPager2 == null) {
            akcr.a(str);
        }
        akcr.a(findViewById, "screenResolution");
        viewPager2.setTranslationX((float) findViewById.b());
        viewPager2 = this.k;
        if (viewPager2 == null) {
            akcr.a(str);
        }
        viewPager2.setScaleX(0.7f);
        viewPager2 = this.k;
        if (viewPager2 == null) {
            akcr.a(str);
        }
        viewPager2.setScaleY(0.7f);
        viewPager2 = this.k;
        if (viewPager2 == null) {
            akcr.a(str);
        }
        viewPager2.setAlpha(0.2f);
        SpectaclesExportFormatLabelsView spectaclesExportFormatLabelsView = this.p;
        String str2 = "spectaclesExportLabelsView";
        if (spectaclesExportFormatLabelsView == null) {
            akcr.a(str2);
        }
        spectaclesExportFormatLabelsView.setTranslationX((float) findViewById.b());
        SnapImageView snapImageView = this.j;
        str = "spectaclesBackImageView";
        if (snapImageView == null) {
            akcr.a(str);
        }
        snapImageView.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        ScButton scButton = this.q;
        String str3 = "spectaclesExportSaveButton";
        if (scButton == null) {
            akcr.a(str3);
        }
        scButton.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        TextView textView = this.i;
        if (textView == null) {
            akcr.a("spectaclesTitleTextView");
        }
        textView.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        textView = this.o;
        if (textView == null) {
            akcr.a("spectaclesDescriptionTextView");
        }
        textView.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        SpectaclesExportFormatLabelsView spectaclesExportFormatLabelsView2 = this.p;
        if (spectaclesExportFormatLabelsView2 == null) {
            akcr.a(str2);
        }
        ajej f = spectaclesExportFormatLabelsView2.c.f((ajfb) new c(this));
        akcr.a((Object) f, "spectaclesExportLabelsVi…edIndex\n                }");
        ajvv.a(f, this.d);
        snapImageView = this.j;
        if (snapImageView == null) {
            akcr.a(str);
        }
        snapImageView.setOnClickListener(new d(this));
        scButton = this.q;
        if (scButton == null) {
            akcr.a(str3);
        }
        scButton.setOnClickListener(new e(this));
        return inflate;
    }

    public final void onDetach() {
        SpectaclesExportPresenter spectaclesExportPresenter = this.e;
        if (spectaclesExportPresenter == null) {
            akcr.a("exportPresenter");
        }
        spectaclesExportPresenter.dropTarget();
        super.onDetach();
    }
}
