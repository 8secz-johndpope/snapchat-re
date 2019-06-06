package com.snap.composer.jsmodules;

import com.snap.composer.actions.ComposerAction;
import defpackage.akcr;

public final class ComposerNumberFormattingModule$loadModule$$inlined$makeBridgeMethod$1 implements ComposerAction {
    private /* synthetic */ ComposerNumberFormattingModule a;

    public ComposerNumberFormattingModule$loadModule$$inlined$makeBridgeMethod$1(ComposerNumberFormattingModule composerNumberFormattingModule) {
        this.a = composerNumberFormattingModule;
    }

    public final String perform(Object[] objArr) {
        akcr.a((Object) objArr, "it");
        return ComposerNumberFormattingModule.access$formatNumber(this.a, objArr);
    }
}
