package com.snap.mushroom.base;

import com.snap.mushroom.MainActivity;
import defpackage.abme;
import defpackage.ajdx;
import defpackage.rsl;
import defpackage.ztl;

public interface EarlyInitComponent {
    rsl loginRedirector();

    ajdx<MainActivityInjector> mainActivityInjector();

    ActivityPreInjector<MainActivity> mainActivityPreInjector();

    ztl pureMushroomMigrationRedirector();

    abme testBridgeContainer();
}
