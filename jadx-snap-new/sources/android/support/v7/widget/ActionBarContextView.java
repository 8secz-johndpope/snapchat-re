package android.support.v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.kb;
import defpackage.kf;
import defpackage.lx.a;

public class ActionBarContextView extends AbsActionBarView {
    private static final String TAG = "ActionBarContextView";
    private View mClose;
    private int mCloseItemLayout;
    private View mCustomView;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private TextView mTitleView;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, a.d, i, 0);
        kb.a((View) this, obtainStyledAttributes.getDrawable(0));
        this.mTitleStyleRes = obtainStyledAttributes.getResourceId(5, 0);
        this.mSubtitleStyleRes = obtainStyledAttributes.getResourceId(4, 0);
        this.mContentHeight = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.mCloseItemLayout = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    private void initTitle() {
        if (this.mTitleLayout == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            this.mTitleLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.mTitleView = (TextView) this.mTitleLayout.findViewById(R.id.action_bar_title);
            this.mSubtitleView = (TextView) this.mTitleLayout.findViewById(R.id.action_bar_subtitle);
            if (this.mTitleStyleRes != 0) {
                this.mTitleView.setTextAppearance(getContext(), this.mTitleStyleRes);
            }
            if (this.mSubtitleStyleRes != 0) {
                this.mSubtitleView.setTextAppearance(getContext(), this.mSubtitleStyleRes);
            }
        }
        this.mTitleView.setText(this.mTitle);
        this.mSubtitleView.setText(this.mSubtitle);
        int isEmpty = TextUtils.isEmpty(this.mTitle) ^ 1;
        int isEmpty2 = TextUtils.isEmpty(this.mSubtitle) ^ 1;
        int i = 0;
        this.mSubtitleView.setVisibility(isEmpty2 != 0 ? 0 : 8);
        LinearLayout linearLayout = this.mTitleLayout;
        if (isEmpty == 0 && isEmpty2 == 0) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.mTitleLayout.getParent() == null) {
            addView(this.mTitleLayout);
        }
    }

    public /* bridge */ /* synthetic */ void animateToVisibility(int i) {
        super.animateToVisibility(i);
    }

    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
        return super.canShowOverflowMenu();
    }

    public void closeMode() {
        if (this.mClose == null) {
            killMode();
        }
    }

    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public boolean hideOverflowMenu() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.e() : false;
    }

    /* JADX WARNING: Missing block: B:5:0x001f, code skipped:
            if (r0.getParent() == null) goto L_0x0015;
     */
    public void initForMode(final defpackage.ml r4) {
        /*
        r3 = this;
        r0 = r3.mClose;
        if (r0 != 0) goto L_0x001b;
    L_0x0004:
        r0 = r3.getContext();
        r0 = android.view.LayoutInflater.from(r0);
        r1 = r3.mCloseItemLayout;
        r2 = 0;
        r0 = r0.inflate(r1, r3, r2);
        r3.mClose = r0;
    L_0x0015:
        r0 = r3.mClose;
        r3.addView(r0);
        goto L_0x0022;
    L_0x001b:
        r0 = r0.getParent();
        if (r0 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0015;
    L_0x0022:
        r0 = r3.mClose;
        r1 = 2131427378; // 0x7f0b0032 float:1.847637E38 double:1.053065044E-314;
        r0 = r0.findViewById(r1);
        r1 = new android.support.v7.widget.ActionBarContextView$1;
        r1.<init>(r4);
        r0.setOnClickListener(r1);
        r4 = r4.b();
        r4 = (defpackage.mz) r4;
        r0 = r3.mActionMenuPresenter;
        if (r0 == 0) goto L_0x0042;
    L_0x003d:
        r0 = r3.mActionMenuPresenter;
        r0.f();
    L_0x0042:
        r0 = new nq;
        r1 = r3.getContext();
        r0.<init>(r1);
        r3.mActionMenuPresenter = r0;
        r0 = r3.mActionMenuPresenter;
        r0.c();
        r0 = new android.view.ViewGroup$LayoutParams;
        r1 = -2;
        r2 = -1;
        r0.<init>(r1, r2);
        r1 = r3.mActionMenuPresenter;
        r2 = r3.mPopupContext;
        r4.a(r1, r2);
        r4 = r3.mActionMenuPresenter;
        r4 = r4.a(r3);
        r4 = (android.support.v7.widget.ActionMenuView) r4;
        r3.mMenuView = r4;
        r4 = r3.mMenuView;
        r1 = 0;
        defpackage.kb.a(r4, r1);
        r4 = r3.mMenuView;
        r3.addView(r4, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContextView.initForMode(ml):void");
    }

    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
        return super.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.h() : false;
    }

    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    public boolean isTitleOptional() {
        return this.mTitleOptional;
    }

    public void killMode() {
        removeAllViews();
        this.mCustomView = null;
        this.mMenuView = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.e();
            this.mActionMenuPresenter.g();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.mTitle);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = ViewUtils.isLayoutRtl(this);
        int paddingRight = z ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        i2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.mClose;
        if (view == null || view.getVisibility() == 8) {
            i4 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mClose.getLayoutParams();
            int i5 = z ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            i4 = z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int next = AbsActionBarView.next(paddingRight, i5, z);
            i4 = AbsActionBarView.next(next + positionChild(this.mClose, next, paddingTop, i2, z), i4, z);
        }
        LinearLayout linearLayout = this.mTitleLayout;
        if (!(linearLayout == null || this.mCustomView != null || linearLayout.getVisibility() == 8)) {
            i4 += positionChild(this.mTitleLayout, i4, paddingTop, i2, z);
        }
        int i6 = i4;
        View view2 = this.mCustomView;
        if (view2 != null) {
            positionChild(view2, i6, paddingTop, i2, z);
        }
        int paddingLeft = z ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.mMenuView != null) {
            positionChild(this.mMenuView, paddingLeft, paddingTop, i2, z ^ 1);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:67:0x012f in {6, 7, 10, 15, 24, 25, 27, 30, 31, 32, 33, 38, 39, 42, 45, 46, 49, 50, 57, 58, 60, 62, 64, 66} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    protected void onMeasure(int r11, int r12) {
        /*
        r10 = this;
        r0 = android.view.View.MeasureSpec.getMode(r11);
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r0 != r1) goto L_0x0110;
        r0 = android.view.View.MeasureSpec.getMode(r12);
        if (r0 == 0) goto L_0x00f1;
        r11 = android.view.View.MeasureSpec.getSize(r11);
        r0 = r10.mContentHeight;
        if (r0 <= 0) goto L_0x0019;
        r12 = r10.mContentHeight;
        goto L_0x001d;
        r12 = android.view.View.MeasureSpec.getSize(r12);
        r0 = r10.getPaddingTop();
        r2 = r10.getPaddingBottom();
        r0 = r0 + r2;
        r2 = r10.getPaddingLeft();
        r2 = r11 - r2;
        r3 = r10.getPaddingRight();
        r2 = r2 - r3;
        r3 = r12 - r0;
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4);
        r6 = r10.mClose;
        r7 = 0;
        if (r6 == 0) goto L_0x0050;
        r2 = r10.measureChildView(r6, r2, r5, r7);
        r6 = r10.mClose;
        r6 = r6.getLayoutParams();
        r6 = (android.view.ViewGroup.MarginLayoutParams) r6;
        r8 = r6.leftMargin;
        r6 = r6.rightMargin;
        r8 = r8 + r6;
        r2 = r2 - r8;
        r6 = r10.mMenuView;
        if (r6 == 0) goto L_0x0062;
        r6 = r10.mMenuView;
        r6 = r6.getParent();
        if (r6 != r10) goto L_0x0062;
        r6 = r10.mMenuView;
        r2 = r10.measureChildView(r6, r2, r5, r7);
        r6 = r10.mTitleLayout;
        if (r6 == 0) goto L_0x0095;
        r8 = r10.mCustomView;
        if (r8 != 0) goto L_0x0095;
        r8 = r10.mTitleOptional;
        if (r8 == 0) goto L_0x0091;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7);
        r8 = r10.mTitleLayout;
        r8.measure(r6, r5);
        r5 = r10.mTitleLayout;
        r5 = r5.getMeasuredWidth();
        if (r5 > r2) goto L_0x0081;
        r6 = 1;
        goto L_0x0082;
        r6 = 0;
        if (r6 == 0) goto L_0x0085;
        r2 = r2 - r5;
        r5 = r10.mTitleLayout;
        if (r6 == 0) goto L_0x008b;
        r6 = 0;
        goto L_0x008d;
        r6 = 8;
        r5.setVisibility(r6);
        goto L_0x0095;
        r2 = r10.measureChildView(r6, r2, r5, r7);
        r5 = r10.mCustomView;
        if (r5 == 0) goto L_0x00cf;
        r5 = r5.getLayoutParams();
        r6 = r5.width;
        r8 = -2;
        if (r6 == r8) goto L_0x00a5;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x00a7;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r9 = r5.width;
        if (r9 < 0) goto L_0x00b1;
        r9 = r5.width;
        r2 = java.lang.Math.min(r9, r2);
        r9 = r5.height;
        if (r9 == r8) goto L_0x00b6;
        goto L_0x00b8;
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = r5.height;
        if (r4 < 0) goto L_0x00c2;
        r4 = r5.height;
        r3 = java.lang.Math.min(r4, r3);
        r4 = r10.mCustomView;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6);
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1);
        r4.measure(r2, r1);
        r1 = r10.mContentHeight;
        if (r1 > 0) goto L_0x00ed;
        r12 = r10.getChildCount();
        r1 = 0;
        if (r7 >= r12) goto L_0x00e9;
        r2 = r10.getChildAt(r7);
        r2 = r2.getMeasuredHeight();
        r2 = r2 + r0;
        if (r2 <= r1) goto L_0x00e6;
        r1 = r2;
        r7 = r7 + 1;
        goto L_0x00d8;
        r10.setMeasuredDimension(r11, r1);
        return;
        r10.setMeasuredDimension(r11, r12);
        return;
        r11 = new java.lang.IllegalStateException;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r0 = r10.getClass();
        r0 = r0.getSimpleName();
        r12.append(r0);
        r0 = " can only be used with android:layout_height=\"wrap_content\"";
        r12.append(r0);
        r12 = r12.toString();
        r11.<init>(r12);
        throw r11;
        r11 = new java.lang.IllegalStateException;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r0 = r10.getClass();
        r0 = r0.getSimpleName();
        r12.append(r0);
        r0 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)";
        r12.append(r0);
        r12 = r12.toString();
        r11.<init>(r12);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContextView.onMeasure(int, int):void");
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
    }

    public void setCustomView(View view) {
        View view2 = this.mCustomView;
        if (view2 != null) {
            removeView(view2);
        }
        this.mCustomView = view;
        if (view != null) {
            LinearLayout linearLayout = this.mTitleLayout;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.mTitleLayout = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        initTitle();
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        initTitle();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.mTitleOptional) {
            requestLayout();
        }
        this.mTitleOptional = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public /* bridge */ /* synthetic */ kf setupAnimatorToVisibility(int i, long j) {
        return super.setupAnimatorToVisibility(i, j);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean showOverflowMenu() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.d() : false;
    }
}
