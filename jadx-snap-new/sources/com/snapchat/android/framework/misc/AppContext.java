package com.snapchat.android.framework.misc;

import android.app.Application;

@Deprecated
public class AppContext {
    private static Application sApplicationContext;

    @Deprecated
    public static Application get() {
        return sApplicationContext;
    }

    public static void setApplicationContext(Application application) {
        sApplicationContext = application;
    }
}
