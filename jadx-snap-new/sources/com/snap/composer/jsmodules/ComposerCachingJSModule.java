package com.snap.composer.jsmodules;

import com.snapchat.client.composer.JSModule;
import defpackage.akcr;
import java.util.HashMap;
import java.util.Map;

public final class ComposerCachingJSModule {
    private final HashMap<String, Object> a = new HashMap();
    private final JSModule b;

    public ComposerCachingJSModule(JSModule jSModule) {
        akcr.b(jSModule, "module");
        this.b = jSModule;
    }

    public final JSModule getModule() {
        return this.b;
    }

    public final Object getProperty(String str) {
        akcr.b(str, "property");
        synchronized (this.a) {
            Object obj = this.a.get(str);
            if (obj != null) {
                return obj;
            }
            obj = this.b.getProperty(str);
            Map map = this.a;
            akcr.a(obj, "value");
            map.put(str, obj);
            return obj;
        }
    }
}
