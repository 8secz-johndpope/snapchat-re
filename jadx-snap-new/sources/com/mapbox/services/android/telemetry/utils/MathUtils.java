package com.mapbox.services.android.telemetry.utils;

public class MathUtils {
    public static double clamp(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static double convertNativeBearing(double d) {
        d = -d;
        while (d > 360.0d) {
            d -= 360.0d;
        }
        while (d < 0.0d) {
            d += 360.0d;
        }
        return d;
    }

    public static double differenceBetweenAngles(double d, double d2) {
        d = Math.abs(d2 - d) % 360.0d;
        return d > 180.0d ? 360.0d - d : d;
    }

    public static double wrap(double d, double d2, double d3) {
        d3 -= d2;
        return ((((d - d2) % d3) + d3) % d3) + d2;
    }
}
