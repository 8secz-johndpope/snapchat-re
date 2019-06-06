package com.snap.composer.api;

import android.content.Context;
import com.snap.composer.AsyncComposerViewLoader;
import com.snap.composer.ComposerViewLoaderManager;
import com.snap.composer.api.ComposerModules.AppModule;
import defpackage.aipn;
import defpackage.aiqb;
import defpackage.aiqc;
import defpackage.aiqf;
import defpackage.ajwy;
import defpackage.zgb;

public final class ComposerModules_AppModule_ProvidesViewLoaderFactory implements aiqc<AsyncComposerViewLoader> {
    private final AppModule a;
    private final ajwy<Context> b;
    private final ajwy<ComposerViewLoaderManager> c;
    private final ajwy<zgb> d;

    public ComposerModules_AppModule_ProvidesViewLoaderFactory(AppModule appModule, ajwy<Context> ajwy, ajwy<ComposerViewLoaderManager> ajwy2, ajwy<zgb> ajwy3) {
        this.a = appModule;
        this.b = ajwy;
        this.c = ajwy2;
        this.d = ajwy3;
    }

    public static ComposerModules_AppModule_ProvidesViewLoaderFactory create(AppModule appModule, ajwy<Context> ajwy, ajwy<ComposerViewLoaderManager> ajwy2, ajwy<zgb> ajwy3) {
        return new ComposerModules_AppModule_ProvidesViewLoaderFactory(appModule, ajwy, ajwy2, ajwy3);
    }

    public static AsyncComposerViewLoader provideInstance(AppModule appModule, ajwy<Context> ajwy, ajwy<ComposerViewLoaderManager> ajwy2, ajwy<zgb> ajwy3) {
        return proxyProvidesViewLoader(appModule, (Context) ajwy.get(), aiqb.b(ajwy2), (zgb) ajwy3.get());
    }

    public static AsyncComposerViewLoader proxyProvidesViewLoader(AppModule appModule, Context context, aipn<ComposerViewLoaderManager> aipn, zgb zgb) {
        return (AsyncComposerViewLoader) aiqf.a(appModule.providesViewLoader(context, aipn, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final AsyncComposerViewLoader get() {
        return provideInstance(this.a, this.b, this.c, this.d);
    }
}
