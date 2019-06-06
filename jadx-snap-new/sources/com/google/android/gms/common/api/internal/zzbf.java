package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class zzbf extends Handler {
    private /* synthetic */ zzba zzfyr;

    zzbf(zzba zzba, Looper looper) {
        this.zzfyr = zzba;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.zzfyr.zzajr();
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("Unknown message id: ");
            stringBuilder.append(i2);
            Log.w("GoogleApiClientImpl", stringBuilder.toString());
        } else {
            this.zzfyr.resume();
        }
    }
}
