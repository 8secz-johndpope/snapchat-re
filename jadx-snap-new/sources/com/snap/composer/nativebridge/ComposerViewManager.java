package com.snap.composer.nativebridge;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.annotation.Keep;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.composer.DebugMessagePresenter;
import com.snap.composer.DebugMessagePresenter.Level;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.context.ComposerViewOwner;
import com.snap.composer.exceptions.ComposerException;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.extensions.ViewUtilsKt;
import com.snap.composer.logger.LogLevel;
import com.snap.composer.logger.Logger;
import com.snap.composer.nodes.ComposerViewNode;
import com.snap.composer.utils.LoggerUtilsKt;
import com.snap.composer.utils.MainThreadUtils;
import com.snap.composer.views.ComposerRecyclableView;
import com.snap.composer.views.ComposerScrollableView;
import com.snap.composer.views.ComposerView;
import com.snap.composer.views.CustomChildViewAppender;
import com.snapchat.client.composer.Animator;
import com.snapchat.client.composer.AttributesBindingContext;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.ajyn;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class ComposerViewManager {
    private DebugMessagePresenter a;
    private HashMap<Class<?>, AttributesBinder<?>> b = new HashMap();
    private HashMap<Class<?>, Constructor<View>> c = new HashMap();
    private HashMap<Class<?>, Class<?>> d = new HashMap();
    private final Context e;
    private final Logger f;

    static final class b implements AnimatorUpdateListener {
        private /* synthetic */ ComposerViewManager a;
        private /* synthetic */ int b;
        private /* synthetic */ int c;
        private /* synthetic */ int d;
        private /* synthetic */ int e;
        private /* synthetic */ int f;
        private /* synthetic */ int g;
        private /* synthetic */ int h;
        private /* synthetic */ int i;
        private /* synthetic */ View j;

        b(ComposerViewManager composerViewManager, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, View view) {
            this.a = composerViewManager;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            akcr.a((Object) valueAnimator, "it");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int i = this.b;
            int i2 = i + ((int) (((float) (this.c - i)) * animatedFraction));
            i = this.d;
            int i3 = i + ((int) (((float) (this.e - i)) * animatedFraction));
            i = this.f;
            int i4 = i + ((int) (((float) (this.g - i)) * animatedFraction));
            i = this.h;
            ComposerViewManager.a(this.j, i2, i3, i4, i + ((int) (((float) (this.i - i)) * animatedFraction)), true);
        }
    }

    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ View a;

        a(View view) {
            this.a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.requestLayout();
            return ajxw.a;
        }
    }

    public ComposerViewManager(Context context, Logger logger) {
        akcr.b(context, "context");
        akcr.b(logger, "logger");
        this.e = context;
        this.f = logger;
    }

    private static int a(int i) {
        return i == 2 ? Integer.MIN_VALUE : i == 1 ? AudioPlayer.INFINITY_LOOP_COUNT : 0;
    }

    private final Class<?> a(Class<?> cls) {
        Class cls2 = (Class) this.d.get(cls);
        return cls2 != null ? cls2 : cls;
    }

    private final Class<?> a(String str) {
        try {
            Class cls = Class.forName(str);
            akcr.a((Object) cls, "cls");
            str = a(cls);
            return str;
        } catch (ClassNotFoundException unused) {
            Logger logger = this.f;
            int error = LogLevel.Companion.getERROR();
            StringBuilder stringBuilder = new StringBuilder("Could not resolve view class ");
            stringBuilder.append(str);
            stringBuilder.append(". Defaulting to ComposerView instead.");
            logger.log(error, stringBuilder.toString());
            return ComposerView.class;
        }
    }

    private static void a(View view, int i, int i2, int i3, int i4, boolean z) {
        ComposerViewNode findViewNode = ViewUtils.INSTANCE.findViewNode(view);
        if (findViewNode != null) {
            findViewNode.setCalculatedX(i);
            findViewNode.setCalculatedY(i2);
            findViewNode.setCalculatedWidth(i3);
            findViewNode.setCalculatedHeight(i4);
            if (z) {
                view.measure(MeasureSpec.makeMeasureSpec(i3, AudioPlayer.INFINITY_LOOP_COUNT), MeasureSpec.makeMeasureSpec(i4, AudioPlayer.INFINITY_LOOP_COUNT));
                view.layout(i, i2, i3 + i, i4 + i2);
                findViewNode.didApplyLayout();
                return;
            }
            view.requestLayout();
        }
    }

    @Keep
    public final void bindAttributes(Class<?> cls, AttributesBindingContext attributesBindingContext) {
        akcr.b(cls, "cls");
        akcr.b(attributesBindingContext, "bindingContext");
        Object obj = this.b.get(a((Class) cls));
        if (!(obj instanceof AttributesBinder)) {
            obj = null;
        }
        AttributesBinder attributesBinder = (AttributesBinder) obj;
        if (attributesBinder != null) {
            attributesBinder.bindAttributes(new com.snap.composer.attributes.AttributesBindingContext(attributesBinder.getViewClass(), attributesBindingContext, this));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0049 in {7, 12, 14, 16} preds:[]
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
    @android.support.annotation.Keep
    public final void callAction(com.snap.composer.context.ComposerContext r2, java.lang.String r3, java.lang.Object[] r4) {
        /*
        r1 = this;
        r0 = "context";
        defpackage.akcr.b(r2, r0);
        r0 = "actionName";
        defpackage.akcr.b(r3, r0);
        r0 = r2.getActionHandler();
        if (r0 != 0) goto L_0x0020;
        r0 = r2.getParent();
        if (r0 == 0) goto L_0x0020;
        r2 = r2.getParent();
        if (r2 != 0) goto L_0x000a;
        defpackage.akcr.a();
        goto L_0x000a;
        r2 = r2.getActions();
        r2 = r2.getAction(r3);
        if (r2 == 0) goto L_0x0037;
        if (r4 != 0) goto L_0x0033;
        r3 = 0;
        r3 = new java.lang.Object[r3];
        r2.perform(r3);
        return;
        r2.perform(r4);
        return;
        r2 = new com.snap.composer.exceptions.ComposerException;
        r3 = java.lang.String.valueOf(r3);
        r4 = "No action found for name ";
        r3 = r4.concat(r3);
        r2.<init>(r3);
        r2 = (java.lang.Throwable) r2;
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.nativebridge.ComposerViewManager.callAction(com.snap.composer.context.ComposerContext, java.lang.String, java.lang.Object[]):void");
    }

    @Keep
    public final Animator createAnimator(int i, Object[] objArr, double d, boolean z) {
        return ComposerAnimator.Companion.createAnimation(i, objArr, (long) (d * 1000.0d));
    }

    @Keep
    public final View createView(ComposerContext composerContext, long j, String str) {
        akcr.b(composerContext, "composerContext");
        akcr.b(str, "viewClassName");
        Class a = a(str);
        ComposerViewOwner activeOwner = composerContext.getActiveOwner();
        View createViewForClass = activeOwner != null ? activeOwner.createViewForClass(this.e, a, new ComposerViewNode(j, composerContext.getNative().getNativeBridge(), composerContext.getNative(), 0)) : null;
        return createViewForClass == null ? createViewForClass(a) : createViewForClass;
    }

    public final View createViewForClass(Class<?> cls) {
        akcr.b(cls, "cls");
        Constructor constructor = (Constructor) this.c.get(cls);
        if (constructor == null) {
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Context.class});
                if (constructor != null) {
                    this.c.put(cls, constructor);
                } else {
                    throw new ajxt("null cannot be cast to non-null type java.lang.reflect.Constructor<android.view.View>");
                }
            } catch (NoSuchMethodException unused) {
                String str = "Unable to resolve constructor for View class ";
                LoggerUtilsKt.error(this.f, str.concat(String.valueOf(cls)));
                throw new ComposerException(str.concat(String.valueOf(cls)));
            }
        }
        Object newInstance = constructor.newInstance(new Object[]{this.e});
        akcr.a(newInstance, "constructor.newInstance(context)");
        return (View) newInstance;
    }

    public final List<String> getAllRegisteredClassNames() {
        Object keySet = this.b.keySet();
        akcr.a(keySet, "attributesBinderForClass.keys");
        Iterable<Object> iterable = (Iterable) keySet;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (Object obj : iterable) {
            akcr.a(obj, "it");
            arrayList.add(obj.getName());
        }
        return (List) arrayList;
    }

    public final <T extends View> AttributesBinder<T> getAttributesBinderForClass(Class<T> cls) {
        akcr.b(cls, "cls");
        Object obj = this.b.get(cls);
        if (!(obj instanceof AttributesBinder)) {
            obj = null;
        }
        return (AttributesBinder) obj;
    }

    public final Context getContext() {
        return this.e;
    }

    public final DebugMessagePresenter getDebugMessagePresenter() {
        return this.a;
    }

    public final Logger getLogger() {
        return this.f;
    }

    @Keep
    public final View getMeasurerPlaceholderView(String str) {
        akcr.b(str, "viewClass");
        Object obj = (AttributesBinder) this.b.get(a(str));
        if (obj == null) {
            return null;
        }
        akcr.a(obj, "attributesBinderForClass[cls] ?: return null");
        return obj.getMeasurerPlaceholderView();
    }

    @Keep
    public final void invalidateLayout(View view) {
        akcr.b(view, "view");
        if (ComposerView.Companion.isCalculatingLayout()) {
            MainThreadUtils.dispatchOnMainThread(new a(view));
        } else {
            view.requestLayout();
        }
    }

    @Keep
    public final void layoutView(View view) {
        akcr.b(view, "view");
        if (view.isLayoutRequested() && (view instanceof ComposerView)) {
            ComposerView composerView = (ComposerView) view;
            int lastWidthMeasureSpec = composerView.getLastWidthMeasureSpec();
            int lastHeightMeasureSpec = composerView.getLastHeightMeasureSpec();
            if (lastWidthMeasureSpec != 0 || lastHeightMeasureSpec != 0) {
                view.measure(lastWidthMeasureSpec, lastHeightMeasureSpec);
                view.layout(composerView.getLeft(), composerView.getTop(), composerView.getRight(), composerView.getBottom());
            }
        }
    }

    @Keep
    public final long measureView(View view, long j, int i, int i2, int i3, int i4) {
        akcr.b(view, "view");
        if (view instanceof ComposerView) {
            return 0;
        }
        view.measure(MeasureSpec.makeMeasureSpec(i, a(i2)), MeasureSpec.makeMeasureSpec(i3, a(i4)));
        return (((long) view.getMeasuredWidth()) << 32) | ((long) view.getMeasuredHeight());
    }

    @Keep
    public final void moveToParentView(View view, View view2, int i) {
        akcr.b(view, "view");
        ViewUtilsKt.removeFromParentView(view);
        if (view2 != null) {
            view2.requestLayout();
            if (view2 instanceof CustomChildViewAppender) {
                ((CustomChildViewAppender) view2).addComposerChildView(view, i);
            } else if (view2 instanceof ViewGroup) {
                ((ViewGroup) view2).addView(view, i);
            } else {
                throw new ComposerException("The parentView needs to be a ViewGroup");
            }
        }
    }

    @Keep
    public final void presentDebugMessage(String str) {
        akcr.b(str, "str");
        DebugMessagePresenter debugMessagePresenter = this.a;
        if (debugMessagePresenter != null) {
            debugMessagePresenter.presentDebugMessage(Level.INFO, str);
        }
    }

    public final <T extends View> void registerAttributesBinder(AttributesBinder<T> attributesBinder) {
        akcr.b(attributesBinder, "attributesBinder");
        this.b.put(attributesBinder.getViewClass(), attributesBinder);
    }

    public final void registerClassReplacement(Class<?> cls, Class<?> cls2) {
        akcr.b(cls, "sourceClass");
        akcr.b(cls2, "newClass");
        this.d.put(cls, cls2);
    }

    @Keep
    public final void scrollableContentSizeChanged(View view, int i, int i2, int i3) {
        akcr.b(view, "view");
        if (view instanceof ComposerScrollableView) {
            ((ComposerScrollableView) view).onScrollableContentSizeChanged(i, i2, i3);
        }
    }

    public final void setDebugMessagePresenter(DebugMessagePresenter debugMessagePresenter) {
        this.a = debugMessagePresenter;
    }

    @Keep
    public final boolean shouldUseLegacyMeasureMethod(View view) {
        akcr.b(view, "view");
        return true;
    }

    @Keep
    public final void viewFrameChanged(View view, int i, int i2, int i3, int i4, Object obj) {
        View view2 = view;
        akcr.b(view2, "view");
        Object obj2 = obj;
        if (!(obj2 instanceof ComposerAnimator)) {
            obj2 = null;
        }
        ComposerAnimator composerAnimator = (ComposerAnimator) obj2;
        String str = "frame";
        ViewUtils.INSTANCE.cancelAnimation(view2, str);
        if (composerAnimator == null) {
            a(view, i, i2, i3, i4, false);
            return;
        }
        int left = view.getLeft();
        int top = view.getTop();
        int width = view.getWidth();
        int height = view.getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        ofFloat.addUpdateListener(new b(this, left, i, top, i2, width, i3, height, i4, view));
        composerAnimator.addValueAnimator(str, view2, ofFloat);
    }

    @Keep
    public final void viewMovedToContext(ComposerContext composerContext, long j, long j2, View view) {
        akcr.b(composerContext, "composerContext");
        akcr.b(view, "view");
        ComposerViewNode composerViewNode = new ComposerViewNode(j, composerContext.getNative().getNativeBridge(), composerContext.getNative(), j2);
        ViewUtils.INSTANCE.setComposerContext(view, composerContext);
        ViewUtils.INSTANCE.setViewNode(view, composerViewNode);
        if (view instanceof ComposerView) {
            ((ComposerView) view).movedToComposerContext$client_release(composerContext, composerViewNode);
        }
    }

    @Keep
    public final boolean willEnqueueViewToPool(View view) {
        akcr.b(view, "view");
        ViewUtils.INSTANCE.cancelAnimations(view);
        ViewUtils.INSTANCE.setComposerContext(view, null);
        ViewUtils.INSTANCE.setViewNode(view, null);
        if (!(view instanceof ComposerRecyclableView)) {
            return false;
        }
        boolean prepareForRecycling = ((ComposerRecyclableView) view).prepareForRecycling();
        if (prepareForRecycling) {
            view.setLeft(0);
            view.setRight(0);
            view.setTop(0);
            view.setBottom(0);
        }
        return prepareForRecycling;
    }
}
