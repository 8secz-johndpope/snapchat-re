package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;

public final class zzayc extends SmsRetrieverClient {
    public zzayc(Context context) {
        super(context);
    }

    public final Task<Void> startSmsRetriever() {
        return zzb(new zzayd(this));
    }
}
