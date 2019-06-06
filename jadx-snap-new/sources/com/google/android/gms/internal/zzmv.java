package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class zzmv {
    private boolean zzamp = false;
    private int zzbhm = -1;
    private int zzbhp = -1;
    private String zzbhq;
    private String zzbhs;
    private final Bundle zzbhu = new Bundle();
    private String zzbhw;
    private boolean zzbhy;
    private final Bundle zzbji = new Bundle();
    private final HashSet<String> zzbjn = new HashSet();
    private final HashMap<Class<? extends Object>, Object> zzbjo = new HashMap();
    private final HashSet<String> zzbjp = new HashSet();
    private final HashSet<String> zzbjq = new HashSet();
    private Date zzhh;
    private Location zzhl;

    public final void zza(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.zzbji.putBundle(cls.getName(), bundle);
    }

    public final void zza(Date date) {
        this.zzhh = date;
    }

    public final void zzad(String str) {
        this.zzbjn.add(str);
    }

    public final void zzae(String str) {
        this.zzbjp.add(str);
    }

    public final void zzaf(String str) {
        this.zzbjp.remove(str);
    }

    public final void zzb(Location location) {
        this.zzhl = location;
    }

    public final void zzj(boolean z) {
        this.zzbhp = z;
    }

    public final void zzk(boolean z) {
        this.zzbhy = z;
    }

    public final void zzr(int i) {
        this.zzbhm = i;
    }
}
