package com.snap.composer;

import com.snap.composer.jsmodules.ComposerCachingJSRuntime;
import com.snap.composer.jsmodules.ComposerJSRuntime;
import defpackage.akbl;
import defpackage.akcr;

public final class ComposerViewLoader$getJSRuntime$$inlined$runOnJsThread$1 implements Runnable {
    private /* synthetic */ ComposerViewLoader a;
    private /* synthetic */ akbl b;

    public ComposerViewLoader$getJSRuntime$$inlined$runOnJsThread$1(ComposerViewLoader composerViewLoader, akbl akbl) {
        this.a = composerViewLoader;
        this.b = akbl;
    }

    public final void run() {
        akbl akbl;
        ComposerJSRuntime access$getCachingJSRuntime$p;
        if (this.a.a != null) {
            akbl = this.b;
            access$getCachingJSRuntime$p = this.a.a;
            if (access$getCachingJSRuntime$p == null) {
                akcr.a();
            }
            akbl.invoke(access$getCachingJSRuntime$p);
            return;
        }
        ComposerViewLoader composerViewLoader = this.a;
        composerViewLoader.a = new ComposerCachingJSRuntime(composerViewLoader.getNative().getJSRuntime());
        akbl = this.b;
        access$getCachingJSRuntime$p = this.a.a;
        if (access$getCachingJSRuntime$p == null) {
            akcr.a();
        }
        akbl.invoke(access$getCachingJSRuntime$p);
    }
}
