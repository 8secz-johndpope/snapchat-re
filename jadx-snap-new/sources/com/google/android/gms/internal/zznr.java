package com.google.android.gms.internal;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class zznr extends zzmq {
    private final VideoLifecycleCallbacks zzamb;

    public zznr(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zzamb = videoLifecycleCallbacks;
    }

    public final void onVideoEnd() {
        this.zzamb.onVideoEnd();
    }

    public final void onVideoMute(boolean z) {
        this.zzamb.onVideoMute(z);
    }

    public final void onVideoPause() {
        this.zzamb.onVideoPause();
    }

    public final void onVideoPlay() {
        this.zzamb.onVideoPlay();
    }

    public final void onVideoStart() {
        this.zzamb.onVideoStart();
    }
}
