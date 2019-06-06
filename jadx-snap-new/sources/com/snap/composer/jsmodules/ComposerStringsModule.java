package com.snap.composer.jsmodules;

import android.content.Context;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.akcr;
import java.util.HashMap;

public final class ComposerStringsModule extends ModuleFactory {
    private final Context a;

    public ComposerStringsModule(Context context) {
        akcr.b(context, "context");
        this.a = context;
    }

    public final Object loadModule() {
        HashMap hashMap = new HashMap();
        hashMap.put("getLocalizedString", new ComposerStringsModule$loadModule$1(this));
        return hashMap;
    }
}
