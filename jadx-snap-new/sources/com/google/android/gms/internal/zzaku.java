package com.google.android.gms.internal;

import android.util.JsonWriter;
import java.util.Map;

final /* synthetic */ class zzaku implements zzakx {
    private final Map zzbzh;
    private final int zzdix;

    zzaku(int i, Map map) {
        this.zzdix = i;
        this.zzbzh = map;
    }

    public final void zza(JsonWriter jsonWriter) {
        zzaks.zza(this.zzdix, this.zzbzh, jsonWriter);
    }
}
