package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.zzm;
import com.google.android.gms.safetynet.SafetyNet;

abstract class zzcxa<R extends Result> extends zzm<R, zzcxs> {
    public zzcxa(GoogleApiClient googleApiClient) {
        super(SafetyNet.API, googleApiClient);
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}
