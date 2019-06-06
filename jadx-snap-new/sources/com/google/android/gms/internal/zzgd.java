package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import org.json.JSONObject;

@zzabh
public final class zzgd implements zzgq {
    private final zzfv zzawv;
    private final zzaof zzaww;
    private final zzt<zzaof> zzawx = new zzge(this);
    private final zzt<zzaof> zzawy = new zzgf(this);
    private final zzt<zzaof> zzawz = new zzgg(this);

    public zzgd(zzfv zzfv, zzaof zzaof) {
        this.zzawv = zzfv;
        this.zzaww = zzaof;
        zzaof zzaof2 = this.zzaww;
        zzaof2.zza("/updateActiveView", this.zzawx);
        zzaof2.zza("/untrackActiveViewUnit", this.zzawy);
        zzaof2.zza("/visibilityChanged", this.zzawz);
        String valueOf = String.valueOf(this.zzawv.zzavy.zzfy());
        String str = "Custom JS tracking ad unit: ";
        zzaky.zzby(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final void zzb(JSONObject jSONObject, boolean z) {
        if (z) {
            this.zzawv.zzb(this);
        } else {
            this.zzaww.zzb("AFMA_updateActiveView", jSONObject);
        }
    }

    public final boolean zzgk() {
        return true;
    }

    public final void zzgl() {
        zzaof zzaof = this.zzaww;
        zzaof.zzb("/visibilityChanged", this.zzawz);
        zzaof.zzb("/untrackActiveViewUnit", this.zzawy);
        zzaof.zzb("/updateActiveView", this.zzawx);
    }
}
