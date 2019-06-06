package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzbt;

final class zzajk implements OnClickListener {
    private /* synthetic */ zzajj zzdgo;

    zzajk(zzajj zzajj) {
        this.zzdgo = zzajj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbt.zzel();
        zzaij.zza(this.zzdgo.val$context, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
