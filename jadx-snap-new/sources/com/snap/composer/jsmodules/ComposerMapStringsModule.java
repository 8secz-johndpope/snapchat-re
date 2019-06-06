package com.snap.composer.jsmodules;

import android.content.Context;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.akcr;
import java.util.HashMap;

public final class ComposerMapStringsModule extends ModuleFactory {
    private final Context a;

    public ComposerMapStringsModule(Context context) {
        akcr.b(context, "context");
        this.a = context;
    }

    public final Object loadModule() {
        HashMap hashMap = new HashMap();
        hashMap.put("getString", new ComposerMapStringsModule$loadModule$1(this));
        return hashMap;
    }
}
