package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class zzyi implements OnClickListener {
    private /* synthetic */ zzyg zzclq;

    zzyi(zzyg zzyg) {
        this.zzclq = zzyg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzclq.zzbm("User canceled the download.");
    }
}
