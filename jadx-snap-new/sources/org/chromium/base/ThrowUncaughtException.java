package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

abstract class ThrowUncaughtException {
    ThrowUncaughtException() {
    }

    @CalledByNative
    private static void post() {
        ThreadUtils.a().post(new Runnable() {
            public final void run() {
                throw new RuntimeException("Intentional exception not caught by JNI");
            }
        });
    }
}
