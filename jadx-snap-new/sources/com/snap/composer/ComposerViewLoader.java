package com.snap.composer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.context.ComposerViewOwner;
import com.snap.composer.exceptions.ComposerException;
import com.snap.composer.jsmodules.ComposerJSRuntime;
import com.snap.composer.jsmodules.JSThreadDispatcher;
import com.snap.composer.logger.Logger;
import com.snap.composer.nativebridge.ViewLoaderNative;
import com.snap.composer.views.ComposerView;
import com.snapchat.client.composer.ModuleFactory;
import com.snapchat.client.composer.NativeBridge;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akca;
import defpackage.akcr;
import defpackage.akcs;

public final class ComposerViewLoader implements IComposerViewLoader, JSThreadDispatcher {
    private ComposerJSRuntime a;
    private final ViewLoaderNative b;
    private final Context c;
    private final Logger d;
    private final boolean e;
    private final boolean f;
    private ComposerViewLoaderManager g;

    static final class a extends akcs implements akca<ComposerContext, Boolean, Throwable, ajxw> {
        final /* synthetic */ akbl a;
        private /* synthetic */ ComposerView b;
        private /* synthetic */ Object c;
        private /* synthetic */ ComposerViewOwner d;

        /* renamed from: com.snap.composer.ComposerViewLoader$a$1 */
        static final class AnonymousClass1 extends akcs implements akbk<ajxw> {
            private /* synthetic */ a a;

            AnonymousClass1(a aVar) {
                this.a = aVar;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                this.a.a.invoke(null);
                return ajxw.a;
            }
        }

        a(ComposerView composerView, akbl akbl, Object obj, ComposerViewOwner composerViewOwner) {
            this.b = composerView;
            this.a = akbl;
            this.c = obj;
            this.d = composerViewOwner;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            ComposerContext composerContext = (ComposerContext) obj;
            ((Boolean) obj2).booleanValue();
            Throwable th = (Throwable) obj3;
            if (!this.b.getDestroyed()) {
                if (th != null) {
                    akbl akbl = this.a;
                    if (akbl != null) {
                        akbl.invoke(th);
                    }
                } else {
                    ComposerViewOwner composerViewOwner = null;
                    if ((composerContext != null ? composerContext.getViewModel() : null) == null && composerContext != null) {
                        composerContext.setViewModelNoUpdate(this.c);
                    }
                    if (composerContext != null) {
                        composerViewOwner = composerContext.getOwner();
                    }
                    if (composerViewOwner == null && composerContext != null) {
                        composerContext.setOwner(this.d);
                    }
                    if (composerContext != null) {
                        this.b.contextIsReady$client_release(composerContext);
                    }
                    if (!(this.a == null || composerContext == null)) {
                        composerContext.enqueueNextRenderCallback(new AnonymousClass1(this));
                    }
                    if (composerContext != null) {
                        composerContext.render();
                    }
                }
            }
            return ajxw.a;
        }
    }

    public ComposerViewLoader(ViewLoaderNative viewLoaderNative, Context context, Logger logger, boolean z, boolean z2, ComposerViewLoaderManager composerViewLoaderManager) {
        akcr.b(viewLoaderNative, "native");
        akcr.b(context, "context");
        akcr.b(logger, "logger");
        this.b = viewLoaderNative;
        this.c = context;
        this.d = logger;
        this.e = z;
        this.f = z2;
        this.g = composerViewLoaderManager;
    }

    private static void a(ComposerView composerView) {
        composerView.setRoot(true);
        if (composerView.getLayoutParams() == null) {
            composerView.setLayoutParams(new LayoutParams(-1, -1));
        }
    }

    public final void destroy() {
        if (this.b.getNativeHandle() != 0) {
            NativeBridge.setViewLoaderAttachedObject(this.b.getNativeHandle(), null);
            this.b.destroy();
        }
        this.g = null;
    }

    public final Context getContext() {
        return this.c;
    }

    public final void getJSRuntime(akbl<? super ComposerJSRuntime, ajxw> akbl) {
        akcr.b(akbl, "block");
        runOnJsThread((Runnable) new ComposerViewLoader$getJSRuntime$$inlined$runOnJsThread$1(this, akbl));
    }

    public final Logger getLogger() {
        return this.d;
    }

    public final ComposerViewLoaderManager getManager() {
        return this.g;
    }

    public final ViewLoaderNative getNative() {
        return this.b;
    }

    public final void inflateView(ComposerView composerView, String str, String str2, Object obj, Object obj2) {
        akcr.b(composerView, "view");
        akcr.b(str, "bundleName");
        akcr.b(str2, "viewName");
        ComposerContext createContext = this.b.createContext(str, str2, obj, obj2);
        createContext.setViewModelNoUpdate(obj);
        createContext.renderWithRootView(composerView);
        composerView.contextIsReady$client_release(createContext);
    }

    public final void inflateViewAsync(ComposerView composerView, String str, String str2, Object obj, Object obj2, ComposerViewOwner composerViewOwner, akbl<? super Throwable, ajxw> akbl) {
        akcr.b(composerView, "rootView");
        akcr.b(str, "bundleName");
        akcr.b(str2, "viewName");
        a(composerView);
        this.b.createContextAsync(composerView, str, str2, obj, obj2, new a(composerView, akbl, obj, composerViewOwner));
    }

    public final boolean isMain() {
        return this.f;
    }

    public final boolean isRemote() {
        return this.e;
    }

    public final ComposerView loadView(String str, String str2) {
        akcr.b(str, "bundleName");
        akcr.b(str2, "viewName");
        return loadView(str, str2, null);
    }

    public final ComposerView loadView(String str, String str2, ComposerViewOwner composerViewOwner) {
        akcr.b(str, "bundleName");
        akcr.b(str2, "viewName");
        return loadView(str, str2, null, null, composerViewOwner);
    }

    public final ComposerView loadView(String str, String str2, Object obj, Object obj2, ComposerViewOwner composerViewOwner) {
        akcr.b(str, "bundleName");
        akcr.b(str2, "viewName");
        ComposerContext createContext = this.b.createContext(str, str2, obj, obj2);
        createContext.setViewModelNoUpdate(obj);
        createContext.setOwner(composerViewOwner);
        createContext.render();
        ComposerView rootView = createContext.getRootView();
        if (rootView != null) {
            a(rootView);
            rootView.contextIsReady$client_release(createContext);
            return rootView;
        }
        throw new ComposerException("No root view after render");
    }

    public final <T extends View> void registerAttributesBinder(AttributesBinder<T> attributesBinder) {
        akcr.b(attributesBinder, "attributesBinder");
        ComposerViewLoaderManager composerViewLoaderManager = this.g;
        if (composerViewLoaderManager != null) {
            composerViewLoaderManager.registerAttributesBinder(attributesBinder);
        }
    }

    public final void registerNativeModuleFactory(String str, ModuleFactory moduleFactory) {
        akcr.b(str, "moduleName");
        akcr.b(moduleFactory, "moduleFactory");
        this.b.registerNativeModuleFactory(str, moduleFactory);
    }

    public final void runOnJsThread(akbk<ajxw> akbk) {
        akcr.b(akbk, "callback");
        runOnJsThread((Runnable) new ComposerViewLoader$runOnJsThread$1(akbk));
    }

    public final void runOnJsThread(Runnable runnable) {
        akcr.b(runnable, "runnable");
        this.b.callOnJsThread(runnable);
    }

    public final void setDocument(byte[] bArr) {
        akcr.b(bArr, "documentBytes");
        this.b.setDocument(bArr);
    }

    public final void setHotReloadEnabled(boolean z) {
        ComposerViewLoaderManager composerViewLoaderManager = this.g;
        if (composerViewLoaderManager != null) {
            composerViewLoaderManager.setHotReloadEnabled(z);
        }
    }

    public final void setManager(ComposerViewLoaderManager composerViewLoaderManager) {
        this.g = composerViewLoaderManager;
    }

    public final void unloadAllJsModules() {
        this.b.unloadAllJsModules();
    }

    public final void updateResource(byte[] bArr, String str, String str2) {
        akcr.b(bArr, "resource");
        akcr.b(str, "bundleName");
        akcr.b(str2, "filePathWithinBundle");
        this.b.updateResource(bArr, str, str2);
    }
}
