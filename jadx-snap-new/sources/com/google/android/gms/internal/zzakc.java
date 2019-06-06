package com.google.android.gms.internal;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@zzabh
public final class zzakc {
    private Map<Integer, Bitmap> zzdho = new ConcurrentHashMap();
    private AtomicInteger zzdhp = new AtomicInteger(0);

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.zzdho.get(num);
    }

    public final int zzb(Bitmap bitmap) {
        if (bitmap == null) {
            zzaky.zzby("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.zzdhp.getAndIncrement();
        this.zzdho.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    public final void zzb(Integer num) {
        this.zzdho.remove(num);
    }
}
