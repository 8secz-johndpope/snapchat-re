package com.snap.android.linearallocexpander;

import android.text.TextUtils;

public class LaExpander {
    public static final int DEFAULT_KITKAT_LINEAR_ALLOC_SIZE = 16777216;
    private static final String KEY_ARENA_SIZE = "arena_size";
    private static final String KEY_POST_REINITIALIZATION_TIMEOUT_MILLIS = "post_reinitialization_timeout_millis";
    private static final String KEY_REINITIALIZATION_ENABLED = "reinitialization_enabled";
    private static final String KEY_REINITIALIZATION_ERROR = "reinitialization_error";
    private static final String KEY_REINITIALIZATION_MAX_FAILED_ATTEMPTS = "reinitialization_max_failed_attempts_count";
    private static final String KEY_REINITIALIZATION_STATUS = "reinitialization_status";
    private static volatile String propertiesInitError;
    private static volatile boolean propertiesInitialized;

    public enum ReinitStatus {
        Unknown,
        Skipped,
        DvmNotFound,
        Success,
        Failed
    }

    static {
        System.loadLibrary("LaExpander");
    }

    public static void enableArenaReinintialization(boolean z) {
        if (propertiesInitialized) {
            nativeSetProperty(KEY_REINITIALIZATION_ENABLED, z);
        }
    }

    public static String getErrorMessage() {
        if (propertiesInitialized) {
            return nativeGetStringProperty(KEY_REINITIALIZATION_ERROR);
        }
        StringBuilder stringBuilder = new StringBuilder("Properties are not ready: ");
        stringBuilder.append(propertiesInitError);
        return stringBuilder.toString();
    }

    public static ReinitStatus getReinitializationStatus() {
        if (!propertiesInitialized) {
            return ReinitStatus.Failed;
        }
        try {
            return ReinitStatus.valueOf(nativeGetStringProperty(KEY_REINITIALIZATION_STATUS));
        } catch (Exception unused) {
            return ReinitStatus.Unknown;
        }
    }

    public static void initialize(String str) {
        if (!propertiesInitialized) {
            str = nativeSetPropertiesFile(str);
            propertiesInitError = str;
            propertiesInitialized = TextUtils.isEmpty(str);
        }
    }

    private static native String nativeGetStringProperty(String str);

    private static native void nativeReinitializeArena();

    private static native String nativeSetPropertiesFile(String str);

    private static native void nativeSetProperty(String str, int i);

    public static void setMaxAttemptsCount(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Invalid max count: ".concat(String.valueOf(i)));
        } else if (propertiesInitialized) {
            nativeSetProperty(KEY_REINITIALIZATION_MAX_FAILED_ATTEMPTS, i);
        }
    }

    public static void setNewArenaSize(int i) {
        if (i < DEFAULT_KITKAT_LINEAR_ALLOC_SIZE) {
            throw new IllegalArgumentException("Invalid arena size: ".concat(String.valueOf(i)));
        } else if (propertiesInitialized) {
            nativeSetProperty(KEY_ARENA_SIZE, i);
        }
    }

    public static void setPostReinitializationTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid timeout: ".concat(String.valueOf(i)));
        } else if (propertiesInitialized) {
            nativeSetProperty(KEY_POST_REINITIALIZATION_TIMEOUT_MILLIS, i);
        }
    }

    public static void tryReinitializeArena() {
        if (propertiesInitialized) {
            nativeReinitializeArena();
        }
    }
}
