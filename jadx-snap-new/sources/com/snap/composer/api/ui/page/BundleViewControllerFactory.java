package com.snap.composer.api.ui.page;

import com.snap.composer.IComposerViewLoader;
import defpackage.ajei;
import defpackage.akcr;
import defpackage.zjm;

public final class BundleViewControllerFactory implements ComposerPageControllerFactory<Object> {
    private final String a;
    private final String b;
    private final Object c;
    private final Object d;

    public BundleViewControllerFactory(String str, String str2, Object obj, Object obj2) {
        akcr.b(str, "bundleName");
        akcr.b(str2, "composerPath");
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = obj2;
    }

    public final ComposerPageController getController(IComposerViewLoader iComposerViewLoader, Object obj, ajei ajei, zjm zjm) {
        akcr.b(iComposerViewLoader, "viewLoader");
        akcr.b(ajei, "disposable");
        akcr.b(zjm, "mainPageType");
        return new BundleViewController(iComposerViewLoader, this.a, this.b, obj, this.d, this.c, null, 64, null);
    }
}
