package com.snap.composer.api;

import android.content.Context;
import com.snap.composer.ComposerViewLoaderManager;
import com.snap.composer.api.ComposerModules.AppModule;
import defpackage.aiqc;
import defpackage.aiqf;
import defpackage.ajwy;
import defpackage.zgb;

public final class ComposerModules_AppModule_ProvidesViewLoaderManagerFactory implements aiqc<ComposerViewLoaderManager> {
    private final AppModule a;
    private final ajwy<Context> b;
    private final ajwy<zgb> c;

    public ComposerModules_AppModule_ProvidesViewLoaderManagerFactory(AppModule appModule, ajwy<Context> ajwy, ajwy<zgb> ajwy2) {
        this.a = appModule;
        this.b = ajwy;
        this.c = ajwy2;
    }

    public static ComposerModules_AppModule_ProvidesViewLoaderManagerFactory create(AppModule appModule, ajwy<Context> ajwy, ajwy<zgb> ajwy2) {
        return new ComposerModules_AppModule_ProvidesViewLoaderManagerFactory(appModule, ajwy, ajwy2);
    }

    public static ComposerViewLoaderManager provideInstance(AppModule appModule, ajwy<Context> ajwy, ajwy<zgb> ajwy2) {
        return proxyProvidesViewLoaderManager(appModule, (Context) ajwy.get(), (zgb) ajwy2.get());
    }

    public static ComposerViewLoaderManager proxyProvidesViewLoaderManager(AppModule appModule, Context context, zgb zgb) {
        return (ComposerViewLoaderManager) aiqf.a(appModule.providesViewLoaderManager(context, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final ComposerViewLoaderManager get() {
        return provideInstance(this.a, this.b, this.c);
    }
}
