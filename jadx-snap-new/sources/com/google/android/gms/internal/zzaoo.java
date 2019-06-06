package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbm;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

final class zzaoo implements Callable<zzaof> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzcv zzcfv;
    private /* synthetic */ zzaqa zzdqb;
    private /* synthetic */ String zzdqc;
    private /* synthetic */ boolean zzdqd;
    private /* synthetic */ boolean zzdqe;
    private /* synthetic */ zzala zzdqf;
    private /* synthetic */ zzov zzdqg;
    private /* synthetic */ zzbm zzdqh;
    private /* synthetic */ zzv zzdqi;
    private /* synthetic */ zziu zzdqj;

    zzaoo(zzaol zzaol, Context context, zzaqa zzaqa, String str, boolean z, boolean z2, zzcv zzcv, zzala zzala, zzov zzov, zzbm zzbm, zzv zzv, zziu zziu) {
        this.val$context = context;
        this.zzdqb = zzaqa;
        this.zzdqc = str;
        this.zzdqd = z;
        this.zzdqe = z2;
        this.zzcfv = zzcv;
        this.zzdqf = zzala;
        this.zzdqg = zzov;
        this.zzdqh = zzbm;
        this.zzdqi = zzv;
        this.zzdqj = zziu;
    }

    public final /* synthetic */ Object call() {
        zzaoq zzaoq = new zzaoq(zzaor.zzb(this.val$context, this.zzdqb, this.zzdqc, this.zzdqd, this.zzdqe, this.zzcfv, this.zzdqf, this.zzdqg, this.zzdqh, this.zzdqi, this.zzdqj));
        zzaoq.setWebViewClient(zzbt.zzen().zzc(zzaoq, this.zzdqe));
        zzaoq.setWebChromeClient(zzbt.zzen().zzj(zzaoq));
        return zzaoq;
    }
}
