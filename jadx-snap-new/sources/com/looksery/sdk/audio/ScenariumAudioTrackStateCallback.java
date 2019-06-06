package com.looksery.sdk.audio;

class ScenariumAudioTrackStateCallback implements AudioTrackStateCallback {
    private volatile long mNativeHandle;

    ScenariumAudioTrackStateCallback() {
    }

    private native void nativeOnPlaybackComplete(long j, int i, boolean z);

    public void attachToNative(long j) {
        if (this.mNativeHandle == 0) {
            this.mNativeHandle = j;
            return;
        }
        throw new IllegalStateException("attached already");
    }

    public void detachFromNative() {
        this.mNativeHandle = 0;
    }

    public void onPlaybackComplete(int i, boolean z) {
        if (this.mNativeHandle != 0) {
            nativeOnPlaybackComplete(this.mNativeHandle, i, z);
        }
    }
}
