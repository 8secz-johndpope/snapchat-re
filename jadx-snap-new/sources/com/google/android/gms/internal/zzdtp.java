package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdxd.zza;
import java.security.GeneralSecurityException;

public final class zzdtp {
    public static final zzdxd zzmfe;
    private static zzdxd zzmff = ((zzdxd) ((zza) zzdxd.zzbsn().zza(zzmfe)).zzox("TINK_AEAD_1_1_0").zzczx());

    static {
        String str = "Aead";
        String str2 = "TinkAead";
        zzmfe = (zzdxd) ((zza) zzdxd.zzbsn().zza(zzdul.zzmfe)).zzb(zzdta.zza(str2, str, "AesCtrHmacAeadKey", 0, true)).zzb(zzdta.zza(str2, str, "AesEaxKey", 0, true)).zzb(zzdta.zza(str2, str, "AesGcmKey", 0, true)).zzb(zzdta.zza(str2, str, "ChaCha20Poly1305Key", 0, true)).zzb(zzdta.zza(str2, str, "KmsAeadKey", 0, true)).zzb(zzdta.zza(str2, str, "KmsEnvelopeAeadKey", 0, true)).zzox("TINK_AEAD_1_0_0").zzczx();
        try {
            zzboi();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zzboi() {
        zzdtn.zza("TinkAead", new zzdto());
        zzdul.zzboi();
    }
}
