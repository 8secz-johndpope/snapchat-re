package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@zzabh
public final class zzxb implements MediationAdRequest {
    private final int zzbhm;
    private final boolean zzbhy;
    private final int zzcjy;
    private final Date zzhh;
    private final Set<String> zzhj;
    private final boolean zzhk;
    private final Location zzhl;

    public zzxb(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2) {
        this.zzhh = date;
        this.zzbhm = i;
        this.zzhj = set;
        this.zzhl = location;
        this.zzhk = z;
        this.zzcjy = i2;
        this.zzbhy = z2;
    }

    public final Date getBirthday() {
        return this.zzhh;
    }

    public final int getGender() {
        return this.zzbhm;
    }

    public final Set<String> getKeywords() {
        return this.zzhj;
    }

    public final Location getLocation() {
        return this.zzhl;
    }

    public final boolean isDesignedForFamilies() {
        return this.zzbhy;
    }

    public final boolean isTesting() {
        return this.zzhk;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzcjy;
    }
}
