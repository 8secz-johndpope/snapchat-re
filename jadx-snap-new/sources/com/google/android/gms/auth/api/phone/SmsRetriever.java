package com.google.android.gms.auth.api.phone;

import android.content.Context;
import com.google.android.gms.internal.zzayc;

public final class SmsRetriever {
    public static SmsRetrieverClient getClient(Context context) {
        return new zzayc(context);
    }
}
