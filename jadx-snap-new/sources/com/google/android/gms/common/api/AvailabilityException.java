package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.zzh;
import com.google.android.gms.common.internal.zzbq;
import defpackage.iv;
import java.util.ArrayList;

public class AvailabilityException extends Exception {
    private final iv<zzh<?>, ConnectionResult> zzfse;

    public AvailabilityException(iv<zzh<?>, ConnectionResult> ivVar) {
        this.zzfse = ivVar;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends ApiOptions> googleApi) {
        zzh zzahv = googleApi.zzahv();
        zzbq.checkArgument(this.zzfse.get(zzahv) != null, "The given API was not part of the availability request.");
        return (ConnectionResult) this.zzfse.get(zzahv);
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Object obj = 1;
        for (zzh zzh : this.zzfse.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.zzfse.get(zzh);
            if (connectionResult.isSuccess()) {
                obj = null;
            }
            String zzaig = zzh.zzaig();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzaig).length() + 2) + String.valueOf(valueOf).length());
            stringBuilder.append(zzaig);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf);
            arrayList.add(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(obj != null ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        stringBuilder2.append(TextUtils.join("; ", arrayList));
        return stringBuilder2.toString();
    }

    public final iv<zzh<?>, ConnectionResult> zzahr() {
        return this.zzfse;
    }
}
