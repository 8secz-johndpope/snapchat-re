package com.snap.composer.yoga;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ajxt;
import defpackage.akco;
import defpackage.akcr;
import java.util.HashMap;

public class YogaView extends ViewGroup {
    public static final Companion Companion = new Companion();
    private static int c;
    private static int d;
    private static final ViewMeasureFunction e = new ViewMeasureFunction();
    private final HashMap<View, YogaNode> a = new HashMap();
    private final YogaNode b = new YogaNode();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final int getCurrentYogaMeasureHeight() {
            return YogaView.d;
        }

        public final int getCurrentYogaMeasureWidth() {
            return YogaView.c;
        }

        public final ViewMeasureFunction getViewMeasureFunction() {
            return YogaView.e;
        }
    }

    public static final class ViewMeasureFunction implements YogaMeasureFunction {
        private static int a(YogaMeasureMode yogaMeasureMode) {
            return yogaMeasureMode == YogaMeasureMode.AT_MOST ? Integer.MIN_VALUE : yogaMeasureMode == YogaMeasureMode.EXACTLY ? AudioPlayer.INFINITY_LOOP_COUNT : 0;
        }

        public final long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            akcr.b(yogaNode, "node");
            akcr.b(yogaMeasureMode, "widthMode");
            akcr.b(yogaMeasureMode2, "heightMode");
            Object i = yogaNode.i();
            if (i != null) {
                View view = (View) i;
                if (view instanceof YogaView) {
                    return YogaMeasureOutput.a(0, 0);
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec((int) f, a(yogaMeasureMode));
                int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec((int) f2, a(yogaMeasureMode2));
                YogaView.c = makeMeasureSpec;
                YogaView.d = makeMeasureSpec2;
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                return YogaMeasureOutput.a(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            throw new ajxt("null cannot be cast to non-null type android.view.View");
        }
    }

    public YogaView(Context context) {
        akcr.b(context, "context");
        super(context);
        this.b.a((Object) this);
    }

    private final void a(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        i = MeasureSpec.getMode(i);
        i2 = MeasureSpec.getMode(i2);
        if (i2 == AudioPlayer.INFINITY_LOOP_COUNT) {
            this.b.b((float) size2);
        }
        if (i == AudioPlayer.INFINITY_LOOP_COUNT) {
            this.b.a((float) size);
        }
        if (i2 == Integer.MIN_VALUE) {
            this.b.d((float) size2);
        }
        if (i == Integer.MIN_VALUE) {
            this.b.c((float) size);
        }
        this.b.c();
    }

    private final void a(View view, boolean z) {
        Object obj = (YogaNode) this.a.get(view);
        if (obj != null) {
            YogaNode b = obj.b();
            if (b == null) {
                akcr.a();
            }
            int a = b.a();
            for (int i = 0; i < a; i++) {
                if (akcr.a(b.a(i), obj)) {
                    b.b(i);
                    break;
                }
            }
            obj.a(null);
            this.a.remove(view);
            if (z) {
                this.b.c();
            }
        }
    }

    private final void a(YogaNode yogaNode, float f, float f2) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        Object i = yogaNode.i();
        if (!(i instanceof View)) {
            i = null;
        }
        i = (View) i;
        if (!(i == null || (akcr.a(i, (Object) this) ^ 1) == 0)) {
            if (i.getVisibility() != 8) {
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(Math.round(yogaNode.g()), AudioPlayer.INFINITY_LOOP_COUNT);
                makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(Math.round(yogaNode.h()), AudioPlayer.INFINITY_LOOP_COUNT);
                c = makeMeasureSpec;
                d = makeMeasureSpec2;
                i.measure(makeMeasureSpec, makeMeasureSpec2);
                i.layout(Math.round(yogaNode.e() + f), Math.round(yogaNode.f() + f2), Math.round((yogaNode.e() + f) + yogaNode.g()), Math.round((yogaNode.f() + f2) + yogaNode.h()));
            } else {
                return;
            }
        }
        makeMeasureSpec = yogaNode.a();
        for (makeMeasureSpec2 = 0; makeMeasureSpec2 < makeMeasureSpec; makeMeasureSpec2++) {
            String str = "node.getChildAt(i)";
            Object a;
            if (akcr.a((Object) this, i)) {
                a = yogaNode.a(makeMeasureSpec2);
                akcr.a(a, str);
                a(a, f, f2);
            } else if (!(i instanceof YogaView)) {
                a = yogaNode.a(makeMeasureSpec2);
                akcr.a(a, str);
                a(a, yogaNode.e() + f, yogaNode.f() + f2);
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        akcr.b(view, "child");
        akcr.b(layoutParams, "params");
        super.addView(view, i, layoutParams);
        if (!this.a.containsKey(view)) {
            Object obj;
            if (view instanceof YogaView) {
                obj = ((YogaView) view).b;
            } else {
                obj = new YogaNode();
                obj.a((Object) view);
                obj.a((YogaMeasureFunction) e);
            }
            this.a.put(view, obj);
            YogaNode yogaNode = this.b;
            yogaNode.a(obj, yogaNode.a());
        }
    }

    public final YogaNode getYogaNode() {
        return this.b;
    }

    public final YogaNode getYogaNodeForView(View view) {
        akcr.b(view, "view");
        return (YogaNode) this.a.get(view);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!(getParent() instanceof YogaView)) {
            i4 -= i2;
            if (Math.round(this.b.h()) != i4) {
                i3 -= i;
                if (Math.round(this.b.g()) != i3) {
                    a(MeasureSpec.makeMeasureSpec(i3, AudioPlayer.INFINITY_LOOP_COUNT), MeasureSpec.makeMeasureSpec(i4, AudioPlayer.INFINITY_LOOP_COUNT));
                }
            }
        }
        a(this.b, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (!(getParent() instanceof YogaView)) {
            a(i, i2);
        }
        setMeasuredDimension(Math.round(this.b.g()), Math.round(this.b.h()));
    }

    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            akcr.a((Object) childAt, "this.getChildAt(i)");
            a(childAt, false);
        }
        super.removeAllViews();
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            akcr.a((Object) childAt, "this.getChildAt(i)");
            a(childAt, true);
        }
        super.removeAllViewsInLayout();
    }

    public void removeView(View view) {
        akcr.b(view, "view");
        a(view, false);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        akcr.a((Object) childAt, "this.getChildAt(index)");
        a(childAt, false);
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        akcr.b(view, "view");
        a(view, true);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            akcr.a((Object) childAt, "this.getChildAt(i)");
            a(childAt, false);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            akcr.a((Object) childAt, "this.getChildAt(i)");
            a(childAt, true);
        }
        super.removeViewsInLayout(i, i2);
    }
}
