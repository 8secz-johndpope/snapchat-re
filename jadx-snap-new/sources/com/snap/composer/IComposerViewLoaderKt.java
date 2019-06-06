package com.snap.composer;

import com.snap.composer.context.ComposerViewOwner;
import com.snap.composer.views.ComposerView;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;

public final class IComposerViewLoaderKt {
    public static final ComposerView loadUntypedView(IComposerViewLoader iComposerViewLoader, String str, String str2, Object obj, Object obj2, ComposerViewOwner composerViewOwner, akbl<? super Throwable, ajxw> akbl) {
        akcr.b(iComposerViewLoader, "receiver$0");
        akcr.b(str, "bundleName");
        akcr.b(str2, "viewName");
        ComposerView composerView = new ComposerView(iComposerViewLoader.getContext());
        iComposerViewLoader.inflateViewAsync(composerView, str, str2, obj, obj2, composerViewOwner, akbl);
        return composerView;
    }

    public static /* synthetic */ ComposerView loadUntypedView$default(IComposerViewLoader iComposerViewLoader, String str, String str2, Object obj, Object obj2, ComposerViewOwner composerViewOwner, akbl akbl, int i, Object obj3) {
        return loadUntypedView(iComposerViewLoader, str, str2, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : composerViewOwner, (i & 32) != 0 ? null : akbl);
    }
}
