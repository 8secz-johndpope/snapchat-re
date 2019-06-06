package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.jk;
import defpackage.jl;
import defpackage.jy;
import defpackage.jz;
import defpackage.kb;
import defpackage.kj;
import defpackage.kk;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    static final int[] a = new int[]{16842931};
    private static final j ad = new j();
    private static final Comparator<b> e = new Comparator<b>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((b) obj).b - ((b) obj2).b;
        }
    };
    private static final Interpolator f = new Interpolator() {
        public final float getInterpolation(float f) {
            f -= 1.0f;
            return ((((f * f) * f) * f) * f) + 1.0f;
        }
    };
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J = -1;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private EdgeEffect P;
    private EdgeEffect Q;
    private boolean R = true;
    private boolean S = false;
    private boolean T;
    private int U;
    private List<e> V;
    private f W;
    private int aa;
    private int ab;
    private ArrayList<View> ac;
    private final Runnable ae = new Runnable() {
        public final void run() {
            ViewPager.this.a(0);
            ViewPager.this.d();
        }
    };
    private int af = 0;
    public jz b;
    int c;
    private int d;
    private final ArrayList<b> g = new ArrayList();
    private final b h = new b();
    private final Rect i = new Rect();
    private int j = -1;
    private Parcelable k = null;
    private ClassLoader l = null;
    private Scroller m;
    private boolean n;
    private g o;
    private int p;
    private int q;
    private int r;
    private float s = -3.4028235E38f;
    private float t = Float.MAX_VALUE;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z = 1;

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
    }

    static class b {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

        b() {
        }
    }

    public static class c extends LayoutParams {
        public boolean a;
        public int b;
        float c = MapboxConstants.MINIMUM_ZOOM;
        boolean d;
        int e;
        int f;

        public c() {
            super(-1, -1);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public interface e {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    public interface f {
        void a(View view, float f);
    }

    class g extends DataSetObserver {
        g() {
        }

        public final void onChanged() {
            ViewPager.this.c();
        }

        public final void onInvalidated() {
            ViewPager.this.c();
        }
    }

    static class j implements Comparator<View> {
        j() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            c cVar = (c) ((View) obj).getLayoutParams();
            c cVar2 = (c) ((View) obj2).getLayoutParams();
            return cVar.a != cVar2.a ? cVar.a ? 1 : -1 : cVar.e - cVar2.e;
        }
    }

    class d extends jl {
        d() {
        }

        private boolean a() {
            return ViewPager.this.b != null && ViewPager.this.b.getCount() > 1;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(a());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.b != null) {
                accessibilityEvent.setItemCount(ViewPager.this.b.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.c);
                accessibilityEvent.setToIndex(ViewPager.this.c);
            }
        }

        public final void onInitializeAccessibilityNodeInfo(View view, kk kkVar) {
            super.onInitializeAccessibilityNodeInfo(view, kkVar);
            kkVar.a(ViewPager.class.getName());
            kkVar.b(a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                kkVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                kkVar.a(8192);
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            ViewPager viewPager;
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i = viewPager.c - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i = viewPager.c + 1;
            }
            viewPager.b(i);
            return true;
        }
    }

    public static class h extends jk {
        public static final Creator<h> CREATOR = new ClassLoaderCreator<h>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new h[i];
            }
        };
        int a;
        Parcelable b;
        ClassLoader c;

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.c = classLoader;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("FragmentPager.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" position=");
            stringBuilder.append(this.a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }
    }

    public static class i implements e {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    public ViewPager(Context context) {
        super(context);
        e();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    private static float a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private b a(View view) {
        for (int i = 0; i < this.g.size(); i++) {
            b bVar = (b) this.g.get(i);
            if (this.b.isViewFromObject(view, bVar.a)) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    private void a(int r13, float r14, int r15) {
        /*
        r12 = this;
        r0 = r12.U;
        r1 = 0;
        r2 = 1;
        if (r0 <= 0) goto L_0x006c;
    L_0x0006:
        r0 = r12.getScrollX();
        r3 = r12.getPaddingLeft();
        r4 = r12.getPaddingRight();
        r5 = r12.getWidth();
        r6 = r12.getChildCount();
        r7 = r4;
        r4 = r3;
        r3 = 0;
    L_0x001d:
        if (r3 >= r6) goto L_0x006c;
    L_0x001f:
        r8 = r12.getChildAt(r3);
        r9 = r8.getLayoutParams();
        r9 = (android.support.v4.view.ViewPager.c) r9;
        r10 = r9.a;
        if (r10 == 0) goto L_0x0069;
    L_0x002d:
        r9 = r9.b;
        r9 = r9 & 7;
        if (r9 == r2) goto L_0x004e;
    L_0x0033:
        r10 = 3;
        if (r9 == r10) goto L_0x0048;
    L_0x0036:
        r10 = 5;
        if (r9 == r10) goto L_0x003b;
    L_0x0039:
        r9 = r4;
        goto L_0x005d;
    L_0x003b:
        r9 = r5 - r7;
        r10 = r8.getMeasuredWidth();
        r9 = r9 - r10;
        r10 = r8.getMeasuredWidth();
        r7 = r7 + r10;
        goto L_0x005a;
    L_0x0048:
        r9 = r8.getWidth();
        r9 = r9 + r4;
        goto L_0x005d;
    L_0x004e:
        r9 = r8.getMeasuredWidth();
        r9 = r5 - r9;
        r9 = r9 / 2;
        r9 = java.lang.Math.max(r9, r4);
    L_0x005a:
        r11 = r9;
        r9 = r4;
        r4 = r11;
    L_0x005d:
        r4 = r4 + r0;
        r10 = r8.getLeft();
        r4 = r4 - r10;
        if (r4 == 0) goto L_0x0068;
    L_0x0065:
        r8.offsetLeftAndRight(r4);
    L_0x0068:
        r4 = r9;
    L_0x0069:
        r3 = r3 + 1;
        goto L_0x001d;
    L_0x006c:
        r12.b(r13, r14, r15);
        r13 = r12.W;
        if (r13 == 0) goto L_0x009f;
    L_0x0073:
        r13 = r12.getScrollX();
        r14 = r12.getChildCount();
    L_0x007b:
        if (r1 >= r14) goto L_0x009f;
    L_0x007d:
        r15 = r12.getChildAt(r1);
        r0 = r15.getLayoutParams();
        r0 = (android.support.v4.view.ViewPager.c) r0;
        r0 = r0.a;
        if (r0 != 0) goto L_0x009c;
    L_0x008b:
        r0 = r15.getLeft();
        r0 = r0 - r13;
        r0 = (float) r0;
        r3 = r12.f();
        r3 = (float) r3;
        r0 = r0 / r3;
        r3 = r12.W;
        r3.a(r15, r0);
    L_0x009c:
        r1 = r1 + 1;
        goto L_0x007b;
    L_0x009f:
        r12.T = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int, float, int):void");
    }

    private void a(int i, int i2) {
        if (getChildCount() == 0) {
            b(false);
            return;
        }
        int currX;
        Scroller scroller = this.m;
        Object obj = (scroller == null || scroller.isFinished()) ? null : 1;
        if (obj != null) {
            currX = this.n ? this.m.getCurrX() : this.m.getStartX();
            this.m.abortAnimation();
            b(false);
        } else {
            currX = getScrollX();
        }
        int i3 = currX;
        int scrollY = getScrollY();
        int i4 = i - i3;
        int i5 = 0 - scrollY;
        if (i4 == 0 && i5 == 0) {
            a(false);
            d();
            a(0);
            return;
        }
        b(true);
        a(2);
        i = f();
        currX = i / 2;
        float f = (float) i;
        float f2 = (float) currX;
        f2 += a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / f)) * f2;
        i2 = Math.abs(i2);
        int min = Math.min(i2 > 0 ? Math.round(Math.abs(f2 / ((float) i2)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i4)) / ((f * this.b.getPageWidth(this.c)) + ((float) this.p))) + 1.0f) * 100.0f), 600);
        this.n = false;
        this.m.startScroll(i3, scrollY, i4, i5, min);
        kb.a.c(this);
    }

    private void a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.g.isEmpty()) {
            b f = f(this.c);
            i = (int) ((f != null ? Math.min(f.e, this.t) : MapboxConstants.MINIMUM_ZOOM) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (i != getScrollX()) {
                a(false);
                scrollTo(i, getScrollY());
            }
        } else if (this.m.isFinished()) {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        } else {
            this.m.setFinalX(b() * f());
        }
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        b f = f(i);
        int f2 = f != null ? (int) (((float) f()) * Math.max(this.s, Math.min(f.e, this.t))) : 0;
        if (z) {
            a(f2, i2);
            if (z2) {
                h(i);
                return;
            }
        }
        if (z2) {
            h(i);
        }
        a(false);
        scrollTo(f2, 0);
        g(f2);
    }

    private void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    private void a(int i, boolean z, boolean z2, int i2) {
        jz jzVar = this.b;
        if (jzVar == null || jzVar.getCount() <= 0) {
            b(false);
        } else if (z2 || this.c != i || this.g.size() == 0) {
            z2 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.b.getCount()) {
                i = this.b.getCount() - 1;
            }
            int i3 = this.z;
            int i4 = this.c;
            if (i > i4 + i3 || i < i4 - i3) {
                for (i3 = 0; i3 < this.g.size(); i3++) {
                    ((b) this.g.get(i3)).c = true;
                }
            }
            if (this.c == i) {
                z2 = false;
            }
            if (this.R) {
                this.c = i;
                if (z2) {
                    h(i);
                }
                requestLayout();
                return;
            }
            e(i);
            a(i, z, i2, z2);
        } else {
            b(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e A:{LOOP_END, LOOP:2: B:18:0x004a->B:20:0x004e} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d A:{LOOP_END, LOOP:5: B:32:0x0089->B:34:0x008d} */
    private void a(android.support.v4.view.ViewPager.b r11, int r12, android.support.v4.view.ViewPager.b r13) {
        /*
        r10 = this;
        r0 = r10.b;
        r0 = r0.getCount();
        r1 = r10.f();
        if (r1 <= 0) goto L_0x0012;
    L_0x000c:
        r2 = r10.p;
        r2 = (float) r2;
        r1 = (float) r1;
        r2 = r2 / r1;
        goto L_0x0013;
    L_0x0012:
        r2 = 0;
    L_0x0013:
        r1 = 0;
        if (r13 == 0) goto L_0x00a1;
    L_0x0016:
        r3 = r13.b;
        r4 = r11.b;
        if (r3 >= r4) goto L_0x0062;
    L_0x001c:
        r4 = r13.e;
        r13 = r13.d;
        r4 = r4 + r13;
        r4 = r4 + r2;
        r3 = r3 + 1;
        r13 = 0;
    L_0x0025:
        r5 = r11.b;
        if (r3 > r5) goto L_0x00a1;
    L_0x0029:
        r5 = r10.g;
        r5 = r5.size();
        if (r13 >= r5) goto L_0x00a1;
    L_0x0031:
        r5 = r10.g;
        r5 = r5.get(r13);
        r5 = (android.support.v4.view.ViewPager.b) r5;
        r6 = r5.b;
        if (r3 <= r6) goto L_0x004a;
    L_0x003d:
        r6 = r10.g;
        r6 = r6.size();
        r6 = r6 + -1;
        if (r13 >= r6) goto L_0x004a;
    L_0x0047:
        r13 = r13 + 1;
        goto L_0x0031;
    L_0x004a:
        r6 = r5.b;
        if (r3 >= r6) goto L_0x0059;
    L_0x004e:
        r6 = r10.b;
        r6 = r6.getPageWidth(r3);
        r6 = r6 + r2;
        r4 = r4 + r6;
        r3 = r3 + 1;
        goto L_0x004a;
    L_0x0059:
        r5.e = r4;
        r5 = r5.d;
        r5 = r5 + r2;
        r4 = r4 + r5;
        r3 = r3 + 1;
        goto L_0x0025;
    L_0x0062:
        r4 = r11.b;
        if (r3 <= r4) goto L_0x00a1;
    L_0x0066:
        r4 = r10.g;
        r4 = r4.size();
        r4 = r4 + -1;
        r13 = r13.e;
        r3 = r3 + -1;
    L_0x0072:
        r5 = r11.b;
        if (r3 < r5) goto L_0x00a1;
    L_0x0076:
        if (r4 < 0) goto L_0x00a1;
    L_0x0078:
        r5 = r10.g;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.b) r5;
        r6 = r5.b;
        if (r3 >= r6) goto L_0x0089;
    L_0x0084:
        if (r4 <= 0) goto L_0x0089;
    L_0x0086:
        r4 = r4 + -1;
        goto L_0x0078;
    L_0x0089:
        r6 = r5.b;
        if (r3 <= r6) goto L_0x0098;
    L_0x008d:
        r6 = r10.b;
        r6 = r6.getPageWidth(r3);
        r6 = r6 + r2;
        r13 = r13 - r6;
        r3 = r3 + -1;
        goto L_0x0089;
    L_0x0098:
        r6 = r5.d;
        r6 = r6 + r2;
        r13 = r13 - r6;
        r5.e = r13;
        r3 = r3 + -1;
        goto L_0x0072;
    L_0x00a1:
        r13 = r10.g;
        r13 = r13.size();
        r3 = r11.e;
        r4 = r11.b;
        r4 = r4 + -1;
        r5 = r11.b;
        if (r5 != 0) goto L_0x00b4;
    L_0x00b1:
        r5 = r11.e;
        goto L_0x00b7;
    L_0x00b4:
        r5 = -8388609; // 0xffffffffff7fffff float:-3.4028235E38 double:NaN;
    L_0x00b7:
        r10.s = r5;
        r5 = r11.b;
        r0 = r0 + -1;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r5 != r0) goto L_0x00c8;
    L_0x00c1:
        r5 = r11.e;
        r7 = r11.d;
        r5 = r5 + r7;
        r5 = r5 - r6;
        goto L_0x00cb;
    L_0x00c8:
        r5 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
    L_0x00cb:
        r10.t = r5;
        r5 = r12 + -1;
    L_0x00cf:
        if (r5 < 0) goto L_0x00fa;
    L_0x00d1:
        r7 = r10.g;
        r7 = r7.get(r5);
        r7 = (android.support.v4.view.ViewPager.b) r7;
    L_0x00d9:
        r8 = r7.b;
        if (r4 <= r8) goto L_0x00e9;
    L_0x00dd:
        r8 = r10.b;
        r9 = r4 + -1;
        r4 = r8.getPageWidth(r4);
        r4 = r4 + r2;
        r3 = r3 - r4;
        r4 = r9;
        goto L_0x00d9;
    L_0x00e9:
        r8 = r7.d;
        r8 = r8 + r2;
        r3 = r3 - r8;
        r7.e = r3;
        r7 = r7.b;
        if (r7 != 0) goto L_0x00f5;
    L_0x00f3:
        r10.s = r3;
    L_0x00f5:
        r5 = r5 + -1;
        r4 = r4 + -1;
        goto L_0x00cf;
    L_0x00fa:
        r3 = r11.e;
        r4 = r11.d;
        r3 = r3 + r4;
        r3 = r3 + r2;
        r11 = r11.b;
        r11 = r11 + 1;
        r12 = r12 + 1;
    L_0x0106:
        if (r12 >= r13) goto L_0x0135;
    L_0x0108:
        r4 = r10.g;
        r4 = r4.get(r12);
        r4 = (android.support.v4.view.ViewPager.b) r4;
    L_0x0110:
        r5 = r4.b;
        if (r11 >= r5) goto L_0x0120;
    L_0x0114:
        r5 = r10.b;
        r7 = r11 + 1;
        r11 = r5.getPageWidth(r11);
        r11 = r11 + r2;
        r3 = r3 + r11;
        r11 = r7;
        goto L_0x0110;
    L_0x0120:
        r5 = r4.b;
        if (r5 != r0) goto L_0x012a;
    L_0x0124:
        r5 = r4.d;
        r5 = r5 + r3;
        r5 = r5 - r6;
        r10.t = r5;
    L_0x012a:
        r4.e = r3;
        r4 = r4.d;
        r4 = r4 + r2;
        r3 = r3 + r4;
        r12 = r12 + 1;
        r11 = r11 + 1;
        goto L_0x0106;
    L_0x0135:
        r10.S = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(android.support.v4.view.ViewPager$b, int, android.support.v4.view.ViewPager$b):void");
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.F = motionEvent.getX(actionIndex);
            this.J = motionEvent.getPointerId(actionIndex);
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void a(boolean z) {
        Object obj = this.af == 2 ? 1 : null;
        if (obj != null) {
            b(false);
            if ((this.m.isFinished() ^ 1) != 0) {
                this.m.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.m.getCurrX();
                int currY = this.m.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        g(currX);
                    }
                }
            }
        }
        this.y = false;
        Object obj2 = obj;
        for (int i = 0; i < this.g.size(); i++) {
            b bVar = (b) this.g.get(i);
            if (bVar.c) {
                bVar.c = false;
                obj2 = 1;
            }
        }
        if (obj2 != null) {
            if (z) {
                kb.a((View) this, this.ae);
                return;
            }
            this.ae.run();
        }
    }

    private b b(int i, int i2) {
        b bVar = new b();
        bVar.b = i;
        bVar.a = this.b.instantiateItem((ViewGroup) this, i);
        bVar.d = this.b.getPageWidth(i);
        if (i2 < 0 || i2 >= this.g.size()) {
            this.g.add(bVar);
        } else {
            this.g.add(i2, bVar);
        }
        return bVar;
    }

    private b b(View view) {
        while (true) {
            ViewPager parent = view.getParent();
            if (parent == this) {
                return a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = parent;
            }
        }
        return null;
    }

    private void b(int i, float f, int i2) {
        List list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar = (e) this.V.get(i3);
                if (eVar != null) {
                    eVar.onPageScrolled(i, f, i2);
                }
            }
        }
    }

    private void b(boolean z) {
        if (this.x != z) {
            this.x = z;
        }
    }

    private boolean b(float f) {
        Object obj;
        Object obj2;
        float f2 = this.F - f;
        this.F = f;
        f = ((float) getScrollX()) + f2;
        f2 = (float) f();
        float f3 = this.s * f2;
        float f4 = this.t * f2;
        boolean z = false;
        b bVar = (b) this.g.get(0);
        ArrayList arrayList = this.g;
        b bVar2 = (b) arrayList.get(arrayList.size() - 1);
        if (bVar.b != 0) {
            f3 = bVar.e * f2;
            obj = null;
        } else {
            obj = 1;
        }
        if (bVar2.b != this.b.getCount() - 1) {
            f4 = bVar2.e * f2;
            obj2 = null;
        } else {
            obj2 = 1;
        }
        if (f < f3) {
            if (obj != null) {
                this.P.onPull(Math.abs(f3 - f) / f2);
                z = true;
            }
            f = f3;
        } else if (f > f4) {
            if (obj2 != null) {
                this.Q.onPull(Math.abs(f - f4) / f2);
                z = true;
            }
            f = f4;
        }
        int i = (int) f;
        this.F += f - ((float) i);
        scrollTo(i, getScrollY());
        g(i);
        return z;
    }

    private void e() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.E = viewConfiguration.getScaledPagingTouchSlop();
        this.L = (int) (400.0f * f);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.P = new EdgeEffect(context);
        this.Q = new EdgeEffect(context);
        this.N = (int) (25.0f * f);
        this.O = (int) (2.0f * f);
        this.C = (int) (f * 16.0f);
        defpackage.kb.j.a((View) this, new d());
        if (kb.a.d(this) == 0) {
            kb.a((View) this, 1);
        }
        kb.a((View) this, new jy() {
            private final Rect a = new Rect();

            public final kj a(View view, kj kjVar) {
                kj a = kb.a(view, kjVar);
                if (a.e()) {
                    return a;
                }
                Rect rect = this.a;
                rect.left = a.a();
                rect.top = a.b();
                rect.right = a.c();
                rect.bottom = a.d();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    kj b = kb.a.b(ViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.a(), rect.left);
                    rect.top = Math.min(b.b(), rect.top);
                    rect.right = Math.min(b.c(), rect.right);
                    rect.bottom = Math.min(b.d(), rect.bottom);
                }
                return a.a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:137:0x0248 in {2, 3, 7, 11, 14, 24, 25, 26, 29, 34, 35, 38, 39, 52, 58, 60, 61, 62, 63, 64, 69, 70, 72, 73, 86, 87, 88, 94, 97, 98, 99, 108, 109, 114, 115, 118, 127, 128, 129, 132, 133, 136} preds:[]
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
    private void e(int r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r0.c;
        if (r2 == r1) goto L_0x000f;
        r2 = r0.f(r2);
        r0.c = r1;
        goto L_0x0010;
        r2 = 0;
        r1 = r0.b;
        if (r1 != 0) goto L_0x0018;
        r17.g();
        return;
        r1 = r0.y;
        if (r1 == 0) goto L_0x0020;
        r17.g();
        return;
        r1 = r17.getWindowToken();
        if (r1 != 0) goto L_0x0027;
        return;
        r1 = r0.b;
        r1.startUpdate(r0);
        r1 = r0.z;
        r4 = r0.c;
        r4 = r4 - r1;
        r5 = 0;
        r4 = java.lang.Math.max(r5, r4);
        r6 = r0.b;
        r6 = r6.getCount();
        r7 = r6 + -1;
        r8 = r0.c;
        r8 = r8 + r1;
        r1 = java.lang.Math.min(r7, r8);
        r7 = r0.d;
        if (r6 != r7) goto L_0x01f3;
        r7 = 0;
        r8 = r0.g;
        r8 = r8.size();
        if (r7 >= r8) goto L_0x006a;
        r8 = r0.g;
        r8 = r8.get(r7);
        r8 = (android.support.v4.view.ViewPager.b) r8;
        r9 = r8.b;
        r10 = r0.c;
        if (r9 < r10) goto L_0x0067;
        r9 = r8.b;
        r10 = r0.c;
        if (r9 != r10) goto L_0x006a;
        goto L_0x006b;
        r7 = r7 + 1;
        goto L_0x004a;
        r8 = 0;
        if (r8 != 0) goto L_0x0075;
        if (r6 <= 0) goto L_0x0075;
        r8 = r0.c;
        r8 = r0.b(r8, r7);
        r9 = 0;
        if (r8 == 0) goto L_0x0181;
        r10 = r7 + -1;
        if (r10 < 0) goto L_0x0085;
        r11 = r0.g;
        r11 = r11.get(r10);
        r11 = (android.support.v4.view.ViewPager.b) r11;
        goto L_0x0086;
        r11 = 0;
        r12 = r17.f();
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 > 0) goto L_0x0090;
        r3 = 0;
        goto L_0x009d;
        r14 = r8.d;
        r14 = r13 - r14;
        r15 = r17.getPaddingLeft();
        r15 = (float) r15;
        r3 = (float) r12;
        r15 = r15 / r3;
        r3 = r14 + r15;
        r14 = r0.c;
        r14 = r14 + -1;
        r15 = r10;
        r10 = r7;
        r7 = 0;
        if (r14 < 0) goto L_0x00f3;
        r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r16 < 0) goto L_0x00c9;
        if (r14 >= r4) goto L_0x00c9;
        if (r11 == 0) goto L_0x00f3;
        r5 = r11.b;
        if (r14 != r5) goto L_0x00ef;
        r5 = r11.c;
        if (r5 != 0) goto L_0x00ef;
        r5 = r0.g;
        r5.remove(r15);
        r5 = r0.b;
        r11 = r11.a;
        r5.destroyItem(r0, r14, r11);
        r15 = r15 + -1;
        r10 = r10 + -1;
        if (r15 < 0) goto L_0x00ed;
        goto L_0x00e4;
        if (r11 == 0) goto L_0x00d7;
        r5 = r11.b;
        if (r14 != r5) goto L_0x00d7;
        r5 = r11.d;
        r7 = r7 + r5;
        r15 = r15 + -1;
        if (r15 < 0) goto L_0x00ed;
        goto L_0x00e4;
        r5 = r15 + 1;
        r5 = r0.b(r14, r5);
        r5 = r5.d;
        r7 = r7 + r5;
        r10 = r10 + 1;
        if (r15 < 0) goto L_0x00ed;
        r5 = r0.g;
        r5 = r5.get(r15);
        r5 = (android.support.v4.view.ViewPager.b) r5;
        goto L_0x00ee;
        r5 = 0;
        r11 = r5;
        r14 = r14 + -1;
        r5 = 0;
        goto L_0x00a4;
        r3 = r8.d;
        r4 = r10 + 1;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 >= 0) goto L_0x0175;
        r5 = r0.g;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x010c;
        r5 = r0.g;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.b) r5;
        goto L_0x010d;
        r5 = 0;
        if (r12 > 0) goto L_0x0111;
        r7 = 0;
        goto L_0x0119;
        r7 = r17.getPaddingRight();
        r7 = (float) r7;
        r11 = (float) r12;
        r7 = r7 / r11;
        r7 = r7 + r13;
        r11 = r0.c;
        r11 = r11 + 1;
        if (r11 >= r6) goto L_0x0175;
        r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r12 < 0) goto L_0x014e;
        if (r11 <= r1) goto L_0x014e;
        if (r5 == 0) goto L_0x0175;
        r12 = r5.b;
        if (r11 != r12) goto L_0x0174;
        r12 = r5.c;
        if (r12 != 0) goto L_0x0174;
        r12 = r0.g;
        r12.remove(r4);
        r12 = r0.b;
        r5 = r5.a;
        r12.destroyItem(r0, r11, r5);
        r5 = r0.g;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x014c;
        r5 = r0.g;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.b) r5;
        goto L_0x0174;
        r5 = 0;
        goto L_0x0174;
        if (r5 == 0) goto L_0x0162;
        r12 = r5.b;
        if (r11 != r12) goto L_0x0162;
        r5 = r5.d;
        r3 = r3 + r5;
        r4 = r4 + 1;
        r5 = r0.g;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x014c;
        goto L_0x0143;
        r5 = r0.b(r11, r4);
        r4 = r4 + 1;
        r5 = r5.d;
        r3 = r3 + r5;
        r5 = r0.g;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x014c;
        goto L_0x0143;
        goto L_0x011b;
        r0.a(r8, r10, r2);
        r1 = r0.b;
        r2 = r0.c;
        r3 = r8.a;
        r1.setPrimaryItem(r0, r2, r3);
        r1 = r0.b;
        r1.finishUpdate(r0);
        r1 = r17.getChildCount();
        r2 = 0;
        if (r2 >= r1) goto L_0x01b4;
        r3 = r0.getChildAt(r2);
        r4 = r3.getLayoutParams();
        r4 = (android.support.v4.view.ViewPager.c) r4;
        r4.f = r2;
        r5 = r4.a;
        if (r5 != 0) goto L_0x01b1;
        r5 = r4.c;
        r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r5 != 0) goto L_0x01b1;
        r3 = r0.a(r3);
        if (r3 == 0) goto L_0x01b1;
        r5 = r3.d;
        r4.c = r5;
        r3 = r3.b;
        r4.e = r3;
        r2 = r2 + 1;
        goto L_0x018b;
        r17.g();
        r1 = r17.hasFocus();
        if (r1 == 0) goto L_0x01f2;
        r1 = r17.findFocus();
        if (r1 == 0) goto L_0x01c8;
        r3 = r0.b(r1);
        goto L_0x01c9;
        r3 = 0;
        if (r3 == 0) goto L_0x01d1;
        r1 = r3.b;
        r2 = r0.c;
        if (r1 == r2) goto L_0x01f2;
        r1 = 0;
        r2 = r17.getChildCount();
        if (r1 >= r2) goto L_0x01f2;
        r2 = r0.getChildAt(r1);
        r3 = r0.a(r2);
        if (r3 == 0) goto L_0x01ef;
        r3 = r3.b;
        r4 = r0.c;
        if (r3 != r4) goto L_0x01ef;
        r3 = 2;
        r2 = r2.requestFocus(r3);
        if (r2 != 0) goto L_0x01f2;
        r1 = r1 + 1;
        goto L_0x01d2;
        return;
        r1 = r17.getResources();	 Catch:{ NotFoundException -> 0x0200 }
        r2 = r17.getId();	 Catch:{ NotFoundException -> 0x0200 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x0200 }
        goto L_0x0208;
        r1 = r17.getId();
        r1 = java.lang.Integer.toHexString(r1);
        r2 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r3.<init>(r4);
        r4 = r0.d;
        r3.append(r4);
        r4 = ", found: ";
        r3.append(r4);
        r3.append(r6);
        r4 = " Pager id: ";
        r3.append(r4);
        r3.append(r1);
        r1 = " Pager class: ";
        r3.append(r1);
        r1 = r17.getClass();
        r3.append(r1);
        r1 = " Problematic adapter: ";
        r3.append(r1);
        r1 = r0.b;
        r1 = r1.getClass();
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.e(int):void");
    }

    private int f() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private b f(int i) {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = (b) this.g.get(i2);
            if (bVar.b == i) {
                return bVar;
            }
        }
        return null;
    }

    private void g() {
        if (this.ab != 0) {
            ArrayList arrayList = this.ac;
            if (arrayList == null) {
                this.ac = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ac.add(getChildAt(i));
            }
            Collections.sort(this.ac, ad);
        }
    }

    private boolean g(int i) {
        String str = "onPageScrolled did not call superclass implementation";
        if (this.g.size() != 0) {
            b j = j();
            int f = f();
            int i2 = this.p;
            int i3 = f + i2;
            float f2 = (float) f;
            float f3 = ((float) i2) / f2;
            int i4 = j.b;
            float f4 = ((((float) i) / f2) - j.e) / (j.d + f3);
            int i5 = (int) (((float) i3) * f4);
            this.T = false;
            a(i4, f4, i5);
            if (this.T) {
                return true;
            }
            throw new IllegalStateException(str);
        } else if (this.R) {
            return false;
        } else {
            this.T = false;
            a(0, (float) MapboxConstants.MINIMUM_ZOOM, 0);
            if (this.T) {
                return false;
            }
            throw new IllegalStateException(str);
        }
    }

    private void h(int i) {
        List list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = (e) this.V.get(i2);
                if (eVar != null) {
                    eVar.onPageSelected(i);
                }
            }
        }
    }

    private boolean h() {
        this.J = -1;
        k();
        this.P.onRelease();
        this.Q.onRelease();
        return this.P.isFinished() || this.Q.isFinished();
    }

    private void i() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Missing block: B:23:0x008a, code skipped:
            if (r1 >= r2) goto L_0x00b8;
     */
    /* JADX WARNING: Missing block: B:28:0x00a6, code skipped:
            if (r1 <= r2) goto L_0x00b3;
     */
    /* JADX WARNING: Missing block: B:33:0x00b1, code skipped:
            if (r7 != 2) goto L_0x00bc;
     */
    private boolean i(int r7) {
        /*
        r6 = this;
        r0 = r6.findFocus();
        r1 = 1;
        r2 = 0;
        r3 = 0;
        if (r0 != r6) goto L_0x000a;
    L_0x0009:
        goto L_0x0066;
    L_0x000a:
        if (r0 == 0) goto L_0x0065;
    L_0x000c:
        r4 = r0.getParent();
    L_0x0010:
        r5 = r4 instanceof android.view.ViewGroup;
        if (r5 == 0) goto L_0x001d;
    L_0x0014:
        if (r4 != r6) goto L_0x0018;
    L_0x0016:
        r4 = 1;
        goto L_0x001e;
    L_0x0018:
        r4 = r4.getParent();
        goto L_0x0010;
    L_0x001d:
        r4 = 0;
    L_0x001e:
        if (r4 != 0) goto L_0x0065;
    L_0x0020:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = r0.getClass();
        r5 = r5.getSimpleName();
        r4.append(r5);
        r0 = r0.getParent();
    L_0x0034:
        r5 = r0 instanceof android.view.ViewGroup;
        if (r5 == 0) goto L_0x004d;
    L_0x0038:
        r5 = " => ";
        r4.append(r5);
        r5 = r0.getClass();
        r5 = r5.getSimpleName();
        r4.append(r5);
        r0 = r0.getParent();
        goto L_0x0034;
    L_0x004d:
        r0 = new java.lang.StringBuilder;
        r5 = "arrowScroll tried to find focus based on non-child current focused view ";
        r0.<init>(r5);
        r4 = r4.toString();
        r0.append(r4);
        r0 = r0.toString();
        r4 = "ViewPager";
        android.util.Log.e(r4, r0);
        goto L_0x0066;
    L_0x0065:
        r3 = r0;
    L_0x0066:
        r0 = android.view.FocusFinder.getInstance();
        r0 = r0.findNextFocus(r6, r3, r7);
        r4 = 66;
        r5 = 17;
        if (r0 == 0) goto L_0x00a9;
    L_0x0074:
        if (r0 == r3) goto L_0x00a9;
    L_0x0076:
        if (r7 != r5) goto L_0x0092;
    L_0x0078:
        r1 = r6.i;
        r1 = r6.a(r1, r0);
        r1 = r1.left;
        r2 = r6.i;
        r2 = r6.a(r2, r3);
        r2 = r2.left;
        if (r3 == 0) goto L_0x008d;
    L_0x008a:
        if (r1 < r2) goto L_0x008d;
    L_0x008c:
        goto L_0x00b8;
    L_0x008d:
        r2 = r0.requestFocus();
        goto L_0x00bc;
    L_0x0092:
        if (r7 != r4) goto L_0x00bc;
    L_0x0094:
        r1 = r6.i;
        r1 = r6.a(r1, r0);
        r1 = r1.left;
        r2 = r6.i;
        r2 = r6.a(r2, r3);
        r2 = r2.left;
        if (r3 == 0) goto L_0x008d;
    L_0x00a6:
        if (r1 <= r2) goto L_0x00b3;
    L_0x00a8:
        goto L_0x008d;
    L_0x00a9:
        if (r7 == r5) goto L_0x00b8;
    L_0x00ab:
        if (r7 != r1) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00b8;
    L_0x00ae:
        if (r7 == r4) goto L_0x00b3;
    L_0x00b0:
        r0 = 2;
        if (r7 != r0) goto L_0x00bc;
    L_0x00b3:
        r2 = r6.m();
        goto L_0x00bc;
    L_0x00b8:
        r2 = r6.l();
    L_0x00bc:
        if (r2 == 0) goto L_0x00c5;
    L_0x00be:
        r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7);
        r6.playSoundEffect(r7);
    L_0x00c5:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.i(int):boolean");
    }

    private b j() {
        int f = f();
        float scrollX = f > 0 ? ((float) getScrollX()) / ((float) f) : MapboxConstants.MINIMUM_ZOOM;
        float f2 = f > 0 ? ((float) this.p) / ((float) f) : MapboxConstants.MINIMUM_ZOOM;
        b bVar = null;
        int i = 0;
        Object obj = 1;
        int i2 = -1;
        float f3 = MapboxConstants.MINIMUM_ZOOM;
        float f4 = MapboxConstants.MINIMUM_ZOOM;
        while (i < this.g.size()) {
            b bVar2 = (b) this.g.get(i);
            if (obj == null) {
                i2++;
                if (bVar2.b != i2) {
                    bVar2 = this.h;
                    bVar2.e = (f3 + f4) + f2;
                    bVar2.b = i2;
                    bVar2.d = this.b.getPageWidth(bVar2.b);
                    i--;
                }
            }
            f3 = bVar2.e;
            float f5 = (bVar2.d + f3) + f2;
            if (obj == null && scrollX < f3) {
                return bVar;
            }
            if (scrollX < f5 || i == this.g.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.b;
            f4 = bVar2.d;
            i++;
            bVar = bVar2;
            obj = null;
        }
        return bVar;
    }

    private void k() {
        this.A = false;
        this.B = false;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
    }

    private boolean l() {
        int i = this.c;
        if (i <= 0) {
            return false;
        }
        a(i - 1, true);
        return true;
    }

    private boolean m() {
        jz jzVar = this.b;
        if (jzVar == null || this.c >= jzVar.getCount() - 1) {
            return false;
        }
        a(this.c + 1, true);
        return true;
    }

    public final jz a() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (this.af != i) {
            this.af = i;
            if (this.W != null) {
                Object obj = i != 0 ? 1 : null;
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    getChildAt(i2).setLayerType(obj != null ? this.aa : 0, null);
                }
            }
            List list = this.V;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    e eVar = (e) this.V.get(i3);
                    if (eVar != null) {
                        eVar.onPageScrollStateChanged(i);
                    }
                }
            }
        }
    }

    public void a(int i, boolean z) {
        this.y = false;
        a(i, z, false);
    }

    public final void a(e eVar) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        this.V.add(eVar);
    }

    public final void a(f fVar) {
        Object obj = null;
        if (1 != (this.W != null ? 1 : null)) {
            obj = 1;
        }
        this.W = fVar;
        setChildrenDrawingOrderEnabled(true);
        this.ab = 2;
        this.aa = 2;
        if (obj != null) {
            d();
        }
    }

    public final void a(jz jzVar) {
        jz jzVar2 = this.b;
        if (jzVar2 != null) {
            int i;
            jzVar2.setViewPagerObserver(null);
            this.b.startUpdate((ViewGroup) this);
            for (i = 0; i < this.g.size(); i++) {
                b bVar = (b) this.g.get(i);
                this.b.destroyItem((ViewGroup) this, bVar.b, bVar.a);
            }
            this.b.finishUpdate((ViewGroup) this);
            this.g.clear();
            i = 0;
            while (i < getChildCount()) {
                if (!((c) getChildAt(i).getLayoutParams()).a) {
                    removeViewAt(i);
                    i--;
                }
                i++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = jzVar;
        this.d = 0;
        if (this.b != null) {
            if (this.o == null) {
                this.o = new g();
            }
            this.b.setViewPagerObserver(this.o);
            this.y = false;
            boolean z = this.R;
            this.R = true;
            this.d = this.b.getCount();
            if (this.j >= 0) {
                this.b.restoreState(this.k, this.l);
                a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (z) {
                requestLayout();
            } else {
                d();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    b a = a(childAt);
                    if (a != null && a.b == this.c) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (!(((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null)) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                b a = a(childAt);
                if (a != null && a.b == this.c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        c cVar = (c) layoutParams;
        cVar.a |= view.getClass().getAnnotation(a.class) != null ? 1 : 0;
        if (!this.w) {
            super.addView(view, i, layoutParams);
        } else if (cVar == null || !cVar.a) {
            cVar.d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public int b() {
        return this.c;
    }

    public void b(int i) {
        this.y = false;
        a(i, this.R ^ 1, false);
    }

    public final void b(e eVar) {
        List list = this.V;
        if (list != null) {
            list.remove(eVar);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        int count = this.b.getCount();
        this.d = count;
        Object obj = (this.g.size() >= (this.z << 1) + 1 || this.g.size() >= count) ? null : 1;
        Object obj2 = obj;
        int i = this.c;
        int i2 = 0;
        Object obj3 = null;
        while (i2 < this.g.size()) {
            b bVar = (b) this.g.get(i2);
            int itemPosition = this.b.getItemPosition(bVar.a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.g.remove(i2);
                    i2--;
                    if (obj3 == null) {
                        this.b.startUpdate((ViewGroup) this);
                        obj3 = 1;
                    }
                    this.b.destroyItem((ViewGroup) this, bVar.b, bVar.a);
                    if (this.c == bVar.b) {
                        i = Math.max(0, Math.min(this.c, count - 1));
                    }
                } else if (bVar.b != itemPosition) {
                    if (bVar.b == this.c) {
                        i = itemPosition;
                    }
                    bVar.b = itemPosition;
                }
                obj2 = 1;
            }
            i2++;
        }
        if (obj3 != null) {
            this.b.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.g, e);
        if (obj2 != null) {
            count = getChildCount();
            for (i2 = 0; i2 < count; i2++) {
                c cVar = (c) getChildAt(i2).getLayoutParams();
                if (!cVar.a) {
                    cVar.c = MapboxConstants.MINIMUM_ZOOM;
                }
            }
            a(i, false, true);
            requestLayout();
        }
    }

    public final void c(int i) {
        if (i <= 0) {
            StringBuilder stringBuilder = new StringBuilder("Requested offscreen page limit ");
            stringBuilder.append(i);
            stringBuilder.append(" too small; defaulting to 1");
            Log.w("ViewPager", stringBuilder.toString());
            i = 1;
        }
        if (i != this.z) {
            this.z = i;
            d();
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.b == null) {
            return false;
        }
        int f = f();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) f) * this.s)) : i > 0 && scrollX < ((int) (((float) f) * this.t));
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.n = true;
        if (this.m.isFinished() || !this.m.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.m.getCurrX();
        int currY = this.m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!g(currX)) {
                this.m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        kb.a.c(this);
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        e(this.c);
    }

    public final void d(int i) {
        int i2 = this.p;
        this.p = i;
        int width = getWidth();
        a(width, width, i, i2);
        requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A:{RETURN} */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
        r5 = this;
        r0 = super.dispatchKeyEvent(r6);
        r1 = 1;
        if (r0 != 0) goto L_0x005b;
    L_0x0007:
        r0 = r6.getAction();
        r2 = 0;
        if (r0 != 0) goto L_0x0056;
    L_0x000e:
        r0 = r6.getKeyCode();
        r3 = 21;
        r4 = 2;
        if (r0 == r3) goto L_0x0044;
    L_0x0017:
        r3 = 22;
        if (r0 == r3) goto L_0x0036;
    L_0x001b:
        r3 = 61;
        if (r0 == r3) goto L_0x0020;
    L_0x001f:
        goto L_0x0056;
    L_0x0020:
        r0 = r6.hasNoModifiers();
        if (r0 == 0) goto L_0x002b;
    L_0x0026:
        r6 = r5.i(r4);
        goto L_0x0057;
    L_0x002b:
        r6 = r6.hasModifiers(r1);
        if (r6 == 0) goto L_0x0056;
    L_0x0031:
        r6 = r5.i(r1);
        goto L_0x0057;
    L_0x0036:
        r6 = r6.hasModifiers(r4);
        if (r6 == 0) goto L_0x0041;
    L_0x003c:
        r6 = r5.m();
        goto L_0x0057;
    L_0x0041:
        r6 = 66;
        goto L_0x0051;
    L_0x0044:
        r6 = r6.hasModifiers(r4);
        if (r6 == 0) goto L_0x004f;
    L_0x004a:
        r6 = r5.l();
        goto L_0x0057;
    L_0x004f:
        r6 = 17;
    L_0x0051:
        r6 = r5.i(r6);
        goto L_0x0057;
    L_0x0056:
        r6 = 0;
    L_0x0057:
        if (r6 == 0) goto L_0x005a;
    L_0x0059:
        goto L_0x005b;
    L_0x005a:
        return r2;
    L_0x005b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                b a = a(childAt);
                if (a != null && a.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARNING: Missing block: B:7:0x0015, code skipped:
            if (r0.getCount() > 1) goto L_0x0024;
     */
    public void draw(android.graphics.Canvas r8) {
        /*
        r7 = this;
        super.draw(r8);
        r0 = r7.getOverScrollMode();
        r1 = 0;
        if (r0 == 0) goto L_0x0024;
    L_0x000a:
        r2 = 1;
        if (r0 != r2) goto L_0x0018;
    L_0x000d:
        r0 = r7.b;
        if (r0 == 0) goto L_0x0018;
    L_0x0011:
        r0 = r0.getCount();
        if (r0 <= r2) goto L_0x0018;
    L_0x0017:
        goto L_0x0024;
    L_0x0018:
        r8 = r7.P;
        r8.finish();
        r8 = r7.Q;
        r8.finish();
        goto L_0x00a7;
    L_0x0024:
        r0 = r7.P;
        r0 = r0.isFinished();
        if (r0 != 0) goto L_0x0064;
    L_0x002c:
        r0 = r8.save();
        r2 = r7.getHeight();
        r3 = r7.getPaddingTop();
        r2 = r2 - r3;
        r3 = r7.getPaddingBottom();
        r2 = r2 - r3;
        r3 = r7.getWidth();
        r4 = 1132920832; // 0x43870000 float:270.0 double:5.597372625E-315;
        r8.rotate(r4);
        r4 = -r2;
        r5 = r7.getPaddingTop();
        r4 = r4 + r5;
        r4 = (float) r4;
        r5 = r7.s;
        r6 = (float) r3;
        r5 = r5 * r6;
        r8.translate(r4, r5);
        r4 = r7.P;
        r4.setSize(r2, r3);
        r2 = r7.P;
        r2 = r2.draw(r8);
        r1 = r1 | r2;
        r8.restoreToCount(r0);
    L_0x0064:
        r0 = r7.Q;
        r0 = r0.isFinished();
        if (r0 != 0) goto L_0x00a7;
    L_0x006c:
        r0 = r8.save();
        r2 = r7.getWidth();
        r3 = r7.getHeight();
        r4 = r7.getPaddingTop();
        r3 = r3 - r4;
        r4 = r7.getPaddingBottom();
        r3 = r3 - r4;
        r4 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r8.rotate(r4);
        r4 = r7.getPaddingTop();
        r4 = -r4;
        r4 = (float) r4;
        r5 = r7.t;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = r5 + r6;
        r5 = -r5;
        r6 = (float) r2;
        r5 = r5 * r6;
        r8.translate(r4, r5);
        r4 = r7.Q;
        r4.setSize(r3, r2);
        r2 = r7.Q;
        r2 = r2.draw(r8);
        r1 = r1 | r2;
        r8.restoreToCount(r0);
    L_0x00a7:
        if (r1 == 0) goto L_0x00ae;
    L_0x00a9:
        r8 = defpackage.kb.a;
        r8.c(r7);
    L_0x00ae:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.draw(android.graphics.Canvas):void");
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* Access modifiers changed, original: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.ab == 2) {
            i2 = (i - 1) - i2;
        }
        return ((c) ((View) this.ac.get(i2)).getLayoutParams()).f;
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.ae);
        Scroller scroller = this.m;
        if (!(scroller == null || scroller.isFinished())) {
            this.m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            h();
            return false;
        }
        if (action != 0) {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
        }
        float x;
        if (action == 0) {
            x = motionEvent.getX();
            this.H = x;
            this.F = x;
            x = motionEvent.getY();
            this.I = x;
            this.G = x;
            this.J = motionEvent2.getPointerId(0);
            this.B = false;
            this.n = true;
            this.m.computeScrollOffset();
            if (this.af != 2 || Math.abs(this.m.getFinalX() - this.m.getCurrX()) <= this.O) {
                a(false);
                this.A = false;
            } else {
                this.m.abortAnimation();
                this.y = false;
                d();
                this.A = true;
                i();
                a(1);
            }
        } else if (action == 2) {
            action = this.J;
            if (action != -1) {
                action = motionEvent2.findPointerIndex(action);
                float x2 = motionEvent2.getX(action);
                float f = x2 - this.F;
                float abs = Math.abs(f);
                float y = motionEvent2.getY(action);
                float abs2 = Math.abs(y - this.I);
                if (f != MapboxConstants.MINIMUM_ZOOM) {
                    x = this.F;
                    Object obj = ((x >= ((float) this.D) || f <= MapboxConstants.MINIMUM_ZOOM) && (x <= ((float) (getWidth() - this.D)) || f >= MapboxConstants.MINIMUM_ZOOM)) ? null : 1;
                    if (obj == null) {
                        if (a(this, false, (int) f, (int) x2, (int) y)) {
                            this.F = x2;
                            this.G = y;
                            this.B = true;
                            return false;
                        }
                    }
                }
                if (abs > ((float) this.E) && abs * 0.5f > abs2) {
                    this.A = true;
                    i();
                    a(1);
                    this.F = f > MapboxConstants.MINIMUM_ZOOM ? this.H + ((float) this.E) : this.H - ((float) this.E);
                    this.G = y;
                    b(true);
                } else if (abs2 > ((float) this.E)) {
                    this.B = true;
                }
                if (this.A && b(x2)) {
                    kb.a.c(this);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent2);
        return this.A;
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = paddingBottom;
        int i8 = 0;
        paddingBottom = paddingTop;
        paddingTop = paddingLeft;
        for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
            View childAt = getChildAt(paddingLeft);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int i9 = cVar.b & 7;
                    int i10 = cVar.b & 112;
                    if (i9 == 1) {
                        i9 = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingTop);
                    } else if (i9 == 3) {
                        i9 = paddingTop;
                        paddingTop = childAt.getMeasuredWidth() + paddingTop;
                    } else if (i9 != 5) {
                        i9 = paddingTop;
                    } else {
                        i9 = (i5 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i10 == 16) {
                        i10 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingBottom);
                    } else if (i10 == 48) {
                        i10 = paddingBottom;
                        paddingBottom = childAt.getMeasuredHeight() + paddingBottom;
                    } else if (i10 != 80) {
                        i10 = paddingBottom;
                    } else {
                        i10 = (i6 - i7) - childAt.getMeasuredHeight();
                        i7 += childAt.getMeasuredHeight();
                    }
                    i9 += scrollX;
                    childAt.layout(i9, i10, childAt.getMeasuredWidth() + i9, i10 + childAt.getMeasuredHeight());
                    i8++;
                }
            }
        }
        i5 = (i5 - paddingTop) - paddingRight;
        for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
            View childAt2 = getChildAt(paddingLeft);
            if (childAt2.getVisibility() != 8) {
                c cVar2 = (c) childAt2.getLayoutParams();
                if (!cVar2.a) {
                    b a = a(childAt2);
                    if (a != null) {
                        float f = (float) i5;
                        int i11 = ((int) (a.e * f)) + paddingTop;
                        if (cVar2.d) {
                            cVar2.d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * cVar2.c), AudioPlayer.INFINITY_LOOP_COUNT), MeasureSpec.makeMeasureSpec((i6 - paddingBottom) - i7, AudioPlayer.INFINITY_LOOP_COUNT));
                        }
                        childAt2.layout(i11, paddingBottom, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + paddingBottom);
                    }
                }
            }
        }
        this.q = paddingBottom;
        this.r = i6 - i7;
        this.U = i8;
        if (this.R) {
            z2 = false;
            a(this.c, false, 0, false);
        } else {
            z2 = false;
        }
        this.R = z2;
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    public void onMeasure(int r17, int r18) {
        /*
        r16 = this;
        r0 = r16;
        r1 = 0;
        r2 = r17;
        r2 = getDefaultSize(r1, r2);
        r3 = r18;
        r3 = getDefaultSize(r1, r3);
        r0.setMeasuredDimension(r2, r3);
        r2 = r16.getMeasuredWidth();
        r3 = r2 / 10;
        r4 = r0.C;
        r3 = java.lang.Math.min(r3, r4);
        r0.D = r3;
        r3 = r16.getPaddingLeft();
        r2 = r2 - r3;
        r3 = r16.getPaddingRight();
        r2 = r2 - r3;
        r3 = r16.getMeasuredHeight();
        r4 = r16.getPaddingTop();
        r3 = r3 - r4;
        r4 = r16.getPaddingBottom();
        r3 = r3 - r4;
        r4 = r16.getChildCount();
        r5 = r3;
        r3 = r2;
        r2 = 0;
    L_0x003f:
        r6 = 8;
        r7 = 1;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r2 >= r4) goto L_0x00c7;
    L_0x0046:
        r9 = r0.getChildAt(r2);
        r10 = r9.getVisibility();
        if (r10 == r6) goto L_0x00c2;
    L_0x0050:
        r6 = r9.getLayoutParams();
        r6 = (android.support.v4.view.ViewPager.c) r6;
        if (r6 == 0) goto L_0x00c2;
    L_0x0058:
        r10 = r6.a;
        if (r10 == 0) goto L_0x00c2;
    L_0x005c:
        r10 = r6.b;
        r10 = r10 & 7;
        r11 = r6.b;
        r11 = r11 & 112;
        r12 = 48;
        if (r11 == r12) goto L_0x006f;
    L_0x0068:
        r12 = 80;
        if (r11 != r12) goto L_0x006d;
    L_0x006c:
        goto L_0x006f;
    L_0x006d:
        r11 = 0;
        goto L_0x0070;
    L_0x006f:
        r11 = 1;
    L_0x0070:
        r12 = 3;
        if (r10 == r12) goto L_0x0078;
    L_0x0073:
        r12 = 5;
        if (r10 != r12) goto L_0x0077;
    L_0x0076:
        goto L_0x0078;
    L_0x0077:
        r7 = 0;
    L_0x0078:
        r10 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r11 == 0) goto L_0x007f;
    L_0x007c:
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x0084;
    L_0x007f:
        if (r7 == 0) goto L_0x0084;
    L_0x0081:
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x0086;
    L_0x0084:
        r12 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x0086:
        r13 = r6.width;
        r14 = -1;
        r15 = -2;
        if (r13 == r15) goto L_0x0098;
    L_0x008c:
        r10 = r6.width;
        if (r10 == r14) goto L_0x0094;
    L_0x0090:
        r10 = r6.width;
        r13 = r10;
        goto L_0x0095;
    L_0x0094:
        r13 = r3;
    L_0x0095:
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x0099;
    L_0x0098:
        r13 = r3;
    L_0x0099:
        r1 = r6.height;
        if (r1 == r15) goto L_0x00a6;
    L_0x009d:
        r1 = r6.height;
        if (r1 == r14) goto L_0x00a4;
    L_0x00a1:
        r1 = r6.height;
        goto L_0x00a8;
    L_0x00a4:
        r1 = r5;
        goto L_0x00a8;
    L_0x00a6:
        r1 = r5;
        r8 = r12;
    L_0x00a8:
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10);
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8);
        r9.measure(r6, r1);
        if (r11 == 0) goto L_0x00bb;
    L_0x00b5:
        r1 = r9.getMeasuredHeight();
        r5 = r5 - r1;
        goto L_0x00c2;
    L_0x00bb:
        if (r7 == 0) goto L_0x00c2;
    L_0x00bd:
        r1 = r9.getMeasuredWidth();
        r3 = r3 - r1;
    L_0x00c2:
        r2 = r2 + 1;
        r1 = 0;
        goto L_0x003f;
    L_0x00c7:
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8);
        r0.u = r1;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8);
        r0.v = r1;
        r0.w = r7;
        r16.d();
        r1 = 0;
        r0.w = r1;
        r2 = r16.getChildCount();
    L_0x00df:
        if (r1 >= r2) goto L_0x0108;
    L_0x00e1:
        r4 = r0.getChildAt(r1);
        r5 = r4.getVisibility();
        if (r5 == r6) goto L_0x0105;
    L_0x00eb:
        r5 = r4.getLayoutParams();
        r5 = (android.support.v4.view.ViewPager.c) r5;
        if (r5 == 0) goto L_0x00f7;
    L_0x00f3:
        r7 = r5.a;
        if (r7 != 0) goto L_0x0105;
    L_0x00f7:
        r7 = (float) r3;
        r5 = r5.c;
        r7 = r7 * r5;
        r5 = (int) r7;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8);
        r7 = r0.v;
        r4.measure(r5, r7);
    L_0x0105:
        r1 = r1 + 1;
        goto L_0x00df;
    L_0x0108:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onMeasure(int, int):void");
    }

    /* Access modifiers changed, original: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int childCount = getChildCount();
        int i3 = -1;
        if ((i & 2) != 0) {
            i3 = childCount;
            childCount = 0;
            i2 = 1;
        } else {
            childCount--;
            i2 = -1;
        }
        while (childCount != i3) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                b a = a(childAt);
                if (a != null && a.b == this.c && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            childCount += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof h) {
            h hVar = (h) parcelable;
            super.onRestoreInstanceState(hVar.getSuperState());
            jz jzVar = this.b;
            if (jzVar != null) {
                jzVar.restoreState(hVar.b, hVar.c);
                a(hVar.a, false, true);
                return;
            }
            this.j = hVar.a;
            this.k = hVar.b;
            this.l = hVar.c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.a = this.c;
        jz jzVar = this.b;
        if (jzVar != null) {
            hVar.b = jzVar.saveState();
        }
        return hVar;
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            i2 = this.p;
            a(i, i3, i2, i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0196  */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r0 = r9.getAction();
        r1 = 0;
        if (r0 != 0) goto L_0x000e;
    L_0x0007:
        r0 = r9.getEdgeFlags();
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        return r1;
    L_0x000e:
        r0 = r8.b;
        if (r0 == 0) goto L_0x019c;
    L_0x0012:
        r0 = r0.getCount();
        if (r0 != 0) goto L_0x001a;
    L_0x0018:
        goto L_0x019c;
    L_0x001a:
        r0 = r8.K;
        if (r0 != 0) goto L_0x0024;
    L_0x001e:
        r0 = android.view.VelocityTracker.obtain();
        r8.K = r0;
    L_0x0024:
        r0 = r8.K;
        r0.addMovement(r9);
        r0 = r9.getAction();
        r0 = r0 & 255;
        r2 = 1;
        if (r0 == 0) goto L_0x0174;
    L_0x0032:
        if (r0 == r2) goto L_0x00e1;
    L_0x0034:
        r3 = 2;
        if (r0 == r3) goto L_0x0072;
    L_0x0037:
        r3 = 3;
        if (r0 == r3) goto L_0x0063;
    L_0x003a:
        r3 = 5;
        if (r0 == r3) goto L_0x0053;
    L_0x003d:
        r3 = 6;
        if (r0 == r3) goto L_0x0042;
    L_0x0040:
        goto L_0x0194;
    L_0x0042:
        r8.a(r9);
        r0 = r8.J;
        r0 = r9.findPointerIndex(r0);
        r9 = r9.getX(r0);
        r8.F = r9;
        goto L_0x0194;
    L_0x0053:
        r0 = r9.getActionIndex();
        r3 = r9.getX(r0);
        r8.F = r3;
        r9 = r9.getPointerId(r0);
        goto L_0x0192;
    L_0x0063:
        r9 = r8.A;
        if (r9 == 0) goto L_0x0194;
    L_0x0067:
        r9 = r8.c;
        r8.a(r9, r2, r1, r1);
    L_0x006c:
        r1 = r8.h();
        goto L_0x0194;
    L_0x0072:
        r0 = r8.A;
        if (r0 != 0) goto L_0x00cc;
    L_0x0076:
        r0 = r8.J;
        r0 = r9.findPointerIndex(r0);
        r3 = -1;
        if (r0 != r3) goto L_0x0080;
    L_0x007f:
        goto L_0x006c;
    L_0x0080:
        r3 = r9.getX(r0);
        r4 = r8.F;
        r4 = r3 - r4;
        r4 = java.lang.Math.abs(r4);
        r0 = r9.getY(r0);
        r5 = r8.G;
        r5 = r0 - r5;
        r5 = java.lang.Math.abs(r5);
        r6 = r8.E;
        r6 = (float) r6;
        r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x00cc;
    L_0x009f:
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 <= 0) goto L_0x00cc;
    L_0x00a3:
        r8.A = r2;
        r8.i();
        r4 = r8.H;
        r3 = r3 - r4;
        r5 = 0;
        r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r3 <= 0) goto L_0x00b5;
    L_0x00b0:
        r3 = r8.E;
        r3 = (float) r3;
        r4 = r4 + r3;
        goto L_0x00b9;
    L_0x00b5:
        r3 = r8.E;
        r3 = (float) r3;
        r4 = r4 - r3;
    L_0x00b9:
        r8.F = r4;
        r8.G = r0;
        r8.a(r2);
        r8.b(r2);
        r0 = r8.getParent();
        if (r0 == 0) goto L_0x00cc;
    L_0x00c9:
        r0.requestDisallowInterceptTouchEvent(r2);
    L_0x00cc:
        r0 = r8.A;
        if (r0 == 0) goto L_0x0194;
    L_0x00d0:
        r0 = r8.J;
        r0 = r9.findPointerIndex(r0);
        r9 = r9.getX(r0);
        r9 = r8.b(r9);
        r1 = r1 | r9;
        goto L_0x0194;
    L_0x00e1:
        r0 = r8.A;
        if (r0 == 0) goto L_0x0194;
    L_0x00e5:
        r0 = r8.K;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r8.M;
        r4 = (float) r4;
        r0.computeCurrentVelocity(r3, r4);
        r3 = r8.J;
        r0 = r0.getXVelocity(r3);
        r0 = (int) r0;
        r8.y = r2;
        r3 = r8.f();
        r4 = r8.getScrollX();
        r5 = r8.j();
        r6 = r8.p;
        r6 = (float) r6;
        r3 = (float) r3;
        r6 = r6 / r3;
        r7 = r5.b;
        r4 = (float) r4;
        r4 = r4 / r3;
        r3 = r5.e;
        r4 = r4 - r3;
        r3 = r5.d;
        r3 = r3 + r6;
        r4 = r4 / r3;
        r3 = r8.J;
        r3 = r9.findPointerIndex(r3);
        r9 = r9.getX(r3);
        r3 = r8.H;
        r9 = r9 - r3;
        r9 = (int) r9;
        r9 = java.lang.Math.abs(r9);
        r3 = r8.N;
        if (r9 <= r3) goto L_0x0138;
    L_0x012a:
        r9 = java.lang.Math.abs(r0);
        r3 = r8.L;
        if (r9 <= r3) goto L_0x0138;
    L_0x0132:
        if (r0 <= 0) goto L_0x0135;
    L_0x0134:
        goto L_0x0146;
    L_0x0135:
        r7 = r7 + 1;
        goto L_0x0146;
    L_0x0138:
        r9 = r8.c;
        if (r7 < r9) goto L_0x0140;
    L_0x013c:
        r9 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        goto L_0x0143;
    L_0x0140:
        r9 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
    L_0x0143:
        r4 = r4 + r9;
        r9 = (int) r4;
        r7 = r7 + r9;
    L_0x0146:
        r9 = r8.g;
        r9 = r9.size();
        if (r9 <= 0) goto L_0x016f;
    L_0x014e:
        r9 = r8.g;
        r9 = r9.get(r1);
        r9 = (android.support.v4.view.ViewPager.b) r9;
        r1 = r8.g;
        r3 = r1.size();
        r3 = r3 - r2;
        r1 = r1.get(r3);
        r1 = (android.support.v4.view.ViewPager.b) r1;
        r9 = r9.b;
        r1 = r1.b;
        r1 = java.lang.Math.min(r7, r1);
        r7 = java.lang.Math.max(r9, r1);
    L_0x016f:
        r8.a(r7, r2, r2, r0);
        goto L_0x006c;
    L_0x0174:
        r0 = r8.m;
        r0.abortAnimation();
        r8.y = r1;
        r8.d();
        r0 = r9.getX();
        r8.H = r0;
        r8.F = r0;
        r0 = r9.getY();
        r8.I = r0;
        r8.G = r0;
        r9 = r9.getPointerId(r1);
    L_0x0192:
        r8.J = r9;
    L_0x0194:
        if (r1 == 0) goto L_0x019b;
    L_0x0196:
        r9 = defpackage.kb.a;
        r9.c(r8);
    L_0x019b:
        return r2;
    L_0x019c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }
}
