package com.snap.composer.serengeti.bridge;

import android.content.Context;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.ajei;
import defpackage.akcr;
import defpackage.wll;
import java.util.HashMap;
import java.util.List;

public final class SerengetiActionModuleFactory extends ModuleFactory {
    private final Context a;
    private final ajei b;
    private final List<wll> c;

    public SerengetiActionModuleFactory(Context context, ajei ajei, List<? extends wll> list) {
        akcr.b(context, "context");
        akcr.b(ajei, "disposable");
        akcr.b(list, "actions");
        this.a = context;
        this.b = ajei;
        this.c = list;
    }

    public final Object loadModule() {
        ComposerSerengetiNativeBridge composerSerengetiNativeBridge = new ComposerSerengetiNativeBridge(this.a, this.b);
        HashMap hashMap = new HashMap();
        for (wll wll : this.c) {
            hashMap.put(wll.a(), new SerengetiComposerAction(composerSerengetiNativeBridge, wll));
        }
        return hashMap;
    }
}
