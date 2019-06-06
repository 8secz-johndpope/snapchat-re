package com.snap.previewtools.caption.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajyu;
import defpackage.ajyw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.ufg.d;
import defpackage.ufg.e;
import defpackage.ufg.f;
import defpackage.ufn;
import defpackage.ufo;
import defpackage.ufy;
import defpackage.uga;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class CaptionCarouselTextView extends TextView implements ufn {
    public boolean a;
    public boolean b = true;
    private final ajxe c = ajxh.a(new b(this));
    private boolean d;
    private float e;
    private int f;
    private boolean g;
    private Shader h;
    private boolean i;
    private int[] j;
    private float[] k;
    private boolean l;
    private int m;
    private float n = -1.0f;
    private f o;
    private final ajxe p = ajxh.a(new c(this));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b extends akcs implements akbk<ufo> {
        private /* synthetic */ CaptionCarouselTextView a;

        b(CaptionCarouselTextView captionCarouselTextView) {
            this.a = captionCarouselTextView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ufo(this.a);
        }
    }

    static final class c extends akcs implements akbk<uga> {
        private /* synthetic */ CaptionCarouselTextView a;

        c(CaptionCarouselTextView captionCarouselTextView) {
            this.a = captionCarouselTextView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object context = this.a.getContext();
            akcr.a(context, "this.context");
            return new uga(context);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(CaptionCarouselTextView.class), "drawMixin", "getDrawMixin()Lcom/snap/previewtools/caption/ui/CaptionViewDrawMixin;"), new akdc(akde.a(CaptionCarouselTextView.class), "shadowRenderer", "getShadowRenderer()Lcom/snap/previewtools/caption/utils/CaptionShadowRenderer;")};
        a aVar = new a();
    }

    public CaptionCarouselTextView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    private final ufo a() {
        return (ufo) this.c.b();
    }

    private final uga b() {
        return (uga) this.p.b();
    }

    public final void a(float f) {
        if (VERSION.SDK_INT >= 21 && getLetterSpacing() != f) {
            setLetterSpacing(f);
        }
    }

    public final void a(int i, d dVar, List<Float> list) {
        akcr.b(dVar, "colorTransform");
        akcr.b(list, "colorTransformParams");
        setTextColor(i);
    }

    public final void a(List<f> list, Float f, boolean z) {
        akcr.b(list, "shadows");
        b().a((List) list, f);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0054 in {4, 7, 9, 11, 14, 16} preds:[]
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
    public final void a(defpackage.ufg.i r5) {
        /*
        r4 = this;
        r0 = "textTransform";
        defpackage.akcr.b(r5, r0);
        r0 = r4.getText();
        r0 = r0.toString();
        r1 = defpackage.ufj.a;
        r5 = r5.ordinal();
        r5 = r1[r5];
        r1 = 1;
        r2 = "null cannot be cast to non-null type java.lang.String";
        r3 = "Locale.getDefault()";
        if (r5 == r1) goto L_0x003e;
        r1 = 2;
        if (r5 == r1) goto L_0x0020;
        return;
        r5 = java.util.Locale.getDefault();
        defpackage.akcr.a(r5, r3);
        if (r0 == 0) goto L_0x0038;
        r5 = r0.toLowerCase(r5);
        r0 = "(this as java.lang.String).toLowerCase(locale)";
        defpackage.akcr.a(r5, r0);
        r5 = (java.lang.CharSequence) r5;
        r4.setText(r5);
        return;
        r5 = new ajxt;
        r5.<init>(r2);
        throw r5;
        r5 = java.util.Locale.getDefault();
        defpackage.akcr.a(r5, r3);
        if (r0 == 0) goto L_0x004e;
        r5 = r0.toUpperCase(r5);
        r0 = "(this as java.lang.String).toUpperCase(locale)";
        goto L_0x002f;
        r5 = new ajxt;
        r5.<init>(r2);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.previewtools.caption.ui.CaptionCarouselTextView.a(ufg$i):void");
    }

    public final void a(boolean z, float f, int i, d dVar, List<Float> list, Float f2) {
        akcr.b(dVar, "borderColorTransform");
        akcr.b(list, "borderColorTransformParams");
        this.d = z;
        this.e = f * 0.05f;
        this.f = i;
    }

    public final void a(boolean z, int i, float f, d dVar, List<Float> list, f fVar, e eVar) {
        akcr.b(dVar, "colorTransform");
        akcr.b(list, "colorTransformParams");
        this.l = z;
        this.m = i;
        this.n = f * 0.1f;
        this.o = fVar;
    }

    public final void a(boolean z, ArrayList<Integer> arrayList, List<Float> list, d dVar, List<Float> list2) {
        akcr.b(dVar, "colorTransform");
        akcr.b(list2, "colorTransformParams");
        this.g = z;
        if (z && arrayList != null) {
            this.h = new LinearGradient(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) getLineHeight(), ajyu.f((Collection) arrayList), list != null ? ajyu.e((Collection) list) : null, TileMode.REPEAT);
        }
    }

    public final void a(boolean z, List<Integer> list, List<Float> list2, d dVar, List<Float> list3) {
        akcr.b(dVar, "colorTransform");
        akcr.b(list3, "colorTransformParams");
        this.i = z;
        if (list != null) {
            this.j = ajyu.f((Collection) list);
        }
        this.k = list2 != null ? ajyu.e((Collection) list2) : null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        Object text;
        akcr.b(canvas, "canvas");
        if (this.l) {
            text = getText();
            akcr.a(text, "text");
            if ((text.length() > 0 ? 1 : null) != null) {
                a().a(canvas, this.m, this.n, this.o, null);
            }
        }
        TextView textView = this;
        b().a(canvas, textView);
        String str = "paint";
        if (this.g) {
            a().a();
            text = getPaint();
            akcr.a(text, str);
            Shader shader = this.h;
            if (shader == null) {
                akcr.a("verticalGradientShader");
            }
            text.setShader(shader);
            super.onDraw(canvas);
            a().b();
        }
        if (this.i) {
            a().a();
            ufo a = a();
            int[] iArr = this.j;
            if (iArr == null) {
                akcr.a("horizontalColors");
            }
            a.a(-1.0f, iArr, this.k, d.UNCHANGEABLE, 0, 0, ajyw.a);
            super.onDraw(canvas);
            a().b();
        }
        if (!(this.g || this.i)) {
            super.onDraw(canvas);
        }
        if (this.d) {
            a().a();
            a().a(this.e, this.f);
            text = getPaint();
            akcr.a(text, str);
            ufy.a(textView, text, canvas);
            a().b();
        }
    }
}
