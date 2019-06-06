package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbm;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzv;

@zzabh
public final class zzaqc {
    public static zzaof zza(Context context, zzaqa zzaqa, String str, boolean z, boolean z2, zzcv zzcv, zzala zzala, zzov zzov, zzbm zzbm, zzv zzv, zziu zziu) {
        try {
            return (zzaof) zzakg.zzb(null, new zzaqd(context, zzaqa, str, z, z2, zzcv, zzala, zzov, zzbm, zzv, zziu));
        } catch (Throwable th) {
            zzbt.zzep().zza(th, "AdWebViewFactory.newAdWebView2");
            zzaop zzaop = new zzaop("Webview initialization failed.", th);
        }
    }
}
