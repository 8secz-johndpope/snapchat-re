package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.kb;
import defpackage.kf;
import defpackage.kg;
import defpackage.lx.a;
import defpackage.nq;

abstract class AbsActionBarView extends ViewGroup {
    private static final int FADE_DURATION = 200;
    protected nq mActionMenuPresenter;
    protected int mContentHeight;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected final VisibilityAnimListener mVisAnimListener;
    protected kf mVisibilityAnim;

    public class VisibilityAnimListener implements kg {
        private boolean mCanceled = false;
        int mFinalVisibility;

        protected VisibilityAnimListener() {
        }

        public void onAnimationCancel(View view) {
            this.mCanceled = true;
        }

        public void onAnimationEnd(View view) {
            if (!this.mCanceled) {
                AbsActionBarView absActionBarView = AbsActionBarView.this;
                absActionBarView.mVisibilityAnim = null;
                super.setVisibility(this.mFinalVisibility);
            }
        }

        public void onAnimationStart(View view) {
            super.setVisibility(0);
            this.mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(kf kfVar, int i) {
            AbsActionBarView.this.mVisibilityAnim = kfVar;
            this.mFinalVisibility = i;
            return this;
        }
    }

    AbsActionBarView(Context context) {
        this(context, null);
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVisAnimListener = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.mPopupContext = context;
        } else {
            this.mPopupContext = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int next(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public void animateToVisibility(int i) {
        setupAnimatorToVisibility(i, 200).d();
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        nq nqVar = this.mActionMenuPresenter;
        if (nqVar != null) {
            nqVar.f();
        }
    }

    public int getAnimatedVisibility() {
        return this.mVisibilityAnim != null ? this.mVisAnimListener.mFinalVisibility : getVisibility();
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public boolean hideOverflowMenu() {
        nq nqVar = this.mActionMenuPresenter;
        return nqVar != null ? nqVar.e() : false;
    }

    public boolean isOverflowMenuShowPending() {
        nq nqVar = this.mActionMenuPresenter;
        return nqVar != null ? nqVar.i() : false;
    }

    public boolean isOverflowMenuShowing() {
        nq nqVar = this.mActionMenuPresenter;
        return nqVar != null ? nqVar.h() : false;
    }

    public boolean isOverflowReserved() {
        nq nqVar = this.mActionMenuPresenter;
        return nqVar != null && nqVar.j;
    }

    /* Access modifiers changed, original: protected */
    public int measureChildView(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* Access modifiers changed, original: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        nq nqVar = this.mActionMenuPresenter;
        if (nqVar != null) {
            nqVar.b();
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public int positionChild(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        i2 += (i3 - measuredHeight) / 2;
        if (z) {
            view.layout(i - measuredWidth, i2, i, measuredHeight + i2);
        } else {
            view.layout(i, i2, i + measuredWidth, measuredHeight + i2);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public void postShowOverflowMenu() {
        post(new Runnable() {
            public final void run() {
                AbsActionBarView.this.showOverflowMenu();
            }
        });
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            kf kfVar = this.mVisibilityAnim;
            if (kfVar != null) {
                kfVar.c();
            }
            super.setVisibility(i);
        }
    }

    public kf setupAnimatorToVisibility(int i, long j) {
        kf kfVar = this.mVisibilityAnim;
        if (kfVar != null) {
            kfVar.c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(MapboxConstants.MINIMUM_ZOOM);
            }
            kfVar = kb.b(this).a(1.0f);
        } else {
            kfVar = kb.b(this).a((float) MapboxConstants.MINIMUM_ZOOM);
        }
        kfVar.a(j);
        kfVar.a(this.mVisAnimListener.withFinalVisibility(kfVar, i));
        return kfVar;
    }

    public boolean showOverflowMenu() {
        nq nqVar = this.mActionMenuPresenter;
        return nqVar != null ? nqVar.d() : false;
    }
}
