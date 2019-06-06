package com.snap.composer.nodes;

import com.facebook.yoga.YogaNode;
import com.snap.composer.nativebridge.ContextNative;
import com.snapchat.client.composer.NativeBridge;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ComposerViewNode {
    public static final Companion Companion = new Companion();
    private int a;
    private int b;
    private int c;
    private int d;
    private final ajxe e = ajxh.a(new a(this));
    private Map<String, akbk<ajxw>> f;
    private final long g;
    private final NativeBridge h;
    private final ContextNative i;
    private final long j;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final int horizontalFromEncodedLong(long j) {
            return (int) (j >> 32);
        }

        public final int verticalFromEncodedLong(long j) {
            return (int) j;
        }
    }

    static final class a extends akcs implements akbk<YogaNode> {
        private /* synthetic */ ComposerViewNode a;

        a(ComposerViewNode composerViewNode) {
            this.a = composerViewNode;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new YogaNode(this.a.j);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ComposerViewNode.class), "yogaNode", "getYogaNode()Lcom/facebook/yoga/YogaNode;");
    }

    public ComposerViewNode(long j, NativeBridge nativeBridge, ContextNative contextNative, long j2) {
        akcr.b(nativeBridge, "nativeBridge");
        akcr.b(contextNative, "contextNative");
        this.g = j;
        this.h = nativeBridge;
        this.i = contextNative;
        this.j = j2;
    }

    public final void didApplyLayout() {
        Map map = this.f;
        if (map != null) {
            for (akbk invoke : map.values()) {
                invoke.invoke();
            }
        }
    }

    public final Object getAttribute(String str) {
        akcr.b(str, "attributeName");
        return NativeBridge.getValueForAttribute(this.i.getViewLoaderNative().getNativeHandle(), this.g, str);
    }

    public final int getCalculatedHeight() {
        return this.d;
    }

    public final long getCalculatedPosition() {
        return NativeBridge.getViewNodePosition(this.i.getViewLoaderNative().getNativeHandle(), this.g);
    }

    public final long getCalculatedSize() {
        return NativeBridge.getViewNodeSize(this.i.getViewLoaderNative().getNativeHandle(), this.g);
    }

    public final int getCalculatedWidth() {
        return this.c;
    }

    public final int getCalculatedX() {
        return this.a;
    }

    public final int getCalculatedY() {
        return this.b;
    }

    public final long getChildrenSize() {
        return NativeBridge.getViewNodeChildrenSize(this.i.getViewLoaderNative().getNativeHandle(), this.g);
    }

    public final long getNativeHandle() {
        return this.g;
    }

    public final String getNodeId() {
        String nodeId = this.h.getNodeId(this.g);
        return nodeId == null ? "" : nodeId;
    }

    public final YogaNode getYogaNode() {
        return (YogaNode) this.e.b();
    }

    public final void invalidateLayout() {
        NativeBridge.invalidateLayout(this.g);
    }

    public final void removeDidFinishLayoutForKey(String str) {
        akcr.b(str, "key");
        Map map = this.f;
        if (map != null) {
            map.remove(str);
        }
    }

    public final void setAttribute(String str, Object obj) {
        akcr.b(str, "attributeName");
        NativeBridge.setValueForAttribute(this.i.getViewLoaderNative().getNativeHandle(), this.g, str, obj);
    }

    public final void setCalculatedHeight(int i) {
        this.d = i;
    }

    public final void setCalculatedWidth(int i) {
        this.c = i;
    }

    public final void setCalculatedX(int i) {
        this.a = i;
    }

    public final void setCalculatedY(int i) {
        this.b = i;
    }

    public final void setDidFinishLayoutForKey(String str, akbk<ajxw> akbk) {
        akcr.b(str, "key");
        akcr.b(akbk, "didFinishLayout");
        if (this.f == null) {
            this.f = new LinkedHashMap();
        }
        Map map = this.f;
        if (map == null) {
            akcr.a();
        }
        map.put(str, akbk);
    }

    public final void setUserDefinedViewport(int i, int i2, int i3, int i4) {
        NativeBridge.setUserDefinedViewPort(this.i.getViewLoaderNative().getNativeHandle(), this.g, i, i2, i3, i4);
    }

    public final String toString() {
        Object viewNodeDebugDescription = NativeBridge.getViewNodeDebugDescription(this.g);
        akcr.a(viewNodeDebugDescription, "NativeBridge.getViewNode…Description(nativeHandle)");
        return viewNodeDebugDescription;
    }
}
