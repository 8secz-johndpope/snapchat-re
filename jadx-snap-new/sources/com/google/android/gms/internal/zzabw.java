package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.zzj;

final class zzabw implements zzaby {
    private /* synthetic */ Context val$context;

    zzabw(Context context) {
        this.val$context = context;
    }

    public final boolean zza(zzala zzala) {
        zzlc.zzij();
        boolean zzbb = zzako.zzbb(this.val$context);
        Object obj = (((Boolean) zzlc.zzio().zzd(zzoi.zzbve)).booleanValue() && zzala.zzdjb) ? 1 : null;
        if (zzabv.zzd(this.val$context, zzala.zzdjb) && zzbb && obj == null) {
            if (zzj.zzcw(this.val$context)) {
                if (!((Boolean) zzlc.zzio().zzd(zzoi.zzbmx)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
