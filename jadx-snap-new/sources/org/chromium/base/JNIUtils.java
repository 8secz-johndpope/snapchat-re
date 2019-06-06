package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

public class JNIUtils {
    private static Boolean a;

    static {
        JNIUtils.class.desiredAssertionStatus();
    }

    @CalledByNative
    public static Object getClassLoader() {
        return JNIUtils.class.getClassLoader();
    }

    @CalledByNative
    public static boolean isSelectiveJniRegistrationEnabled() {
        if (a == null) {
            a = Boolean.FALSE;
        }
        return a.booleanValue();
    }
}
