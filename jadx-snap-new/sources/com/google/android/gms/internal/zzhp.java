package com.google.android.gms.internal;

import android.webkit.ValueCallback;

final class zzhp implements ValueCallback<String> {
    private /* synthetic */ zzho zzazu;

    zzhp(zzho zzho) {
        this.zzazu = zzho;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        this.zzazu.zzazp.zza(this.zzazu.zzazr, this.zzazu.zzazs, (String) obj, this.zzazu.zzazt);
    }
}
