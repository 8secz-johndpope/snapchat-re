package com.snapchat.breakpad;

import android.content.Context;
import android.util.Log;
import com.snap.android.ferrite.core.BuildConfig;

public class SCBreakpadWrapper {
    private static volatile String lastError = "";
    private static final boolean nativeCodeIsReady = false;

    static {
        String str = "sc-breakpad";
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary(BuildConfig.LIB_FERRITE_NAME);
            System.loadLibrary(str);
        } catch (Exception e) {
            Log.w(str, "Failed to load native code", e);
            lastError = e.getMessage() != null ? e.getMessage() : Log.getStackTraceString(e);
        } finally {
        }
    }

    private SCBreakpadWrapper() {
    }

    public static boolean doSegmentationFault() {
        if (!nativeCodeIsReady) {
            return false;
        }
        nativeDoSegmentationFault();
        throw new RuntimeException("non-reachable");
    }

    public static String getLastError() {
        return lastError;
    }

    private static native void nativeDoSegmentationFault();

    private static native boolean nativeSetUpUnhandledExceptionHandler(String str, String str2, String str3);

    private static boolean setUpHandlerInternal(String str, String str2, String str3) {
        if (!nativeCodeIsReady) {
            return false;
        }
        boolean nativeSetUpUnhandledExceptionHandler = nativeSetUpUnhandledExceptionHandler(str, str2, str3);
        if (!nativeSetUpUnhandledExceptionHandler) {
            lastError = "native initialization failed";
        }
        return nativeSetUpUnhandledExceptionHandler;
    }

    public static boolean setUpUnhandledExceptionHandler(Context context, String str, String str2) {
        return setUpHandlerInternal(str, context.getApplicationInfo().nativeLibraryDir, str2);
    }

    public static boolean setUpUnhandledExceptionHandler(String str) {
        return setUpHandlerInternal(str, null, null);
    }
}
