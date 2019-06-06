package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class zzdto implements zzdsz<zzdsy> {
    public final zzdtf<zzdsy> zzd(String str, String str2, int i) {
        String toLowerCase = str2.toLowerCase();
        int i2 = -1;
        Object obj = (toLowerCase.hashCode() == 2989895 && toLowerCase.equals("aead")) ? null : -1;
        if (obj == null) {
            zzdtf zzdtq;
            switch (str.hashCode()) {
                case 360753376:
                    if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case 1215885937:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case 1469984853:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case 1797113348:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                        i2 = 1;
                        break;
                    }
                    break;
                case 1855890991:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case 2079211877:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                        i2 = 5;
                        break;
                    }
                    break;
            }
            if (i2 == 0) {
                zzdtq = new zzdtq();
            } else if (i2 == 1) {
                zzdtq = new zzdts();
            } else if (i2 == 2) {
                zzdtq = new zzdtt();
            } else if (i2 == 3) {
                zzdtq = new zzdtu();
            } else if (i2 == 4) {
                zzdtq = new zzdtv();
            } else if (i2 == 5) {
                zzdtq = new zzdtx();
            } else {
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[]{str}));
            }
            if (zzdtq.getVersion() >= i) {
                return zzdtq;
            }
            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
