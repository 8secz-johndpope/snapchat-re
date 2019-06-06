package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@zzabh
public final class zzkn {
    public static final zzkn zzbhz = new zzkn();

    protected zzkn() {
    }

    public static zzkk zza(Context context, zzmu zzmu) {
        Context context2;
        List list;
        String zza;
        zzmu zzmu2 = zzmu;
        Date birthday = zzmu.getBirthday();
        long time = birthday != null ? birthday.getTime() : -1;
        String contentUrl = zzmu.getContentUrl();
        int gender = zzmu.getGender();
        Set keywords = zzmu.getKeywords();
        if (keywords.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(keywords));
            context2 = context;
        }
        boolean isTestDevice = zzmu2.isTestDevice(context2);
        int zzix = zzmu.zzix();
        Location location = zzmu.getLocation();
        Bundle networkExtrasBundle = zzmu2.getNetworkExtrasBundle(AdMobAdapter.class);
        boolean manualImpressionsEnabled = zzmu.getManualImpressionsEnabled();
        String publisherProvidedId = zzmu.getPublisherProvidedId();
        SearchAdRequest zziu = zzmu.zziu();
        zzno zzno = zziu != null ? new zzno(zziu) : null;
        context2 = context.getApplicationContext();
        if (context2 != null) {
            String packageName = context2.getPackageName();
            zzlc.zzij();
            zza = zzako.zza(Thread.currentThread().getStackTrace(), packageName);
        } else {
            zza = null;
        }
        return new zzkk(7, time, networkExtrasBundle, gender, list, isTestDevice, zzix, manualImpressionsEnabled, publisherProvidedId, zzno, location, contentUrl, zzmu.zziw(), zzmu.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzmu.zziy())), zzmu.zzit(), zza, zzmu.isDesignedForFamilies());
    }
}
