package com.mapbox.mapboxsdk.constants;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MyLocationTracking {
    public static final int TRACKING_FOLLOW = 4;
    public static final int TRACKING_NONE = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }
}
