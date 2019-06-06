package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzcz extends zzbu<Integer, Long> {
    public long zzaif;
    public long zzaig;

    public zzcz() {
        this.zzaif = -1;
        this.zzaig = -1;
    }

    public zzcz(String str) {
        this();
        zzj(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzj(String str) {
        HashMap zzk = zzbu.zzk(str);
        if (zzk != null) {
            this.zzaif = ((Long) zzk.get(Integer.valueOf(0))).longValue();
            this.zzaig = ((Long) zzk.get(Integer.valueOf(1))).longValue();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final HashMap<Integer, Long> zzy() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), Long.valueOf(this.zzaif));
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.zzaig));
        return hashMap;
    }
}
