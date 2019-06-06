package com.snap.ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Keep;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.Tooltip;
import com.snapchat.android.framework.ui.views.Tooltip.a;
import com.snapchat.android.framework.ui.views.TriangleView;
import defpackage.abtp;
import defpackage.ajdx;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.azt;
import defpackage.azu;
import defpackage.azv;
import defpackage.azx;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class OnBoardTooltipView extends Tooltip {
    private final float ALPHA_ONE = 1.0f;
    private final float ALPHA_ZERO;
    private final int ANIMATION_DURATION_MS = MapboxConstants.ANIMATION_DURATION_SHORT;
    private final int DEFAULT_FADEOUT_DELAY_MS = 2500;
    private final long DEFAULT_FADEOUT_DURATION_MS = 200;
    private final float SCALE_HIDDEN = 0.5f;
    private final float SCALE_SHOWN = 1.0f;
    private final int SPRING_CONSTANT_FRICTION = 36;
    private final int SPRING_CONSTANT_TENSION = MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
    private final String TAG = "OnBoardTooltipView";
    private int currentBottom = -1;
    private int currentLeft = -1;
    private int currentRight = -1;
    private int currentTop = -1;
    private AtomicBoolean isSpringIntialized = new AtomicBoolean(false);
    private int mCaretOffsetPx;
    private ObjectAnimator mFadeInAnimator;
    private boolean mIsPointingDown;
    private final OnBoardTooltipView$mSimpleSpringListener$1 mSimpleSpringListener = new OnBoardTooltipView$mSimpleSpringListener$1(this);
    private azt mSpring;
    private final azu mSpringConfig = new azu((double) this.SPRING_CONSTANT_TENSION, (double) this.SPRING_CONSTANT_FRICTION);
    private TextView mTextView;
    private int mTipMarginPx;

    public static final class Builder {
        private int mCaretOffsetInPx;
        private int mColorId = R.color.onboard_tooltip_background_color;
        private final Context mContext;
        private final int mStringId;
        private int mTextBackgroundDrawableId = R.drawable.onboard_tooltip_background;
        private int mTextColorId = R.color.white;
        private a mTooltipDirection = a.POINTER_UP;
        private int mTooltipMarginDpResId = R.dimen.default_gap_half;
        private int mTooltipMarginInPx = -8888;
        private List<String> mTooltipStringParameters;
        private final View mViewAttachTo;

        public Builder(Context context, View view, int i) {
            akcr.b(context, "mContext");
            akcr.b(view, "mViewAttachTo");
            this.mContext = context;
            this.mViewAttachTo = view;
            this.mStringId = i;
        }

        public final OnBoardTooltipView build() {
            OnBoardTooltipView onBoardTooltipView = new OnBoardTooltipView(this.mContext);
            View.inflate(this.mContext, R.layout.onboard_tooltip_layout, onBoardTooltipView);
            onBoardTooltipView.initialize(this.mViewAttachTo, this.mStringId, this.mTooltipDirection, this.mColorId, this.mTextColorId, this.mTextBackgroundDrawableId, this.mTooltipMarginDpResId, this.mTooltipStringParameters, this.mTooltipMarginInPx);
            return onBoardTooltipView;
        }

        public final ajdx<OnBoardTooltipView> buildObservable() {
            Object f = ajdx.b(new OnBoardTooltipView(this.mContext)).f(new OnBoardTooltipView$Builder$buildObservable$1(this)).f(new OnBoardTooltipView$Builder$buildObservable$2(this));
            akcr.a(f, "Single.just(OnBoardToolt…ers, mTooltipMarginInPx)}");
            return f;
        }

        public final Builder withBackgroundDrawable(int i) {
            this.mTextBackgroundDrawableId = i;
            return this;
        }

        public final Builder withColor(int i) {
            this.mColorId = i;
            return this;
        }

        public final Builder withPointerDirection(a aVar) {
            akcr.b(aVar, "direction");
            this.mTooltipDirection = aVar;
            return this;
        }

        public final Builder withStringParameters(List<String> list) {
            akcr.b(list, "tooltipParameters");
            this.mTooltipStringParameters = list;
            return this;
        }

        public final Builder withTextColor(int i) {
            this.mTextColorId = i;
            return this;
        }

        public final Builder withTipMargin(int i) {
            this.mTooltipMarginDpResId = i;
            return this;
        }

        public final Builder withTipMarginInPx(int i) {
            this.mTooltipMarginInPx = i;
            return this;
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[a.POINTER_UP.ordinal()] = 1;
            $EnumSwitchMapping$0[a.POINTER_DOWN.ordinal()] = 2;
        }
    }

    public OnBoardTooltipView(Context context) {
        super(context);
    }

    public OnBoardTooltipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnBoardTooltipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private final void onHideAnimationEnd() {
        setAlpha(this.ALPHA_ZERO);
        setVisibility(8);
    }

    private final void refreshShouldPointingDown(int i) {
        Object system = Resources.getSystem();
        akcr.a(system, "Resources.getSystem()");
        int i2 = system.getDisplayMetrics().heightPixels;
        if (!this.mIsPointingDown || i > i2 / 2) {
            if (!this.mIsPointingDown && i > i2 / 2) {
                this.mIsPointingDown = true;
            }
            return;
        }
        this.mIsPointingDown = false;
    }

    private final void setTooltipAnimationScale(float f) {
        setScaleX(f);
        setScaleY(f);
    }

    public final void hideWithBouncyAnimation() {
        azt azt = this.mSpring;
        if (azt != null) {
            azt.b((double) this.SCALE_HIDDEN);
        }
        ObjectAnimator objectAnimator = this.mFadeInAnimator;
        if (objectAnimator != null) {
            if (objectAnimator.isStarted()) {
                objectAnimator.end();
            }
            objectAnimator.removeAllListeners();
            objectAnimator.addListener(new OnBoardTooltipView$hideWithBouncyAnimation$$inlined$let$lambda$1(this));
            objectAnimator.reverse();
        }
    }

    public final void initSpring() {
        if (this.isSpringIntialized.compareAndSet(false, true)) {
            this.mSpring = azx.b().a();
            azt azt = this.mSpring;
            if (azt != null) {
                azt.a(this.mSpringConfig);
                azt.b((double) this.SCALE_SHOWN);
                azt.b = false;
                azt.a((azv) this.mSimpleSpringListener);
            }
        }
    }

    public final OnBoardTooltipView initialize(View view, int i, a aVar, int i2, int i3, int i4, int i5, List<String> list, int i6) {
        akcr.b(view, "viewAttachedTo");
        akcr.b(aVar, "direction");
        super.initialize(R.id.onboard_tooltip_top, R.id.onboard_tooltip_bottom, getResources().getDimensionPixelOffset(R.dimen.onboard_tooltip_corner_radius), getResources().getDimensionPixelSize(R.dimen.onboard_tooltip_triangle_width));
        View findViewById = findViewById(R.id.onboard_tooltip_text);
        if (findViewById != null) {
            String string;
            this.mTextView = (TextView) Preconditions.checkNotNull((TextView) findViewById);
            if (list == null || list.isEmpty()) {
                string = getResources().getString(i);
            } else {
                Resources resources = getResources();
                Object[] toArray = list.toArray(new String[0]);
                if (toArray != null) {
                    string = resources.getString(i, Arrays.copyOf(toArray, toArray.length));
                } else {
                    throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            TextView textView = this.mTextView;
            if (textView == null) {
                akcr.a();
            }
            textView.setText(string);
            TextView textView2 = this.mTextView;
            if (textView2 == null) {
                akcr.a();
            }
            textView2.setTextColor(getResources().getColor(i3));
            textView2 = this.mTextView;
            if (textView2 == null) {
                akcr.a();
            }
            textView2.setOnTouchListener(OnBoardTooltipView$initialize$1.INSTANCE);
            Object context = getContext();
            akcr.a(context, "context");
            setTooltipMinimumLeftBoundaryPx(context.getResources().getDimensionPixelOffset(R.dimen.default_gap));
            if (i6 == -8888) {
                i6 = getResources().getDimensionPixelOffset(i5);
            }
            this.mTipMarginPx = i6;
            setTooltipDirection(aVar);
            attachToView(view, false);
            this.mFadeInAnimator = ObjectAnimator.ofFloat(this, "alpha", new float[]{this.ALPHA_ZERO, this.ALPHA_ONE});
            ObjectAnimator objectAnimator = this.mFadeInAnimator;
            if (objectAnimator == null) {
                akcr.a();
            }
            objectAnimator.setDuration((long) this.ANIMATION_DURATION_MS);
            view = this.mTopTriangle;
            string = "null cannot be cast to non-null type com.snapchat.android.framework.ui.views.TriangleView";
            if (view != null) {
                ((TriangleView) view).b(getResources().getColor(i2));
                view = this.mBottomTriangle;
                if (view != null) {
                    ((TriangleView) view).b(getResources().getColor(i2));
                    TextView textView3 = this.mTextView;
                    if (textView3 == null) {
                        akcr.a();
                    }
                    textView3.setBackground(getResources().getDrawable(i4));
                    return this;
                }
                throw new ajxt(string);
            }
            throw new ajxt(string);
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void moveTooltipToPointAtAttachedView() {
        if (!(this.mAttachedView == null || getParent() == null)) {
            View view = this.mAttachedView;
            if (view == null) {
                akcr.a();
            }
            if (view.getWidth() != 0) {
                view = this.mAttachedView;
                if (view == null) {
                    akcr.a();
                }
                if (view.getHeight() != 0) {
                    view = this.mAttachedView;
                    if (view == null) {
                        akcr.a();
                    }
                    if (view.isShown()) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            view = (View) parent;
                            View view2 = this.mIsPointingDown ? this.mBottomTriangle : this.mTopTriangle;
                            int width = view.getWidth();
                            int[] iArr = new int[2];
                            int[] iArr2 = new int[2];
                            View view3 = this.mAttachedView;
                            if (view3 == null) {
                                akcr.a();
                            }
                            view3.getLocationOnScreen(iArr);
                            view.getLocationOnScreen(iArr2);
                            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.default_gap_half);
                            int i = 0;
                            int i2 = (iArr[0] - iArr2[0]) + this.mTooltipHorizontalOffset;
                            int i3 = iArr[1] - iArr2[1];
                            View view4 = this.mAttachedView;
                            if (view4 == null) {
                                akcr.a();
                            }
                            float width2 = (float) view4.getWidth();
                            View view5 = this.mAttachedView;
                            if (view5 == null) {
                                akcr.a();
                            }
                            int round = Math.round(width2 * view5.getScaleX()) + i2;
                            view5 = this.mAttachedView;
                            if (view5 == null) {
                                akcr.a();
                            }
                            float height = (float) view5.getHeight();
                            View view6 = this.mAttachedView;
                            if (view6 == null) {
                                akcr.a();
                            }
                            int round2 = Math.round(height * view6.getScaleY()) + i3;
                            if (i2 != this.currentLeft || i3 != this.currentTop || round != this.currentRight || round2 != this.currentBottom) {
                                int i4;
                                this.currentTop = i3;
                                this.currentBottom = round2;
                                this.currentLeft = i2;
                                this.currentRight = round;
                                TextView textView = this.mTextView;
                                if (textView == null) {
                                    akcr.a();
                                }
                                textView.measure(0, 0);
                                textView = this.mTextView;
                                if (textView == null) {
                                    akcr.a();
                                }
                                int measuredWidth = textView.getMeasuredWidth();
                                TextView textView2 = this.mTextView;
                                if (textView2 == null) {
                                    akcr.a();
                                }
                                int measuredHeight = textView2.getMeasuredHeight();
                                if (view2 == null) {
                                    akcr.a();
                                }
                                measuredHeight = (measuredHeight + view2.getHeight()) + dimensionPixelOffset;
                                if (this.mTooltipDirection == a.RECYCLERVIEW_FEED_V2) {
                                    refreshShouldPointingDown(iArr[1]);
                                } else {
                                    a aVar = this.mTooltipDirection;
                                    if (aVar != null) {
                                        i4 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
                                        if (i4 != 1 && i4 == 2) {
                                            this.mIsPointingDown = true;
                                        }
                                    }
                                    this.mIsPointingDown = false;
                                }
                                i4 = this.mTipMarginPx;
                                i2 = (i2 + round) / 2;
                                i3 = this.mIsPointingDown ? ((i3 - i4) - measuredHeight) + dimensionPixelOffset : round2 + i4;
                                dimensionPixelOffset = this.mRoundedCornerRadius;
                                i4 = (width - this.mTriangleWidth) - this.mRoundedCornerRadius;
                                width = (width - measuredWidth) - this.mTooltipMinimumLeftBoundaryPx;
                                round2 = 8;
                                this.mTopTriangle.setVisibility(this.mIsPointingDown ? 8 : 0);
                                View view7 = this.mBottomTriangle;
                                if (this.mIsPointingDown) {
                                    round2 = 0;
                                }
                                view7.setVisibility(round2);
                                dimensionPixelOffset = Math.max(dimensionPixelOffset, Math.min(i2 - (this.mTriangleWidth / 2), i4));
                                i4 = Math.max(this.mTooltipMinimumLeftBoundaryPx, Math.min(((this.mTriangleWidth / 2) + dimensionPixelOffset) - Math.max(dimensionPixelOffset - width, measuredWidth / 2), width));
                                dimensionPixelOffset += this.mTooltipPointerHorizontalOffsetPx;
                                if (i4 > dimensionPixelOffset - this.mRoundedCornerRadius) {
                                    i4 = Math.max(dimensionPixelOffset - this.mRoundedCornerRadius, this.mTooltipMinimumLeftBoundaryPx);
                                }
                                dimensionPixelOffset -= i4;
                                View[] viewArr = new View[]{this.mBottomTriangle, this.mTopTriangle};
                                while (i < 2) {
                                    view7 = viewArr[i];
                                    LayoutParams layoutParams = view7.getLayoutParams();
                                    if (layoutParams != null) {
                                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                                        layoutParams2.leftMargin = dimensionPixelOffset;
                                        view7.setLayoutParams(layoutParams2);
                                        i++;
                                    } else {
                                        throw new ajxt("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                    }
                                }
                                setPivotX(((float) dimensionPixelOffset) + (((float) this.mTriangleWidth) / 2.0f));
                                setPivotY(this.mIsPointingDown ? (float) measuredHeight : MapboxConstants.MINIMUM_ZOOM);
                                setX((float) i4);
                                setY((float) i3);
                                return;
                            }
                            return;
                        }
                        throw new ajxt("null cannot be cast to non-null type android.view.View");
                    }
                }
            }
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        akcr.b(view, "v");
        abtp.a(view, (OnGlobalLayoutListener) this);
    }

    @Keep
    public final void setAlpha(float f) {
        super.setAlpha(f);
    }

    public final void showAndFadeOut() {
        moveTooltipToPointAtAttachedView();
        azt azt = this.mSpring;
        if (azt != null) {
            azt.b((double) this.SCALE_SHOWN);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, MapboxConstants.MINIMUM_ZOOM);
        alphaAnimation.setStartOffset((long) this.DEFAULT_FADEOUT_DELAY_MS);
        alphaAnimation.setDuration(this.DEFAULT_FADEOUT_DURATION_MS);
        alphaAnimation.setAnimationListener(new OnBoardTooltipView$showAndFadeOut$1(this));
        setVisibility(0);
        setAlpha(1.0f);
        startAnimation(alphaAnimation);
    }

    public final void showWithBouncyAnimation() {
        moveTooltipToPointAtAttachedView();
        Object obj = this.mAttachedView;
        if (obj != null) {
            akcr.a(obj, "it");
            obj.getViewTreeObserver().addOnGlobalLayoutListener(this);
            azt azt = this.mSpring;
            if (azt != null) {
                azt.b((double) this.SCALE_SHOWN);
            }
            setVisibility(0);
            ObjectAnimator objectAnimator = this.mFadeInAnimator;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                objectAnimator.addListener(new OnBoardTooltipView$showWithBouncyAnimation$$inlined$let$lambda$1(this));
                if (objectAnimator.isRunning()) {
                    objectAnimator.end();
                }
                objectAnimator = this.mFadeInAnimator;
                if (objectAnimator == null) {
                    akcr.a();
                }
                objectAnimator.start();
            }
        }
    }

    public final OnBoardTooltipView updateAttachedView(View view) {
        this.mAttachedView = view;
        return this;
    }
}
