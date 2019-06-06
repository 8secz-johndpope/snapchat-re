package org.chromium.base;

import defpackage.akop;
import defpackage.akor;
import org.chromium.base.annotations.CalledByNative;

public class MemoryPressureListener {
    private static final akop<akor> a = new akop();

    @CalledByNative
    private static void addNativeCallback() {
        a.a(-$$Lambda$MemoryPressureListener$N3BCzLNH5MlgSj1aHWJnNvYZx-E.INSTANCE);
    }

    private static native void nativeOnMemoryPressure(int i);
}
