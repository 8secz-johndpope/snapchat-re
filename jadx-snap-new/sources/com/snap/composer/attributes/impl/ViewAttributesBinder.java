package com.snap.composer.attributes.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.brightcove.player.captioning.TTMLParser.Attributes;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.AttributesBindingContext;
import com.snap.composer.attributes.conversions.ColorConversions;
import com.snap.composer.attributes.impl.animations.ColorAnimator;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.attributes.impl.animations.ViewAnimator;
import com.snap.composer.attributes.impl.gestures.GestureAttributes;
import com.snap.composer.drawables.ComposerGradientDrawable;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.logger.Logger;
import com.snap.composer.nodes.ComposerViewNode;
import com.snap.composer.utils.JSConversions;
import com.snap.composer.utils.LoggerUtilsKt;
import com.snap.composer.views.ComposerClippableView;
import com.snapchat.client.composer.AttributeType;
import com.snapchat.client.composer.CompositeAttributePart;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.ajym;
import defpackage.ajyu;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ViewAttributesBinder implements AttributesBinder<View> {
    public static final Companion Companion = new Companion();
    private static final Object d = new Object();
    private static final Object e = new Object();
    private static final Object f = new Object();
    private static final Object g = new Object();
    private static final Object h = new Object();
    private static final Object i = new Object();
    private static final Object j = new Object();
    private static final Object k = new Object();
    private static final Object l = new Object();
    private static final Object m = new Object();
    private final float a;
    private final ajxe b;
    private final Logger c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    static final class a extends akcs implements akbl<ComposerGradientDrawable, ajxw> {
        private /* synthetic */ Object[] a;

        a(Object[] objArr) {
            this.a = objArr;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerGradientDrawable composerGradientDrawable = (ComposerGradientDrawable) obj;
            akcr.b(composerGradientDrawable, "it");
            Object[] objArr = this.a;
            Collection arrayList = new ArrayList(objArr.length);
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj2 = objArr[i];
                com.snap.composer.attributes.conversions.ColorConversions.Companion companion = ColorConversions.Companion;
                if (obj2 != null) {
                    arrayList.add(Integer.valueOf(companion.fromRGBA(((Long) obj2).longValue())));
                    i++;
                } else {
                    throw new ajxt("null cannot be cast to non-null type kotlin.Long");
                }
            }
            composerGradientDrawable.setColors(ajyu.f((Collection) (List) arrayList));
            return ajxw.a;
        }
    }

    static final class b extends akcs implements akbl<ComposerGradientDrawable, ajxw> {
        private /* synthetic */ int a;

        b(int i) {
            this.a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerGradientDrawable composerGradientDrawable = (ComposerGradientDrawable) obj;
            akcr.b(composerGradientDrawable, "it");
            composerGradientDrawable.setColor(this.a);
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbl<ComposerGradientDrawable, ajxw> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerGradientDrawable composerGradientDrawable = (ComposerGradientDrawable) obj;
            akcr.b(composerGradientDrawable, "it");
            composerGradientDrawable.setColor(0);
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbl<ComposerGradientDrawable, ajxw> {
        private /* synthetic */ int a;
        private /* synthetic */ int b;

        d(int i, int i2) {
            this.a = i;
            this.b = i2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerGradientDrawable composerGradientDrawable = (ComposerGradientDrawable) obj;
            akcr.b(composerGradientDrawable, "it");
            composerGradientDrawable.setStroke(this.a, this.b);
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<ComposerGradientDrawable, ajxw> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((ComposerGradientDrawable) obj, "it");
            return ajxw.a;
        }
    }

    static final class f extends akcs implements akbl<ComposerGradientDrawable, ajxw> {
        private /* synthetic */ float a;
        private /* synthetic */ float b;
        private /* synthetic */ float c;
        private /* synthetic */ float d;
        private /* synthetic */ View e;

        f(float f, float f2, float f3, float f4, View view) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = view;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerGradientDrawable composerGradientDrawable = (ComposerGradientDrawable) obj;
            akcr.b(composerGradientDrawable, "it");
            composerGradientDrawable.setComposerBorderRadius(this.a, this.b, this.c, this.d);
            View view = this.e;
            if (view instanceof ComposerClippableView) {
                ((ComposerClippableView) view).getClipper().setBorderRadii(composerGradientDrawable.getComposerCornerRadiusArray(), composerGradientDrawable.getHasNonNullCornerRadius());
                this.e.invalidate();
            }
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbl<ComposerGradientDrawable, ajxw> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((ComposerGradientDrawable) obj, "it");
            return ajxw.a;
        }
    }

    static final class h extends akcs implements akbk<GestureAttributes> {
        private /* synthetic */ Context a;

        h(Context context) {
            this.a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new GestureAttributes(this.a);
        }
    }

    static final class i extends akcs implements akbl<ComposerGradientDrawable, ajxw> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerGradientDrawable composerGradientDrawable = (ComposerGradientDrawable) obj;
            akcr.b(composerGradientDrawable, "it");
            composerGradientDrawable.setStroke(0, 0);
            return ajxw.a;
        }
    }

    static final class j extends akcs implements akbl<ComposerGradientDrawable, ajxw> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((ComposerGradientDrawable) obj, "it");
            return ajxw.a;
        }
    }

    static final class k extends akcs implements akbk<ajxw> {
        private /* synthetic */ ViewAttributesBinder a;
        private /* synthetic */ View b;
        private /* synthetic */ float c;
        private /* synthetic */ boolean d;
        private /* synthetic */ float e;
        private /* synthetic */ boolean f;
        private /* synthetic */ float g;
        private /* synthetic */ boolean h;
        private /* synthetic */ float i;
        private /* synthetic */ boolean j;

        k(ViewAttributesBinder viewAttributesBinder, View view, float f, boolean z, float f2, boolean z2, float f3, boolean z3, float f4, boolean z4) {
            this.a = viewAttributesBinder;
            this.b = view;
            this.c = f;
            this.d = z;
            this.e = f2;
            this.f = z2;
            this.g = f3;
            this.h = z3;
            this.i = f4;
            this.j = z4;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.applyBorderRadius(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ViewAttributesBinder.class), "gestureAttributes", "getGestureAttributes()Lcom/snap/composer/attributes/impl/gestures/GestureAttributes;");
    }

    public ViewAttributesBinder(Context context, Logger logger) {
        akcr.b(context, "context");
        akcr.b(logger, "logger");
        this.c = logger;
        Object resources = context.getResources();
        akcr.a(resources, "context.resources");
        this.a = resources.getDisplayMetrics().density;
        this.b = ajxh.a(new h(context));
    }

    private final float a(float f, boolean z, float f2) {
        return !z ? f * this.a : f * f2;
    }

    private final GestureAttributes a() {
        return (GestureAttributes) this.b.b();
    }

    private static ComposerGradientDrawable a(View view, akbl<? super ComposerGradientDrawable, ajxw> akbl) {
        Drawable background = view.getBackground();
        if (background instanceof ComposerGradientDrawable) {
            akbl.invoke(background);
            return (ComposerGradientDrawable) background;
        }
        ComposerGradientDrawable composerGradientDrawable = new ComposerGradientDrawable();
        composerGradientDrawable.setShape(0);
        akbl.invoke(composerGradientDrawable);
        view.setBackground(composerGradientDrawable);
        return composerGradientDrawable;
    }

    private static void a(View view, float f, float f2, float f3, float f4, float f5, ComposerAnimator composerAnimator) {
        if (composerAnimator == null) {
            ViewUtils.INSTANCE.cancelAnimation(view, h);
            ViewUtils.INSTANCE.cancelAnimation(view, i);
            ViewUtils.INSTANCE.cancelAnimation(view, j);
            ViewUtils.INSTANCE.cancelAnimation(view, k);
            ViewUtils.INSTANCE.cancelAnimation(view, l);
            view.setTranslationX(f);
            view.setTranslationY(f2);
            view.setScaleX(f3);
            view.setScaleY(f4);
            view.setRotation(f5);
            return;
        }
        composerAnimator.addValueAnimator(h, view, ViewAnimator.Companion.animateTranslationX(view, f));
        composerAnimator.addValueAnimator(i, view, ViewAnimator.Companion.animateTranslationY(view, f2));
        composerAnimator.addValueAnimator(j, view, ViewAnimator.Companion.animateScaleX(view, f3));
        composerAnimator.addValueAnimator(k, view, ViewAnimator.Companion.animateScaleY(view, f4));
        composerAnimator.addValueAnimator(l, view, ViewAnimator.Companion.animateRotate(view, f5));
    }

    public static final /* synthetic */ void access$applyAccessibilityId(ViewAttributesBinder viewAttributesBinder, View view, String str, ComposerAnimator composerAnimator) {
    }

    public static final /* synthetic */ void access$applyElevation(ViewAttributesBinder viewAttributesBinder, View view, float f, ComposerAnimator composerAnimator) {
        if (VERSION.SDK_INT >= 21) {
            ViewUtils.INSTANCE.cancelAnimation(view, m);
            Object context = view.getContext();
            akcr.a(context, "view.context");
            context = context.getResources();
            akcr.a(context, "view.context.resources");
            float applyDimension = TypedValue.applyDimension(1, f, context.getDisplayMetrics());
            if (composerAnimator == null) {
                view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                view.setElevation(applyDimension);
                return;
            }
            composerAnimator.addValueAnimator(m, view, ViewAnimator.Companion.animateElevation(view, applyDimension));
        }
    }

    public static final /* synthetic */ void access$resetAccessibilityId(ViewAttributesBinder viewAttributesBinder, View view, ComposerAnimator composerAnimator) {
    }

    public static final /* synthetic */ void access$resetElevation(ViewAttributesBinder viewAttributesBinder, View view, ComposerAnimator composerAnimator) {
        if (VERSION.SDK_INT >= 21) {
            ViewUtils.INSTANCE.cancelAnimation(view, m);
            if (composerAnimator == null) {
                view.setElevation(MapboxConstants.MINIMUM_ZOOM);
            } else {
                composerAnimator.addValueAnimator(m, view, ViewAnimator.Companion.animateElevation(view, MapboxConstants.MINIMUM_ZOOM));
            }
        }
    }

    public final void applyAlpha(View view, float f, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        ViewUtils.INSTANCE.cancelAnimation(view, d);
        if (composerAnimator == null) {
            view.setAlpha(f);
        } else {
            composerAnimator.addValueAnimator(d, view, ViewAnimator.Companion.animateAlpha(view, f));
        }
    }

    public final void applyBackground(View view, Object[] objArr, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        akcr.b(objArr, "value");
        if (objArr.length == 2) {
            Object obj = objArr[0];
            if (!(obj instanceof Object[])) {
                obj = null;
            }
            Object[] objArr2 = (Object[]) obj;
            if (objArr2 != null) {
                Object obj2 = objArr[1];
                if (!(obj2 instanceof Object[])) {
                    obj2 = null;
                }
                if (((Object[]) obj2) != null) {
                    if ((objArr2.length == 0 ? 1 : null) != null) {
                        resetBackgroundInternal(view, composerAnimator);
                        return;
                    } else if (objArr2.length == 1) {
                        com.snap.composer.attributes.conversions.ColorConversions.Companion companion = ColorConversions.Companion;
                        Object obj3 = objArr2[0];
                        if (obj3 != null) {
                            applyBackgroundColor(view, companion.fromRGBA(((Long) obj3).longValue()), composerAnimator);
                            return;
                        }
                        throw new ajxt("null cannot be cast to non-null type kotlin.Long");
                    } else {
                        a(view, new a(objArr2));
                        return;
                    }
                }
                throw new AttributeError("locations should be an array");
            }
            throw new AttributeError("colors should be an array");
        }
        throw new AttributeError("background should have two values in the given array");
    }

    public final void applyBackgroundColor(View view, int i, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        ViewUtils.INSTANCE.cancelAnimation(view, e);
        if (composerAnimator == null) {
            a(view, new b(i));
            return;
        }
        Drawable background = view.getBackground();
        if (background == null) {
            a(view, c.a);
        }
        Object obj = e;
        com.snap.composer.attributes.impl.animations.ColorAnimator.Companion companion = ColorAnimator.Companion;
        if (background != null) {
            composerAnimator.addValueAnimator(obj, view, companion.animateGradientDrawable((ComposerGradientDrawable) background, new int[]{i}));
            return;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.composer.drawables.ComposerGradientDrawable");
    }

    public final void applyBorder(View view, Object[] objArr, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        akcr.b(objArr, "value");
        ViewUtils.INSTANCE.cancelAnimation(view, g);
        int asFloat = (int) (JSConversions.INSTANCE.asFloat(objArr[0]) * this.a);
        int fromRGBA = ColorConversions.Companion.fromRGBA(JSConversions.INSTANCE.asLong(objArr[1]));
        if (composerAnimator == null) {
            a(view, new d(asFloat, fromRGBA));
            return;
        }
        composerAnimator.addValueAnimator(g, view, ViewAnimator.Companion.animateBorder(a(view, e.a), asFloat, fromRGBA));
    }

    public final void applyBorderRadius(View view, float f, boolean z, float f2, boolean z2, float f3, boolean z3, float f4, boolean z4, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        float min = ((float) Math.min(view.getWidth(), view.getHeight())) / 100.0f;
        float a = a(f, z, min);
        float a2 = a(f2, z2, min);
        float a3 = a(f3, z3, min);
        f4 = a(f4, z4, min);
        ViewUtils.INSTANCE.cancelAnimation(view, f);
        if (composerAnimator == null) {
            a(view, new f(a, a2, a3, f4, view));
            return;
        }
        composerAnimator.addValueAnimator(f, view, ViewAnimator.Companion.animateBorderRadius(view, a(view, g.a), a, a2, a3, f4));
    }

    public final void applyBoxShadow(View view, Object[] objArr, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        akcr.b(objArr, "value");
        LoggerUtilsKt.warn(this.c, "boxShadow is not implemented on Android.");
    }

    public final void applyOverflow(View view, String str, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        akcr.b(str, "value");
        int hashCode = str.hashCode();
        boolean z = false;
        if (hashCode == -1217487446) {
            if (str.equals("hidden")) {
                z = true;
            }
            throw new AttributeError("Unsupported overflow value");
        } else if (hashCode != -907680051) {
            throw new AttributeError("Unsupported overflow value");
        } else {
            throw new AttributeError("Unsupported overflow value");
        }
        LoggerUtilsKt.error(this.c, "overflow is deprecated, please use the slow-clipping property instead.");
        applySlowClipping(view, z, composerAnimator);
    }

    public final void applySlowClipping(View view, boolean z, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        if (view instanceof ComposerClippableView) {
            ComposerClippableView composerClippableView = (ComposerClippableView) view;
            if (composerClippableView.getClipToBounds() != z) {
                composerClippableView.setClipToBounds(z);
                view.invalidate();
            }
            return;
        }
        Logger logger = this.c;
        StringBuilder stringBuilder = new StringBuilder("overflow can only be set on a clippable view, ");
        stringBuilder.append(view.getClass().getName());
        stringBuilder.append(" isn't");
        LoggerUtilsKt.error(logger, stringBuilder.toString());
    }

    public final void applyTouchEnabled(View view, boolean z, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        view.setEnabled(z);
    }

    public final void applyTransform(View view, Object obj, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 5) {
                Object obj2 = objArr[0];
                if (!(obj2 instanceof Double)) {
                    obj2 = null;
                }
                Double d = (Double) obj2;
                float f = MapboxConstants.MINIMUM_ZOOM;
                float doubleValue = d != null ? (float) d.doubleValue() : MapboxConstants.MINIMUM_ZOOM;
                Object obj3 = objArr[1];
                if (!(obj3 instanceof Double)) {
                    obj3 = null;
                }
                Double d2 = (Double) obj3;
                if (d2 != null) {
                    f = (float) d2.doubleValue();
                }
                obj3 = objArr[2];
                if (!(obj3 instanceof Double)) {
                    obj3 = null;
                }
                d2 = (Double) obj3;
                float f2 = 1.0f;
                float doubleValue2 = d2 != null ? (float) d2.doubleValue() : 1.0f;
                Object obj4 = objArr[3];
                if (!(obj4 instanceof Double)) {
                    obj4 = null;
                }
                Double d3 = (Double) obj4;
                if (d3 != null) {
                    f2 = (float) d3.doubleValue();
                }
                Object obj5 = objArr[4];
                if (!(obj5 instanceof Double)) {
                    obj5 = null;
                }
                Double d4 = (Double) obj5;
                float toDegrees = (float) Math.toDegrees(d4 != null ? d4.doubleValue() : 0.0d);
                Object context = view.getContext();
                akcr.a(context, "view.context");
                context = context.getResources();
                akcr.a(context, "view.context.resources");
                DisplayMetrics displayMetrics = context.getDisplayMetrics();
                a(view, TypedValue.applyDimension(1, doubleValue, displayMetrics), TypedValue.applyDimension(1, f, displayMetrics), doubleValue2, f2, toDegrees, composerAnimator);
                return;
            }
            throw new AttributeError("transform should have five values in the given array");
        }
        throw new AttributeError("transform should be an array");
    }

    public final void bindAttributes(AttributesBindingContext<? extends View> attributesBindingContext) {
        akcr.b(attributesBindingContext, "attributesBindingContext");
        attributesBindingContext.getBindingContext().bindUntypedAttribute("background", false, new ViewAttributesBinder$bindAttributes$$inlined$bindArrayAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindColorAttribute(Attributes.BG_COLOR, false, new ViewAttributesBinder$bindAttributes$$inlined$bindColorAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindDoubleAttribute("opacity", false, new ViewAttributesBinder$bindAttributes$$inlined$bindFloatAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindBorderAttribute("borderRadius", false, new ViewAttributesBinder$bindAttributes$$inlined$bindCornersAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindUntypedAttribute("border", false, new ViewAttributesBinder$bindAttributes$$inlined$bindArrayAttribute$2(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("touchEnabled", false, new ViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindUntypedAttribute("boxShadow", false, new ViewAttributesBinder$bindAttributes$$inlined$bindArrayAttribute$3(this, this));
        attributesBindingContext.getBindingContext().bindStringAttribute("accessibilityId", false, new ViewAttributesBinder$bindAttributes$$inlined$bindStringAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindDoubleAttribute("elevation", false, new ViewAttributesBinder$bindAttributes$$inlined$bindFloatAttribute$2(this, this));
        attributesBindingContext.getBindingContext().bindStringAttribute("overflow", false, new ViewAttributesBinder$bindAttributes$$inlined$bindStringAttribute$2(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("slowClipping", false, new ViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$2(this, this));
        CompositeAttributePart[] compositeAttributePartArr = new CompositeAttributePart[5];
        compositeAttributePartArr[0] = new CompositeAttributePart("translationX", AttributeType.DOUBLE, true, false);
        compositeAttributePartArr[1] = new CompositeAttributePart("translationY", AttributeType.DOUBLE, true, false);
        compositeAttributePartArr[2] = new CompositeAttributePart("scaleX", AttributeType.DOUBLE, true, false);
        compositeAttributePartArr[3] = new CompositeAttributePart("scaleY", AttributeType.DOUBLE, true, false);
        compositeAttributePartArr[4] = new CompositeAttributePart("rotation", AttributeType.DOUBLE, true, false);
        String str = "transform";
        attributesBindingContext.getBindingContext().bindCompositeAttribute(str, ajym.d(compositeAttributePartArr), new ViewAttributesBinder$bindAttributes$$inlined$bindCompositeAttribute$1(this, this));
        GestureAttributes a = a();
        String str2 = "onTap";
        attributesBindingContext.getBindingContext().bindUntypedAttribute(str2, false, new ViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$1(a(), a));
        a = a();
        str2 = "onLongPress";
        attributesBindingContext.getBindingContext().bindUntypedAttribute(str2, false, new ViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$2(a(), a));
        a = a();
        str2 = "onDrag";
        attributesBindingContext.getBindingContext().bindUntypedAttribute(str2, false, new ViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$3(a(), a));
        a = a();
        str2 = "onPinch";
        attributesBindingContext.getBindingContext().bindUntypedAttribute(str2, false, new ViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$4(a(), a));
        a = a();
        str2 = "onRotate";
        attributesBindingContext.getBindingContext().bindUntypedAttribute(str2, false, new ViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$5(a(), a));
        a = a();
        str2 = "onTouchStart";
        attributesBindingContext.getBindingContext().bindUntypedAttribute(str2, false, new ViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$6(a(), a));
        a = a();
        str2 = "onTouch";
        attributesBindingContext.getBindingContext().bindUntypedAttribute(str2, false, new ViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$7(a(), a));
        a = a();
        str2 = "onTouchEnd";
        attributesBindingContext.getBindingContext().bindUntypedAttribute(str2, false, new ViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$8(a(), a));
    }

    public final Logger getLogger() {
        return this.c;
    }

    public final View getMeasurerPlaceholderView() {
        return null;
    }

    public final Class<View> getViewClass() {
        return View.class;
    }

    public final void resetAlpha(View view, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        ViewUtils.INSTANCE.cancelAnimation(view, d);
        if (composerAnimator == null) {
            view.setAlpha(1.0f);
        } else {
            composerAnimator.addValueAnimator(d, view, ViewAnimator.Companion.animateAlpha(view, 1.0f));
        }
    }

    public final void resetBackground(View view, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        resetBackgroundInternal(view, composerAnimator);
    }

    public final void resetBackgroundInternal(View view, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        ViewUtils.INSTANCE.cancelAnimation(view, e);
        Drawable background = view.getBackground();
        if (background instanceof ComposerGradientDrawable) {
            if (composerAnimator != null) {
                composerAnimator.addValueAnimator(e, view, ColorAnimator.Companion.animateGradientDrawable((ComposerGradientDrawable) background, new int[]{0}));
                return;
            }
            ((ComposerGradientDrawable) background).setColor(0);
        }
    }

    public final void resetBorder(View view, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        ViewUtils.INSTANCE.cancelAnimation(view, g);
        if (composerAnimator == null) {
            a(view, i.a);
            return;
        }
        composerAnimator.addValueAnimator(g, view, ViewAnimator.Companion.animateBorder(a(view, j.a), 0, 0));
    }

    public final void resetBorderRadius(View view, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        applyBorderRadius(view, MapboxConstants.MINIMUM_ZOOM, false, MapboxConstants.MINIMUM_ZOOM, false, MapboxConstants.MINIMUM_ZOOM, false, MapboxConstants.MINIMUM_ZOOM, false, composerAnimator);
        ComposerViewNode findViewNode = ViewUtils.INSTANCE.findViewNode(view);
        if (findViewNode != null) {
            findViewNode.removeDidFinishLayoutForKey("borderRadius");
        }
    }

    public final void resetBoxShadow(View view, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
    }

    public final void resetOverflow(View view, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        resetSlowClipping(view, composerAnimator);
    }

    public final void resetSlowClipping(View view, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        if (view instanceof ComposerClippableView) {
            ComposerClippableView composerClippableView = (ComposerClippableView) view;
            if (composerClippableView.getClipToBounds() != composerClippableView.getClipToBoundsDefaultValue()) {
                composerClippableView.setClipToBounds(composerClippableView.getClipToBoundsDefaultValue());
                view.invalidate();
            }
        }
    }

    public final void resetTouchEnabled(View view, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        view.setEnabled(true);
    }

    public final void resetTransform(View view, ComposerAnimator composerAnimator) {
        akcr.b(view, "view");
        a(view, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, composerAnimator);
    }

    public final void setBorderRadius(View view, float f, boolean z, float f2, boolean z2, float f3, boolean z3, float f4, boolean z4, ComposerAnimator composerAnimator) {
        View view2 = view;
        akcr.b(view, "view");
        applyBorderRadius(view, f, z, f2, z2, f3, z3, f4, z4, composerAnimator);
        ComposerViewNode findViewNode = ViewUtils.INSTANCE.findViewNode(view);
        if (findViewNode != null) {
            String str = "borderRadius";
            if (z || z2 || z3 || z4) {
                findViewNode.setDidFinishLayoutForKey(str, new k(this, view, f, z, f2, z2, f3, z3, f4, z4));
            } else {
                findViewNode.removeDidFinishLayoutForKey(str);
            }
        }
    }
}
