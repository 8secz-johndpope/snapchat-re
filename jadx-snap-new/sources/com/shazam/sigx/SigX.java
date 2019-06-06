package com.shazam.sigx;

import com.shazam.sig.SampleRate;
import com.shazam.sig.SigOptions;
import com.shazam.sig.SigType;

public class SigX {
    public static final String[] libToLoad = new String[]{"c++_shared", "sigx"};
    private static boolean loaded;
    private long opaque;

    static {
        loaded = false;
        try {
            for (String loadLibrary : libToLoad) {
                System.loadLibrary(loadLibrary);
            }
            loaded = true;
        } catch (Throwable unused) {
            loaded = false;
        }
    }

    public SigX(SigType sigType, SampleRate sampleRate, SigOptions sigOptions) {
        construct(sigType.getType(), sampleRate.getHz(), sigOptions.getOptions());
    }

    private native void construct(int i, int i2, int i3);

    private native void deconstruct();

    private native byte[] getSignature(int i);

    public static native String getVersion();

    public static boolean isLoaded() {
        return loaded;
    }

    public native void disableSpectralOutput();

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            deconstruct();
        } finally {
            super.finalize();
        }
    }

    public native void flow(byte[] bArr, int i);

    public native long getCurrentSpectralFrameIndex();

    public byte[] getSignature() {
        return getSignature(SigOptions.DEFAULT);
    }

    public byte[] getSignature(SigOptions sigOptions) {
        return getSignature(sigOptions.getOptions());
    }

    public native int[] getSpectralFrame(long j, long j2);

    public native int getSpectralFrameIndex(long j);

    public native void reset();

    public native void setupSpectralOutput(int i, int i2, long j, int[] iArr);
}
