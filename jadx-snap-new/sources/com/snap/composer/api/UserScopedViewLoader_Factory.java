package com.snap.composer.api;

import com.snap.composer.AsyncComposerViewLoader;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.aiqc;
import defpackage.ajei;
import defpackage.ajwy;
import defpackage.gpb;
import java.util.Map;

public final class UserScopedViewLoader_Factory implements aiqc<UserScopedViewLoader> {
    private final ajwy<AsyncComposerViewLoader> a;
    private final ajwy<gpb> b;
    private final ajwy<ajei> c;
    private final ajwy<InAppNotifDebugMessagePresenter> d;
    private final ajwy<Map<String, ModuleFactory>> e;

    public UserScopedViewLoader_Factory(ajwy<AsyncComposerViewLoader> ajwy, ajwy<gpb> ajwy2, ajwy<ajei> ajwy3, ajwy<InAppNotifDebugMessagePresenter> ajwy4, ajwy<Map<String, ModuleFactory>> ajwy5) {
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
        this.d = ajwy4;
        this.e = ajwy5;
    }

    public static UserScopedViewLoader_Factory create(ajwy<AsyncComposerViewLoader> ajwy, ajwy<gpb> ajwy2, ajwy<ajei> ajwy3, ajwy<InAppNotifDebugMessagePresenter> ajwy4, ajwy<Map<String, ModuleFactory>> ajwy5) {
        return new UserScopedViewLoader_Factory(ajwy, ajwy2, ajwy3, ajwy4, ajwy5);
    }

    public static UserScopedViewLoader newUserScopedViewLoader(AsyncComposerViewLoader asyncComposerViewLoader, gpb gpb, ajei ajei, InAppNotifDebugMessagePresenter inAppNotifDebugMessagePresenter, Map<String, ModuleFactory> map) {
        return new UserScopedViewLoader(asyncComposerViewLoader, gpb, ajei, inAppNotifDebugMessagePresenter, map);
    }

    public static UserScopedViewLoader provideInstance(ajwy<AsyncComposerViewLoader> ajwy, ajwy<gpb> ajwy2, ajwy<ajei> ajwy3, ajwy<InAppNotifDebugMessagePresenter> ajwy4, ajwy<Map<String, ModuleFactory>> ajwy5) {
        return new UserScopedViewLoader((AsyncComposerViewLoader) ajwy.get(), (gpb) ajwy2.get(), (ajei) ajwy3.get(), (InAppNotifDebugMessagePresenter) ajwy4.get(), (Map) ajwy5.get());
    }

    public final UserScopedViewLoader get() {
        return provideInstance(this.a, this.b, this.c, this.d, this.e);
    }
}
