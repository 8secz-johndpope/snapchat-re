package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdxd.zza;
import java.security.GeneralSecurityException;

public final class zzdua {
    public static final zzdxd zzmfe;
    private static zzdxd zzmff = ((zzdxd) ((zza) zzdxd.zzbsn().zza(zzmfe)).zzox("TINK_HYBRID_1_1_0").zzczx());

    static {
        String str = "TinkHybridDecrypt";
        String str2 = "TinkHybridEncrypt";
        zzmfe = (zzdxd) ((zza) zzdxd.zzbsn().zza(zzdtp.zzmfe)).zzb(zzdta.zza(str, "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).zzb(zzdta.zza(str2, "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).zzox("TINK_HYBRID_1_0_0").zzczx();
        try {
            zzdtn.zza(str2, new zzduc());
            zzdtn.zza(str, new zzdub());
            zzdtp.zzboi();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
