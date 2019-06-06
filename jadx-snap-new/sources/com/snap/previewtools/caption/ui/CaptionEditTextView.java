package com.snap.previewtools.caption.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abpf;
import defpackage.abqc;
import defpackage.abtp;
import defpackage.abuh;
import defpackage.acbd;
import defpackage.acbe;
import defpackage.ajwo;
import defpackage.ajws;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxt;
import defpackage.ajyi;
import defpackage.ajyu;
import defpackage.ajyw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.fn;
import defpackage.fo;
import defpackage.fp;
import defpackage.qan;
import defpackage.ueb;
import defpackage.uec;
import defpackage.ufl;
import defpackage.ufn;
import defpackage.ufo;
import defpackage.ufy;
import defpackage.uga;
import defpackage.uge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public final class CaptionEditTextView extends AppCompatEditText implements acbd, ufn {
    private static final String[] ad = new String[]{qan.a, qan.b};
    private int[] A;
    private float[] B;
    private boolean C;
    private int D;
    private float E;
    private defpackage.ufg.f F;
    private defpackage.ufg.e G;
    private int H;
    private int I;
    private defpackage.ufg.d J;
    private List<Float> K;
    private final ajxe L;
    private defpackage.ufg.i M;
    private b N;
    private b O;
    private int P;
    private final ajxe Q;
    private final ajxe R;
    private int S;
    private final float T;
    private boolean U;
    private final ajxe V;
    private final ajxe W;
    boolean a;
    private final ajxe aa;
    private final ajxe ab;
    private boolean ac;
    float[] b;
    Shader c;
    public int d;
    public f e;
    public final ajwo<Integer> f;
    public final ajwo<Integer> g;
    public final ajwo<Integer> h;
    public final ajwo<Float> i;
    public final ajwo<Integer> j;
    public ajws<ajxm<Integer, Boolean>> k;
    public final ajwo<Float> l;
    public final float m;
    public float n;
    public float o;
    public boolean p;
    public boolean q;
    private final ajxe r;
    private final ajxe s;
    private boolean t;
    private float u;
    private int v;
    private defpackage.ufg.d w;
    private List<Float> x;
    private int[] y;
    private boolean z;

    /* renamed from: com.snap.previewtools.caption.ui.CaptionEditTextView$1 */
    static final class AnonymousClass1 implements OnLayoutChangeListener {
        private /* synthetic */ CaptionEditTextView a;

        AnonymousClass1(CaptionEditTextView captionEditTextView) {
            this.a = captionEditTextView;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.a.a && CaptionEditTextView.a(this.a).length > 1) {
                if (this.a.p) {
                    float f = MapboxConstants.MINIMUM_ZOOM;
                    if (this.a.getLayout() != null) {
                        Object layout = this.a.getLayout();
                        akcr.a(layout, Tags.LAYOUT);
                        f = (float) layout.getTopPadding();
                    }
                    CaptionEditTextView captionEditTextView = this.a;
                    captionEditTextView.c = new LinearGradient(MapboxConstants.MINIMUM_ZOOM, -f, MapboxConstants.MINIMUM_ZOOM, ((float) captionEditTextView.getLineHeight()) - f, CaptionEditTextView.a(this.a), this.a.b, TileMode.REPEAT);
                    return;
                }
                CaptionEditTextView captionEditTextView2 = this.a;
                captionEditTextView2.c = new LinearGradient(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) captionEditTextView2.getLineHeight(), CaptionEditTextView.a(this.a), null, TileMode.REPEAT);
            }
        }
    }

    /* renamed from: com.snap.previewtools.caption.ui.CaptionEditTextView$2 */
    public static final class AnonymousClass2 implements TextWatcher {
        private /* synthetic */ CaptionEditTextView a;

        AnonymousClass2(CaptionEditTextView captionEditTextView) {
            this.a = captionEditTextView;
        }

        public final void afterTextChanged(Editable editable) {
            this.a.h();
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public interface b {
        boolean a(MotionEvent motionEvent);
    }

    public static final class e {
        private e() {
        }

        public /* synthetic */ e(byte b) {
            this();
        }
    }

    static final class a implements b {
        private final abuh<View> a;

        public a(View view) {
            akcr.b(view, "view");
            this.a = new abuh(new uec(view));
        }

        public final boolean a(MotionEvent motionEvent) {
            akcr.b(motionEvent, "event");
            return this.a.a(motionEvent);
        }
    }

    static final class c implements b {
        int a;
        private final GestureDetector b;

        public static final class a extends SimpleOnGestureListener {
            final /* synthetic */ View a;
            private float b;
            private final ajxe c = ajxh.a(new a(this));
            private /* synthetic */ c d;

            static final class a extends akcs implements akbk<Integer> {
                private /* synthetic */ a a;

                a(a aVar) {
                    this.a = aVar;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    ViewParent parent = this.a.a.getParent();
                    if (parent != null) {
                        return Integer.valueOf(((View) parent).getHeight());
                    }
                    throw new ajxt("null cannot be cast to non-null type android.view.View");
                }
            }

            static {
                new aken[1][0] = new akdc(akde.a(a.class), "screenHeight", "getScreenHeight()I");
            }

            a(c cVar, View view) {
                this.d = cVar;
                this.a = view;
            }

            public final boolean onDown(MotionEvent motionEvent) {
                akcr.b(motionEvent, "e");
                this.b = this.a.getY() - motionEvent.getRawY();
                return true;
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                akcr.b(motionEvent, "e1");
                akcr.b(motionEvent2, "e2");
                this.a.setY(Math.max(MapboxConstants.MINIMUM_ZOOM, Math.min(motionEvent2.getRawY() + this.b, (float) ((((Number) this.c.b()).intValue() - this.a.getHeight()) - this.d.a))));
                return true;
            }
        }

        public c(View view) {
            akcr.b(view, "view");
            this.b = new GestureDetector(view.getContext(), new a(this, view));
        }

        public final boolean a(MotionEvent motionEvent) {
            akcr.b(motionEvent, "event");
            return this.b.onTouchEvent(motionEvent);
        }
    }

    static final class d implements b {
        final CaptionEditTextView a;
        private final GestureDetector b = new GestureDetector(this.a.getContext(), new a(this));

        public static final class a extends SimpleOnGestureListener {
            private /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            public final void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                this.a.a.g.a(Integer.valueOf(this.a.a.d));
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                this.a.a.f.a(Integer.valueOf(this.a.a.d));
                return true;
            }
        }

        public d(CaptionEditTextView captionEditTextView) {
            akcr.b(captionEditTextView, "view");
            this.a = captionEditTextView;
        }

        public final boolean a(MotionEvent motionEvent) {
            akcr.b(motionEvent, "event");
            if (motionEvent.getActionMasked() == 1) {
                this.a.h.a(Integer.valueOf(this.a.d));
            }
            return this.b.onTouchEvent(motionEvent);
        }
    }

    public static final class f implements b {
        public final ueb a;
        private final abuh<CaptionEditTextView> b = new abuh(this.a);

        public f(CaptionEditTextView captionEditTextView, float f) {
            akcr.b(captionEditTextView, "view");
            this.a = new ueb(captionEditTextView, f);
        }

        public final boolean a(MotionEvent motionEvent) {
            akcr.b(motionEvent, "event");
            return this.b.a(motionEvent);
        }
    }

    static final class o implements defpackage.fo.a {
        public static final o a = new o();

        o() {
        }

        public final boolean a(fp fpVar, int i) {
            return true;
        }
    }

    static final class g extends akcs implements akbk<AllCaps> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new AllCaps();
        }
    }

    static final class h extends akcs implements akbk<a> {
        private /* synthetic */ CaptionEditTextView a;

        h(CaptionEditTextView captionEditTextView) {
            this.a = captionEditTextView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a(this.a);
        }
    }

    static final class i extends akcs implements akbk<c> {
        private /* synthetic */ CaptionEditTextView a;

        i(CaptionEditTextView captionEditTextView) {
            this.a = captionEditTextView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new c(this.a);
        }
    }

    static final class j extends akcs implements akbk<d> {
        private /* synthetic */ CaptionEditTextView a;

        j(CaptionEditTextView captionEditTextView) {
            this.a = captionEditTextView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new d(this.a);
        }
    }

    static final class k extends akcs implements akbk<ufo> {
        private /* synthetic */ CaptionEditTextView a;

        k(CaptionEditTextView captionEditTextView) {
            this.a = captionEditTextView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ufo(this.a);
        }
    }

    static final class l extends akcs implements akbk<f> {
        private /* synthetic */ CaptionEditTextView a;

        l(CaptionEditTextView captionEditTextView) {
            this.a = captionEditTextView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            CaptionEditTextView captionEditTextView = this.a;
            Context context = captionEditTextView.getContext();
            akcr.a((Object) context, "context");
            return new f(captionEditTextView, defpackage.ugc.a.a(context, false));
        }
    }

    static final class m extends akcs implements akbk<Float> {
        private /* synthetic */ CaptionEditTextView a;

        m(CaptionEditTextView captionEditTextView) {
            this.a = captionEditTextView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object resources = this.a.getResources();
            akcr.a(resources, "resources");
            return Float.valueOf(TypedValue.applyDimension(1, 250.0f, resources.getDisplayMetrics()));
        }
    }

    static final class n extends akcs implements akbk<Float> {
        private /* synthetic */ CaptionEditTextView a;

        n(CaptionEditTextView captionEditTextView) {
            this.a = captionEditTextView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object resources = this.a.getResources();
            akcr.a(resources, "resources");
            return Float.valueOf(TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
    }

    static final class p extends akcs implements akbk<uga> {
        private /* synthetic */ CaptionEditTextView a;

        p(CaptionEditTextView captionEditTextView) {
            this.a = captionEditTextView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object context = this.a.getContext();
            akcr.a(context, "this.context");
            return new uga(context);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(CaptionEditTextView.class), "drawMixin", "getDrawMixin()Lcom/snap/previewtools/caption/ui/CaptionViewDrawMixin;"), new akdc(akde.a(CaptionEditTextView.class), "shadowRenderer", "getShadowRenderer()Lcom/snap/previewtools/caption/utils/CaptionShadowRenderer;"), new akdc(akde.a(CaptionEditTextView.class), "allCapsInputFilter", "getAllCapsInputFilter()Landroid/text/InputFilter$AllCaps;"), new akdc(akde.a(CaptionEditTextView.class), "minTextSizePxForScaling", "getMinTextSizePxForScaling()F"), new akdc(akde.a(CaptionEditTextView.class), "maxTextSizePxForScaling", "getMaxTextSizePxForScaling()F"), new akdc(akde.a(CaptionEditTextView.class), "bigCaptionTouchHandler", "getBigCaptionTouchHandler()Lcom/snap/previewtools/caption/ui/CaptionEditTextView$BigCaptionTouchHandler;"), new akdc(akde.a(CaptionEditTextView.class), "classicCaptionTouchHandler", "getClassicCaptionTouchHandler()Lcom/snap/previewtools/caption/ui/CaptionEditTextView$ClassicCaptionTouchHandler;"), new akdc(akde.a(CaptionEditTextView.class), "clickTouchHandler", "getClickTouchHandler()Lcom/snap/previewtools/caption/ui/CaptionEditTextView$ClickTouchHandler;"), new akdc(akde.a(CaptionEditTextView.class), "fontSizeTouchHandler", "getFontSizeTouchHandler()Lcom/snap/previewtools/caption/ui/CaptionEditTextView$FontSizeTouchHandler;")};
        e eVar = new e();
    }

    public CaptionEditTextView(Context context) {
        akcr.b(context, "context");
        this(context, null);
    }

    public CaptionEditTextView(Context context, AttributeSet attributeSet) {
        String str = "context";
        akcr.b(context, str);
        super(context, attributeSet);
        this.r = ajxh.a(new k(this));
        this.s = ajxh.a(new p(this));
        this.w = defpackage.ufg.d.UNCHANGEABLE;
        this.x = ajyw.a;
        this.E = -1.0f;
        this.J = defpackage.ufg.d.EQUAL;
        this.K = ajyw.a;
        this.L = ajxh.a(g.a);
        this.M = defpackage.ufg.i.UNKNOWN_TEXT_TRANSFORM;
        this.d = -1;
        this.Q = ajxh.a(new n(this));
        this.R = ajxh.a(new m(this));
        Object ajwo = new ajwo();
        String str2 = "PublishSubject.create<Int>()";
        akcr.a(ajwo, str2);
        this.f = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str2);
        this.g = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str2);
        this.h = ajwo;
        ajwo = new ajwo();
        String str3 = "PublishSubject.create<Float>()";
        akcr.a(ajwo, str3);
        this.i = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str2);
        this.j = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str3);
        this.l = ajwo;
        this.T = 254.0f;
        Object resources = getResources();
        akcr.a(resources, "resources");
        resources = resources.getDisplayMetrics();
        akcr.a(resources, "resources.displayMetrics");
        this.m = defpackage.ugc.a.a(2, 12.0f, resources);
        this.n = 254.0f;
        this.o = this.m;
        this.U = true;
        this.q = true;
        this.V = ajxh.a(new h(this));
        this.W = ajxh.a(new i(this));
        this.aa = ajxh.a(new j(this));
        this.ab = ajxh.a(new l(this));
        context = getContext();
        akcr.a((Object) context, str);
        setTextSize(0, defpackage.ugc.a.a(context));
        addOnLayoutChangeListener(new AnonymousClass1(this));
        addTextChangedListener(new AnonymousClass2(this));
    }

    private int a(Integer num, defpackage.ufg.d dVar, List<Float> list) {
        akcr.b(dVar, "colorTransform");
        akcr.b(list, "colorTransformParams");
        int intValue = num == null ? this.H : num.intValue();
        int i = ufl.a[dVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                i = this.S;
                return i != 0 ? i : intValue;
            } else {
                i = this.S;
                if (i != 0) {
                    intValue = uge.a(i, intValue, this.I, list);
                }
            }
        }
        return intValue;
    }

    private final void a(InputFilter inputFilter) {
        Object filters = getFilters();
        akcr.a(filters, "oldFilters");
        if (ajyi.a((Object[]) filters, (Object) inputFilter)) {
            List j = ajyi.j(filters);
            j.remove(inputFilter);
            Object[] toArray = j.toArray(new InputFilter[0]);
            if (toArray != null) {
                setFilters((InputFilter[]) toArray);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    private final ufo i() {
        return (ufo) this.r.b();
    }

    private final uga j() {
        return (uga) this.s.b();
    }

    private final AllCaps k() {
        return (AllCaps) this.L.b();
    }

    private final float l() {
        return ((Number) this.Q.b()).floatValue();
    }

    private final float m() {
        return ((Number) this.R.b()).floatValue();
    }

    private final a n() {
        return (a) this.V.b();
    }

    private final c o() {
        return (c) this.W.b();
    }

    private final d p() {
        return (d) this.aa.b();
    }

    public final void a() {
        this.O = p();
    }

    public final void a(float f) {
        if (VERSION.SDK_INT >= 21 && getLetterSpacing() != f) {
            setLetterSpacing(f);
        }
    }

    public final void a(int i) {
        this.S = i;
        j().c = i;
        j().b = i != 0;
    }

    public final void a(int i, float f) {
        Object resources = getResources();
        akcr.a(resources, "resources");
        resources = resources.getDisplayMetrics();
        akcr.a(resources, "resources.displayMetrics");
        this.l.a(Float.valueOf(defpackage.ugc.a.a(i, f, resources)));
    }

    public final void a(int i, defpackage.ufg.d dVar, List<Float> list) {
        akcr.b(dVar, "colorTransform");
        akcr.b(list, "colorTransformParams");
        this.H = i;
        this.J = dVar;
        this.K = list;
        setTextColor(i);
    }

    public final void a(Animation animation) {
        akcr.b(animation, "animation");
        startAnimation(animation);
    }

    public final void a(List<defpackage.ufg.f> list, Float f, boolean z) {
        akcr.b(list, "shadows");
        if (z) {
            j().a((List) ajyw.a, f);
            uga j = j();
            TextPaint paint = getPaint();
            akcr.a((Object) paint, "paint");
            j.a(paint, (defpackage.ufg.f) ajyu.g((List) list));
            return;
        }
        j().a((List) list, f);
    }

    public final void a(defpackage.ufg.i iVar) {
        akcr.b(iVar, "textTransform");
        if (iVar != this.M) {
            String str;
            String obj = getText().toString();
            int selectionStart = getSelectionStart();
            int i = ufl.b[iVar.ordinal()];
            String str2 = "null cannot be cast to non-null type java.lang.String";
            String str3 = "Locale.getDefault()";
            Object obj2;
            if (i != 1) {
                String str4 = "(this as java.lang.String).toLowerCase(locale)";
                if (i != 2) {
                    a((InputFilter) k());
                    obj2 = Locale.getDefault();
                    akcr.a(obj2, str3);
                    if (obj != null) {
                        obj = obj.toLowerCase(obj2);
                        akcr.a((Object) obj, str4);
                        if (obj != null) {
                            i = obj.length();
                            if (i != 0) {
                                char charAt = obj.charAt(0);
                                if (!Character.isTitleCase(charAt)) {
                                    StringBuilder stringBuilder = new StringBuilder(i);
                                    stringBuilder.append(Character.toTitleCase(charAt));
                                    stringBuilder.append(obj.substring(1));
                                    obj = stringBuilder.toString();
                                }
                            }
                        }
                        str = "StringUtils.capitalize(n…ase(Locale.getDefault()))";
                    } else {
                        throw new ajxt(str2);
                    }
                }
                a((InputFilter) k());
                obj2 = Locale.getDefault();
                akcr.a(obj2, str3);
                if (obj != null) {
                    obj = obj.toLowerCase(obj2);
                    akcr.a((Object) obj, str4);
                    setText(obj);
                    setSelection(selectionStart);
                    this.M = iVar;
                }
                throw new ajxt(str2);
            }
            InputFilter k = k();
            Object filters = getFilters();
            akcr.a(filters, "oldFilters");
            if (!ajyi.a((Object[]) filters, (Object) k)) {
                Object copyOf = Arrays.copyOf(filters, filters.length + 1);
                akcr.a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                InputFilter[] inputFilterArr = (InputFilter[]) copyOf;
                inputFilterArr[filters.length] = k;
                setFilters(inputFilterArr);
            }
            obj2 = Locale.getDefault();
            akcr.a(obj2, str3);
            if (obj != null) {
                obj = obj.toUpperCase(obj2);
                str = "(this as java.lang.String).toUpperCase(locale)";
            } else {
                throw new ajxt(str2);
            }
            akcr.a((Object) obj, str);
            setText(obj);
            setSelection(selectionStart);
            this.M = iVar;
        }
    }

    public final void a(boolean z) {
        if (this.U != z) {
            this.U = z;
            h();
        }
    }

    public final void a(boolean z, float f, int i, defpackage.ufg.d dVar, List<Float> list, Float f2) {
        akcr.b(dVar, "borderColorTransform");
        akcr.b(list, "borderColorTransformParams");
        this.t = z;
        this.u = MapboxConstants.MINIMUM_ZOOM;
        if (z) {
            float textSize;
            String str = "context.resources";
            String str2 = "context";
            float textSize2;
            Object context;
            Object resources;
            Object paint;
            if (f2 == null || f2.floatValue() <= MapboxConstants.MINIMUM_ZOOM) {
                Object paint2 = getPaint();
                String str3 = "paint";
                akcr.a(paint2, str3);
                textSize2 = paint2.getTextSize();
                context = getContext();
                akcr.a(context, str2);
                resources = context.getResources();
                akcr.a(resources, str);
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                setTextSize((((float) Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)) * 0.159f) / displayMetrics.density);
                paint = getPaint();
                akcr.a(paint, str3);
                textSize = paint.getTextSize();
                resources = getPaint();
                akcr.a(resources, str3);
                resources.setTextSize(textSize2);
            } else {
                textSize2 = f2.floatValue();
                context = getContext();
                akcr.a(context, str2);
                resources = context.getResources();
                akcr.a(resources, str);
                paint = resources.getDisplayMetrics();
                akcr.a(paint, "context.resources.displayMetrics");
                textSize = defpackage.ugc.a.a(2, textSize2, paint);
            }
            this.u = f / textSize;
        }
        this.v = i;
        this.w = dVar;
        this.x = list;
    }

    public final void a(boolean z, int i) {
        this.N = z ? o() : n();
        if (z) {
            o().a = i;
        }
    }

    public final void a(boolean z, int i, float f, defpackage.ufg.d dVar, List<Float> list, defpackage.ufg.f fVar, defpackage.ufg.e eVar) {
        akcr.b(dVar, "colorTransform");
        akcr.b(list, "colorTransformParams");
        this.C = z;
        this.D = a(Integer.valueOf(i), dVar, (List) list);
        this.E = f;
        this.F = fVar;
        this.G = eVar;
    }

    public final void a(boolean z, ArrayList<Integer> arrayList, List<Float> list, defpackage.ufg.d dVar, List<Float> list2) {
        akcr.b(dVar, "colorTransform");
        akcr.b(list2, "colorTransformParams");
        this.a = z;
        float[] fArr = null;
        int i = 0;
        if (arrayList != null) {
            this.y = ajyu.f((Collection) arrayList);
            arrayList.set(0, Integer.valueOf(a(this, (Integer) arrayList.get(0), null, null, 6)));
        }
        if (list != null) {
            fArr = ajyu.e((Collection) list);
        }
        this.b = fArr;
        this.J = dVar;
        this.K = list2;
        if (z) {
            Object obj;
            if (arrayList != null) {
                obj = arrayList.get(0);
                akcr.a(obj, "verticalColors[0]");
                this.H = ((Number) obj).intValue();
            }
            String str = "verticalColors";
            if (this.p) {
                float f = MapboxConstants.MINIMUM_ZOOM;
                if (getLayout() != null) {
                    obj = getLayout();
                    akcr.a(obj, Tags.LAYOUT);
                    f = (float) obj.getTopPadding();
                }
                int[] iArr = this.y;
                if (iArr == null) {
                    akcr.a(str);
                }
                if (dVar == defpackage.ufg.d.FOLLOW) {
                    Collection arrayList2 = new ArrayList(iArr.length);
                    int length = iArr.length;
                    while (i < length) {
                        arrayList2.add(Integer.valueOf(uge.a(this.S, iArr[i], this.I, list2)));
                        i++;
                    }
                    iArr = ajyu.f((Collection) (List) arrayList2);
                }
                this.c = new LinearGradient(MapboxConstants.MINIMUM_ZOOM, -f, MapboxConstants.MINIMUM_ZOOM, ((float) getLineHeight()) - f, iArr, this.b, TileMode.REPEAT);
                return;
            }
            float lineHeight = (float) getLineHeight();
            int[] iArr2 = this.y;
            if (iArr2 == null) {
                akcr.a(str);
            }
            this.c = new LinearGradient(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, lineHeight, iArr2, null, TileMode.REPEAT);
        }
    }

    public final void a(boolean z, List<Integer> list, List<Float> list2, defpackage.ufg.d dVar, List<Float> list3) {
        akcr.b(dVar, "colorTransform");
        akcr.b(list3, "colorTransformParams");
        this.z = z;
        if (list != null) {
            this.A = ajyu.f((Collection) list);
        }
        this.B = list2 != null ? ajyu.e((Collection) list2) : null;
        this.J = dVar;
        this.K = list3;
        if (list != null) {
            int[] iArr = this.A;
            if (iArr == null) {
                akcr.a("horizontalColors");
            }
            this.H = iArr[0];
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        b bVar = this.N;
        boolean a = bVar != null ? bVar.a(motionEvent) : false;
        b bVar2 = this.O;
        Object obj = ((bVar2 != null ? bVar2.a(motionEvent) : false) || a) ? 1 : null;
        f fVar = this.e;
        return (fVar != null ? fVar.a(motionEvent) : false) || obj != null;
    }

    public final f b() {
        return (f) this.ab.b();
    }

    public final void b(float f) {
        setAlpha(f);
    }

    public final void b(int i) {
        this.I = i;
        j().a = i;
    }

    public final boolean c() {
        return this.ac;
    }

    public final void d() {
        this.ac = true;
    }

    public final acbe e() {
        return acbe.PREVIEW_CAPTION;
    }

    public final void f() {
        abtp.c((View) this);
    }

    public final int g() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final void h() {
        int i = (!this.U || abqc.b(getText().toString())) ? 1 : 0;
        if (i != getLayerType()) {
            setLayerType(i, null);
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        akcr.b(editorInfo, "outAttrs");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= -1073741825;
        fn.a(editorInfo, ad);
        Object a = fo.a(onCreateInputConnection, editorInfo, (defpackage.fo.a) o.a);
        akcr.a(a, "InputConnectionCompat.cr…ateWrapper true\n        }");
        return a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        Object paint;
        akcr.b(canvas, "canvas");
        if (this.C) {
            Editable text = getText();
            if (text == null) {
                akcr.a();
            }
            if ((((CharSequence) text).length() > 0 ? 1 : null) != null) {
                super.onDraw(canvas);
                i().a();
                i().a(canvas, this.D, this.E, this.F, this.G);
                i().b();
            }
        }
        TextView textView = this;
        j().a(canvas, textView);
        String str = "paint";
        if (this.a) {
            i().a();
            paint = getPaint();
            akcr.a(paint, str);
            Shader shader = this.c;
            if (shader == null) {
                akcr.a("verticalGradientShader");
            }
            paint.setShader(shader);
            super.onDraw(canvas);
            i().b();
        }
        if (this.z) {
            i().a();
            ufo i = i();
            float textSize = getTextSize();
            int[] iArr = this.A;
            if (iArr == null) {
                akcr.a("horizontalColors");
            }
            float[] fArr = this.B;
            defpackage.ufg.d dVar = this.J;
            int i2 = this.I;
            int i3 = this.S;
            if (i3 == 0) {
                i3 = this.H;
            }
            i.a(textSize, iArr, fArr, dVar, i2, i3, this.K);
            super.onDraw(canvas);
            i().b();
        }
        if (!(this.a || this.z)) {
            super.onDraw(canvas);
        }
        if (this.t) {
            i().a();
            ufo i4 = i();
            float f = this.u;
            Object paint2 = getPaint();
            akcr.a(paint2, str);
            i4.a(f * paint2.getTextSize(), a(Integer.valueOf(this.v), this.w, this.x));
            paint = getPaint();
            akcr.a(paint, str);
            ufy.a(textView, paint, canvas);
            i().b();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Editable text = getText();
        if (text == null) {
            akcr.a();
        }
        boolean z = this.P == text.length() && i < text.length();
        this.P = text.length();
        if (this.k == null) {
            Object ajwo = new ajwo();
            akcr.a(ajwo, "PublishSubject.create()");
            this.k = (ajws) ajwo;
        }
        ajws ajws = this.k;
        if (ajws == null) {
            akcr.a("cursorPositionChangeSubject");
        }
        ajws.a((Object) new ajxm(Integer.valueOf(i), Boolean.valueOf(z)));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            this.j.a(Integer.valueOf(i2));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.q) {
            return false;
        }
        return getLayout() != null ? super.onTouchEvent(motionEvent) : a(motionEvent);
    }

    public final void setScaleX(float f) {
        float textSize = getTextSize();
        super.setScaleX(abpf.a(f, l() / textSize, m() / textSize));
    }

    public final void setScaleY(float f) {
        float textSize = getTextSize();
        super.setScaleY(abpf.a(f, l() / textSize, m() / textSize));
    }

    public final void setTextColor(int i) {
        super.setTextColor(a(this, Integer.valueOf(i), null, null, 6));
    }

    public final void setTextSize(int i, float f) {
        Object resources = getResources();
        akcr.a(resources, "resources");
        resources = resources.getDisplayMetrics();
        akcr.a(resources, "resources.displayMetrics");
        super.setTextSize(0, abpf.a(defpackage.ugc.a.a(i, f, resources), this.o, this.n));
    }
}
