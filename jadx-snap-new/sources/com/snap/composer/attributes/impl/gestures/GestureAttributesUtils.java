package com.snap.composer.attributes.impl.gestures;

import android.view.View;
import android.view.ViewParent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.views.touches.ComposerGestureRecognizerState;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import java.util.HashMap;
import java.util.Map;

public final class GestureAttributesUtils {
    public static final GestureAttributesUtils INSTANCE = new GestureAttributesUtils();
    private static final HashMap<String, Object> a = new HashMap();
    private static final Object[] b = new Object[]{a};

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

    private GestureAttributesUtils() {
    }

    public final void buildGestureParams(Map<String, Object> map, View view, ComposerGestureRecognizerState composerGestureRecognizerState, int i, int i2) {
        akcr.b(map, "params");
        akcr.b(view, "view");
        String str = "state";
        akcr.b(composerGestureRecognizerState, str);
        Object context = view.getContext();
        akcr.a(context, "view.context");
        context = context.getResources();
        akcr.a(context, "view.context.resources");
        float f = context.getDisplayMetrics().density;
        if (f > MapboxConstants.MINIMUM_ZOOM) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[composerGestureRecognizerState.ordinal()];
            int i4 = 2;
            if (i3 == 1) {
                i4 = 0;
            } else if (i3 == 2) {
                i4 = 1;
            } else if (i3 != 3) {
                return;
            }
            ComposerContext findComposerContext = ViewUtils.INSTANCE.findComposerContext(view);
            View rootView = findComposerContext != null ? findComposerContext.getRootView() : null;
            if (rootView != null) {
                int i5 = i;
                int i6 = i2;
                while (view != null && view != rootView) {
                    i5 += view.getLeft();
                    i6 += view.getTop();
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        parent = null;
                    }
                    view = (View) parent;
                }
                map.put(str, Integer.valueOf(i4));
                map.put("x", Float.valueOf(((float) i) / f));
                map.put("y", Float.valueOf(((float) i2) / f));
                map.put("absoluteX", Float.valueOf(((float) i5) / f));
                map.put("absoluteY", Float.valueOf(((float) i6) / f));
            }
        }
    }

    public final Object[] getGestureParams(View view, ComposerGestureRecognizerState composerGestureRecognizerState, int i, int i2) {
        akcr.b(view, "view");
        akcr.b(composerGestureRecognizerState, "state");
        GestureAttributesUtils gestureAttributesUtils = INSTANCE;
        gestureAttributesUtils.buildGestureParams(gestureAttributesUtils.getParams(), view, composerGestureRecognizerState, i, i2);
        gestureAttributesUtils.getParams();
        return gestureAttributesUtils.getParamsContainer();
    }

    public final Object[] getGestureParams(View view, ComposerGestureRecognizerState composerGestureRecognizerState, int i, int i2, akbl<? super Map<String, Object>, ajxw> akbl) {
        akcr.b(view, "view");
        akcr.b(composerGestureRecognizerState, "state");
        akcr.b(akbl, "additionalParamsBuilder");
        buildGestureParams(getParams(), view, composerGestureRecognizerState, i, i2);
        akbl.invoke(getParams());
        return getParamsContainer();
    }

    public final HashMap<String, Object> getParams() {
        return a;
    }

    public final Object[] getParamsContainer() {
        return b;
    }
}
