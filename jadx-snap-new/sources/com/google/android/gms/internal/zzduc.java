package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class zzduc implements zzdsz<zzdte> {
    public final zzdtf<zzdte> zzd(String str, String str2, int i) {
        String toLowerCase = str2.toLowerCase();
        Object obj = -1;
        Object obj2 = (toLowerCase.hashCode() == 1420614889 && toLowerCase.equals("hybridencrypt")) ? null : -1;
        if (obj2 == null) {
            if (str.hashCode() == 396454335 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                obj = null;
            }
            if (obj == null) {
                zzdtz zzdtz = new zzdtz();
                if (i <= 0) {
                    return zzdtz;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
