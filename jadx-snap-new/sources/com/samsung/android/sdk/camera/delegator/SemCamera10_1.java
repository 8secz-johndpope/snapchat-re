package com.samsung.android.sdk.camera.delegator;

import android.content.Context;
import com.samsung.android.sep.camera.SemCamera;

public class SemCamera10_1 extends AbstractSemCamera {
    private SemCamera mSemCamera;

    public int checkAvailability(Context context) {
        return SemCamera.getInstance().checkAvailability(context);
    }

    public boolean isFeatureEnabled(Context context, String str, int i) {
        return SemCamera.getInstance().isFeatureEnabled(context, str, i);
    }
}
