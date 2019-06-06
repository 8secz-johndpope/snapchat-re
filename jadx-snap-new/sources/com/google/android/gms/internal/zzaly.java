package com.google.android.gms.internal;

import java.util.concurrent.Executor;

@zzabh
public final class zzaly {
    public static final Executor zzdjt = new zzalz();
    public static final Executor zzdju = new zzama();
    private static zzalx zzdjv = zza(zzdjt);
    private static zzalx zzdjw = zza(zzdju);

    private static zzalx zza(Executor executor) {
        return new zzamb(executor, null);
    }
}
