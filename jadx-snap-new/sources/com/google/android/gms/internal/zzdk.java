package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzdk extends zzbu<Integer, Object> {
    public Long zzail;
    public Boolean zzaim;
    public Boolean zzain;

    public zzdk(String str) {
        zzj(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzj(String str) {
        HashMap zzk = zzbu.zzk(str);
        if (zzk != null) {
            this.zzail = (Long) zzk.get(Integer.valueOf(0));
            this.zzaim = (Boolean) zzk.get(Integer.valueOf(1));
            this.zzain = (Boolean) zzk.get(Integer.valueOf(2));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final HashMap<Integer, Object> zzy() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.zzail);
        hashMap.put(Integer.valueOf(1), this.zzaim);
        hashMap.put(Integer.valueOf(2), this.zzain);
        return hashMap;
    }
}
