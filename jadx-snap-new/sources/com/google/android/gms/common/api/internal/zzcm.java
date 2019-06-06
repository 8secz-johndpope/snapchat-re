package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.zzbq;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzcm {
    private final Set<zzci<?>> zzfgd = Collections.newSetFromMap(new WeakHashMap());

    public static <L> zzci<L> zzb(L l, Looper looper, String str) {
        zzbq.checkNotNull(l, "Listener must not be null");
        zzbq.checkNotNull(looper, "Looper must not be null");
        zzbq.checkNotNull(str, "Listener type must not be null");
        return new zzci(looper, l, str);
    }

    public static <L> zzck<L> zzb(L l, String str) {
        zzbq.checkNotNull(l, "Listener must not be null");
        zzbq.checkNotNull(str, "Listener type must not be null");
        zzbq.zzh(str, "Listener type must not be empty");
        return new zzck(l, str);
    }

    public final void release() {
        for (zzci clear : this.zzfgd) {
            clear.clear();
        }
        this.zzfgd.clear();
    }
}
