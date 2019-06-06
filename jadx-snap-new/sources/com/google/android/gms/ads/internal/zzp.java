package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzko;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.record.CognacAppListModel;
import com.snap.core.db.record.FriendModel;
import defpackage.ppy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

@zzabh
public final class zzp {
    private static String bundleToString(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            String bundleToString = obj == null ? "null" : obj instanceof Bundle ? bundleToString((Bundle) obj) : obj.toString();
            stringBuilder.append(bundleToString);
        }
        return stringBuilder.toString();
    }

    public static Object[] zza(String str, zzkk zzkk, String str2, int i, zzko zzko) {
        HashSet hashSet = new HashSet(Arrays.asList(str.split(ppy.b)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains(FriendModel.BIRTHDAY)) {
            arrayList.add(Long.valueOf(zzkk.zzbgv));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(bundleToString(zzkk.extras));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzkk.zzbgw));
        }
        if (hashSet.contains("keywords")) {
            if (zzkk.zzbgx != null) {
                arrayList.add(zzkk.zzbgx.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzkk.zzbgy));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzkk.zzbgz));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzkk.zzbha));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzkk.zzbhb);
        }
        if (hashSet.contains(MapboxEvent.TYPE_LOCATION)) {
            if (zzkk.zzbhd != null) {
                arrayList.add(zzkk.zzbhd.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains(CognacAppListModel.CONTENTURL)) {
            arrayList.add(zzkk.zzbhe);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(bundleToString(zzkk.zzbhf));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(bundleToString(zzkk.zzbhg));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzkk.zzbhh != null) {
                arrayList.add(zzkk.zzbhh.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzkk.zzbhi);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzkk.zzbhj);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzkk.zzbhk));
        }
        return arrayList.toArray();
    }
}
