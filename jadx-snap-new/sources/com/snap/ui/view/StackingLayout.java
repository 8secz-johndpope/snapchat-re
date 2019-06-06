package com.snap.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import defpackage.abpm;
import defpackage.in;
import defpackage.zhg.a;

public class StackingLayout extends ViewGroup {
    public static final int AFFINITY_BOTTOM = 4;
    public static final int AFFINITY_END = 6;
    public static final int AFFINITY_LEFT = 1;
    public static final int AFFINITY_RIGHT = 2;
    public static final int AFFINITY_START = 5;
    public static final int AFFINITY_TOP = 3;

    public static class LayoutParams extends MarginLayoutParams {
        public static final int DEFAULT_GRAVITY = 51;
        public static final int UNSPECIFIED_AFFINITY = -1;
        public static final int UNSPECIFIED_GRAVITY = -1;
        public int affinity = -1;
        public boolean consumeSpace = true;
        public int gravity = -1;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.affinity = i3;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.p);
            this.affinity = obtainStyledAttributes.getInt(0, -1);
            this.gravity = obtainStyledAttributes.getInt(2, -1);
            this.consumeSpace = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.affinity = layoutParams.affinity;
        }
    }

    public StackingLayout(Context context) {
        super(context);
    }

    public StackingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StackingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private int localizeAffinity(int i) {
        if (i != 5 && i != 6) {
            return i;
        }
        int layoutDirection = getLayoutDirection();
        return i == 5 ? layoutDirection == 0 ? 1 : 2 : layoutDirection == 0 ? 2 : 1;
    }

    private int localizeGravity(int i) {
        if (i != 8388611 && i != 8388613) {
            return i;
        }
        int layoutDirection = getLayoutDirection();
        return i == 8388611 ? layoutDirection == 0 ? 3 : 5 : layoutDirection == 0 ? 2 : 1;
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* Access modifiers changed, original: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int i5 = (i3 - i) - paddingRight;
        paddingRight = (i4 - i2) - getPaddingBottom();
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int i6 = paddingLeft;
        int i7 = paddingRight;
        int i8 = paddingTop;
        int i9 = i5;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            in.a(abpm.b(childAt.getClass()));
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                paddingLeft = localizeAffinity(layoutParams.affinity);
                paddingTop = localizeGravity(layoutParams.gravity);
                if (paddingTop == -1) {
                    paddingTop = 51;
                }
                if (paddingLeft == 1 || paddingLeft == 2) {
                    paddingTop &= 112;
                    if (paddingTop == 16) {
                        paddingTop = ((((i7 - i8) - measuredHeight) / 2) + i8) + layoutParams.topMargin;
                        paddingTop -= layoutParams.bottomMargin;
                    } else if (paddingTop != 80) {
                        paddingTop = layoutParams.topMargin + i8;
                    } else {
                        paddingTop = i7 - measuredHeight;
                        paddingTop -= layoutParams.bottomMargin;
                    }
                    i5 = paddingTop;
                    paddingTop = 0;
                } else {
                    if (paddingLeft == 3 || paddingLeft == 4) {
                        paddingTop = Gravity.getAbsoluteGravity(paddingTop, layoutDirection) & 7;
                        paddingTop = paddingTop != 1 ? paddingTop != 5 ? layoutParams.leftMargin + i6 : i9 - measuredWidth : ((((i9 - i6) - measuredWidth) / 2) + i6) + layoutParams.leftMargin;
                        paddingTop -= layoutParams.rightMargin;
                    } else {
                        paddingTop = 0;
                    }
                    i5 = 0;
                }
                LayoutParams layoutParams2;
                if (paddingLeft == 1) {
                    layoutParams2 = layoutParams;
                    setChildFrame(childAt, i6 + layoutParams2.leftMargin, i5, measuredWidth, measuredHeight);
                    if (layoutParams2.consumeSpace) {
                        i6 += (measuredWidth + layoutParams2.leftMargin) + layoutParams2.rightMargin;
                    }
                } else if (paddingLeft == 2) {
                    layoutParams2 = layoutParams;
                    setChildFrame(childAt, (i9 - layoutParams2.rightMargin) - measuredWidth, i5, measuredWidth, measuredHeight);
                    if (layoutParams2.consumeSpace) {
                        i9 -= (measuredWidth + layoutParams2.leftMargin) + layoutParams2.rightMargin;
                    }
                } else if (paddingLeft == 3) {
                    layoutParams2 = layoutParams;
                    setChildFrame(childAt, paddingTop, i8 + layoutParams2.topMargin, measuredWidth, measuredHeight);
                    if (layoutParams2.consumeSpace) {
                        i8 += (measuredHeight + layoutParams2.topMargin) + layoutParams2.bottomMargin;
                    }
                } else if (paddingLeft == 4) {
                    layoutParams2 = layoutParams;
                    setChildFrame(childAt, paddingTop, (i7 - measuredHeight) - layoutParams.bottomMargin, measuredWidth, measuredHeight);
                    if (layoutParams2.consumeSpace) {
                        i7 -= (measuredHeight + layoutParams2.topMargin) + layoutParams2.bottomMargin;
                    }
                }
            }
            in.a();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        View view = null;
        View view2 = view;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            in.a(abpm.b(childAt.getClass()));
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i, i3, i2, i4);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i9 = layoutParams.affinity;
                if (i9 != -1) {
                    if (i9 == 1 || i9 == 2 || i9 == 5 || i9 == 6) {
                        if (view2 != null) {
                            throw new IllegalStateException("Can only use MATCH_PARENT as final view of axis of affinity");
                        } else if (layoutParams.consumeSpace) {
                            i5 = Math.max(i5, childAt.getMeasuredHeight());
                            i3 += (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                            if (layoutParams.width == -1) {
                                view2 = childAt;
                            }
                        }
                    } else if (view != null) {
                        throw new IllegalStateException("Can only use MATCH_PARENT on final view of axis of affinity");
                    } else if (layoutParams.consumeSpace) {
                        i6 = Math.max(i6, childAt.getMeasuredWidth());
                        i4 += (childAt.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
                        if (layoutParams.height == -1) {
                            view = childAt;
                        }
                    }
                    i7 = combineMeasuredStates(i7, childAt.getMeasuredState());
                } else {
                    throw new IllegalStateException("View parameter layout_affinity is required");
                }
            }
            in.a();
        }
        setMeasuredDimension(resolveSizeAndState(Math.max(Math.max(i6, i3 + (getPaddingLeft() + getPaddingRight())), getSuggestedMinimumWidth()), i, i7), resolveSizeAndState(Math.max(Math.max(i5, i4 + (getPaddingTop() + getPaddingBottom())), getSuggestedMinimumHeight()), i2, i7 << 16));
    }
}
