package com.snap.composer.api.ui.page;

import com.snap.composer.IComposerViewLoader;
import com.snap.composer.views.ComposerView;
import defpackage.ajei;
import defpackage.akbw;
import defpackage.akcr;
import defpackage.zjm;

public final class SimpleViewControllerFactory implements ComposerPageControllerFactory<Object> {
    private final akbw<IComposerViewLoader, ajei, ComposerView> a;

    public SimpleViewControllerFactory(akbw<? super IComposerViewLoader, ? super ajei, ? extends ComposerView> akbw) {
        akcr.b(akbw, "creator");
        this.a = akbw;
    }

    public final ComposerPageController getController(IComposerViewLoader iComposerViewLoader, Object obj, ajei ajei, zjm zjm) {
        akcr.b(iComposerViewLoader, "viewLoader");
        akcr.b(ajei, "disposable");
        akcr.b(zjm, "mainPageType");
        return new SimpleViewControllerFactory$getController$1(this, iComposerViewLoader, ajei);
    }
}
