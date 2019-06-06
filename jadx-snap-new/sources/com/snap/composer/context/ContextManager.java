package com.snap.composer.context;

import android.support.annotation.Keep;
import com.snap.composer.ComposerViewLoader;
import com.snap.composer.actions.ComposerActions;
import com.snap.composer.logger.Logger;
import com.snap.composer.nativebridge.ContextNative;
import com.snap.composer.views.ComposerView;
import com.snapchat.client.composer.NativeBridge;
import com.snapchat.client.composer.utils.CppObjectWrapper;
import defpackage.ajxt;
import defpackage.akcr;

public final class ContextManager {
    private final NativeBridge a;
    private final Logger b;

    public ContextManager(NativeBridge nativeBridge, Logger logger) {
        akcr.b(nativeBridge, "nativeBridge");
        akcr.b(logger, "logger");
        this.a = nativeBridge;
        this.b = logger;
    }

    @Keep
    public final ComposerContext createContext(Object obj, Object[] objArr, boolean[] zArr) {
        akcr.b(obj, "nativeHandle");
        akcr.b(objArr, "actionNames");
        akcr.b(zArr, "actionIsJS");
        CppObjectWrapper cppObjectWrapper = (CppObjectWrapper) obj;
        Object viewLoaderAttachedObjectFromContext = NativeBridge.getViewLoaderAttachedObjectFromContext(cppObjectWrapper.getNativeHandle());
        if (viewLoaderAttachedObjectFromContext != null) {
            ContextNative contextNative = new ContextNative(cppObjectWrapper, this.a, ((ComposerViewLoader) viewLoaderAttachedObjectFromContext).getNative());
            return new ComposerContext(contextNative, ComposerActions.Companion.make(objArr, zArr, new ContextManager$createContext$jsCaller$1(contextNative), this.b));
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.composer.ComposerViewLoader");
    }

    @Keep
    public final void destroyContext(ComposerContext composerContext) {
        akcr.b(composerContext, "context");
        composerContext.getNative().markDestroyed();
    }

    @Keep
    public final void onAllContextsDestroyed(Object obj) {
        if (obj instanceof ComposerViewLoader) {
            ComposerViewLoader composerViewLoader = (ComposerViewLoader) obj;
            if (!composerViewLoader.isMain()) {
                composerViewLoader.destroy();
            }
        }
    }

    @Keep
    public final void onContextRendered(ComposerContext composerContext) {
        akcr.b(composerContext, "context");
        composerContext.onRender$client_release();
        ComposerViewOwner owner = composerContext.getOwner();
        if (owner != null) {
            ComposerView rootView = composerContext.getRootView();
            if (rootView != null) {
                owner.onRendered(rootView);
            }
        }
    }

    @Keep
    public final void onContextTransfered(ComposerContext composerContext, ComposerContext composerContext2) {
        akcr.b(composerContext, "oldContext");
        akcr.b(composerContext2, "newContext");
        if (composerContext.getViewModel() != null) {
            composerContext2.setViewModel(composerContext.getViewModel());
        }
    }

    @Keep
    public final void onContextWillTransfer(ComposerContext composerContext, ComposerContext composerContext2) {
        akcr.b(composerContext, "oldContext");
        akcr.b(composerContext2, "newContext");
        composerContext2.setOwner(composerContext.getOwner());
        composerContext2.setActionHandler(composerContext.getActionHandler());
        composerContext2.setActions(composerContext.getActions());
    }
}
