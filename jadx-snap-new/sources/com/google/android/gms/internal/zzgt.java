package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzgt extends BroadcastReceiver {
    private /* synthetic */ zzgr zzaxp;

    zzgt(zzgr zzgr) {
        this.zzaxp = zzgr;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zzaxp.zzm(3);
    }
}
