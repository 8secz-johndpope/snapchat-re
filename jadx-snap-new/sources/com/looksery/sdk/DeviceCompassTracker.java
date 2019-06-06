package com.looksery.sdk;

public interface DeviceCompassTracker {
    public static final DeviceCompassTracker NOOP = new DeviceCompassTracker() {
        public double getBearing() {
            return Double.NaN;
        }

        public int getLastReportedAccuracy() {
            return -1;
        }

        public void start() {
        }

        public void stop() {
        }
    };

    double getBearing();

    int getLastReportedAccuracy();

    void start();

    void stop();
}
