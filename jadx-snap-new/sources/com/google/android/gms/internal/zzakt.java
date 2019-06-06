package com.google.android.gms.internal;

import android.util.JsonWriter;
import java.util.Map;

final /* synthetic */ class zzakt implements zzakx {
    private final String zzaqy;
    private final String zzdiu;
    private final Map zzdiv;
    private final byte[] zzdiw;

    zzakt(String str, String str2, Map map, byte[] bArr) {
        this.zzdiu = str;
        this.zzaqy = str2;
        this.zzdiv = map;
        this.zzdiw = bArr;
    }

    public final void zza(JsonWriter jsonWriter) {
        zzaks.zza(this.zzdiu, this.zzaqy, this.zzdiv, this.zzdiw, jsonWriter);
    }
}
