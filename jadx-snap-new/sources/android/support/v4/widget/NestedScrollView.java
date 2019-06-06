package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.jl;
import defpackage.jt;
import defpackage.ju;
import defpackage.jv;
import defpackage.jx;
import defpackage.kb;
import defpackage.kb.j;
import defpackage.kk;
import java.util.ArrayList;
import org.opencv.imgproc.Imgproc;

public class NestedScrollView extends FrameLayout implements jt, jv {
    private static final a x = new a();
    private static final int[] y = new int[]{16843130};
    private final ju A;
    private float B;
    public b a;
    private long b;
    private final Rect c;
    private OverScroller d;
    private EdgeEffect e;
    private EdgeEffect f;
    private int g;
    private boolean h;
    private boolean i;
    private View j;
    private boolean k;
    private VelocityTracker l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    private int u;
    private int v;
    private c w;
    private final jx z;

    public interface b {
        void a(NestedScrollView nestedScrollView);
    }

    static class c extends BaseSavedState {
        public static final Creator<c> CREATOR = new Creator<c>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }
        };
        public int a;

        c(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("HorizontalScrollView.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" scrollPosition=");
            stringBuilder.append(this.a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    static class a extends jl {
        a() {
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.a() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            int scrollX = nestedScrollView.getScrollX();
            if (VERSION.SDK_INT >= 15) {
                accessibilityEvent.setMaxScrollX(scrollX);
            }
            int a = nestedScrollView.a();
            if (VERSION.SDK_INT >= 15) {
                accessibilityEvent.setMaxScrollY(a);
            }
        }

        public final void onInitializeAccessibilityNodeInfo(View view, kk kkVar) {
            super.onInitializeAccessibilityNodeInfo(view, kkVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            kkVar.a(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int a = nestedScrollView.a();
                if (a > 0) {
                    kkVar.b(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        kkVar.a(8192);
                    }
                    if (nestedScrollView.getScrollY() < a) {
                        kkVar.a(4096);
                    }
                }
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                i = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.a());
                if (i == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.a(i);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                i = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (i == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.a(i);
                return true;
            }
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NestedScrollView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y, 0, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.m) {
            this.m = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.z = new jx(this);
        this.A = new ju(this);
        setNestedScrollingEnabled(true);
        j.a((View) this, x);
    }

    private int a(Rect rect) {
        int i = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i2 -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i2 && rect.top > scrollY) {
            i = Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, getChildAt(0).getBottom() - i2);
        } else if (rect.top < scrollY && rect.bottom < i2) {
            i = Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return i;
    }

    private View a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        Object obj = null;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                Object obj2 = (i >= top || bottom >= i2) ? null : 1;
                if (view == null) {
                    view = view2;
                    obj = obj2;
                } else {
                    Object obj3 = ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) ? null : 1;
                    if (obj != null) {
                        if (obj2 != null) {
                            if (obj3 == null) {
                            }
                        }
                    } else if (obj2 != null) {
                        view = view2;
                        obj = 1;
                    } else if (obj3 == null) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private void a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                i = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, i)) - scrollY);
                kb.a.c(this);
            } else {
                if (!this.d.isFinished()) {
                    this.d.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.g = (int) motionEvent.getY(actionIndex);
            this.r = motionEvent.getPointerId(actionIndex);
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean a(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        height += scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > height) {
            g(z2 ? i2 - scrollY : i3 - height);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    private boolean a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        i += i3;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            i2 = 0;
            z = true;
        }
        if (i > i4) {
            z2 = true;
        } else if (i < 0) {
            z2 = true;
            i4 = 0;
        } else {
            i4 = i;
            z2 = false;
        }
        if (z2 && !c(1)) {
            this.d.springBack(i2, i4, 0, 0, 0, a());
        }
        onOverScrolled(i2, i4, z, z2);
        return z || z2;
    }

    private boolean a(int i, int i2, int[] iArr, int i3) {
        return this.A.a(0, i, 0, i2, iArr, i3);
    }

    private boolean a(int i, int[] iArr, int[] iArr2, int i2) {
        return this.A.a(0, i, iArr, iArr2, i2);
    }

    private boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private boolean a(View view, int i, int i2) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + i >= getScrollY() && this.c.top - i <= getScrollY() + i2;
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    private int b() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    private static int b(int i, int i2, int i3) {
        return (i2 >= i3 || i < 0) ? 0 : i2 + i > i3 ? i3 - i2 : i;
    }

    private void b(View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int a = a(this.c);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    private boolean b(int i) {
        return this.A.a(2, i);
    }

    private boolean c() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
    }

    private boolean c(int i) {
        return this.A.a(i);
    }

    private void d() {
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    private boolean d(int i) {
        Object obj = i == 130 ? 1 : null;
        int height = getHeight();
        if (obj != null) {
            this.c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.c.top + height > childAt.getBottom()) {
                    this.c.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.c.top = getScrollY() - height;
            if (this.c.top < 0) {
                this.c.top = 0;
            }
        }
        Rect rect = this.c;
        rect.bottom = rect.top + height;
        return a(i, this.c.top, this.c.bottom);
    }

    private void e() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    private boolean e(int i) {
        Object obj = i == 130 ? 1 : null;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (obj != null) {
            int childCount = getChildCount();
            if (childCount > 0) {
                this.c.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
                Rect rect2 = this.c;
                rect2.top = rect2.bottom - height;
            }
        }
        return a(i, this.c.top, this.c.bottom);
    }

    private void f() {
        this.k = false;
        e();
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f.onRelease();
        }
    }

    private boolean f(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int b = b();
        if (findNextFocus == null || !a(findNextFocus, b, getHeight())) {
            if (i == 33 && getScrollY() < b) {
                b = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom());
                if (bottom < b) {
                    b = bottom;
                }
            }
            if (b == 0) {
                return false;
            }
            if (i != 130) {
                b = -b;
            }
            g(b);
        } else {
            findNextFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findNextFocus, this.c);
            g(a(this.c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && a(findFocus)) {
            i = getDescendantFocusability();
            setDescendantFocusability(Imgproc.FLOODFILL_MASK_ONLY);
            requestFocus();
            setDescendantFocusability(i);
        }
        return true;
    }

    private void g() {
        if (getOverScrollMode() == 2) {
            this.e = null;
            this.f = null;
        } else if (this.e == null) {
            Context context = getContext();
            this.e = new EdgeEffect(context);
            this.f = new EdgeEffect(context);
        }
    }

    private void g(int i) {
        if (i != 0) {
            if (this.n) {
                a(0, i);
                return;
            }
            scrollBy(0, i);
        }
    }

    private void h(int i) {
        if (getChildCount() > 0) {
            b(1);
            this.d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.v = getScrollY();
            kb.a.c(this);
        }
    }

    private void i(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < a() || i < 0);
        float f = (float) i;
        if (!dispatchNestedPreFling(MapboxConstants.MINIMUM_ZOOM, f)) {
            dispatchNestedFling(MapboxConstants.MINIMUM_ZOOM, f, z);
            h(i);
        }
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return getChildCount() > 0 ? Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop())) : 0;
    }

    public final void a(int i) {
        a(0 - getScrollX(), i - getScrollY());
    }

    public final boolean a(KeyEvent keyEvent) {
        this.c.setEmpty();
        boolean z = false;
        int i = 130;
        if (c()) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    z = !keyEvent.isAltPressed() ? f(33) : e(33);
                } else if (keyCode == 20) {
                    z = !keyEvent.isAltPressed() ? f(130) : e(130);
                } else if (keyCode == 62) {
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    d(i);
                }
            }
            return z;
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            findFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (!(findFocus == null || findFocus == this || !findFocus.requestFocus(130))) {
                return true;
            }
        }
        return false;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        int i = 0;
        if (this.d.computeScrollOffset()) {
            this.d.getCurrX();
            int currY = this.d.getCurrY();
            int i2 = currY - this.v;
            if (a(i2, this.t, null, 1)) {
                i2 -= this.t[1];
            }
            if (i2 != 0) {
                int a = a();
                int scrollY = getScrollY();
                a(i2, getScrollX(), scrollY, a);
                int scrollY2 = getScrollY() - scrollY;
                if (!a(scrollY2, i2 - scrollY2, null, 1)) {
                    i2 = getOverScrollMode();
                    if (i2 == 0 || (i2 == 1 && a > 0)) {
                        i = 1;
                    }
                    if (i != 0) {
                        EdgeEffect edgeEffect;
                        g();
                        if (currY <= 0 && scrollY > 0) {
                            edgeEffect = this.e;
                        } else if (currY >= a && scrollY < a) {
                            edgeEffect = this.f;
                        }
                        edgeEffect.onAbsorb((int) this.d.getCurrVelocity());
                    }
                }
            }
            this.v = currY;
            kb.a.c(this);
            return;
        }
        if (c(1)) {
            stopNestedScroll(1);
        }
        this.v = 0;
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A.a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A.a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A.a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A.a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.e != null) {
            int save;
            int width;
            int height;
            int scrollY = getScrollY();
            int i = 0;
            if (!this.e.isFinished()) {
                int paddingLeft;
                save = canvas.save();
                width = getWidth();
                height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) paddingLeft, (float) min);
                this.e.setSize(width, height);
                if (this.e.draw(canvas)) {
                    kb.a.c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f.isFinished()) {
                save = canvas.save();
                width = getWidth();
                height = getHeight();
                scrollY = Math.max(a(), scrollY) + height;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    scrollY -= getPaddingBottom();
                }
                canvas.translate((float) (i - width), (float) scrollY);
                canvas.rotate(180.0f, (float) width, MapboxConstants.MINIMUM_ZOOM);
                this.f.setSize(width, height);
                if (this.f.draw(canvas)) {
                    kb.a.c(this);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return MapboxConstants.MINIMUM_ZOOM;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public int getNestedScrollAxes() {
        return this.z.a;
    }

    /* Access modifiers changed, original: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return MapboxConstants.MINIMUM_ZOOM;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return this.A.a(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.A.a;
    }

    /* Access modifiers changed, original: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* Access modifiers changed, original: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8 || this.k)) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != MapboxConstants.MINIMUM_ZOOM) {
                if (this.B == MapboxConstants.MINIMUM_ZOOM) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        this.B = typedValue.getDimension(context.getResources().getDisplayMetrics());
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                int i = (int) (axisValue * this.B);
                int a = a();
                int scrollY = getScrollY();
                i = scrollY - i;
                if (i < 0) {
                    i = 0;
                } else if (i > a) {
                    i = a;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
        r11 = this;
        r0 = r12.getAction();
        r1 = 2;
        r2 = 1;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r3 = r11.k;
        if (r3 == 0) goto L_0x000d;
    L_0x000c:
        return r2;
    L_0x000d:
        r0 = r0 & 255;
        r3 = 0;
        if (r0 == 0) goto L_0x00a0;
    L_0x0012:
        r4 = -1;
        if (r0 == r2) goto L_0x0079;
    L_0x0015:
        if (r0 == r1) goto L_0x0024;
    L_0x0017:
        r1 = 3;
        if (r0 == r1) goto L_0x0079;
    L_0x001a:
        r1 = 6;
        if (r0 == r1) goto L_0x001f;
    L_0x001d:
        goto L_0x0109;
    L_0x001f:
        r11.a(r12);
        goto L_0x0109;
    L_0x0024:
        r0 = r11.r;
        if (r0 == r4) goto L_0x0109;
    L_0x0028:
        r5 = r12.findPointerIndex(r0);
        if (r5 != r4) goto L_0x0048;
    L_0x002e:
        r12 = new java.lang.StringBuilder;
        r1 = "Invalid pointerId=";
        r12.<init>(r1);
        r12.append(r0);
        r0 = " in onInterceptTouchEvent";
        r12.append(r0);
        r12 = r12.toString();
        r0 = "NestedScrollView";
        android.util.Log.e(r0, r12);
        goto L_0x0109;
    L_0x0048:
        r0 = r12.getY(r5);
        r0 = (int) r0;
        r4 = r11.g;
        r4 = r0 - r4;
        r4 = java.lang.Math.abs(r4);
        r5 = r11.o;
        if (r4 <= r5) goto L_0x0109;
    L_0x0059:
        r4 = r11.getNestedScrollAxes();
        r1 = r1 & r4;
        if (r1 != 0) goto L_0x0109;
    L_0x0060:
        r11.k = r2;
        r11.g = r0;
        r11.d();
        r0 = r11.l;
        r0.addMovement(r12);
        r11.u = r3;
        r12 = r11.getParent();
        if (r12 == 0) goto L_0x0109;
    L_0x0074:
        r12.requestDisallowInterceptTouchEvent(r2);
        goto L_0x0109;
    L_0x0079:
        r11.k = r3;
        r11.r = r4;
        r11.e();
        r4 = r11.d;
        r5 = r11.getScrollX();
        r6 = r11.getScrollY();
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = r11.a();
        r12 = r4.springBack(r5, r6, r7, r8, r9, r10);
        if (r12 == 0) goto L_0x009c;
    L_0x0097:
        r12 = defpackage.kb.a;
        r12.c(r11);
    L_0x009c:
        r11.stopNestedScroll(r3);
        goto L_0x0109;
    L_0x00a0:
        r0 = r12.getY();
        r0 = (int) r0;
        r1 = r12.getX();
        r1 = (int) r1;
        r4 = r11.getChildCount();
        if (r4 <= 0) goto L_0x00d4;
    L_0x00b0:
        r4 = r11.getScrollY();
        r5 = r11.getChildAt(r3);
        r6 = r5.getTop();
        r6 = r6 - r4;
        if (r0 < r6) goto L_0x00d4;
    L_0x00bf:
        r6 = r5.getBottom();
        r6 = r6 - r4;
        if (r0 >= r6) goto L_0x00d4;
    L_0x00c6:
        r4 = r5.getLeft();
        if (r1 < r4) goto L_0x00d4;
    L_0x00cc:
        r4 = r5.getRight();
        if (r1 >= r4) goto L_0x00d4;
    L_0x00d2:
        r1 = 1;
        goto L_0x00d5;
    L_0x00d4:
        r1 = 0;
    L_0x00d5:
        if (r1 != 0) goto L_0x00dd;
    L_0x00d7:
        r11.k = r3;
        r11.e();
        goto L_0x0109;
    L_0x00dd:
        r11.g = r0;
        r0 = r12.getPointerId(r3);
        r11.r = r0;
        r0 = r11.l;
        if (r0 != 0) goto L_0x00f0;
    L_0x00e9:
        r0 = android.view.VelocityTracker.obtain();
        r11.l = r0;
        goto L_0x00f3;
    L_0x00f0:
        r0.clear();
    L_0x00f3:
        r0 = r11.l;
        r0.addMovement(r12);
        r12 = r11.d;
        r12.computeScrollOffset();
        r12 = r11.d;
        r12 = r12.isFinished();
        r12 = r12 ^ r2;
        r11.k = r12;
        r11.b(r3);
    L_0x0109:
        r12 = r11.k;
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.h = false;
        View view = this.j;
        if (view != null && a(view, (View) this)) {
            b(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.a);
                this.w = null;
            }
            i = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > i) {
                scrollTo(getScrollX(), i);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), AudioPlayer.INFINITY_LOOP_COUNT));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        i((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.z.a = i;
        startNestedScroll(2);
    }

    /* Access modifiers changed, original: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* Access modifiers changed, original: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        return (findNextFocus == null || a(findNextFocus)) ? false : findNextFocus.requestFocus(i, rect);
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof c) {
            c cVar = (c) parcelable;
            super.onRestoreInstanceState(cVar.getSuperState());
            this.w = cVar;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.a = getScrollY();
        return cVar;
    }

    /* Access modifiers changed, original: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(findFocus, this.c);
            g(a(this.c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.z.a = 0;
        stopNestedScroll();
    }

    /* JADX WARNING: Missing block: B:22:0x006f, code skipped:
            if (r13.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a()) != false) goto L_0x0071;
     */
    /* JADX WARNING: Missing block: B:80:0x01e6, code skipped:
            if (r13.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a()) != false) goto L_0x0071;
     */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r13.d();
        r0 = android.view.MotionEvent.obtain(r14);
        r1 = r14.getActionMasked();
        r2 = 0;
        if (r1 != 0) goto L_0x0010;
    L_0x000e:
        r13.u = r2;
    L_0x0010:
        r3 = r13.u;
        r3 = (float) r3;
        r4 = 0;
        r0.offsetLocation(r4, r3);
        r3 = 1;
        if (r1 == 0) goto L_0x01ea;
    L_0x001a:
        r5 = -1;
        if (r1 == r3) goto L_0x01b2;
    L_0x001d:
        r6 = 2;
        if (r1 == r6) goto L_0x007d;
    L_0x0020:
        r2 = 3;
        if (r1 == r2) goto L_0x0050;
    L_0x0023:
        r2 = 5;
        if (r1 == r2) goto L_0x003d;
    L_0x0026:
        r2 = 6;
        if (r1 == r2) goto L_0x002b;
    L_0x0029:
        goto L_0x0222;
    L_0x002b:
        r13.a(r14);
        r1 = r13.r;
        r1 = r14.findPointerIndex(r1);
        r14 = r14.getY(r1);
        r14 = (int) r14;
        r13.g = r14;
        goto L_0x0222;
    L_0x003d:
        r1 = r14.getActionIndex();
        r2 = r14.getY(r1);
        r2 = (int) r2;
        r13.g = r2;
        r14 = r14.getPointerId(r1);
        r13.r = r14;
        goto L_0x0222;
    L_0x0050:
        r14 = r13.k;
        if (r14 == 0) goto L_0x0076;
    L_0x0054:
        r14 = r13.getChildCount();
        if (r14 <= 0) goto L_0x0076;
    L_0x005a:
        r6 = r13.d;
        r7 = r13.getScrollX();
        r8 = r13.getScrollY();
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = r13.a();
        r14 = r6.springBack(r7, r8, r9, r10, r11, r12);
        if (r14 == 0) goto L_0x0076;
    L_0x0071:
        r14 = defpackage.kb.a;
        r14.c(r13);
    L_0x0076:
        r13.r = r5;
        r13.f();
        goto L_0x0222;
    L_0x007d:
        r1 = r13.r;
        r1 = r14.findPointerIndex(r1);
        if (r1 != r5) goto L_0x00a1;
    L_0x0085:
        r14 = new java.lang.StringBuilder;
        r1 = "Invalid pointerId=";
        r14.<init>(r1);
        r1 = r13.r;
        r14.append(r1);
        r1 = " in onTouchEvent";
        r14.append(r1);
        r14 = r14.toString();
        r1 = "NestedScrollView";
        android.util.Log.e(r1, r14);
        goto L_0x0222;
    L_0x00a1:
        r5 = r14.getY(r1);
        r5 = (int) r5;
        r6 = r13.g;
        r6 = r6 - r5;
        r7 = r13.t;
        r8 = r13.s;
        r7 = r13.a(r6, r7, r8, r2);
        if (r7 == 0) goto L_0x00c9;
    L_0x00b3:
        r7 = r13.t;
        r7 = r7[r3];
        r6 = r6 - r7;
        r7 = r13.s;
        r7 = r7[r3];
        r7 = (float) r7;
        r0.offsetLocation(r4, r7);
        r7 = r13.u;
        r8 = r13.s;
        r8 = r8[r3];
        r7 = r7 + r8;
        r13.u = r7;
    L_0x00c9:
        r7 = r13.k;
        if (r7 != 0) goto L_0x00e9;
    L_0x00cd:
        r7 = java.lang.Math.abs(r6);
        r8 = r13.o;
        if (r7 <= r8) goto L_0x00e9;
    L_0x00d5:
        r7 = r13.getParent();
        if (r7 == 0) goto L_0x00de;
    L_0x00db:
        r7.requestDisallowInterceptTouchEvent(r3);
    L_0x00de:
        r13.k = r3;
        if (r6 <= 0) goto L_0x00e6;
    L_0x00e2:
        r7 = r13.o;
        r6 = r6 - r7;
        goto L_0x00e9;
    L_0x00e6:
        r7 = r13.o;
        r6 = r6 + r7;
    L_0x00e9:
        r7 = r13.k;
        if (r7 == 0) goto L_0x0222;
    L_0x00ed:
        r7 = r13.s;
        r7 = r7[r3];
        r5 = r5 - r7;
        r13.g = r5;
        r5 = r13.getScrollY();
        r7 = r13.a();
        r8 = r13.getOverScrollMode();
        if (r8 == 0) goto L_0x0109;
    L_0x0102:
        if (r8 != r3) goto L_0x0107;
    L_0x0104:
        if (r7 <= 0) goto L_0x0107;
    L_0x0106:
        goto L_0x0109;
    L_0x0107:
        r8 = 0;
        goto L_0x010a;
    L_0x0109:
        r8 = 1;
    L_0x010a:
        r9 = r13.getScrollY();
        r9 = r13.a(r6, r2, r9, r7);
        if (r9 == 0) goto L_0x011f;
    L_0x0114:
        r9 = r13.c(r2);
        if (r9 != 0) goto L_0x011f;
    L_0x011a:
        r9 = r13.l;
        r9.clear();
    L_0x011f:
        r9 = r13.getScrollY();
        r9 = r9 - r5;
        r10 = r6 - r9;
        r11 = r13.s;
        r2 = r13.a(r9, r10, r11, r2);
        if (r2 == 0) goto L_0x0148;
    L_0x012e:
        r14 = r13.g;
        r1 = r13.s;
        r2 = r1[r3];
        r14 = r14 - r2;
        r13.g = r14;
        r14 = r1[r3];
        r14 = (float) r14;
        r0.offsetLocation(r4, r14);
        r14 = r13.u;
        r1 = r13.s;
        r1 = r1[r3];
        r14 = r14 + r1;
        r13.u = r14;
        goto L_0x0222;
    L_0x0148:
        if (r8 == 0) goto L_0x0222;
    L_0x014a:
        r13.g();
        r5 = r5 + r6;
        if (r5 >= 0) goto L_0x0174;
    L_0x0150:
        r2 = r13.e;
        r4 = (float) r6;
        r5 = r13.getHeight();
        r5 = (float) r5;
        r4 = r4 / r5;
        r14 = r14.getX(r1);
        r1 = r13.getWidth();
        r1 = (float) r1;
        r14 = r14 / r1;
        defpackage.kz.a(r2, r4, r14);
        r14 = r13.f;
        r14 = r14.isFinished();
        if (r14 != 0) goto L_0x019a;
    L_0x016e:
        r14 = r13.f;
    L_0x0170:
        r14.onRelease();
        goto L_0x019a;
    L_0x0174:
        if (r5 <= r7) goto L_0x019a;
    L_0x0176:
        r2 = r13.f;
        r4 = (float) r6;
        r5 = r13.getHeight();
        r5 = (float) r5;
        r4 = r4 / r5;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r14 = r14.getX(r1);
        r1 = r13.getWidth();
        r1 = (float) r1;
        r14 = r14 / r1;
        r5 = r5 - r14;
        defpackage.kz.a(r2, r4, r5);
        r14 = r13.e;
        r14 = r14.isFinished();
        if (r14 != 0) goto L_0x019a;
    L_0x0197:
        r14 = r13.e;
        goto L_0x0170;
    L_0x019a:
        r14 = r13.e;
        if (r14 == 0) goto L_0x0222;
    L_0x019e:
        r14 = r14.isFinished();
        if (r14 == 0) goto L_0x01ac;
    L_0x01a4:
        r14 = r13.f;
        r14 = r14.isFinished();
        if (r14 != 0) goto L_0x0222;
    L_0x01ac:
        r14 = defpackage.kb.a;
        r14.c(r13);
        goto L_0x0222;
    L_0x01b2:
        r14 = r13.l;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r13.q;
        r2 = (float) r2;
        r14.computeCurrentVelocity(r1, r2);
        r1 = r13.r;
        r14 = r14.getYVelocity(r1);
        r14 = (int) r14;
        r1 = java.lang.Math.abs(r14);
        r2 = r13.p;
        if (r1 <= r2) goto L_0x01d1;
    L_0x01cb:
        r14 = -r14;
        r13.i(r14);
        goto L_0x0076;
    L_0x01d1:
        r6 = r13.d;
        r7 = r13.getScrollX();
        r8 = r13.getScrollY();
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = r13.a();
        r14 = r6.springBack(r7, r8, r9, r10, r11, r12);
        if (r14 == 0) goto L_0x0076;
    L_0x01e8:
        goto L_0x0071;
    L_0x01ea:
        r1 = r13.getChildCount();
        if (r1 != 0) goto L_0x01f1;
    L_0x01f0:
        return r2;
    L_0x01f1:
        r1 = r13.d;
        r1 = r1.isFinished();
        r1 = r1 ^ r3;
        r13.k = r1;
        if (r1 == 0) goto L_0x0205;
    L_0x01fc:
        r1 = r13.getParent();
        if (r1 == 0) goto L_0x0205;
    L_0x0202:
        r1.requestDisallowInterceptTouchEvent(r3);
    L_0x0205:
        r1 = r13.d;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x0212;
    L_0x020d:
        r1 = r13.d;
        r1.abortAnimation();
    L_0x0212:
        r1 = r14.getY();
        r1 = (int) r1;
        r13.g = r1;
        r14 = r14.getPointerId(r2);
        r13.r = r14;
        r13.b(r2);
    L_0x0222:
        r14 = r13.l;
        if (r14 == 0) goto L_0x0229;
    L_0x0226:
        r14.addMovement(r0);
    L_0x0229:
        r0.recycle();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (this.h) {
            this.j = view2;
        } else {
            b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                a(0, a);
            }
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            i = b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            i2 = b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.A.a(z);
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.A.a(i, 0);
    }

    public void stopNestedScroll() {
        this.A.b(0);
    }

    public void stopNestedScroll(int i) {
        this.A.b(i);
    }
}
