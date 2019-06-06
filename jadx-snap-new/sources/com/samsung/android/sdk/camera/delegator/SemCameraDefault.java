package com.samsung.android.sdk.camera.delegator;

import android.content.Context;

public class SemCameraDefault extends AbstractSemCamera {
    public int checkAvailability(Context context) {
        throw new UnsupportedOperationException("SEP VERSION NOT SUPPORTED!!!");
    }

    public boolean isFeatureEnabled(Context context, String str, int i) {
        throw new UnsupportedOperationException("SEP VERSION NOT SUPPORTED!!!");
    }
}
