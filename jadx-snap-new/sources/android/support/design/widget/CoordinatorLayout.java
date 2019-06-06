package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.jd;
import defpackage.jk;
import defpackage.jp;
import defpackage.jw;
import defpackage.jx;
import defpackage.jy;
import defpackage.kb;
import defpackage.kj;
import defpackage.ky;
import defpackage.li;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements jw {
    private static String f;
    private static Class<?>[] g = new Class[]{Context.class, AttributeSet.class};
    private static ThreadLocal<Map<String, Constructor<b>>> h = new ThreadLocal();
    private static Comparator<View> i;
    private static final defpackage.jf.a<Rect> j = new defpackage.jf.c(12);
    final ky<View> a;
    final List<View> b;
    public kj c;
    boolean d;
    OnHierarchyChangeListener e;
    private final List<View> k;
    private final List<View> l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private f s;
    private boolean t;
    private Drawable u;
    private jy v;
    private final jx w;

    public interface a {
        b a();
    }

    public static abstract class b<V extends View> {
        public b(Context context, AttributeSet attributeSet) {
        }

        public void a(e eVar) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                a((View) v, view);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
        }

        public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                a((View) v, view, i2, iArr);
            }
        }

        @Deprecated
        public void a(V v, View view) {
        }

        @Deprecated
        public void a(V v, View view, int i, int[] iArr) {
        }

        @Deprecated
        public boolean a(int i) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            return i2 == 0 ? a(i) : false;
        }

        public boolean a(V v, Rect rect) {
            return false;
        }

        public boolean a_(View view) {
            return false;
        }

        public Parcelable b(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class<? extends b> a();
    }

    class d implements OnHierarchyChangeListener {
        d() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.e != null) {
                CoordinatorLayout.this.e.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.a(2);
            if (CoordinatorLayout.this.e != null) {
                CoordinatorLayout.this.e.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class e extends MarginLayoutParams {
        public b a;
        boolean b = false;
        public int c = 0;
        public int d = 0;
        public int e = -1;
        int f = -1;
        public int g = 0;
        public int h = 0;
        int i;
        int j;
        View k;
        View l;
        boolean m;
        boolean n;
        final Rect o = new Rect();
        private boolean p;
        private boolean q;
        private Object r;

        public e() {
            super(-2, -2);
        }

        e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.bz.a.b);
            this.c = obtainStyledAttributes.getInteger(0, 0);
            this.f = obtainStyledAttributes.getResourceId(1, -1);
            this.d = obtainStyledAttributes.getInteger(2, 0);
            this.e = obtainStyledAttributes.getInteger(6, -1);
            this.g = obtainStyledAttributes.getInt(5, 0);
            this.h = obtainStyledAttributes.getInt(4, 0);
            this.b = obtainStyledAttributes.hasValue(3);
            if (this.b) {
                this.a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(3));
            }
            obtainStyledAttributes.recycle();
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(this);
            }
        }

        public e(e eVar) {
            super(eVar);
        }

        public e(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* Access modifiers changed, original: final */
        public final void a(int i, boolean z) {
            if (i != 0) {
                if (i == 1) {
                    this.q = z;
                }
                return;
            }
            this.p = z;
        }

        public final void a(b bVar) {
            if (this.a != bVar) {
                this.a = bVar;
                this.r = null;
                this.b = true;
                if (bVar != null) {
                    bVar.a(this);
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean a() {
            return this.k == null && this.f != -1;
        }

        /* Access modifiers changed, original: final */
        public final boolean a(int i) {
            return i != 0 ? i != 1 ? false : this.q : this.p;
        }
    }

    class f implements OnPreDrawListener {
        f() {
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.a(0);
            return true;
        }
    }

    static class h implements Comparator<View> {
        h() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            View view = (View) obj2;
            float z = kb.a.z((View) obj);
            float z2 = kb.a.z(view);
            return z > z2 ? -1 : z < z2 ? 1 : 0;
        }
    }

    public static class g extends jk {
        public static final Creator<g> CREATOR = new ClassLoaderCreator<g>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new g[i];
            }
        };
        SparseArray<Parcelable> a;

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.a = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            i = new h();
        } else {
            i = null;
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new ArrayList();
        this.a = new ky();
        this.l = new ArrayList();
        this.b = new ArrayList();
        this.m = new int[2];
        this.w = new jx(this);
        int i2 = 0;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, defpackage.bz.a.a, 0, R.style.f445Widget.Support.CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, defpackage.bz.a.a, i, 0);
        i = obtainStyledAttributes.getResourceId(0, 0);
        if (i != 0) {
            Resources resources = context.getResources();
            this.p = resources.getIntArray(i);
            float f = resources.getDisplayMetrics().density;
            i = this.p.length;
            while (i2 < i) {
                int[] iArr = this.p;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
                i2++;
            }
        }
        this.u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        c();
        super.setOnHierarchyChangeListener(new d());
    }

    private static Rect a() {
        Rect rect = (Rect) j.a();
        return rect == null ? new Rect() : rect;
    }

    static b a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object str2;
        if (str2.startsWith(".")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(str2);
            str2 = stringBuilder.toString();
        } else if (str2.indexOf(46) < 0 && !TextUtils.isEmpty(f)) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(f);
            stringBuilder2.append('.');
            stringBuilder2.append(str2);
            str2 = stringBuilder2.toString();
        }
        try {
            Map map = (Map) h.get();
            if (map == null) {
                map = new HashMap();
                h.set(map);
            }
            Constructor constructor = (Constructor) map.get(str2);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str2).getConstructor(g);
                constructor.setAccessible(true);
                map.put(str2, constructor);
            }
            return (b) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str2)), e);
        }
    }

    private static void a(int i, Rect rect, Rect rect2, e eVar, int i2, int i3) {
        int i4 = eVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        i4 = jp.a(i4, i);
        i = jp.a(c(eVar.d), i);
        int i5 = i4 & 7;
        i4 &= 112;
        int i6 = i & 7;
        i &= 112;
        i6 = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        i = i != 16 ? i != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i5 == 1) {
            i6 -= i2 / 2;
        } else if (i5 != 5) {
            i6 -= i2;
        }
        if (i4 == 16) {
            i -= i3 / 2;
        } else if (i4 != 80) {
            i -= i3;
        }
        rect2.set(i6, i, i2 + i6, i3 + i);
    }

    private static void a(Rect rect) {
        rect.setEmpty();
        j.a(rect);
    }

    private void a(e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        width = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(width, max, i + width, i2 + max);
    }

    private void a(View view, int i, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        a(i, rect, rect2, eVar, measuredWidth, measuredHeight);
        a(eVar, rect2, measuredWidth, measuredHeight);
    }

    private void a(View view, View view2, int i) {
        view.getLayoutParams();
        Rect a = a();
        Rect a2 = a();
        try {
            li.a((ViewGroup) this, view2, a);
            a(view, i, a, a2);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
        } finally {
            a(a);
            a(a2);
        }
    }

    private void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            li.a((ViewGroup) this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private void a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = ((e) childAt.getLayoutParams()).a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 0);
                if (z) {
                    bVar.a(this, childAt, obtain);
                } else {
                    bVar.b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((e) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.q = null;
        this.n = false;
    }

    private boolean a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.l;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i3 = childCount - 1;
        while (i3 >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
            i3--;
        }
        Comparator comparator = i;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        Object obj = null;
        for (i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            e eVar = (e) view.getLayoutParams();
            b bVar = eVar.a;
            Object obj2 = 1;
            if ((!z && obj == null) || actionMasked == 0) {
                boolean z2;
                if (!(z || bVar == null)) {
                    if (i2 == 0) {
                        z = bVar.a(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = bVar.b(this, view, motionEvent2);
                    }
                    if (z) {
                        this.q = view;
                    }
                }
                if (eVar.a == null) {
                    eVar.m = false;
                }
                boolean z3 = eVar.m;
                if (eVar.m) {
                    z2 = true;
                } else {
                    z2 = eVar.m;
                    eVar.m = z2;
                }
                if (!z2 || z3) {
                    obj2 = null;
                }
                if (z2 && obj2 == null) {
                    break;
                }
                obj = obj2;
            } else if (bVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 0);
                }
                if (i2 == 0) {
                    bVar.a(this, view, motionEvent3);
                } else if (i2 == 1) {
                    bVar.b(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    private int b(int i) {
        StringBuilder stringBuilder;
        int[] iArr = this.p;
        String str = "CoordinatorLayout";
        if (iArr == null) {
            stringBuilder = new StringBuilder("No keylines defined for ");
            stringBuilder.append(this);
            stringBuilder.append(" - attempted index lookup ");
            stringBuilder.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            stringBuilder = new StringBuilder("Keyline index ");
            stringBuilder.append(i);
            stringBuilder.append(" out of range for ");
            stringBuilder.append(this);
        }
        Log.e(str, stringBuilder.toString());
        return 0;
    }

    private static e b(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.b) {
            String str = "CoordinatorLayout";
            if (view instanceof a) {
                b a = ((a) view).a();
                if (a == null) {
                    Log.e(str, "Attached behavior class is null");
                }
                eVar.a(a);
            } else {
                c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (c) cls.getAnnotation(c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.a((b) cVar.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        StringBuilder stringBuilder = new StringBuilder("Default behavior class ");
                        stringBuilder.append(cVar.a().getName());
                        stringBuilder.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e(str, stringBuilder.toString(), e);
                    }
                }
            }
            eVar.b = true;
        }
        return eVar;
    }

    private void b() {
        boolean z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object obj;
            View childAt = getChildAt(i);
            ky kyVar = this.a;
            int size = kyVar.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList arrayList = (ArrayList) kyVar.b.c(i2);
                if (arrayList != null && arrayList.contains(childAt)) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj != null) {
                z = true;
                break;
            }
        }
        z = false;
        if (z != this.t) {
            if (z) {
                if (this.o) {
                    if (this.s == null) {
                        this.s = new f();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.s);
                }
                this.t = true;
                return;
            }
            if (this.o && this.s != null) {
                getViewTreeObserver().removeOnPreDrawListener(this.s);
            }
            this.t = false;
        }
    }

    private void b(View view, int i, int i2) {
        e eVar = (e) view.getLayoutParams();
        int a = jp.a(d(eVar.c), i2);
        int i3 = a & 7;
        a &= 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        i = b(i) - measuredWidth;
        if (i3 == 1) {
            i += measuredWidth / 2;
        } else if (i3 == 5) {
            i += measuredWidth;
        }
        i2 = a != 16 ? a != 80 ? 0 : measuredHeight : (measuredHeight / 2) + 0;
        i = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(i, ((width - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        i2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        view.layout(i, i2, measuredWidth + i, measuredHeight + i2);
    }

    private static int c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private void c() {
        if (VERSION.SDK_INT >= 21) {
            if (kb.a.h(this)) {
                if (this.v == null) {
                    this.v = new jy() {
                        public final kj a(View view, kj kjVar) {
                            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                            if (!jd.a(coordinatorLayout.c, kjVar)) {
                                coordinatorLayout.c = kjVar;
                                boolean z = true;
                                boolean z2 = kjVar != null && kjVar.b() > 0;
                                coordinatorLayout.d = z2;
                                if (coordinatorLayout.d || coordinatorLayout.getBackground() != null) {
                                    z = false;
                                }
                                coordinatorLayout.setWillNotDraw(z);
                                if (!kjVar.e()) {
                                    int childCount = coordinatorLayout.getChildCount();
                                    for (int i = 0; i < childCount; i++) {
                                        View childAt = coordinatorLayout.getChildAt(i);
                                        if (kb.a.h(childAt) && ((e) childAt.getLayoutParams()).a != null && kjVar.e()) {
                                            break;
                                        }
                                    }
                                }
                                coordinatorLayout.requestLayout();
                            }
                            return kjVar;
                        }
                    };
                }
                kb.a((View) this, this.v);
                setSystemUiVisibility(1280);
                return;
            }
            kb.a((View) this, null);
        }
    }

    private static int d(int i) {
        return i == 0 ? 8388661 : i;
    }

    private void d(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        Rect a = a();
        a.set(getPaddingLeft() + eVar.leftMargin, getPaddingTop() + eVar.topMargin, (getWidth() - getPaddingRight()) - eVar.rightMargin, (getHeight() - getPaddingBottom()) - eVar.bottomMargin);
        if (!(this.c == null || !kb.a.h(this) || kb.a.h(view))) {
            a.left += this.c.a();
            a.top += this.c.b();
            a.right -= this.c.c();
            a.bottom -= this.c.d();
        }
        Rect a2 = a();
        jp.a(c(eVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
        view.layout(a2.left, a2.top, a2.right, a2.bottom);
        a(a);
        a(a2);
    }

    private static void e(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.i != i) {
            kb.c(view, i - eVar.i);
            eVar.i = i;
        }
    }

    private static void f(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.j != i) {
            kb.b(view, i - eVar.j);
            eVar.j = i;
        }
    }

    public final List<View> a(View view) {
        List c = this.a.c(view);
        this.b.clear();
        if (c != null) {
            this.b.addAll(c);
        }
        return this.b;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x024f  */
    public final void a(int r25) {
        /*
        r24 = this;
        r0 = r24;
        r1 = r25;
        r2 = defpackage.kb.a;
        r2 = r2.j(r0);
        r3 = r0.k;
        r9 = r3.size();
        r10 = a();
        r11 = a();
        r12 = a();
        r14 = 0;
    L_0x001d:
        if (r14 >= r9) goto L_0x02c2;
    L_0x001f:
        r3 = r0.k;
        r3 = r3.get(r14);
        r15 = r3;
        r15 = (android.view.View) r15;
        r3 = r15.getLayoutParams();
        r8 = r3;
        r8 = (android.support.design.widget.CoordinatorLayout.e) r8;
        if (r1 != 0) goto L_0x0041;
    L_0x0031:
        r3 = r15.getVisibility();
        r4 = 8;
        if (r3 == r4) goto L_0x003a;
    L_0x0039:
        goto L_0x0041;
    L_0x003a:
        r4 = r9;
        r5 = r12;
        r18 = r14;
    L_0x003e:
        r9 = 0;
        goto L_0x02bc;
    L_0x0041:
        r7 = 0;
    L_0x0042:
        if (r7 >= r14) goto L_0x00ed;
    L_0x0044:
        r3 = r0.k;
        r3 = r3.get(r7);
        r3 = (android.view.View) r3;
        r4 = r8.l;
        if (r4 != r3) goto L_0x00d7;
    L_0x0050:
        r3 = r15.getLayoutParams();
        r5 = r3;
        r5 = (android.support.design.widget.CoordinatorLayout.e) r5;
        r3 = r5.k;
        if (r3 == 0) goto L_0x00d7;
    L_0x005b:
        r4 = a();
        r3 = a();
        r13 = a();
        r6 = r5.k;
        defpackage.li.a(r0, r6, r4);
        r6 = 0;
        r0.a(r15, r6, r3);
        r6 = r15.getMeasuredWidth();
        r17 = r9;
        r9 = r15.getMeasuredHeight();
        r18 = r14;
        r14 = r3;
        r3 = r2;
        r19 = r4;
        r20 = r5;
        r5 = r13;
        r21 = r6;
        r16 = r12;
        r12 = 1;
        r6 = r20;
        r22 = r7;
        r7 = r21;
        r23 = r8;
        r8 = r9;
        a(r3, r4, r5, r6, r7, r8);
        r3 = r13.left;
        r4 = r14.left;
        if (r3 != r4) goto L_0x00a7;
    L_0x009a:
        r3 = r13.top;
        r4 = r14.top;
        if (r3 == r4) goto L_0x00a1;
    L_0x00a0:
        goto L_0x00a7;
    L_0x00a1:
        r3 = r20;
        r4 = r21;
        r12 = 0;
        goto L_0x00ab;
    L_0x00a7:
        r3 = r20;
        r4 = r21;
    L_0x00ab:
        r0.a(r3, r13, r4, r9);
        r4 = r13.left;
        r5 = r14.left;
        r4 = r4 - r5;
        r5 = r13.top;
        r6 = r14.top;
        r5 = r5 - r6;
        if (r4 == 0) goto L_0x00bd;
    L_0x00ba:
        defpackage.kb.c(r15, r4);
    L_0x00bd:
        if (r5 == 0) goto L_0x00c2;
    L_0x00bf:
        defpackage.kb.b(r15, r5);
    L_0x00c2:
        if (r12 == 0) goto L_0x00cd;
    L_0x00c4:
        r4 = r3.a;
        if (r4 == 0) goto L_0x00cd;
    L_0x00c8:
        r3 = r3.k;
        r4.a(r0, r15, r3);
    L_0x00cd:
        a(r19);
        a(r14);
        a(r13);
        goto L_0x00e1;
    L_0x00d7:
        r22 = r7;
        r23 = r8;
        r17 = r9;
        r16 = r12;
        r18 = r14;
    L_0x00e1:
        r7 = r22 + 1;
        r12 = r16;
        r9 = r17;
        r14 = r18;
        r8 = r23;
        goto L_0x0042;
    L_0x00ed:
        r23 = r8;
        r17 = r9;
        r16 = r12;
        r18 = r14;
        r12 = 1;
        r0.a(r15, r12, r11);
        r3 = r23;
        r4 = r3.g;
        r5 = 5;
        r6 = 3;
        r7 = 80;
        r8 = 48;
        if (r4 == 0) goto L_0x0153;
    L_0x0105:
        r4 = r11.isEmpty();
        if (r4 != 0) goto L_0x0153;
    L_0x010b:
        r4 = r3.g;
        r4 = defpackage.jp.a(r4, r2);
        r9 = r4 & 112;
        if (r9 == r8) goto L_0x0128;
    L_0x0115:
        if (r9 == r7) goto L_0x0118;
    L_0x0117:
        goto L_0x0132;
    L_0x0118:
        r9 = r10.bottom;
        r13 = r24.getHeight();
        r14 = r11.top;
        r13 = r13 - r14;
        r9 = java.lang.Math.max(r9, r13);
        r10.bottom = r9;
        goto L_0x0132;
    L_0x0128:
        r9 = r10.top;
        r13 = r11.bottom;
        r9 = java.lang.Math.max(r9, r13);
        r10.top = r9;
    L_0x0132:
        r4 = r4 & 7;
        if (r4 == r6) goto L_0x0149;
    L_0x0136:
        if (r4 == r5) goto L_0x0139;
    L_0x0138:
        goto L_0x0153;
    L_0x0139:
        r4 = r10.right;
        r9 = r24.getWidth();
        r13 = r11.left;
        r9 = r9 - r13;
        r4 = java.lang.Math.max(r4, r9);
        r10.right = r4;
        goto L_0x0153;
    L_0x0149:
        r4 = r10.left;
        r9 = r11.right;
        r4 = java.lang.Math.max(r4, r9);
        r10.left = r4;
    L_0x0153:
        r3 = r3.h;
        if (r3 == 0) goto L_0x0256;
    L_0x0157:
        r3 = r15.getVisibility();
        if (r3 != 0) goto L_0x0256;
    L_0x015d:
        r3 = defpackage.kb.a;
        r3 = r3.q(r15);
        if (r3 == 0) goto L_0x0256;
    L_0x0165:
        r3 = r15.getWidth();
        if (r3 <= 0) goto L_0x0256;
    L_0x016b:
        r3 = r15.getHeight();
        if (r3 > 0) goto L_0x0173;
    L_0x0171:
        goto L_0x0256;
    L_0x0173:
        r3 = r15.getLayoutParams();
        r3 = (android.support.design.widget.CoordinatorLayout.e) r3;
        r4 = r3.a;
        r9 = a();
        r13 = a();
        r14 = r15.getLeft();
        r12 = r15.getTop();
        r5 = r15.getRight();
        r6 = r15.getBottom();
        r13.set(r14, r12, r5, r6);
        if (r4 == 0) goto L_0x01c9;
    L_0x0198:
        r4 = r4.a(r15, r9);
        if (r4 == 0) goto L_0x01c9;
    L_0x019e:
        r4 = r13.contains(r9);
        if (r4 == 0) goto L_0x01a5;
    L_0x01a4:
        goto L_0x01cc;
    L_0x01a5:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = "Rect should be within the child's bounds. Rect:";
        r2.<init>(r3);
        r3 = r9.toShortString();
        r2.append(r3);
        r3 = " | Bounds:";
        r2.append(r3);
        r3 = r13.toShortString();
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x01c9:
        r9.set(r13);
    L_0x01cc:
        a(r13);
        r4 = r9.isEmpty();
        if (r4 != 0) goto L_0x0253;
    L_0x01d5:
        r4 = r3.h;
        r4 = defpackage.jp.a(r4, r2);
        r5 = r4 & 48;
        if (r5 != r8) goto L_0x01f3;
    L_0x01df:
        r5 = r9.top;
        r6 = r3.topMargin;
        r5 = r5 - r6;
        r6 = r3.j;
        r5 = r5 - r6;
        r6 = r10.top;
        if (r5 >= r6) goto L_0x01f3;
    L_0x01eb:
        r6 = r10.top;
        r6 = r6 - r5;
        f(r15, r6);
        r6 = 1;
        goto L_0x01f4;
    L_0x01f3:
        r6 = 0;
    L_0x01f4:
        r5 = r4 & 80;
        if (r5 != r7) goto L_0x0210;
    L_0x01f8:
        r5 = r24.getHeight();
        r7 = r9.bottom;
        r5 = r5 - r7;
        r7 = r3.bottomMargin;
        r5 = r5 - r7;
        r7 = r3.j;
        r5 = r5 + r7;
        r7 = r10.bottom;
        if (r5 >= r7) goto L_0x0210;
    L_0x0209:
        r6 = r10.bottom;
        r5 = r5 - r6;
        f(r15, r5);
        r6 = 1;
    L_0x0210:
        if (r6 != 0) goto L_0x0216;
    L_0x0212:
        r5 = 0;
        f(r15, r5);
    L_0x0216:
        r5 = r4 & 3;
        r6 = 3;
        if (r5 != r6) goto L_0x022f;
    L_0x021b:
        r5 = r9.left;
        r6 = r3.leftMargin;
        r5 = r5 - r6;
        r6 = r3.i;
        r5 = r5 - r6;
        r6 = r10.left;
        if (r5 >= r6) goto L_0x022f;
    L_0x0227:
        r6 = r10.left;
        r6 = r6 - r5;
        e(r15, r6);
        r6 = 1;
        goto L_0x0230;
    L_0x022f:
        r6 = 0;
    L_0x0230:
        r4 = r4 & 5;
        r5 = 5;
        if (r4 != r5) goto L_0x024d;
    L_0x0235:
        r4 = r24.getWidth();
        r5 = r9.right;
        r4 = r4 - r5;
        r5 = r3.rightMargin;
        r4 = r4 - r5;
        r3 = r3.i;
        r4 = r4 + r3;
        r3 = r10.right;
        if (r4 >= r3) goto L_0x024d;
    L_0x0246:
        r3 = r10.right;
        r4 = r4 - r3;
        e(r15, r4);
        r6 = 1;
    L_0x024d:
        if (r6 != 0) goto L_0x0253;
    L_0x024f:
        r3 = 0;
        e(r15, r3);
    L_0x0253:
        a(r9);
    L_0x0256:
        r3 = 2;
        if (r1 == r3) goto L_0x027c;
    L_0x0259:
        r4 = r15.getLayoutParams();
        r4 = (android.support.design.widget.CoordinatorLayout.e) r4;
        r4 = r4.o;
        r5 = r16;
        r5.set(r4);
        r4 = r5.equals(r11);
        if (r4 != 0) goto L_0x0278;
    L_0x026c:
        r4 = r15.getLayoutParams();
        r4 = (android.support.design.widget.CoordinatorLayout.e) r4;
        r4 = r4.o;
        r4.set(r11);
        goto L_0x027e;
    L_0x0278:
        r4 = r17;
        goto L_0x003e;
    L_0x027c:
        r5 = r16;
    L_0x027e:
        r14 = r18 + 1;
        r4 = r17;
    L_0x0282:
        if (r14 >= r4) goto L_0x003e;
    L_0x0284:
        r6 = r0.k;
        r6 = r6.get(r14);
        r6 = (android.view.View) r6;
        r7 = r6.getLayoutParams();
        r7 = (android.support.design.widget.CoordinatorLayout.e) r7;
        r8 = r7.a;
        if (r8 == 0) goto L_0x02b7;
    L_0x0296:
        r9 = r8.a_(r15);
        if (r9 == 0) goto L_0x02b7;
    L_0x029c:
        if (r1 != 0) goto L_0x02a7;
    L_0x029e:
        r9 = r7.n;
        if (r9 == 0) goto L_0x02a7;
    L_0x02a2:
        r9 = 0;
        r7.n = r9;
        r8 = 1;
        goto L_0x02b9;
    L_0x02a7:
        r9 = 0;
        if (r1 == r3) goto L_0x02b0;
    L_0x02aa:
        r6 = r8.a(r0, r6, r15);
    L_0x02ae:
        r8 = 1;
        goto L_0x02b2;
    L_0x02b0:
        r6 = 1;
        goto L_0x02ae;
    L_0x02b2:
        if (r1 != r8) goto L_0x02b9;
    L_0x02b4:
        r7.n = r6;
        goto L_0x02b9;
    L_0x02b7:
        r8 = 1;
        r9 = 0;
    L_0x02b9:
        r14 = r14 + 1;
        goto L_0x0282;
    L_0x02bc:
        r14 = r18 + 1;
        r9 = r4;
        r12 = r5;
        goto L_0x001d;
    L_0x02c2:
        r5 = r12;
        a(r10);
        a(r11);
        a(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.a(int):void");
    }

    public final void a(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (eVar.k != null) {
            a(view, eVar.k, i);
        } else if (eVar.e >= 0) {
            b(view, eVar.e, i);
        } else {
            d(view, i);
        }
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        Object obj = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i5)) {
                    b bVar = eVar.a;
                    if (bVar != null) {
                        bVar.a(this, childAt, view, i, i2, i3, i4, i5);
                        obj = 1;
                    }
                }
            } else {
                int i7 = i5;
            }
        }
        if (obj != null) {
            a(1);
        }
    }

    public final void a(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        Object obj = null;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i3)) {
                    b bVar = eVar.a;
                    if (bVar != null) {
                        int[] iArr2 = this.m;
                        iArr2[1] = 0;
                        iArr2[0] = 0;
                        bVar.a(this, childAt, view, i, i2, iArr2, i3);
                        i4 = i > 0 ? Math.max(i4, this.m[0]) : Math.min(i4, this.m[0]);
                        i5 = i2 > 0 ? Math.max(i5, this.m[1]) : Math.min(i5, this.m[1]);
                        obj = 1;
                    }
                }
            } else {
                int i7 = i3;
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (obj != null) {
            a(1);
        }
    }

    public final boolean a(View view, int i, int i2) {
        Rect a = a();
        li.a((ViewGroup) this, view, a);
        try {
            boolean contains = a.contains(i, i2);
            return contains;
        } finally {
            a(a);
        }
    }

    public final boolean a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.a;
                if (bVar != null) {
                    boolean a = bVar.a(this, childAt, view, view2, i, i2);
                    int i6 = i4 | a;
                    eVar.a(i3, a);
                    i4 = i6;
                } else {
                    eVar.a(i3, false);
                }
            }
        }
        return i4;
    }

    public final void b(View view, int i) {
        this.w.a = i;
        this.r = view;
        int childCount = getChildCount();
        for (i = 0; i < childCount; i++) {
            getChildAt(i).getLayoutParams();
        }
    }

    public final void c(View view, int i) {
        this.w.a = 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i)) {
                b bVar = eVar.a;
                if (bVar != null) {
                    bVar.a(this, childAt, view, i);
                }
                eVar.a(i, false);
                eVar.n = false;
            }
        }
        this.r = null;
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = 0 | drawable.setState(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    /* Access modifiers changed, original: protected|synthetic */
    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public int getNestedScrollAxes() {
        return this.w.a;
    }

    /* Access modifiers changed, original: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* Access modifiers changed, original: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        if (this.t) {
            if (this.s == null) {
                this.s = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.c == null && kb.a.h(this)) {
            kb.a.g(this);
        }
        this.o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        View view = this.r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.o = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d && this.u != null) {
            kj kjVar = this.c;
            int b = kjVar != null ? kjVar.b() : 0;
            if (b > 0) {
                this.u.setBounds(0, 0, getWidth(), b);
                this.u.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(true);
        }
        boolean a = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            a(true);
        }
        return a;
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int j = kb.a.j(this);
        i = this.k.size();
        for (i2 = 0; i2 < i; i2++) {
            View view = (View) this.k.get(i2);
            if (view.getVisibility() != 8) {
                b bVar = ((e) view.getLayoutParams()).a;
                if (bVar == null || !bVar.a(this, view, j)) {
                    a(view, j);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0161 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02bb  */
    /* JADX WARNING: Missing block: B:27:0x007b, code skipped:
            if (r5 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Missing block: B:130:0x02b8, code skipped:
            if (r0.a(r31, r27, r24, r20, r25, 0) == false) goto L_0x02c9;
     */
    public void onMeasure(int r32, int r33) {
        /*
        r31 = this;
        r7 = r31;
        r0 = r7.k;
        r0.clear();
        r0 = r7.a;
        r1 = r0.b;
        r1 = r1.size();
        r2 = 0;
    L_0x0010:
        if (r2 >= r1) goto L_0x0027;
    L_0x0012:
        r3 = r0.b;
        r3 = r3.c(r2);
        r3 = (java.util.ArrayList) r3;
        if (r3 == 0) goto L_0x0024;
    L_0x001c:
        r3.clear();
        r4 = r0.a;
        r4.a(r3);
    L_0x0024:
        r2 = r2 + 1;
        goto L_0x0010;
    L_0x0027:
        r0 = r0.b;
        r0.clear();
        r0 = r31.getChildCount();
        r1 = 0;
    L_0x0031:
        r2 = 1;
        if (r1 >= r0) goto L_0x018f;
    L_0x0034:
        r3 = r7.getChildAt(r1);
        r4 = b(r3);
        r5 = r4.f;
        r6 = -1;
        r9 = 0;
        if (r5 != r6) goto L_0x0048;
    L_0x0042:
        r4.l = r9;
        r4.k = r9;
        goto L_0x00d0;
    L_0x0048:
        r5 = r4.k;
        if (r5 == 0) goto L_0x007d;
    L_0x004c:
        r5 = r4.k;
        r5 = r5.getId();
        r6 = r4.f;
        if (r5 == r6) goto L_0x0058;
    L_0x0056:
        r5 = 0;
        goto L_0x007b;
    L_0x0058:
        r5 = r4.k;
        r6 = r4.k;
        r6 = r6.getParent();
    L_0x0060:
        if (r6 == r7) goto L_0x0078;
    L_0x0062:
        if (r6 == 0) goto L_0x0073;
    L_0x0064:
        if (r6 != r3) goto L_0x0067;
    L_0x0066:
        goto L_0x0073;
    L_0x0067:
        r10 = r6 instanceof android.view.View;
        if (r10 == 0) goto L_0x006e;
    L_0x006b:
        r5 = r6;
        r5 = (android.view.View) r5;
    L_0x006e:
        r6 = r6.getParent();
        goto L_0x0060;
    L_0x0073:
        r4.l = r9;
        r4.k = r9;
        goto L_0x0056;
    L_0x0078:
        r4.l = r5;
        r5 = 1;
    L_0x007b:
        if (r5 != 0) goto L_0x00d0;
    L_0x007d:
        r5 = r4.f;
        r5 = r7.findViewById(r5);
        r4.k = r5;
        r5 = r4.k;
        if (r5 == 0) goto L_0x00c8;
    L_0x0089:
        r5 = r4.k;
        if (r5 != r7) goto L_0x009c;
    L_0x008d:
        r5 = r31.isInEditMode();
        if (r5 == 0) goto L_0x0094;
    L_0x0093:
        goto L_0x0042;
    L_0x0094:
        r0 = new java.lang.IllegalStateException;
        r1 = "View can not be anchored to the the parent CoordinatorLayout";
        r0.<init>(r1);
        throw r0;
    L_0x009c:
        r5 = r4.k;
        r6 = r4.k;
        r6 = r6.getParent();
    L_0x00a4:
        if (r6 == r7) goto L_0x00c5;
    L_0x00a6:
        if (r6 == 0) goto L_0x00c5;
    L_0x00a8:
        if (r6 != r3) goto L_0x00b9;
    L_0x00aa:
        r5 = r31.isInEditMode();
        if (r5 == 0) goto L_0x00b1;
    L_0x00b0:
        goto L_0x0042;
    L_0x00b1:
        r0 = new java.lang.IllegalStateException;
        r1 = "Anchor must not be a descendant of the anchored view";
        r0.<init>(r1);
        throw r0;
    L_0x00b9:
        r10 = r6 instanceof android.view.View;
        if (r10 == 0) goto L_0x00c0;
    L_0x00bd:
        r5 = r6;
        r5 = (android.view.View) r5;
    L_0x00c0:
        r6 = r6.getParent();
        goto L_0x00a4;
    L_0x00c5:
        r4.l = r5;
        goto L_0x00d0;
    L_0x00c8:
        r5 = r31.isInEditMode();
        if (r5 == 0) goto L_0x0169;
    L_0x00ce:
        goto L_0x0042;
    L_0x00d0:
        r5 = r7.a;
        r5.a(r3);
        r5 = 0;
    L_0x00d6:
        if (r5 >= r0) goto L_0x0165;
    L_0x00d8:
        if (r5 == r1) goto L_0x0161;
    L_0x00da:
        r6 = r7.getChildAt(r5);
        r9 = r4.l;
        if (r6 == r9) goto L_0x0113;
    L_0x00e2:
        r9 = defpackage.kb.a;
        r9 = r9.j(r7);
        r10 = r6.getLayoutParams();
        r10 = (android.support.design.widget.CoordinatorLayout.e) r10;
        r10 = r10.g;
        r10 = defpackage.jp.a(r10, r9);
        if (r10 == 0) goto L_0x0101;
    L_0x00f6:
        r11 = r4.h;
        r9 = defpackage.jp.a(r11, r9);
        r9 = r9 & r10;
        if (r9 != r10) goto L_0x0101;
    L_0x00ff:
        r9 = 1;
        goto L_0x0102;
    L_0x0101:
        r9 = 0;
    L_0x0102:
        if (r9 != 0) goto L_0x0113;
    L_0x0104:
        r9 = r4.a;
        if (r9 == 0) goto L_0x0111;
    L_0x0108:
        r9 = r4.a;
        r9 = r9.a_(r6);
        if (r9 == 0) goto L_0x0111;
    L_0x0110:
        goto L_0x0113;
    L_0x0111:
        r9 = 0;
        goto L_0x0114;
    L_0x0113:
        r9 = 1;
    L_0x0114:
        if (r9 == 0) goto L_0x0161;
    L_0x0116:
        r9 = r7.a;
        r9 = r9.b;
        r9 = r9.containsKey(r6);
        if (r9 != 0) goto L_0x0125;
    L_0x0120:
        r9 = r7.a;
        r9.a(r6);
    L_0x0125:
        r9 = r7.a;
        r10 = r9.b;
        r10 = r10.containsKey(r6);
        if (r10 == 0) goto L_0x0159;
    L_0x012f:
        r10 = r9.b;
        r10 = r10.containsKey(r3);
        if (r10 == 0) goto L_0x0159;
    L_0x0137:
        r10 = r9.b;
        r10 = r10.get(r6);
        r10 = (java.util.ArrayList) r10;
        if (r10 != 0) goto L_0x0155;
    L_0x0141:
        r10 = r9.a;
        r10 = r10.a();
        r10 = (java.util.ArrayList) r10;
        if (r10 != 0) goto L_0x0150;
    L_0x014b:
        r10 = new java.util.ArrayList;
        r10.<init>();
    L_0x0150:
        r9 = r9.b;
        r9.put(r6, r10);
    L_0x0155:
        r10.add(r3);
        goto L_0x0161;
    L_0x0159:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "All nodes must be present in the graph before being added as an edge";
        r0.<init>(r1);
        throw r0;
    L_0x0161:
        r5 = r5 + 1;
        goto L_0x00d6;
    L_0x0165:
        r1 = r1 + 1;
        goto L_0x0031;
    L_0x0169:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Could not find CoordinatorLayout descendant view with id ";
        r1.<init>(r2);
        r2 = r31.getResources();
        r4 = r4.f;
        r2 = r2.getResourceName(r4);
        r1.append(r2);
        r2 = " to anchor view ";
        r1.append(r2);
        r1.append(r3);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x018f:
        r0 = r7.k;
        r1 = r7.a;
        r1 = r1.a();
        r0.addAll(r1);
        r0 = r7.k;
        java.util.Collections.reverse(r0);
        r31.b();
        r9 = r31.getPaddingLeft();
        r0 = r31.getPaddingTop();
        r10 = r31.getPaddingRight();
        r1 = r31.getPaddingBottom();
        r3 = defpackage.kb.a;
        r11 = r3.j(r7);
        if (r11 != r2) goto L_0x01bc;
    L_0x01ba:
        r12 = 1;
        goto L_0x01bd;
    L_0x01bc:
        r12 = 0;
    L_0x01bd:
        r13 = android.view.View.MeasureSpec.getMode(r32);
        r14 = android.view.View.MeasureSpec.getSize(r32);
        r15 = android.view.View.MeasureSpec.getMode(r33);
        r16 = android.view.View.MeasureSpec.getSize(r33);
        r17 = r9 + r10;
        r18 = r0 + r1;
        r0 = r31.getSuggestedMinimumWidth();
        r1 = r31.getSuggestedMinimumHeight();
        r3 = r7.c;
        if (r3 == 0) goto L_0x01e8;
    L_0x01dd:
        r3 = defpackage.kb.a;
        r3 = r3.h(r7);
        if (r3 == 0) goto L_0x01e8;
    L_0x01e5:
        r19 = 1;
        goto L_0x01ea;
    L_0x01e8:
        r19 = 0;
    L_0x01ea:
        r2 = r7.k;
        r6 = r2.size();
        r4 = r0;
        r2 = r1;
        r3 = 0;
        r5 = 0;
    L_0x01f4:
        if (r5 >= r6) goto L_0x0317;
    L_0x01f6:
        r0 = r7.k;
        r0 = r0.get(r5);
        r1 = r0;
        r1 = (android.view.View) r1;
        r0 = r1.getVisibility();
        r8 = 8;
        if (r0 == r8) goto L_0x0309;
    L_0x0207:
        r0 = r1.getLayoutParams();
        r8 = r0;
        r8 = (android.support.design.widget.CoordinatorLayout.e) r8;
        r0 = r8.e;
        if (r0 < 0) goto L_0x0252;
    L_0x0212:
        if (r13 == 0) goto L_0x0252;
    L_0x0214:
        r0 = r8.e;
        r0 = r7.b(r0);
        r21 = r2;
        r2 = r8.c;
        r2 = d(r2);
        r2 = defpackage.jp.a(r2, r11);
        r2 = r2 & 7;
        r22 = r3;
        r3 = 3;
        if (r2 != r3) goto L_0x022f;
    L_0x022d:
        if (r12 == 0) goto L_0x0234;
    L_0x022f:
        r3 = 5;
        if (r2 != r3) goto L_0x0240;
    L_0x0232:
        if (r12 == 0) goto L_0x0240;
    L_0x0234:
        r2 = r14 - r10;
        r2 = r2 - r0;
        r0 = 0;
        r2 = java.lang.Math.max(r0, r2);
        r20 = r2;
        r3 = 0;
        goto L_0x0259;
    L_0x0240:
        if (r2 != r3) goto L_0x0244;
    L_0x0242:
        if (r12 == 0) goto L_0x0249;
    L_0x0244:
        r3 = 3;
        if (r2 != r3) goto L_0x0256;
    L_0x0247:
        if (r12 == 0) goto L_0x0256;
    L_0x0249:
        r0 = r0 - r9;
        r3 = 0;
        r0 = java.lang.Math.max(r3, r0);
        r20 = r0;
        goto L_0x0259;
    L_0x0252:
        r21 = r2;
        r22 = r3;
    L_0x0256:
        r3 = 0;
        r20 = 0;
    L_0x0259:
        if (r19 == 0) goto L_0x028e;
    L_0x025b:
        r0 = defpackage.kb.a;
        r0 = r0.h(r1);
        if (r0 != 0) goto L_0x028e;
    L_0x0263:
        r0 = r7.c;
        r0 = r0.a();
        r2 = r7.c;
        r2 = r2.c();
        r0 = r0 + r2;
        r2 = r7.c;
        r2 = r2.b();
        r3 = r7.c;
        r3 = r3.d();
        r2 = r2 + r3;
        r0 = r14 - r0;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13);
        r2 = r16 - r2;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15);
        r24 = r0;
        r25 = r2;
        goto L_0x0292;
    L_0x028e:
        r24 = r32;
        r25 = r33;
    L_0x0292:
        r0 = r8.a;
        if (r0 == 0) goto L_0x02bb;
    L_0x0296:
        r26 = 0;
        r27 = r1;
        r1 = r31;
        r3 = r21;
        r2 = r27;
        r29 = r3;
        r28 = r22;
        r21 = 0;
        r3 = r24;
        r30 = r4;
        r4 = r20;
        r22 = r5;
        r5 = r25;
        r23 = r6;
        r6 = r26;
        r0 = r0.a(r1, r2, r3, r4, r5, r6);
        if (r0 != 0) goto L_0x02d7;
    L_0x02ba:
        goto L_0x02c9;
    L_0x02bb:
        r27 = r1;
        r30 = r4;
        r23 = r6;
        r29 = r21;
        r28 = r22;
        r21 = 0;
        r22 = r5;
    L_0x02c9:
        r5 = 0;
        r0 = r31;
        r1 = r27;
        r2 = r24;
        r3 = r20;
        r4 = r25;
        r0.a(r1, r2, r3, r4, r5);
    L_0x02d7:
        r0 = r27.getMeasuredWidth();
        r0 = r17 + r0;
        r1 = r8.leftMargin;
        r0 = r0 + r1;
        r1 = r8.rightMargin;
        r0 = r0 + r1;
        r1 = r30;
        r0 = java.lang.Math.max(r1, r0);
        r1 = r27.getMeasuredHeight();
        r1 = r18 + r1;
        r2 = r8.topMargin;
        r1 = r1 + r2;
        r2 = r8.bottomMargin;
        r1 = r1 + r2;
        r2 = r29;
        r1 = java.lang.Math.max(r2, r1);
        r2 = r27.getMeasuredState();
        r8 = r28;
        r2 = android.view.View.combineMeasuredStates(r8, r2);
        r4 = r0;
        r3 = r2;
        r2 = r1;
        goto L_0x0311;
    L_0x0309:
        r8 = r3;
        r1 = r4;
        r22 = r5;
        r23 = r6;
        r21 = 0;
    L_0x0311:
        r5 = r22 + 1;
        r6 = r23;
        goto L_0x01f4;
    L_0x0317:
        r8 = r3;
        r1 = r4;
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0 = r0 & r8;
        r3 = r32;
        r0 = android.view.View.resolveSizeAndState(r1, r3, r0);
        r1 = r8 << 16;
        r3 = r33;
        r1 = android.view.View.resolveSizeAndState(r2, r3, r1);
        r7.setMeasuredDimension(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.a;
                    if (bVar != null) {
                        i |= bVar.a(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return i;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        a(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        b(view2, i);
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof g) {
            g gVar = (g) parcelable;
            super.onRestoreInstanceState(gVar.getSuperState());
            SparseArray sparseArray = gVar.a;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                b bVar = b(childAt).a;
                if (!(id == -1 || bVar == null)) {
                    Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                    if (parcelable2 != null) {
                        bVar.a(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).a;
            if (!(id == -1 || bVar == null)) {
                Parcelable b = bVar.b(this, childAt);
                if (b != null) {
                    sparseArray.append(id, b);
                }
            }
        }
        gVar.a = sparseArray;
        return gVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return a(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        c(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Missing block: B:3:0x0012, code skipped:
            if (r3 != false) goto L_0x0016;
     */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r18.getActionMasked();
        r3 = r0.q;
        r4 = 1;
        r5 = 0;
        if (r3 != 0) goto L_0x0015;
    L_0x000e:
        r3 = r0.a(r1, r4);
        if (r3 == 0) goto L_0x0029;
    L_0x0014:
        goto L_0x0016;
    L_0x0015:
        r3 = 0;
    L_0x0016:
        r6 = r0.q;
        r6 = r6.getLayoutParams();
        r6 = (android.support.design.widget.CoordinatorLayout.e) r6;
        r6 = r6.a;
        if (r6 == 0) goto L_0x0029;
    L_0x0022:
        r7 = r0.q;
        r6 = r6.b(r0, r7, r1);
        goto L_0x002a;
    L_0x0029:
        r6 = 0;
    L_0x002a:
        r7 = r0.q;
        r8 = 0;
        if (r7 != 0) goto L_0x0035;
    L_0x002f:
        r1 = super.onTouchEvent(r18);
        r6 = r6 | r1;
        goto L_0x0048;
    L_0x0035:
        if (r3 == 0) goto L_0x0048;
    L_0x0037:
        r11 = android.os.SystemClock.uptimeMillis();
        r13 = 3;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r9 = r11;
        r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16);
        super.onTouchEvent(r8);
    L_0x0048:
        if (r8 == 0) goto L_0x004d;
    L_0x004a:
        r8.recycle();
    L_0x004d:
        if (r2 == r4) goto L_0x0052;
    L_0x004f:
        r1 = 3;
        if (r2 != r1) goto L_0x0055;
    L_0x0052:
        r0.a(r5);
    L_0x0055:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        b bVar = ((e) view.getLayoutParams()).a;
        return (bVar == null || !bVar.a(this, view, rect, z)) ? super.requestChildRectangleOnScreen(view, rect, z) : true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.n) {
            a(false);
            this.n = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        c();
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.e = onHierarchyChangeListener;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.u;
        if (drawable != null && drawable.isVisible() != z) {
            this.u.setVisible(z, false);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }
}
