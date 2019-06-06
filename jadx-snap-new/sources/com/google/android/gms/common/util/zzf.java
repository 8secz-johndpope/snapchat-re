package com.google.android.gms.common.util;

import defpackage.iv;
import defpackage.iw;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzf {
    private static <K, V> Map<K, V> zza(int i, boolean z, K[] kArr, V[] vArr) {
        int i2 = 0;
        Map zzh = zzh(i, false);
        while (i2 < kArr.length) {
            zzh.put(kArr[i2], vArr[i2]);
            i2++;
        }
        return zzh;
    }

    public static <K, V> Map<K, V> zza(K k, V v, K k2, V v2, K k3, V v3) {
        Map zzh = zzh(3, false);
        zzh.put(k, v);
        zzh.put(k2, v2);
        zzh.put(k3, v3);
        return Collections.unmodifiableMap(zzh);
    }

    public static <T> Set<T> zza(T t, T t2, T t3) {
        Set zzg = zzg(3, false);
        zzg.add(t);
        zzg.add(t2);
        zzg.add(t3);
        return Collections.unmodifiableSet(zzg);
    }

    public static <K, V> Map<K, V> zzb(K[] kArr, V[] vArr) {
        if (kArr.length == vArr.length) {
            int length = kArr.length;
            return length != 0 ? length != 1 ? Collections.unmodifiableMap(zza(kArr.length, false, kArr, vArr)) : Collections.singletonMap(kArr[0], vArr[0]) : Collections.emptyMap();
        } else {
            int length2 = kArr.length;
            int length3 = vArr.length;
            StringBuilder stringBuilder = new StringBuilder(66);
            stringBuilder.append("Key and values array lengths not equal: ");
            stringBuilder.append(length2);
            stringBuilder.append(" != ");
            stringBuilder.append(length3);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static <T> Set<T> zzb(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        Object obj;
        Object obj2;
        if (length == 2) {
            obj = tArr[0];
            obj2 = tArr[1];
            Set zzg = zzg(2, false);
            zzg.add(obj);
            zzg.add(obj2);
            return Collections.unmodifiableSet(zzg);
        } else if (length == 3) {
            return zza(tArr[0], tArr[1], tArr[2]);
        } else {
            if (length != 4) {
                Set zzg2 = zzg(tArr.length, false);
                Collections.addAll(zzg2, tArr);
                return Collections.unmodifiableSet(zzg2);
            }
            obj = tArr[0];
            Object obj3 = tArr[1];
            Object obj4 = tArr[2];
            obj2 = tArr[3];
            Set zzg3 = zzg(4, false);
            zzg3.add(obj);
            zzg3.add(obj3);
            zzg3.add(obj4);
            zzg3.add(obj2);
            return Collections.unmodifiableSet(zzg3);
        }
    }

    private static <T> Set<T> zzg(int i, boolean z) {
        return i <= 256 ? new iw(i) : new HashSet(i, 1.0f);
    }

    private static <K, V> Map<K, V> zzh(int i, boolean z) {
        return i <= 256 ? new iv(i) : new HashMap(i, 1.0f);
    }
}
