package com.mapbox.services.android.telemetry.backoff;

public class ExponentialBackoff {
    public static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 10000;
    public static final int DEFAULT_MAX_INTERVAL_MILLIS = 600000;
    public static final double DEFAULT_MULTIPLIER = 2.0d;
    private int currentIntervalMillis;
    private int initialIntervalMillis = 10000;
    private int maxIntervalMillis = DEFAULT_MAX_INTERVAL_MILLIS;
    private double multiplier = 2.0d;
    private long startTimeNanos;

    public ExponentialBackoff() {
        reset();
    }

    private void incrementCurrentInterval() {
        int i = this.currentIntervalMillis;
        double d = (double) i;
        int i2 = this.maxIntervalMillis;
        double d2 = (double) i2;
        double d3 = this.multiplier;
        Double.isNaN(d2);
        if (d >= d2 / d3) {
            this.currentIntervalMillis = i2;
            return;
        }
        double d4 = (double) i;
        Double.isNaN(d4);
        this.currentIntervalMillis = (int) (d4 * d3);
    }

    public final int getCurrentIntervalMillis() {
        return this.currentIntervalMillis;
    }

    public final long getElapsedTimeMillis() {
        return (System.nanoTime() - this.startTimeNanos) / 1000000;
    }

    public final int getInitialIntervalMillis() {
        return this.initialIntervalMillis;
    }

    public final int getMaxIntervalMillis() {
        return this.maxIntervalMillis;
    }

    public final double getMultiplier() {
        return this.multiplier;
    }

    public long nextBackOffMillis() {
        int i = this.currentIntervalMillis;
        incrementCurrentInterval();
        return (long) i;
    }

    public final void reset() {
        this.currentIntervalMillis = this.initialIntervalMillis;
        this.startTimeNanos = System.nanoTime();
    }
}
