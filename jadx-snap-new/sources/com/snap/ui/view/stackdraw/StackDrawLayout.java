package com.snap.ui.view.stackdraw;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.stackdraw.gesture.StackDrawGestureDetector;
import com.snap.ui.view.stackdraw.gesture.StackDrawGestureListener;
import com.snap.ui.view.stackdraw.gesture.StackDrawLayoutTouchable;
import defpackage.akco;
import defpackage.akcr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StackDrawLayout extends View implements StackDrawLayoutTouchable {
    private final Rect availableBounds;
    private Integer centeredItemBoundsLeft;
    private Integer centeredItemBoundsTop;
    private final CopyOnWriteArrayList<ItemHolder> children;
    private final Integer[] debugColors;
    private final Paint debugPaint;
    private StackDrawGestureDetector gestureDetector;
    private StackDrawGestureListener gestureListener;
    private MotionEvent lastTouchEvent;
    private final ArrayList<ItemHolder> matchParentChildren;
    private final Rect selfBounds;

    public enum ConsumeSpace {
        NONE,
        HORIZONTAL,
        VERTICAL,
        FULL;

        public final boolean getConsumeHorizontal() {
            ConsumeSpace consumeSpace = this;
            return consumeSpace == HORIZONTAL || consumeSpace == FULL;
        }

        public final boolean getConsumeVertical() {
            ConsumeSpace consumeSpace = this;
            return consumeSpace == VERTICAL || consumeSpace == FULL;
        }
    }

    public static final class LayoutParams {
        public static final Companion Companion = new Companion();
        public static final int MATCH_PARENT = -1;
        public static final int WRAP_CONTENT = -2;
        private int bottomMargin;
        private ConsumeSpace consumeSpace = ConsumeSpace.FULL;
        private int endMargin;
        private int gravity;
        private int height;
        private int startMargin;
        private int topMargin;
        private int width;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(akco akco) {
                this();
            }
        }

        public LayoutParams(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        private final String toMatchStyle(int i) {
            return i == -1 ? "MATCH_PARENT" : i == -2 ? "WRAP_CONTENT" : String.valueOf(i);
        }

        public final int getBottomMargin() {
            return this.bottomMargin;
        }

        public final ConsumeSpace getConsumeSpace() {
            return this.consumeSpace;
        }

        public final int getEndMargin() {
            return this.endMargin;
        }

        public final int getGravity() {
            return this.gravity;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getStartMargin() {
            return this.startMargin;
        }

        public final int getTopMargin() {
            return this.topMargin;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setBottomMargin(int i) {
            this.bottomMargin = i;
        }

        public final void setConsumeSpace(ConsumeSpace consumeSpace) {
            akcr.b(consumeSpace, "<set-?>");
            this.consumeSpace = consumeSpace;
        }

        public final void setEndMargin(int i) {
            this.endMargin = i;
        }

        public final void setGravity(int i) {
            this.gravity = i;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setStartMargin(int i) {
            this.startMargin = i;
        }

        public final void setTopMargin(int i) {
            this.topMargin = i;
        }

        public final void setWidth(int i) {
            this.width = i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("width: ");
            stringBuilder.append(toMatchStyle(this.width));
            String str = ": ";
            stringBuilder.append(str);
            stringBuilder.append(this.width);
            stringBuilder.append(", height: ");
            stringBuilder.append(toMatchStyle(this.height));
            stringBuilder.append(str);
            stringBuilder.append(this.height);
            stringBuilder.append(' ');
            return stringBuilder.toString();
        }
    }

    public StackDrawLayout(Context context) {
        akcr.b(context, "context");
        super(context);
        this.debugPaint = null;
        this.debugColors = new Integer[0];
        this.selfBounds = new Rect(0, 0, getWidth(), getHeight());
        this.availableBounds = new Rect(0, 0, getWidth(), getHeight());
        this.children = new CopyOnWriteArrayList();
        this.matchParentChildren = new ArrayList(0);
    }

    public StackDrawLayout(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        this.debugPaint = null;
        this.debugColors = new Integer[0];
        this.selfBounds = new Rect(0, 0, getWidth(), getHeight());
        this.availableBounds = new Rect(0, 0, getWidth(), getHeight());
        this.children = new CopyOnWriteArrayList();
        this.matchParentChildren = new ArrayList(0);
    }

    public static /* synthetic */ TextHolder addText$default(StackDrawLayout stackDrawLayout, LayoutParams layoutParams, TextConfiguration textConfiguration, int i, Object obj) {
        if (obj == null) {
            TextConfiguration textConfiguration2;
            LayoutParams layoutParams2;
            StackDrawLayout stackDrawLayout2;
            if ((i & 2) != 0) {
                TextConfiguration textConfiguration3 = new TextConfiguration(0, null, null, false, 0, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 0, 1023, null);
                layoutParams2 = layoutParams;
                textConfiguration2 = textConfiguration3;
                stackDrawLayout2 = stackDrawLayout;
            } else {
                stackDrawLayout2 = stackDrawLayout;
                layoutParams2 = layoutParams;
                textConfiguration2 = textConfiguration;
            }
            return stackDrawLayout.addText(layoutParams, textConfiguration2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addText");
    }

    private final void assertLayout(List<? extends ItemHolder> list, int i, int i2) {
    }

    private final int calculateHorizontalOffset(int i, ItemHolder itemHolder) {
        int startMargin;
        if (getLayoutDirection() == 1) {
            if (i != 1) {
                return i != 3 ? i != 5 ? 0 : itemHolder.getStartMargin() : itemHolder.getEndMargin();
            } else {
                i = itemHolder.getEndMargin();
                startMargin = itemHolder.getStartMargin();
            }
        } else if (i != 1) {
            return i != 3 ? i != 5 ? 0 : itemHolder.getEndMargin() : itemHolder.getStartMargin();
        } else {
            i = itemHolder.getStartMargin();
            startMargin = itemHolder.getEndMargin();
        }
        return i - startMargin;
    }

    private final int calculateVerticalOffset(int i, ItemHolder itemHolder) {
        return i != 16 ? i != 48 ? i != 80 ? 0 : itemHolder.getBottomMargin() : itemHolder.getTopMargin() : itemHolder.getTopMargin() - itemHolder.getBottomMargin();
    }

    private final boolean isClickEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            motionEvent = this.lastTouchEvent;
            if (motionEvent != null && motionEvent.getAction() == 1) {
                return true;
            }
        }
        return false;
    }

    private final void updateBoundsByGravity(ItemHolder itemHolder, Rect rect, int i) {
        int intValue;
        Rect rect2;
        Rect rect3;
        ItemHolder itemHolder2 = itemHolder;
        Rect rect4 = rect;
        int i2 = i;
        int absoluteGravity = Gravity.getAbsoluteGravity(itemHolder.getLayoutParams().getGravity(), i2);
        int i3 = absoluteGravity & 7;
        int i4 = absoluteGravity & 112;
        int measuredWidth = itemHolder.getMeasuredWidth();
        int measuredHeight = itemHolder.getMeasuredHeight();
        Rect itemBounds = itemHolder.getItemBounds();
        Integer num = this.centeredItemBoundsLeft;
        Object obj = null;
        if (num != null) {
            intValue = num.intValue();
            if (itemHolder.getLayoutParams().getConsumeSpace().getConsumeHorizontal() && i3 == 1) {
                rect2 = new Rect(rect4);
                rect2.left = intValue;
                this.centeredItemBoundsLeft = Integer.valueOf(((intValue + itemHolder.getMeasuredWidth()) + itemHolder.getStartMargin()) + itemHolder.getEndMargin());
                Gravity.apply(Gravity.getAbsoluteGravity(i4 | 3, i2), measuredWidth, measuredHeight, rect2, calculateHorizontalOffset(i3, itemHolder2), calculateVerticalOffset(i4, itemHolder2), itemBounds);
                obj = 1;
            }
        }
        num = this.centeredItemBoundsTop;
        if (num != null) {
            intValue = num.intValue();
            if (itemHolder.getLayoutParams().getConsumeSpace().getConsumeVertical() && i4 == 16) {
                rect2 = new Rect(rect4);
                rect2.top = intValue;
                this.centeredItemBoundsTop = Integer.valueOf(((intValue + itemHolder.getMeasuredHeight()) + itemHolder.getTopMargin()) + itemHolder.getBottomMargin());
                Gravity.apply(Gravity.getAbsoluteGravity(i3 | 48, i2), measuredWidth, measuredHeight, rect2, calculateHorizontalOffset(i3, itemHolder2), calculateVerticalOffset(i4, itemHolder2), itemBounds);
                obj = 1;
            }
        }
        int i5;
        int i6;
        if (obj == null) {
            i5 = 16;
            int calculateHorizontalOffset = calculateHorizontalOffset(i3, itemHolder2);
            i6 = 1;
            rect3 = itemBounds;
            Gravity.apply(absoluteGravity, measuredWidth, measuredHeight, rect, calculateHorizontalOffset, calculateVerticalOffset(i4, itemHolder2), itemBounds);
        } else {
            rect3 = itemBounds;
            i6 = 1;
            i5 = 16;
        }
        itemHolder2.setItemBounds(rect3);
        if (itemHolder.getLayoutParams().getConsumeSpace().getConsumeHorizontal() && i3 != i6) {
            if (i3 == 3 || i3 != 5) {
                rect4.left += (measuredWidth + itemHolder.getStartMargin()) + itemHolder.getEndMargin();
            } else {
                rect4.right -= (measuredWidth + itemHolder.getStartMargin()) + itemHolder.getEndMargin();
            }
        }
        if (itemHolder.getLayoutParams().getConsumeSpace().getConsumeVertical() && i4 != i5) {
            if (i4 == 48) {
                rect4.top += (measuredHeight + itemHolder.getTopMargin()) + itemHolder.getBottomMargin();
            } else if (i4 != 80) {
                rect4.top += (measuredHeight + itemHolder.getTopMargin()) + itemHolder.getBottomMargin();
            } else {
                rect4.bottom -= (measuredHeight + itemHolder.getTopMargin()) + itemHolder.getBottomMargin();
            }
        }
    }

    public final DrawableHolder addDrawable(LayoutParams layoutParams) {
        akcr.b(layoutParams, "lp");
        DrawableHolder drawableHolder = new DrawableHolder(this, layoutParams, null, 4, null);
        this.children.add(drawableHolder);
        return drawableHolder;
    }

    public final TextHolder addText(LayoutParams layoutParams, TextConfiguration textConfiguration) {
        akcr.b(layoutParams, "lp");
        akcr.b(textConfiguration, "textConfiguration");
        TextHolder textHolder = new TextHolder(this, layoutParams, textConfiguration);
        this.children.add(textHolder);
        return textHolder;
    }

    public final Rect getAvailableBounds() {
        return this.availableBounds;
    }

    public final CopyOnWriteArrayList<ItemHolder> getChildren() {
        return this.children;
    }

    public final Integer[] getDebugColors() {
        return this.debugColors;
    }

    public final Paint getDebugPaint() {
        return this.debugPaint;
    }

    public final Rect getSelfBounds() {
        return this.selfBounds;
    }

    public void invalidateDrawable(Drawable drawable) {
        akcr.b(drawable, "drawable");
        invalidate();
    }

    public void measureChild(ItemHolder itemHolder, int i, int i2, int i3, int i4) {
        akcr.b(itemHolder, "child");
        LayoutParams layoutParams = itemHolder.getLayoutParams();
        itemHolder.measure(ViewGroup.getChildMeasureSpec(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i) - i3, MeasureSpec.getMode(i)), ((getPaddingLeft() + getPaddingRight()) + layoutParams.getStartMargin()) + layoutParams.getEndMargin(), layoutParams.getWidth()), ViewGroup.getChildMeasureSpec(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2) - i4, MeasureSpec.getMode(i2)), ((getPaddingTop() + getPaddingBottom()) + layoutParams.getTopMargin()) + layoutParams.getBottomMargin(), layoutParams.getHeight()));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x007b in {9, 16, 18, 21} preds:[]
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
    protected void onDraw(android.graphics.Canvas r7) {
        /*
        r6 = this;
        r0 = "canvas";
        defpackage.akcr.b(r7, r0);
        r0 = "";
        defpackage.in.a(r0);
        r0 = r6.debugPaint;	 Catch:{ all -> 0x0076 }
        if (r0 == 0) goto L_0x0056;	 Catch:{ all -> 0x0076 }
        r1 = r6.debugColors;	 Catch:{ all -> 0x0076 }
        r2 = r6.debugColors;	 Catch:{ all -> 0x0076 }
        r2 = r2.length;	 Catch:{ all -> 0x0076 }
        r3 = 0;	 Catch:{ all -> 0x0076 }
        r2 = r3 % r2;	 Catch:{ all -> 0x0076 }
        r1 = r1[r2];	 Catch:{ all -> 0x0076 }
        r1 = r1.intValue();	 Catch:{ all -> 0x0076 }
        r0.setColor(r1);	 Catch:{ all -> 0x0076 }
        r1 = r6.selfBounds;	 Catch:{ all -> 0x0076 }
        r7.drawRect(r1, r0);	 Catch:{ all -> 0x0076 }
        r1 = r6.children;	 Catch:{ all -> 0x0076 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0076 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0076 }
        if (r2 == 0) goto L_0x0056;	 Catch:{ all -> 0x0076 }
        r2 = r1.next();	 Catch:{ all -> 0x0076 }
        r2 = (com.snap.ui.view.stackdraw.ItemHolder) r2;	 Catch:{ all -> 0x0076 }
        r4 = r2.getVisibility();	 Catch:{ all -> 0x0076 }
        r5 = 8;	 Catch:{ all -> 0x0076 }
        if (r4 == r5) goto L_0x002a;	 Catch:{ all -> 0x0076 }
        r3 = r3 + 1;	 Catch:{ all -> 0x0076 }
        r4 = r6.debugColors;	 Catch:{ all -> 0x0076 }
        r5 = r4.length;	 Catch:{ all -> 0x0076 }
        r5 = r3 % r5;	 Catch:{ all -> 0x0076 }
        r4 = r4[r5];	 Catch:{ all -> 0x0076 }
        r4 = r4.intValue();	 Catch:{ all -> 0x0076 }
        r0.setColor(r4);	 Catch:{ all -> 0x0076 }
        r2 = r2.getItemBounds();	 Catch:{ all -> 0x0076 }
        r7.drawRect(r2, r0);	 Catch:{ all -> 0x0076 }
        goto L_0x002a;	 Catch:{ all -> 0x0076 }
        r0 = r6.children;	 Catch:{ all -> 0x0076 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0076 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0076 }
        if (r1 == 0) goto L_0x0072;	 Catch:{ all -> 0x0076 }
        r1 = r0.next();	 Catch:{ all -> 0x0076 }
        r1 = (com.snap.ui.view.stackdraw.ItemHolder) r1;	 Catch:{ all -> 0x0076 }
        r2 = r1.getVisibility();	 Catch:{ all -> 0x0076 }
        if (r2 != 0) goto L_0x005c;	 Catch:{ all -> 0x0076 }
        r1.draw(r7);	 Catch:{ all -> 0x0076 }
        goto L_0x005c;
        defpackage.in.a();
        return;
        r7 = move-exception;
        defpackage.in.a();
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.stackdraw.StackDrawLayout.onDraw(android.graphics.Canvas):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x00dd in {11, 16, 18, 20, 26, 29, 32} preds:[]
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
    protected void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
        r5 = this;
        r6 = "";
        defpackage.in.a(r6);
        r6 = r5.getLayoutDirection();	 Catch:{ all -> 0x00d8 }
        r7 = r5.children;	 Catch:{ all -> 0x00d8 }
        r7 = r7.iterator();	 Catch:{ all -> 0x00d8 }
        r8 = 0;	 Catch:{ all -> 0x00d8 }
        r9 = 0;	 Catch:{ all -> 0x00d8 }
        r10 = 0;	 Catch:{ all -> 0x00d8 }
        r0 = r7.hasNext();	 Catch:{ all -> 0x00d8 }
        r1 = 8;	 Catch:{ all -> 0x00d8 }
        if (r0 == 0) goto L_0x0074;	 Catch:{ all -> 0x00d8 }
        r0 = r7.next();	 Catch:{ all -> 0x00d8 }
        r0 = (com.snap.ui.view.stackdraw.ItemHolder) r0;	 Catch:{ all -> 0x00d8 }
        r2 = r0.getVisibility();	 Catch:{ all -> 0x00d8 }
        if (r2 == r1) goto L_0x0012;	 Catch:{ all -> 0x00d8 }
        r1 = r0.getLayoutParams();	 Catch:{ all -> 0x00d8 }
        r2 = r0.getLayoutParams();	 Catch:{ all -> 0x00d8 }
        r2 = r2.getGravity();	 Catch:{ all -> 0x00d8 }
        r2 = android.view.Gravity.getAbsoluteGravity(r2, r6);	 Catch:{ all -> 0x00d8 }
        r3 = r1.getConsumeSpace();	 Catch:{ all -> 0x00d8 }
        r3 = r3.getConsumeVertical();	 Catch:{ all -> 0x00d8 }
        if (r3 == 0) goto L_0x0055;	 Catch:{ all -> 0x00d8 }
        r3 = r2 & 112;	 Catch:{ all -> 0x00d8 }
        r4 = 16;	 Catch:{ all -> 0x00d8 }
        if (r3 != r4) goto L_0x0055;	 Catch:{ all -> 0x00d8 }
        r3 = r0.getMeasuredHeight();	 Catch:{ all -> 0x00d8 }
        r4 = r0.getTopMargin();	 Catch:{ all -> 0x00d8 }
        r3 = r3 + r4;	 Catch:{ all -> 0x00d8 }
        r4 = r0.getBottomMargin();	 Catch:{ all -> 0x00d8 }
        r3 = r3 + r4;	 Catch:{ all -> 0x00d8 }
        r9 = r9 + r3;	 Catch:{ all -> 0x00d8 }
        r1 = r1.getConsumeSpace();	 Catch:{ all -> 0x00d8 }
        r1 = r1.getConsumeHorizontal();	 Catch:{ all -> 0x00d8 }
        if (r1 == 0) goto L_0x0012;	 Catch:{ all -> 0x00d8 }
        r1 = r2 & 7;	 Catch:{ all -> 0x00d8 }
        r2 = 1;	 Catch:{ all -> 0x00d8 }
        if (r1 != r2) goto L_0x0012;	 Catch:{ all -> 0x00d8 }
        r1 = r0.getMeasuredWidth();	 Catch:{ all -> 0x00d8 }
        r2 = r0.getStartMargin();	 Catch:{ all -> 0x00d8 }
        r1 = r1 + r2;	 Catch:{ all -> 0x00d8 }
        r0 = r0.getEndMargin();	 Catch:{ all -> 0x00d8 }
        r1 = r1 + r0;	 Catch:{ all -> 0x00d8 }
        r10 = r10 + r1;	 Catch:{ all -> 0x00d8 }
        goto L_0x0012;	 Catch:{ all -> 0x00d8 }
        if (r9 <= 0) goto L_0x008d;	 Catch:{ all -> 0x00d8 }
        r7 = r5.availableBounds;	 Catch:{ all -> 0x00d8 }
        r7 = r7.top;	 Catch:{ all -> 0x00d8 }
        r0 = r5.availableBounds;	 Catch:{ all -> 0x00d8 }
        r0 = r0.bottom;	 Catch:{ all -> 0x00d8 }
        r2 = r5.availableBounds;	 Catch:{ all -> 0x00d8 }
        r2 = r2.top;	 Catch:{ all -> 0x00d8 }
        r0 = r0 - r2;	 Catch:{ all -> 0x00d8 }
        r0 = r0 - r9;	 Catch:{ all -> 0x00d8 }
        r0 = r0 / 2;	 Catch:{ all -> 0x00d8 }
        r7 = r7 + r0;	 Catch:{ all -> 0x00d8 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x00d8 }
        r5.centeredItemBoundsTop = r7;	 Catch:{ all -> 0x00d8 }
        if (r10 <= 0) goto L_0x00a6;	 Catch:{ all -> 0x00d8 }
        r7 = r5.availableBounds;	 Catch:{ all -> 0x00d8 }
        r7 = r7.left;	 Catch:{ all -> 0x00d8 }
        r9 = r5.availableBounds;	 Catch:{ all -> 0x00d8 }
        r9 = r9.right;	 Catch:{ all -> 0x00d8 }
        r0 = r5.availableBounds;	 Catch:{ all -> 0x00d8 }
        r0 = r0.left;	 Catch:{ all -> 0x00d8 }
        r9 = r9 - r0;	 Catch:{ all -> 0x00d8 }
        r9 = r9 - r10;	 Catch:{ all -> 0x00d8 }
        r9 = r9 / 2;	 Catch:{ all -> 0x00d8 }
        r7 = r7 + r9;	 Catch:{ all -> 0x00d8 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x00d8 }
        r5.centeredItemBoundsLeft = r7;	 Catch:{ all -> 0x00d8 }
        r7 = r5.children;	 Catch:{ all -> 0x00d8 }
        r7 = r7.iterator();	 Catch:{ all -> 0x00d8 }
        r9 = r7.hasNext();	 Catch:{ all -> 0x00d8 }
        if (r9 == 0) goto L_0x00cf;	 Catch:{ all -> 0x00d8 }
        r9 = r7.next();	 Catch:{ all -> 0x00d8 }
        r9 = (com.snap.ui.view.stackdraw.ItemHolder) r9;	 Catch:{ all -> 0x00d8 }
        r10 = r9.getVisibility();	 Catch:{ all -> 0x00d8 }
        if (r10 == r1) goto L_0x00ac;	 Catch:{ all -> 0x00d8 }
        r9.getBoundsChanged();	 Catch:{ all -> 0x00d8 }
        r9.setBoundsChanged(r8);	 Catch:{ all -> 0x00d8 }
        r10 = "item";	 Catch:{ all -> 0x00d8 }
        defpackage.akcr.a(r9, r10);	 Catch:{ all -> 0x00d8 }
        r10 = r5.availableBounds;	 Catch:{ all -> 0x00d8 }
        r5.updateBoundsByGravity(r9, r10, r6);	 Catch:{ all -> 0x00d8 }
        goto L_0x00ac;	 Catch:{ all -> 0x00d8 }
        r6 = 0;	 Catch:{ all -> 0x00d8 }
        r5.centeredItemBoundsLeft = r6;	 Catch:{ all -> 0x00d8 }
        r5.centeredItemBoundsTop = r6;	 Catch:{ all -> 0x00d8 }
        defpackage.in.a();
        return;
        r6 = move-exception;
        defpackage.in.a();
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.stackdraw.StackDrawLayout.onLayout(boolean, int, int, int, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:56:0x01d6 in {6, 7, 8, 16, 19, 20, 27, 28, 32, 33, 34, 35, 36, 42, 44, 47, 48, 50, 52, 55} preds:[]
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
    protected void onMeasure(int r18, int r19) {
        /*
        r17 = this;
        r7 = r17;
        r0 = r18;
        r8 = r19;
        r1 = "";
        defpackage.in.a(r1);
        r1 = r7.children;	 Catch:{ all -> 0x01d1 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x01d1 }
        r7.assertLayout(r1, r0, r8);	 Catch:{ all -> 0x01d1 }
        r1 = android.view.View.MeasureSpec.getMode(r18);	 Catch:{ all -> 0x01d1 }
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x01d1 }
        if (r1 != r9) goto L_0x0023;	 Catch:{ all -> 0x01d1 }
        r1 = android.view.View.MeasureSpec.getMode(r19);	 Catch:{ all -> 0x01d1 }
        if (r1 == r9) goto L_0x0021;	 Catch:{ all -> 0x01d1 }
        goto L_0x0023;	 Catch:{ all -> 0x01d1 }
        r11 = 0;	 Catch:{ all -> 0x01d1 }
        goto L_0x0025;	 Catch:{ all -> 0x01d1 }
        r1 = 1;	 Catch:{ all -> 0x01d1 }
        r11 = 1;	 Catch:{ all -> 0x01d1 }
        r1 = r7.matchParentChildren;	 Catch:{ all -> 0x01d1 }
        r1.clear();	 Catch:{ all -> 0x01d1 }
        r1 = r7.children;	 Catch:{ all -> 0x01d1 }
        r12 = r1.iterator();	 Catch:{ all -> 0x01d1 }
        r5 = 0;	 Catch:{ all -> 0x01d1 }
        r6 = 0;	 Catch:{ all -> 0x01d1 }
        r13 = 0;	 Catch:{ all -> 0x01d1 }
        r14 = 0;	 Catch:{ all -> 0x01d1 }
        r15 = 0;	 Catch:{ all -> 0x01d1 }
        r1 = r12.hasNext();	 Catch:{ all -> 0x01d1 }
        r4 = -1;	 Catch:{ all -> 0x01d1 }
        if (r1 == 0) goto L_0x00f4;	 Catch:{ all -> 0x01d1 }
        r1 = r12.next();	 Catch:{ all -> 0x01d1 }
        r3 = r1;	 Catch:{ all -> 0x01d1 }
        r3 = (com.snap.ui.view.stackdraw.ItemHolder) r3;	 Catch:{ all -> 0x01d1 }
        r1 = r3.getVisibility();	 Catch:{ all -> 0x01d1 }
        r2 = 8;	 Catch:{ all -> 0x01d1 }
        if (r1 == r2) goto L_0x00ee;	 Catch:{ all -> 0x01d1 }
        r1 = "child";	 Catch:{ all -> 0x01d1 }
        defpackage.akcr.a(r3, r1);	 Catch:{ all -> 0x01d1 }
        r1 = r17;	 Catch:{ all -> 0x01d1 }
        r2 = r3;	 Catch:{ all -> 0x01d1 }
        r16 = r3;	 Catch:{ all -> 0x01d1 }
        r3 = r18;	 Catch:{ all -> 0x01d1 }
        r10 = -1;	 Catch:{ all -> 0x01d1 }
        r4 = r19;	 Catch:{ all -> 0x01d1 }
        r9 = r5;	 Catch:{ all -> 0x01d1 }
        r5 = r15;	 Catch:{ all -> 0x01d1 }
        r10 = r6;	 Catch:{ all -> 0x01d1 }
        r6 = r13;	 Catch:{ all -> 0x01d1 }
        r1.measureChild(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x01d1 }
        r1 = r16.getLayoutParams();	 Catch:{ all -> 0x01d1 }
        r2 = r1.getConsumeSpace();	 Catch:{ all -> 0x01d1 }
        r2 = r2.getConsumeHorizontal();	 Catch:{ all -> 0x01d1 }
        if (r2 == 0) goto L_0x0090;	 Catch:{ all -> 0x01d1 }
        r2 = r16.getMeasuredWidth();	 Catch:{ all -> 0x01d1 }
        r3 = r1.getStartMargin();	 Catch:{ all -> 0x01d1 }
        r2 = r2 + r3;	 Catch:{ all -> 0x01d1 }
        r3 = r1.getEndMargin();	 Catch:{ all -> 0x01d1 }
        r2 = r2 + r3;	 Catch:{ all -> 0x01d1 }
        r15 = r15 + r2;	 Catch:{ all -> 0x01d1 }
        r2 = r16.getMeasuredHeight();	 Catch:{ all -> 0x01d1 }
        r3 = r1.getTopMargin();	 Catch:{ all -> 0x01d1 }
        r2 = r2 + r3;	 Catch:{ all -> 0x01d1 }
        r3 = r1.getBottomMargin();	 Catch:{ all -> 0x01d1 }
        r2 = r2 + r3;	 Catch:{ all -> 0x01d1 }
        r14 = java.lang.Math.max(r14, r2);	 Catch:{ all -> 0x01d1 }
        r2 = r1.getConsumeSpace();	 Catch:{ all -> 0x01d1 }
        r2 = r2.getConsumeVertical();	 Catch:{ all -> 0x01d1 }
        if (r2 == 0) goto L_0x00bc;	 Catch:{ all -> 0x01d1 }
        r2 = r16.getMeasuredHeight();	 Catch:{ all -> 0x01d1 }
        r3 = r1.getTopMargin();	 Catch:{ all -> 0x01d1 }
        r2 = r2 + r3;	 Catch:{ all -> 0x01d1 }
        r3 = r1.getBottomMargin();	 Catch:{ all -> 0x01d1 }
        r2 = r2 + r3;	 Catch:{ all -> 0x01d1 }
        r13 = r13 + r2;	 Catch:{ all -> 0x01d1 }
        r2 = r16.getMeasuredWidth();	 Catch:{ all -> 0x01d1 }
        r3 = r1.getStartMargin();	 Catch:{ all -> 0x01d1 }
        r2 = r2 + r3;	 Catch:{ all -> 0x01d1 }
        r3 = r1.getEndMargin();	 Catch:{ all -> 0x01d1 }
        r2 = r2 + r3;	 Catch:{ all -> 0x01d1 }
        r6 = java.lang.Math.max(r10, r2);	 Catch:{ all -> 0x01d1 }
        goto L_0x00bd;	 Catch:{ all -> 0x01d1 }
        r6 = r10;	 Catch:{ all -> 0x01d1 }
        r2 = r16.getMeasuredState();	 Catch:{ all -> 0x01d1 }
        r2 = android.view.View.combineMeasuredStates(r9, r2);	 Catch:{ all -> 0x01d1 }
        if (r11 == 0) goto L_0x00ec;	 Catch:{ all -> 0x01d1 }
        r3 = r1.getWidth();	 Catch:{ all -> 0x01d1 }
        r4 = -1;	 Catch:{ all -> 0x01d1 }
        if (r3 != r4) goto L_0x00d7;	 Catch:{ all -> 0x01d1 }
        r3 = android.view.View.MeasureSpec.getMode(r18);	 Catch:{ all -> 0x01d1 }
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x01d1 }
        if (r3 != r5) goto L_0x00e5;	 Catch:{ all -> 0x01d1 }
        goto L_0x00d9;	 Catch:{ all -> 0x01d1 }
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x01d1 }
        r1 = r1.getHeight();	 Catch:{ all -> 0x01d1 }
        if (r1 != r4) goto L_0x00ec;	 Catch:{ all -> 0x01d1 }
        r1 = android.view.View.MeasureSpec.getMode(r19);	 Catch:{ all -> 0x01d1 }
        if (r1 == r5) goto L_0x00ec;	 Catch:{ all -> 0x01d1 }
        r1 = r7.matchParentChildren;	 Catch:{ all -> 0x01d1 }
        r3 = r16;	 Catch:{ all -> 0x01d1 }
        r1.add(r3);	 Catch:{ all -> 0x01d1 }
        r5 = r2;	 Catch:{ all -> 0x01d1 }
        goto L_0x00f0;	 Catch:{ all -> 0x01d1 }
        r9 = r5;	 Catch:{ all -> 0x01d1 }
        r10 = r6;	 Catch:{ all -> 0x01d1 }
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x01d1 }
        goto L_0x0035;	 Catch:{ all -> 0x01d1 }
        r9 = r5;	 Catch:{ all -> 0x01d1 }
        r10 = r6;	 Catch:{ all -> 0x01d1 }
        r14 = r14 + r13;	 Catch:{ all -> 0x01d1 }
        r6 = r15 + r10;	 Catch:{ all -> 0x01d1 }
        r1 = r17.getPaddingTop();	 Catch:{ all -> 0x01d1 }
        r2 = r17.getPaddingBottom();	 Catch:{ all -> 0x01d1 }
        r1 = r1 + r2;	 Catch:{ all -> 0x01d1 }
        r14 = r14 + r1;	 Catch:{ all -> 0x01d1 }
        r1 = r17.getPaddingLeft();	 Catch:{ all -> 0x01d1 }
        r2 = r17.getPaddingRight();	 Catch:{ all -> 0x01d1 }
        r1 = r1 + r2;	 Catch:{ all -> 0x01d1 }
        r6 = r6 + r1;	 Catch:{ all -> 0x01d1 }
        r1 = r17.getSuggestedMinimumHeight();	 Catch:{ all -> 0x01d1 }
        r1 = java.lang.Math.max(r14, r1);	 Catch:{ all -> 0x01d1 }
        r2 = r17.getSuggestedMinimumWidth();	 Catch:{ all -> 0x01d1 }
        r2 = java.lang.Math.max(r6, r2);	 Catch:{ all -> 0x01d1 }
        r0 = android.view.View.resolveSizeAndState(r2, r0, r9);	 Catch:{ all -> 0x01d1 }
        r2 = r9 << 16;	 Catch:{ all -> 0x01d1 }
        r1 = android.view.View.resolveSizeAndState(r1, r8, r2);	 Catch:{ all -> 0x01d1 }
        r7.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x01d1 }
        r0 = r7.availableBounds;	 Catch:{ all -> 0x01d1 }
        r1 = r17.getMeasuredWidth();	 Catch:{ all -> 0x01d1 }
        r2 = r17.getMeasuredHeight();	 Catch:{ all -> 0x01d1 }
        r3 = 0;	 Catch:{ all -> 0x01d1 }
        r0.set(r3, r3, r1, r2);	 Catch:{ all -> 0x01d1 }
        r0 = r7.selfBounds;	 Catch:{ all -> 0x01d1 }
        r1 = r17.getMeasuredWidth();	 Catch:{ all -> 0x01d1 }
        r2 = r17.getMeasuredHeight();	 Catch:{ all -> 0x01d1 }
        r0.set(r3, r3, r1, r2);	 Catch:{ all -> 0x01d1 }
        r0 = r7.matchParentChildren;	 Catch:{ all -> 0x01d1 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x01d1 }
        r0 = r0.iterator();	 Catch:{ all -> 0x01d1 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x01d1 }
        if (r1 == 0) goto L_0x01cd;	 Catch:{ all -> 0x01d1 }
        r1 = r0.next();	 Catch:{ all -> 0x01d1 }
        r1 = (com.snap.ui.view.stackdraw.ItemHolder) r1;	 Catch:{ all -> 0x01d1 }
        r2 = r1.getLayoutParams();	 Catch:{ all -> 0x01d1 }
        r3 = r2.getWidth();	 Catch:{ all -> 0x01d1 }
        r4 = -1;	 Catch:{ all -> 0x01d1 }
        if (r3 != r4) goto L_0x0189;	 Catch:{ all -> 0x01d1 }
        r3 = r17.getMeasuredWidth();	 Catch:{ all -> 0x01d1 }
        r3 = r3 - r15;	 Catch:{ all -> 0x01d1 }
        r4 = r17.getPaddingLeft();	 Catch:{ all -> 0x01d1 }
        r3 = r3 - r4;	 Catch:{ all -> 0x01d1 }
        r4 = r17.getPaddingRight();	 Catch:{ all -> 0x01d1 }
        r3 = r3 - r4;	 Catch:{ all -> 0x01d1 }
        r4 = r2.getStartMargin();	 Catch:{ all -> 0x01d1 }
        r3 = r3 - r4;	 Catch:{ all -> 0x01d1 }
        r4 = r2.getEndMargin();	 Catch:{ all -> 0x01d1 }
        r3 = r3 - r4;	 Catch:{ all -> 0x01d1 }
        r4 = 0;	 Catch:{ all -> 0x01d1 }
        r3 = java.lang.Math.max(r4, r3);	 Catch:{ all -> 0x01d1 }
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x01d1 }
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4);	 Catch:{ all -> 0x01d1 }
        goto L_0x0190;	 Catch:{ all -> 0x01d1 }
        r3 = r1.getMeasuredWidth();	 Catch:{ all -> 0x01d1 }
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x01d1 }
        goto L_0x0184;	 Catch:{ all -> 0x01d1 }
        r4 = r2.getHeight();	 Catch:{ all -> 0x01d1 }
        r5 = -1;	 Catch:{ all -> 0x01d1 }
        if (r4 != r5) goto L_0x01be;	 Catch:{ all -> 0x01d1 }
        r4 = r17.getMeasuredHeight();	 Catch:{ all -> 0x01d1 }
        r4 = r4 - r13;	 Catch:{ all -> 0x01d1 }
        r6 = r17.getPaddingTop();	 Catch:{ all -> 0x01d1 }
        r4 = r4 - r6;	 Catch:{ all -> 0x01d1 }
        r6 = r17.getPaddingBottom();	 Catch:{ all -> 0x01d1 }
        r4 = r4 - r6;	 Catch:{ all -> 0x01d1 }
        r6 = r2.getTopMargin();	 Catch:{ all -> 0x01d1 }
        r4 = r4 - r6;	 Catch:{ all -> 0x01d1 }
        r2 = r2.getBottomMargin();	 Catch:{ all -> 0x01d1 }
        r4 = r4 - r2;	 Catch:{ all -> 0x01d1 }
        r2 = 0;	 Catch:{ all -> 0x01d1 }
        r4 = java.lang.Math.max(r2, r4);	 Catch:{ all -> 0x01d1 }
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x01d1 }
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6);	 Catch:{ all -> 0x01d1 }
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x01d1 }
        goto L_0x01c9;	 Catch:{ all -> 0x01d1 }
        r2 = 0;	 Catch:{ all -> 0x01d1 }
        r4 = r1.getMeasuredHeight();	 Catch:{ all -> 0x01d1 }
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x01d1 }
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6);	 Catch:{ all -> 0x01d1 }
        r1.measure(r3, r4);	 Catch:{ all -> 0x01d1 }
        goto L_0x014d;
        defpackage.in.a();
        return;
        r0 = move-exception;
        defpackage.in.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.stackdraw.StackDrawLayout.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || this.gestureDetector == null) {
            return super.onTouchEvent(motionEvent);
        }
        StackDrawGestureDetector stackDrawGestureDetector;
        MotionEvent motionEvent2 = this.lastTouchEvent;
        this.lastTouchEvent = motionEvent;
        Iterator it = this.children.iterator();
        while (it.hasNext()) {
            Object obj = (ItemHolder) it.next();
            if (obj.getItemBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                if (isClickEvent(motionEvent2)) {
                    performClick();
                }
                stackDrawGestureDetector = this.gestureDetector;
                if (stackDrawGestureDetector == null) {
                    return true;
                }
                akcr.a(obj, "child");
                return stackDrawGestureDetector.onTouchEvent(motionEvent, (StackDrawLayoutTouchable) obj);
            }
        }
        if (isClickEvent(motionEvent2)) {
            performClick();
        }
        stackDrawGestureDetector = this.gestureDetector;
        return stackDrawGestureDetector != null ? stackDrawGestureDetector.onTouchEvent(motionEvent, this) : true;
    }

    public boolean performClick() {
        return super.performClick();
    }

    public final void setGestureListener(StackDrawGestureListener stackDrawGestureListener) {
        akcr.b(stackDrawGestureListener, "stackDrawGestureListener");
        if (this.gestureListener != stackDrawGestureListener) {
            StackDrawGestureDetector stackDrawGestureDetector;
            this.gestureListener = stackDrawGestureListener;
            if (this.gestureListener != null) {
                Object context = getContext();
                akcr.a(context, "context");
                stackDrawGestureDetector = new StackDrawGestureDetector(context, new StackDrawLayout$setGestureListener$1(this));
            } else {
                stackDrawGestureDetector = null;
            }
            this.gestureDetector = stackDrawGestureDetector;
        }
    }
}
