package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.jp;
import defpackage.kb;
import defpackage.lx.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends MarginLayoutParams {
        public int gravity;
        public float weight;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = -1;
            this.weight = MapboxConstants.MINIMUM_ZOOM;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2);
            this.gravity = -1;
            this.weight = f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.p);
            this.weight = obtainStyledAttributes.getFloat(3, MapboxConstants.MINIMUM_ZOOM);
            this.gravity = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
            this.weight = layoutParams.weight;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = -1;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, a.o, i, 0);
        int i2 = obtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        i2 = obtainStyledAttributes.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(3, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(5));
        this.mShowDividers = obtainStyledAttributes.getInt(8, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), AudioPlayer.INFINITY_LOOP_COUNT);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), AudioPlayer.INFINITY_LOOP_COUNT);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* Access modifiers changed, original: 0000 */
    public void drawDividersHorizontal(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i = 0;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, isLayoutRtl ? virtualChildAt.getRight() + layoutParams.rightMargin : (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            int i2;
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (isLayoutRtl) {
                    virtualChildCount = virtualChildAt2.getLeft();
                    i2 = layoutParams2.leftMargin;
                } else {
                    virtualChildCount = virtualChildAt2.getRight() + layoutParams2.rightMargin;
                    drawVerticalDivider(canvas, virtualChildCount);
                }
            } else if (isLayoutRtl) {
                virtualChildCount = getPaddingLeft();
                drawVerticalDivider(canvas, virtualChildCount);
            } else {
                virtualChildCount = getWidth();
                i2 = getPaddingRight();
            }
            virtualChildCount = (virtualChildCount - i2) - this.mDividerWidth;
            drawVerticalDivider(canvas, virtualChildCount);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        int i = 0;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                virtualChildCount = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                virtualChildCount = virtualChildAt2.getBottom() + ((LayoutParams) virtualChildAt2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, virtualChildCount);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    /* Access modifiers changed, original: 0000 */
    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        return i == 0 ? new LayoutParams(-2, -2) : i == 1 ? new LayoutParams(-1, -2) : null;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getBaseline() {
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.mBaselineAlignedChildIndex;
        if (childCount > i) {
            View childAt = getChildAt(i);
            i = childAt.getBaseline();
            if (i != -1) {
                int i2 = this.mBaselineChildTop;
                if (this.mOrientation == 1) {
                    int i3 = this.mGravity & 112;
                    if (i3 != 48) {
                        if (i3 == 16) {
                            i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                        } else if (i3 == 80) {
                            i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                        }
                    }
                }
                return (i2 + ((LayoutParams) childAt.getLayoutParams()).topMargin) + i;
            } else if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    /* Access modifiers changed, original: 0000 */
    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    /* Access modifiers changed, original: 0000 */
    public int getLocationOffset(View view) {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    /* Access modifiers changed, original: 0000 */
    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    /* Access modifiers changed, original: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    /* Access modifiers changed, original: protected */
    public boolean hasDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        } else {
            if (i == getChildCount()) {
                return (this.mShowDividers & 4) != 0;
            } else {
                if ((this.mShowDividers & 2) != 0) {
                    do {
                        i--;
                        if (i < 0) {
                            break;
                        }
                    } while (getChildAt(i).getVisibility() == 8);
                    z = true;
                }
                return z;
            }
        }
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    public void layoutHorizontal(int r25, int r26, int r27, int r28) {
        /*
        r24 = this;
        r6 = r24;
        r0 = android.support.v7.widget.ViewUtils.isLayoutRtl(r24);
        r7 = r24.getPaddingTop();
        r1 = r28 - r26;
        r2 = r24.getPaddingBottom();
        r8 = r1 - r2;
        r1 = r1 - r7;
        r2 = r24.getPaddingBottom();
        r9 = r1 - r2;
        r10 = r24.getVirtualChildCount();
        r1 = r6.mGravity;
        r2 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r2 = r2 & r1;
        r11 = r1 & 112;
        r12 = r6.mBaselineAligned;
        r13 = r6.mMaxAscent;
        r14 = r6.mMaxDescent;
        r1 = defpackage.kb.a;
        r1 = r1.j(r6);
        r1 = defpackage.jp.a(r2, r1);
        r15 = 2;
        r5 = 1;
        if (r1 == r5) goto L_0x004d;
    L_0x0039:
        r2 = 5;
        if (r1 == r2) goto L_0x0041;
    L_0x003c:
        r1 = r24.getPaddingLeft();
        goto L_0x0058;
    L_0x0041:
        r1 = r24.getPaddingLeft();
        r1 = r1 + r27;
        r1 = r1 - r25;
        r2 = r6.mTotalLength;
        r1 = r1 - r2;
        goto L_0x0058;
    L_0x004d:
        r1 = r24.getPaddingLeft();
        r2 = r27 - r25;
        r3 = r6.mTotalLength;
        r2 = r2 - r3;
        r2 = r2 / r15;
        r1 = r1 + r2;
    L_0x0058:
        r2 = 0;
        if (r0 == 0) goto L_0x0062;
    L_0x005b:
        r0 = r10 + -1;
        r17 = r0;
        r16 = -1;
        goto L_0x0066;
    L_0x0062:
        r16 = 1;
        r17 = 0;
    L_0x0066:
        r3 = 0;
    L_0x0067:
        if (r3 >= r10) goto L_0x0147;
    L_0x0069:
        r0 = r16 * r3;
        r2 = r17 + r0;
        r0 = r6.getVirtualChildAt(r2);
        if (r0 != 0) goto L_0x007a;
    L_0x0073:
        r0 = r6.measureNullChild(r2);
        r1 = r1 + r0;
        goto L_0x0131;
    L_0x007a:
        r5 = r0.getVisibility();
        r15 = 8;
        if (r5 == r15) goto L_0x012f;
    L_0x0082:
        r15 = r0.getMeasuredWidth();
        r5 = r0.getMeasuredHeight();
        r18 = r0.getLayoutParams();
        r4 = r18;
        r4 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r4;
        if (r12 == 0) goto L_0x00a2;
    L_0x0094:
        r18 = r3;
        r3 = r4.height;
        r19 = r10;
        r10 = -1;
        if (r3 == r10) goto L_0x00a6;
    L_0x009d:
        r3 = r0.getBaseline();
        goto L_0x00a7;
    L_0x00a2:
        r18 = r3;
        r19 = r10;
    L_0x00a6:
        r3 = -1;
    L_0x00a7:
        r10 = r4.gravity;
        if (r10 >= 0) goto L_0x00ac;
    L_0x00ab:
        r10 = r11;
    L_0x00ac:
        r10 = r10 & 112;
        r20 = r11;
        r11 = 16;
        if (r10 == r11) goto L_0x00eb;
    L_0x00b4:
        r11 = 48;
        if (r10 == r11) goto L_0x00d8;
    L_0x00b8:
        r11 = 80;
        if (r10 == r11) goto L_0x00c1;
    L_0x00bc:
        r3 = r7;
        r11 = -1;
    L_0x00be:
        r21 = 1;
        goto L_0x00f9;
    L_0x00c1:
        r10 = r8 - r5;
        r11 = r4.bottomMargin;
        r10 = r10 - r11;
        r11 = -1;
        if (r3 == r11) goto L_0x00d6;
    L_0x00c9:
        r21 = r0.getMeasuredHeight();
        r21 = r21 - r3;
        r3 = 2;
        r22 = r14[r3];
        r22 = r22 - r21;
        r10 = r10 - r22;
    L_0x00d6:
        r3 = r10;
        goto L_0x00be;
    L_0x00d8:
        r11 = -1;
        r10 = r4.topMargin;
        r10 = r10 + r7;
        if (r3 == r11) goto L_0x00e7;
    L_0x00de:
        r21 = 1;
        r22 = r13[r21];
        r22 = r22 - r3;
        r10 = r10 + r22;
        goto L_0x00e9;
    L_0x00e7:
        r21 = 1;
    L_0x00e9:
        r3 = r10;
        goto L_0x00f9;
    L_0x00eb:
        r11 = -1;
        r21 = 1;
        r3 = r9 - r5;
        r10 = 2;
        r3 = r3 / r10;
        r3 = r3 + r7;
        r10 = r4.topMargin;
        r3 = r3 + r10;
        r10 = r4.bottomMargin;
        r3 = r3 - r10;
    L_0x00f9:
        r10 = r6.hasDividerBeforeChildAt(r2);
        if (r10 == 0) goto L_0x0102;
    L_0x00ff:
        r10 = r6.mDividerWidth;
        r1 = r1 + r10;
    L_0x0102:
        r10 = r4.leftMargin;
        r10 = r10 + r1;
        r1 = r6.getLocationOffset(r0);
        r22 = r10 + r1;
        r1 = r0;
        r0 = r24;
        r25 = r1;
        r11 = r2;
        r2 = r22;
        r22 = r7;
        r23 = -1;
        r7 = r4;
        r4 = r15;
        r0.setChildFrame(r1, r2, r3, r4, r5);
        r0 = r7.rightMargin;
        r15 = r15 + r0;
        r0 = r25;
        r1 = r6.getNextLocationOffset(r0);
        r15 = r15 + r1;
        r10 = r10 + r15;
        r0 = r6.getChildrenSkipCount(r0, r11);
        r3 = r18 + r0;
        r1 = r10;
        goto L_0x013b;
    L_0x012f:
        r18 = r3;
    L_0x0131:
        r22 = r7;
        r19 = r10;
        r20 = r11;
        r21 = 1;
        r23 = -1;
    L_0x013b:
        r3 = r3 + 1;
        r10 = r19;
        r11 = r20;
        r7 = r22;
        r5 = 1;
        r15 = 2;
        goto L_0x0067;
    L_0x0147:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.layoutHorizontal(int, int, int, int):void");
    }

    /* Access modifiers changed, original: 0000 */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        i5 = this.mGravity;
        int i6 = i5 & 112;
        int i7 = i5 & 8388615;
        i5 = i6 != 16 ? i6 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.mTotalLength : getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
        int i8 = 0;
        while (i8 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i8);
            if (virtualChildAt == null) {
                i5 += measureNullChild(i8);
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                i6 = layoutParams.gravity;
                if (i6 < 0) {
                    i6 = i7;
                }
                i6 = jp.a(i6, kb.a.j(this)) & 7;
                if (i6 == 1) {
                    i6 = (((paddingRight2 - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin;
                    i6 -= layoutParams.rightMargin;
                } else if (i6 != 5) {
                    i6 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i6 = paddingRight - measuredWidth;
                    i6 -= layoutParams.rightMargin;
                }
                int i9 = i6;
                if (hasDividerBeforeChildAt(i8)) {
                    i5 += this.mDividerHeight;
                }
                int i10 = i5 + layoutParams.topMargin;
                LayoutParams layoutParams2 = layoutParams;
                setChildFrame(virtualChildAt, i9, i10 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                i8 += getChildrenSkipCount(virtualChildAt, i8);
                i5 = i10 + ((measuredHeight + layoutParams2.bottomMargin) + getNextLocationOffset(virtualChildAt));
            }
            i8++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x044d  */
    /* JADX WARNING: Missing block: B:158:0x03c5, code skipped:
            if (r4 < 0) goto L_0x03be;
     */
    public void measureHorizontal(int r38, int r39) {
        /*
        r37 = this;
        r7 = r37;
        r8 = r38;
        r9 = r39;
        r10 = 0;
        r7.mTotalLength = r10;
        r11 = r37.getVirtualChildCount();
        r12 = android.view.View.MeasureSpec.getMode(r38);
        r13 = android.view.View.MeasureSpec.getMode(r39);
        r0 = r7.mMaxAscent;
        r14 = 4;
        if (r0 == 0) goto L_0x001e;
    L_0x001a:
        r0 = r7.mMaxDescent;
        if (r0 != 0) goto L_0x0026;
    L_0x001e:
        r0 = new int[r14];
        r7.mMaxAscent = r0;
        r0 = new int[r14];
        r7.mMaxDescent = r0;
    L_0x0026:
        r15 = r7.mMaxAscent;
        r6 = r7.mMaxDescent;
        r16 = 3;
        r5 = -1;
        r15[r16] = r5;
        r17 = 2;
        r15[r17] = r5;
        r18 = 1;
        r15[r18] = r5;
        r15[r10] = r5;
        r6[r16] = r5;
        r6[r17] = r5;
        r6[r18] = r5;
        r6[r10] = r5;
        r4 = r7.mBaselineAligned;
        r3 = r7.mUseLargestChild;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 != r2) goto L_0x004c;
    L_0x0049:
        r19 = 1;
        goto L_0x004e;
    L_0x004c:
        r19 = 0;
    L_0x004e:
        r20 = 0;
        r0 = 0;
        r1 = 0;
        r14 = 0;
        r21 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 0;
        r25 = 0;
        r26 = 1;
        r27 = 0;
    L_0x0061:
        r28 = r6;
        r5 = 8;
        if (r1 >= r11) goto L_0x020d;
    L_0x0067:
        r6 = r7.getVirtualChildAt(r1);
        if (r6 != 0) goto L_0x0081;
    L_0x006d:
        r5 = r7.mTotalLength;
        r6 = r7.measureNullChild(r1);
        r5 = r5 + r6;
        r7.mTotalLength = r5;
        r31 = r0;
        r0 = r1;
        r32 = r3;
        r36 = r4;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x01fa;
    L_0x0081:
        r10 = r6.getVisibility();
        if (r10 == r5) goto L_0x01e0;
    L_0x0087:
        r5 = r7.hasDividerBeforeChildAt(r1);
        if (r5 == 0) goto L_0x0094;
    L_0x008d:
        r5 = r7.mTotalLength;
        r10 = r7.mDividerWidth;
        r5 = r5 + r10;
        r7.mTotalLength = r5;
    L_0x0094:
        r5 = r6.getLayoutParams();
        r10 = r5;
        r10 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r10;
        r5 = r10.weight;
        r31 = r0 + r5;
        if (r12 != r2) goto L_0x00e7;
    L_0x00a1:
        r0 = r10.width;
        if (r0 != 0) goto L_0x00e7;
    L_0x00a5:
        r0 = r10.weight;
        r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1));
        if (r0 <= 0) goto L_0x00e7;
    L_0x00ab:
        if (r19 == 0) goto L_0x00b6;
    L_0x00ad:
        r0 = r7.mTotalLength;
        r5 = r10.leftMargin;
        r2 = r10.rightMargin;
        r5 = r5 + r2;
        r0 = r0 + r5;
        goto L_0x00c2;
    L_0x00b6:
        r0 = r7.mTotalLength;
        r2 = r10.leftMargin;
        r2 = r2 + r0;
        r5 = r10.rightMargin;
        r2 = r2 + r5;
        r0 = java.lang.Math.max(r0, r2);
    L_0x00c2:
        r7.mTotalLength = r0;
        if (r4 == 0) goto L_0x00d9;
    L_0x00c6:
        r0 = 0;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0);
        r6.measure(r2, r2);
        r34 = r1;
        r32 = r3;
        r36 = r4;
        r3 = r6;
        r30 = -2;
        goto L_0x0161;
    L_0x00d9:
        r34 = r1;
        r32 = r3;
        r36 = r4;
        r3 = r6;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r24 = 1;
        r30 = -2;
        goto L_0x0163;
    L_0x00e7:
        r0 = r10.width;
        if (r0 != 0) goto L_0x00f6;
    L_0x00eb:
        r0 = r10.weight;
        r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1));
        if (r0 <= 0) goto L_0x00f6;
    L_0x00f1:
        r5 = -2;
        r10.width = r5;
        r2 = 0;
        goto L_0x00f9;
    L_0x00f6:
        r5 = -2;
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x00f9:
        r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1));
        if (r0 != 0) goto L_0x0102;
    L_0x00fd:
        r0 = r7.mTotalLength;
        r29 = r0;
        goto L_0x0104;
    L_0x0102:
        r29 = 0;
    L_0x0104:
        r33 = 0;
        r0 = r37;
        r34 = r1;
        r1 = r6;
        r35 = r2;
        r2 = r34;
        r32 = r3;
        r3 = r38;
        r36 = r4;
        r4 = r29;
        r9 = -1;
        r29 = -2;
        r5 = r39;
        r29 = r6;
        r9 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r30 = -2;
        r6 = r33;
        r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6);
        r0 = r35;
        if (r0 == r9) goto L_0x012d;
    L_0x012b:
        r10.width = r0;
    L_0x012d:
        r0 = r29.getMeasuredWidth();
        if (r19 == 0) goto L_0x0144;
    L_0x0133:
        r1 = r7.mTotalLength;
        r2 = r10.leftMargin;
        r2 = r2 + r0;
        r3 = r10.rightMargin;
        r2 = r2 + r3;
        r3 = r29;
        r4 = r7.getNextLocationOffset(r3);
        r2 = r2 + r4;
        r1 = r1 + r2;
        goto L_0x0159;
    L_0x0144:
        r3 = r29;
        r1 = r7.mTotalLength;
        r2 = r1 + r0;
        r4 = r10.leftMargin;
        r2 = r2 + r4;
        r4 = r10.rightMargin;
        r2 = r2 + r4;
        r4 = r7.getNextLocationOffset(r3);
        r2 = r2 + r4;
        r1 = java.lang.Math.max(r1, r2);
    L_0x0159:
        r7.mTotalLength = r1;
        if (r32 == 0) goto L_0x0161;
    L_0x015d:
        r14 = java.lang.Math.max(r0, r14);
    L_0x0161:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x0163:
        if (r13 == r1) goto L_0x016e;
    L_0x0165:
        r0 = r10.height;
        r2 = -1;
        if (r0 != r2) goto L_0x016e;
    L_0x016a:
        r0 = 1;
        r27 = 1;
        goto L_0x016f;
    L_0x016e:
        r0 = 0;
    L_0x016f:
        r2 = r10.topMargin;
        r4 = r10.bottomMargin;
        r2 = r2 + r4;
        r4 = r3.getMeasuredHeight();
        r4 = r4 + r2;
        r5 = r3.getMeasuredState();
        r6 = r25;
        r25 = android.view.View.combineMeasuredStates(r6, r5);
        if (r36 == 0) goto L_0x01af;
    L_0x0185:
        r5 = r3.getBaseline();
        r6 = -1;
        if (r5 == r6) goto L_0x01af;
    L_0x018c:
        r6 = r10.gravity;
        if (r6 >= 0) goto L_0x0193;
    L_0x0190:
        r6 = r7.mGravity;
        goto L_0x0195;
    L_0x0193:
        r6 = r10.gravity;
    L_0x0195:
        r6 = r6 & 112;
        r9 = 4;
        r6 = r6 >> r9;
        r6 = r6 & -2;
        r6 = r6 >> 1;
        r9 = r15[r6];
        r9 = java.lang.Math.max(r9, r5);
        r15[r6] = r9;
        r9 = r28[r6];
        r5 = r4 - r5;
        r5 = java.lang.Math.max(r9, r5);
        r28[r6] = r5;
    L_0x01af:
        r5 = r21;
        r21 = java.lang.Math.max(r5, r4);
        if (r26 == 0) goto L_0x01bf;
    L_0x01b7:
        r5 = r10.height;
        r6 = -1;
        if (r5 != r6) goto L_0x01bf;
    L_0x01bc:
        r26 = 1;
        goto L_0x01c1;
    L_0x01bf:
        r26 = 0;
    L_0x01c1:
        r5 = r10.weight;
        r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1));
        if (r5 <= 0) goto L_0x01d2;
    L_0x01c7:
        if (r0 == 0) goto L_0x01ca;
    L_0x01c9:
        goto L_0x01cb;
    L_0x01ca:
        r2 = r4;
    L_0x01cb:
        r10 = r23;
        r23 = java.lang.Math.max(r10, r2);
        goto L_0x01f3;
    L_0x01d2:
        r10 = r23;
        if (r0 == 0) goto L_0x01d7;
    L_0x01d6:
        r4 = r2;
    L_0x01d7:
        r2 = r22;
        r22 = java.lang.Math.max(r2, r4);
        r23 = r10;
        goto L_0x01f3;
    L_0x01e0:
        r34 = r1;
        r32 = r3;
        r36 = r4;
        r3 = r6;
        r5 = r21;
        r2 = r22;
        r10 = r23;
        r6 = r25;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r31 = r0;
    L_0x01f3:
        r10 = r34;
        r0 = r7.getChildrenSkipCount(r3, r10);
        r0 = r0 + r10;
    L_0x01fa:
        r0 = r0 + 1;
        r9 = r39;
        r1 = r0;
        r6 = r28;
        r0 = r31;
        r3 = r32;
        r4 = r36;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = -1;
        r10 = 0;
        goto L_0x0061;
    L_0x020d:
        r32 = r3;
        r36 = r4;
        r3 = r21;
        r2 = r22;
        r10 = r23;
        r6 = r25;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r30 = -2;
        r4 = r7.mTotalLength;
        if (r4 <= 0) goto L_0x0230;
    L_0x0223:
        r4 = r7.hasDividerBeforeChildAt(r11);
        if (r4 == 0) goto L_0x0230;
    L_0x0229:
        r4 = r7.mTotalLength;
        r1 = r7.mDividerWidth;
        r4 = r4 + r1;
        r7.mTotalLength = r4;
    L_0x0230:
        r1 = r15[r18];
        r4 = -1;
        if (r1 != r4) goto L_0x0247;
    L_0x0235:
        r1 = 0;
        r5 = r15[r1];
        if (r5 != r4) goto L_0x0247;
    L_0x023a:
        r1 = r15[r17];
        if (r1 != r4) goto L_0x0247;
    L_0x023e:
        r1 = r15[r16];
        if (r1 == r4) goto L_0x0243;
    L_0x0242:
        goto L_0x0247;
    L_0x0243:
        r1 = r3;
        r23 = r6;
        goto L_0x0278;
    L_0x0247:
        r1 = r15[r16];
        r4 = 0;
        r5 = r15[r4];
        r9 = r15[r18];
        r4 = r15[r17];
        r4 = java.lang.Math.max(r9, r4);
        r4 = java.lang.Math.max(r5, r4);
        r1 = java.lang.Math.max(r1, r4);
        r4 = r28[r16];
        r5 = 0;
        r9 = r28[r5];
        r5 = r28[r18];
        r23 = r6;
        r6 = r28[r17];
        r5 = java.lang.Math.max(r5, r6);
        r5 = java.lang.Math.max(r9, r5);
        r4 = java.lang.Math.max(r4, r5);
        r1 = r1 + r4;
        r1 = java.lang.Math.max(r3, r1);
    L_0x0278:
        if (r32 == 0) goto L_0x02db;
    L_0x027a:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r12 == r3) goto L_0x0280;
    L_0x027e:
        if (r12 != 0) goto L_0x02db;
    L_0x0280:
        r3 = 0;
        r7.mTotalLength = r3;
        r3 = 0;
    L_0x0284:
        if (r3 >= r11) goto L_0x02db;
    L_0x0286:
        r4 = r7.getVirtualChildAt(r3);
        if (r4 != 0) goto L_0x0296;
    L_0x028c:
        r4 = r7.mTotalLength;
        r5 = r7.measureNullChild(r3);
        r4 = r4 + r5;
        r7.mTotalLength = r4;
        goto L_0x02a3;
    L_0x0296:
        r5 = r4.getVisibility();
        r6 = 8;
        if (r5 != r6) goto L_0x02a6;
    L_0x029e:
        r4 = r7.getChildrenSkipCount(r4, r3);
        r3 = r3 + r4;
    L_0x02a3:
        r22 = r1;
        goto L_0x02d6;
    L_0x02a6:
        r5 = r4.getLayoutParams();
        r5 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r5;
        if (r19 == 0) goto L_0x02bf;
    L_0x02ae:
        r6 = r7.mTotalLength;
        r9 = r5.leftMargin;
        r9 = r9 + r14;
        r5 = r5.rightMargin;
        r9 = r9 + r5;
        r4 = r7.getNextLocationOffset(r4);
        r9 = r9 + r4;
        r6 = r6 + r9;
        r7.mTotalLength = r6;
        goto L_0x02a3;
    L_0x02bf:
        r6 = r7.mTotalLength;
        r9 = r6 + r14;
        r22 = r1;
        r1 = r5.leftMargin;
        r9 = r9 + r1;
        r1 = r5.rightMargin;
        r9 = r9 + r1;
        r1 = r7.getNextLocationOffset(r4);
        r9 = r9 + r1;
        r1 = java.lang.Math.max(r6, r9);
        r7.mTotalLength = r1;
    L_0x02d6:
        r3 = r3 + 1;
        r1 = r22;
        goto L_0x0284;
    L_0x02db:
        r22 = r1;
        r1 = r7.mTotalLength;
        r3 = r37.getPaddingLeft();
        r4 = r37.getPaddingRight();
        r3 = r3 + r4;
        r1 = r1 + r3;
        r7.mTotalLength = r1;
        r1 = r7.mTotalLength;
        r3 = r37.getSuggestedMinimumWidth();
        r1 = java.lang.Math.max(r1, r3);
        r3 = 0;
        r1 = android.view.View.resolveSizeAndState(r1, r8, r3);
        r3 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r3 = r3 & r1;
        r4 = r7.mTotalLength;
        r3 = r3 - r4;
        if (r24 != 0) goto L_0x034f;
    L_0x0303:
        if (r3 == 0) goto L_0x030a;
    L_0x0305:
        r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1));
        if (r5 <= 0) goto L_0x030a;
    L_0x0309:
        goto L_0x034f;
    L_0x030a:
        r0 = java.lang.Math.max(r2, r10);
        if (r32 == 0) goto L_0x0345;
    L_0x0310:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r2) goto L_0x0345;
    L_0x0314:
        r2 = 0;
    L_0x0315:
        if (r2 >= r11) goto L_0x0345;
    L_0x0317:
        r3 = r7.getVirtualChildAt(r2);
        if (r3 == 0) goto L_0x0342;
    L_0x031d:
        r5 = r3.getVisibility();
        r6 = 8;
        if (r5 == r6) goto L_0x0342;
    L_0x0325:
        r5 = r3.getLayoutParams();
        r5 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r5;
        r5 = r5.weight;
        r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1));
        if (r5 <= 0) goto L_0x0342;
    L_0x0331:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5);
        r9 = r3.getMeasuredHeight();
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5);
        r3.measure(r6, r9);
    L_0x0342:
        r2 = r2 + 1;
        goto L_0x0315;
    L_0x0345:
        r3 = r39;
        r25 = r11;
        r2 = r22;
        r6 = r23;
        goto L_0x04e8;
    L_0x034f:
        r5 = r7.mWeightSum;
        r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1));
        if (r6 <= 0) goto L_0x0356;
    L_0x0355:
        r0 = r5;
    L_0x0356:
        r5 = -1;
        r15[r16] = r5;
        r15[r17] = r5;
        r15[r18] = r5;
        r6 = 0;
        r15[r6] = r5;
        r28[r16] = r5;
        r28[r17] = r5;
        r28[r18] = r5;
        r28[r6] = r5;
        r7.mTotalLength = r6;
        r9 = r2;
        r6 = r23;
        r10 = -1;
        r2 = r0;
        r0 = 0;
    L_0x0370:
        if (r0 >= r11) goto L_0x0491;
    L_0x0372:
        r14 = r7.getVirtualChildAt(r0);
        if (r14 == 0) goto L_0x0480;
    L_0x0378:
        r5 = r14.getVisibility();
        r4 = 8;
        if (r5 == r4) goto L_0x0480;
    L_0x0380:
        r5 = r14.getLayoutParams();
        r5 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r5;
        r4 = r5.weight;
        r23 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1));
        if (r23 <= 0) goto L_0x03e1;
    L_0x038c:
        r8 = (float) r3;
        r8 = r8 * r4;
        r8 = r8 / r2;
        r8 = (int) r8;
        r2 = r2 - r4;
        r3 = r3 - r8;
        r4 = r37.getPaddingTop();
        r23 = r37.getPaddingBottom();
        r4 = r4 + r23;
        r23 = r2;
        r2 = r5.topMargin;
        r4 = r4 + r2;
        r2 = r5.bottomMargin;
        r4 = r4 + r2;
        r2 = r5.height;
        r24 = r3;
        r25 = r11;
        r11 = -1;
        r3 = r39;
        r2 = getChildMeasureSpec(r3, r4, r2);
        r4 = r5.width;
        if (r4 != 0) goto L_0x03c0;
    L_0x03b5:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r4) goto L_0x03ba;
    L_0x03b9:
        goto L_0x03c0;
    L_0x03ba:
        if (r8 <= 0) goto L_0x03be;
    L_0x03bc:
        r4 = r8;
        goto L_0x03c8;
    L_0x03be:
        r4 = 0;
        goto L_0x03c8;
    L_0x03c0:
        r4 = r14.getMeasuredWidth();
        r4 = r4 + r8;
        if (r4 >= 0) goto L_0x03c8;
    L_0x03c7:
        goto L_0x03be;
    L_0x03c8:
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r8);
        r14.measure(r4, r2);
        r2 = r14.getMeasuredState();
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r2 = r2 & r4;
        r6 = android.view.View.combineMeasuredStates(r6, r2);
        r2 = r23;
        r4 = r24;
        goto L_0x03e7;
    L_0x03e1:
        r4 = r3;
        r25 = r11;
        r11 = -1;
        r3 = r39;
    L_0x03e7:
        if (r19 == 0) goto L_0x0404;
    L_0x03e9:
        r8 = r7.mTotalLength;
        r23 = r14.getMeasuredWidth();
        r11 = r5.leftMargin;
        r23 = r23 + r11;
        r11 = r5.rightMargin;
        r23 = r23 + r11;
        r11 = r7.getNextLocationOffset(r14);
        r23 = r23 + r11;
        r8 = r8 + r23;
        r7.mTotalLength = r8;
        r23 = r2;
        goto L_0x041e;
    L_0x0404:
        r8 = r7.mTotalLength;
        r11 = r14.getMeasuredWidth();
        r11 = r11 + r8;
        r23 = r2;
        r2 = r5.leftMargin;
        r11 = r11 + r2;
        r2 = r5.rightMargin;
        r11 = r11 + r2;
        r2 = r7.getNextLocationOffset(r14);
        r11 = r11 + r2;
        r2 = java.lang.Math.max(r8, r11);
        r7.mTotalLength = r2;
    L_0x041e:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r13 == r2) goto L_0x0429;
    L_0x0422:
        r2 = r5.height;
        r8 = -1;
        if (r2 != r8) goto L_0x0429;
    L_0x0427:
        r2 = 1;
        goto L_0x042a;
    L_0x0429:
        r2 = 0;
    L_0x042a:
        r8 = r5.topMargin;
        r11 = r5.bottomMargin;
        r8 = r8 + r11;
        r11 = r14.getMeasuredHeight();
        r11 = r11 + r8;
        r10 = java.lang.Math.max(r10, r11);
        if (r2 == 0) goto L_0x043b;
    L_0x043a:
        goto L_0x043c;
    L_0x043b:
        r8 = r11;
    L_0x043c:
        r2 = java.lang.Math.max(r9, r8);
        if (r26 == 0) goto L_0x0449;
    L_0x0442:
        r8 = r5.height;
        r9 = -1;
        if (r8 != r9) goto L_0x044a;
    L_0x0447:
        r8 = 1;
        goto L_0x044b;
    L_0x0449:
        r9 = -1;
    L_0x044a:
        r8 = 0;
    L_0x044b:
        if (r36 == 0) goto L_0x0478;
    L_0x044d:
        r14 = r14.getBaseline();
        if (r14 == r9) goto L_0x0478;
    L_0x0453:
        r9 = r5.gravity;
        if (r9 >= 0) goto L_0x045a;
    L_0x0457:
        r5 = r7.mGravity;
        goto L_0x045c;
    L_0x045a:
        r5 = r5.gravity;
    L_0x045c:
        r5 = r5 & 112;
        r24 = 4;
        r5 = r5 >> 4;
        r5 = r5 & -2;
        r5 = r5 >> 1;
        r9 = r15[r5];
        r9 = java.lang.Math.max(r9, r14);
        r15[r5] = r9;
        r9 = r28[r5];
        r11 = r11 - r14;
        r9 = java.lang.Math.max(r9, r11);
        r28[r5] = r9;
        goto L_0x047a;
    L_0x0478:
        r24 = 4;
    L_0x047a:
        r9 = r2;
        r26 = r8;
        r2 = r23;
        goto L_0x0487;
    L_0x0480:
        r4 = r3;
        r25 = r11;
        r24 = 4;
        r3 = r39;
    L_0x0487:
        r0 = r0 + 1;
        r8 = r38;
        r3 = r4;
        r11 = r25;
        r5 = -1;
        goto L_0x0370;
    L_0x0491:
        r3 = r39;
        r25 = r11;
        r0 = r7.mTotalLength;
        r2 = r37.getPaddingLeft();
        r4 = r37.getPaddingRight();
        r2 = r2 + r4;
        r0 = r0 + r2;
        r7.mTotalLength = r0;
        r0 = r15[r18];
        r2 = -1;
        if (r0 != r2) goto L_0x04b8;
    L_0x04a8:
        r0 = 0;
        r4 = r15[r0];
        if (r4 != r2) goto L_0x04b8;
    L_0x04ad:
        r0 = r15[r17];
        if (r0 != r2) goto L_0x04b8;
    L_0x04b1:
        r0 = r15[r16];
        if (r0 == r2) goto L_0x04b6;
    L_0x04b5:
        goto L_0x04b8;
    L_0x04b6:
        r0 = r10;
        goto L_0x04e6;
    L_0x04b8:
        r0 = r15[r16];
        r2 = 0;
        r4 = r15[r2];
        r5 = r15[r18];
        r8 = r15[r17];
        r5 = java.lang.Math.max(r5, r8);
        r4 = java.lang.Math.max(r4, r5);
        r0 = java.lang.Math.max(r0, r4);
        r4 = r28[r16];
        r2 = r28[r2];
        r5 = r28[r18];
        r8 = r28[r17];
        r5 = java.lang.Math.max(r5, r8);
        r2 = java.lang.Math.max(r2, r5);
        r2 = java.lang.Math.max(r4, r2);
        r0 = r0 + r2;
        r0 = java.lang.Math.max(r10, r0);
    L_0x04e6:
        r2 = r0;
        r0 = r9;
    L_0x04e8:
        if (r26 != 0) goto L_0x04ef;
    L_0x04ea:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r13 == r4) goto L_0x04ef;
    L_0x04ee:
        goto L_0x04f0;
    L_0x04ef:
        r0 = r2;
    L_0x04f0:
        r2 = r37.getPaddingTop();
        r4 = r37.getPaddingBottom();
        r2 = r2 + r4;
        r0 = r0 + r2;
        r2 = r37.getSuggestedMinimumHeight();
        r0 = java.lang.Math.max(r0, r2);
        r2 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r2 = r2 & r6;
        r1 = r1 | r2;
        r2 = r6 << 16;
        r0 = android.view.View.resolveSizeAndState(r0, r3, r2);
        r7.setMeasuredDimension(r1, r0);
        if (r27 == 0) goto L_0x0518;
    L_0x0511:
        r0 = r38;
        r1 = r25;
        r7.forceUniformHeight(r1, r0);
    L_0x0518:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.measureHorizontal(int, int):void");
    }

    /* Access modifiers changed, original: 0000 */
    public int measureNullChild(int i) {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0333  */
    public void measureVertical(int r34, int r35) {
        /*
        r33 = this;
        r7 = r33;
        r8 = r34;
        r9 = r35;
        r10 = 0;
        r7.mTotalLength = r10;
        r11 = r33.getVirtualChildCount();
        r12 = android.view.View.MeasureSpec.getMode(r34);
        r13 = android.view.View.MeasureSpec.getMode(r35);
        r14 = r7.mBaselineAlignedChildIndex;
        r15 = r7.mUseLargestChild;
        r16 = 0;
        r17 = 1;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 1;
    L_0x002a:
        r10 = 8;
        r22 = r4;
        if (r6 >= r11) goto L_0x01ae;
    L_0x0030:
        r4 = r7.getVirtualChildAt(r6);
        if (r4 != 0) goto L_0x004d;
    L_0x0036:
        r4 = r7.mTotalLength;
        r10 = r7.measureNullChild(r6);
        r4 = r4 + r10;
        r7.mTotalLength = r4;
        r23 = r11;
        r4 = r22;
        r22 = r13;
        r32 = r6;
        r6 = r1;
        r1 = r2;
        r2 = r32;
        goto L_0x019c;
    L_0x004d:
        r24 = r1;
        r1 = r4.getVisibility();
        if (r1 == r10) goto L_0x017b;
    L_0x0055:
        r1 = r7.hasDividerBeforeChildAt(r6);
        if (r1 == 0) goto L_0x0062;
    L_0x005b:
        r1 = r7.mTotalLength;
        r10 = r7.mDividerHeight;
        r1 = r1 + r10;
        r7.mTotalLength = r1;
    L_0x0062:
        r1 = r4.getLayoutParams();
        r10 = r1;
        r10 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r10;
        r1 = r10.weight;
        r25 = r0 + r1;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r13 != r1) goto L_0x009f;
    L_0x0071:
        r0 = r10.height;
        if (r0 != 0) goto L_0x009f;
    L_0x0075:
        r0 = r10.weight;
        r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1));
        if (r0 <= 0) goto L_0x009f;
    L_0x007b:
        r0 = r7.mTotalLength;
        r1 = r10.topMargin;
        r1 = r1 + r0;
        r26 = r2;
        r2 = r10.bottomMargin;
        r1 = r1 + r2;
        r0 = java.lang.Math.max(r0, r1);
        r7.mTotalLength = r0;
        r0 = r3;
        r3 = r4;
        r31 = r5;
        r23 = r11;
        r8 = r24;
        r30 = r26;
        r18 = 1;
        r11 = r6;
        r32 = r22;
        r22 = r13;
        r13 = r32;
        goto L_0x0111;
    L_0x009f:
        r26 = r2;
        r0 = r10.height;
        if (r0 != 0) goto L_0x00b0;
    L_0x00a5:
        r0 = r10.weight;
        r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1));
        if (r0 <= 0) goto L_0x00b0;
    L_0x00ab:
        r0 = -2;
        r10.height = r0;
        r2 = 0;
        goto L_0x00b2;
    L_0x00b0:
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x00b2:
        r27 = 0;
        r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1));
        if (r0 != 0) goto L_0x00bd;
    L_0x00b8:
        r0 = r7.mTotalLength;
        r28 = r0;
        goto L_0x00bf;
    L_0x00bd:
        r28 = 0;
    L_0x00bf:
        r0 = r33;
        r8 = r24;
        r23 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r4;
        r29 = r2;
        r30 = r26;
        r2 = r6;
        r9 = r3;
        r3 = r34;
        r24 = r4;
        r23 = r11;
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r32 = r22;
        r22 = r13;
        r13 = r32;
        r4 = r27;
        r31 = r5;
        r5 = r35;
        r11 = r6;
        r6 = r28;
        r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6);
        r0 = r29;
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 == r1) goto L_0x00ee;
    L_0x00ec:
        r10.height = r0;
    L_0x00ee:
        r0 = r24.getMeasuredHeight();
        r1 = r7.mTotalLength;
        r2 = r1 + r0;
        r3 = r10.topMargin;
        r2 = r2 + r3;
        r3 = r10.bottomMargin;
        r2 = r2 + r3;
        r3 = r24;
        r4 = r7.getNextLocationOffset(r3);
        r2 = r2 + r4;
        r1 = java.lang.Math.max(r1, r2);
        r7.mTotalLength = r1;
        if (r15 == 0) goto L_0x0110;
    L_0x010b:
        r0 = java.lang.Math.max(r0, r9);
        goto L_0x0111;
    L_0x0110:
        r0 = r9;
    L_0x0111:
        if (r14 < 0) goto L_0x011b;
    L_0x0113:
        r6 = r11 + 1;
        if (r14 != r6) goto L_0x011b;
    L_0x0117:
        r1 = r7.mTotalLength;
        r7.mBaselineChildTop = r1;
    L_0x011b:
        if (r11 >= r14) goto L_0x012c;
    L_0x011d:
        r1 = r10.weight;
        r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1));
        if (r1 > 0) goto L_0x0124;
    L_0x0123:
        goto L_0x012c;
    L_0x0124:
        r0 = new java.lang.RuntimeException;
        r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.";
        r0.<init>(r1);
        throw r0;
    L_0x012c:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r1) goto L_0x0139;
    L_0x0130:
        r1 = r10.width;
        r2 = -1;
        if (r1 != r2) goto L_0x0139;
    L_0x0135:
        r1 = 1;
        r19 = 1;
        goto L_0x013a;
    L_0x0139:
        r1 = 0;
    L_0x013a:
        r2 = r10.leftMargin;
        r4 = r10.rightMargin;
        r2 = r2 + r4;
        r4 = r3.getMeasuredWidth();
        r4 = r4 + r2;
        r5 = r30;
        r5 = java.lang.Math.max(r5, r4);
        r6 = r3.getMeasuredState();
        r6 = android.view.View.combineMeasuredStates(r8, r6);
        if (r20 == 0) goto L_0x015c;
    L_0x0154:
        r8 = r10.width;
        r9 = -1;
        if (r8 != r9) goto L_0x015c;
    L_0x0159:
        r20 = 1;
        goto L_0x015e;
    L_0x015c:
        r20 = 0;
    L_0x015e:
        r8 = r10.weight;
        r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1));
        if (r8 <= 0) goto L_0x0170;
    L_0x0164:
        if (r1 == 0) goto L_0x0167;
    L_0x0166:
        goto L_0x0168;
    L_0x0167:
        r2 = r4;
    L_0x0168:
        r4 = java.lang.Math.max(r13, r2);
        r13 = r4;
        r1 = r31;
        goto L_0x018e;
    L_0x0170:
        if (r1 == 0) goto L_0x0173;
    L_0x0172:
        goto L_0x0174;
    L_0x0173:
        r2 = r4;
    L_0x0174:
        r1 = r31;
        r1 = java.lang.Math.max(r1, r2);
        goto L_0x018e;
    L_0x017b:
        r9 = r3;
        r3 = r4;
        r1 = r5;
        r23 = r11;
        r8 = r24;
        r5 = r2;
        r11 = r6;
        r32 = r22;
        r22 = r13;
        r13 = r32;
        r25 = r0;
        r6 = r8;
        r0 = r9;
    L_0x018e:
        r2 = r7.getChildrenSkipCount(r3, r11);
        r2 = r2 + r11;
        r3 = r0;
        r4 = r13;
        r0 = r25;
        r32 = r5;
        r5 = r1;
        r1 = r32;
    L_0x019c:
        r2 = r2 + 1;
        r8 = r34;
        r9 = r35;
        r13 = r22;
        r11 = r23;
        r32 = r2;
        r2 = r1;
        r1 = r6;
        r6 = r32;
        goto L_0x002a;
    L_0x01ae:
        r8 = r1;
        r9 = r3;
        r1 = r5;
        r23 = r11;
        r5 = r2;
        r32 = r22;
        r22 = r13;
        r13 = r32;
        r2 = r7.mTotalLength;
        if (r2 <= 0) goto L_0x01ce;
    L_0x01be:
        r2 = r23;
        r3 = r7.hasDividerBeforeChildAt(r2);
        if (r3 == 0) goto L_0x01d0;
    L_0x01c6:
        r3 = r7.mTotalLength;
        r4 = r7.mDividerHeight;
        r3 = r3 + r4;
        r7.mTotalLength = r3;
        goto L_0x01d0;
    L_0x01ce:
        r2 = r23;
    L_0x01d0:
        if (r15 == 0) goto L_0x021e;
    L_0x01d2:
        r3 = r22;
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r3 == r4) goto L_0x01da;
    L_0x01d8:
        if (r3 != 0) goto L_0x0220;
    L_0x01da:
        r4 = 0;
        r7.mTotalLength = r4;
        r4 = 0;
    L_0x01de:
        if (r4 >= r2) goto L_0x0220;
    L_0x01e0:
        r6 = r7.getVirtualChildAt(r4);
        if (r6 != 0) goto L_0x01f0;
    L_0x01e6:
        r6 = r7.mTotalLength;
        r11 = r7.measureNullChild(r4);
        r6 = r6 + r11;
    L_0x01ed:
        r7.mTotalLength = r6;
        goto L_0x0219;
    L_0x01f0:
        r11 = r6.getVisibility();
        if (r11 != r10) goto L_0x01fc;
    L_0x01f6:
        r6 = r7.getChildrenSkipCount(r6, r4);
        r4 = r4 + r6;
        goto L_0x0219;
    L_0x01fc:
        r11 = r6.getLayoutParams();
        r11 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r11;
        r14 = r7.mTotalLength;
        r21 = r14 + r9;
        r10 = r11.topMargin;
        r21 = r21 + r10;
        r10 = r11.bottomMargin;
        r21 = r21 + r10;
        r6 = r7.getNextLocationOffset(r6);
        r6 = r21 + r6;
        r6 = java.lang.Math.max(r14, r6);
        goto L_0x01ed;
    L_0x0219:
        r4 = r4 + 1;
        r10 = 8;
        goto L_0x01de;
    L_0x021e:
        r3 = r22;
    L_0x0220:
        r4 = r7.mTotalLength;
        r6 = r33.getPaddingTop();
        r10 = r33.getPaddingBottom();
        r6 = r6 + r10;
        r4 = r4 + r6;
        r7.mTotalLength = r4;
        r4 = r7.mTotalLength;
        r6 = r33.getSuggestedMinimumHeight();
        r4 = java.lang.Math.max(r4, r6);
        r6 = r35;
        r10 = r9;
        r9 = 0;
        r4 = android.view.View.resolveSizeAndState(r4, r6, r9);
        r9 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r9 = r9 & r4;
        r11 = r7.mTotalLength;
        r9 = r9 - r11;
        if (r18 != 0) goto L_0x0290;
    L_0x0249:
        if (r9 == 0) goto L_0x0250;
    L_0x024b:
        r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1));
        if (r11 <= 0) goto L_0x0250;
    L_0x024f:
        goto L_0x0290;
    L_0x0250:
        r0 = java.lang.Math.max(r1, r13);
        if (r15 == 0) goto L_0x028b;
    L_0x0256:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r3 == r1) goto L_0x028b;
    L_0x025a:
        r1 = 0;
    L_0x025b:
        if (r1 >= r2) goto L_0x028b;
    L_0x025d:
        r3 = r7.getVirtualChildAt(r1);
        if (r3 == 0) goto L_0x0288;
    L_0x0263:
        r9 = r3.getVisibility();
        r11 = 8;
        if (r9 == r11) goto L_0x0288;
    L_0x026b:
        r9 = r3.getLayoutParams();
        r9 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r9;
        r9 = r9.weight;
        r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1));
        if (r9 <= 0) goto L_0x0288;
    L_0x0277:
        r9 = r3.getMeasuredWidth();
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11);
        r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11);
        r3.measure(r9, r13);
    L_0x0288:
        r1 = r1 + 1;
        goto L_0x025b;
    L_0x028b:
        r11 = r34;
        r1 = r8;
        goto L_0x037d;
    L_0x0290:
        r10 = r7.mWeightSum;
        r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1));
        if (r11 <= 0) goto L_0x0297;
    L_0x0296:
        r0 = r10;
    L_0x0297:
        r10 = 0;
        r7.mTotalLength = r10;
        r11 = r0;
        r0 = 0;
        r32 = r8;
        r8 = r1;
        r1 = r32;
    L_0x02a1:
        if (r0 >= r2) goto L_0x036c;
    L_0x02a3:
        r13 = r7.getVirtualChildAt(r0);
        r14 = r13.getVisibility();
        r15 = 8;
        if (r14 == r15) goto L_0x0360;
    L_0x02af:
        r14 = r13.getLayoutParams();
        r14 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r14;
        r10 = r14.weight;
        r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1));
        if (r18 <= 0) goto L_0x030a;
    L_0x02bb:
        r15 = (float) r9;
        r15 = r15 * r10;
        r15 = r15 / r11;
        r15 = (int) r15;
        r11 = r11 - r10;
        r9 = r9 - r15;
        r10 = r33.getPaddingLeft();
        r18 = r33.getPaddingRight();
        r10 = r10 + r18;
        r18 = r9;
        r9 = r14.leftMargin;
        r10 = r10 + r9;
        r9 = r14.rightMargin;
        r10 = r10 + r9;
        r9 = r14.width;
        r21 = r11;
        r11 = r34;
        r9 = getChildMeasureSpec(r11, r10, r9);
        r10 = r14.height;
        if (r10 != 0) goto L_0x02ed;
    L_0x02e1:
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r3 == r10) goto L_0x02e6;
    L_0x02e5:
        goto L_0x02ed;
    L_0x02e6:
        if (r15 <= 0) goto L_0x02e9;
    L_0x02e8:
        goto L_0x02f6;
    L_0x02e9:
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r15 = 0;
        goto L_0x02f8;
    L_0x02ed:
        r10 = r13.getMeasuredHeight();
        r10 = r10 + r15;
        if (r10 >= 0) goto L_0x02f5;
    L_0x02f4:
        r10 = 0;
    L_0x02f5:
        r15 = r10;
    L_0x02f6:
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x02f8:
        r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10);
        r13.measure(r9, r15);
        r9 = r13.getMeasuredState();
        r9 = r9 & -256;
        r1 = android.view.View.combineMeasuredStates(r1, r9);
        goto L_0x0311;
    L_0x030a:
        r10 = r11;
        r11 = r34;
        r18 = r9;
        r21 = r10;
    L_0x0311:
        r9 = r14.leftMargin;
        r10 = r14.rightMargin;
        r9 = r9 + r10;
        r10 = r13.getMeasuredWidth();
        r10 = r10 + r9;
        r5 = java.lang.Math.max(r5, r10);
        r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r15) goto L_0x032c;
    L_0x0323:
        r15 = r14.width;
        r23 = r1;
        r1 = -1;
        if (r15 != r1) goto L_0x032f;
    L_0x032a:
        r15 = 1;
        goto L_0x0330;
    L_0x032c:
        r23 = r1;
        r1 = -1;
    L_0x032f:
        r15 = 0;
    L_0x0330:
        if (r15 == 0) goto L_0x0333;
    L_0x0332:
        goto L_0x0334;
    L_0x0333:
        r9 = r10;
    L_0x0334:
        r8 = java.lang.Math.max(r8, r9);
        if (r20 == 0) goto L_0x0340;
    L_0x033a:
        r9 = r14.width;
        if (r9 != r1) goto L_0x0340;
    L_0x033e:
        r9 = 1;
        goto L_0x0341;
    L_0x0340:
        r9 = 0;
    L_0x0341:
        r10 = r7.mTotalLength;
        r15 = r13.getMeasuredHeight();
        r15 = r15 + r10;
        r1 = r14.topMargin;
        r15 = r15 + r1;
        r1 = r14.bottomMargin;
        r15 = r15 + r1;
        r1 = r7.getNextLocationOffset(r13);
        r15 = r15 + r1;
        r1 = java.lang.Math.max(r10, r15);
        r7.mTotalLength = r1;
        r20 = r9;
        r9 = r18;
        r1 = r23;
        goto L_0x0365;
    L_0x0360:
        r10 = r11;
        r11 = r34;
        r21 = r10;
    L_0x0365:
        r0 = r0 + 1;
        r11 = r21;
        r10 = 0;
        goto L_0x02a1;
    L_0x036c:
        r11 = r34;
        r0 = r7.mTotalLength;
        r3 = r33.getPaddingTop();
        r9 = r33.getPaddingBottom();
        r3 = r3 + r9;
        r0 = r0 + r3;
        r7.mTotalLength = r0;
        r0 = r8;
    L_0x037d:
        if (r20 != 0) goto L_0x0384;
    L_0x037f:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r3) goto L_0x0384;
    L_0x0383:
        goto L_0x0385;
    L_0x0384:
        r0 = r5;
    L_0x0385:
        r3 = r33.getPaddingLeft();
        r5 = r33.getPaddingRight();
        r3 = r3 + r5;
        r0 = r0 + r3;
        r3 = r33.getSuggestedMinimumWidth();
        r0 = java.lang.Math.max(r0, r3);
        r0 = android.view.View.resolveSizeAndState(r0, r11, r1);
        r7.setMeasuredDimension(r0, r4);
        if (r19 == 0) goto L_0x03a3;
    L_0x03a0:
        r7.forceUniformWidth(r2, r6);
    L_0x03a3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.measureVertical(int, int):void");
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder stringBuilder = new StringBuilder("base aligned child index out of range (0, ");
            stringBuilder.append(getChildCount());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.mBaselineAlignedChildIndex = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            boolean z = false;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        i &= 8388615;
        int i2 = this.mGravity;
        if ((8388615 & i2) != i) {
            this.mGravity = i | (-8388616 & i2);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        i &= 112;
        int i2 = this.mGravity;
        if ((i2 & 112) != i) {
            this.mGravity = i | (i2 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(MapboxConstants.MINIMUM_ZOOM, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
