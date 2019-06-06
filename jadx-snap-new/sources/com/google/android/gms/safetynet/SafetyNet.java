package com.google.android.gms.safetynet;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.internal.zzcxf;
import com.google.android.gms.internal.zzcxs;
import com.google.android.gms.internal.zzcxt;

public final class SafetyNet {
    @Deprecated
    public static final Api<Object> API = new Api("SafetyNet.API", zzegv, zzegu);
    @Deprecated
    public static final SafetyNetApi SafetyNetApi = new zzcxf();
    private static zzf<zzcxs> zzegu = new zzf();
    private static zza<zzcxs, Object> zzegv = new zzk();
    private static zzo zzkki = new zzcxt();

    public static SafetyNetClient getClient(Context context) {
        return new SafetyNetClient(context);
    }
}
