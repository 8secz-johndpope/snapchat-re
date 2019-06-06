package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzakl extends BroadcastReceiver {
    private /* synthetic */ zzakk zzdhz;

    zzakl(zzakk zzakk) {
        this.zzdhz = zzakk;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zzdhz.zzc(context, intent);
    }
}
