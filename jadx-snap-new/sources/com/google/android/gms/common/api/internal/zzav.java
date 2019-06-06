package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.zzcyo;
import com.google.android.gms.internal.zzcyw;
import java.lang.ref.WeakReference;

final class zzav extends zzcyo {
    private final WeakReference<zzao> zzfxu;

    zzav(zzao zzao) {
        this.zzfxu = new WeakReference(zzao);
    }

    public final void zzb(zzcyw zzcyw) {
        zzao zzao = (zzao) this.zzfxu.get();
        if (zzao != null) {
            zzao.zzfxd.zza(new zzaw(this, zzao, zzao, zzcyw));
        }
    }
}
