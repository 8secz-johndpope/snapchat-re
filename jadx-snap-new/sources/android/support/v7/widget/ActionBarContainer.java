package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.snapchat.android.R;
import defpackage.kb;
import defpackage.lx.a;
import defpackage.no;
import defpackage.np;

public class ActionBarContainer extends FrameLayout {
    private View mActionBarView;
    public Drawable mBackground;
    private View mContextView;
    private int mHeight;
    public boolean mIsSplit;
    public boolean mIsStacked;
    private boolean mIsTransitioning;
    public Drawable mSplitBackground;
    public Drawable mStackedBackground;
    private View mTabContainer;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kb.a((View) this, VERSION.SDK_INT >= 21 ? new np(this) : new no(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
        boolean z = false;
        this.mBackground = obtainStyledAttributes.getDrawable(0);
        this.mStackedBackground = obtainStyledAttributes.getDrawable(2);
        this.mHeight = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.mIsSplit = true;
            this.mSplitBackground = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (this.mIsSplit ? this.mSplitBackground != null : !(this.mBackground == null && this.mStackedBackground == null)) {
            z = true;
        }
        setWillNotDraw(z);
    }

    private int getMeasuredHeightWithMargins(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return (view.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
    }

    private boolean isCollapsed(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mBackground;
        if (drawable != null && drawable.isStateful()) {
            this.mBackground.setState(getDrawableState());
        }
        drawable = this.mStackedBackground;
        if (drawable != null && drawable.isStateful()) {
            this.mStackedBackground.setState(getDrawableState());
        }
        drawable = this.mSplitBackground;
        if (drawable != null && drawable.isStateful()) {
            this.mSplitBackground.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.mTabContainer;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        drawable = this.mStackedBackground;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        drawable = this.mSplitBackground;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mActionBarView = findViewById(R.id.action_bar);
        this.mContextView = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mIsTransitioning || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.mTabContainer;
        i4 = 1;
        int i5 = 0;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            i2 = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i, (i2 - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, i2 - layoutParams.bottomMargin);
        }
        if (this.mIsSplit) {
            Drawable drawable = this.mSplitBackground;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                i4 = 0;
            }
        } else {
            Drawable drawable2;
            if (this.mBackground != null) {
                View view2;
                if (this.mActionBarView.getVisibility() == 0) {
                    drawable2 = this.mBackground;
                    i2 = this.mActionBarView.getLeft();
                    i3 = this.mActionBarView.getTop();
                    i5 = this.mActionBarView.getRight();
                    view2 = this.mActionBarView;
                } else {
                    View view3 = this.mContextView;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.mBackground.setBounds(0, 0, 0, 0);
                        i5 = 1;
                    } else {
                        drawable2 = this.mBackground;
                        i2 = this.mContextView.getLeft();
                        i3 = this.mContextView.getTop();
                        i5 = this.mContextView.getRight();
                        view2 = this.mContextView;
                    }
                }
                drawable2.setBounds(i2, i3, i5, view2.getBottom());
                i5 = 1;
            }
            this.mIsStacked = z2;
            if (z2) {
                drawable2 = this.mStackedBackground;
                if (drawable2 != null) {
                    drawable2.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
            }
            i4 = i5;
        }
        if (i4 != 0) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    public void onMeasure(int r4, int r5) {
        /*
        r3 = this;
        r0 = r3.mActionBarView;
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != 0) goto L_0x001c;
    L_0x0006:
        r0 = android.view.View.MeasureSpec.getMode(r5);
        if (r0 != r1) goto L_0x001c;
    L_0x000c:
        r0 = r3.mHeight;
        if (r0 < 0) goto L_0x001c;
    L_0x0010:
        r5 = android.view.View.MeasureSpec.getSize(r5);
        r5 = java.lang.Math.min(r0, r5);
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1);
    L_0x001c:
        super.onMeasure(r4, r5);
        r4 = r3.mActionBarView;
        if (r4 != 0) goto L_0x0024;
    L_0x0023:
        return;
    L_0x0024:
        r4 = android.view.View.MeasureSpec.getMode(r5);
        r0 = r3.mTabContainer;
        if (r0 == 0) goto L_0x006f;
    L_0x002c:
        r0 = r0.getVisibility();
        r2 = 8;
        if (r0 == r2) goto L_0x006f;
    L_0x0034:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r4 == r0) goto L_0x006f;
    L_0x0038:
        r0 = r3.mActionBarView;
        r0 = r3.isCollapsed(r0);
        if (r0 != 0) goto L_0x0047;
    L_0x0040:
        r0 = r3.mActionBarView;
    L_0x0042:
        r0 = r3.getMeasuredHeightWithMargins(r0);
        goto L_0x0053;
    L_0x0047:
        r0 = r3.mContextView;
        r0 = r3.isCollapsed(r0);
        if (r0 != 0) goto L_0x0052;
    L_0x004f:
        r0 = r3.mContextView;
        goto L_0x0042;
    L_0x0052:
        r0 = 0;
    L_0x0053:
        if (r4 != r1) goto L_0x005a;
    L_0x0055:
        r4 = android.view.View.MeasureSpec.getSize(r5);
        goto L_0x005d;
    L_0x005a:
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x005d:
        r5 = r3.getMeasuredWidth();
        r1 = r3.mTabContainer;
        r1 = r3.getMeasuredHeightWithMargins(r1);
        r0 = r0 + r1;
        r4 = java.lang.Math.min(r0, r4);
        r3.setMeasuredDimension(r5, r4);
    L_0x006f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.mBackground;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.mBackground);
        }
        this.mBackground = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.mActionBarView;
            if (view != null) {
                this.mBackground.setBounds(view.getLeft(), this.mActionBarView.getTop(), this.mActionBarView.getRight(), this.mActionBarView.getBottom());
            }
        }
        boolean z = true;
        if (this.mIsSplit ? this.mSplitBackground != null : !(this.mBackground == null && this.mStackedBackground == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.mSplitBackground;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.mSplitBackground);
        }
        this.mSplitBackground = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.mIsSplit) {
                drawable = this.mSplitBackground;
                if (drawable != null) {
                    drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                }
            }
        }
        if (this.mIsSplit ? this.mSplitBackground != null : !(this.mBackground == null && this.mStackedBackground == null)) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.mStackedBackground;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.mStackedBackground);
        }
        this.mStackedBackground = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.mIsStacked) {
                drawable = this.mStackedBackground;
                if (drawable != null) {
                    drawable.setBounds(this.mTabContainer.getLeft(), this.mTabContainer.getTop(), this.mTabContainer.getRight(), this.mTabContainer.getBottom());
                }
            }
        }
        boolean z = true;
        if (this.mIsSplit ? this.mSplitBackground != null : !(this.mBackground == null && this.mStackedBackground == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.mTabContainer;
        if (view != null) {
            removeView(view);
        }
        this.mTabContainer = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.mIsTransitioning = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        drawable = this.mStackedBackground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        drawable = this.mSplitBackground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        return i != 0 ? super.startActionModeForChild(view, callback, i) : null;
    }

    /* Access modifiers changed, original: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.mBackground && !this.mIsSplit) || ((drawable == this.mStackedBackground && this.mIsStacked) || ((drawable == this.mSplitBackground && this.mIsSplit) || super.verifyDrawable(drawable)));
    }
}
