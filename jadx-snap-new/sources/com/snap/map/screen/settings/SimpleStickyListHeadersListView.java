package com.snap.map.screen.settings;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.snapchat.android.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Deprecated
public class SimpleStickyListHeadersListView extends FrameLayout {
    public g a;
    View b;
    public OnScrollListener c;
    public a d;
    boolean e;
    int f;
    public b g;
    public Drawable h;
    public int i;
    private Long j;
    private Integer k;
    private Integer l;
    private int m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private final float r;

    public class b extends DataSetObserver {
        private b() {
        }

        public /* synthetic */ b(SimpleStickyListHeadersListView simpleStickyListHeadersListView, byte b) {
            this();
        }

        public final void onChanged() {
            SimpleStickyListHeadersListView.this.a();
        }

        public final void onInvalidated() {
            SimpleStickyListHeadersListView.this.a();
        }
    }

    static class c extends BaseSavedState {
        public static final Creator<c> CREATOR = new a();
        final Parcelable a;

        @TargetApi(13)
        static class a implements ClassLoaderCreator<c>, Creator<c> {
            private a() {
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel, null, (byte) 0);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader, (byte) 0);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }
        }

        private c(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = null;
            }
            this.a = parcel.readParcelable(classLoader);
        }

        /* synthetic */ c(Parcel parcel, ClassLoader classLoader, byte b) {
            this(parcel, classLoader);
        }

        public c(Parcelable parcelable, Parcelable parcelable2) {
            super(parcelable);
            this.a = parcelable2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, i);
        }
    }

    public interface d extends ListAdapter {
        long a(int i);

        View a(int i, View view, ViewGroup viewGroup);
    }

    class e implements OnScrollListener {
        private e() {
        }

        /* synthetic */ e(SimpleStickyListHeadersListView simpleStickyListHeadersListView, byte b) {
            this();
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (SimpleStickyListHeadersListView.this.c != null) {
                SimpleStickyListHeadersListView.this.c.onScroll(absListView, i, i2, i3);
            }
            SimpleStickyListHeadersListView simpleStickyListHeadersListView = SimpleStickyListHeadersListView.this;
            SimpleStickyListHeadersListView.a(simpleStickyListHeadersListView, simpleStickyListHeadersListView.a.getFirstVisiblePosition());
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (SimpleStickyListHeadersListView.this.c != null) {
                SimpleStickyListHeadersListView.this.c.onScrollStateChanged(absListView, i);
            }
        }
    }

    public static class f extends ViewGroup {
        View a;
        Drawable b;
        int c;
        View d;
        int e;

        f(Context context) {
            super(context);
        }

        public final boolean a() {
            return this.d != null;
        }

        /* Access modifiers changed, original: protected|final */
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.d == null && this.b != null && this.a.getVisibility() != 8) {
                this.b.draw(canvas);
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int width = getWidth();
            i = getHeight();
            View view = this.d;
            if (view != null) {
                i2 = view.getMeasuredHeight();
                this.d.layout(0, 0, width, i2);
                this.e = i2;
                this.a.layout(0, i2, width, i);
                return;
            }
            Drawable drawable = this.b;
            if (drawable != null) {
                drawable.setBounds(0, 0, width, this.c);
                i2 = this.c;
                this.e = i2;
                this.a.layout(0, i2, width, i);
                return;
            }
            this.e = 0;
            this.a.layout(0, 0, width, i);
        }

        /* Access modifiers changed, original: protected|final */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
        public final void onMeasure(int r7, int r8) {
            /*
            r6 = this;
            r7 = android.view.View.MeasureSpec.getSize(r7);
            r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8);
            r1 = r6.d;
            r2 = 8;
            r3 = 0;
            if (r1 == 0) goto L_0x0037;
        L_0x0011:
            r1 = r1.getLayoutParams();
            if (r1 == 0) goto L_0x0027;
        L_0x0017:
            r4 = r1.height;
            if (r4 <= 0) goto L_0x0027;
        L_0x001b:
            r4 = r6.d;
            r1 = r1.height;
            r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8);
            r4.measure(r0, r1);
            goto L_0x0030;
        L_0x0027:
            r1 = r6.d;
            r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3);
            r1.measure(r0, r4);
        L_0x0030:
            r1 = r6.d;
            r1 = r1.getMeasuredHeight();
            goto L_0x0045;
        L_0x0037:
            r1 = r6.b;
            if (r1 == 0) goto L_0x0047;
        L_0x003b:
            r1 = r6.a;
            r1 = r1.getVisibility();
            if (r1 == r2) goto L_0x0047;
        L_0x0043:
            r1 = r6.c;
        L_0x0045:
            r1 = r1 + r3;
            goto L_0x0048;
        L_0x0047:
            r1 = 0;
        L_0x0048:
            r4 = r6.a;
            r4 = r4.getLayoutParams();
            r5 = r6.a;
            r5 = r5.getVisibility();
            if (r5 != r2) goto L_0x0060;
        L_0x0056:
            r2 = r6.a;
            r8 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8);
            r2.measure(r0, r8);
            goto L_0x0082;
        L_0x0060:
            if (r4 == 0) goto L_0x0072;
        L_0x0062:
            r2 = r4.height;
            if (r2 < 0) goto L_0x0072;
        L_0x0066:
            r2 = r6.a;
            r3 = r4.height;
            r8 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8);
            r2.measure(r0, r8);
            goto L_0x007b;
        L_0x0072:
            r8 = r6.a;
            r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3);
            r8.measure(r0, r2);
        L_0x007b:
            r8 = r6.a;
            r8 = r8.getMeasuredHeight();
            r1 = r1 + r8;
        L_0x0082:
            r6.setMeasuredDimension(r7, r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.map.screen.settings.SimpleStickyListHeadersListView$f.onMeasure(int, int):void");
        }
    }

    public static class g extends ListView {
        a a;
        List<View> b;
        int c;
        private Rect d = new Rect();
        private Field e;

        interface a {
            void a(Canvas canvas);
        }

        public g(Context context) {
            super(context);
            try {
                Field declaredField = AbsListView.class.getDeclaredField("mSelectorRect");
                declaredField.setAccessible(true);
                this.d = (Rect) declaredField.get(this);
                this.e = AbsListView.class.getDeclaredField("mSelectorPosition");
                this.e.setAccessible(true);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            }
        }

        private int a() {
            Field field = this.e;
            if (field == null) {
                for (int i = 0; i < getChildCount(); i++) {
                    if (getChildAt(i).getBottom() == this.d.bottom) {
                        return i + getFirstVisiblePosition();
                    }
                }
            } else {
                try {
                    return field.getInt(this);
                } catch (IllegalAccessException | IllegalArgumentException unused) {
                }
            }
            return -1;
        }

        private void a(View view) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(view);
        }

        public final void addFooterView(View view) {
            super.addFooterView(view);
            a(view);
        }

        public final void addFooterView(View view, Object obj, boolean z) {
            super.addFooterView(view, obj, z);
            a(view);
        }

        /* Access modifiers changed, original: protected|final */
        public final void dispatchDraw(Canvas canvas) {
            if (!this.d.isEmpty()) {
                int a = a();
                if (a >= 0) {
                    View childAt = getChildAt(a - getFirstVisiblePosition());
                    if (childAt instanceof f) {
                        f fVar = (f) childAt;
                        this.d.top = fVar.getTop() + fVar.e;
                    }
                }
            }
            super.dispatchDraw(canvas);
            this.a.a(canvas);
        }

        public final boolean performItemClick(View view, int i, long j) {
            if (view instanceof f) {
                view = ((f) view).a;
            }
            return super.performItemClick(view, i, j);
        }

        public final boolean removeFooterView(View view) {
            if (!super.removeFooterView(view)) {
                return false;
            }
            this.b.remove(view);
            return true;
        }
    }

    public static class a extends BaseAdapter implements d {
        public d a;
        final List<View> b = new LinkedList();
        public Drawable c;
        public int d;
        private final Context e;

        public a(Context context, d dVar) {
            this.e = context;
            this.a = dVar;
            dVar.registerDataSetObserver(new DataSetObserver() {
                public final void onChanged() {
                    super.notifyDataSetChanged();
                }

                public final void onInvalidated() {
                    a.this.b.clear();
                    super.notifyDataSetInvalidated();
                }
            });
        }

        public final long a(int i) {
            return this.a.a(i);
        }

        public final View a(int i, View view, ViewGroup viewGroup) {
            return this.a.a(i, view, viewGroup);
        }

        public final boolean areAllItemsEnabled() {
            return this.a.areAllItemsEnabled();
        }

        public final boolean equals(Object obj) {
            return this.a.equals(obj);
        }

        public final int getCount() {
            return this.a.getCount();
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return ((BaseAdapter) this.a).getDropDownView(i, view, viewGroup);
        }

        public final Object getItem(int i) {
            return this.a.getItem(i);
        }

        public final long getItemId(int i) {
            return this.a.getItemId(i);
        }

        public final int getItemViewType(int i) {
            return this.a.getItemViewType(i);
        }

        public final /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
            ViewParent fVar = view == null ? new f(this.e) : (f) view;
            View view2 = this.a.getView(i, fVar.a, viewGroup);
            Object obj = (i == 0 || this.a.a(i) != this.a.a(i - 1)) ? null : 1;
            View view3 = null;
            if (obj != null) {
                View view4 = fVar.d;
                if (view4 != null) {
                    view4.setVisibility(0);
                    this.b.add(view4);
                }
            } else {
                if (fVar.d != null) {
                    view3 = fVar.d;
                } else if (!this.b.isEmpty()) {
                    view3 = (View) this.b.remove(0);
                }
                view3 = this.a.a(i, view3, fVar);
                view3.setClickable(true);
            }
            Drawable drawable = this.c;
            int i2 = this.d;
            if (view2 != null) {
                if (fVar.a != view2) {
                    fVar.removeView(fVar.a);
                    fVar.a = view2;
                    ViewParent parent = view2.getParent();
                    if (!(parent == null || parent == fVar || !(parent instanceof ViewGroup))) {
                        ((ViewGroup) parent).removeView(view2);
                    }
                    fVar.addView(view2);
                }
                if (fVar.d != view3) {
                    if (fVar.d != null) {
                        fVar.removeView(fVar.d);
                    }
                    fVar.d = view3;
                    if (view3 != null) {
                        fVar.addView(view3);
                    }
                }
                if (fVar.b != drawable) {
                    fVar.b = drawable;
                    fVar.c = i2;
                    fVar.invalidate();
                }
                return fVar;
            }
            throw new NullPointerException("List view item must not be null.");
        }

        public final int getViewTypeCount() {
            return this.a.getViewTypeCount();
        }

        public final boolean hasStableIds() {
            return this.a.hasStableIds();
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        public final boolean isEnabled(int i) {
            return this.a.isEnabled(i);
        }

        public final void notifyDataSetChanged() {
            ((BaseAdapter) this.a).notifyDataSetChanged();
        }

        public final void notifyDataSetInvalidated() {
            ((BaseAdapter) this.a).notifyDataSetInvalidated();
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    class h implements a {
        private h() {
        }

        /* synthetic */ h(SimpleStickyListHeadersListView simpleStickyListHeadersListView, byte b) {
            this();
        }

        public final void a(Canvas canvas) {
            if (SimpleStickyListHeadersListView.this.b != null) {
                SimpleStickyListHeadersListView simpleStickyListHeadersListView;
                if (SimpleStickyListHeadersListView.this.e) {
                    canvas.save();
                    canvas.clipRect(0, SimpleStickyListHeadersListView.this.f, SimpleStickyListHeadersListView.this.getRight(), SimpleStickyListHeadersListView.this.getBottom());
                    simpleStickyListHeadersListView = SimpleStickyListHeadersListView.this;
                    simpleStickyListHeadersListView.drawChild(canvas, simpleStickyListHeadersListView.b, 0);
                    canvas.restore();
                    return;
                }
                simpleStickyListHeadersListView = SimpleStickyListHeadersListView.this;
                simpleStickyListHeadersListView.drawChild(canvas, simpleStickyListHeadersListView.b, 0);
            }
        }
    }

    public SimpleStickyListHeadersListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SimpleStickyListHeadersListView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.stickyListHeadersListViewStyle);
        this.a = null;
        this.e = true;
        this.m = 0;
        this.f = 0;
        this.n = 0;
        this.o = 0;
        this.r = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.a = new g(context);
        this.h = this.a.getDivider();
        this.i = this.a.getDividerHeight();
        this.a.setDivider(null);
        this.a.setDividerHeight(0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.nlx.a.a, R.attr.stickyListHeadersListViewStyle, 0);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                this.m = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
                this.f = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
                this.n = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
                this.o = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
                setPadding(this.m, this.f, this.n, this.o);
                this.e = obtainStyledAttributes.getBoolean(5, true);
                super.setClipToPadding(true);
                this.a.setClipToPadding(this.e);
                this.a.setOverScrollMode(obtainStyledAttributes.getInt(9, 0));
                this.a.setFastScrollEnabled(obtainStyledAttributes.getBoolean(8, this.a.isFastScrollEnabled()));
                if (obtainStyledAttributes.hasValue(6)) {
                    this.h = obtainStyledAttributes.getDrawable(6);
                }
                this.i = obtainStyledAttributes.getDimensionPixelSize(7, this.i);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.a.a = new h(this, (byte) 0);
        this.a.setOnScrollListener(new e(this, (byte) 0));
        addView(this.a);
    }

    private void a(View view) {
        if (view != null) {
            measureChild(view, MeasureSpec.makeMeasureSpec((getMeasuredWidth() - this.m) - this.n, AudioPlayer.INFINITY_LOOP_COUNT), MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    static /* synthetic */ void a(SimpleStickyListHeadersListView simpleStickyListHeadersListView, int i) {
        a aVar = simpleStickyListHeadersListView.d;
        int count = aVar == null ? 0 : aVar.getCount();
        if (count != 0) {
            i -= simpleStickyListHeadersListView.a.getHeaderViewsCount();
            if (simpleStickyListHeadersListView.a.getChildCount() > 0 && simpleStickyListHeadersListView.a.getChildAt(0).getBottom() < simpleStickyListHeadersListView.c()) {
                i++;
            }
            Object obj = simpleStickyListHeadersListView.a.getChildCount() != 0 ? 1 : null;
            Object obj2 = (obj == null || simpleStickyListHeadersListView.a.getFirstVisiblePosition() != 0 || simpleStickyListHeadersListView.a.getChildAt(0).getTop() < simpleStickyListHeadersListView.c()) ? null : 1;
            Object obj3 = (i > count - 1 || i < 0) ? 1 : null;
            if (obj != null && obj3 == null && obj2 == null) {
                Integer num = simpleStickyListHeadersListView.k;
                if (num == null || num.intValue() != i) {
                    simpleStickyListHeadersListView.k = Integer.valueOf(i);
                    long a = simpleStickyListHeadersListView.d.a(i);
                    Long l = simpleStickyListHeadersListView.j;
                    if (l == null || l.longValue() != a) {
                        simpleStickyListHeadersListView.j = Long.valueOf(a);
                        View a2 = simpleStickyListHeadersListView.d.a(simpleStickyListHeadersListView.k.intValue(), simpleStickyListHeadersListView.b, simpleStickyListHeadersListView);
                        View view = simpleStickyListHeadersListView.b;
                        if (view != a2) {
                            if (view != null) {
                                simpleStickyListHeadersListView.removeView(view);
                            }
                            simpleStickyListHeadersListView.b = a2;
                            simpleStickyListHeadersListView.addView(simpleStickyListHeadersListView.b);
                            simpleStickyListHeadersListView.b.setClickable(true);
                        }
                        a2 = simpleStickyListHeadersListView.b;
                        LayoutParams layoutParams = a2.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        } else {
                            if (layoutParams.height == -1 || layoutParams.width == -2) {
                                layoutParams.height = -2;
                                layoutParams.width = -1;
                            }
                            simpleStickyListHeadersListView.a(simpleStickyListHeadersListView.b);
                            simpleStickyListHeadersListView.l = null;
                        }
                        a2.setLayoutParams(layoutParams);
                        simpleStickyListHeadersListView.a(simpleStickyListHeadersListView.b);
                        simpleStickyListHeadersListView.l = null;
                    }
                }
                i = simpleStickyListHeadersListView.c();
                for (count = 0; count < simpleStickyListHeadersListView.a.getChildCount(); count++) {
                    View childAt = simpleStickyListHeadersListView.a.getChildAt(count);
                    obj2 = ((childAt instanceof f) && ((f) childAt).a()) ? 1 : null;
                    g gVar = simpleStickyListHeadersListView.a;
                    Object obj4 = (gVar.b == null || !gVar.b.contains(childAt)) ? null : 1;
                    if (childAt.getTop() >= simpleStickyListHeadersListView.c() && (obj2 != null || obj4 != null)) {
                        i = Math.min(childAt.getTop() - simpleStickyListHeadersListView.b.getMeasuredHeight(), i);
                        break;
                    }
                }
                num = simpleStickyListHeadersListView.l;
                if (num == null || num.intValue() != i) {
                    simpleStickyListHeadersListView.l = Integer.valueOf(i);
                    simpleStickyListHeadersListView.b.setTranslationY((float) simpleStickyListHeadersListView.l.intValue());
                }
                simpleStickyListHeadersListView.b();
                return;
            }
            simpleStickyListHeadersListView.a();
        }
    }

    private void b() {
        int c = c();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.a.getChildAt(i);
            if (childAt instanceof f) {
                f fVar = (f) childAt;
                if (fVar.a()) {
                    View view = fVar.d;
                    if (fVar.getTop() < c) {
                        if (view.getVisibility() != 4) {
                            view.setVisibility(4);
                        }
                    } else if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                }
            }
        }
    }

    private int c() {
        return this.e ? this.f : 0;
    }

    public final void a() {
        View view = this.b;
        if (view != null) {
            removeView(view);
            this.b = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.a.c = 0;
            b();
        }
    }

    @TargetApi(14)
    public boolean canScrollVertically(int i) {
        return this.a.canScrollVertically(i);
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.a.getVisibility() == 0 || this.a.getAnimation() != null) {
            drawChild(canvas, this.a, 0);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if ((motionEvent.getAction() & 255) == 0) {
            this.p = motionEvent.getY();
            View view = this.b;
            z = view != null && this.p <= ((float) (view.getHeight() + this.l.intValue()));
            this.q = z;
        }
        if (!this.q) {
            return this.a.dispatchTouchEvent(motionEvent);
        }
        if (this.b != null && Math.abs(this.p - motionEvent.getY()) <= this.r) {
            return this.b.dispatchTouchEvent(motionEvent);
        }
        if (this.b != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            this.b.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        motionEvent = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX(), this.p, motionEvent.getMetaState());
        motionEvent.setAction(0);
        z = this.a.dispatchTouchEvent(motionEvent);
        motionEvent.recycle();
        this.q = false;
        return z;
    }

    public int getOverScrollMode() {
        return this.a.getOverScrollMode();
    }

    public int getPaddingBottom() {
        return this.o;
    }

    public int getPaddingLeft() {
        return this.m;
    }

    public int getPaddingRight() {
        return this.n;
    }

    public int getPaddingTop() {
        return this.f;
    }

    public int getScrollBarStyle() {
        return this.a.getScrollBarStyle();
    }

    public boolean isHorizontalScrollBarEnabled() {
        return this.a.isHorizontalScrollBarEnabled();
    }

    public boolean isVerticalScrollBarEnabled() {
        return this.a.isVerticalScrollBarEnabled();
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g gVar = this.a;
        gVar.layout(0, 0, gVar.getMeasuredWidth(), getHeight());
        View view = this.b;
        if (view != null) {
            int i5 = ((MarginLayoutParams) view.getLayoutParams()).topMargin;
            View view2 = this.b;
            view2.layout(this.m, i5, view2.getMeasuredWidth() + this.m, this.b.getMeasuredHeight() + i5);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a(this.b);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof c) {
            c cVar = (c) parcelable;
            super.onRestoreInstanceState(cVar.getSuperState());
            this.a.onRestoreInstanceState(cVar.a);
        }
    }

    public Parcelable onSaveInstanceState() {
        return new c(super.onSaveInstanceState(), this.a.onSaveInstanceState());
    }

    public void setClipToPadding(boolean z) {
        g gVar = this.a;
        if (gVar != null) {
            gVar.setClipToPadding(z);
        }
        this.e = z;
    }

    public void setHorizontalScrollBarEnabled(boolean z) {
        this.a.setHorizontalScrollBarEnabled(z);
    }

    public void setOnCreateContextMenuListener(OnCreateContextMenuListener onCreateContextMenuListener) {
        this.a.setOnCreateContextMenuListener(onCreateContextMenuListener);
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.a.setOnTouchListener(new -$$Lambda$SimpleStickyListHeadersListView$5_RQPwvM9DsfIZ-LoqYDNStRl8A(this, onTouchListener));
        } else {
            this.a.setOnTouchListener(null);
        }
    }

    public void setOverScrollMode(int i) {
        g gVar = this.a;
        if (gVar != null) {
            gVar.setOverScrollMode(i);
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.m = i;
        this.f = i2;
        this.n = i3;
        this.o = i4;
        g gVar = this.a;
        if (gVar != null) {
            gVar.setPadding(i, i2, i3, i4);
        }
        super.setPadding(0, 0, 0, 0);
        requestLayout();
    }

    public void setScrollBarStyle(int i) {
        g gVar = this.a;
        if (gVar != null) {
            gVar.setScrollBarStyle(i);
        }
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        this.a.setVerticalScrollBarEnabled(z);
    }

    public boolean showContextMenu() {
        return this.a.showContextMenu();
    }
}
