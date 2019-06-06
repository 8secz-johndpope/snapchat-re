package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzagq;
import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzahe;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzaqa;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzov;
import com.google.android.gms.internal.zzpb;
import com.google.android.gms.internal.zzwf;
import com.google.android.gms.internal.zzyo;
import com.google.android.gms.internal.zzzm;

@zzabh
public abstract class zzi extends zzd implements zzae, zzyo {
    private boolean zzany;

    public zzi(Context context, zzko zzko, String str, zzwf zzwf, zzala zzala, zzv zzv) {
        super(context, zzko, str, zzwf, zzala, zzv);
    }

    /* Access modifiers changed, original: protected */
    public zzaof zza(zzahe zzahe, zzw zzw, zzagq zzagq) {
        zzahe zzahe2 = zzahe;
        View nextView = this.zzanm.zzaua.getNextView();
        if (nextView instanceof zzaof) {
            ((zzaof) nextView).destroy();
        }
        if (nextView != null) {
            this.zzanm.zzaua.removeView(nextView);
        }
        zzaof zza = zzbt.zzem().zza(this.zzanm.zzaiq, zzaqa.zzc(this.zzanm.zzaud), this.zzanm.zzaud.zzbia, false, false, this.zzanm.zzaty, this.zzanm.zzatz, this.zzanh, this, this.zzanp, zzahe2.zzdcu);
        if (this.zzanm.zzaud.zzbic == null) {
            zzg(zza.getView());
        }
        zza.zzua().zza(this, this, this, this, false, null, zzw, this, zzagq);
        zza(zza);
        zza.zzde(zzahe2.zzcvm.zzcsi);
        return zza;
    }

    public final void zza(int i, int i2, int i3, int i4) {
        zzbv();
    }

    /* Access modifiers changed, original: protected */
    public void zza(zzahe zzahe, zzov zzov) {
        if (zzahe.errorCode != -2) {
            zzaij.zzdfn.post(new zzk(this, zzahe));
            return;
        }
        if (zzahe.zzaud != null) {
            this.zzanm.zzaud = zzahe.zzaud;
        }
        if (!zzahe.zzdcw.zzcto || zzahe.zzdcw.zzbif) {
            zzaij.zzdfn.post(new zzl(this, zzahe, this.zzanp.zzaom.zza(this.zzanm.zzaiq, this.zzanm.zzatz, zzahe.zzdcw), zzov));
            return;
        }
        this.zzanm.zzavb = 0;
        zzbu zzbu = this.zzanm;
        zzbt.zzek();
        zzbu.zzauc = zzzm.zza(this.zzanm.zzaiq, this, zzahe, this.zzanm.zzaty, null, this.zzanu, this, zzov);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzaof zzaof) {
        zzaof.zza("/trackActiveViewUnit", new zzj(this));
    }

    public final void zza(zzpb zzpb) {
        zzbq.zzgn("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzanm.zzauv = zzpb;
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005f */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public boolean zza(com.google.android.gms.internal.zzahd r3, com.google.android.gms.internal.zzahd r4) {
        /*
        r2 = this;
        r0 = r2.zzanm;
        r0 = r0.zzfo();
        if (r0 == 0) goto L_0x001b;
    L_0x0008:
        r0 = r2.zzanm;
        r0 = r0.zzaua;
        if (r0 == 0) goto L_0x001b;
    L_0x000e:
        r0 = r2.zzanm;
        r0 = r0.zzaua;
        r0 = r0.zzfr();
        r1 = r4.zzctt;
        r0.zzcr(r1);
    L_0x001b:
        r0 = r4.zzcnm;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x006a;
    L_0x001f:
        r0 = r4.zzcto;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 != 0) goto L_0x006a;
    L_0x0023:
        r0 = r4.zzdcv;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x006a;
    L_0x0027:
        r0 = com.google.android.gms.internal.zzoi.zzbvv;	 Catch:{ RuntimeException -> 0x0065 }
        r1 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r1.zzd(r0);	 Catch:{ RuntimeException -> 0x0065 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r0.booleanValue();	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x006a;
    L_0x0039:
        r0 = r4.zzcrv;	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r0.zzbhj;	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x004a;
    L_0x003f:
        r1 = "com.google.ads.mediation.AbstractAdViewAdapter";
        r0 = r1.equals(r0);	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 == 0) goto L_0x0048;
    L_0x0047:
        goto L_0x004a;
    L_0x0048:
        r0 = 0;
        goto L_0x004b;
    L_0x004a:
        r0 = 1;
    L_0x004b:
        if (r0 == 0) goto L_0x006a;
    L_0x004d:
        r0 = r4.zzcrv;	 Catch:{ RuntimeException -> 0x0065 }
        r0 = r0.extras;	 Catch:{ RuntimeException -> 0x0065 }
        r1 = "sdk_less_server_data";
        r0 = r0.containsKey(r1);	 Catch:{ RuntimeException -> 0x0065 }
        if (r0 != 0) goto L_0x006a;
    L_0x0059:
        r0 = r4.zzcnm;	 Catch:{ Throwable -> 0x005f }
        r0.zzum();	 Catch:{ Throwable -> 0x005f }
        goto L_0x006a;
    L_0x005f:
        r0 = "Could not render test Ad label.";
        com.google.android.gms.internal.zzahw.v(r0);	 Catch:{ RuntimeException -> 0x0065 }
        goto L_0x006a;
    L_0x0065:
        r0 = "Could not render test AdLabel.";
        com.google.android.gms.internal.zzahw.v(r0);
    L_0x006a:
        r3 = super.zza(r3, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzi.zza(com.google.android.gms.internal.zzahd, com.google.android.gms.internal.zzahd):boolean");
    }

    /* Access modifiers changed, original: final */
    public final void zzb(zzaof zzaof) {
        if (this.zzanm.zzaue != null) {
            this.zzano.zza(this.zzanm.zzaud, this.zzanm.zzaue, zzaof.getView(), zzaof);
            this.zzany = false;
            return;
        }
        this.zzany = true;
        zzaky.zzcz("Request to enable ActiveView before adState is available.");
    }

    /* Access modifiers changed, original: protected */
    public void zzbw() {
        super.zzbw();
        if (this.zzany) {
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbst)).booleanValue()) {
                zzb(this.zzanm.zzaue.zzcnm);
            }
        }
    }

    public final void zzcr() {
        onAdClicked();
    }

    public final void zzcs() {
        recordImpression();
        zzbs();
    }

    public final void zzct() {
        zzbt();
    }

    public final void zzh(View view) {
        this.zzanm.zzava = view;
        zzb(new zzahd(this.zzanm.zzauf, null, null, null, null, null, null, null));
    }
}
