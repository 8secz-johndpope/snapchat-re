package android.support.v7.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.snapchat.android.R;
import defpackage.kb;

public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), AudioPlayer.INFINITY_LOOP_COUNT);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    private static int resolveMinimumHeight(View view) {
        while (true) {
            int f = kb.a.f(view);
            if (f <= 0) {
                if (!(view instanceof ViewGroup)) {
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() != 1) {
                    break;
                }
                view = viewGroup.getChildAt(0);
            } else {
                return f;
            }
        }
        return 0;
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    private boolean tryOnMeasure(int i, int i2) {
        int i3;
        int combineMeasuredStates;
        int resolveMinimumHeight;
        int measuredHeight;
        int measuredHeight2;
        int i4 = i;
        int i5 = i2;
        int childCount = getChildCount();
        View view = null;
        View view2 = view;
        View view3 = view2;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                    return false;
                } else {
                    view3 = childAt;
                }
            }
        }
        i3 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode = MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i4, 0);
            paddingTop += view.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            combineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i4, 0);
            resolveMinimumHeight = resolveMinimumHeight(view2);
            measuredHeight = view2.getMeasuredHeight() - resolveMinimumHeight;
            paddingTop += resolveMinimumHeight;
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
        } else {
            resolveMinimumHeight = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i4, i3 == 0 ? 0 : MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), i3));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        size -= paddingTop;
        if (view2 != null) {
            paddingTop -= resolveMinimumHeight;
            measuredHeight = Math.min(size, measuredHeight);
            if (measuredHeight > 0) {
                size -= measuredHeight;
                resolveMinimumHeight += measuredHeight;
            }
            view2.measure(i4, MeasureSpec.makeMeasureSpec(resolveMinimumHeight, AudioPlayer.INFINITY_LOOP_COUNT));
            paddingTop += view2.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && size > 0) {
            paddingTop -= measuredHeight2;
            view3.measure(i4, MeasureSpec.makeMeasureSpec(measuredHeight2 + size, i3));
            paddingTop += view3.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view3.getMeasuredState());
        }
        int i6 = 0;
        for (i3 = 0; i3 < childCount; i3++) {
            view3 = getChildAt(i3);
            if (view3.getVisibility() != 8) {
                i6 = Math.max(i6, view3.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i6 + (getPaddingLeft() + getPaddingRight()), i4, combineMeasuredStates), View.resolveSizeAndState(paddingTop, i5, 0));
        if (mode != AudioPlayer.INFINITY_LOOP_COUNT) {
            forceUniformWidth(childCount, i5);
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
        r17 = this;
        r6 = r17;
        r7 = r17.getPaddingLeft();
        r0 = r21 - r19;
        r1 = r17.getPaddingRight();
        r8 = r0 - r1;
        r0 = r0 - r7;
        r1 = r17.getPaddingRight();
        r9 = r0 - r1;
        r0 = r17.getMeasuredHeight();
        r10 = r17.getChildCount();
        r1 = r17.getGravity();
        r2 = r1 & 112;
        r3 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r11 = r1 & r3;
        r1 = 16;
        if (r2 == r1) goto L_0x0040;
    L_0x002c:
        r1 = 80;
        if (r2 == r1) goto L_0x0035;
    L_0x0030:
        r0 = r17.getPaddingTop();
        goto L_0x004b;
    L_0x0035:
        r1 = r17.getPaddingTop();
        r1 = r1 + r22;
        r1 = r1 - r20;
        r0 = r1 - r0;
        goto L_0x004b;
    L_0x0040:
        r1 = r17.getPaddingTop();
        r2 = r22 - r20;
        r2 = r2 - r0;
        r2 = r2 / 2;
        r0 = r1 + r2;
    L_0x004b:
        r1 = r17.getDividerDrawable();
        r2 = 0;
        if (r1 != 0) goto L_0x0054;
    L_0x0052:
        r12 = 0;
        goto L_0x0059;
    L_0x0054:
        r1 = r1.getIntrinsicHeight();
        r12 = r1;
    L_0x0059:
        r13 = 0;
    L_0x005a:
        if (r13 >= r10) goto L_0x00bf;
    L_0x005c:
        r1 = r6.getChildAt(r13);
        if (r1 == 0) goto L_0x00bc;
    L_0x0062:
        r2 = r1.getVisibility();
        r3 = 8;
        if (r2 == r3) goto L_0x00bc;
    L_0x006a:
        r4 = r1.getMeasuredWidth();
        r14 = r1.getMeasuredHeight();
        r2 = r1.getLayoutParams();
        r15 = r2;
        r15 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r15;
        r2 = r15.gravity;
        if (r2 >= 0) goto L_0x007e;
    L_0x007d:
        r2 = r11;
    L_0x007e:
        r3 = defpackage.kb.a;
        r3 = r3.j(r6);
        r2 = defpackage.jp.a(r2, r3);
        r2 = r2 & 7;
        r3 = 1;
        if (r2 == r3) goto L_0x0097;
    L_0x008d:
        r3 = 5;
        if (r2 == r3) goto L_0x0094;
    L_0x0090:
        r2 = r15.leftMargin;
        r2 = r2 + r7;
        goto L_0x00a2;
    L_0x0094:
        r2 = r8 - r4;
        goto L_0x009f;
    L_0x0097:
        r2 = r9 - r4;
        r2 = r2 / 2;
        r2 = r2 + r7;
        r3 = r15.leftMargin;
        r2 = r2 + r3;
    L_0x009f:
        r3 = r15.rightMargin;
        r2 = r2 - r3;
    L_0x00a2:
        r3 = r6.hasDividerBeforeChildAt(r13);
        if (r3 == 0) goto L_0x00a9;
    L_0x00a8:
        r0 = r0 + r12;
    L_0x00a9:
        r3 = r15.topMargin;
        r16 = r0 + r3;
        r0 = r17;
        r3 = r16;
        r5 = r14;
        r0.setChildFrame(r1, r2, r3, r4, r5);
        r0 = r15.bottomMargin;
        r14 = r14 + r0;
        r16 = r16 + r14;
        r0 = r16;
    L_0x00bc:
        r13 = r13 + 1;
        goto L_0x005a;
    L_0x00bf:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (!tryOnMeasure(i, i2)) {
            super.onMeasure(i, i2);
        }
    }
}
