package com.google.android.gms.safetynet;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zzg;
import com.google.android.gms.common.internal.zzbj;
import com.google.android.gms.internal.zzcxf;
import com.google.android.gms.safetynet.SafetyNetApi.AttestationResponse;
import com.google.android.gms.tasks.Task;

public class SafetyNetClient extends GoogleApi<Object> {
    SafetyNetClient(Context context) {
        super(context, SafetyNet.API, null, new zzg());
    }

    public Task<AttestationResponse> attest(byte[] bArr, String str) {
        return zzbj.zza(zzcxf.zza(zzahw(), bArr, str), new AttestationResponse());
    }
}
