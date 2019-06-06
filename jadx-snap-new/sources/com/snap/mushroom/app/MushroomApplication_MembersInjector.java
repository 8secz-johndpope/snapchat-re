package com.snap.mushroom.app;

import defpackage.ablx;
import defpackage.abme;
import defpackage.aipn;
import defpackage.aipo;
import defpackage.aiqb;
import defpackage.ajwy;
import defpackage.ftq;
import defpackage.fwx;
import defpackage.fxb;
import defpackage.gby;
import defpackage.gpd;
import defpackage.ppl;
import defpackage.rvi;
import defpackage.rwe;
import defpackage.wiv;
import java.util.Set;

public final class MushroomApplication_MembersInjector implements aipo<MushroomApplication> {
    private final ajwy<fxb<rvi>> applicationCoreProvider;
    private final ajwy<wiv> defaultSnapTokenInitializerProvider;
    private final ajwy<fwx> intentFactoryProvider;
    private final ajwy<ablx> launchTrackerProvider;
    private final ajwy<Set<aipn<?>>> lazyInitSingletonsProvider;
    private final ajwy<ppl> leakTrackerProvider;
    private final ajwy<ftq> snapContentProviderDependenciesProvider;
    private final ajwy<Object> stethoProvider;
    private final ajwy<abme> testDependencyProvider;
    private final ajwy<rwe> undeliverableExceptionConsumerProvider;
    private final ajwy<gpd> userAuthStoreReaderProvider;
    private final ajwy<gby> workerWakeUpSchedulerProvider;

    public MushroomApplication_MembersInjector(ajwy<fxb<rvi>> ajwy, ajwy<Object> ajwy2, ajwy<ftq> ajwy3, ajwy<ablx> ajwy4, ajwy<Set<aipn<?>>> ajwy5, ajwy<ppl> ajwy6, ajwy<wiv> ajwy7, ajwy<abme> ajwy8, ajwy<fwx> ajwy9, ajwy<gpd> ajwy10, ajwy<gby> ajwy11, ajwy<rwe> ajwy12) {
        this.applicationCoreProvider = ajwy;
        this.stethoProvider = ajwy2;
        this.snapContentProviderDependenciesProvider = ajwy3;
        this.launchTrackerProvider = ajwy4;
        this.lazyInitSingletonsProvider = ajwy5;
        this.leakTrackerProvider = ajwy6;
        this.defaultSnapTokenInitializerProvider = ajwy7;
        this.testDependencyProvider = ajwy8;
        this.intentFactoryProvider = ajwy9;
        this.userAuthStoreReaderProvider = ajwy10;
        this.workerWakeUpSchedulerProvider = ajwy11;
        this.undeliverableExceptionConsumerProvider = ajwy12;
    }

    public static aipo<MushroomApplication> create(ajwy<fxb<rvi>> ajwy, ajwy<Object> ajwy2, ajwy<ftq> ajwy3, ajwy<ablx> ajwy4, ajwy<Set<aipn<?>>> ajwy5, ajwy<ppl> ajwy6, ajwy<wiv> ajwy7, ajwy<abme> ajwy8, ajwy<fwx> ajwy9, ajwy<gpd> ajwy10, ajwy<gby> ajwy11, ajwy<rwe> ajwy12) {
        return new MushroomApplication_MembersInjector(ajwy, ajwy2, ajwy3, ajwy4, ajwy5, ajwy6, ajwy7, ajwy8, ajwy9, ajwy10, ajwy11, ajwy12);
    }

    public static void injectDefaultSnapTokenInitializer(MushroomApplication mushroomApplication, wiv wiv) {
        mushroomApplication.defaultSnapTokenInitializer = wiv;
    }

    public static void injectIntentFactory(MushroomApplication mushroomApplication, aipn<fwx> aipn) {
        mushroomApplication.intentFactory = aipn;
    }

    public static void injectLaunchTracker(MushroomApplication mushroomApplication, ablx ablx) {
        mushroomApplication.launchTracker = ablx;
    }

    public static void injectLazyInitSingletons(MushroomApplication mushroomApplication, Set<aipn<?>> set) {
        mushroomApplication.lazyInitSingletons = set;
    }

    public static void injectLeakTracker(MushroomApplication mushroomApplication, aipn<ppl> aipn) {
        mushroomApplication.leakTracker = aipn;
    }

    public static void injectSnapContentProviderDependencies(MushroomApplication mushroomApplication, ftq ftq) {
        mushroomApplication.snapContentProviderDependencies = ftq;
    }

    public static void injectStetho(MushroomApplication mushroomApplication, aipn<Object> aipn) {
        mushroomApplication.stetho = aipn;
    }

    public static void injectTestDependencyProvider(MushroomApplication mushroomApplication, aipn<abme> aipn) {
        mushroomApplication.testDependencyProvider = aipn;
    }

    public static void injectUndeliverableExceptionConsumer(MushroomApplication mushroomApplication, ajwy<rwe> ajwy) {
        mushroomApplication.undeliverableExceptionConsumer = ajwy;
    }

    public static void injectUserAuthStoreReader(MushroomApplication mushroomApplication, gpd gpd) {
        mushroomApplication.userAuthStoreReader = gpd;
    }

    public static void injectWorkerWakeUpSchedulerProvider(MushroomApplication mushroomApplication, ajwy<gby> ajwy) {
        mushroomApplication.workerWakeUpSchedulerProvider = ajwy;
    }

    public final void injectMembers(MushroomApplication mushroomApplication) {
        mushroomApplication.applicationCore = (fxb) this.applicationCoreProvider.get();
        injectStetho(mushroomApplication, aiqb.b(this.stethoProvider));
        injectSnapContentProviderDependencies(mushroomApplication, (ftq) this.snapContentProviderDependenciesProvider.get());
        injectLaunchTracker(mushroomApplication, (ablx) this.launchTrackerProvider.get());
        injectLazyInitSingletons(mushroomApplication, (Set) this.lazyInitSingletonsProvider.get());
        injectLeakTracker(mushroomApplication, aiqb.b(this.leakTrackerProvider));
        injectDefaultSnapTokenInitializer(mushroomApplication, (wiv) this.defaultSnapTokenInitializerProvider.get());
        injectTestDependencyProvider(mushroomApplication, aiqb.b(this.testDependencyProvider));
        injectIntentFactory(mushroomApplication, aiqb.b(this.intentFactoryProvider));
        injectUserAuthStoreReader(mushroomApplication, (gpd) this.userAuthStoreReaderProvider.get());
        injectWorkerWakeUpSchedulerProvider(mushroomApplication, this.workerWakeUpSchedulerProvider);
        injectUndeliverableExceptionConsumer(mushroomApplication, this.undeliverableExceptionConsumerProvider);
    }
}
