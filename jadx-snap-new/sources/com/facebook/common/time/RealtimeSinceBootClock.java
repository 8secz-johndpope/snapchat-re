package com.facebook.common.time;

import android.os.SystemClock;
import defpackage.aue;
import defpackage.aut;

@aue
public class RealtimeSinceBootClock implements aut {
    private static final RealtimeSinceBootClock a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @aue
    public static RealtimeSinceBootClock get() {
        return a;
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
