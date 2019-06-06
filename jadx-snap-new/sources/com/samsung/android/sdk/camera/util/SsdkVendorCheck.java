package com.samsung.android.sdk.camera.util;

import android.os.Build;

public class SsdkVendorCheck {
    private static String strBrand = Build.BRAND;
    private static String strManufacturer = Build.MANUFACTURER;

    private SsdkVendorCheck() {
    }

    public static boolean isSamsungDevice() {
        String str = strBrand;
        if (str == null || strManufacturer == null) {
            return false;
        }
        String str2 = "Samsung";
        return str.compareToIgnoreCase(str2) == 0 || strManufacturer.compareToIgnoreCase(str2) == 0;
    }
}
