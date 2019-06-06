package com.samsung.android.sdk.camera.delegator;

import android.content.Context;
import android.os.Build.VERSION;

public abstract class AbstractSemCamera {
    public static final String SEM_FEATURE_SAMSUNG_EXPERIENCE_MOBILE = "com.samsung.feature.samsung_experience_mobile";

    public static int getSepPlatformVersion(Context context) {
        return (!isSemAvailable(context) || VERSION.SEM_PLATFORM_INT < 80100) ? -1 : VERSION.SEM_PLATFORM_INT;
    }

    private static final boolean isSemAvailable(Context context) {
        return context != null && context.getPackageManager().hasSystemFeature(SEM_FEATURE_SAMSUNG_EXPERIENCE_MOBILE);
    }

    public abstract int checkAvailability(Context context);

    public abstract boolean isFeatureEnabled(Context context, String str, int i);
}
