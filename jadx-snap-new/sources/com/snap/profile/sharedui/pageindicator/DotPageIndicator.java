package com.snap.profile.sharedui.pageindicator;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.AdapterDataObserver;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.snapchat.android.R;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxt;
import defpackage.ajyu;
import defpackage.ajzg;
import defpackage.ajzm;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akef;
import defpackage.aken;
import defpackage.uyo;
import defpackage.uyp;
import java.util.Iterator;
import java.util.Map;

public final class DotPageIndicator extends View implements uyp {
    private static final DecelerateInterpolator o = new DecelerateInterpolator();
    public OnScrollListener a;
    int[] b;
    public AdapterDataObserver c;
    private final Paint d;
    private final Paint e;
    private ValueAnimator[] f;
    private final int g;
    private final Map<Integer, Integer> h;
    private final int i;
    private final long j;
    private final Interpolator k;
    private uyo l;
    private int m;
    private final ajxe n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b implements AnimatorUpdateListener {
        private /* synthetic */ int a;
        private /* synthetic */ uyo b;
        private /* synthetic */ DotPageIndicator c;

        b(int i, uyo uyo, DotPageIndicator dotPageIndicator) {
            this.a = i;
            this.b = uyo;
            this.c = dotPageIndicator;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int[] iArr = this.c.b;
            if (iArr == null) {
                akcr.a("dotSizes");
            }
            int i = this.a;
            akcr.a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                iArr[i] = ((Integer) animatedValue).intValue();
                this.c.invalidate();
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public static final class c extends AdapterDataObserver {
        private /* synthetic */ DotPageIndicator a;
        private /* synthetic */ RecyclerView b;

        public c(DotPageIndicator dotPageIndicator, RecyclerView recyclerView) {
            this.a = dotPageIndicator;
            this.b = recyclerView;
        }

        private final void a() {
            DotPageIndicator dotPageIndicator = this.a;
            Object adapter = this.b.getAdapter();
            akcr.a(adapter, "recyclerView.adapter");
            dotPageIndicator.a(adapter.getItemCount());
        }

        public final void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            a();
        }

        public final void onItemRangeRemoved(int i, int i2) {
            super.onItemRangeRemoved(i, i2);
            a();
        }
    }

    static final class d extends akcs implements akbk<Boolean> {
        private /* synthetic */ Context a;

        d(Context context) {
            this.a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object resources = this.a.getResources();
            akcr.a(resources, "context.resources");
            resources = resources.getConfiguration();
            akcr.a(resources, "context.resources.configuration");
            boolean z = true;
            if (resources.getLayoutDirection() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DotPageIndicator.class), "isRtl", "isRtl()Z");
        a aVar = new a();
    }

    public DotPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private DotPageIndicator(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.d = paint;
        paint = new Paint();
        paint.setAntiAlias(true);
        this.e = paint;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.upq.a.a);
        ajxm[] ajxmArr = new ajxm[2];
        Integer valueOf = Integer.valueOf(1);
        Object system = Resources.getSystem();
        String str = "Resources.getSystem()";
        akcr.a(system, str);
        ajxmArr[0] = ajxs.a(valueOf, Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(5, (int) (system.getDisplayMetrics().density * 6.0f))));
        valueOf = Integer.valueOf(2);
        system = Resources.getSystem();
        akcr.a(system, str);
        ajxmArr[1] = ajxs.a(valueOf, Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(6, (int) (system.getDisplayMetrics().density * 5.0f))));
        this.h = ajzm.a(ajxmArr);
        Integer num = (Integer) ajyu.r(this.h.values());
        this.g = num != null ? num.intValue() : 0;
        Object system2 = Resources.getSystem();
        akcr.a(system2, str);
        this.i = obtainStyledAttributes.getDimensionPixelSize(3, (int) (system2.getDisplayMetrics().density * 3.0f));
        this.d.setColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.regular_grey)));
        this.e.setColor(obtainStyledAttributes.getColor(4, getResources().getColor(R.color.dark_charcoal)));
        this.j = (long) obtainStyledAttributes.getInteger(0, 100);
        this.k = o;
        obtainStyledAttributes.recycle();
        this.n = ajxh.a(new d(context));
    }

    private final void c() {
        uyo uyo = this.l;
        if (uyo != null) {
            ajxm d = d();
            Iterator it = akef.a(((Number) d.a).intValue(), ((Number) d.b).intValue()).iterator();
            while (it.hasNext()) {
                int a = ((ajzg) it).a();
                ValueAnimator[] valueAnimatorArr = this.f;
                String str = "dotAnimators";
                if (valueAnimatorArr == null) {
                    akcr.a(str);
                }
                valueAnimatorArr[a].cancel();
                valueAnimatorArr = this.f;
                if (valueAnimatorArr == null) {
                    akcr.a(str);
                }
                int[] iArr = new int[2];
                int[] iArr2 = this.b;
                if (iArr2 == null) {
                    akcr.a("dotSizes");
                }
                iArr[0] = iArr2[a];
                iArr[1] = uyo.a(uyo.a[a]);
                Object ofInt = ValueAnimator.ofInt(iArr);
                ofInt.setDuration(this.j);
                ofInt.setInterpolator(o);
                ofInt.addUpdateListener(new b(a, uyo, this));
                akcr.a(ofInt, "ValueAnimator.ofInt(dotS…                        }");
                valueAnimatorArr[a] = ofInt;
                valueAnimatorArr = this.f;
                if (valueAnimatorArr == null) {
                    akcr.a(str);
                }
                valueAnimatorArr[a].start();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    private final defpackage.ajxm<java.lang.Integer, java.lang.Integer> d() {
        /*
        r4 = this;
        r0 = r4.l;
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0005:
        r0 = r0.b;
        goto L_0x0009;
    L_0x0008:
        r0 = 0;
    L_0x0009:
        r0 = r0 + -10;
        r0 = java.lang.Math.max(r1, r0);
        r2 = r4.l;
        if (r2 == 0) goto L_0x0019;
    L_0x0013:
        r2 = r2.a;
        if (r2 == 0) goto L_0x0019;
    L_0x0017:
        r2 = r2.length;
        goto L_0x001a;
    L_0x0019:
        r2 = 0;
    L_0x001a:
        r3 = r4.l;
        if (r3 == 0) goto L_0x0020;
    L_0x001e:
        r1 = r3.b;
    L_0x0020:
        r1 = r1 + 10;
        r1 = java.lang.Math.min(r2, r1);
        r2 = new ajxm;
        r0 = java.lang.Integer.valueOf(r0);
        r1 = java.lang.Integer.valueOf(r1);
        r2.<init>(r0, r1);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.profile.sharedui.pageindicator.DotPageIndicator.d():ajxm");
    }

    public final void a() {
        uyo uyo = this.l;
        if (uyo != null && uyo.b < uyo.a.length - 1) {
            uyo.b++;
            uyo.a[uyo.b] = uyo.c;
            uyo.a[uyo.b - 1] = uyo.d;
        }
        c();
    }

    public final void a(int i) {
        if (this.m != i) {
            this.m = (i < 2 ? 1 : 0) == 1 ? 0 : i;
            if (i >= 2) {
                int length;
                this.l = new uyo(this.m, this.h, ((Boolean) this.n.b()).booleanValue());
                this.b = new int[this.m];
                uyo uyo = this.l;
                if (uyo != null) {
                    int[] iArr = uyo.a;
                    length = iArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        int i4 = iArr[i2];
                        int i5 = i3 + 1;
                        int[] iArr2 = this.b;
                        if (iArr2 == null) {
                            akcr.a("dotSizes");
                        }
                        iArr2[i3] = uyo.a(i4);
                        i2++;
                        i3 = i5;
                    }
                }
                ValueAnimator[] valueAnimatorArr = new ValueAnimator[this.m];
                int length2 = valueAnimatorArr.length;
                for (length = 0; length < length2; length++) {
                    valueAnimatorArr[length] = new ValueAnimator();
                }
                this.f = valueAnimatorArr;
                setVisibility(0);
            } else {
                setVisibility(8);
            }
            invalidate();
        }
    }

    public final void b() {
        uyo uyo = this.l;
        if (!(uyo == null || uyo.b == 0)) {
            uyo.b--;
            uyo.a[uyo.b] = uyo.c;
            uyo.a[uyo.b + 1] = uyo.d;
        }
        c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.m >= 2) {
            int width = getWidth();
            int i = this.m;
            width = ((width - (this.g * i)) - ((i - 1) * this.i)) / 2;
            Iterator it = akef.a(0, i).iterator();
            while (it.hasNext()) {
                i = ((ajzg) it).a();
                if (canvas != null) {
                    float f = (float) width;
                    int i2 = this.g;
                    f += ((float) i2) / 2.0f;
                    float f2 = ((float) i2) / 2.0f;
                    int[] iArr = this.b;
                    if (iArr == null) {
                        akcr.a("dotSizes");
                    }
                    float f3 = ((float) iArr[i]) / 2.0f;
                    uyo uyo = this.l;
                    Paint paint = (uyo == null || i != uyo.b) ? this.d : this.e;
                    canvas.drawCircle(f, f2, f3, paint);
                }
                width += this.g + this.i;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = this.g;
        setMeasuredDimension((i * 10) + (this.i * 11), i);
    }
}
