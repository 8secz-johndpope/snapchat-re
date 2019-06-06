package com.snap.composer.jsmodules;

import com.snap.composer.actions.ComposerAction;
import defpackage.akbl;
import defpackage.akcr;

public final class ComposerBridgeModule$makeBridgeMethod$2 implements ComposerAction {
    private /* synthetic */ akbl a;

    public ComposerBridgeModule$makeBridgeMethod$2(akbl akbl) {
        this.a = akbl;
    }

    public final T perform(Object[] objArr) {
        akbl akbl = this.a;
        akcr.a((Object) objArr, "it");
        return akbl.invoke(objArr);
    }
}
