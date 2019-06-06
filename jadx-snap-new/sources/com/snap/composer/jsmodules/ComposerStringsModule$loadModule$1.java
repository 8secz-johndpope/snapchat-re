package com.snap.composer.jsmodules;

import android.content.res.Resources;
import com.snap.composer.actions.ComposerAction;
import defpackage.ajxt;
import defpackage.akcr;

public final class ComposerStringsModule$loadModule$1 implements ComposerAction {
    private /* synthetic */ ComposerStringsModule a;

    ComposerStringsModule$loadModule$1(ComposerStringsModule composerStringsModule) {
        this.a = composerStringsModule;
    }

    public final Object perform(Object[] objArr) {
        akcr.b(objArr, "parameters");
        Resources resources = this.a.a.getResources();
        Object obj = objArr[1];
        if (obj != null) {
            int identifier = resources.getIdentifier((String) obj, "string", this.a.a.getPackageName());
            return identifier == 0 ? "<NOT_FOUND>" : this.a.a.getResources().getString(identifier);
        } else {
            throw new ajxt("null cannot be cast to non-null type kotlin.String");
        }
    }
}
