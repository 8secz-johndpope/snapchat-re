package com.google.android.gms.internal;

import java.util.Map;

final class zzajw extends zzav {
    private /* synthetic */ byte[] zzdhf;
    private /* synthetic */ Map zzdhg;
    private /* synthetic */ zzaks zzdhh;

    zzajw(zzajr zzajr, int i, String str, zzz zzz, zzy zzy, byte[] bArr, Map map, zzaks zzaks) {
        this.zzdhf = bArr;
        this.zzdhg = map;
        this.zzdhh = zzaks;
        super(i, str, zzz, zzy);
    }

    public final Map<String, String> getHeaders() {
        Map map = this.zzdhg;
        return map == null ? super.getHeaders() : map;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void zza(Object obj) {
        zza((String) obj);
    }

    public final byte[] zzf() {
        byte[] bArr = this.zzdhf;
        return bArr == null ? super.zzf() : bArr;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzh(String str) {
        this.zzdhh.zzcw(str);
        super.zza(str);
    }
}
