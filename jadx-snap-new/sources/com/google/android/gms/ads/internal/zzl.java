package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.zzagq;
import com.google.android.gms.internal.zzahe;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzaop;
import com.google.android.gms.internal.zzov;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzzm;

final class zzl implements Runnable {
    final /* synthetic */ zzahe zzant;
    final /* synthetic */ zzi zzanz;
    final /* synthetic */ zzagq zzaoa;
    private /* synthetic */ zzov zzaob;

    zzl(zzi zzi, zzahe zzahe, zzagq zzagq, zzov zzov) {
        this.zzanz = zzi;
        this.zzant = zzahe;
        this.zzaoa = zzagq;
        this.zzaob = zzov;
    }

    public final void run() {
        if (this.zzant.zzdcw.zzctx && this.zzanz.zzanm.zzauv != null) {
            String str = null;
            if (this.zzant.zzdcw.zzcno != null) {
                zzbt.zzel();
                str = zzaij.zzci(this.zzant.zzdcw.zzcno);
            }
            zzow zzow = new zzow(this.zzanz, str, this.zzant.zzdcw.body);
            this.zzanz.zzanm.zzavb = 1;
            try {
                this.zzanz.zzank = false;
                this.zzanz.zzanm.zzauv.zza(zzow);
                return;
            } catch (RemoteException e) {
                zzaky.zzc("Could not call the onCustomRenderedAdLoadedListener.", e);
                this.zzanz.zzank = true;
            }
        }
        zzw zzw = new zzw(this.zzanz.zzanm.zzaiq, this.zzaoa, this.zzant.zzdcw.zzcug);
        try {
            zzaof zza = this.zzanz.zza(this.zzant, zzw, this.zzaoa);
            zza.setOnTouchListener(new zzn(this, zzw));
            zza.setOnClickListener(new zzo(this, zzw));
            this.zzanz.zzanm.zzavb = 0;
            zzbu zzbu = this.zzanz.zzanm;
            zzbt.zzek();
            Context context = this.zzanz.zzanm.zzaiq;
            zzi zzi = this.zzanz;
            zzbu.zzauc = zzzm.zza(context, zzi, this.zzant, zzi.zzanm.zzaty, zza, this.zzanz.zzanu, this.zzanz, this.zzaob);
        } catch (zzaop e2) {
            zzaky.zzb("Could not obtain webview.", e2);
            zzaij.zzdfn.post(new zzm(this));
        }
    }
}
