package com.snap.composer.nativebridge;

import android.view.View;
import com.snap.composer.ComposerViewLoader;
import com.snap.composer.views.ComposerView;
import com.snapchat.client.composer.NativeBridge;
import com.snapchat.client.composer.utils.CppObjectWrapper;
import defpackage.ajxt;
import defpackage.akcr;

public final class ContextNative {
    private CppObjectWrapper a;
    private final NativeBridge b;
    private final ViewLoaderNative c;

    public ContextNative(CppObjectWrapper cppObjectWrapper, NativeBridge nativeBridge, ViewLoaderNative viewLoaderNative) {
        akcr.b(cppObjectWrapper, "nativeWrapper");
        akcr.b(nativeBridge, "nativeBridge");
        akcr.b(viewLoaderNative, "viewLoaderNative");
        this.a = cppObjectWrapper;
        this.b = nativeBridge;
        this.c = viewLoaderNative;
    }

    public final void addCSSClasses(View view, String str) {
        akcr.b(view, "view");
        akcr.b(str, "cssClasses");
        this.b.addCSSClass(this.c.getNativeHandle(), this.a.getNativeHandle(), view, str);
    }

    public final void calculateLayout(int i, int i2, int i3, int i4) {
        NativeBridge.calculateLayout(this.c.getNativeHandle(), this.a.getNativeHandle(), i, i2, i3, i4);
    }

    public final void callJSFunction(String str, Object[] objArr) {
        akcr.b(str, "functionName");
        akcr.b(objArr, "arguments");
        this.b.callJSFunction(this.c.getNativeHandle(), this.a.getNativeHandle(), str, objArr);
    }

    public final void destroy() {
        if (this.a.getNativeHandle() != 0) {
            this.b.destroyContext(this.c.getNativeHandle(), this.a.getNativeHandle());
            this.a.destroy();
        }
    }

    public final String getComponentPath() {
        String componentPathInContext = this.b.getComponentPathInContext(this.a.getNativeHandle());
        return componentPathInContext == null ? "" : componentPathInContext;
    }

    public final NativeBridge getNativeBridge() {
        return this.b;
    }

    public final CppObjectWrapper getNativeWrapper() {
        return this.a;
    }

    public final ComposerView getRootView() {
        return (ComposerView) this.b.getRootView(this.a.getNativeHandle());
    }

    public final View getView(String str) {
        akcr.b(str, "id");
        Object viewInContextForId = this.b.getViewInContextForId(this.a.getNativeHandle(), str);
        if (!(viewInContextForId instanceof View)) {
            viewInContextForId = null;
        }
        return (View) viewInContextForId;
    }

    public final ComposerViewLoader getViewLoader() {
        Object viewLoaderAttachedObjectFromContext = NativeBridge.getViewLoaderAttachedObjectFromContext(this.a.getNativeHandle());
        if (viewLoaderAttachedObjectFromContext != null) {
            return (ComposerViewLoader) viewLoaderAttachedObjectFromContext;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.composer.ComposerViewLoader");
    }

    public final ViewLoaderNative getViewLoaderNative() {
        return this.c;
    }

    public final void markDestroyed() {
        this.a.destroy();
    }

    public final void removeCSSClasses(View view, String str) {
        akcr.b(view, "view");
        akcr.b(str, "cssClasses");
        this.b.removeCSSClass(this.c.getNativeHandle(), this.a.getNativeHandle(), view, str);
    }

    public final void render() {
        this.b.render(this.c.getNativeHandle(), this.a.getNativeHandle());
    }

    public final void renderWithRootView(View view) {
        akcr.b(view, "rootView");
        this.b.renderWithRootView(this.c.getNativeHandle(), this.a.getNativeHandle(), view);
    }

    public final void setNativeWrapper(CppObjectWrapper cppObjectWrapper) {
        akcr.b(cppObjectWrapper, "<set-?>");
        this.a = cppObjectWrapper;
    }

    public final void setViewModel(Object obj) {
        this.b.setViewModel(this.c.getNativeHandle(), this.a.getNativeHandle(), obj);
    }
}
