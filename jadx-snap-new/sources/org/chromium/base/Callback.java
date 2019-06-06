package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

public interface Callback<T> {

    public static abstract class Helper {
        @CalledByNative
        static void onBooleanResultFromNative(Callback callback, boolean z) {
            Boolean.valueOf(z);
        }

        @CalledByNative
        static void onIntResultFromNative(Callback callback, int i) {
            Integer.valueOf(i);
        }

        @CalledByNative
        static void onObjectResultFromNative(Callback callback, Object obj) {
        }
    }
}
