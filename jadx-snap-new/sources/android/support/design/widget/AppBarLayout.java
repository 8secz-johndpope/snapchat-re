package android.support.design.widget;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.widget.CoordinatorLayout.c;
import android.support.design.widget.CoordinatorLayout.e;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.cl;
import defpackage.cq;
import defpackage.cr;
import defpackage.cw;
import defpackage.cz;
import defpackage.id;
import defpackage.jd;
import defpackage.jk;
import defpackage.jy;
import defpackage.kb;
import defpackage.kj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@c(a = Behavior.class)
public class AppBarLayout extends LinearLayout {
    boolean a;
    int b = 0;
    kj c;
    boolean d;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private List<b> h;
    private boolean i;
    private int[] j;

    public static class a extends LayoutParams {
        int a = 1;
        Interpolator b;

        public a() {
            super(-1, -2);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.cj.a.b);
            this.a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface b {
        void a(AppBarLayout appBarLayout, int i);
    }

    public static class Behavior extends cq<AppBarLayout> {
        int a;
        private ValueAnimator c;
        private int d = -1;
        private boolean e;
        private float f;
        private WeakReference<View> g;

        public static class a extends jk {
            public static final Creator<a> CREATOR = new ClassLoaderCreator<a>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new a(parcel, null);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new a[i];
                }
            };
            int a;
            float b;
            boolean c;

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.a = parcel.readInt();
                this.b = parcel.readFloat();
                this.c = parcel.readByte() != (byte) 0;
            }

            public a(Parcelable parcelable) {
                super(parcelable);
            }

            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.a);
                parcel.writeFloat(this.b);
                parcel.writeByte((byte) this.c);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int i;
            int a = a();
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = appBarLayout.getChildAt(i2);
                i = -a;
                if (childAt.getTop() <= i && childAt.getBottom() >= i) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            if (i2 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i2);
                int i3 = ((a) childAt2.getLayoutParams()).a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    i = -childAt2.getBottom();
                    if (i2 == appBarLayout.getChildCount() - 1) {
                        i += appBarLayout.f();
                    }
                    if (a(i3, 2)) {
                        i += kb.a.f(childAt2);
                    } else if (a(i3, 5)) {
                        childCount = kb.a.f(childAt2) + i;
                        if (a < childCount) {
                            i4 = childCount;
                        } else {
                            i = childCount;
                        }
                    }
                    if (a < (i + i4) / 2) {
                        i4 = i;
                    }
                    a(coordinatorLayout, appBarLayout, id.a(i4, -appBarLayout.c(), 0));
                }
            }
        }

        private void a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(a() - i);
            float abs2 = Math.abs(MapboxConstants.MINIMUM_ZOOM);
            abs = abs2 > MapboxConstants.MINIMUM_ZOOM ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            if (a() == i) {
                ValueAnimator valueAnimator = this.c;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.c.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 == null) {
                this.c = new ValueAnimator();
                this.c.setInterpolator(cl.d);
                this.c.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Behavior.this.a_(coordinatorLayout, appBarLayout, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.c.setDuration((long) Math.min(abs, 600));
            this.c.setIntValues(new int[]{r1, i});
            this.c.start();
        }

        /* JADX WARNING: Removed duplicated region for block: B:54:? A:{SYNTHETIC, RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:52:? A:{SYNTHETIC, RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
        private static void a(android.support.design.widget.CoordinatorLayout r6, android.support.design.widget.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
            r0 = java.lang.Math.abs(r8);
            r1 = r7.getChildCount();
            r2 = 0;
            r3 = 0;
        L_0x000a:
            if (r3 >= r1) goto L_0x0020;
        L_0x000c:
            r4 = r7.getChildAt(r3);
            r5 = r4.getTop();
            if (r0 < r5) goto L_0x001d;
        L_0x0016:
            r5 = r4.getBottom();
            if (r0 > r5) goto L_0x001d;
        L_0x001c:
            goto L_0x0021;
        L_0x001d:
            r3 = r3 + 1;
            goto L_0x000a;
        L_0x0020:
            r4 = 0;
        L_0x0021:
            if (r4 == 0) goto L_0x00b1;
        L_0x0023:
            r0 = r4.getLayoutParams();
            r0 = (android.support.design.widget.AppBarLayout.a) r0;
            r0 = r0.a;
            r1 = r0 & 1;
            r3 = 1;
            if (r1 == 0) goto L_0x005d;
        L_0x0030:
            r1 = defpackage.kb.a;
            r1 = r1.f(r4);
            if (r9 <= 0) goto L_0x004b;
        L_0x0038:
            r9 = r0 & 12;
            if (r9 == 0) goto L_0x004b;
        L_0x003c:
            r8 = -r8;
            r9 = r4.getBottom();
            r9 = r9 - r1;
            r0 = r7.f();
            r9 = r9 - r0;
            if (r8 < r9) goto L_0x005d;
        L_0x0049:
            r8 = 1;
            goto L_0x005e;
        L_0x004b:
            r9 = r0 & 2;
            if (r9 == 0) goto L_0x005d;
        L_0x004f:
            r8 = -r8;
            r9 = r4.getBottom();
            r9 = r9 - r1;
            r0 = r7.f();
            r9 = r9 - r0;
            if (r8 < r9) goto L_0x005d;
        L_0x005c:
            goto L_0x0049;
        L_0x005d:
            r8 = 0;
        L_0x005e:
            r9 = r7.d;
            if (r9 == r8) goto L_0x0069;
        L_0x0062:
            r7.d = r8;
            r7.refreshDrawableState();
            r8 = 1;
            goto L_0x006a;
        L_0x0069:
            r8 = 0;
        L_0x006a:
            r9 = android.os.Build.VERSION.SDK_INT;
            r0 = 11;
            if (r9 < r0) goto L_0x00b1;
        L_0x0070:
            if (r10 != 0) goto L_0x00ae;
        L_0x0072:
            if (r8 == 0) goto L_0x00b1;
        L_0x0074:
            r8 = r6.a;
            r8 = r8.b(r7);
            r9 = r6.b;
            r9.clear();
            if (r8 == 0) goto L_0x0086;
        L_0x0081:
            r9 = r6.b;
            r9.addAll(r8);
        L_0x0086:
            r6 = r6.b;
            r8 = r6.size();
            r9 = 0;
        L_0x008d:
            if (r9 >= r8) goto L_0x00ac;
        L_0x008f:
            r10 = r6.get(r9);
            r10 = (android.view.View) r10;
            r10 = r10.getLayoutParams();
            r10 = (android.support.design.widget.CoordinatorLayout.e) r10;
            r10 = r10.a;
            r0 = r10 instanceof android.support.design.widget.AppBarLayout.ScrollingViewBehavior;
            if (r0 == 0) goto L_0x00a9;
        L_0x00a1:
            r10 = (android.support.design.widget.AppBarLayout.ScrollingViewBehavior) r10;
            r6 = r10.c;
            if (r6 == 0) goto L_0x00ac;
        L_0x00a7:
            r2 = 1;
            goto L_0x00ac;
        L_0x00a9:
            r9 = r9 + 1;
            goto L_0x008d;
        L_0x00ac:
            if (r2 == 0) goto L_0x00b1;
        L_0x00ae:
            r7.jumpDrawablesToCurrentState();
        L_0x00b1:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout$Behavior.a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int, int, boolean):void");
        }

        private static boolean a(int i, int i2) {
            return (i & i2) == i2;
        }

        public final int a() {
            return super.c() + this.a;
        }

        public final /* synthetic */ int a(View view) {
            return ((AppBarLayout) view).c();
        }

        public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i == 0) {
                a(coordinatorLayout, appBarLayout);
            }
            this.g = new WeakReference(view2);
        }

        public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                b(coordinatorLayout, appBarLayout, i4, -appBarLayout.e(), 0);
            }
        }

        public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i2 != 0) {
                int i4;
                int d;
                if (i2 < 0) {
                    int i5 = -appBarLayout.c();
                    i4 = i5;
                    d = appBarLayout.d() + i5;
                } else {
                    i4 = -appBarLayout.c();
                    d = 0;
                }
                if (i4 != d) {
                    iArr[1] = b(coordinatorLayout, appBarLayout, i2, i4, d);
                }
            }
        }

        public final /* bridge */ /* synthetic */ boolean a_(int i) {
            return super.a_(i);
        }

        public final /* synthetic */ int b(View view) {
            return -((AppBarLayout) view).e();
        }

        public final /* synthetic */ Parcelable b(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable b = super.b(coordinatorLayout, appBarLayout);
            int c = super.c();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c > 0 || bottom < 0) {
                    i++;
                } else {
                    a aVar = new a(b);
                    aVar.a = i;
                    if (bottom == kb.a.f(childAt) + appBarLayout.f()) {
                        z = true;
                    }
                    aVar.c = z;
                    aVar.b = ((float) bottom) / ((float) childAt.getHeight());
                    return aVar;
                }
            }
            return b;
        }

        public final /* synthetic */ boolean b() {
            WeakReference weakReference = this.g;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    return false;
                }
            }
            return true;
        }

        public final /* bridge */ /* synthetic */ int c() {
            return super.c();
        }
    }

    public static class ScrollingViewBehavior extends cr {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.cj.a.h);
            this.c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        private static AppBarLayout b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final /* synthetic */ View a(List list) {
            return b(list);
        }

        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, view, i, i2, i3, i4);
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = b(coordinatorLayout.a(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b.a(false, z ^ 1, true);
                    return true;
                }
            }
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            android.support.design.widget.CoordinatorLayout.b bVar = ((e) view2.getLayoutParams()).a;
            if (bVar instanceof Behavior) {
                kb.b(view, (((view2.getBottom() - view.getTop()) + ((Behavior) bVar).a) + this.b) - d(view2));
            }
            return false;
        }

        public boolean a_(View view) {
            return view instanceof AppBarLayout;
        }

        public final float b(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int c = appBarLayout.c();
                int d = appBarLayout.d();
                android.support.design.widget.CoordinatorLayout.b bVar = ((e) appBarLayout.getLayoutParams()).a;
                int a = bVar instanceof Behavior ? ((Behavior) bVar).a() : 0;
                if (d != 0 && c + a <= d) {
                    return MapboxConstants.MINIMUM_ZOOM;
                }
                c -= d;
                if (c != 0) {
                    return (((float) a) / ((float) c)) + 1.0f;
                }
            }
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final /* bridge */ /* synthetic */ int c() {
            return super.c();
        }

        public final int c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).c() : super.c(view);
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        cw.a(context);
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, cz.a, 0, R.style.f434Widget.Design.AppBarLayout);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, obtainStyledAttributes.getResourceId(0, 0)));
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, defpackage.cj.a.a, 0, R.style.f434Widget.Design.AppBarLayout);
        kb.a((View) this, obtainStyledAttributes2.getDrawable(0));
        if (obtainStyledAttributes2.hasValue(4)) {
            a(obtainStyledAttributes2.getBoolean(4, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && obtainStyledAttributes2.hasValue(3)) {
            float dimensionPixelSize = (float) obtainStyledAttributes2.getDimensionPixelSize(3, 0);
            int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
            StateListAnimator stateListAnimator = new StateListAnimator();
            String str = "elevation";
            long j = (long) integer;
            stateListAnimator.addState(new int[]{16842766, R.attr.state_collapsible, -2130969272}, ObjectAnimator.ofFloat(this, str, new float[]{MapboxConstants.MINIMUM_ZOOM}).setDuration(j));
            stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(this, str, new float[]{dimensionPixelSize}).setDuration(j));
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, str, new float[]{MapboxConstants.MINIMUM_ZOOM}).setDuration(0));
            setStateListAnimator(stateListAnimator);
        }
        if (VERSION.SDK_INT >= 26) {
            if (obtainStyledAttributes2.hasValue(2)) {
                setKeyboardNavigationCluster(obtainStyledAttributes2.getBoolean(2, false));
            }
            if (obtainStyledAttributes2.hasValue(1)) {
                setTouchscreenBlocksFocus(obtainStyledAttributes2.getBoolean(1, false));
            }
        }
        obtainStyledAttributes2.recycle();
        kb.a((View) this, new jy() {
            public final kj a(View view, kj kjVar) {
                AppBarLayout appBarLayout = AppBarLayout.this;
                Object obj = kb.a.h(appBarLayout) ? kjVar : null;
                if (!jd.a(appBarLayout.c, obj)) {
                    appBarLayout.c = obj;
                    appBarLayout.y_();
                }
                return kjVar;
            }
        });
    }

    private a a(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    private static a a(ViewGroup.LayoutParams layoutParams) {
        return (VERSION.SDK_INT < 19 || !(layoutParams instanceof LayoutParams)) ? layoutParams instanceof MarginLayoutParams ? new a((MarginLayoutParams) layoutParams) : new a(layoutParams) : new a((LayoutParams) layoutParams);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        List list = this.h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) this.h.get(i2);
                if (bVar != null) {
                    bVar.a(this, i);
                }
            }
        }
    }

    public final void a(b bVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (bVar != null && !this.h.contains(bVar)) {
            this.h.add(bVar);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.b = i2 | i;
        requestLayout();
    }

    public final void b() {
        a(true, kb.a.q(this), true);
    }

    public final void b(b bVar) {
        List list = this.h;
        if (list != null && bVar != null) {
            list.remove(bVar);
        }
    }

    public final int c() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        i = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i2 += (measuredHeight + aVar.topMargin) + aVar.bottomMargin;
            if ((i4 & 2) != 0) {
                i2 -= kb.a.f(childAt);
                break;
            }
        }
        i = Math.max(0, i2 - f());
        this.e = i;
        return i;
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* Access modifiers changed, original: final */
    public final int d() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = getChildCount() - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = aVar.a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                i2 += aVar.topMargin + aVar.bottomMargin;
                if ((i3 & 8) != 0) {
                    i2 += kb.a.f(childAt);
                } else {
                    i2 += measuredHeight - ((i3 & 2) != 0 ? kb.a.f(childAt) : f());
                }
            }
        }
        i = Math.max(0, i2);
        this.f = i;
        return i;
    }

    /* Access modifiers changed, original: final */
    public final int e() {
        int i = this.g;
        if (i != -1) {
            return i;
        }
        i = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + (aVar.topMargin + aVar.bottomMargin);
            int i4 = aVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i4 & 2) != 0) {
                i2 -= kb.a.f(childAt) + f();
                break;
            }
        }
        i = Math.max(0, i2);
        this.g = i;
        return i;
    }

    /* Access modifiers changed, original: final */
    public final int f() {
        kj kjVar = this.c;
        return kjVar != null ? kjVar.b() : 0;
    }

    /* Access modifiers changed, original: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.j == null) {
            this.j = new int[2];
        }
        int[] iArr = this.j;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.i ? R.attr.state_collapsible : -2130969273;
        int i2 = (this.i && this.d) ? R.attr.state_collapsed : -2130969272;
        iArr[1] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y_();
        z = false;
        this.a = false;
        i = getChildCount();
        for (i2 = 0; i2 < i; i2++) {
            if (((a) getChildAt(i2).getLayoutParams()).b != null) {
                this.a = true;
                break;
            }
        }
        i = getChildCount();
        for (i2 = 0; i2 < i; i2++) {
            a aVar = (a) getChildAt(i2).getLayoutParams();
            Object obj = ((aVar.a & 1) != 1 || (aVar.a & 10) == 0) ? null : 1;
            if (obj != null) {
                z = true;
                break;
            }
        }
        if (this.i != z) {
            this.i = z;
            refreshDrawableState();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        y_();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    /* Access modifiers changed, original: final */
    public final void y_() {
        this.e = -1;
        this.f = -1;
        this.g = -1;
    }
}
