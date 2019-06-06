package com.google.android.gms.internal;

import android.util.JsonWriter;

final /* synthetic */ class zzakv implements zzakx {
    private final byte[] zzdiy;

    zzakv(byte[] bArr) {
        this.zzdiy = bArr;
    }

    public final void zza(JsonWriter jsonWriter) {
        zzaks.zza(this.zzdiy, jsonWriter);
    }
}
