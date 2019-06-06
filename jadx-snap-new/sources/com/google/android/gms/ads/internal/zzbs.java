package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzoi;
import java.util.Map;
import java.util.TreeMap;

final class zzbs {
    private final String zzask;
    private final Map<String, String> zzasl = new TreeMap();
    private String zzasm;
    private String zzasn;

    public zzbs(String str) {
        this.zzask = str;
    }

    public final String getQuery() {
        return this.zzasm;
    }

    public final void zza(zzkk zzkk, zzala zzala) {
        this.zzasm = zzkk.zzbhc.zzbkm;
        Bundle bundle = zzkk.zzbhf != null ? zzkk.zzbhf.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = (String) zzlc.zzio().zzd(zzoi.zzbtq);
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.zzasn = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.zzasl.put(str2.substring(4), bundle.getString(str2));
                }
            }
            this.zzasl.put("SDKVersion", zzala.zzcu);
        }
    }

    public final String zzed() {
        return this.zzasn;
    }

    public final String zzee() {
        return this.zzask;
    }

    public final Map<String, String> zzef() {
        return this.zzasl;
    }
}
