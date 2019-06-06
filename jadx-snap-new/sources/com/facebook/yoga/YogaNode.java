package com.facebook.yoga;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.List;

public class YogaNode implements Cloneable {
    private boolean A;
    private YogaNode a;
    private List<YogaNode> b;
    private YogaMeasureFunction c;
    private long d;
    private Object e;
    private int f;
    private boolean g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private int x;
    private boolean y;
    private boolean z;

    /* renamed from: com.facebook.yoga.YogaNode$1 */
    static /* synthetic */ class AnonymousClass1 {
        private static /* synthetic */ int[] a = new int[YogaEdge.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        static {
            /*
            r0 = com.facebook.yoga.YogaEdge.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.facebook.yoga.YogaEdge.LEFT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.facebook.yoga.YogaEdge.TOP;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.facebook.yoga.YogaEdge.RIGHT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.facebook.yoga.YogaEdge.BOTTOM;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.facebook.yoga.YogaEdge.START;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = com.facebook.yoga.YogaEdge.END;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNode$AnonymousClass1.<clinit>():void");
        }
    }

    public YogaNode() {
        this.f = 0;
        this.g = false;
        this.h = 1.0E21f;
        this.i = 1.0E21f;
        this.j = 1.0E21f;
        this.k = 1.0E21f;
        this.l = MapboxConstants.MINIMUM_ZOOM;
        this.m = MapboxConstants.MINIMUM_ZOOM;
        this.n = MapboxConstants.MINIMUM_ZOOM;
        this.o = MapboxConstants.MINIMUM_ZOOM;
        this.p = MapboxConstants.MINIMUM_ZOOM;
        this.q = MapboxConstants.MINIMUM_ZOOM;
        this.r = MapboxConstants.MINIMUM_ZOOM;
        this.s = MapboxConstants.MINIMUM_ZOOM;
        this.t = MapboxConstants.MINIMUM_ZOOM;
        this.u = MapboxConstants.MINIMUM_ZOOM;
        this.v = MapboxConstants.MINIMUM_ZOOM;
        this.w = MapboxConstants.MINIMUM_ZOOM;
        this.x = 0;
        this.y = true;
        this.z = false;
        this.A = true;
        this.d = jni_YGNodeNew();
        if (this.d == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public YogaNode(long j) {
        this.f = 0;
        this.g = false;
        this.h = 1.0E21f;
        this.i = 1.0E21f;
        this.j = 1.0E21f;
        this.k = 1.0E21f;
        this.l = MapboxConstants.MINIMUM_ZOOM;
        this.m = MapboxConstants.MINIMUM_ZOOM;
        this.n = MapboxConstants.MINIMUM_ZOOM;
        this.o = MapboxConstants.MINIMUM_ZOOM;
        this.p = MapboxConstants.MINIMUM_ZOOM;
        this.q = MapboxConstants.MINIMUM_ZOOM;
        this.r = MapboxConstants.MINIMUM_ZOOM;
        this.s = MapboxConstants.MINIMUM_ZOOM;
        this.t = MapboxConstants.MINIMUM_ZOOM;
        this.u = MapboxConstants.MINIMUM_ZOOM;
        this.v = MapboxConstants.MINIMUM_ZOOM;
        this.w = MapboxConstants.MINIMUM_ZOOM;
        this.x = 0;
        this.y = true;
        this.z = false;
        this.A = true;
        this.d = j;
        this.A = false;
    }

    private YogaNode j() {
        try {
            YogaNode yogaNode = (YogaNode) super.clone();
            yogaNode.d = jni_YGNodeClone(this.d, yogaNode);
            List list = null;
            yogaNode.a = null;
            if (this.b != null) {
                list = (List) ((ArrayList) this.b).clone();
            }
            yogaNode.b = list;
            return yogaNode;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private native void jni_YGNodeCalculateLayout(long j, float f, float f2);

    private native void jni_YGNodeClearChildren(long j);

    private native long jni_YGNodeClone(long j, Object obj);

    private native void jni_YGNodeCopyStyle(long j, long j2);

    private native void jni_YGNodeFree(long j);

    static native int jni_YGNodeGetInstanceCount();

    private native void jni_YGNodeInsertChild(long j, long j2, int i);

    private native void jni_YGNodeInsertSharedChild(long j, long j2, int i);

    private native boolean jni_YGNodeIsDirty(long j);

    private native void jni_YGNodeMarkDirty(long j);

    private native void jni_YGNodeMarkDirtyAndPropogateToDescendants(long j);

    private native long jni_YGNodeNew();

    private native long jni_YGNodeNewWithConfig(long j);

    private native void jni_YGNodePrint(long j);

    private native void jni_YGNodeRemoveChild(long j, long j2);

    private native void jni_YGNodeReset(long j);

    private native void jni_YGNodeSetHasBaselineFunc(long j, boolean z);

    private native void jni_YGNodeSetHasMeasureFunc(long j, boolean z);

    private native int jni_YGNodeStyleGetAlignContent(long j);

    private native int jni_YGNodeStyleGetAlignItems(long j);

    private native int jni_YGNodeStyleGetAlignSelf(long j);

    private native float jni_YGNodeStyleGetAspectRatio(long j);

    private native float jni_YGNodeStyleGetBorder(long j, int i);

    private native int jni_YGNodeStyleGetDirection(long j);

    private native int jni_YGNodeStyleGetDisplay(long j);

    private native Object jni_YGNodeStyleGetFlexBasis(long j);

    private native int jni_YGNodeStyleGetFlexDirection(long j);

    private native float jni_YGNodeStyleGetFlexGrow(long j);

    private native float jni_YGNodeStyleGetFlexShrink(long j);

    private native Object jni_YGNodeStyleGetHeight(long j);

    private native int jni_YGNodeStyleGetJustifyContent(long j);

    private native Object jni_YGNodeStyleGetMargin(long j, int i);

    private native Object jni_YGNodeStyleGetMaxHeight(long j);

    private native Object jni_YGNodeStyleGetMaxWidth(long j);

    private native Object jni_YGNodeStyleGetMinHeight(long j);

    private native Object jni_YGNodeStyleGetMinWidth(long j);

    private native int jni_YGNodeStyleGetOverflow(long j);

    private native Object jni_YGNodeStyleGetPadding(long j, int i);

    private native Object jni_YGNodeStyleGetPosition(long j, int i);

    private native int jni_YGNodeStyleGetPositionType(long j);

    private native Object jni_YGNodeStyleGetWidth(long j);

    private native void jni_YGNodeStyleSetAlignContent(long j, int i);

    private native void jni_YGNodeStyleSetAlignItems(long j, int i);

    private native void jni_YGNodeStyleSetAlignSelf(long j, int i);

    private native void jni_YGNodeStyleSetAspectRatio(long j, float f);

    private native void jni_YGNodeStyleSetBorder(long j, int i, float f);

    private native void jni_YGNodeStyleSetDirection(long j, int i);

    private native void jni_YGNodeStyleSetDisplay(long j, int i);

    private native void jni_YGNodeStyleSetFlex(long j, float f);

    private native void jni_YGNodeStyleSetFlexBasis(long j, float f);

    private native void jni_YGNodeStyleSetFlexBasisAuto(long j);

    private native void jni_YGNodeStyleSetFlexBasisPercent(long j, float f);

    private native void jni_YGNodeStyleSetFlexDirection(long j, int i);

    private native void jni_YGNodeStyleSetFlexGrow(long j, float f);

    private native void jni_YGNodeStyleSetFlexShrink(long j, float f);

    private native void jni_YGNodeStyleSetFlexWrap(long j, int i);

    private native void jni_YGNodeStyleSetHeight(long j, float f);

    private native void jni_YGNodeStyleSetHeightAuto(long j);

    private native void jni_YGNodeStyleSetHeightPercent(long j, float f);

    private native void jni_YGNodeStyleSetJustifyContent(long j, int i);

    private native void jni_YGNodeStyleSetMargin(long j, int i, float f);

    private native void jni_YGNodeStyleSetMarginAuto(long j, int i);

    private native void jni_YGNodeStyleSetMarginPercent(long j, int i, float f);

    private native void jni_YGNodeStyleSetMaxHeight(long j, float f);

    private native void jni_YGNodeStyleSetMaxHeightPercent(long j, float f);

    private native void jni_YGNodeStyleSetMaxWidth(long j, float f);

    private native void jni_YGNodeStyleSetMaxWidthPercent(long j, float f);

    private native void jni_YGNodeStyleSetMinHeight(long j, float f);

    private native void jni_YGNodeStyleSetMinHeightPercent(long j, float f);

    private native void jni_YGNodeStyleSetMinWidth(long j, float f);

    private native void jni_YGNodeStyleSetMinWidthPercent(long j, float f);

    private native void jni_YGNodeStyleSetOverflow(long j, int i);

    private native void jni_YGNodeStyleSetPadding(long j, int i, float f);

    private native void jni_YGNodeStyleSetPaddingPercent(long j, int i, float f);

    private native void jni_YGNodeStyleSetPosition(long j, int i, float f);

    private native void jni_YGNodeStyleSetPositionPercent(long j, int i, float f);

    private native void jni_YGNodeStyleSetPositionType(long j, int i);

    private native void jni_YGNodeStyleSetWidth(long j, float f);

    private native void jni_YGNodeStyleSetWidthAuto(long j);

    private native void jni_YGNodeStyleSetWidthPercent(long j, float f);

    public final int a() {
        List list = this.b;
        return list == null ? 0 : list.size();
    }

    public final YogaNode a(int i) {
        List list = this.b;
        if (list != null) {
            return (YogaNode) list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    public final void a(float f) {
        jni_YGNodeStyleSetWidth(this.d, f);
    }

    public final void a(YogaDirection yogaDirection) {
        jni_YGNodeStyleSetDirection(this.d, yogaDirection.mIntValue);
    }

    public final void a(YogaFlexDirection yogaFlexDirection) {
        jni_YGNodeStyleSetFlexDirection(this.d, yogaFlexDirection.mIntValue);
    }

    public final void a(YogaMeasureFunction yogaMeasureFunction) {
        this.c = yogaMeasureFunction;
        jni_YGNodeSetHasMeasureFunc(this.d, yogaMeasureFunction != null);
    }

    public final void a(YogaNode yogaNode, int i) {
        if (yogaNode.a == null) {
            if (this.b == null) {
                this.b = new ArrayList(4);
            }
            this.b.add(i, yogaNode);
            yogaNode.a = this;
            jni_YGNodeInsertChild(this.d, yogaNode.d, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    public final void a(YogaOverflow yogaOverflow) {
        jni_YGNodeStyleSetOverflow(this.d, yogaOverflow.mIntValue);
    }

    public final void a(Object obj) {
        this.e = obj;
    }

    public final YogaNode b() {
        return this.a;
    }

    public final YogaNode b(int i) {
        List list = this.b;
        if (list != null) {
            YogaNode yogaNode = (YogaNode) list.remove(i);
            yogaNode.a = null;
            jni_YGNodeRemoveChild(this.d, yogaNode.d);
            return yogaNode;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    public final void b(float f) {
        jni_YGNodeStyleSetHeight(this.d, f);
    }

    public final void c() {
        jni_YGNodeCalculateLayout(this.d, 1.0E21f, 1.0E21f);
    }

    public final void c(float f) {
        jni_YGNodeStyleSetMaxWidth(this.d, f);
    }

    public /* synthetic */ Object clone() {
        return j();
    }

    public final YogaDirection d() {
        int jni_YGNodeStyleGetDirection = jni_YGNodeStyleGetDirection(this.d);
        if (jni_YGNodeStyleGetDirection == 0) {
            return YogaDirection.INHERIT;
        }
        if (jni_YGNodeStyleGetDirection == 1) {
            return YogaDirection.LTR;
        }
        if (jni_YGNodeStyleGetDirection == 2) {
            return YogaDirection.RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(jni_YGNodeStyleGetDirection)));
    }

    public final void d(float f) {
        jni_YGNodeStyleSetMaxHeight(this.d, f);
    }

    public final float e() {
        return this.k;
    }

    public final float f() {
        return this.j;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            if (this.A) {
                jni_YGNodeFree(this.d);
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final float g() {
        return this.h;
    }

    public final float h() {
        return this.i;
    }

    public final Object i() {
        return this.e;
    }
}
