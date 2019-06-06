package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;

@zzabh
public final class zzanf extends zzana {
    public final zzamz zza(Context context, zzann zzann, int i, boolean z, zzov zzov, zzanm zzanm) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        Object obj = (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) ? 1 : null;
        if (obj == null) {
            return null;
        }
        return new zzamp(context, z, zzann.zzty().zzvl(), zzanm, new zzano(context, zzann.zztl(), zzann.getRequestId(), zzov, zzann.zzti()));
    }
}
