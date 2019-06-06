package com.snap.composer.context;

import android.view.View;
import com.snap.composer.ComposerViewLoader;
import com.snap.composer.actions.ComposerActions;
import com.snap.composer.nativebridge.ContextNative;
import com.snap.composer.nodes.ComposerViewNode;
import com.snap.composer.views.ComposerView;
import com.snapchat.client.composer.NativeBridge;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import java.util.ArrayList;
import java.util.List;

public final class ComposerContext {
    private ComposerViewOwner a;
    private Object b;
    private List<akbk<ajxw>> c;
    private final ContextNative d;
    private ComposerActions e;

    public ComposerContext(ContextNative contextNative, ComposerActions composerActions) {
        akcr.b(contextNative, "native");
        akcr.b(composerActions, "actions");
        this.d = contextNative;
        this.e = composerActions;
    }

    public final void addCSSClasses(View view, String str) {
        akcr.b(view, "view");
        akcr.b(str, "cssClasses");
        this.d.addCSSClasses(view, str);
    }

    public final void calculateLayout(int i, int i2, int i3, int i4) {
        this.d.calculateLayout(i, i2, i3, i4);
    }

    public final void destroy() {
        this.d.destroy();
    }

    public final void enqueueNextRenderCallback(akbk<ajxw> akbk) {
        akcr.b(akbk, "onNextRenderCallback");
        if (this.c == null) {
            this.c = new ArrayList();
        }
        List list = this.c;
        if (list != null) {
            list.add(akbk);
        }
    }

    public final Object getActionHandler() {
        return this.e.getActionHandlerHolder().getActionHandler();
    }

    public final ComposerActions getActions() {
        return this.e;
    }

    public final ComposerViewOwner getActiveOwner() {
        ComposerContext composerContext = this;
        while (composerContext != null && composerContext.a == null) {
            composerContext = composerContext.getParent();
        }
        return composerContext != null ? composerContext.a : null;
    }

    public final String getBundleName() {
        Object bundleNameInContext = this.d.getNativeBridge().getBundleNameInContext(this.d.getNativeWrapper().getNativeHandle());
        akcr.a(bundleNameInContext, "native.nativeBridge.getB…tiveWrapper.nativeHandle)");
        return bundleNameInContext;
    }

    public final String getComponentPath() {
        return this.d.getComponentPath();
    }

    public final ContextNative getNative() {
        return this.d;
    }

    public final ComposerViewOwner getOwner() {
        return this.a;
    }

    public final ComposerContext getParent() {
        Object parentContext = this.d.getNativeBridge().getParentContext(this.d.getNativeWrapper().getNativeHandle());
        if (!(parentContext instanceof ComposerContext)) {
            parentContext = null;
        }
        return (ComposerContext) parentContext;
    }

    public final ComposerContext getRoot() {
        ComposerContext composerContext = this;
        while (true) {
            ComposerContext parent = composerContext.getParent();
            if (parent == null) {
                return composerContext;
            }
            composerContext = parent;
        }
    }

    public final ComposerView getRootView() {
        return this.d.getRootView();
    }

    public final View getView(String str) {
        akcr.b(str, "id");
        return this.d.getView(str);
    }

    public final ComposerViewLoader getViewLoader() {
        return this.d.getViewLoader();
    }

    public final Object getViewModel() {
        return this.b;
    }

    public final void onRender$client_release() {
        List<akbk> list = this.c;
        if (list != null) {
            this.c = null;
            if (list != null) {
                for (akbk invoke : list) {
                    invoke.invoke();
                }
            }
        }
    }

    public final void removeCSSClasses(View view, String str) {
        akcr.b(view, "view");
        akcr.b(str, "cssClasses");
        this.d.removeCSSClasses(view, str);
    }

    public final void render() {
        this.d.render();
    }

    public final void renderWithRootView(View view) {
        akcr.b(view, "rootView");
        this.d.renderWithRootView(view);
    }

    public final void setActionHandler(Object obj) {
        this.e.getActionHandlerHolder().setActionHandler(obj);
    }

    public final void setActions(ComposerActions composerActions) {
        akcr.b(composerActions, "<set-?>");
        this.e = composerActions;
    }

    public final void setOwner(ComposerViewOwner composerViewOwner) {
        this.a = composerViewOwner;
    }

    public final void setViewModel(Object obj) {
        this.b = obj;
        this.d.setViewModel(obj);
    }

    public final void setViewModelNoUpdate(Object obj) {
        this.b = obj;
    }

    public final void valueChangedForAttribute(ComposerViewNode composerViewNode, String str, Object obj) {
        akcr.b(composerViewNode, "viewNode");
        akcr.b(str, "attributeName");
        NativeBridge.valueChangedForAttribute(getViewLoader().getNative().getNativeHandle(), composerViewNode.getNativeHandle(), str, obj);
    }
}
