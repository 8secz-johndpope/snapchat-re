package com.snap.composer.attributes.impl;

import com.snap.composer.actions.ComposerAction;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.AttributesBindingContext;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.views.ComposerScrollView;
import com.snap.composer.views.ComposerScrollView.PageChangedListener;
import com.snap.composer.views.ComposerScrollView.ScrollChangeListener;
import com.snapchat.client.composer.AttributeType;
import com.snapchat.client.composer.CompositeAttributePart;
import defpackage.ajym;
import defpackage.akcr;
import defpackage.akdp;
import java.util.HashMap;
import java.util.Map;

public final class ScrollViewAttributesBinder implements AttributesBinder<ComposerScrollView> {

    public static final class ScrollChangedListener implements PageChangedListener, ScrollChangeListener {
        private ComposerAction a;
        private ComposerAction b;
        private final HashMap<String, Object> c = new HashMap();
        private final HashMap<String, Object>[] d = new HashMap[]{this.c};
        private final HashMap<String, Object> e = new HashMap();
        private final HashMap<String, Object>[] f = new HashMap[]{this.e};
        private final ComposerScrollView g;

        public ScrollChangedListener(ComposerScrollView composerScrollView) {
            akcr.b(composerScrollView, "scrollView");
            this.g = composerScrollView;
        }

        public final ComposerAction getScrollAction() {
            return this.a;
        }

        public final ComposerAction getScrollEndAction() {
            return this.b;
        }

        public final void onPageChanged(ComposerScrollView composerScrollView, int i) {
            akcr.b(composerScrollView, "scrollView");
        }

        public final void onScrollChange(int i, int i2) {
            this.c.clear();
            boolean horizontalScroll = this.g.getHorizontalScroll();
            String str = "scrollView.context.resources";
            String str2 = "scrollView.context";
            String str3 = "y";
            Integer valueOf = Integer.valueOf(0);
            String str4 = "x";
            Object resources;
            if (horizontalScroll) {
                Map map = this.c;
                float normalizedContentOffsetX = (float) this.g.getNormalizedContentOffsetX();
                Object context = this.g.getContext();
                akcr.a(context, str2);
                resources = context.getResources();
                akcr.a(resources, str);
                map.put(str4, Float.valueOf(normalizedContentOffsetX / resources.getDisplayMetrics().density));
                this.c.put(str3, valueOf);
            } else {
                this.c.put(str4, valueOf);
                Map map2 = this.c;
                float f = (float) i;
                Object context2 = this.g.getContext();
                akcr.a(context2, str2);
                resources = context2.getResources();
                akcr.a(resources, str);
                map2.put(str3, Float.valueOf(f / resources.getDisplayMetrics().density));
            }
            ComposerAction composerAction = this.a;
            if (composerAction != null) {
                composerAction.perform(this.d);
            }
        }

        public final void onScrollEnd(int i) {
            this.e.clear();
            boolean horizontalScroll = this.g.getHorizontalScroll();
            String str = "offsetY";
            Integer valueOf = Integer.valueOf(0);
            String str2 = "offsetX";
            String str3 = "contentWidth";
            String str4 = "contentHeight";
            String str5 = "scrollView.context.resources";
            String str6 = "scrollView.context";
            Object context;
            if (horizontalScroll) {
                Map map = this.e;
                float pageSize = (float) this.g.getPageSize();
                context = this.g.getContext();
                akcr.a(context, str6);
                context = context.getResources();
                akcr.a(context, str5);
                map.put(str4, Float.valueOf(pageSize / context.getDisplayMetrics().density));
                map = this.e;
                pageSize = (float) this.g.getContentSize();
                Object context2 = this.g.getContext();
                akcr.a(context2, str6);
                context2 = context2.getResources();
                akcr.a(context2, str5);
                map.put(str3, Float.valueOf(pageSize / context2.getDisplayMetrics().density));
                map = this.e;
                pageSize = (float) this.g.getNormalizedContentOffsetX();
                Object context3 = this.g.getContext();
                akcr.a(context3, str6);
                context3 = context3.getResources();
                akcr.a(context3, str5);
                map.put(str2, Float.valueOf(pageSize / context3.getDisplayMetrics().density));
                this.e.put(str, valueOf);
            } else {
                Map map2 = this.e;
                float contentSize = (float) this.g.getContentSize();
                Object context4 = this.g.getContext();
                akcr.a(context4, str6);
                context4 = context4.getResources();
                akcr.a(context4, str5);
                map2.put(str4, Float.valueOf(contentSize / context4.getDisplayMetrics().density));
                map2 = this.e;
                float pageSize2 = (float) this.g.getPageSize();
                context = this.g.getContext();
                akcr.a(context, str6);
                context = context.getResources();
                akcr.a(context, str5);
                map2.put(str3, Float.valueOf(pageSize2 / context.getDisplayMetrics().density));
                this.e.put(str2, valueOf);
                map2 = this.e;
                float f = (float) i;
                Object context5 = this.g.getContext();
                akcr.a(context5, str6);
                context5 = context5.getResources();
                akcr.a(context5, str5);
                map2.put(str, Float.valueOf(f / context5.getDisplayMetrics().density));
            }
            ComposerAction composerAction = this.b;
            if (composerAction != null) {
                composerAction.perform(this.f);
            }
        }

        public final void setScrollAction(ComposerAction composerAction) {
            this.a = composerAction;
        }

        public final void setScrollEndAction(ComposerAction composerAction) {
            this.b = composerAction;
        }
    }

    private static ScrollChangedListener a(ComposerScrollView composerScrollView) {
        PageChangedListener onPageChangedListener = composerScrollView.getOnPageChangedListener();
        if (!(onPageChangedListener instanceof ScrollChangedListener)) {
            onPageChangedListener = null;
        }
        ScrollChangedListener scrollChangedListener = (ScrollChangedListener) onPageChangedListener;
        if (scrollChangedListener != null) {
            return scrollChangedListener;
        }
        scrollChangedListener = new ScrollChangedListener(composerScrollView);
        composerScrollView.setOnScrollChangeListener(scrollChangedListener);
        composerScrollView.setOnPageChangedListener(scrollChangedListener);
        return scrollChangedListener;
    }

    public static final /* synthetic */ void access$applyDismissKeyboardOnDrag(ScrollViewAttributesBinder scrollViewAttributesBinder, ComposerScrollView composerScrollView, boolean z, ComposerAnimator composerAnimator) {
    }

    public static final /* synthetic */ void access$resetDismissKeyboardOnDrag(ScrollViewAttributesBinder scrollViewAttributesBinder, ComposerScrollView composerScrollView, ComposerAnimator composerAnimator) {
    }

    private static void b(ComposerScrollView composerScrollView) {
        PageChangedListener onPageChangedListener = composerScrollView.getOnPageChangedListener();
        if (!(onPageChangedListener instanceof ScrollChangedListener)) {
            onPageChangedListener = null;
        }
        ScrollChangedListener scrollChangedListener = (ScrollChangedListener) onPageChangedListener;
        if (scrollChangedListener != null && scrollChangedListener.getScrollAction() == null && scrollChangedListener.getScrollEndAction() == null) {
            composerScrollView.setOnScrollChangeListener(null);
            composerScrollView.setOnPageChangedListener(null);
        }
    }

    public final void applyContentOffset(ComposerScrollView composerScrollView, Object obj, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 3) {
                Object context = composerScrollView.getContext();
                akcr.a(context, "view.context");
                context = context.getResources();
                akcr.a(context, "view.context.resources");
                float f = context.getDisplayMetrics().density;
                Object obj2 = objArr[2];
                if (!(obj2 instanceof Boolean)) {
                    obj2 = null;
                }
                Boolean bool = (Boolean) obj2;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Object obj3 = objArr[0];
                if (!(obj3 instanceof Double)) {
                    obj3 = null;
                }
                Double d = (Double) obj3;
                double d2 = 0.0d;
                double doubleValue = d != null ? d.doubleValue() : 0.0d;
                obj = objArr[1];
                if (!(obj instanceof Double)) {
                    obj = null;
                }
                Double d3 = (Double) obj;
                if (d3 != null) {
                    d2 = d3.doubleValue();
                }
                double d4 = (double) f;
                Double.isNaN(d4);
                int a = akdp.a(doubleValue * d4);
                Double.isNaN(d4);
                int a2 = akdp.a(d2 * d4);
                if (composerScrollView.getRtlOffsetX() != 0) {
                    a = composerScrollView.getRtlOffsetX() - a;
                }
                composerScrollView.setContentOffset(a, a2, booleanValue);
                return;
            }
            throw new AttributeError("contentOffset should have three values in the given array");
        }
        throw new AttributeError("contentOffset should be an array");
    }

    public final void applyHorizontal(ComposerScrollView composerScrollView, boolean z, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        composerScrollView.setHorizontalScroll(z);
    }

    public final void applyOnScroll(ComposerScrollView composerScrollView, ComposerAction composerAction) {
        akcr.b(composerScrollView, "view");
        akcr.b(composerAction, "action");
        a(composerScrollView).setScrollAction(composerAction);
    }

    public final void applyOnScrollEnd(ComposerScrollView composerScrollView, ComposerAction composerAction) {
        akcr.b(composerScrollView, "view");
        akcr.b(composerAction, "action");
        a(composerScrollView).setScrollEndAction(composerAction);
    }

    public final void applyPagingEnabled(ComposerScrollView composerScrollView, boolean z, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        composerScrollView.setPagingEnabled(z);
    }

    public final void applyShowsHoriztonalScrollIndicator(ComposerScrollView composerScrollView, boolean z, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        composerScrollView.setHorizontalScrollBarEnabled(z);
    }

    public final void applyShowsScrollIndicator(ComposerScrollView composerScrollView, boolean z, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        composerScrollView.setHorizontalScrollBarEnabled(z);
        composerScrollView.setVerticalScrollBarEnabled(z);
    }

    public final void applyShowsVerticalScrollIndicator(ComposerScrollView composerScrollView, boolean z, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        composerScrollView.setVerticalScrollBarEnabled(z);
    }

    public final void bindAttributes(AttributesBindingContext<ComposerScrollView> attributesBindingContext) {
        akcr.b(attributesBindingContext, "attributesBindingContext");
        attributesBindingContext.getBindingContext().bindBooleanAttribute("horizontal", true, new ScrollViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("pagingEnabled", false, new ScrollViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$2(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("showsScrollIndicator", false, new ScrollViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$3(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("showsHorizontalScrollIndicator", false, new ScrollViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$4(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("showsVerticalScrollIndicator", false, new ScrollViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$5(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("alwaysBounceVertical", false, new ScrollViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$6(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("alwaysBounceHorizontal", false, new ScrollViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$7(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("glow", false, new ScrollViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$8(this, this));
        attributesBindingContext.getBindingContext().bindUntypedAttribute("onScroll", false, new ScrollViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindUntypedAttribute("onScrollEnd", false, new ScrollViewAttributesBinder$bindAttributes$$inlined$bindActionAttribute$2(this, this));
        CompositeAttributePart[] compositeAttributePartArr = new CompositeAttributePart[3];
        compositeAttributePartArr[0] = new CompositeAttributePart("contentOffsetX", AttributeType.DOUBLE, true, false);
        compositeAttributePartArr[1] = new CompositeAttributePart("contentOffsetY", AttributeType.DOUBLE, true, false);
        compositeAttributePartArr[2] = new CompositeAttributePart("contentOffsetAnimated", AttributeType.BOOLEAN, true, false);
        String str = "contentOffset";
        attributesBindingContext.getBindingContext().bindCompositeAttribute(str, ajym.d(compositeAttributePartArr), new ScrollViewAttributesBinder$bindAttributes$$inlined$bindCompositeAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("dismissKeyboardOnDrag", false, new ScrollViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$9(this, this));
    }

    public final ComposerScrollView getMeasurerPlaceholderView() {
        return null;
    }

    public final Class<ComposerScrollView> getViewClass() {
        return ComposerScrollView.class;
    }

    public final void resetContentOffset(ComposerScrollView composerScrollView, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        composerScrollView.setContentOffset(0);
    }

    public final void resetHorizontal(ComposerScrollView composerScrollView, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        composerScrollView.setHorizontalScroll(false);
    }

    public final void resetOnScroll(ComposerScrollView composerScrollView) {
        akcr.b(composerScrollView, "view");
        PageChangedListener onPageChangedListener = composerScrollView.getOnPageChangedListener();
        if (!(onPageChangedListener instanceof ScrollChangedListener)) {
            onPageChangedListener = null;
        }
        ScrollChangedListener scrollChangedListener = (ScrollChangedListener) onPageChangedListener;
        if (scrollChangedListener != null) {
            scrollChangedListener.setScrollAction(null);
        }
        b(composerScrollView);
    }

    public final void resetOnScrollEnd(ComposerScrollView composerScrollView) {
        akcr.b(composerScrollView, "view");
        PageChangedListener onPageChangedListener = composerScrollView.getOnPageChangedListener();
        if (!(onPageChangedListener instanceof ScrollChangedListener)) {
            onPageChangedListener = null;
        }
        ScrollChangedListener scrollChangedListener = (ScrollChangedListener) onPageChangedListener;
        if (scrollChangedListener != null) {
            scrollChangedListener.setScrollEndAction(null);
        }
        b(composerScrollView);
    }

    public final void resetPagingEnabled(ComposerScrollView composerScrollView, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        composerScrollView.setPagingEnabled(false);
    }

    public final void resetShowsHorizontalScrollIndicator(ComposerScrollView composerScrollView, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        composerScrollView.setHorizontalScrollBarEnabled(true);
    }

    public final void resetShowsScrollIndicator(ComposerScrollView composerScrollView, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        composerScrollView.setHorizontalScrollBarEnabled(true);
        composerScrollView.setVerticalScrollBarEnabled(true);
    }

    public final void resetShowsVerticalScrollIndicator(ComposerScrollView composerScrollView, ComposerAnimator composerAnimator) {
        akcr.b(composerScrollView, "view");
        composerScrollView.setVerticalScrollBarEnabled(true);
    }
}
