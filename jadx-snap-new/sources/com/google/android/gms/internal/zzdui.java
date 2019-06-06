package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdwg.zzb;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class zzdui implements zzdtf<zzdtj> {
    zzdui() {
    }

    private static void zza(zzdwe zzdwe) {
        if (zzdwe.zzbqr() >= 10) {
            int i = zzduj.zzmfk[zzdwe.zzbqq().ordinal()];
            String str = "tag size too big";
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (zzdwe.zzbqr() > 64) {
                        throw new GeneralSecurityException(str);
                    } else {
                        return;
                    }
                } else if (zzdwe.zzbqr() > 32) {
                    throw new GeneralSecurityException(str);
                } else {
                    return;
                }
            } else if (zzdwe.zzbqr() > 20) {
                throw new GeneralSecurityException(str);
            } else {
                return;
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    private final zzdtj zzh(zzfgs zzfgs) {
        try {
            zzdwa zzae = zzdwa.zzae(zzfgs);
            if (zzae instanceof zzdwa) {
                zzae = zzae;
                zzdyp.zzw(zzae.getVersion(), 0);
                if (zzae.zzbot().size() >= 16) {
                    zzdyj zzdyj;
                    zza(zzae.zzbqk());
                    zzdvy zzbqq = zzae.zzbqk().zzbqq();
                    SecretKeySpec secretKeySpec = new SecretKeySpec(zzae.zzbot().toByteArray(), "HMAC");
                    int zzbqr = zzae.zzbqk().zzbqr();
                    int i = zzduj.zzmfk[zzbqq.ordinal()];
                    if (i == 1) {
                        zzdyj = new zzdyj("HMACSHA1", secretKeySpec, zzbqr);
                    } else if (i == 2) {
                        zzdyj = new zzdyj("HMACSHA256", secretKeySpec, zzbqr);
                    } else if (i == 3) {
                        zzdyj = new zzdyj("HMACSHA512", secretKeySpec, zzbqr);
                    } else {
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return zzdyj;
                }
                throw new GeneralSecurityException("key too short");
            }
            throw new GeneralSecurityException("expected HmacKey proto");
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    public final int getVersion() {
        return 0;
    }

    public final zzfjc zzb(zzfgs zzfgs) {
        try {
            return zzb(zzdwc.zzag(zzfgs));
        } catch (zzfie e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    public final zzfjc zzb(zzfjc zzfjc) {
        if (zzfjc instanceof zzdwc) {
            zzdwc zzdwc = (zzdwc) zzfjc;
            if (zzdwc.getKeySize() >= 16) {
                zza(zzdwc.zzbqk());
                return zzdwa.zzbql().zzgm(0).zzc(zzdwc.zzbqk()).zzaf(zzfgs.zzaz(zzdyl.zzgy(zzdwc.getKeySize()))).zzczx();
            }
            throw new GeneralSecurityException("key too short");
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    public final zzdwg zzc(zzfgs zzfgs) {
        return (zzdwg) zzdwg.zzbqx().zzop("type.googleapis.com/google.crypto.tink.HmacKey").zzai(((zzdwa) zzb(zzfgs)).toByteString()).zzb(zzb.SYMMETRIC).zzczx();
    }
}
