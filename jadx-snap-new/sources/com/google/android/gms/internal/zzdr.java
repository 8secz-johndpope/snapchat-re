package com.google.android.gms.internal;

import java.util.HashMap;

public final class zzdr extends zzbu<Integer, Long> {
    public Long zzajl;
    public Long zzajm;
    public Long zzajn;
    public Long zzajo;
    public Long zzajp;
    public Long zzajq;
    public Long zzajr;
    public Long zzfj;
    public Long zzfl;
    public Long zzfp;
    public Long zzfq;

    public zzdr(String str) {
        zzj(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzj(String str) {
        HashMap zzk = zzbu.zzk(str);
        if (zzk != null) {
            this.zzajl = (Long) zzk.get(Integer.valueOf(0));
            this.zzajm = (Long) zzk.get(Integer.valueOf(1));
            this.zzajn = (Long) zzk.get(Integer.valueOf(2));
            this.zzfl = (Long) zzk.get(Integer.valueOf(3));
            this.zzfj = (Long) zzk.get(Integer.valueOf(4));
            this.zzajo = (Long) zzk.get(Integer.valueOf(5));
            this.zzajp = (Long) zzk.get(Integer.valueOf(6));
            this.zzajq = (Long) zzk.get(Integer.valueOf(7));
            this.zzfq = (Long) zzk.get(Integer.valueOf(8));
            this.zzfp = (Long) zzk.get(Integer.valueOf(9));
            this.zzajr = (Long) zzk.get(Integer.valueOf(10));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final HashMap<Integer, Long> zzy() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.zzajl);
        hashMap.put(Integer.valueOf(1), this.zzajm);
        hashMap.put(Integer.valueOf(2), this.zzajn);
        hashMap.put(Integer.valueOf(3), this.zzfl);
        hashMap.put(Integer.valueOf(4), this.zzfj);
        hashMap.put(Integer.valueOf(5), this.zzajo);
        hashMap.put(Integer.valueOf(6), this.zzajp);
        hashMap.put(Integer.valueOf(7), this.zzajq);
        hashMap.put(Integer.valueOf(8), this.zzfq);
        hashMap.put(Integer.valueOf(9), this.zzfp);
        hashMap.put(Integer.valueOf(10), this.zzajr);
        return hashMap;
    }
}
