package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzfw extends BroadcastReceiver {
    private /* synthetic */ zzfv zzawp;

    zzfw(zzfv zzfv) {
        this.zzawp = zzfv;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zzawp.zzl(3);
    }
}
