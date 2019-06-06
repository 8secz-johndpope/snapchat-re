package com.snap.composer.api;

import com.snap.composer.IComposerViewLoader;
import com.snap.composer.api.ComposerModules.UserModule;
import defpackage.aiqc;
import defpackage.aiqf;
import defpackage.ajwy;

public final class ComposerModules_UserModule_ProvidesComposerViewLoaderFactory implements aiqc<IComposerViewLoader> {
    private final UserModule a;
    private final ajwy<UserScopedViewLoader> b;

    public ComposerModules_UserModule_ProvidesComposerViewLoaderFactory(UserModule userModule, ajwy<UserScopedViewLoader> ajwy) {
        this.a = userModule;
        this.b = ajwy;
    }

    public static ComposerModules_UserModule_ProvidesComposerViewLoaderFactory create(UserModule userModule, ajwy<UserScopedViewLoader> ajwy) {
        return new ComposerModules_UserModule_ProvidesComposerViewLoaderFactory(userModule, ajwy);
    }

    public static IComposerViewLoader provideInstance(UserModule userModule, ajwy<UserScopedViewLoader> ajwy) {
        return proxyProvidesComposerViewLoader(userModule, (UserScopedViewLoader) ajwy.get());
    }

    public static IComposerViewLoader proxyProvidesComposerViewLoader(UserModule userModule, UserScopedViewLoader userScopedViewLoader) {
        return (IComposerViewLoader) aiqf.a(userModule.providesComposerViewLoader(userScopedViewLoader), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final IComposerViewLoader get() {
        return provideInstance(this.a, this.b);
    }
}
