package com.snap.composer.serengeti.bridge;

import com.snap.composer.actions.ComposerAction;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.akdd.e;
import defpackage.wll;
import java.util.HashMap;
import java.util.Map;

public final class SerengetiComposerAction implements ComposerAction {
    private final ComposerSerengetiNativeBridge a;
    private final wll b;

    public SerengetiComposerAction(ComposerSerengetiNativeBridge composerSerengetiNativeBridge, wll wll) {
        akcr.b(composerSerengetiNativeBridge, "bridge");
        akcr.b(wll, "action");
        this.a = composerSerengetiNativeBridge;
        this.b = wll;
    }

    public final Object perform(Object[] objArr) {
        HashMap hashMap;
        akcr.b(objArr, "parameters");
        if (objArr.length > 0) {
            hashMap = objArr[0];
            if (hashMap == null) {
                throw new ajxt("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            }
        }
        hashMap = new HashMap();
        Map map = hashMap;
        e eVar = new e();
        eVar.a = null;
        if (objArr.length > 1) {
            Object obj = objArr[1];
            if (obj != null) {
                eVar.a = (ComposerAction) obj;
            } else {
                throw new ajxt("null cannot be cast to non-null type com.snap.composer.actions.ComposerAction");
            }
        }
        try {
            this.b.a(map, this.a, new SerengetiComposerAction$perform$1(eVar));
        } catch (Exception e) {
            ComposerAction composerAction = (ComposerAction) eVar.a;
            if (composerAction != null) {
                composerAction.perform(new Object[]{e.getMessage()});
            }
        }
        return null;
    }
}
