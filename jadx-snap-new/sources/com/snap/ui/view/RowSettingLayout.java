package com.snap.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import defpackage.ajxt;
import defpackage.akcr;

public class RowSettingLayout extends ViewGroup {
    private int maxRowHeight;

    public RowSettingLayout(Context context) {
        akcr.b(context, "context");
        this(context, null);
    }

    public RowSettingLayout(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, 0);
    }

    public RowSettingLayout(Context context, AttributeSet attributeSet, int i) {
        akcr.b(context, "context");
        super(context, attributeSet, i);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x009b in {10, 15, 16, 17, 18, 20, 21, 22, 24} preds:[]
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
    protected void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
        r8 = this;
        r12 = r12 - r10;
        r9 = r8.getPaddingLeft();
        r10 = r8.getPaddingTop();
        r11 = r8.getLayoutParams();
        if (r11 == 0) goto L_0x0093;
        r11 = (android.widget.FrameLayout.LayoutParams) r11;
        r13 = r8.getChildCount();
        r0 = 0;
        r1 = r10;
        r10 = r9;
        r9 = 0;
        if (r9 >= r13) goto L_0x0092;
        r2 = r8.getChildAt(r9);
        r3 = "child";
        defpackage.akcr.a(r2, r3);
        r3 = r2.getVisibility();
        r4 = 8;
        if (r3 == r4) goto L_0x008f;
        r3 = r2.getLayoutParams();
        if (r3 == 0) goto L_0x0087;
        r3 = (android.view.ViewGroup.MarginLayoutParams) r3;
        r4 = r3.leftMargin;
        r5 = r2.getMeasuredWidth();
        r4 = r4 + r5;
        r5 = r3.rightMargin;
        r4 = r4 + r5;
        r5 = r10 + r4;
        if (r5 <= r12) goto L_0x0049;
        r10 = r8.maxRowHeight;
        r1 = r1 + r10;
        r10 = r8.getPaddingLeft();
        r5 = r11.gravity;
        r5 = r5 & 112;
        r6 = 48;
        if (r5 == r6) goto L_0x0070;
        r6 = 80;
        if (r5 == r6) goto L_0x0065;
        r5 = r8.maxRowHeight;
        r6 = r2.getMeasuredHeight();
        r7 = r3.topMargin;
        r6 = r6 + r7;
        r7 = r3.bottomMargin;
        r6 = r6 + r7;
        r5 = r5 - r6;
        r5 = r5 / 2;
        goto L_0x0071;
        r5 = r8.maxRowHeight;
        r6 = r2.getMeasuredHeight();
        r5 = r5 - r6;
        r6 = r3.bottomMargin;
        r5 = r5 - r6;
        goto L_0x0071;
        r5 = 0;
        r6 = r3.leftMargin;
        r6 = r6 + r10;
        r3 = r3.topMargin;
        r3 = r3 + r1;
        r3 = r3 + r5;
        r5 = r2.getMeasuredWidth();
        r5 = r5 + r6;
        r7 = r2.getMeasuredHeight();
        r7 = r7 + r3;
        r2.layout(r6, r3, r5, r7);
        r10 = r10 + r4;
        goto L_0x008f;
        r9 = new ajxt;
        r10 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
        r9.<init>(r10);
        throw r9;
        r9 = r9 + 1;
        goto L_0x0019;
        return;
        r9 = new ajxt;
        r10 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams";
        r9.<init>(r10);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.RowSettingLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        int defaultSize = ViewGroup.getDefaultSize(getSuggestedMinimumWidth(), i);
        int childCount = getChildCount();
        int i3 = 1;
        int i4 = 0;
        while (i4 < childCount) {
            Object childAt = getChildAt(i4);
            akcr.a(childAt, "child");
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                measureChild(childAt, i, i2);
                this.maxRowHeight = Math.max((childAt.getMeasuredHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin, this.maxRowHeight);
                int measuredWidth = (marginLayoutParams.leftMargin + childAt.getMeasuredWidth()) + marginLayoutParams.rightMargin;
                paddingLeft += measuredWidth;
                if (paddingLeft > defaultSize) {
                    i3++;
                    paddingLeft = getPaddingLeft() + measuredWidth;
                }
                i4++;
            } else {
                throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        setMeasuredDimension(i, this.maxRowHeight * i3);
    }
}
