package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbm;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

final /* synthetic */ class zzaqd implements Callable {
    private final Context zzdpw;
    private final boolean zzdry;
    private final boolean zzdrz;
    private final zzaqa zzdsj;
    private final String zzdsk;
    private final zzcv zzdsl;
    private final zzala zzdsm;
    private final zzov zzdsn;
    private final zzbm zzdso;
    private final zzv zzdsp;
    private final zziu zzdsq;

    zzaqd(Context context, zzaqa zzaqa, String str, boolean z, boolean z2, zzcv zzcv, zzala zzala, zzov zzov, zzbm zzbm, zzv zzv, zziu zziu) {
        this.zzdpw = context;
        this.zzdsj = zzaqa;
        this.zzdsk = str;
        this.zzdry = z;
        this.zzdrz = z2;
        this.zzdsl = zzcv;
        this.zzdsm = zzala;
        this.zzdsn = zzov;
        this.zzdso = zzbm;
        this.zzdsp = zzv;
        this.zzdsq = zziu;
    }

    public final Object call() {
        Context context = this.zzdpw;
        zzaqa zzaqa = this.zzdsj;
        String str = this.zzdsk;
        boolean z = this.zzdry;
        boolean z2 = this.zzdrz;
        zzaqe zzc = zzaqe.zzc(context, zzaqa, str, z, z2, this.zzdsl, this.zzdsm, this.zzdsn, this.zzdso, this.zzdsp, this.zzdsq);
        zzc.setWebViewClient(zzbt.zzen().zzc(zzc, z2));
        zzc.setWebChromeClient(zzbt.zzen().zzj(zzc));
        return new zzaoq(zzc);
    }
}
