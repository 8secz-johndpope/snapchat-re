package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class zzyc implements OnClickListener {
    private /* synthetic */ zzya zzckx;

    zzyc(zzya zzya) {
        this.zzckx = zzya;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzckx.zzbm("Operation denied by user.");
    }
}
