package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNetApi;

public class zzcxf implements SafetyNetApi {
    private static final String TAG = "zzcxf";

    static class zza implements com.google.android.gms.safetynet.SafetyNetApi.zza {
        private final Status mStatus;
        private final com.google.android.gms.safetynet.zza zzkkq;

        public zza(Status status, com.google.android.gms.safetynet.zza zza) {
            this.mStatus = status;
            this.zzkkq = zza;
        }

        public final String getJwsResult() {
            com.google.android.gms.safetynet.zza zza = this.zzkkq;
            return zza == null ? null : zza.getJwsResult();
        }

        public final Status getStatus() {
            return this.mStatus;
        }
    }

    static abstract class zzb extends zzcxa<com.google.android.gms.safetynet.SafetyNetApi.zza> {
        protected zzcxb zzkkr = new zzcxn(this);

        public zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public final /* synthetic */ Result zzb(Status status) {
            return new zza(status, null);
        }
    }

    public static PendingResult<com.google.android.gms.safetynet.SafetyNetApi.zza> zza(GoogleApiClient googleApiClient, byte[] bArr, String str) {
        return googleApiClient.zzd(new zzcxg(googleApiClient, bArr, str));
    }
}
