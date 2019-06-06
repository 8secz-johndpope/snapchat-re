package com.snap.mushroom.base;

import defpackage.aiqc;

public final class MushroomAppSwitchConfiguration_Factory implements aiqc<MushroomAppSwitchConfiguration> {
    private static final MushroomAppSwitchConfiguration_Factory INSTANCE = new MushroomAppSwitchConfiguration_Factory();

    public static MushroomAppSwitchConfiguration_Factory create() {
        return INSTANCE;
    }

    public static MushroomAppSwitchConfiguration newMushroomAppSwitchConfiguration() {
        return new MushroomAppSwitchConfiguration();
    }

    public static MushroomAppSwitchConfiguration provideInstance() {
        return new MushroomAppSwitchConfiguration();
    }

    public final MushroomAppSwitchConfiguration get() {
        return provideInstance();
    }
}
