package com.snap.ui.view;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import com.snap.ui.view.emoji.SnapEmojiTextView;
import java.util.List;

public class SnapWrapTextView extends SnapEmojiTextView {
    private CharSequence mOriginalText;
    private CharSequence mProcessedText;
    private int mRequestedMaxLines;

    public SnapWrapTextView(Context context) {
        super(context);
        initialize();
    }

    public SnapWrapTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    public SnapWrapTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize();
    }

    private void findDelimiters(CharSequence charSequence, List<Integer> list) {
        for (int i = 0; i < charSequence.length(); i++) {
            Object valueOf;
            if (charSequence.charAt(i) == ' ') {
                valueOf = Integer.valueOf(i);
            } else if (i == charSequence.length() - 1) {
                valueOf = Integer.valueOf(charSequence.length());
            } else {
            }
            list.add(valueOf);
        }
    }

    private void initialize() {
        setMaxLines(2);
        setEllipsize(TruncateAt.END);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    private void processTextForWrapping(java.lang.CharSequence r14, int r15) {
        /*
        r13 = this;
        if (r14 != 0) goto L_0x0008;
    L_0x0002:
        r14 = 0;
        r13.mProcessedText = r14;
        r13.mOriginalText = r14;
        return;
    L_0x0008:
        r0 = r13.mProcessedText;
        r0 = android.text.TextUtils.equals(r14, r0);
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r13.mOriginalText = r14;
        r0 = r13.getPaddingLeft();
        r1 = r13.getPaddingRight();
        r0 = r0 + r1;
        r15 = r15 - r0;
        if (r15 > 0) goto L_0x0020;
    L_0x001f:
        return;
    L_0x0020:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r13.findDelimiters(r14, r0);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = 0;
        r3 = 0;
        r10 = 0;
    L_0x0030:
        r4 = r14.length();
        if (r10 >= r4) goto L_0x009f;
    L_0x0036:
        r11 = r3 + 1;
        r3 = r13.mRequestedMaxLines;
        r12 = 10;
        if (r11 != r3) goto L_0x004e;
    L_0x003e:
        r1.append(r12);
        r15 = r14.length();
        r14 = r14.subSequence(r10, r15);
        r1.append(r14);
        r3 = r11;
        goto L_0x009f;
    L_0x004e:
        r3 = r13.getPaint();
        r6 = r14.length();
        r7 = 1;
        r8 = (float) r15;
        r9 = 0;
        r4 = r14;
        r5 = r10;
        r3 = r3.breakText(r4, r5, r6, r7, r8, r9);
        r4 = r14.length();
        r3 = r3 + r10;
        r3 = java.lang.Math.min(r4, r3);
        r4 = -1;
        r5 = -1;
    L_0x006a:
        r6 = r5 + 1;
        r7 = r0.size();
        if (r6 >= r7) goto L_0x0080;
    L_0x0072:
        r7 = r0.get(r6);
        r7 = (java.lang.Integer) r7;
        r7 = r7.intValue();
        if (r7 >= r3) goto L_0x0080;
    L_0x007e:
        r5 = r6;
        goto L_0x006a;
    L_0x0080:
        if (r5 != r4) goto L_0x0087;
    L_0x0082:
        r3 = r14.length();
        goto L_0x0091;
    L_0x0087:
        r3 = r0.get(r5);
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
    L_0x0091:
        r1.append(r12);
        r4 = r14.subSequence(r10, r3);
        r1.append(r4);
        r10 = r3 + 1;
        r3 = r11;
        goto L_0x0030;
    L_0x009f:
        r14 = r1.length();
        if (r14 <= 0) goto L_0x00a8;
    L_0x00a5:
        r1.deleteCharAt(r2);
    L_0x00a8:
        r14 = r1.toString();
        r13.mProcessedText = r14;
        r14 = r13.mProcessedText;
        r13.setText(r14);
        r14 = r13.getMaxLines();
        if (r14 == r3) goto L_0x00bc;
    L_0x00b9:
        super.setMaxLines(r3);
    L_0x00bc:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.SnapWrapTextView.processTextForWrapping(java.lang.CharSequence, int):void");
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        i2 = getMeasuredHeight();
        processTextForWrapping(this.mOriginalText, i);
        setMeasuredDimension(i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            processTextForWrapping(this.mOriginalText, i);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        processTextForWrapping(charSequence, getWidth());
    }

    public void setMaxLines(int i) {
        this.mRequestedMaxLines = i;
    }
}
