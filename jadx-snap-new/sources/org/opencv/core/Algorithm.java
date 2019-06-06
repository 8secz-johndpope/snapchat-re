package org.opencv.core;

public class Algorithm {
    protected final long nativeObj;

    protected Algorithm(long j) {
        this.nativeObj = j;
    }

    private static native void clear_0(long j);

    private static native void delete(long j);

    private static native String getDefaultName_0(long j);

    private static native void save_0(long j, String str);

    public void clear() {
        clear_0(this.nativeObj);
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete(this.nativeObj);
    }

    public String getDefaultName() {
        return getDefaultName_0(this.nativeObj);
    }

    public void save(String str) {
        save_0(this.nativeObj, str);
    }
}
