package com.snap.composer.jsmodules;

import android.content.res.Resources;
import com.snap.composer.actions.ComposerAction;
import defpackage.ajxt;
import defpackage.akcr;

public final class ComposerMapStringsModule$loadModule$1 implements ComposerAction {
    private /* synthetic */ ComposerMapStringsModule a;

    ComposerMapStringsModule$loadModule$1(ComposerMapStringsModule composerMapStringsModule) {
        this.a = composerMapStringsModule;
    }

    public final Object perform(Object[] objArr) {
        akcr.b(objArr, "parameters");
        Resources resources = this.a.a.getResources();
        StringBuilder stringBuilder = new StringBuilder("map_status_");
        Object obj = objArr[0];
        if (obj != null) {
            stringBuilder.append((String) obj);
            int identifier = resources.getIdentifier(stringBuilder.toString(), "string", this.a.a.getPackageName());
            return identifier == 0 ? "<NOT_FOUND>" : this.a.a.getResources().getString(identifier);
        } else {
            throw new ajxt("null cannot be cast to non-null type kotlin.String");
        }
    }
}
