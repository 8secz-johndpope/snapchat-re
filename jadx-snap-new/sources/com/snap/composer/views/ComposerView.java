package com.snap.composer.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.facebook.yoga.YogaDirection;
import com.snap.composer.ComposerViewLoader;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.context.ComposerViewOwner;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.logger.Logger;
import com.snap.composer.nodes.ComposerViewNode;
import com.snap.composer.utils.CanvasClipper;
import com.snap.composer.utils.LoggerUtilsKt;
import com.snap.composer.utils.MainThreadUtils;
import com.snap.composer.views.touches.DragGestureRecognizer;
import com.snap.composer.views.touches.GestureRecognizers;
import com.snap.composer.views.touches.TouchDispatcher;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akcs;
import java.util.ArrayList;
import java.util.List;

public class ComposerView extends ViewGroup implements ComposerClippableView, ComposerRecyclableView {
    public static final Companion Companion = new Companion();
    private static boolean l;
    private boolean a;
    private boolean b;
    private TouchDispatcher c;
    private final Rect d = new Rect(0, 0, 0, 0);
    private final CanvasClipper e = new CanvasClipper();
    private int f;
    private int g;
    private boolean h;
    private boolean i = true;
    private List<akbl<ComposerContext, ajxw>> j;
    private akbw<? super ComposerView, ? super MotionEvent, ajxw> k;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final boolean isCalculatingLayout() {
            return ComposerView.l;
        }

        public final void setCalculatingLayout(boolean z) {
            ComposerView.l = z;
        }
    }

    static final class a extends akcs implements akbl<ComposerContext, ajxw> {
        private /* synthetic */ ComposerView a;

        a(ComposerView composerView) {
            this.a = composerView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerContext composerContext = (ComposerContext) obj;
            akcr.b(composerContext, "it");
            ViewUtils.INSTANCE.setViewNode(this.a, null);
            ViewUtils.INSTANCE.setComposerContext(this.a, null);
            this.a.setOnSystemUiVisibilityChangeListener(null);
            composerContext.destroy();
            return ajxw.a;
        }
    }

    static final class b extends akcs implements akbl<ComposerContext, ajxw> {
        private /* synthetic */ akbk a;

        b(akbk akbk) {
            this.a = akbk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerContext composerContext = (ComposerContext) obj;
            akcr.b(composerContext, "it");
            composerContext.enqueueNextRenderCallback(this.a);
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbk<ajxw> {
        private /* synthetic */ ComposerView a;
        private /* synthetic */ akbl b;

        c(ComposerView composerView, akbl akbl) {
            this.a = composerView;
            this.b = akbl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ComposerContext composerContext = this.a.getComposerContext();
            if (composerContext != null) {
                this.b.invoke(composerContext);
            } else {
                if (this.a.j == null) {
                    this.a.j = new ArrayList();
                }
                List access$getContextReadyCallbacks$p = this.a.j;
                if (access$getContextReadyCallbacks$p != null) {
                    access$getContextReadyCallbacks$p.add(this.b);
                }
            }
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbl<ComposerContext, ajxw> {
        private /* synthetic */ ComposerView a;
        private /* synthetic */ akbl b;

        d(ComposerView composerView, akbl akbl) {
            this.a = composerView;
            this.b = akbl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((ComposerContext) obj, "it");
            ComposerViewNode composerViewNode = this.a.getComposerViewNode();
            if (composerViewNode != null) {
                this.b.invoke(composerViewNode);
            }
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<ComposerContext, ajxw> {
        private /* synthetic */ Object a;

        e(Object obj) {
            this.a = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerContext composerContext = (ComposerContext) obj;
            akcr.b(composerContext, "it");
            composerContext.setActionHandler(this.a);
            return ajxw.a;
        }
    }

    static final class f extends akcs implements akbl<ComposerContext, ajxw> {
        private /* synthetic */ ComposerViewOwner a;

        f(ComposerViewOwner composerViewOwner) {
            this.a = composerViewOwner;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerContext composerContext = (ComposerContext) obj;
            akcr.b(composerContext, "it");
            composerContext.setOwner(this.a);
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbl<ComposerContext, ajxw> {
        private /* synthetic */ Object a;

        g(Object obj) {
            this.a = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerContext composerContext = (ComposerContext) obj;
            akcr.b(composerContext, "it");
            composerContext.setViewModel(this.a);
            return ajxw.a;
        }
    }

    public ComposerView(Context context) {
        akcr.b(context, "context");
        super(context);
        setClipChildren(false);
    }

    private static int a(int i) {
        return i != AudioPlayer.INFINITY_LOOP_COUNT ? 0 : 1;
    }

    public final void addCSSClassesToView(View view, String str) {
        akcr.b(view, "view");
        akcr.b(str, "cssClasses");
        ComposerContext composerContext = getComposerContext();
        if (composerContext != null) {
            composerContext.addCSSClasses(view, str);
        }
    }

    public final void contextIsReady$client_release(ComposerContext composerContext) {
        akcr.b(composerContext, "composerContext");
        List<akbl> list = this.j;
        if (list != null) {
            this.j = null;
            if (list != null) {
                for (akbl invoke : list) {
                    invoke.invoke(composerContext);
                }
            }
        }
    }

    public final void destroy() {
        this.h = true;
        getComposerContext(new a(this));
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        if (getClipToBounds() && canvas != null) {
            this.d.right = getWidth();
            this.d.bottom = getHeight();
            getClipper().clip(canvas, this.d);
        }
        super.dispatchDraw(canvas);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.a || motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        akbw akbw = this.k;
        if (akbw != null) {
            akbw.invoke(this, motionEvent);
        }
        if (this.c == null) {
            Logger logger;
            ComposerContext composerContext = getComposerContext();
            if (composerContext != null) {
                ComposerViewLoader viewLoader = composerContext.getViewLoader();
                if (viewLoader != null) {
                    logger = viewLoader.getLogger();
                    this.c = new TouchDispatcher(logger);
                }
            }
            logger = null;
            this.c = new TouchDispatcher(logger);
        }
        TouchDispatcher touchDispatcher = this.c;
        if (touchDispatcher == null) {
            akcr.a();
        }
        return touchDispatcher.dispatchTouch(this, motionEvent);
    }

    public final void enqueueNextRenderCallback(akbk<ajxw> akbk) {
        akcr.b(akbk, "onNextRenderCallback");
        getComposerContext(new b(akbk));
    }

    public void forceLayout() {
        this.i = true;
        super.forceLayout();
    }

    public boolean getClipToBounds() {
        return this.b;
    }

    public boolean getClipToBoundsDefaultValue() {
        return false;
    }

    public CanvasClipper getClipper() {
        return this.e;
    }

    public final ComposerContext getComposerContext() {
        return ViewUtils.INSTANCE.findComposerContext(this);
    }

    public final void getComposerContext(akbl<? super ComposerContext, ajxw> akbl) {
        akcr.b(akbl, "callback");
        MainThreadUtils.runOnMainThreadIfNeeded(new c(this, akbl));
    }

    public final ComposerViewNode getComposerViewNode() {
        return ViewUtils.INSTANCE.findViewNode(this);
    }

    public final void getComposerViewNode(akbl<? super ComposerViewNode, ajxw> akbl) {
        akcr.b(akbl, "callback");
        getComposerContext(new d(this, akbl));
    }

    public final boolean getDestroyed() {
        return this.h;
    }

    public final int getLastHeightMeasureSpec() {
        return this.g;
    }

    public final int getLastWidthMeasureSpec() {
        return this.f;
    }

    public final akbw<ComposerView, MotionEvent, ajxw> getRootViewTouchListener() {
        return this.k;
    }

    public final boolean hasDragGestureRecognizer() {
        GestureRecognizers gestureRecognizers = ViewUtils.INSTANCE.getGestureRecognizers(this, false);
        return gestureRecognizers == null ? false : gestureRecognizers.hasGestureRecognizer(DragGestureRecognizer.class);
    }

    public final boolean isRoot() {
        return this.a;
    }

    public final void movedToComposerContext$client_release(ComposerContext composerContext, ComposerViewNode composerViewNode) {
        akcr.b(composerContext, "composerContext");
        akcr.b(composerViewNode, "viewNode");
        onMovedToComposerContext(composerContext, composerViewNode);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.i) {
            this.i = false;
            ViewUtils.INSTANCE.applyLayoutToComposerChildren(this);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        ComposerContext composerContext = getComposerContext();
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int a = a(mode);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        int a2 = a(mode2);
        if (!(this.f == i && this.g == i2)) {
            this.i = true;
            this.f = i;
            this.g = i2;
        }
        ComposerViewNode composerViewNode = getComposerViewNode();
        if (this.a && composerContext != null) {
            if (composerViewNode != null) {
                YogaDirection yogaDirection = getLayoutDirection() == 1 ? YogaDirection.RTL : YogaDirection.LTR;
                if (yogaDirection != composerViewNode.getYogaNode().d()) {
                    composerViewNode.getYogaNode().a(yogaDirection);
                }
            }
            l = true;
            composerContext.calculateLayout(size, a, size2, a2);
            l = false;
        }
        if (this.i) {
            ViewUtils.INSTANCE.measureComposerChildren(this);
        }
        if (!((mode == AudioPlayer.INFINITY_LOOP_COUNT && mode2 == AudioPlayer.INFINITY_LOOP_COUNT) || composerViewNode == null)) {
            long calculatedSize = composerViewNode.getCalculatedSize();
            int horizontalFromEncodedLong = ComposerViewNode.Companion.horizontalFromEncodedLong(calculatedSize);
            i = ComposerViewNode.Companion.verticalFromEncodedLong(calculatedSize);
            if (mode == Integer.MIN_VALUE) {
                horizontalFromEncodedLong = Math.min(horizontalFromEncodedLong, size);
            }
            size = horizontalFromEncodedLong;
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i, size2) : i;
        }
        setMeasuredDimension(size, size2);
    }

    public void onMovedToComposerContext(ComposerContext composerContext, ComposerViewNode composerViewNode) {
        akcr.b(composerContext, "composerContext");
        akcr.b(composerViewNode, "viewNode");
    }

    public boolean prepareForRecycling() {
        if (this.a) {
            return false;
        }
        this.f = 0;
        this.g = 0;
        return true;
    }

    public final void removeCSSClassesFromView(View view, String str) {
        akcr.b(view, "view");
        akcr.b(str, "cssClasses");
        ComposerContext composerContext = getComposerContext();
        if (composerContext != null) {
            composerContext.removeCSSClasses(view, str);
        }
    }

    public void requestLayout() {
        this.i = true;
        super.requestLayout();
    }

    public final void setActionHandlerUntyped(Object obj) {
        getComposerContext(new e(obj));
    }

    public void setBackground(Drawable drawable) {
        invalidate();
        super.setBackground(drawable);
    }

    public void setClipChildren(boolean z) {
        invalidate();
        super.setClipChildren(z);
    }

    public void setClipToBounds(boolean z) {
        this.b = z;
    }

    public final void setOwner(ComposerViewOwner composerViewOwner) {
        getComposerContext(new f(composerViewOwner));
    }

    public final void setRoot(boolean z) {
        this.a = z;
    }

    public final void setRootViewTouchListener(akbw<? super ComposerView, ? super MotionEvent, ajxw> akbw) {
        if (this.a) {
            this.k = akbw;
            return;
        }
        ComposerContext composerContext = getComposerContext();
        if (composerContext != null) {
            ComposerViewLoader viewLoader = composerContext.getViewLoader();
            if (viewLoader != null) {
                Logger logger = viewLoader.getLogger();
                if (logger != null) {
                    LoggerUtilsKt.warn(logger, "Cannot set touch listener on non-root view");
                }
            }
        }
    }

    public final void setViewModelUntyped(Object obj) {
        getComposerContext(new g(obj));
    }
}
