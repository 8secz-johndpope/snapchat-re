package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import defpackage.id;
import defpackage.jk;
import defpackage.kb;
import defpackage.lh;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends android.support.design.widget.CoordinatorLayout.b<V> {
    int a;
    int b;
    boolean c;
    int d = 4;
    lh e;
    int f;
    WeakReference<V> g;
    WeakReference<View> h;
    int i;
    boolean j;
    private float k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private int q;
    private boolean r;
    private VelocityTracker s;
    private int t;
    private final defpackage.lh.a u = new defpackage.lh.a() {
        public final int a() {
            return (BottomSheetBehavior.this.c ? BottomSheetBehavior.this.f : BottomSheetBehavior.this.b) - BottomSheetBehavior.this.a;
        }

        public final void a(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.b(1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
        /* JADX WARNING: Missing block: B:11:0x003c, code skipped:
            if (java.lang.Math.abs(r6 - r3.a.a) < java.lang.Math.abs(r6 - r3.a.b)) goto L_0x0007;
     */
        public final void a(android.view.View r4, float r5, float r6) {
            /*
            r3 = this;
            r5 = 4;
            r0 = 3;
            r1 = 0;
            r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
            if (r2 >= 0) goto L_0x000c;
        L_0x0007:
            r5 = android.support.design.widget.BottomSheetBehavior.this;
            r5 = r5.a;
            goto L_0x0045;
        L_0x000c:
            r2 = android.support.design.widget.BottomSheetBehavior.this;
            r2 = r2.c;
            if (r2 == 0) goto L_0x0021;
        L_0x0012:
            r2 = android.support.design.widget.BottomSheetBehavior.this;
            r2 = r2.a(r4, r6);
            if (r2 == 0) goto L_0x0021;
        L_0x001a:
            r5 = android.support.design.widget.BottomSheetBehavior.this;
            r5 = r5.f;
            r6 = 5;
            r0 = 5;
            goto L_0x0045;
        L_0x0021:
            r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
            if (r6 != 0) goto L_0x003f;
        L_0x0025:
            r6 = r4.getTop();
            r1 = android.support.design.widget.BottomSheetBehavior.this;
            r1 = r1.a;
            r1 = r6 - r1;
            r1 = java.lang.Math.abs(r1);
            r2 = android.support.design.widget.BottomSheetBehavior.this;
            r2 = r2.b;
            r6 = r6 - r2;
            r6 = java.lang.Math.abs(r6);
            if (r1 >= r6) goto L_0x003f;
        L_0x003e:
            goto L_0x0007;
        L_0x003f:
            r6 = android.support.design.widget.BottomSheetBehavior.this;
            r6 = r6.b;
            r5 = r6;
            r0 = 4;
        L_0x0045:
            r6 = android.support.design.widget.BottomSheetBehavior.this;
            r6 = r6.e;
            r1 = r4.getLeft();
            r5 = r6.a(r1, r5);
            if (r5 == 0) goto L_0x0064;
        L_0x0053:
            r5 = android.support.design.widget.BottomSheetBehavior.this;
            r6 = 2;
            r5.b(r6);
            r5 = new android.support.design.widget.BottomSheetBehavior$b;
            r6 = android.support.design.widget.BottomSheetBehavior.this;
            r5.<init>(r4, r0);
            defpackage.kb.a(r4, r5);
            return;
        L_0x0064:
            r4 = android.support.design.widget.BottomSheetBehavior.this;
            r4.b(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior$AnonymousClass1.a(android.view.View, float, float):void");
        }

        public final boolean a(View view, int i) {
            if (BottomSheetBehavior.this.d == 1 || BottomSheetBehavior.this.j) {
                return false;
            }
            if (BottomSheetBehavior.this.d == 3 && BottomSheetBehavior.this.i == i) {
                View view2 = (View) BottomSheetBehavior.this.h.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            return BottomSheetBehavior.this.g != null && BottomSheetBehavior.this.g.get() == view;
        }

        public final void b(View view, int i) {
            BottomSheetBehavior.this.a();
        }

        public final int c(View view, int i) {
            return id.a(i, BottomSheetBehavior.this.a, BottomSheetBehavior.this.c ? BottomSheetBehavior.this.f : BottomSheetBehavior.this.b);
        }

        public final int d(View view, int i) {
            return view.getLeft();
        }
    };

    class b implements Runnable {
        private final View a;
        private final int b;

        b(View view, int i) {
            this.a = view;
            this.b = i;
        }

        public final void run() {
            if (BottomSheetBehavior.this.e == null || !BottomSheetBehavior.this.e.a()) {
                BottomSheetBehavior.this.b(this.b);
            } else {
                kb.a(this.a, (Runnable) this);
            }
        }
    }

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
        final int a;

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
        }

        public a(Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.cj.a.c);
        TypedValue peekValue = obtainStyledAttributes.peekValue(1);
        int dimensionPixelSize = (peekValue == null || peekValue.data != -1) ? obtainStyledAttributes.getDimensionPixelSize(1, -1) : peekValue.data;
        c(dimensionPixelSize);
        this.c = obtainStyledAttributes.getBoolean(0, false);
        this.o = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        this.k = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private View b(View view) {
        if (kb.a.v(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View b = b(viewGroup.getChildAt(i));
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    private void b() {
        this.i = -1;
        VelocityTracker velocityTracker = this.s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.s = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    private void c(int r4) {
        /*
        r3 = this;
        r0 = 1;
        r1 = 0;
        r2 = -1;
        if (r4 != r2) goto L_0x000c;
    L_0x0005:
        r4 = r3.m;
        if (r4 != 0) goto L_0x0015;
    L_0x0009:
        r3.m = r0;
        goto L_0x0024;
    L_0x000c:
        r2 = r3.m;
        if (r2 != 0) goto L_0x0017;
    L_0x0010:
        r2 = r3.l;
        if (r2 == r4) goto L_0x0015;
    L_0x0014:
        goto L_0x0017;
    L_0x0015:
        r0 = 0;
        goto L_0x0024;
    L_0x0017:
        r3.m = r1;
        r1 = java.lang.Math.max(r1, r4);
        r3.l = r1;
        r1 = r3.f;
        r1 = r1 - r4;
        r3.b = r1;
    L_0x0024:
        if (r0 == 0) goto L_0x003a;
    L_0x0026:
        r4 = r3.d;
        r0 = 4;
        if (r4 != r0) goto L_0x003a;
    L_0x002b:
        r4 = r3.g;
        if (r4 == 0) goto L_0x003a;
    L_0x002f:
        r4 = r4.get();
        r4 = (android.view.View) r4;
        if (r4 == 0) goto L_0x003a;
    L_0x0037:
        r4.requestLayout();
    L_0x003a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.c(int):void");
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.g.get();
    }

    public final void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        a aVar = (a) parcelable;
        super.a(coordinatorLayout, (View) v, aVar.getSuperState());
        int i = (aVar.a == 1 || aVar.a == 2) ? 4 : aVar.a;
        this.d = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Missing block: B:21:0x005a, code skipped:
            if (java.lang.Math.abs(r6 - r4.a) < java.lang.Math.abs(r6 - r4.b)) goto L_0x0021;
     */
    public final void a(V r5, android.view.View r6) {
        /*
        r4 = this;
        r0 = r5.getTop();
        r1 = r4.a;
        r2 = 3;
        if (r0 != r1) goto L_0x000d;
    L_0x0009:
        r4.b(r2);
        return;
    L_0x000d:
        r0 = r4.h;
        if (r0 == 0) goto L_0x0091;
    L_0x0011:
        r0 = r0.get();
        if (r6 != r0) goto L_0x0091;
    L_0x0017:
        r6 = r4.r;
        if (r6 != 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0091;
    L_0x001c:
        r6 = r4.q;
        r0 = 4;
        if (r6 <= 0) goto L_0x0024;
    L_0x0021:
        r6 = r4.a;
        goto L_0x0060;
    L_0x0024:
        r6 = r4.c;
        if (r6 == 0) goto L_0x0043;
    L_0x0028:
        r6 = r4.s;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = r4.k;
        r6.computeCurrentVelocity(r1, r3);
        r6 = r4.s;
        r1 = r4.i;
        r6 = r6.getYVelocity(r1);
        r6 = r4.a(r5, r6);
        if (r6 == 0) goto L_0x0043;
    L_0x003f:
        r6 = r4.f;
        r2 = 5;
        goto L_0x0060;
    L_0x0043:
        r6 = r4.q;
        if (r6 != 0) goto L_0x005d;
    L_0x0047:
        r6 = r5.getTop();
        r1 = r4.a;
        r1 = r6 - r1;
        r1 = java.lang.Math.abs(r1);
        r3 = r4.b;
        r6 = r6 - r3;
        r6 = java.lang.Math.abs(r6);
        if (r1 >= r6) goto L_0x005d;
    L_0x005c:
        goto L_0x0021;
    L_0x005d:
        r6 = r4.b;
        r2 = 4;
    L_0x0060:
        r0 = r4.e;
        r1 = r5.getLeft();
        r0.d = r5;
        r3 = -1;
        r0.c = r3;
        r3 = 0;
        r6 = r0.a(r1, r6, r3, r3);
        if (r6 != 0) goto L_0x007d;
    L_0x0072:
        r1 = r0.a;
        if (r1 != 0) goto L_0x007d;
    L_0x0076:
        r1 = r0.d;
        if (r1 == 0) goto L_0x007d;
    L_0x007a:
        r1 = 0;
        r0.d = r1;
    L_0x007d:
        if (r6 == 0) goto L_0x008c;
    L_0x007f:
        r6 = 2;
        r4.b(r6);
        r6 = new android.support.design.widget.BottomSheetBehavior$b;
        r6.<init>(r5, r2);
        defpackage.kb.a(r5, r6);
        goto L_0x008f;
    L_0x008c:
        r4.b(r2);
    L_0x008f:
        r4.r = r3;
    L_0x0091:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.a(android.view.View, android.view.View):void");
    }

    public final void a(V v, View view, int i, int[] iArr) {
        if (view == ((View) this.h.get())) {
            int i2;
            int top = v.getTop();
            int i3 = top - i;
            if (i > 0) {
                i2 = this.a;
                if (i3 < i2) {
                    iArr[1] = top - i2;
                    kb.b((View) v, -iArr[1]);
                    i2 = 3;
                } else {
                    iArr[1] = i;
                    kb.b((View) v, -i);
                    b(1);
                    v.getTop();
                    a();
                    this.q = i;
                    this.r = true;
                }
            }
            if (i < 0 && !view.canScrollVertically(-1)) {
                i2 = this.b;
                if (i3 <= i2 || this.c) {
                    iArr[1] = i;
                    kb.b((View) v, -i);
                    b(1);
                } else {
                    iArr[1] = top - i2;
                    kb.b((View) v, -iArr[1]);
                    i2 = 4;
                }
            }
            v.getTop();
            a();
            this.q = i;
            this.r = true;
            b(i2);
            v.getTop();
            a();
            this.q = i;
            this.r = true;
        }
    }

    public final boolean a(int i) {
        this.q = 0;
        this.r = false;
        return (i & 2) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    public final boolean a(android.support.design.widget.CoordinatorLayout r6, V r7, int r8) {
        /*
        r5 = this;
        r0 = defpackage.kb.a;
        r0 = r0.h(r6);
        r1 = 1;
        if (r0 == 0) goto L_0x0014;
    L_0x0009:
        r0 = defpackage.kb.a;
        r0 = r0.h(r7);
        if (r0 != 0) goto L_0x0014;
    L_0x0011:
        r7.setFitsSystemWindows(r1);
    L_0x0014:
        r0 = r7.getTop();
        r6.a(r7, r8);
        r8 = r6.getHeight();
        r5.f = r8;
        r8 = r5.m;
        if (r8 == 0) goto L_0x0048;
    L_0x0025:
        r8 = r5.n;
        if (r8 != 0) goto L_0x0036;
    L_0x0029:
        r8 = r6.getResources();
        r2 = 2131166144; // 0x7f0703c0 float:1.7946525E38 double:1.0529359773E-314;
        r8 = r8.getDimensionPixelSize(r2);
        r5.n = r8;
    L_0x0036:
        r8 = r5.n;
        r2 = r5.f;
        r3 = r6.getWidth();
        r3 = r3 * 9;
        r3 = r3 / 16;
        r2 = r2 - r3;
        r8 = java.lang.Math.max(r8, r2);
        goto L_0x004a;
    L_0x0048:
        r8 = r5.l;
    L_0x004a:
        r2 = 0;
        r3 = r5.f;
        r4 = r7.getHeight();
        r3 = r3 - r4;
        r2 = java.lang.Math.max(r2, r3);
        r5.a = r2;
        r2 = r5.f;
        r2 = r2 - r8;
        r8 = r5.a;
        r8 = java.lang.Math.max(r2, r8);
        r5.b = r8;
        r8 = r5.d;
        r2 = 3;
        if (r8 != r2) goto L_0x006e;
    L_0x0068:
        r8 = r5.a;
    L_0x006a:
        defpackage.kb.b(r7, r8);
        goto L_0x008d;
    L_0x006e:
        r2 = r5.c;
        if (r2 == 0) goto L_0x0078;
    L_0x0072:
        r2 = 5;
        if (r8 != r2) goto L_0x0078;
    L_0x0075:
        r8 = r5.f;
        goto L_0x006a;
    L_0x0078:
        r8 = r5.d;
        r2 = 4;
        if (r8 != r2) goto L_0x0080;
    L_0x007d:
        r8 = r5.b;
        goto L_0x006a;
    L_0x0080:
        if (r8 == r1) goto L_0x0085;
    L_0x0082:
        r2 = 2;
        if (r8 != r2) goto L_0x008d;
    L_0x0085:
        r8 = r7.getTop();
        r0 = r0 - r8;
        defpackage.kb.b(r7, r0);
    L_0x008d:
        r8 = r5.e;
        if (r8 != 0) goto L_0x0099;
    L_0x0091:
        r8 = r5.u;
        r6 = defpackage.lh.a(r6, r8);
        r5.e = r6;
    L_0x0099:
        r6 = new java.lang.ref.WeakReference;
        r6.<init>(r7);
        r5.g = r6;
        r6 = new java.lang.ref.WeakReference;
        r7 = r5.b(r7);
        r6.<init>(r7);
        r5.h = r6;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.a(android.support.design.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                b();
            }
            if (this.s == null) {
                this.s = VelocityTracker.obtain();
            }
            this.s.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.t = (int) motionEvent.getY();
                WeakReference weakReference = this.h;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && coordinatorLayout.a(view, x, this.t)) {
                    this.i = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.j = true;
                }
                boolean z = this.i == -1 && !coordinatorLayout.a((View) v, x, this.t);
                this.p = z;
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.j = false;
                this.i = -1;
                if (this.p) {
                    this.p = false;
                    return false;
                }
            }
            if (!this.p && this.e.a(motionEvent)) {
                return true;
            }
            View view2 = (View) this.h.get();
            return (actionMasked != 2 || view2 == null || this.p || this.d == 1 || coordinatorLayout.a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.t) - motionEvent.getY()) <= ((float) this.e.b)) ? false : true;
        } else {
            this.p = true;
            return false;
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.h.get() && (this.d != 3 || super.a(coordinatorLayout, v, view, f, f2));
    }

    /* Access modifiers changed, original: final */
    public final boolean a(View view, float f) {
        return this.o ? true : view.getTop() >= this.b && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.b)) / ((float) this.l) > 0.5f;
    }

    public final Parcelable b(CoordinatorLayout coordinatorLayout, V v) {
        return new a(super.b(coordinatorLayout, v), this.d);
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        if (this.d != i) {
            this.d = i;
            this.g.get();
        }
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.d == 1 && actionMasked == 0) {
            return true;
        }
        lh lhVar = this.e;
        if (lhVar != null) {
            lhVar.b(motionEvent);
        }
        if (actionMasked == 0) {
            b();
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 2 && !this.p && Math.abs(((float) this.t) - motionEvent.getY()) > ((float) this.e.b)) {
            this.e.a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.p;
    }
}
