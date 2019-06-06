package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.cl;
import defpackage.cn;
import defpackage.cw;
import defpackage.cy;
import defpackage.hr;
import defpackage.id;
import defpackage.jd;
import defpackage.jy;
import defpackage.kb;
import defpackage.kj;
import defpackage.li;

public class CollapsingToolbarLayout extends FrameLayout {
    final cn a;
    Drawable b;
    int c;
    kj d;
    private boolean e;
    private int f;
    private Toolbar g;
    private View h;
    private View i;
    private int j;
    private int k;
    private int l;
    private int m;
    private final Rect n;
    private boolean o;
    private boolean p;
    private Drawable q;
    private int r;
    private boolean s;
    private ValueAnimator t;
    private long u;
    private int v;
    private android.support.design.widget.AppBarLayout.b w;

    public static class a extends LayoutParams {
        int a = 0;
        float b = 0.5f;

        public a() {
            super(-1, -1);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.cj.a.e);
            this.a = obtainStyledAttributes.getInt(0, 0);
            this.b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class b implements android.support.design.widget.AppBarLayout.b {
        b() {
        }

        public final void a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.c = i;
            int b = collapsingToolbarLayout.d != null ? CollapsingToolbarLayout.this.d.b() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                int a;
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                a aVar = (a) childAt.getLayoutParams();
                cy a2 = CollapsingToolbarLayout.a(childAt);
                int i3 = aVar.a;
                if (i3 == 1) {
                    a = id.a(-i, 0, CollapsingToolbarLayout.this.b(childAt));
                } else if (i3 != 2) {
                } else {
                    a = Math.round(((float) (-i)) * aVar.b);
                }
                a2.a(a);
            }
            CollapsingToolbarLayout.this.a();
            if (CollapsingToolbarLayout.this.b != null && b > 0) {
                kb.a.c(CollapsingToolbarLayout.this);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - kb.a.f(CollapsingToolbarLayout.this)) - b;
            cn cnVar = CollapsingToolbarLayout.this.a;
            float a3 = id.a(((float) Math.abs(i)) / ((float) height));
            if (a3 != cnVar.b) {
                cnVar.b = a3;
                cnVar.b();
            }
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CollapsingToolbarLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        boolean z = true;
        this.e = true;
        this.n = new Rect();
        this.v = -1;
        cw.a(context);
        this.a = new cn(this);
        cn cnVar = this.a;
        cnVar.u = cl.d;
        cnVar.c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.cj.a.d, 0, R.style.f437Widget.Design.CollapsingToolbar);
        cn cnVar2 = this.a;
        int i = obtainStyledAttributes.getInt(3, 8388691);
        if (cnVar2.e != i) {
            cnVar2.e = i;
            cnVar2.c();
        }
        cnVar2 = this.a;
        i = obtainStyledAttributes.getInt(0, 8388627);
        if (cnVar2.f != i) {
            cnVar2.f = i;
            cnVar2.c();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(7)) {
            this.j = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        if (obtainStyledAttributes.hasValue(8)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.m = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        }
        this.o = obtainStyledAttributes.getBoolean(14, true);
        this.a.a(obtainStyledAttributes.getText(13));
        this.a.b((int) R.style.f294TextAppearance.Design.CollapsingToolbar.Expanded);
        this.a.a((int) R.style.f249TextAppearance.AppCompat.Widget.ActionBar.Title);
        if (obtainStyledAttributes.hasValue(9)) {
            this.a.b(obtainStyledAttributes.getResourceId(9, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.a.a(obtainStyledAttributes.getResourceId(1, 0));
        }
        this.v = obtainStyledAttributes.getDimensionPixelSize(11, -1);
        this.u = (long) obtainStyledAttributes.getInt(10, 600);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        Drawable drawable2 = this.q;
        Drawable drawable3 = null;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.q = drawable != null ? drawable.mutate() : null;
            drawable = this.q;
            if (drawable != null) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
                this.q.setCallback(this);
                this.q.setAlpha(this.r);
            }
            kb.a.c(this);
        }
        drawable = obtainStyledAttributes.getDrawable(12);
        drawable2 = this.b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.b = drawable3;
            drawable = this.b;
            if (drawable != null) {
                if (drawable.isStateful()) {
                    this.b.setState(getDrawableState());
                }
                hr.b(this.b, kb.a.j(this));
                drawable = this.b;
                if (getVisibility() != 0) {
                    z = false;
                }
                drawable.setVisible(z, false);
                this.b.setCallback(this);
                this.b.setAlpha(this.r);
            }
            kb.a.c(this);
        }
        this.f = obtainStyledAttributes.getResourceId(15, -1);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        kb.a((View) this, new jy() {
            public final kj a(View view, kj kjVar) {
                CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
                Object obj = kb.a.h(collapsingToolbarLayout) ? kjVar : null;
                if (!jd.a(collapsingToolbarLayout.d, obj)) {
                    collapsingToolbarLayout.d = obj;
                    collapsingToolbarLayout.requestLayout();
                }
                return VERSION.SDK_INT >= 20 ? new kj(((WindowInsets) kjVar.a).consumeSystemWindowInsets()) : null;
            }
        });
    }

    static cy a(View view) {
        cy cyVar = (cy) view.getTag(R.id.view_offset_helper);
        if (cyVar != null) {
            return cyVar;
        }
        cyVar = new cy(view);
        view.setTag(R.id.view_offset_helper, cyVar);
        return cyVar;
    }

    private void a(boolean z) {
        int i = 0;
        Object obj = (!kb.a.q(this) || isInEditMode()) ? null : 1;
        if (this.s != z) {
            int i2 = 255;
            if (obj != null) {
                if (!z) {
                    i2 = 0;
                }
                b();
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator == null) {
                    this.t = new ValueAnimator();
                    this.t.setDuration(this.u);
                    this.t.setInterpolator(i2 > this.r ? cl.b : cl.c);
                    this.t.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            CollapsingToolbarLayout.this.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    });
                } else if (valueAnimator.isRunning()) {
                    this.t.cancel();
                }
                this.t.setIntValues(new int[]{this.r, i2});
                this.t.start();
            } else {
                if (z) {
                    i = 255;
                }
                a(i);
            }
            this.s = z;
        }
    }

    private void b() {
        if (this.e) {
            Toolbar toolbar = null;
            this.g = null;
            this.h = null;
            int i = this.f;
            if (i != -1) {
                this.g = (Toolbar) findViewById(i);
                Toolbar toolbar2 = this.g;
                if (toolbar2 != null) {
                    this.h = c(toolbar2);
                }
            }
            if (this.g == null) {
                i = getChildCount();
                for (int i2 = 0; i2 < i; i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                }
                this.g = toolbar;
            }
            c();
            this.e = false;
        }
    }

    private View c(View view) {
        CollapsingToolbarLayout parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    private void c() {
        if (!this.o) {
            View view = this.i;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.i);
                }
            }
        }
        if (this.o && this.g != null) {
            if (this.i == null) {
                this.i = new View(getContext());
            }
            if (this.i.getParent() == null) {
                this.g.addView(this.i, -1, -1);
            }
        }
    }

    private int d() {
        int i = this.v;
        if (i >= 0) {
            return i;
        }
        kj kjVar = this.d;
        i = kjVar != null ? kjVar.b() : 0;
        int f = kb.a.f(this);
        return f > 0 ? Math.min((f << 1) + i, getHeight()) : getHeight() / 3;
    }

    private static int d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            return view.getHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        return (view.getHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.q != null || this.b != null) {
            a(getHeight() + this.c < d());
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (i != this.r) {
            if (this.q != null) {
                Toolbar toolbar = this.g;
                if (toolbar != null) {
                    kb.a.c(toolbar);
                }
            }
            this.r = i;
            kb.a.c(this);
        }
    }

    /* Access modifiers changed, original: final */
    public final int b(View view) {
        return ((getHeight() - a(view).a) - view.getHeight()) - ((a) view.getLayoutParams()).bottomMargin;
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        b();
        if (this.g == null) {
            Drawable drawable = this.q;
            if (drawable != null && this.r > 0) {
                drawable.mutate().setAlpha(this.r);
                this.q.draw(canvas);
            }
        }
        if (this.o && this.p) {
            cn cnVar = this.a;
            int save = canvas.save();
            if (cnVar.l != null && cnVar.a) {
                float f;
                float f2 = cnVar.i;
                float f3 = cnVar.j;
                Object obj = (!cnVar.m || cnVar.n == null) ? null : 1;
                if (obj != null) {
                    f = cnVar.p * cnVar.q;
                } else {
                    cnVar.t.ascent();
                    f = MapboxConstants.MINIMUM_ZOOM;
                    cnVar.t.descent();
                }
                if (obj != null) {
                    f3 += f;
                }
                float f4 = f3;
                if (cnVar.q != 1.0f) {
                    canvas.scale(cnVar.q, cnVar.q, f2, f4);
                }
                if (obj != null) {
                    canvas.drawBitmap(cnVar.n, f2, f4, cnVar.o);
                } else {
                    canvas.drawText(cnVar.l, 0, cnVar.l.length(), f2, f4, cnVar.t);
                }
            }
            canvas.restoreToCount(save);
        }
        if (this.b != null && this.r > 0) {
            kj kjVar = this.d;
            int b = kjVar != null ? kjVar.b() : 0;
            if (b > 0) {
                this.b.setBounds(0, -this.c, getWidth(), b - this.c);
                this.b.mutate().setAlpha(this.r);
                this.b.draw(canvas);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Object obj;
        if (this.q != null && this.r > 0) {
            View view2 = this.h;
            obj = (view2 == null || view2 == this ? view != this.g : view != view2) ? null : 1;
            if (obj != null) {
                this.q.mutate().setAlpha(this.r);
                this.q.draw(canvas);
                obj = 1;
                return super.drawChild(canvas, view, j) || obj != null;
            }
        }
        obj = null;
        if (!super.drawChild(canvas, view, j)) {
        }
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.b;
        int i = 0;
        int state = (drawable == null || !drawable.isStateful()) ? 0 : drawable.setState(drawableState) | 0;
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        cn cnVar = this.a;
        cnVar.r = drawableState;
        Object obj = ((cnVar.h == null || !cnVar.h.isStateful()) && (cnVar.g == null || !cnVar.g.isStateful())) ? null : 1;
        if (obj != null) {
            cnVar.c();
            i = 1;
        }
        if ((state | i) != 0) {
            invalidate();
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            setFitsSystemWindows(kb.a.h((View) parent));
            if (this.w == null) {
                this.w = new b();
            }
            ((AppBarLayout) parent).a(this.w);
            kb.a.g(this);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        android.support.design.widget.AppBarLayout.b bVar = this.w;
        if (bVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).b(bVar);
        }
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int b;
        int i5;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        kj kjVar = this.d;
        if (kjVar != null) {
            b = kjVar.b();
            int childCount = getChildCount();
            for (i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!kb.a.h(childAt) && childAt.getTop() < b) {
                    kb.b(childAt, b);
                }
            }
        }
        if (this.o) {
            view = this.i;
            if (view != null) {
                z = kb.a.r(view) && this.i.getVisibility() == 0;
                this.p = z;
                if (this.p) {
                    Object obj = kb.a.j(this) == 1 ? 1 : null;
                    View view2 = this.h;
                    if (view2 == null) {
                        view2 = this.g;
                    }
                    i5 = b(view2);
                    li.a((ViewGroup) this, this.i, this.n);
                    cn cnVar = this.a;
                    int titleMarginEnd = this.n.left + (obj != null ? this.g.getTitleMarginEnd() : this.g.getTitleMarginStart());
                    int titleMarginTop = (this.n.top + i5) + this.g.getTitleMarginTop();
                    int titleMarginStart = this.n.right + (obj != null ? this.g.getTitleMarginStart() : this.g.getTitleMarginEnd());
                    int titleMarginBottom = (this.n.bottom + i5) - this.g.getTitleMarginBottom();
                    if (!cn.a(cnVar.d, titleMarginEnd, titleMarginTop, titleMarginStart, titleMarginBottom)) {
                        cnVar.d.set(titleMarginEnd, titleMarginTop, titleMarginStart, titleMarginBottom);
                        cnVar.s = true;
                        cnVar.a();
                    }
                    cn cnVar2 = this.a;
                    int i6 = obj != null ? this.l : this.j;
                    titleMarginEnd = this.n.top + this.k;
                    i3 = (i3 - i) - (obj != null ? this.j : this.l);
                    i4 = (i4 - i2) - this.m;
                    if (!cn.a(cnVar2.c, i6, titleMarginEnd, i3, i4)) {
                        cnVar2.c.set(i6, titleMarginEnd, i3, i4);
                        cnVar2.s = true;
                        cnVar2.a();
                    }
                    this.a.c();
                }
            }
        }
        b = getChildCount();
        for (int i7 = 0; i7 < b; i7++) {
            a(getChildAt(i7)).a();
        }
        if (this.g != null) {
            if (this.o && TextUtils.isEmpty(this.a.k)) {
                this.a.a(this.g.getTitle());
            }
            view = this.h;
            if (view == null || view == this) {
                view = this.g;
            }
            setMinimumHeight(d(view));
        }
        a();
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        b();
        super.onMeasure(i, i2);
        i2 = MeasureSpec.getMode(i2);
        kj kjVar = this.d;
        int b = kjVar != null ? kjVar.b() : 0;
        if (i2 == 0 && b > 0) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(getMeasuredHeight() + b, AudioPlayer.INFINITY_LOOP_COUNT));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.b;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.b.setVisible(z, false);
        }
        drawable = this.q;
        if (drawable != null && drawable.isVisible() != z) {
            this.q.setVisible(z, false);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q || drawable == this.b;
    }
}
