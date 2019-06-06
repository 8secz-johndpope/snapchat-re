package com.snap.composer.api.ui.page;

import com.snap.composer.IComposerViewLoader;
import defpackage.ajei;
import defpackage.zjm;

public interface ComposerPageControllerFactory<T> {
    ComposerPageController getController(IComposerViewLoader iComposerViewLoader, T t, ajei ajei, zjm zjm);
}
