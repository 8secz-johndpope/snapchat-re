package com.snapchat.android.framework.ui.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abtp;
import defpackage.abtv;
import defpackage.abud;
import defpackage.abxt;

public class Tooltip extends RelativeLayout implements abxt, OnAttachStateChangeListener, OnGlobalLayoutListener {
    private static final float ALPHA_OPAQUE_FLOAT = 1.0f;
    private static final float ALPHA_TRANSPARENT_FLOAT = 0.0f;
    private static final int ANIMATION_DURATION_MS = 300;
    private static final long DEFAULT_FADEOUT_DELAY_MS = 2500;
    private static final long DEFAULT_FADEOUT_DURATION_MS = 200;
    private static final float SCALE_DISAPPEAR = 0.0f;
    private static final float SCALE_ORIGINAL = 1.0f;
    protected View mAttachedView = null;
    protected View mBottomTriangle;
    private AlphaAnimation mFadeOutAnimation;
    private long mFadeoutDelayMs = DEFAULT_FADEOUT_DELAY_MS;
    private long mFadeoutDurationMs = DEFAULT_FADEOUT_DURATION_MS;
    private int mHorizontalOffsetPx;
    private boolean mIgnorePadding;
    private boolean mIsPointingDown = true;
    private b mParentInnerMargins;
    protected int mRoundedCornerRadius;
    private float mTargetViewScaleFactor = 1.0f;
    protected a mTooltipDirection;
    protected int mTooltipHorizontalOffset;
    protected int mTooltipMinimumLeftBoundaryPx;
    protected int mTooltipPointerHorizontalOffsetPx;
    protected View mTopTriangle;
    protected int mTriangleWidth;
    private int mVerticalOffsetPx;

    public enum a {
        POINTER_UP,
        POINTER_DOWN,
        MOVE_VERTICAL_TO_FIT,
        RECYCLERVIEW_FEED_V2
    }

    /* renamed from: com.snapchat.android.framework.ui.views.Tooltip$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.snapchat.android.framework.ui.views.Tooltip.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.snapchat.android.framework.ui.views.Tooltip.a.POINTER_DOWN;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.snapchat.android.framework.ui.views.Tooltip.a.POINTER_UP;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.snapchat.android.framework.ui.views.Tooltip.a.MOVE_VERTICAL_TO_FIT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.android.framework.ui.views.Tooltip$AnonymousClass3.<clinit>():void");
        }
    }

    public static class b {
        public final int a;
        public final int b = 0;
        public final int c;
        private int d;

        public b(int i, int i2) {
            this.a = i;
            this.c = i2;
            this.d = 0;
        }
    }

    public Tooltip(Context context) {
        super(context);
    }

    public Tooltip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Tooltip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private Animator getDisplayAnimation() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(SCALE_X, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f}), PropertyValuesHolder.ofFloat(SCALE_Y, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f})});
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        ofPropertyValuesHolder.setInterpolator(new abud());
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat});
        return animatorSet;
    }

    private void hideInternal() {
        setVisibility(8);
        setAlpha(MapboxConstants.MINIMUM_ZOOM);
        this.mIsPointingDown = true;
        this.mFadeOutAnimation = null;
        View view = this.mAttachedView;
        if (view != null) {
            abtp.a(view, (OnGlobalLayoutListener) this);
        }
    }

    private void moveTooltipToPointAtAttachedView(abxt abxt) {
        if (this.mAttachedView != null && getParent() != null && this.mAttachedView.getWidth() != 0 && this.mAttachedView.getHeight() != 0) {
            View view = (View) getParent();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            moveTooltipToAnchorView(abxt, new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight()));
        }
    }

    public void attachToView(View view, boolean z) {
        this.mAttachedView = view;
        this.mIgnorePadding = z;
        moveTooltipToPointAtAttachedView();
    }

    public void cancelFadeOutAnimationIfNecessary() {
        AlphaAnimation alphaAnimation = this.mFadeOutAnimation;
        if (alphaAnimation != null) {
            alphaAnimation.setAnimationListener(null);
            this.mFadeOutAnimation.cancel();
            this.mFadeOutAnimation = null;
        }
    }

    public void fadeOut() {
        if (this.mFadeOutAnimation == null) {
            this.mFadeOutAnimation = new AlphaAnimation(1.0f, MapboxConstants.MINIMUM_ZOOM);
            this.mFadeOutAnimation.setDuration(this.mFadeoutDurationMs);
            this.mFadeOutAnimation.setAnimationListener(new abtv() {
                public final void onAnimationEnd(Animation animation) {
                    Tooltip.this.hideInternal();
                }
            });
            startAnimation(this.mFadeOutAnimation);
        }
    }

    /* Access modifiers changed, original: protected */
    public View getBottomTriangle() {
        return this.mBottomTriangle;
    }

    /* Access modifiers changed, original: protected */
    public View getTopTriangle() {
        return this.mTopTriangle;
    }

    public void hide() {
        AlphaAnimation alphaAnimation = this.mFadeOutAnimation;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
        }
        hideInternal();
    }

    public void initialize(int i, int i2, int i3, int i4) {
        this.mTopTriangle = (View) Preconditions.checkNotNull(findViewById(i));
        this.mBottomTriangle = (View) Preconditions.checkNotNull(findViewById(i2));
        this.mVerticalOffsetPx = 0;
        this.mHorizontalOffsetPx = 0;
        this.mTooltipPointerHorizontalOffsetPx = 0;
        this.mTooltipDirection = a.MOVE_VERTICAL_TO_FIT;
        this.mRoundedCornerRadius = i3;
        this.mTriangleWidth = i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0164  */
    /* JADX WARNING: Missing block: B:27:0x00dc, code skipped:
            if (r17 == null) goto L_0x00e0;
     */
    public void moveTooltipToAnchorView(defpackage.abxt r19, android.graphics.Rect r20) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r20;
        r2 = r0.mAttachedView;
        com.google.common.base.Preconditions.checkNotNull(r2);
        r2 = r0.mAttachedView;
        r2 = r2.getHeight();
        r3 = r0.mVerticalOffsetPx;
        r2 = r2 + r3;
        r3 = 2;
        r4 = new int[r3];
        r5 = r20.width();
        r6 = r0.mTooltipHorizontalOffset;
        r5 = r5 + r6;
        r6 = r0.mAttachedView;
        r6.getLocationOnScreen(r4);
        r6 = 0;
        r7 = r4[r6];
        r8 = r1.left;
        r7 = r7 - r8;
        r8 = r0.mHorizontalOffsetPx;
        r7 = r7 + r8;
        r8 = 1;
        r4 = r4[r8];
        r9 = r1.top;
        r4 = r4 - r9;
        r9 = r0.mVerticalOffsetPx;
        r4 = r4 + r9;
        r9 = r0.mAttachedView;
        r9 = r9.getWidth();
        r9 = (float) r9;
        r10 = r0.mAttachedView;
        r10 = r10.getScaleX();
        r9 = r9 * r10;
        r10 = r0.mTargetViewScaleFactor;
        r9 = r9 * r10;
        r9 = java.lang.Math.round(r9);
        r9 = r9 + r7;
        r2 = (float) r2;
        r10 = r0.mAttachedView;
        r10 = r10.getScaleY();
        r2 = r2 * r10;
        r10 = r0.mTargetViewScaleFactor;
        r2 = r2 * r10;
        r2 = java.lang.Math.round(r2);
        r2 = r2 + r4;
        r10 = r18.getWidth();
        r11 = r18.getHeight();
        r12 = r0.mIgnorePadding;
        if (r12 == 0) goto L_0x0081;
    L_0x0065:
        r12 = r0.mAttachedView;
        r12 = r12.getPaddingLeft();
        r7 = r7 + r12;
        r12 = r0.mAttachedView;
        r12 = r12.getPaddingRight();
        r9 = r9 - r12;
        r12 = r0.mAttachedView;
        r12 = r12.getPaddingTop();
        r4 = r4 + r12;
        r12 = r0.mAttachedView;
        r12 = r12.getPaddingBottom();
        r2 = r2 - r12;
    L_0x0081:
        r1 = r20.height();
        r1 = r1 - r11;
        r12 = r0.mTooltipMinimumLeftBoundaryPx;
        r13 = r5 - r10;
        r14 = r0.mRoundedCornerRadius;
        r15 = r0.mTriangleWidth;
        r5 = r5 - r15;
        r5 = r5 - r14;
        r15 = r0.mParentInnerMargins;
        if (r15 == 0) goto L_0x00a6;
    L_0x0094:
        r15 = r15.a;
        r12 = r12 + r15;
        r15 = r0.mParentInnerMargins;
        r15 = r15.c;
        r13 = r13 - r15;
        r15 = r0.mParentInnerMargins;
        r15 = r15.a;
        r14 = r14 + r15;
        r15 = r0.mParentInnerMargins;
        r15 = r15.c;
        r5 = r5 - r15;
    L_0x00a6:
        r15 = com.snapchat.android.framework.ui.views.Tooltip.AnonymousClass3.a;
        r6 = r0.mTooltipDirection;
        r6 = r6.ordinal();
        r6 = r15[r6];
        if (r6 == r8) goto L_0x00e0;
    L_0x00b2:
        if (r6 == r3) goto L_0x00df;
    L_0x00b4:
        r15 = 3;
        if (r6 == r15) goto L_0x00b8;
    L_0x00b7:
        goto L_0x00e2;
    L_0x00b8:
        r6 = r4 - r11;
        r15 = r1 - r2;
        if (r6 < 0) goto L_0x00c1;
    L_0x00be:
        r16 = 1;
        goto L_0x00c3;
    L_0x00c1:
        r16 = 0;
    L_0x00c3:
        if (r15 < 0) goto L_0x00c8;
    L_0x00c5:
        r17 = 1;
        goto L_0x00ca;
    L_0x00c8:
        r17 = 0;
    L_0x00ca:
        if (r16 != 0) goto L_0x00d5;
    L_0x00cc:
        if (r17 != 0) goto L_0x00d5;
    L_0x00ce:
        if (r6 < r15) goto L_0x00d2;
    L_0x00d0:
        r6 = 1;
        goto L_0x00d3;
    L_0x00d2:
        r6 = 0;
    L_0x00d3:
        r0.mIsPointingDown = r6;
    L_0x00d5:
        r6 = r0.mIsPointingDown;
        if (r6 == 0) goto L_0x00dc;
    L_0x00d9:
        r8 = r16;
        goto L_0x00e0;
    L_0x00dc:
        if (r17 != 0) goto L_0x00df;
    L_0x00de:
        goto L_0x00e0;
    L_0x00df:
        r8 = 0;
    L_0x00e0:
        r0.mIsPointingDown = r8;
    L_0x00e2:
        r6 = r0.mTopTriangle;
        r8 = r0.mIsPointingDown;
        r15 = 8;
        if (r8 == 0) goto L_0x00ed;
    L_0x00ea:
        r8 = 8;
        goto L_0x00ee;
    L_0x00ed:
        r8 = 0;
    L_0x00ee:
        r6.setVisibility(r8);
        r6 = r0.mBottomTriangle;
        r8 = r0.mIsPointingDown;
        if (r8 == 0) goto L_0x00f8;
    L_0x00f7:
        r15 = 0;
    L_0x00f8:
        r6.setVisibility(r15);
        r7 = r7 + r9;
        r7 = r7 / r3;
        r6 = r0.mIsPointingDown;
        if (r6 == 0) goto L_0x0102;
    L_0x0101:
        r2 = r4;
    L_0x0102:
        r4 = r0.mIsPointingDown;
        if (r4 == 0) goto L_0x0109;
    L_0x0106:
        r4 = r0.mBottomTriangle;
        goto L_0x010b;
    L_0x0109:
        r4 = r0.mTopTriangle;
    L_0x010b:
        r6 = r0.mTriangleWidth;
        r6 = r6 / r3;
        r7 = r7 - r6;
        r5 = java.lang.Math.min(r7, r5);
        r5 = java.lang.Math.max(r14, r5);
        r6 = r0.mTriangleWidth;
        r6 = r6 / r3;
        r6 = r6 + r5;
        r10 = r10 / r3;
        r6 = r6 - r10;
        r3 = java.lang.Math.min(r6, r13);
        r3 = java.lang.Math.max(r12, r3);
        r6 = r0.mTooltipPointerHorizontalOffsetPx;
        r5 = r5 + r6;
        r6 = r0.mIsPointingDown;
        if (r6 == 0) goto L_0x012e;
    L_0x012c:
        r6 = -r11;
        goto L_0x012f;
    L_0x012e:
        r6 = 0;
    L_0x012f:
        r2 = r2 + r6;
        r6 = r0.mParentInnerMargins;
        if (r6 == 0) goto L_0x013d;
    L_0x0134:
        r1 = java.lang.Math.min(r2, r1);
        r2 = 0;
        r2 = java.lang.Math.max(r2, r1);
    L_0x013d:
        r5 = r5 - r3;
        r1 = (float) r5;
        r6 = r0.mTriangleWidth;
        r6 = (float) r6;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 / r7;
        r1 = r1 + r6;
        r0.setPivotX(r1);
        r1 = r0.mIsPointingDown;
        if (r1 == 0) goto L_0x014f;
    L_0x014d:
        r1 = (float) r11;
        goto L_0x0150;
    L_0x014f:
        r1 = 0;
    L_0x0150:
        r0.setPivotY(r1);
        r1 = (float) r3;
        r2 = (float) r2;
        r3 = r19;
        r3.positionTooltipTo(r1, r2);
        r1 = r4.getLayoutParams();
        r1 = (android.widget.RelativeLayout.LayoutParams) r1;
        r2 = r1.leftMargin;
        if (r2 == r5) goto L_0x0169;
    L_0x0164:
        r1.leftMargin = r5;
        r4.setLayoutParams(r1);
    L_0x0169:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.android.framework.ui.views.Tooltip.moveTooltipToAnchorView(abxt, android.graphics.Rect):void");
    }

    public void moveTooltipToPointAtAttachedView() {
        if (getParent() instanceof View) {
            moveTooltipToPointAtAttachedView(this);
        }
    }

    public void onGlobalLayout() {
        moveTooltipToPointAtAttachedView();
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        abtp.a(view, (OnGlobalLayoutListener) this);
        hide();
    }

    public void positionTooltipTo(float f, float f2) {
        setX(f);
        setY(f2);
    }

    public void setFadeoutDelayAndDuration(long j, long j2) {
        boolean z = true;
        Preconditions.checkArgument(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.mFadeoutDelayMs = j;
        this.mFadeoutDurationMs = j2;
    }

    public void setHorizontalOffsetPx(int i) {
        this.mHorizontalOffsetPx = i;
    }

    public void setParentInnerMargins(b bVar) {
        this.mParentInnerMargins = bVar;
    }

    public void setTargetViewScaleFactor(float f) {
        this.mTargetViewScaleFactor = f;
    }

    public void setTooltipDirection(a aVar) {
        this.mTooltipDirection = aVar;
    }

    public void setTooltipHorizontalOffset(int i) {
        this.mTooltipHorizontalOffset = i;
    }

    public void setTooltipMinimumLeftBoundaryPx(int i) {
        this.mTooltipMinimumLeftBoundaryPx = i;
    }

    public void setTooltipPointerHorizontalOffsetPx(int i) {
        this.mTooltipPointerHorizontalOffsetPx = i;
    }

    public void setVerticalOffsetPx(int i) {
        this.mVerticalOffsetPx = i;
    }

    public void show() {
        View view = this.mAttachedView;
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
            this.mAttachedView.getViewTreeObserver().addOnGlobalLayoutListener(this);
            setScaleX(MapboxConstants.MINIMUM_ZOOM);
            setScaleY(MapboxConstants.MINIMUM_ZOOM);
            Animator displayAnimation = getDisplayAnimation();
            displayAnimation.setDuration(300);
            setVisibility(0);
            displayAnimation.start();
        }
    }

    public void showAndFadeOut() {
        AlphaAnimation alphaAnimation = this.mFadeOutAnimation;
        if (alphaAnimation != null) {
            alphaAnimation.setAnimationListener(null);
            this.mFadeOutAnimation.cancel();
        }
        View view = this.mAttachedView;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.mAttachedView.addOnAttachStateChangeListener(this);
            this.mFadeOutAnimation = new AlphaAnimation(1.0f, MapboxConstants.MINIMUM_ZOOM);
            this.mFadeOutAnimation.setStartOffset(this.mFadeoutDelayMs);
            this.mFadeOutAnimation.setDuration(this.mFadeoutDurationMs);
            this.mFadeOutAnimation.setAnimationListener(new abtv() {
                public final void onAnimationEnd(Animation animation) {
                    Tooltip.this.hideInternal();
                }
            });
            setVisibility(0);
            setAlpha(1.0f);
            startAnimation(this.mFadeOutAnimation);
        }
    }
}
