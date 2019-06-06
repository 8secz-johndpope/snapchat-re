package com.facebook.animated.webp;

import defpackage.auc;
import defpackage.aue;
import defpackage.auh;
import defpackage.ayd;
import defpackage.aye;
import defpackage.ayf;
import defpackage.ayz;
import defpackage.azz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@aue
public class WebPImage implements aye, ayz {
    @aue
    private long mNativeContext;

    @aue
    WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            auc.a(inputStream, byteArrayOutputStream);
            Object toByteArray = byteArrayOutputStream.toByteArray();
            azz.a();
            auh.a(toByteArray);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(toByteArray.length);
            allocateDirect.put(toByteArray);
            allocateDirect.rewind();
            return nativeCreateFromDirectByteBuffer(allocateDirect);
        } catch (IOException unused) {
            return null;
        }
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public final aye a(long j, int i) {
        azz.a();
        auh.a(j != 0);
        return nativeCreateFromNativeMemory(j, i);
    }

    public final WebPFrame a(int i) {
        return nativeGetFrame(i);
    }

    public final void a() {
        nativeDispose();
    }

    public final int b() {
        return nativeGetWidth();
    }

    public final ayd b(int i) {
        WebPFrame nativeGetFrame = nativeGetFrame(i);
        try {
            ayd ayd = new ayd(i, nativeGetFrame.nativeGetXOffset(), nativeGetFrame.nativeGetYOffset(), nativeGetFrame.nativeGetWidth(), nativeGetFrame.nativeGetHeight(), nativeGetFrame.nativeIsBlendWithPreviousFrame() ? 1 : 2, nativeGetFrame.nativeShouldDisposeToBackgroundColor() ? 2 : 1);
            return ayd;
        } finally {
            nativeGetFrame.nativeDispose();
        }
    }

    public final aye b(InputStream inputStream) {
        return a(inputStream);
    }

    public final int c() {
        return nativeGetHeight();
    }

    public final /* synthetic */ ayf c(int i) {
        return nativeGetFrame(i);
    }

    public final int d() {
        return nativeGetFrameCount();
    }

    public final int[] e() {
        return nativeGetFrameDurations();
    }

    public final int f() {
        return nativeGetLoopCount();
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        nativeFinalize();
    }

    public final int g() {
        return nativeGetSizeInBytes();
    }
}
