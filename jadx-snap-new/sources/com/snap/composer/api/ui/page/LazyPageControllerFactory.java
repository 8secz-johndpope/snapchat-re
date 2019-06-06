package com.snap.composer.api.ui.page;

import com.snap.composer.IComposerViewLoader;
import defpackage.aipn;
import defpackage.ajei;
import defpackage.akcr;
import defpackage.zjm;

public final class LazyPageControllerFactory<T> implements ComposerPageControllerFactory<T> {
    private final aipn<? extends ComposerPageController> a;

    public LazyPageControllerFactory(aipn<? extends ComposerPageController> aipn) {
        akcr.b(aipn, "lazyController");
        this.a = aipn;
    }

    public final ComposerPageController getController(IComposerViewLoader iComposerViewLoader, T t, ajei ajei, zjm zjm) {
        akcr.b(iComposerViewLoader, "viewLoader");
        akcr.b(ajei, "disposable");
        akcr.b(zjm, "mainPageType");
        Object obj = this.a.get();
        akcr.a(obj, "lazyController.get()");
        return (ComposerPageController) obj;
    }
}
