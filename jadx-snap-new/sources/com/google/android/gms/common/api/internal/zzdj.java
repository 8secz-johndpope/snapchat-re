package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

final class zzdj extends Handler {
    private /* synthetic */ zzdh zzgbp;

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            PendingResult pendingResult = (PendingResult) message.obj;
            synchronized (this.zzgbp.zzfvc) {
                if (pendingResult == null) {
                    this.zzgbp.zzgbi.zzd(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zzct) {
                    this.zzgbp.zzgbi.zzd(((zzct) pendingResult).getStatus());
                } else {
                    this.zzgbp.zzgbi.zza(pendingResult);
                }
            }
        } else if (i != 1) {
            int i2 = message.what;
            StringBuilder stringBuilder = new StringBuilder(70);
            stringBuilder.append("TransformationResultHandler received unknown message type: ");
            stringBuilder.append(i2);
            Log.e("TransformedResultImpl", stringBuilder.toString());
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String str = "Runtime exception on the transformation worker thread: ";
            String valueOf = String.valueOf(runtimeException.getMessage());
            Log.e("TransformedResultImpl", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw runtimeException;
        }
    }
}
