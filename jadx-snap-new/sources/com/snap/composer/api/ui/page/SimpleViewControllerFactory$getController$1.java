package com.snap.composer.api.ui.page;

import com.snap.composer.IComposerViewLoader;
import com.snap.composer.views.ComposerView;
import defpackage.ajei;

public final class SimpleViewControllerFactory$getController$1 implements ComposerPageController {
    private final ComposerView a;
    private /* synthetic */ SimpleViewControllerFactory b;
    private /* synthetic */ IComposerViewLoader c;
    private /* synthetic */ ajei d;

    SimpleViewControllerFactory$getController$1(SimpleViewControllerFactory simpleViewControllerFactory, IComposerViewLoader iComposerViewLoader, ajei ajei) {
        this.b = simpleViewControllerFactory;
        this.c = iComposerViewLoader;
        this.d = ajei;
        this.a = (ComposerView) simpleViewControllerFactory.a.invoke(iComposerViewLoader, ajei);
    }

    public final ComposerView getView() {
        return this.a;
    }
}
