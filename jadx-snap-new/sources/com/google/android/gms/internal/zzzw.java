package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@zzabh
public abstract class zzzw<T extends zzaan> implements zzaan<T> {
    private final HashMap<String, List<zzt<? super T>>> zzcou = new HashMap();

    public void zza(String str, zzt<? super T> zzt) {
        List list = (List) this.zzcou.get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList();
            this.zzcou.put(str, list);
        }
        list.add(zzt);
    }

    public void zzb(String str, zzt<? super T> zzt) {
        List list = (List) this.zzcou.get(str);
        if (list != null) {
            list.remove(zzt);
        }
    }
}
