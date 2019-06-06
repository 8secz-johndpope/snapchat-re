package com.google.android.gms.auth.api.phone;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zzg;
import com.google.android.gms.internal.zzayb;
import com.google.android.gms.tasks.Task;

public abstract class SmsRetrieverClient extends GoogleApi<Object> {
    private static final Api<Object> API = new Api("SmsRetriever.API", zzegv, zzegu);
    private static final zzf<zzayb> zzegu = new zzf();
    private static final zza<zzayb, Object> zzegv = new zza();

    public SmsRetrieverClient(Context context) {
        super(context, API, null, new zzg());
    }

    public abstract Task<Void> startSmsRetriever();
}
