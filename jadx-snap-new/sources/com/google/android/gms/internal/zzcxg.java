package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzcxg extends zzb {
    private /* synthetic */ byte[] zzkkj;
    private /* synthetic */ String zzkkk;

    zzcxg(GoogleApiClient googleApiClient, byte[] bArr, String str) {
        this.zzkkj = bArr;
        this.zzkkk = str;
        super(googleApiClient);
    }

    public final /* synthetic */ void zza(zzb zzb) {
        zzcxs zzcxs = (zzcxs) zzb;
        zzcxb zzcxb = this.zzkkr;
        byte[] bArr = this.zzkkj;
        String str = this.zzkkk;
        if (TextUtils.isEmpty(str)) {
            str = zzcxs.zzle("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((zzcxd) zzcxs.zzalw()).zza(zzcxb, bArr, str);
    }
}
