package com.google.android.gms.internal;

import org.json.JSONObject;

@zzabh
public final class zzahe {
    public final int errorCode;
    public final zzko zzaud;
    public final zzacf zzcvm;
    public final JSONObject zzdch;
    public final zzvq zzdcj;
    public final long zzdcn;
    public final long zzdco;
    public final zziu zzdcu;
    public final boolean zzdcv;
    public final zzacj zzdcw;

    public zzahe(zzacf zzacf, zzacj zzacj, zzvq zzvq, zzko zzko, int i, long j, long j2, JSONObject jSONObject, zziu zziu, Boolean bool) {
        this.zzcvm = zzacf;
        this.zzdcw = zzacj;
        this.zzdcj = zzvq;
        this.zzaud = zzko;
        this.errorCode = i;
        this.zzdcn = j;
        this.zzdco = j2;
        this.zzdch = jSONObject;
        this.zzdcu = zziu;
        boolean booleanValue = bool != null ? bool.booleanValue() : zzakh.zzo(zzacf.zzcrv);
        this.zzdcv = booleanValue;
    }

    public zzahe(zzacf zzacf, zzacj zzacj, zzvq zzvq, zzko zzko, int i, long j, long j2, JSONObject jSONObject, zziz zziz) {
        this.zzcvm = zzacf;
        this.zzdcw = zzacj;
        this.zzdcj = null;
        this.zzaud = null;
        this.errorCode = i;
        this.zzdcn = j;
        this.zzdco = j2;
        this.zzdch = null;
        this.zzdcu = new zziu(zziz);
        this.zzdcv = false;
    }
}
