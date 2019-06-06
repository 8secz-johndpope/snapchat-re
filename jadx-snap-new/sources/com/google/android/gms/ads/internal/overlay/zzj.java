package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzahs;
import com.google.android.gms.internal.zzaij;

@zzabh
final class zzj extends zzahs {
    final /* synthetic */ zzd zzcne;

    private zzj(zzd zzd) {
        this.zzcne = zzd;
    }

    /* synthetic */ zzj(zzd zzd, zzf zzf) {
        this(zzd);
    }

    public final void onStop() {
    }

    public final void zzdo() {
        Bitmap zza = zzbt.zzfe().zza(Integer.valueOf(this.zzcne.zzcml.zzcnu.zzaqu));
        if (zza != null) {
            zzaij.zzdfn.post(new zzk(this, zzbt.zzen().zza(this.zzcne.mActivity, zza, this.zzcne.zzcml.zzcnu.zzaqs, this.zzcne.zzcml.zzcnu.zzaqt)));
        }
    }
}
