package com.facebook.common.time;

import android.os.SystemClock;
import defpackage.aue;
import defpackage.aut;

@aue
public class AwakeTimeSinceBootClock implements aut {
    @aue
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @aue
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @aue
    public long now() {
        return SystemClock.uptimeMillis();
    }
}
