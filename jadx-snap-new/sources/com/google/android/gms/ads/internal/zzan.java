package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzahs;
import com.google.android.gms.internal.zzaij;

@zzabh
final class zzan extends zzahs {
    final /* synthetic */ zzak zzaql;
    private final int zzaqm;

    public zzan(zzak zzak, int i) {
        this.zzaql = zzak;
        this.zzaqm = i;
    }

    public final void onStop() {
    }

    public final void zzdo() {
        zzap zzap = new zzap(this.zzaql.zzanm.zzaqp, this.zzaql.zzdj(), this.zzaql.zzaqd, this.zzaql.zzaqe, this.zzaql.zzanm.zzaqp ? this.zzaqm : -1, this.zzaql.zzaqf, this.zzaql.zzanm.zzaue.zzaqw);
        int requestedOrientation = this.zzaql.zzanm.zzaue.zzcnm.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.zzaql.zzanm.zzaue.orientation;
        }
        int i = requestedOrientation;
        zzak zzak = this.zzaql;
        zzaij.zzdfn.post(new zzao(this, new AdOverlayInfoParcel(zzak, zzak, zzak, zzak.zzanm.zzaue.zzcnm, i, this.zzaql.zzanm.zzatz, this.zzaql.zzanm.zzaue.zzctt, zzap)));
    }
}
