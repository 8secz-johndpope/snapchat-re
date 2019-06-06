package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzbt;

final class zzyb implements OnClickListener {
    private /* synthetic */ zzya zzckx;

    zzyb(zzya zzya) {
        this.zzckx = zzya;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent createIntent = this.zzckx.createIntent();
        zzbt.zzel();
        zzaij.zza(this.zzckx.mContext, createIntent);
    }
}
