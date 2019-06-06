package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.zzf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class zzar extends zzay {
    final /* synthetic */ zzao zzfxt;
    private final Map<zze, zzaq> zzfxv;

    public zzar(zzao zzao, Map<zze, zzaq> map) {
        this.zzfxt = zzao;
        super(zzao, null);
        this.zzfxv = map;
    }

    private final int zza(zze zze, Map<zze, Integer> map) {
        zzbq.checkNotNull(zze);
        zzbq.checkNotNull(map);
        if (!zze.zzahn()) {
            return 0;
        }
        if (map.containsKey(zze)) {
            return ((Integer) map.get(zze)).intValue();
        }
        int intValue;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            zze zze2 = (zze) it.next();
            zze2.zzahq();
            zze.zzahq();
            intValue = ((Integer) map.get(zze2)).intValue();
        } else {
            intValue = -1;
        }
        if (intValue == -1) {
            intValue = zzf.zzc(this.zzfxt.mContext, zze.zzahq());
        }
        map.put(zze, Integer.valueOf(intValue));
        return intValue;
    }

    public final void zzajj() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (zze zze : this.zzfxv.keySet()) {
            if (!zze.zzahn() || ((zzaq) this.zzfxv.get(zze)).zzfvo) {
                arrayList2.add(zze);
            } else {
                arrayList.add(zze);
            }
        }
        HashMap hashMap = new HashMap(this.zzfxv.size());
        int i = -1;
        int i2 = 0;
        Object obj;
        if (!arrayList.isEmpty()) {
            arrayList = arrayList;
            int size = arrayList.size();
            while (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                i = zza((zze) obj, hashMap);
                if (i != 0) {
                    break;
                }
            }
        }
        arrayList2 = arrayList2;
        int size2 = arrayList2.size();
        while (i2 < size2) {
            obj = arrayList2.get(i2);
            i2++;
            i = zza((zze) obj, hashMap);
            if (i == 0) {
                break;
            }
        }
        if (i != 0) {
            this.zzfxt.zzfxd.zza(new zzas(this, this.zzfxt, new ConnectionResult(i, null)));
            return;
        }
        if (this.zzfxt.zzfxn) {
            this.zzfxt.zzfxl.connect();
        }
        for (zze zze2 : this.zzfxv.keySet()) {
            zzj zzj = (zzj) this.zzfxv.get(zze2);
            if (!zze2.zzahn() || zza(zze2, hashMap) == 0) {
                zze2.zza(zzj);
            } else {
                this.zzfxt.zzfxd.zza(new zzat(this, this.zzfxt, zzj));
            }
        }
    }
}
