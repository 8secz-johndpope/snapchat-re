package com.snap.composer.jsmodules;

import com.snap.composer.actions.ComposerAction;
import defpackage.ajdp;
import defpackage.akbk;
import defpackage.akcr;

public final class ComposerBridgeModule$makeObserverMethod$$inlined$makeBridgeMethod$1 implements ComposerAction {
    private /* synthetic */ ComposerBridgeModule a;
    private /* synthetic */ ajdp b;
    private /* synthetic */ akbk c;

    public ComposerBridgeModule$makeObserverMethod$$inlined$makeBridgeMethod$1(ComposerBridgeModule composerBridgeModule, ajdp ajdp, akbk akbk) {
        this.a = composerBridgeModule;
        this.b = ajdp;
        this.c = akbk;
    }

    public final Object perform(Object[] objArr) {
        akcr.a((Object) objArr, "it");
        return ComposerBridgeModule.access$observerCallback(this.a, this.b, objArr, this.c);
    }
}
