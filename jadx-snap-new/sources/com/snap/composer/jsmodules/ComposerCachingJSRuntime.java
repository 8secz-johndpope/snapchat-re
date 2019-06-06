package com.snap.composer.jsmodules;

import com.snap.composer.actions.ComposerRunnableAction;
import com.snapchat.client.composer.JSModule;
import com.snapchat.client.composer.JSRuntime;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import java.util.HashMap;

public final class ComposerCachingJSRuntime implements ComposerJSRuntime {
    private final HashMap<String, ComposerCachingJSModule> a = new HashMap();
    private final JSRuntime b;

    static final class a extends akcs implements akbl {
        private /* synthetic */ ComposerCachingJSRuntime a;
        private /* synthetic */ String b;

        a(ComposerCachingJSRuntime composerCachingJSRuntime, String str) {
            this.a = composerCachingJSRuntime;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Object[]) obj, "it");
            ComposerCachingJSRuntime.access$removeModule(this.a, this.b);
            return null;
        }
    }

    public ComposerCachingJSRuntime(JSRuntime jSRuntime) {
        akcr.b(jSRuntime, "jsRuntime");
        this.b = jSRuntime;
    }

    private final ComposerCachingJSModule a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(':');
        stringBuilder.append(str2);
        String stringBuilder2 = stringBuilder.toString();
        synchronized (this.a) {
            ComposerCachingJSModule composerCachingJSModule = (ComposerCachingJSModule) this.a.get(stringBuilder2);
            if (composerCachingJSModule != null) {
                return composerCachingJSModule;
            }
            JSModule module = this.b.getModule(str, str2);
            if (module == null) {
                return null;
            }
            ComposerCachingJSModule composerCachingJSModule2 = new ComposerCachingJSModule(module);
            this.a.put(stringBuilder2, composerCachingJSModule2);
            composerCachingJSModule2.getModule().addUnloadObserver(new ComposerRunnableAction(new a(this, stringBuilder2)));
            return composerCachingJSModule2;
        }
    }

    public static final /* synthetic */ void access$removeModule(ComposerCachingJSRuntime composerCachingJSRuntime, String str) {
        synchronized (str) {
            composerCachingJSRuntime.a.remove(str);
        }
    }

    public final JSRuntime getJsRuntime() {
        return this.b;
    }

    public final Object getProperty(String str, String str2, String str3) {
        akcr.b(str, "bundleName");
        akcr.b(str2, "modulePath");
        akcr.b(str3, "property");
        ComposerCachingJSModule a = a(str, str2);
        return a != null ? a.getProperty(str3) : null;
    }
}
