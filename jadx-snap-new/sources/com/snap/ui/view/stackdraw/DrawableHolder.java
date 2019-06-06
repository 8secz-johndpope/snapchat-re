package com.snap.ui.view.stackdraw;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import com.snap.ui.view.stackdraw.StackDrawLayout.LayoutParams;
import defpackage.akco;
import defpackage.akcr;

public final class DrawableHolder extends ItemHolder {
    public static final Companion Companion = new Companion();
    private static final boolean compatAdjustViewBounds = false;
    private boolean adjustViewBounds;
    private Drawable drawable;
    private int drawableHeight;
    private int drawableWidth;
    private Rect itemBounds;
    private final int maxHeight;
    private final int maxWidth;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final boolean getCompatAdjustViewBounds() {
            return DrawableHolder.compatAdjustViewBounds;
        }
    }

    public DrawableHolder(StackDrawLayout stackDrawLayout, LayoutParams layoutParams, Drawable drawable) {
        akcr.b(stackDrawLayout, "container");
        akcr.b(layoutParams, "lp");
        super(stackDrawLayout, layoutParams);
        this.itemBounds = super.getItemBounds();
        this.maxWidth = Integer.MAX_VALUE;
        this.maxHeight = Integer.MAX_VALUE;
        this.drawable = drawable;
    }

    public /* synthetic */ DrawableHolder(StackDrawLayout stackDrawLayout, LayoutParams layoutParams, Drawable drawable, int i, akco akco) {
        if ((i & 4) != 0) {
            drawable = null;
        }
        this(stackDrawLayout, layoutParams, drawable);
    }

    private final int resolveAdjustedSize(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i3);
        i3 = MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            i = Math.min(i, i3);
        } else if (mode != 0) {
            return mode != AudioPlayer.INFINITY_LOOP_COUNT ? i : i3;
        }
        return Math.min(i, i2);
    }

    public final void draw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        canvas.save();
        canvas.translate((float) getItemBounds().left, (float) getItemBounds().top);
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean getAdjustViewBounds() {
        return this.adjustViewBounds;
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final int getDrawableHeight() {
        return this.drawableHeight;
    }

    public final int getDrawableWidth() {
        return this.drawableWidth;
    }

    public final Rect getItemBounds() {
        return this.itemBounds;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingLeft() {
        return this.paddingLeft;
    }

    public final int getPaddingRight() {
        return this.paddingRight;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public final int getSuggestedMinimumHeight() {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getIntrinsicHeight() : 0;
    }

    public final int getSuggestedMinimumWidth() {
        Drawable drawable = this.drawable;
        return drawable != null ? drawable.getIntrinsicWidth() : 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:63:0x00e7 in {4, 5, 8, 9, 12, 13, 15, 17, 22, 23, 25, 26, 27, 28, 32, 33, 43, 45, 46, 53, 54, 56, 57, 58, 60, 62} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void onMeasure(int r20, int r21) {
        /*
        r19 = this;
        r1 = r19;
        r0 = r20;
        r2 = r21;
        r3 = android.view.View.MeasureSpec.getMode(r20);	 Catch:{ all -> 0x00e5 }
        r4 = android.view.View.MeasureSpec.getMode(r21);	 Catch:{ all -> 0x00e5 }
        r5 = r1.drawable;	 Catch:{ all -> 0x00e5 }
        r6 = 0;	 Catch:{ all -> 0x00e5 }
        r8 = 0;	 Catch:{ all -> 0x00e5 }
        if (r5 != 0) goto L_0x001f;	 Catch:{ all -> 0x00e5 }
        r3 = -1;	 Catch:{ all -> 0x00e5 }
        r1.drawableWidth = r3;	 Catch:{ all -> 0x00e5 }
        r1.drawableHeight = r3;	 Catch:{ all -> 0x00e5 }
        r3 = 0;	 Catch:{ all -> 0x00e5 }
        r4 = 0;	 Catch:{ all -> 0x00e5 }
        r5 = 0;	 Catch:{ all -> 0x00e5 }
        r9 = 0;	 Catch:{ all -> 0x00e5 }
        r10 = 0;	 Catch:{ all -> 0x00e5 }
        goto L_0x0050;	 Catch:{ all -> 0x00e5 }
        r5 = r1.drawable;	 Catch:{ all -> 0x00e5 }
        if (r5 == 0) goto L_0x0028;	 Catch:{ all -> 0x00e5 }
        r5 = r5.getIntrinsicWidth();	 Catch:{ all -> 0x00e5 }
        goto L_0x0029;	 Catch:{ all -> 0x00e5 }
        r5 = 0;	 Catch:{ all -> 0x00e5 }
        r9 = r1.drawable;	 Catch:{ all -> 0x00e5 }
        if (r9 == 0) goto L_0x0032;	 Catch:{ all -> 0x00e5 }
        r9 = r9.getIntrinsicHeight();	 Catch:{ all -> 0x00e5 }
        goto L_0x0033;	 Catch:{ all -> 0x00e5 }
        r9 = 0;	 Catch:{ all -> 0x00e5 }
        if (r5 > 0) goto L_0x0036;	 Catch:{ all -> 0x00e5 }
        r5 = 1;	 Catch:{ all -> 0x00e5 }
        if (r9 > 0) goto L_0x0039;	 Catch:{ all -> 0x00e5 }
        r9 = 1;	 Catch:{ all -> 0x00e5 }
        r10 = r1.adjustViewBounds;	 Catch:{ all -> 0x00e5 }
        if (r10 == 0) goto L_0x004d;	 Catch:{ all -> 0x00e5 }
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x00e5 }
        if (r3 == r10) goto L_0x0043;	 Catch:{ all -> 0x00e5 }
        r3 = 1;	 Catch:{ all -> 0x00e5 }
        goto L_0x0044;	 Catch:{ all -> 0x00e5 }
        r3 = 0;	 Catch:{ all -> 0x00e5 }
        if (r4 == r10) goto L_0x0048;	 Catch:{ all -> 0x00e5 }
        r4 = 1;	 Catch:{ all -> 0x00e5 }
        goto L_0x0049;	 Catch:{ all -> 0x00e5 }
        r4 = 0;	 Catch:{ all -> 0x00e5 }
        r10 = (float) r5;	 Catch:{ all -> 0x00e5 }
        r11 = (float) r9;	 Catch:{ all -> 0x00e5 }
        r10 = r10 / r11;	 Catch:{ all -> 0x00e5 }
        goto L_0x0050;	 Catch:{ all -> 0x00e5 }
        r3 = 0;	 Catch:{ all -> 0x00e5 }
        r4 = 0;	 Catch:{ all -> 0x00e5 }
        goto L_0x001d;	 Catch:{ all -> 0x00e5 }
        r11 = r1.paddingLeft;	 Catch:{ all -> 0x00e5 }
        r12 = r1.paddingRight;	 Catch:{ all -> 0x00e5 }
        r13 = r1.paddingTop;	 Catch:{ all -> 0x00e5 }
        r14 = r1.paddingBottom;	 Catch:{ all -> 0x00e5 }
        if (r3 != 0) goto L_0x007a;	 Catch:{ all -> 0x00e5 }
        if (r4 == 0) goto L_0x005d;	 Catch:{ all -> 0x00e5 }
        goto L_0x007a;	 Catch:{ all -> 0x00e5 }
        r11 = r11 + r12;	 Catch:{ all -> 0x00e5 }
        r5 = r5 + r11;	 Catch:{ all -> 0x00e5 }
        r13 = r13 + r14;	 Catch:{ all -> 0x00e5 }
        r9 = r9 + r13;	 Catch:{ all -> 0x00e5 }
        r3 = r19.getSuggestedMinimumWidth();	 Catch:{ all -> 0x00e5 }
        r3 = java.lang.Math.max(r5, r3);	 Catch:{ all -> 0x00e5 }
        r4 = r19.getSuggestedMinimumHeight();	 Catch:{ all -> 0x00e5 }
        r4 = java.lang.Math.max(r9, r4);	 Catch:{ all -> 0x00e5 }
        r0 = android.view.View.resolveSizeAndState(r3, r0, r8);	 Catch:{ all -> 0x00e5 }
        r2 = android.view.View.resolveSizeAndState(r4, r2, r8);	 Catch:{ all -> 0x00e5 }
        goto L_0x00e1;	 Catch:{ all -> 0x00e5 }
        r5 = r5 + r11;	 Catch:{ all -> 0x00e5 }
        r5 = r5 + r12;	 Catch:{ all -> 0x00e5 }
        r15 = r1.maxWidth;	 Catch:{ all -> 0x00e5 }
        r5 = r1.resolveAdjustedSize(r5, r15, r0);	 Catch:{ all -> 0x00e5 }
        r9 = r9 + r13;	 Catch:{ all -> 0x00e5 }
        r9 = r9 + r14;	 Catch:{ all -> 0x00e5 }
        r15 = r1.maxHeight;	 Catch:{ all -> 0x00e5 }
        r9 = r1.resolveAdjustedSize(r9, r15, r2);	 Catch:{ all -> 0x00e5 }
        r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));	 Catch:{ all -> 0x00e5 }
        if (r6 == 0) goto L_0x00df;	 Catch:{ all -> 0x00e5 }
        r6 = r5 - r11;	 Catch:{ all -> 0x00e5 }
        r6 = r6 - r12;	 Catch:{ all -> 0x00e5 }
        r6 = (float) r6;	 Catch:{ all -> 0x00e5 }
        r15 = r9 - r13;	 Catch:{ all -> 0x00e5 }
        r15 = r15 - r14;	 Catch:{ all -> 0x00e5 }
        r15 = (float) r15;	 Catch:{ all -> 0x00e5 }
        r6 = r6 / r15;	 Catch:{ all -> 0x00e5 }
        r6 = r6 - r10;	 Catch:{ all -> 0x00e5 }
        r6 = java.lang.Math.abs(r6);	 Catch:{ all -> 0x00e5 }
        r7 = (double) r6;	 Catch:{ all -> 0x00e5 }
        r17 = 4502148214488346440; // 0x3e7ad7f29abcaf48 float:-7.803816E-23 double:1.0E-7;	 Catch:{ all -> 0x00e5 }
        r6 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1));	 Catch:{ all -> 0x00e5 }
        if (r6 <= 0) goto L_0x00df;	 Catch:{ all -> 0x00e5 }
        if (r3 == 0) goto L_0x00be;	 Catch:{ all -> 0x00e5 }
        r15 = r15 * r10;	 Catch:{ all -> 0x00e5 }
        r6 = (int) r15;	 Catch:{ all -> 0x00e5 }
        r6 = r6 + r11;	 Catch:{ all -> 0x00e5 }
        r6 = r6 + r12;	 Catch:{ all -> 0x00e5 }
        if (r4 != 0) goto L_0x00b8;	 Catch:{ all -> 0x00e5 }
        r7 = compatAdjustViewBounds;	 Catch:{ all -> 0x00e5 }
        if (r7 != 0) goto L_0x00b8;	 Catch:{ all -> 0x00e5 }
        r5 = r1.maxWidth;	 Catch:{ all -> 0x00e5 }
        r5 = r1.resolveAdjustedSize(r6, r5, r0);	 Catch:{ all -> 0x00e5 }
        if (r6 > r5) goto L_0x00be;	 Catch:{ all -> 0x00e5 }
        r0 = r6;	 Catch:{ all -> 0x00e5 }
        r16 = 1;	 Catch:{ all -> 0x00e5 }
        goto L_0x00c1;	 Catch:{ all -> 0x00e5 }
        r0 = r5;	 Catch:{ all -> 0x00e5 }
        r16 = 0;	 Catch:{ all -> 0x00e5 }
        if (r16 != 0) goto L_0x00e0;	 Catch:{ all -> 0x00e5 }
        if (r4 == 0) goto L_0x00e0;	 Catch:{ all -> 0x00e5 }
        r4 = r0 - r11;	 Catch:{ all -> 0x00e5 }
        r4 = r4 - r12;	 Catch:{ all -> 0x00e5 }
        r4 = (float) r4;	 Catch:{ all -> 0x00e5 }
        r4 = r4 / r10;	 Catch:{ all -> 0x00e5 }
        r4 = (int) r4;	 Catch:{ all -> 0x00e5 }
        r4 = r4 + r13;	 Catch:{ all -> 0x00e5 }
        r4 = r4 + r14;	 Catch:{ all -> 0x00e5 }
        if (r3 != 0) goto L_0x00da;	 Catch:{ all -> 0x00e5 }
        r3 = compatAdjustViewBounds;	 Catch:{ all -> 0x00e5 }
        if (r3 != 0) goto L_0x00da;	 Catch:{ all -> 0x00e5 }
        r3 = r1.maxHeight;	 Catch:{ all -> 0x00e5 }
        r2 = r1.resolveAdjustedSize(r4, r3, r2);	 Catch:{ all -> 0x00e5 }
        goto L_0x00db;	 Catch:{ all -> 0x00e5 }
        r2 = r9;	 Catch:{ all -> 0x00e5 }
        if (r4 > r2) goto L_0x00e1;	 Catch:{ all -> 0x00e5 }
        r2 = r4;	 Catch:{ all -> 0x00e5 }
        goto L_0x00e1;	 Catch:{ all -> 0x00e5 }
        r0 = r5;	 Catch:{ all -> 0x00e5 }
        r2 = r9;	 Catch:{ all -> 0x00e5 }
        r1.setMeasuredDimension(r0, r2);	 Catch:{ all -> 0x00e5 }
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.stackdraw.DrawableHolder.onMeasure(int, int):void");
    }

    public final void setAdjustViewBounds(boolean z) {
        this.adjustViewBounds = z;
    }

    public final void setDrawable(Drawable drawable) {
        this.drawable = drawable;
        if (drawable != null) {
            drawable.setBounds(new Rect(0, 0, getItemBounds().right - getItemBounds().left, getItemBounds().bottom - getItemBounds().top));
            drawable.setCallback(getContainer());
        }
        invalidate();
    }

    public final void setDrawableHeight(int i) {
        this.drawableHeight = i;
    }

    public final void setDrawableWidth(int i) {
        this.drawableWidth = i;
    }

    public final void setItemBounds(Rect rect) {
        akcr.b(rect, "value");
        this.itemBounds = rect;
        Drawable drawable = this.drawable;
        if (drawable != null) {
            drawable.setBounds(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top));
        }
    }

    public final void setPaddingBottom(int i) {
        this.paddingBottom = i;
    }

    public final void setPaddingLeft(int i) {
        this.paddingLeft = i;
    }

    public final void setPaddingRight(int i) {
        this.paddingRight = i;
    }

    public final void setPaddingTop(int i) {
        this.paddingTop = i;
    }

    public final void setSuggestedMinimumHeight(int i) {
    }

    public final void setSuggestedMinimumWidth(int i) {
    }
}
