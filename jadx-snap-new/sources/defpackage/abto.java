package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abkw.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: abto */
public class abto extends ViewGroup {
    public static final int ANIMATION_SLIDE_DURATION_MILLISECONDS = 250;
    public static final int SCROLL_DIRECTION_DOWN = 8;
    public static final int SCROLL_DIRECTION_UP = 4;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private int a = 1;
    private int b = 0;
    private final SparseIntArray c = new SparseIntArray();
    private final SparseBooleanArray d = new SparseBooleanArray();
    private int e;
    private float f;
    private float g;
    private int h = 0;
    private int i;
    private VelocityTracker j = null;
    private int k;
    private Runnable l = null;
    private final List<Predicate<Void>> m = new ArrayList(4);
    protected final Rect mChildRectBounds = new Rect();
    protected int mCurrentPanel = 0;
    protected boolean mDidMeasureOnce = false;
    protected boolean mDragToDismissEnabled;
    protected boolean mIsDraggingForScroll;
    protected boolean mIsSettling = false;
    protected final List<a> mOnScrolledListenerList = new ArrayList();
    protected int mScreenHeight;
    protected Scroller mScroller = new Scroller(getContext(), new DecelerateInterpolator(1.4f));
    protected float mStartScrollY;
    protected float mStartTouchY;

    /* renamed from: abto$a */
    public interface a {
        void a(int i);

        void b(int i);
    }

    public abto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f = (float) viewConfiguration.getScaledTouchSlop();
        this.g = (float) viewConfiguration.getScaledPagingTouchSlop();
        this.i = viewConfiguration.getScaledMaximumFlingVelocity();
        this.k = abtp.b(50.0f, getContext());
        resetTouchState();
        setScrollableInBothDirections(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.k, 0, 0);
        try {
            this.mCurrentPanel = obtainStyledAttributes.getInt(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void a() {
        if (this.mIsSettling) {
            this.mIsSettling = false;
            onPanelSelected(this.mCurrentPanel);
            notifyOnScrollStateChanged();
        }
    }

    public void addOnScrolledListener(a aVar) {
        abmr.a();
        this.mOnScrolledListenerList.add(aVar);
    }

    public void addScrollingEnabledPredicate(Predicate<Void> predicate) {
        abmr.a();
        this.m.add(predicate);
    }

    public void animateToPage(int i) {
        animateToPage(i, 250);
    }

    public void animateToPage(final int i, final int i2) {
        Object obj = null;
        Preconditions.checkArgument(((double) i2) >= 0.0d);
        if (i != this.mCurrentPanel) {
            obj = 1;
        }
        if (obj != null && !this.mDidMeasureOnce) {
            this.l = new Runnable() {
                public final void run() {
                    abto.this.animateToPage(i, i2);
                }
            };
            requestLayout();
        } else if (!this.d.get(i)) {
            View focusedChild = getFocusedChild();
            if (!(focusedChild == null || obj == null || focusedChild != getChildAt(this.mCurrentPanel))) {
                focusedChild.clearFocus();
            }
            if (obj != null) {
                Iterator it = this.mOnScrolledListenerList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            this.mCurrentPanel = i;
            int childScrollY = getChildScrollY(i) - getScrollY();
            if (childScrollY != 0) {
                this.mScroller.startScroll(0, getScrollY(), 0, childScrollY, i2);
                this.mIsSettling = true;
                postInvalidate();
                return;
            }
            onPanelSelected(this.mCurrentPanel);
            notifyOnScrollStateChanged();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean canChildScroll(View view, Rect rect, MotionEvent motionEvent, int i) {
        int i2 = 0;
        if (view == null) {
            return false;
        }
        if (i < 0 && !canScrollInDirection(4)) {
            return false;
        }
        if (i > 0 && !canScrollInDirection(8)) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (i2 < childCount) {
                if (canChildScroll(viewGroup.getChildAt(i2), rect, motionEvent, i)) {
                    return true;
                }
                i2++;
            }
        }
        return view.canScrollVertically(i);
    }

    /* Access modifiers changed, original: protected */
    public boolean canChildScrollNow(float f, boolean z, boolean z2) {
        return (f - this.mStartTouchY > this.f && z) || (this.mStartTouchY - f > this.f && z2);
    }

    /* Access modifiers changed, original: protected */
    public boolean canSafelyScrollNow(float f, boolean z, boolean z2) {
        float f2 = this.mStartTouchY;
        float f3 = f - f2;
        float f4 = this.f;
        if (f3 <= f4) {
            return (f2 - f <= f4 || !canScrollInDirection(8) || this.mCurrentPanel == getChildCount() - 1 || z2 || (this.c.get(this.mCurrentPanel) & 8) == 8) ? false : true;
        } else {
            if (canScrollInDirection(4)) {
                int i = this.mCurrentPanel;
                return (i == 0 || z || (this.c.get(i) & 4) == 4) ? false : true;
            }
        }
    }

    public boolean canScrollInBothDirections() {
        return canScrollInDirection(8) && canScrollInDirection(4);
    }

    public boolean canScrollInDirection(int i) {
        if ((this.b & i) != i) {
            return false;
        }
        i = this.m.size();
        for (int i2 = 0; i2 < i; i2++) {
            if (!((Predicate) this.m.get(i2)).apply(null)) {
                return false;
            }
        }
        return true;
    }

    public boolean canScrollVertically(int i) {
        return (isScrollable() && getChildCount() != 0) ? (i >= 0 || canScrollInDirection(4)) ? (i <= 0 || canScrollInDirection(8)) ? ((i >= 0 || getScrollY() == 0) && (i <= 0 || getScrollY() == this.mScreenHeight * (getChildCount() - 1))) ? getChildAt(this.mCurrentPanel) == null ? false : getChildAt(this.mCurrentPanel).canScrollVertically(i) : true : false : false : false;
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams;
    }

    public void clearOnScrolledListeners() {
        abmr.a();
        this.mOnScrolledListenerList.clear();
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    public void completePageScroll(float r8) {
        /*
        r7 = this;
        r0 = r7.mCurrentPanel;
        r1 = r7.mStartTouchY;
        r2 = r1 - r8;
        r3 = r7.e;
        r4 = (float) r3;
        r5 = 0;
        r6 = 1;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0011;
    L_0x000f:
        r8 = 1;
        goto L_0x0059;
    L_0x0011:
        r1 = r8 - r1;
        r2 = (float) r3;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 <= 0) goto L_0x001a;
    L_0x0018:
        r0 = r0 - r6;
        goto L_0x005a;
    L_0x001a:
        r1 = r7.j;
        if (r1 != 0) goto L_0x0020;
    L_0x001e:
        r1 = 0;
        goto L_0x002f;
    L_0x0020:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = r7.i;
        r3 = (float) r3;
        r1.computeCurrentVelocity(r2, r3);
        r1 = r7.j;
        r1 = r1.getYVelocity();
        r1 = (int) r1;
    L_0x002f:
        r2 = r7.mStartTouchY;
        r8 = r8 - r2;
        r2 = r7.g;
        r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x0042;
    L_0x0038:
        r2 = r7.k;
        if (r1 <= r2) goto L_0x0042;
    L_0x003c:
        r2 = r7.mCurrentPanel;
        if (r2 <= 0) goto L_0x0042;
    L_0x0040:
        r8 = -1;
        goto L_0x0059;
    L_0x0042:
        r2 = r7.g;
        r2 = -r2;
        r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r8 >= 0) goto L_0x0058;
    L_0x0049:
        r8 = r7.k;
        r8 = -r8;
        if (r1 >= r8) goto L_0x0058;
    L_0x004e:
        r8 = r7.mCurrentPanel;
        r1 = r7.getChildCount();
        r1 = r1 - r6;
        if (r8 >= r1) goto L_0x0058;
    L_0x0057:
        goto L_0x000f;
    L_0x0058:
        r8 = 0;
    L_0x0059:
        r0 = r0 + r8;
    L_0x005a:
        r8 = r7.h;
        if (r0 >= r8) goto L_0x005f;
    L_0x005e:
        goto L_0x0060;
    L_0x005f:
        r8 = r0;
    L_0x0060:
        r0 = r7.getChildCount();
        r0 = r0 - r6;
        r8 = java.lang.Math.min(r8, r0);
        r8 = java.lang.Math.max(r5, r8);
        r0 = r7.mCurrentPanel;
        if (r8 <= r0) goto L_0x0079;
    L_0x0071:
        r0 = 8;
        r0 = r7.canScrollInDirection(r0);
        if (r0 == 0) goto L_0x0084;
    L_0x0079:
        r0 = r7.mCurrentPanel;
        if (r8 >= r0) goto L_0x0086;
    L_0x007d:
        r0 = 4;
        r0 = r7.canScrollInDirection(r0);
        if (r0 != 0) goto L_0x0086;
    L_0x0084:
        r8 = r7.mCurrentPanel;
    L_0x0086:
        r7.animateToPage(r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abto.completePageScroll(float):void");
    }

    public void computeScroll() {
        if (this.mScroller.computeScrollOffset()) {
            scrollViewTo();
        } else {
            a();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean convertMoveEventToDownEvent(float f) {
        if (this.mStartTouchY != -1.0f) {
            return false;
        }
        if (!this.mScroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        this.mStartTouchY = f;
        return true;
    }

    public void enablePanel(int i, boolean z) {
        if (this.d.get(i) == z) {
            this.d.put(i, z ^ 1);
            this.a += z ? -1 : 1;
        }
    }

    /* Access modifiers changed, original: protected */
    public MarginLayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-2, -2);
    }

    public MarginLayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public MarginLayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new MarginLayoutParams(layoutParams);
    }

    public int getChildScrollY(int i) {
        View childAt = getChildAt(i);
        return childAt == null ? 0 : Math.min(childAt.getTop(), getMeasuredHeight() - this.mScreenHeight);
    }

    public int getCurrentPanel() {
        return this.mCurrentPanel;
    }

    public boolean isScrollable() {
        return canScrollInDirection(8) || canScrollInDirection(4);
    }

    public boolean isScrolling() {
        return this.mIsDraggingForScroll || (this.mScroller.getCurrY() != this.mScroller.getFinalY() ? 1 : null) != null || this.mIsSettling;
    }

    /* Access modifiers changed, original: protected */
    public void notifyOnScrollStateChanged() {
        Iterator it = this.mOnScrolledListenerList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public boolean onDelegatedBackPressed() {
        if (this.mCurrentPanel == 0) {
            return false;
        }
        animateToPage(0);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getPointerCount() > 1 ? 1 : null) != null || this.mIsSettling || !isScrollable()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
        this.j.addMovement(motionEvent);
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.mStartTouchY = y;
            return false;
        } else if (actionMasked != 2) {
            return false;
        } else {
            View childAt = getChildAt(this.mCurrentPanel);
            if (!canSafelyScrollNow(y, canChildScroll(childAt, this.mChildRectBounds, motionEvent, -1), canChildScroll(childAt, this.mChildRectBounds, motionEvent, 1))) {
                return false;
            }
            this.mStartTouchY = y;
            this.mStartScrollY = (float) getScrollY();
            requestDisallowInterceptTouchEvent(true);
            Iterator it = this.mOnScrolledListenerList.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.mIsDraggingForScroll = true;
            return true;
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                i5 += Math.max(0, marginLayoutParams.topMargin);
                int measuredHeight = childAt.getMeasuredHeight() + i5;
                childAt.layout(marginLayoutParams.leftMargin, i5, (i3 - i) - marginLayoutParams.rightMargin, measuredHeight);
                i5 = measuredHeight + Math.max(0, marginLayoutParams.bottomMargin);
            }
        }
        if (getChildScrollY(this.mCurrentPanel) != getScrollY() && !isScrolling()) {
            snapToPage(this.mCurrentPanel);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        this.mScreenHeight = MeasureSpec.getSize(i2);
        if (this.mScreenHeight == 0) {
            this.mScreenHeight = abtp.b(getContext());
        }
        this.e = this.mScreenHeight / 2;
        i2 = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                childAt.measure(abto.getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(MeasureSpec.getMode(marginLayoutParams.height) != AudioPlayer.INFINITY_LOOP_COUNT ? (this.mScreenHeight - Math.abs(marginLayoutParams.topMargin)) - Math.abs(marginLayoutParams.bottomMargin) : Math.min(MeasureSpec.getSize(marginLayoutParams.height), this.mScreenHeight), AudioPlayer.INFINITY_LOOP_COUNT));
                i3 += (childAt.getMeasuredHeight() + Math.max(0, marginLayoutParams.topMargin)) + Math.max(0, marginLayoutParams.bottomMargin);
            }
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(i3, AudioPlayer.INFINITY_LOOP_COUNT));
        this.mDidMeasureOnce = true;
        Runnable runnable = this.l;
        if (runnable != null) {
            post(runnable);
            this.l = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void onPanelSelected(int i) {
        for (a b : this.mOnScrolledListenerList) {
            b.b(i);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator it = this.mOnScrolledListenerList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX WARNING: Missing block: B:13:0x0023, code skipped:
            if (r0 != 3) goto L_0x00d0;
     */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = r5.isScrollable();
        r1 = 0;
        if (r0 == 0) goto L_0x00d1;
    L_0x0007:
        r0 = r5.mIsSettling;
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        goto L_0x00d1;
    L_0x000d:
        r0 = r5.j;
        r2 = 1;
        if (r0 != 0) goto L_0x0013;
    L_0x0012:
        return r2;
    L_0x0013:
        r0 = r6.getActionMasked();
        r3 = r6.getY();
        if (r0 == 0) goto L_0x00ce;
    L_0x001d:
        if (r0 == r2) goto L_0x00c3;
    L_0x001f:
        r4 = 2;
        if (r0 == r4) goto L_0x002c;
    L_0x0022:
        r6 = 3;
        if (r0 == r6) goto L_0x0027;
    L_0x0025:
        goto L_0x00d0;
    L_0x0027:
        r5.resetTouchState();
        goto L_0x00d1;
    L_0x002c:
        r0 = r5.j;
        r0.addMovement(r6);
        r6 = r5.mIsDraggingForScroll;
        if (r6 == 0) goto L_0x0096;
    L_0x0035:
        r6 = r5.mStartTouchY;
        r6 = r6 - r3;
        r0 = r5.mStartScrollY;
        r6 = r6 + r0;
        r0 = r5.getMeasuredHeight();
        r1 = r5.a;
        r3 = r5.mScreenHeight;
        r1 = r1 * r3;
        r0 = r0 - r1;
        r0 = (float) r0;
        r6 = java.lang.Math.min(r6, r0);
        r6 = (int) r6;
        r0 = r5.h;
        r1 = r5.mScreenHeight;
        r0 = r0 * r1;
        r6 = java.lang.Math.max(r6, r0);
        r0 = (float) r6;
        r1 = r5.mStartScrollY;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 > 0) goto L_0x0062;
    L_0x005b:
        r1 = 4;
        r1 = r5.canScrollInDirection(r1);
        if (r1 == 0) goto L_0x00d0;
    L_0x0062:
        r1 = r5.mStartScrollY;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 < 0) goto L_0x0070;
    L_0x0068:
        r1 = 8;
        r1 = r5.canScrollInDirection(r1);
        if (r1 == 0) goto L_0x00d0;
    L_0x0070:
        r5.setScrollY(r6);
        r6 = r5.mStartScrollY;
        r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r6 < 0) goto L_0x007d;
    L_0x0079:
        r6 = r5.mCurrentPanel;
        r6 = r6 + r2;
        goto L_0x0080;
    L_0x007d:
        r6 = r5.mCurrentPanel;
        r6 = r6 - r2;
    L_0x0080:
        r0 = r5.mOnScrolledListenerList;
        r0 = r0.iterator();
    L_0x0086:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x00d0;
    L_0x008c:
        r1 = r0.next();
        r1 = (defpackage.abto.a) r1;
        r1.a(r6);
        goto L_0x0086;
    L_0x0096:
        r6 = r5.mCurrentPanel;
        r6 = r5.getChildAt(r6);
        if (r6 == 0) goto L_0x00d1;
    L_0x009e:
        r6 = r5.canSafelyScrollNow(r3, r1, r1);
        if (r6 == 0) goto L_0x00d1;
    L_0x00a4:
        r5.mStartTouchY = r3;
        r6 = r5.getScrollY();
        r6 = (float) r6;
        r5.mStartScrollY = r6;
        r5.requestDisallowInterceptTouchEvent(r2);
        r6 = r5.mOnScrolledListenerList;
        r6 = r6.iterator();
    L_0x00b6:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x00c0;
    L_0x00bc:
        r6.next();
        goto L_0x00b6;
    L_0x00c0:
        r5.mIsDraggingForScroll = r2;
        goto L_0x00d0;
    L_0x00c3:
        r6 = r5.mIsDraggingForScroll;
        if (r6 == 0) goto L_0x00ca;
    L_0x00c7:
        r5.completePageScroll(r3);
    L_0x00ca:
        r1 = r5.mIsDraggingForScroll;
        goto L_0x0027;
    L_0x00ce:
        r5.mStartTouchY = r3;
    L_0x00d0:
        r1 = 1;
    L_0x00d1:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abto.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeOnScrolledListener(a aVar) {
        abmr.a();
        this.mOnScrolledListenerList.remove(aVar);
    }

    public void removeScrollingEnabledPredicate(Predicate<Void> predicate) {
        synchronized (this.m) {
            this.m.remove(predicate);
        }
    }

    public void reset() {
        this.mCurrentPanel = 0;
        this.j = null;
        this.mIsSettling = false;
        resetTouchState();
        setScrollableInBothDirections(true);
    }

    /* Access modifiers changed, original: protected */
    public void resetTouchState() {
        this.mStartTouchY = -1.0f;
        this.mStartScrollY = MapboxConstants.MINIMUM_ZOOM;
        this.mIsDraggingForScroll = false;
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void scrollViewTo() {
        scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
        postInvalidate();
    }

    public void setDragToDismissEnabled(boolean z) {
        this.mDragToDismissEnabled = z;
    }

    /* Access modifiers changed, original: protected */
    public void setMinScrollablePage(int i) {
        this.h = i;
    }

    public void setScrollableInBothDirections(boolean z) {
        this.b = z ? 12 : 0;
    }

    public void setScrollableInDirection(int i, int i2, boolean z) {
        SparseIntArray sparseIntArray;
        if (z) {
            sparseIntArray = this.c;
            i2 = (i2 ^ -1) & sparseIntArray.get(i);
        } else {
            sparseIntArray = this.c;
            i2 |= sparseIntArray.get(i);
        }
        sparseIntArray.put(i, i2);
    }

    public void setScrollableInDirection(int i, boolean z) {
        if (z) {
            i |= this.b;
        } else {
            i = (i ^ -1) & this.b;
        }
        this.b = i;
    }

    public void snapToPage(int i) {
        animateToPage(i, 0);
        this.mScroller.computeScrollOffset();
        scrollViewTo();
        a();
    }
}
