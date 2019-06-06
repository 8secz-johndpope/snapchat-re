package com.mapbox.mapboxsdk.constants;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MyBearingTracking {
    public static final int COMPASS = 4;
    public static final int GPS = 8;
    public static final int NONE = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }
}
