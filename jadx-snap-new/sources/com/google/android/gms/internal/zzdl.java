package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzdl extends zzbu<Integer, Long> {
    public Long zzaio;
    public Long zzaip;

    public zzdl(String str) {
        zzj(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzj(String str) {
        HashMap zzk = zzbu.zzk(str);
        if (zzk != null) {
            this.zzaio = (Long) zzk.get(Integer.valueOf(0));
            this.zzaip = (Long) zzk.get(Integer.valueOf(1));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final HashMap<Integer, Long> zzy() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.zzaio);
        hashMap.put(Integer.valueOf(1), this.zzaip);
        return hashMap;
    }
}
