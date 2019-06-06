package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzdt extends zzbu<Integer, Long> {
    public Long zzajt;
    public Long zzgd;
    public Long zzge;

    public zzdt(String str) {
        zzj(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzj(String str) {
        HashMap zzk = zzbu.zzk(str);
        if (zzk != null) {
            this.zzajt = (Long) zzk.get(Integer.valueOf(0));
            this.zzgd = (Long) zzk.get(Integer.valueOf(1));
            this.zzge = (Long) zzk.get(Integer.valueOf(2));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final HashMap<Integer, Long> zzy() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.zzajt);
        hashMap.put(Integer.valueOf(1), this.zzgd);
        hashMap.put(Integer.valueOf(2), this.zzge);
        return hashMap;
    }
}
