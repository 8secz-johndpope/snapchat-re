package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class zzajd implements OnClickListener {
    private /* synthetic */ int zzdgc;
    private /* synthetic */ int zzdgd;
    private /* synthetic */ int zzdge;
    private /* synthetic */ zzajc zzdgf;

    zzajd(zzajc zzajc, int i, int i2, int i3) {
        this.zzdgf = zzajc;
        this.zzdgc = i;
        this.zzdgd = i2;
        this.zzdge = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == this.zzdgc) {
            this.zzdgf.zzrn();
            return;
        }
        if (i == this.zzdgd) {
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbur)).booleanValue()) {
                this.zzdgf.zzro();
                return;
            }
        }
        if (i == this.zzdge) {
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbus)).booleanValue()) {
                this.zzdgf.zzrp();
            }
        }
    }
}
