package com.snap.mushroom.base;

import defpackage.aiqc;
import defpackage.ajwy;
import defpackage.dib;
import defpackage.ilv;
import defpackage.ilw;
import defpackage.iry;

public final class UserDataMushroomToggleProcessor_Factory implements aiqc<UserDataMushroomToggleProcessor> {
    private final ajwy<dib> blizzardEventLoggerProvider;
    private final ajwy<ilw> grapheneFlusherProvider;
    private final ajwy<ilv> grapheneProvider;
    private final ajwy<iry> userDataManagerProvider;

    public UserDataMushroomToggleProcessor_Factory(ajwy<iry> ajwy, ajwy<ilv> ajwy2, ajwy<dib> ajwy3, ajwy<ilw> ajwy4) {
        this.userDataManagerProvider = ajwy;
        this.grapheneProvider = ajwy2;
        this.blizzardEventLoggerProvider = ajwy3;
        this.grapheneFlusherProvider = ajwy4;
    }

    public static UserDataMushroomToggleProcessor_Factory create(ajwy<iry> ajwy, ajwy<ilv> ajwy2, ajwy<dib> ajwy3, ajwy<ilw> ajwy4) {
        return new UserDataMushroomToggleProcessor_Factory(ajwy, ajwy2, ajwy3, ajwy4);
    }

    public static UserDataMushroomToggleProcessor newUserDataMushroomToggleProcessor(ajwy<iry> ajwy, ilv ilv, dib dib, ajwy<ilw> ajwy2) {
        return new UserDataMushroomToggleProcessor(ajwy, ilv, dib, ajwy2);
    }

    public static UserDataMushroomToggleProcessor provideInstance(ajwy<iry> ajwy, ajwy<ilv> ajwy2, ajwy<dib> ajwy3, ajwy<ilw> ajwy4) {
        return new UserDataMushroomToggleProcessor(ajwy, (ilv) ajwy2.get(), (dib) ajwy3.get(), ajwy4);
    }

    public final UserDataMushroomToggleProcessor get() {
        return provideInstance(this.userDataManagerProvider, this.grapheneProvider, this.blizzardEventLoggerProvider, this.grapheneFlusherProvider);
    }
}
