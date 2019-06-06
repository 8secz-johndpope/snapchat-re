package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.widget.CoordinatorLayout.b;
import android.support.design.widget.CoordinatorLayout.c;
import android.support.design.widget.CoordinatorLayout.e;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.cl;
import defpackage.co;
import defpackage.co.1;
import defpackage.co.2;
import defpackage.co.3;
import defpackage.cp;
import defpackage.ct;
import defpackage.da;
import defpackage.kb;
import java.util.List;

@c(a = Behavior.class)
public final class FloatingActionButton extends da {
    int a;
    final Rect b;
    private ColorStateList d;
    private Mode e;
    private final Rect f;
    private co g;

    public static class Behavior extends b<FloatingActionButton> {
        private Rect a;
        private boolean b;

        public Behavior() {
            this.b = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.cj.a.f);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
        private boolean a(android.support.design.widget.CoordinatorLayout r5, android.support.design.widget.AppBarLayout r6, android.support.design.widget.FloatingActionButton r7) {
            /*
            r4 = this;
            r0 = r4.a(r6, r7);
            r1 = 0;
            if (r0 != 0) goto L_0x0008;
        L_0x0007:
            return r1;
        L_0x0008:
            r0 = r4.a;
            if (r0 != 0) goto L_0x0013;
        L_0x000c:
            r0 = new android.graphics.Rect;
            r0.<init>();
            r4.a = r0;
        L_0x0013:
            r0 = r4.a;
            defpackage.li.a(r5, r6, r0);
            r5 = r0.bottom;
            r0 = r6.f();
            r2 = defpackage.kb.a;
            r2 = r2.f(r6);
            r3 = 1;
            if (r2 == 0) goto L_0x002b;
        L_0x0027:
            r6 = r2 << 1;
        L_0x0029:
            r6 = r6 + r0;
            goto L_0x0047;
        L_0x002b:
            r2 = r6.getChildCount();
            if (r2 <= 0) goto L_0x003c;
        L_0x0031:
            r2 = r2 - r3;
            r1 = r6.getChildAt(r2);
            r2 = defpackage.kb.a;
            r1 = r2.f(r1);
        L_0x003c:
            if (r1 == 0) goto L_0x0041;
        L_0x003e:
            r6 = r1 << 1;
            goto L_0x0029;
        L_0x0041:
            r6 = r6.getHeight();
            r6 = r6 / 3;
        L_0x0047:
            if (r5 > r6) goto L_0x004d;
        L_0x0049:
            r7.b();
            goto L_0x0050;
        L_0x004d:
            r7.a();
        L_0x0050:
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.FloatingActionButton$Behavior.a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, android.support.design.widget.FloatingActionButton):boolean");
        }

        private boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List a = coordinatorLayout.a((View) floatingActionButton);
            int size = a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) a.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (b(view) && b(view, floatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.a((View) floatingActionButton, i);
            Rect rect = floatingActionButton.b;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                e eVar = (e) floatingActionButton.getLayoutParams();
                size = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= eVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    kb.b((View) floatingActionButton, i2);
                }
                if (size != 0) {
                    kb.c(floatingActionButton, size);
                }
            }
            return true;
        }

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((e) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.c == 0;
        }

        private static boolean b(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams instanceof e ? ((e) layoutParams).a instanceof BottomSheetBehavior : false;
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.b();
            } else {
                floatingActionButton.a();
            }
            return true;
        }

        public final void a(e eVar) {
            if (eVar.h == 0) {
                eVar.h = 80;
            }
        }
    }

    class a implements ct {
        a() {
        }

        public final void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.b.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.a, i2 + FloatingActionButton.this.a, i3 + FloatingActionButton.this.a, i4 + FloatingActionButton.this.a);
        }

        public final void a(Drawable drawable) {
            super.setBackgroundDrawable(null);
        }
    }

    private static int a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? (mode == 0 || mode != AudioPlayer.INFINITY_LOOP_COUNT) ? i : i2 : Math.min(i, i2);
    }

    private co c() {
        if (this.g == null) {
            this.g = d();
        }
        return this.g;
    }

    private co d() {
        return VERSION.SDK_INT >= 21 ? new cp(this, new a()) : new co(this, new a());
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        co c = c();
        Object obj = 1;
        if (c.c.getVisibility() == 0 ? c.a == 1 : c.a != 2) {
            obj = null;
        }
        if (obj == null) {
            c.c.animate().cancel();
            if (c.d()) {
                c.a = 2;
                if (c.c.getVisibility() != 0) {
                    c.c.setAlpha(MapboxConstants.MINIMUM_ZOOM);
                    c.c.setScaleY(MapboxConstants.MINIMUM_ZOOM);
                    c.c.setScaleX(MapboxConstants.MINIMUM_ZOOM);
                }
                c.c.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(cl.c).setListener(new 2(null));
                return;
            }
            c.c.a(0, false);
            c.c.setAlpha(1.0f);
            c.c.setScaleY(1.0f);
            c.c.setScaleX(1.0f);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        co c = c();
        Object obj = (c.c.getVisibility() != 0 ? c.a == 2 : c.a != 1) ? null : 1;
        if (obj == null) {
            c.c.animate().cancel();
            if (c.d()) {
                c.a = 1;
                c.c.animate().scaleX(MapboxConstants.MINIMUM_ZOOM).scaleY(MapboxConstants.MINIMUM_ZOOM).alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(200).setInterpolator(cl.b).setListener(new 1(null));
                return;
            }
            c.c.a(4, false);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c().a(getDrawableState());
    }

    public final ColorStateList getBackgroundTintList() {
        return this.d;
    }

    public final Mode getBackgroundTintMode() {
        return this.e;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        c().a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        co c = c();
        if (c.c()) {
            if (c.f == null) {
                c.f = new 3();
            }
            c.c.getViewTreeObserver().addOnPreDrawListener(c.f);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        co c = c();
        if (c.f != null) {
            c.c.getViewTreeObserver().removeOnPreDrawListener(c.f);
            c.f = null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_fab_size_normal);
        this.a = dimensionPixelSize / 2;
        co c = c();
        Rect rect = c.e;
        c.a(rect);
        c.b();
        c.d.a(rect.left, rect.top, rect.right, rect.bottom);
        i = Math.min(a(dimensionPixelSize, i), a(dimensionPixelSize, i2));
        setMeasuredDimension((this.b.left + i) + this.b.right, (i + this.b.top) + this.b.bottom);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Object obj;
            Rect rect = this.f;
            if (kb.a.q(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                rect.left += this.b.left;
                rect.top += this.b.top;
                rect.right -= this.b.right;
                rect.bottom -= this.b.bottom;
                obj = 1;
            } else {
                obj = null;
            }
            if (!(obj == null || this.f.contains((int) motionEvent.getX(), (int) motionEvent.getY()))) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            c();
        }
    }

    public final void setBackgroundTintMode(Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            c();
        }
    }

    public final void setImageResource(int i) {
        AppCompatImageHelper appCompatImageHelper = null;
        appCompatImageHelper.setImageResource(i);
    }

    public final /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }
}
