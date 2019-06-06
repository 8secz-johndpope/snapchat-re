package com.snap.composer.views;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.OverScroller;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.nodes.ComposerViewNode;
import com.snap.composer.views.touches.ComposerGestureRecognizerState;
import com.snap.composer.views.touches.DragGestureRecognizer;
import com.snap.composer.views.touches.DragGestureRecognizerListener;
import com.snap.composer.views.touches.ScrollViewDragGestureRecognizer;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akdp;

public final class ComposerScrollView extends ComposerView implements ComposerScrollableView, CustomChildViewAppender, DragGestureRecognizerListener, Runnable {
    public static final Companion Companion = new Companion();
    private final float a;
    private PageChangedListener b;
    private ScrollChangeListener c;
    private boolean d;
    private final ComposerScrollViewContentView e;
    private int f;
    private int g;
    private boolean h;
    private boolean i = true;
    private boolean j;
    private boolean k;
    private final OverScroller l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private final ScrollViewDragGestureRecognizer q;
    private final EdgeEffectWrapper r;
    private final EdgeEffectWrapper s;
    private final EdgeEffectWrapper t;
    private final EdgeEffectWrapper u;
    private int v;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public interface PageChangedListener {
        void onPageChanged(ComposerScrollView composerScrollView, int i);
    }

    public interface ScrollChangeListener {
        void onScrollChange(int i, int i2);

        void onScrollEnd(int i);
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerGestureRecognizerState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ComposerGestureRecognizerState.BEGAN.ordinal()] = 1;
            $EnumSwitchMapping$0[ComposerGestureRecognizerState.CHANGED.ordinal()] = 2;
            $EnumSwitchMapping$0[ComposerGestureRecognizerState.ENDED.ordinal()] = 3;
        }
    }

    public ComposerScrollView(Context context) {
        akcr.b(context, "context");
        super(context);
        Object resources = context.getResources();
        akcr.a(resources, "context.resources");
        this.a = resources.getDisplayMetrics().density * 700.0f;
        this.e = new ComposerScrollViewContentView(context);
        this.l = new OverScroller(context);
        this.r = new EdgeEffectWrapper(context, Edge.LEFT);
        this.s = new EdgeEffectWrapper(context, Edge.TOP);
        this.t = new EdgeEffectWrapper(context, Edge.RIGHT);
        this.u = new EdgeEffectWrapper(context, Edge.BOTTOM);
        addView(this.e);
        View view = this;
        this.q = new ScrollViewDragGestureRecognizer(view, this);
        ViewUtils.INSTANCE.addGestureRecognizer(view, this.q);
        setHorizontalScrollBarEnabled(true);
        setVerticalScrollBarEnabled(true);
        setScrollbarFadingEnabled(true);
        a();
    }

    private static int a(int i, int i2) {
        return Math.max(Math.min(i, i2), 0);
    }

    private final void a() {
        int i = (this.i || isHorizontalScrollBarEnabled() || isVerticalScrollBarEnabled()) ? 1 : 0;
        if (willNotDraw() != (i ^ 1)) {
            setWillNotDraw(i ^ 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    private final void a(int r8, int r9, int r10, int r11) {
        /*
        r7 = this;
        r0 = r7.h;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        r0 = r7.m;
        r0 = r0 - r8;
        goto L_0x000a;
    L_0x0008:
        r0 = r7.m;
    L_0x000a:
        r8 = r7.h;
        if (r8 != 0) goto L_0x0012;
    L_0x000e:
        r8 = r7.n;
        r8 = r8 - r9;
        goto L_0x0014;
    L_0x0012:
        r8 = r7.n;
    L_0x0014:
        r9 = r7.c();
        r9 = a(r0, r9);
        r1 = r7.d();
        r1 = a(r8, r1);
        r2 = r7.i;
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x009d;
    L_0x002a:
        r0 = r0 - r9;
        r8 = r8 - r1;
        if (r0 == 0) goto L_0x0051;
    L_0x002e:
        r2 = r7.k;
        if (r2 != 0) goto L_0x003b;
    L_0x0032:
        r2 = r7.canScrollHorizontally(r4);
        if (r2 == 0) goto L_0x0039;
    L_0x0038:
        goto L_0x003b;
    L_0x0039:
        r2 = 0;
        goto L_0x003c;
    L_0x003b:
        r2 = 1;
    L_0x003c:
        if (r2 == 0) goto L_0x0051;
    L_0x003e:
        if (r0 <= 0) goto L_0x0043;
    L_0x0040:
        r2 = r7.t;
        goto L_0x0045;
    L_0x0043:
        r2 = r7.r;
    L_0x0045:
        r5 = r7.getWidth();
        r6 = r7.getHeight();
        a(r2, r0, r5, r6, r11);
        goto L_0x0064;
    L_0x0051:
        r11 = r7.r;
        r11 = a(r11);
        if (r11 != 0) goto L_0x0064;
    L_0x0059:
        r11 = r7.t;
        r11 = a(r11);
        if (r11 == 0) goto L_0x0062;
    L_0x0061:
        goto L_0x0064;
    L_0x0062:
        r11 = 0;
        goto L_0x0065;
    L_0x0064:
        r11 = 1;
    L_0x0065:
        if (r8 == 0) goto L_0x008a;
    L_0x0067:
        r0 = r7.j;
        if (r0 != 0) goto L_0x0074;
    L_0x006b:
        r0 = r7.canScrollVertically(r4);
        if (r0 == 0) goto L_0x0072;
    L_0x0071:
        goto L_0x0074;
    L_0x0072:
        r0 = 0;
        goto L_0x0075;
    L_0x0074:
        r0 = 1;
    L_0x0075:
        if (r0 == 0) goto L_0x008a;
    L_0x0077:
        if (r8 <= 0) goto L_0x007c;
    L_0x0079:
        r11 = r7.u;
        goto L_0x007e;
    L_0x007c:
        r11 = r7.s;
    L_0x007e:
        r0 = r7.getHeight();
        r2 = r7.getWidth();
        a(r11, r8, r0, r2, r10);
        goto L_0x009e;
    L_0x008a:
        r8 = r7.s;
        r8 = a(r8);
        if (r8 != 0) goto L_0x009e;
    L_0x0092:
        r8 = r7.u;
        r8 = a(r8);
        if (r8 == 0) goto L_0x009b;
    L_0x009a:
        goto L_0x009e;
    L_0x009b:
        r4 = r11;
        goto L_0x009e;
    L_0x009d:
        r4 = 0;
    L_0x009e:
        r7.b(r9, r1);
        r8 = r7.awakenScrollBars();
        if (r8 == 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00a9;
    L_0x00a8:
        r3 = r4;
    L_0x00a9:
        if (r3 == 0) goto L_0x00ae;
    L_0x00ab:
        r7.postInvalidateOnAnimation();
    L_0x00ae:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.views.ComposerScrollView.a(int, int, int, int):void");
    }

    private static void a(EdgeEffectWrapper edgeEffectWrapper, int i, int i2, int i3, int i4) {
        edgeEffectWrapper.onPull(((float) Math.abs(i)) / ((float) i2), ((float) i4) / ((float) i3));
    }

    private final void a(boolean z) {
        this.o = z;
        this.q.setAnimatingScroll(z);
    }

    private static boolean a(EdgeEffectWrapper edgeEffectWrapper) {
        if (edgeEffectWrapper == null || edgeEffectWrapper.isFinished()) {
            return false;
        }
        edgeEffectWrapper.onRelease();
        return true;
    }

    private final void b() {
        this.l.abortAnimation();
        a(false);
        this.p = false;
    }

    private final void b(int i, int i2) {
        int contentOffset = getContentOffset();
        if (this.d) {
            int currentPage = getCurrentPage();
            this.f = i;
            this.g = i2;
            int currentPage2 = getCurrentPage();
            if (currentPage != currentPage2) {
                PageChangedListener pageChangedListener = this.b;
                if (pageChangedListener != null) {
                    pageChangedListener.onPageChanged(this, currentPage2);
                }
            }
        } else {
            this.f = i;
            this.g = i2;
        }
        this.e.setLeft(-i);
        this.e.setTop(-i2);
        View view = this;
        ViewUtils.INSTANCE.notifyAttributeChanged(view, "contentOffsetX", Integer.valueOf(getNormalizedContentOffsetX()));
        ViewUtils.INSTANCE.notifyAttributeChanged(view, "contentOffsetY", Integer.valueOf(i2));
        ComposerViewNode composerViewNode = getComposerViewNode();
        if (composerViewNode != null) {
            composerViewNode.setUserDefinedViewport(i, i2, getWidth(), getHeight());
        }
        ScrollChangeListener scrollChangeListener = this.c;
        if (scrollChangeListener != null) {
            scrollChangeListener.onScrollChange(getContentOffset(), contentOffset);
        }
        if (isInLayout()) {
            ComposerContext composerContext = getComposerContext();
            if (composerContext != null) {
                composerContext = composerContext.getRoot();
                if (composerContext != null) {
                    ComposerView rootView = composerContext.getRootView();
                    if (rootView != null) {
                        rootView.requestLayout();
                    }
                }
            }
        }
    }

    private final int c() {
        return Math.max(0, getContentWidth() - getWidth());
    }

    private final int d() {
        return Math.max(0, getContentHeight() - getHeight());
    }

    private final void e() {
        a(true);
        postOnAnimation(this);
    }

    public final void addComposerChildView(View view, int i) {
        akcr.b(view, "childView");
        this.e.addView(view, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeHorizontalScrollExtent() {
        return getWidth();
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeHorizontalScrollOffset() {
        return this.f;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeHorizontalScrollRange() {
        return getContentWidth();
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeVerticalScrollExtent() {
        return getHeight();
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeVerticalScrollOffset() {
        return this.g;
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeVerticalScrollRange() {
        return getContentHeight();
    }

    public final void draw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        super.draw(canvas);
        Object obj = null;
        if (this.i) {
            EdgeEffectWrapper access$getLeftEdgeEffect$p = this.r;
            if (!access$getLeftEdgeEffect$p.isFinished() && access$getLeftEdgeEffect$p.draw(canvas, getWidth(), getHeight())) {
                obj = 1;
            }
            access$getLeftEdgeEffect$p = this.s;
            if (!access$getLeftEdgeEffect$p.isFinished() && access$getLeftEdgeEffect$p.draw(canvas, getWidth(), getHeight())) {
                obj = 1;
            }
            access$getLeftEdgeEffect$p = this.t;
            if (!access$getLeftEdgeEffect$p.isFinished() && access$getLeftEdgeEffect$p.draw(canvas, getWidth(), getHeight())) {
                obj = 1;
            }
            access$getLeftEdgeEffect$p = this.u;
            if (!access$getLeftEdgeEffect$p.isFinished() && access$getLeftEdgeEffect$p.draw(canvas, getWidth(), getHeight())) {
                obj = 1;
            }
        }
        if (obj != null) {
            postInvalidateOnAnimation();
        }
    }

    public final boolean getAlwaysAllowHorizontalOverflow() {
        return this.k;
    }

    public final boolean getAlwaysAllowVerticalOverflow() {
        return this.j;
    }

    public final int getContentHeight() {
        return this.e.getContentHeight();
    }

    public final int getContentOffset() {
        return this.h ? this.f : this.g;
    }

    public final int getContentOffsetX() {
        return this.f;
    }

    public final int getContentOffsetY() {
        return this.g;
    }

    public final int getContentSize() {
        return this.h ? getContentWidth() : getContentHeight();
    }

    public final ComposerScrollViewContentView getContentView() {
        return this.e;
    }

    public final int getContentWidth() {
        return this.e.getContentWidth();
    }

    public final int getCurrentPage() {
        return pageForContentOffset(getContentOffset());
    }

    public final boolean getGlow() {
        return this.i;
    }

    public final boolean getHorizontalScroll() {
        return this.h;
    }

    public final int getNormalizedContentOffsetX() {
        int i = this.v;
        return i != 0 ? i - this.f : this.f;
    }

    public final PageChangedListener getOnPageChangedListener() {
        return this.b;
    }

    public final ScrollChangeListener getOnScrollChangeListener() {
        return this.c;
    }

    public final int getPageSize() {
        return this.h ? getMeasuredWidth() : getMeasuredHeight();
    }

    public final int getPagesCount() {
        int contentSize = getContentSize();
        int pageSize = getPageSize();
        return (contentSize == 0 || pageSize == 0) ? 0 : contentSize / pageSize;
    }

    public final boolean getPagingEnabled() {
        return this.d;
    }

    public final int getRtlOffsetX() {
        return this.v;
    }

    public final float getSwipeVelocityThresholdRawPixels() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ComposerScrollViewContentView composerScrollViewContentView = this.e;
        composerScrollViewContentView.layout(-this.f, -this.g, composerScrollViewContentView.getMeasuredWidth() - this.f, this.e.getMeasuredHeight() - this.g);
        super.onLayout(z, i, i2, i3, i4);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.e.measure(MeasureSpec.makeMeasureSpec(this.e.getContentWidth(), AudioPlayer.INFINITY_LOOP_COUNT), MeasureSpec.makeMeasureSpec(this.e.getContentHeight(), AudioPlayer.INFINITY_LOOP_COUNT));
        this.r.setSize(getMeasuredWidth(), getMeasuredHeight());
        this.s.setSize(getMeasuredWidth(), getMeasuredHeight());
        this.t.setSize(getMeasuredWidth(), getMeasuredHeight());
        this.u.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onMovedToComposerContext(ComposerContext composerContext, ComposerViewNode composerViewNode) {
        akcr.b(composerContext, "composerContext");
        akcr.b(composerViewNode, "viewNode");
        super.onMovedToComposerContext(composerContext, composerViewNode);
        composerViewNode.getYogaNode().a(this.h ? YogaFlexDirection.ROW : YogaFlexDirection.COLUMN);
        composerViewNode.getYogaNode().a(YogaOverflow.SCROLL);
    }

    public final void onRecognized(DragGestureRecognizer dragGestureRecognizer, ComposerGestureRecognizerState composerGestureRecognizerState, int i, int i2, int i3, int i4, float f, float f2) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        float f3 = f;
        float f4 = f2;
        akcr.b(dragGestureRecognizer, MapboxEvent.KEY_GESTURE_ID);
        akcr.b(composerGestureRecognizerState, "state");
        b();
        int i9 = WhenMappings.$EnumSwitchMapping$0[composerGestureRecognizerState.ordinal()];
        if (i9 == 1) {
            this.m = this.f;
            this.n = this.g;
            a(i7, i8, i5, i6);
        } else if (i9 == 2) {
            a(i7, i8, i5, i6);
        } else if (i9 == 3) {
            boolean access$releaseGlow = a(this.r);
            if (a(this.s)) {
                access$releaseGlow = true;
            }
            if (a(this.t)) {
                access$releaseGlow = true;
            }
            if (a(this.u)) {
                access$releaseGlow = true;
            }
            if (access$releaseGlow) {
                postInvalidateOnAnimation();
            }
            if (this.d) {
                if (!this.h) {
                    f3 = f4;
                }
                scrollToPage(pageForContentOffset(Math.min(this.h ? c() : d(), Math.max(getContentOffset() + ((Math.abs(f3) > this.a ? (int) Math.signum(-f3) : 0) * getPageSize()), 0))), true);
                return;
            }
            i5 = this.h ? this.m - i7 : this.m;
            i6 = !this.h ? this.n - i8 : this.n;
            int c = c();
            i7 = d();
            i8 = a(i5, c);
            i9 = a(i6, i7);
            if (i8 == i5 && i9 == i6) {
                b(i5, i6);
                if (this.h) {
                    this.l.fling(this.f, this.g, -((int) f3), -((int) f4), Integer.MIN_VALUE, Integer.MAX_VALUE, 0, i7);
                } else {
                    this.l.fling(this.f, this.g, -((int) f3), -((int) f4), 0, c, Integer.MIN_VALUE, Integer.MAX_VALUE);
                }
                this.p = true;
                e();
                return;
            }
            setContentOffset(i8, i9, true);
        }
    }

    public final void onScrollableContentSizeChanged(int i, int i2, int i3) {
        int i4 = this.f;
        if (i3 != this.v) {
            i4 = i3 != 0 ? i3 - getNormalizedContentOffsetX() : getNormalizedContentOffsetX();
            this.v = i3;
        }
        this.e.setContentSize(i, i2);
        i = a(i4, c());
        i2 = a(this.g, d());
        if (i != this.f || i2 != this.g) {
            setContentOffset(i, i2, false);
        }
    }

    public final int pageForContentOffset(int i) {
        int pageSize = getPageSize();
        return pageSize == 0 ? 0 : Math.max(Math.min((i + (pageSize / 2)) / pageSize, getPagesCount()), 0);
    }

    public final boolean prepareForRecycling() {
        if (!super.prepareForRecycling()) {
            return false;
        }
        this.f = 0;
        this.g = 0;
        this.v = 0;
        return true;
    }

    public final void run() {
        if (this.l.computeScrollOffset()) {
            int currX = this.l.getCurrX();
            int currY = this.l.getCurrY();
            if (this.p) {
                int a = a(currX, c());
                int a2 = a(currY, d());
                if (!(a == currX && currY == a2)) {
                    if (this.i) {
                        float currVelocity = this.l.getCurrVelocity();
                        EdgeEffectWrapper edgeEffectWrapper = this.h ? a == 0 ? this.r : this.t : a2 == 0 ? this.s : this.u;
                        edgeEffectWrapper.onAbsorb(akdp.a(currVelocity));
                        postInvalidateOnAnimation();
                    }
                    b();
                    currX = a;
                    currY = a2;
                }
            }
            b(currX, currY);
            if (this.l.isFinished()) {
                ScrollChangeListener scrollChangeListener = this.c;
                if (scrollChangeListener != null) {
                    scrollChangeListener.onScrollEnd(getContentOffset());
                }
                b();
                return;
            }
            e();
        }
    }

    public final void scrollToPage(int i, boolean z) {
        setContentOffset(i * getPageSize(), z);
    }

    public final void setAlwaysAllowHorizontalOverflow(boolean z) {
        this.k = z;
    }

    public final void setAlwaysAllowVerticalOverflow(boolean z) {
        this.j = z;
    }

    public final void setContentOffset(int i) {
        setContentOffset(i, false);
    }

    public final void setContentOffset(int i, int i2, boolean z) {
        if (z) {
            OverScroller overScroller = this.l;
            int i3 = this.f;
            int i4 = this.g;
            overScroller.startScroll(i3, i4, i - i3, i2 - i4);
            e();
            return;
        }
        b(i, i2);
        ScrollChangeListener scrollChangeListener = this.c;
        if (scrollChangeListener != null) {
            scrollChangeListener.onScrollEnd(getContentOffset());
        }
    }

    public final void setContentOffset(int i, boolean z) {
        if (this.h) {
            setContentOffset(i, 0, z);
        } else {
            setContentOffset(0, i, z);
        }
    }

    public final void setGlow(boolean z) {
        this.i = z;
        if (!this.i) {
            this.r.finish();
            this.s.finish();
            this.t.finish();
            this.u.finish();
        }
        a();
    }

    public final void setHorizontalScroll(boolean z) {
        this.h = z;
        ComposerViewNode composerViewNode = getComposerViewNode();
        if (composerViewNode != null) {
            YogaNode yogaNode = composerViewNode.getYogaNode();
            if (yogaNode != null) {
                yogaNode.a(z ? YogaFlexDirection.ROW : YogaFlexDirection.COLUMN);
            }
        }
        this.q.setHorizontalScroll(z);
        requestLayout();
    }

    public final void setHorizontalScrollBarEnabled(boolean z) {
        super.setHorizontalScrollBarEnabled(z);
        a();
    }

    public final void setOnPageChangedListener(PageChangedListener pageChangedListener) {
        this.b = pageChangedListener;
    }

    public final void setOnScrollChangeListener(ScrollChangeListener scrollChangeListener) {
        this.c = scrollChangeListener;
    }

    public final void setPagingEnabled(boolean z) {
        this.d = z;
    }

    public final void setVerticalScrollBarEnabled(boolean z) {
        super.setVerticalScrollBarEnabled(z);
        a();
    }
}
