package com.google.android.gms.internal;

import java.util.Map;

public final class zzajz extends zzr<zzp> {
    private final zzamd<zzp> zzdhi;
    private final Map<String, String> zzdhj;
    private final zzaks zzdhk;

    public zzajz(String str, zzamd<zzp> zzamd) {
        this(str, null, zzamd);
    }

    private zzajz(String str, Map<String, String> map, zzamd<zzp> zzamd) {
        super(0, str, new zzaka(zzamd));
        this.zzdhj = null;
        this.zzdhi = zzamd;
        this.zzdhk = new zzaks();
        this.zzdhk.zza(str, "GET", null, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final zzx<zzp> zza(zzp zzp) {
        return zzx.zza(zzp, zzap.zzb(zzp));
    }
}
