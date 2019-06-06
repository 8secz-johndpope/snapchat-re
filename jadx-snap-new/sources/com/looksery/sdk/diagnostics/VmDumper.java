package com.looksery.sdk.diagnostics;

import com.looksery.sdk.LSNativeLibraryLoader;

public class VmDumper {
    private VmDumper() {
    }

    public static void captureStateToFile(String str) {
        if (LSNativeLibraryLoader.checkIfLoadedOrTryToLoad()) {
            nativeCaptureStateToFile(str);
        }
    }

    private static native void nativeCaptureStateToFile(String str);
}
