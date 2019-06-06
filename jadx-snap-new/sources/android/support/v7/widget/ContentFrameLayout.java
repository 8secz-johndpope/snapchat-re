package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.kb;

public class ContentFrameLayout extends FrameLayout {
    private OnAttachListener mAttachListener;
    private final Rect mDecorPadding;
    private TypedValue mFixedHeightMajor;
    private TypedValue mFixedHeightMinor;
    private TypedValue mFixedWidthMajor;
    private TypedValue mFixedWidthMinor;
    private TypedValue mMinWidthMajor;
    private TypedValue mMinWidthMinor;

    public interface OnAttachListener {
        void onAttachedFromWindow();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDecorPadding = new Rect();
    }

    public void dispatchFitSystemWindows(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.mFixedHeightMajor == null) {
            this.mFixedHeightMajor = new TypedValue();
        }
        return this.mFixedHeightMajor;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.mFixedHeightMinor == null) {
            this.mFixedHeightMinor = new TypedValue();
        }
        return this.mFixedHeightMinor;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.mFixedWidthMajor == null) {
            this.mFixedWidthMajor = new TypedValue();
        }
        return this.mFixedWidthMajor;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.mFixedWidthMinor == null) {
            this.mFixedWidthMinor = new TypedValue();
        }
        return this.mFixedWidthMinor;
    }

    public TypedValue getMinWidthMajor() {
        if (this.mMinWidthMajor == null) {
            this.mMinWidthMajor = new TypedValue();
        }
        return this.mMinWidthMajor;
    }

    public TypedValue getMinWidthMinor() {
        if (this.mMinWidthMinor == null) {
            this.mMinWidthMinor = new TypedValue();
        }
        return this.mMinWidthMinor;
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OnAttachListener onAttachListener = this.mAttachListener;
        if (onAttachListener != null) {
            onAttachListener.onAttachedFromWindow();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OnAttachListener onAttachListener = this.mAttachListener;
        if (onAttachListener != null) {
            onAttachListener.onDetachedFromWindow();
        }
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A:{SYNTHETIC, RETURN} */
    public void onMeasure(int r14, int r15) {
        /*
        r13 = this;
        r0 = r13.getContext();
        r0 = r0.getResources();
        r0 = r0.getDisplayMetrics();
        r1 = r0.widthPixels;
        r2 = r0.heightPixels;
        r3 = 1;
        r4 = 0;
        if (r1 >= r2) goto L_0x0016;
    L_0x0014:
        r1 = 1;
        goto L_0x0017;
    L_0x0016:
        r1 = 0;
    L_0x0017:
        r2 = android.view.View.MeasureSpec.getMode(r14);
        r5 = android.view.View.MeasureSpec.getMode(r15);
        r6 = 6;
        r7 = 5;
        r8 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r2 != r8) goto L_0x0069;
    L_0x0027:
        if (r1 == 0) goto L_0x002c;
    L_0x0029:
        r10 = r13.mFixedWidthMinor;
        goto L_0x002e;
    L_0x002c:
        r10 = r13.mFixedWidthMajor;
    L_0x002e:
        if (r10 == 0) goto L_0x0069;
    L_0x0030:
        r11 = r10.type;
        if (r11 == 0) goto L_0x0069;
    L_0x0034:
        r11 = r10.type;
        if (r11 != r7) goto L_0x003e;
    L_0x0038:
        r10 = r10.getDimension(r0);
    L_0x003c:
        r10 = (int) r10;
        goto L_0x004e;
    L_0x003e:
        r11 = r10.type;
        if (r11 != r6) goto L_0x004d;
    L_0x0042:
        r11 = r0.widthPixels;
        r11 = (float) r11;
        r12 = r0.widthPixels;
        r12 = (float) r12;
        r10 = r10.getFraction(r11, r12);
        goto L_0x003c;
    L_0x004d:
        r10 = 0;
    L_0x004e:
        if (r10 <= 0) goto L_0x0069;
    L_0x0050:
        r11 = r13.mDecorPadding;
        r11 = r11.left;
        r12 = r13.mDecorPadding;
        r12 = r12.right;
        r11 = r11 + r12;
        r10 = r10 - r11;
        r14 = android.view.View.MeasureSpec.getSize(r14);
        r14 = java.lang.Math.min(r10, r14);
        r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9);
        r10 = r14;
        r14 = 1;
        goto L_0x006b;
    L_0x0069:
        r10 = r14;
        r14 = 0;
    L_0x006b:
        if (r5 != r8) goto L_0x00ac;
    L_0x006d:
        if (r1 == 0) goto L_0x0072;
    L_0x006f:
        r5 = r13.mFixedHeightMajor;
        goto L_0x0074;
    L_0x0072:
        r5 = r13.mFixedHeightMinor;
    L_0x0074:
        if (r5 == 0) goto L_0x00ac;
    L_0x0076:
        r11 = r5.type;
        if (r11 == 0) goto L_0x00ac;
    L_0x007a:
        r11 = r5.type;
        if (r11 != r7) goto L_0x0084;
    L_0x007e:
        r5 = r5.getDimension(r0);
    L_0x0082:
        r5 = (int) r5;
        goto L_0x0094;
    L_0x0084:
        r11 = r5.type;
        if (r11 != r6) goto L_0x0093;
    L_0x0088:
        r11 = r0.heightPixels;
        r11 = (float) r11;
        r12 = r0.heightPixels;
        r12 = (float) r12;
        r5 = r5.getFraction(r11, r12);
        goto L_0x0082;
    L_0x0093:
        r5 = 0;
    L_0x0094:
        if (r5 <= 0) goto L_0x00ac;
    L_0x0096:
        r11 = r13.mDecorPadding;
        r11 = r11.top;
        r12 = r13.mDecorPadding;
        r12 = r12.bottom;
        r11 = r11 + r12;
        r5 = r5 - r11;
        r15 = android.view.View.MeasureSpec.getSize(r15);
        r15 = java.lang.Math.min(r5, r15);
        r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r9);
    L_0x00ac:
        super.onMeasure(r10, r15);
        r5 = r13.getMeasuredWidth();
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9);
        if (r14 != 0) goto L_0x00f5;
    L_0x00b9:
        if (r2 != r8) goto L_0x00f5;
    L_0x00bb:
        if (r1 == 0) goto L_0x00c0;
    L_0x00bd:
        r14 = r13.mMinWidthMinor;
        goto L_0x00c2;
    L_0x00c0:
        r14 = r13.mMinWidthMajor;
    L_0x00c2:
        if (r14 == 0) goto L_0x00f5;
    L_0x00c4:
        r1 = r14.type;
        if (r1 == 0) goto L_0x00f5;
    L_0x00c8:
        r1 = r14.type;
        if (r1 != r7) goto L_0x00d2;
    L_0x00cc:
        r14 = r14.getDimension(r0);
    L_0x00d0:
        r14 = (int) r14;
        goto L_0x00e2;
    L_0x00d2:
        r1 = r14.type;
        if (r1 != r6) goto L_0x00e1;
    L_0x00d6:
        r1 = r0.widthPixels;
        r1 = (float) r1;
        r0 = r0.widthPixels;
        r0 = (float) r0;
        r14 = r14.getFraction(r1, r0);
        goto L_0x00d0;
    L_0x00e1:
        r14 = 0;
    L_0x00e2:
        if (r14 <= 0) goto L_0x00ee;
    L_0x00e4:
        r0 = r13.mDecorPadding;
        r0 = r0.left;
        r1 = r13.mDecorPadding;
        r1 = r1.right;
        r0 = r0 + r1;
        r14 = r14 - r0;
    L_0x00ee:
        if (r5 >= r14) goto L_0x00f5;
    L_0x00f0:
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9);
        goto L_0x00f6;
    L_0x00f5:
        r3 = 0;
    L_0x00f6:
        if (r3 == 0) goto L_0x00fb;
    L_0x00f8:
        super.onMeasure(r10, r15);
    L_0x00fb:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(OnAttachListener onAttachListener) {
        this.mAttachListener = onAttachListener;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.mDecorPadding.set(i, i2, i3, i4);
        if (kb.a.q(this)) {
            requestLayout();
        }
    }
}
