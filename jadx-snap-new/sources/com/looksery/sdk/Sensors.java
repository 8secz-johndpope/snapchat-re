package com.looksery.sdk;

import android.hardware.Sensor;
import java.util.Locale;

final class Sensors {
    private static final String[] EMULATED_SENSOR_VENDORS = new String[]{"SOFTWARE"};

    private Sensors() {
        throw new AssertionError("No instances");
    }

    static boolean isEmulated(Sensor sensor) {
        String vendor = sensor.getVendor();
        if (vendor == null) {
            return false;
        }
        vendor = vendor.trim().toUpperCase(Locale.US);
        for (String startsWith : EMULATED_SENSOR_VENDORS) {
            if (vendor.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }
}
