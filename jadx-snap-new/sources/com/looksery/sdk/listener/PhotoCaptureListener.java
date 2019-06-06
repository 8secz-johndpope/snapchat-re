package com.looksery.sdk.listener;

import android.graphics.Bitmap;

public interface PhotoCaptureListener {
    void onPhotoCaptured(Bitmap bitmap);

    void onPhotoFailed();
}
