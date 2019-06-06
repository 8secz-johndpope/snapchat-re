package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzp;
import java.util.Arrays;

@zzabh
final class zzup {
    private final Object[] mParams;

    zzup(zzkk zzkk, String str, int i) {
        this.mParams = zzp.zza((String) zzlc.zzio().zzd(zzoi.zzbpt), zzkk, str, i, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzup)) {
            return false;
        }
        return Arrays.equals(this.mParams, ((zzup) obj).mParams);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.mParams);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.mParams);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 24);
        stringBuilder.append("[InterstitialAdPoolKey ");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
