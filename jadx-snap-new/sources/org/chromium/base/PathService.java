package org.chromium.base;

public abstract class PathService {
    private PathService() {
    }

    private static native void nativeOverride(int i, String str);
}
