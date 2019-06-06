package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.js.zzaa;
import com.google.android.gms.ads.internal.js.zzaj;
import com.google.android.gms.ads.internal.js.zzn;
import com.google.android.gms.ads.internal.zzbt;
import org.json.JSONObject;

@zzabh
public final class zzvi<I, O> implements zzux<I, O> {
    private final zzn zzcgr;
    private final zzuz<O> zzcgs;
    private final zzva<I> zzcgt;
    private final String zzcgu;

    zzvi(zzn zzn, String str, zzva<I> zzva, zzuz<O> zzuz) {
        this.zzcgr = zzn;
        this.zzcgu = str;
        this.zzcgt = zzva;
        this.zzcgs = zzuz;
    }

    private final void zza(zzaa zzaa, zzaj zzaj, I i, zzamd<O> zzamd) {
        try {
            zzbt.zzel();
            String zzrc = zzaij.zzrc();
            zzd.zzcbs.zza(zzrc, new zzvl(this, zzaa, zzamd));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", zzrc);
            jSONObject.put("args", this.zzcgt.zzg(i));
            zzaj.zzb(this.zzcgu, jSONObject);
        } catch (Exception e) {
            zzamd.setException(e);
            zzaky.zzb("Unable to invokeJavaScript", e);
        } finally {
            zzaa.release();
        }
    }

    public final zzalt<O> zzc(I i) {
        return zzf(i);
    }

    public final zzalt<O> zzf(I i) {
        zzamd zzamd = new zzamd();
        zzaa zzb = this.zzcgr.zzb(null);
        zzb.zza(new zzvj(this, zzb, i, zzamd), new zzvk(this, zzamd, zzb));
        return zzamd;
    }
}
