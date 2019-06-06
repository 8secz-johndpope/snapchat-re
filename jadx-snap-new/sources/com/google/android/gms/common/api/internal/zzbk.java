package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class zzbk extends Handler {
    private /* synthetic */ zzbi zzfze;

    zzbk(zzbi zzbi, Looper looper) {
        this.zzfze = zzbi;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((zzbj) message.obj).zzc(this.zzfze);
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("Unknown message id: ");
            stringBuilder.append(i2);
            Log.w("GACStateManager", stringBuilder.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
