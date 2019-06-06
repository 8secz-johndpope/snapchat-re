package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@zzabh
public final class zzmu {
    private final boolean zzamp;
    private final int zzbhm;
    private final int zzbhp;
    private final String zzbhq;
    private final String zzbhs;
    private final Bundle zzbhu;
    private final String zzbhw;
    private final boolean zzbhy;
    private final Bundle zzbji;
    private final Map<Class<? extends Object>, Object> zzbjj;
    private final SearchAdRequest zzbjk;
    private final Set<String> zzbjl;
    private final Set<String> zzbjm;
    private final Date zzhh;
    private final Set<String> zzhj;
    private final Location zzhl;

    public zzmu(zzmv zzmv) {
        this(zzmv, null);
    }

    public zzmu(zzmv zzmv, SearchAdRequest searchAdRequest) {
        this.zzhh = zzmv.zzhh;
        this.zzbhs = zzmv.zzbhs;
        this.zzbhm = zzmv.zzbhm;
        this.zzhj = Collections.unmodifiableSet(zzmv.zzbjn);
        this.zzhl = zzmv.zzhl;
        this.zzamp = zzmv.zzamp;
        this.zzbji = zzmv.zzbji;
        this.zzbjj = Collections.unmodifiableMap(zzmv.zzbjo);
        this.zzbhq = zzmv.zzbhq;
        this.zzbhw = zzmv.zzbhw;
        this.zzbjk = searchAdRequest;
        this.zzbhp = zzmv.zzbhp;
        this.zzbjl = Collections.unmodifiableSet(zzmv.zzbjp);
        this.zzbhu = zzmv.zzbhu;
        this.zzbjm = Collections.unmodifiableSet(zzmv.zzbjq);
        this.zzbhy = zzmv.zzbhy;
    }

    public final Date getBirthday() {
        return this.zzhh;
    }

    public final String getContentUrl() {
        return this.zzbhs;
    }

    public final Bundle getCustomTargeting() {
        return this.zzbhu;
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

    public final boolean getManualImpressionsEnabled() {
        return this.zzamp;
    }

    public final Bundle getNetworkExtrasBundle(Class<? extends MediationAdapter> cls) {
        return this.zzbji.getBundle(cls.getName());
    }

    public final String getPublisherProvidedId() {
        return this.zzbhq;
    }

    public final boolean isDesignedForFamilies() {
        return this.zzbhy;
    }

    public final boolean isTestDevice(Context context) {
        Set set = this.zzbjl;
        zzlc.zzij();
        return set.contains(zzako.zzaz(context));
    }

    public final String zzit() {
        return this.zzbhw;
    }

    public final SearchAdRequest zziu() {
        return this.zzbjk;
    }

    public final Map<Class<? extends Object>, Object> zziv() {
        return this.zzbjj;
    }

    public final Bundle zziw() {
        return this.zzbji;
    }

    public final int zzix() {
        return this.zzbhp;
    }

    public final Set<String> zziy() {
        return this.zzbjm;
    }
}
