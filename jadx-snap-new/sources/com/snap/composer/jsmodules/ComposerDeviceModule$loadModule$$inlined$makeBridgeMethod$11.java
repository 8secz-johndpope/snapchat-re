package com.snap.composer.jsmodules;

import com.snap.composer.actions.ComposerAction;
import defpackage.akcr;

public final class ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$11 implements ComposerAction {
    private /* synthetic */ ComposerDeviceModule a;

    public ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$11(ComposerDeviceModule composerDeviceModule) {
        this.a = composerDeviceModule;
    }

    public final Boolean perform(Object[] objArr) {
        akcr.a((Object) objArr, "it");
        return Boolean.valueOf(ComposerDeviceModule.access$performHapticFeedback(this.a, objArr));
    }
}
