package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.Scope;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;

public final class zzcyg {
    public static final Api<zzcyk> API = new Api("SignIn.API", zzegv, zzegu);
    private static zzf<zzcyt> zzegu = new zzf();
    public static final zza<zzcyt, zzcyk> zzegv = new zzcyh();
    private static Scope zzemx = new Scope(MapboxNavigationEvent.KEY_PROFILE);
    private static Scope zzemy = new Scope("email");
    private static Api<Object> zzgpn = new Api("SignIn.INTERNAL_API", zzklo, zzkln);
    private static zzf<zzcyt> zzkln = new zzf();
    private static zza<zzcyt, Object> zzklo = new zzcyi();
}
