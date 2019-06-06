package com.snap.composer.serengeti.bridge.dagger;

import android.content.Context;
import com.snap.composer.serengeti.bridge.dagger.SerengetiBridgeModules.UserModule;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.aiqc;
import defpackage.aiqf;
import defpackage.ajei;
import defpackage.ajwy;
import defpackage.kee;
import defpackage.kem;
import defpackage.kep;
import defpackage.wlt;
import defpackage.wmp;

public final class SerengetiBridgeModules_UserModule_ProvidesSerengetiBridgeFactory implements aiqc<ModuleFactory> {
    private final UserModule a;
    private final ajwy<Context> b;
    private final ajwy<ajei> c;
    private final ajwy<wmp> d;
    private final ajwy<kee> e;
    private final ajwy<kem> f;
    private final ajwy<kep> g;
    private final ajwy<wlt> h;

    public SerengetiBridgeModules_UserModule_ProvidesSerengetiBridgeFactory(UserModule userModule, ajwy<Context> ajwy, ajwy<ajei> ajwy2, ajwy<wmp> ajwy3, ajwy<kee> ajwy4, ajwy<kem> ajwy5, ajwy<kep> ajwy6, ajwy<wlt> ajwy7) {
        this.a = userModule;
        this.b = ajwy;
        this.c = ajwy2;
        this.d = ajwy3;
        this.e = ajwy4;
        this.f = ajwy5;
        this.g = ajwy6;
        this.h = ajwy7;
    }

    public static SerengetiBridgeModules_UserModule_ProvidesSerengetiBridgeFactory create(UserModule userModule, ajwy<Context> ajwy, ajwy<ajei> ajwy2, ajwy<wmp> ajwy3, ajwy<kee> ajwy4, ajwy<kem> ajwy5, ajwy<kep> ajwy6, ajwy<wlt> ajwy7) {
        return new SerengetiBridgeModules_UserModule_ProvidesSerengetiBridgeFactory(userModule, ajwy, ajwy2, ajwy3, ajwy4, ajwy5, ajwy6, ajwy7);
    }

    public static ModuleFactory provideInstance(UserModule userModule, ajwy<Context> ajwy, ajwy<ajei> ajwy2, ajwy<wmp> ajwy3, ajwy<kee> ajwy4, ajwy<kem> ajwy5, ajwy<kep> ajwy6, ajwy<wlt> ajwy7) {
        return proxyProvidesSerengetiBridge(userModule, (Context) ajwy.get(), (ajei) ajwy2.get(), (wmp) ajwy3.get(), (kee) ajwy4.get(), (kee) ajwy4.get(), (kem) ajwy5.get(), (kep) ajwy6.get(), (wlt) ajwy7.get());
    }

    public static ModuleFactory proxyProvidesSerengetiBridge(UserModule userModule, Context context, ajei ajei, wmp wmp, kee kee, kee kee2, kem kem, kep kep, wlt wlt) {
        return (ModuleFactory) aiqf.a(userModule.providesSerengetiBridge(context, ajei, wmp, kee, kee2, kem, kep, wlt), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final ModuleFactory get() {
        return provideInstance(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
