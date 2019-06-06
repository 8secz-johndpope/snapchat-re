package com.google.android.gms.common.api;

import android.app.Activity;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public void startResolutionForResult(Activity activity, int i) {
        this.mStatus.startResolutionForResult(activity, i);
    }
}
