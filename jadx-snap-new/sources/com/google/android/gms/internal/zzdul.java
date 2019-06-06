package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdxd.zza;
import java.security.GeneralSecurityException;

public final class zzdul {
    public static final zzdxd zzmfe = ((zzdxd) zzdxd.zzbsn().zzox("TINK_MAC_1_0_0").zzb(zzdta.zza("TinkMac", "Mac", "HmacKey", 0, true)).zzczx());
    private static zzdxd zzmff = ((zzdxd) ((zza) zzdxd.zzbsn().zza(zzmfe)).zzox("TINK_MAC_1_1_0").zzczx());

    static {
        try {
            zzboi();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zzboi() {
        zzdtn.zza("TinkMac", new zzduk());
    }
}
