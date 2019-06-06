package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.zzae;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;

@zzabh
public final class zzow extends zzoz {
    private final zzae zzbwx;
    private final String zzbwy;
    private final String zzbwz;

    public zzow(zzae zzae, String str, String str2) {
        this.zzbwx = zzae;
        this.zzbwy = str;
        this.zzbwz = str2;
    }

    public final String getContent() {
        return this.zzbwz;
    }

    public final void recordClick() {
        this.zzbwx.zzcr();
    }

    public final void recordImpression() {
        this.zzbwx.zzcs();
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.zzbwx.zzh((View) zzn.zzy(iObjectWrapper));
        }
    }

    public final String zzjs() {
        return this.zzbwy;
    }
}
