package com.google.android.gms.internal;

import android.os.IInterface;

public interface zzmp extends IInterface {
    void onVideoEnd();

    void onVideoMute(boolean z);

    void onVideoPause();

    void onVideoPlay();

    void onVideoStart();
}
