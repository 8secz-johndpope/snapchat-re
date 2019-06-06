package com.snap.composer.jsmodules;

import com.snap.composer.actions.ComposerAction;
import defpackage.akcr;

public final class ComposerDateFormattingModule$loadModule$$inlined$makeBridgeMethod$1 implements ComposerAction {
    private /* synthetic */ ComposerDateFormattingModule a;

    public ComposerDateFormattingModule$loadModule$$inlined$makeBridgeMethod$1(ComposerDateFormattingModule composerDateFormattingModule) {
        this.a = composerDateFormattingModule;
    }

    public final String perform(Object[] objArr) {
        akcr.a((Object) objArr, "it");
        return ComposerDateFormattingModule.access$formatDate(this.a, objArr);
    }
}
