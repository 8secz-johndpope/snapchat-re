package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;

public interface SafetyNetApi {

    public static class AttestationResponse extends Response<zza> {
        public String getJwsResult() {
            return ((zza) getResult()).getJwsResult();
        }
    }

    @Deprecated
    public interface zza extends Result {
        String getJwsResult();
    }
}
