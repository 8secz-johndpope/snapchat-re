package com.snap.composer.api.ui.page;

import com.snap.composer.IComposerViewLoader;
import com.snap.composer.IComposerViewLoaderKt;
import com.snap.composer.context.ComposerViewOwner;
import com.snap.composer.views.ComposerView;
import defpackage.akco;
import defpackage.akcr;

public final class BundleViewController implements ComposerPageController {
    private final ComposerView a;

    public BundleViewController(IComposerViewLoader iComposerViewLoader, String str, String str2, Object obj, Object obj2, Object obj3, ComposerViewOwner composerViewOwner) {
        Object obj4 = obj;
        Object obj5 = obj3;
        IComposerViewLoader iComposerViewLoader2 = iComposerViewLoader;
        akcr.b(iComposerViewLoader, "viewLoader");
        String str3 = str;
        akcr.b(str, "bundleName");
        String str4 = str2;
        akcr.b(str2, "composerPath");
        this.a = IComposerViewLoaderKt.loadUntypedView$default(iComposerViewLoader2, str3, str4, null, obj2, composerViewOwner, null, 32, null);
        if (obj4 != null) {
            getView().setViewModelUntyped(obj4);
        }
        if (obj5 != null) {
            getView().setActionHandlerUntyped(obj5);
        }
    }

    public /* synthetic */ BundleViewController(IComposerViewLoader iComposerViewLoader, String str, String str2, Object obj, Object obj2, Object obj3, ComposerViewOwner composerViewOwner, int i, akco akco) {
        this(iComposerViewLoader, str, str2, obj, obj2, obj3, (i & 64) != 0 ? null : composerViewOwner);
    }

    public final ComposerView getView() {
        return this.a;
    }
}
