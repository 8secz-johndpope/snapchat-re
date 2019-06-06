package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class zzduf {
    public static zzdxu zza(zzdvw zzdvw) {
        int i = zzdug.zzmfl[zzdvw.ordinal()];
        if (i == 1) {
            return zzdxu.NIST_P256;
        }
        if (i == 2) {
            return zzdxu.NIST_P384;
        }
        if (i == 3) {
            return zzdxu.NIST_P521;
        }
        String valueOf = String.valueOf(zzdvw);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
        stringBuilder.append("unknown curve type: ");
        stringBuilder.append(valueOf);
        throw new GeneralSecurityException(stringBuilder.toString());
    }

    public static zzdxv zza(zzdvi zzdvi) {
        int i = zzdug.zzmfm[zzdvi.ordinal()];
        if (i == 1) {
            return zzdxv.UNCOMPRESSED;
        }
        if (i == 2) {
            return zzdxv.COMPRESSED;
        }
        String valueOf = String.valueOf(zzdvi);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
        stringBuilder.append("unknown point format: ");
        stringBuilder.append(valueOf);
        throw new GeneralSecurityException(stringBuilder.toString());
    }

    public static String zza(zzdvy zzdvy) {
        int i = zzdug.zzmfk[zzdvy.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(zzdvy);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("hash unsupported for HMAC: ");
        stringBuilder.append(valueOf);
        throw new NoSuchAlgorithmException(stringBuilder.toString());
    }

    public static void zza(zzdvo zzdvo) {
        zzdxs.zza(zza(zzdvo.zzbps().zzbqf()));
        zza(zzdvo.zzbps().zzbqg());
        if (zzdvo.zzbpu() != zzdvi.UNKNOWN_FORMAT) {
            zzdtn.zza(zzdvo.zzbpt().zzbpn());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
