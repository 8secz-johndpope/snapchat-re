package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzbt;

@zzabh
public final class zzahx extends Handler {
    public zzahx(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            zzbt.zzep().zza(e, "AdMobHandler.handleMessage");
        }
    }
}
