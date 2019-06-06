package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzbw extends zzbu<Integer, Object> {
    public String zzcv;
    public String zzcx;
    public String zzcy;
    public String zzcz;
    public long zzyv;

    public zzbw() {
        String str = "E";
        this.zzcv = str;
        this.zzyv = -1;
        this.zzcx = str;
        this.zzcy = str;
        this.zzcz = str;
    }

    public zzbw(String str) {
        this();
        zzj(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzj(String str) {
        HashMap zzk = zzbu.zzk(str);
        if (zzk != null) {
            String str2 = "E";
            this.zzcv = zzk.get(Integer.valueOf(0)) == null ? str2 : (String) zzk.get(Integer.valueOf(0));
            this.zzyv = zzk.get(Integer.valueOf(1)) == null ? -1 : ((Long) zzk.get(Integer.valueOf(1))).longValue();
            this.zzcx = zzk.get(Integer.valueOf(2)) == null ? str2 : (String) zzk.get(Integer.valueOf(2));
            this.zzcy = zzk.get(Integer.valueOf(3)) == null ? str2 : (String) zzk.get(Integer.valueOf(3));
            if (zzk.get(Integer.valueOf(4)) != null) {
                str2 = (String) zzk.get(Integer.valueOf(4));
            }
            this.zzcz = str2;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final HashMap<Integer, Object> zzy() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.zzcv);
        hashMap.put(Integer.valueOf(4), this.zzcz);
        hashMap.put(Integer.valueOf(3), this.zzcy);
        hashMap.put(Integer.valueOf(2), this.zzcx);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.zzyv));
        return hashMap;
    }
}
