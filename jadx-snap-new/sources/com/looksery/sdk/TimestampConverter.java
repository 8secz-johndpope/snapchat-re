package com.looksery.sdk;

import android.os.SystemClock;

public final class TimestampConverter {
    private static final boolean DEBUG = false;
    private static final String TAG = "com.looksery.sdk.TimestampConverter";
    private boolean mHasComputedOffset = false;
    private boolean mOffsetCorrectionEnabled = true;
    private String mTag;
    private double mTimestampOffsetSeconds = 0.0d;

    public TimestampConverter(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" timestamps");
        this.mTag = stringBuilder.toString();
    }

    public final double convert(long j) {
        long j2 = j;
        if (!this.mHasComputedOffset && this.mOffsetCorrectionEnabled) {
            long j3 = j2 / 1000000;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long uptimeMillis = SystemClock.uptimeMillis();
            long currentTimeMillis = System.currentTimeMillis();
            long abs = Math.abs(j3 - elapsedRealtime);
            long j4 = j3 - uptimeMillis;
            if (Math.abs(j4) < abs) {
                abs = Math.abs(j4);
            } else {
                uptimeMillis = elapsedRealtime;
            }
            if (Math.abs(j3 - currentTimeMillis) < abs) {
                uptimeMillis = currentTimeMillis;
            }
            double d = (double) (elapsedRealtime - uptimeMillis);
            Double.isNaN(d);
            this.mTimestampOffsetSeconds = d / 1000.0d;
            this.mHasComputedOffset = true;
        }
        double d2 = (double) j2;
        Double.isNaN(d2);
        return (d2 / 1.0E9d) + this.mTimestampOffsetSeconds;
    }

    public final void reset() {
        this.mHasComputedOffset = false;
    }

    /* Access modifiers changed, original: final */
    public final void setOffsetCorrectionEnabled(boolean z) {
        this.mOffsetCorrectionEnabled = z;
        if (!z) {
            this.mTimestampOffsetSeconds = 0.0d;
        }
        reset();
    }
}
