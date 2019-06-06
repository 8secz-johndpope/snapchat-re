package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdvm extends zzfhu<zzdvm, zza> implements zzfje {
    private static volatile zzfjl<zzdvm> zzbbm;
    private static final zzdvm zzmgv;
    private zzdvo zzmgu;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdvm, zza> implements zzfje {
        private zza() {
            super(zzdvm.zzmgv);
        }

        /* synthetic */ zza(zzdvn zzdvn) {
            this();
        }
    }

    static {
        zzdvm zzdvm = new zzdvm();
        zzmgv = zzdvm;
        zzdvm.zza(zzg.zzppw, null, null);
        zzdvm.zzpph.zzbkr();
    }

    private zzdvm() {
    }

    public static zzdvm zzw(zzfgs zzfgs) {
        return (zzdvm) zzfhu.zza(zzmgv, zzfgs);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvn.zzbbk[i - 1]) {
            case 1:
                return new zzdvm();
            case 2:
                return zzmgv;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                this.zzmgu = (zzdvo) ((zzh) obj).zza(this.zzmgu, ((zzdvm) obj2).zzmgu);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                zzfhm zzfhm = (zzfhm) obj2;
                if (zzfhm != null) {
                    Object obj3 = null;
                    while (obj3 == null) {
                        try {
                            int zzcxx = zzfhb.zzcxx();
                            if (zzcxx != 0) {
                                if (zzcxx == 10) {
                                    com.google.android.gms.internal.zzfhu.zza zza;
                                    if (this.zzmgu != null) {
                                        zzfhu zzfhu = this.zzmgu;
                                        com.google.android.gms.internal.zzfhu.zza zza2 = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza2.zza(zzfhu);
                                        zza = (com.google.android.gms.internal.zzdvo.zza) zza2;
                                    } else {
                                        zza = null;
                                    }
                                    this.zzmgu = (zzdvo) zzfhb.zza(zzdvo.zzbpv(), zzfhm);
                                    if (zza != null) {
                                        zza.zza(this.zzmgu);
                                        this.zzmgu = (zzdvo) zza.zzczw();
                                    }
                                } else if (zza(zzcxx, zzfhb)) {
                                }
                            }
                            obj3 = 1;
                        } catch (zzfie e) {
                            throw new RuntimeException(e.zzi(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new zzfie(e2.getMessage()).zzi(this));
                        }
                    }
                    break;
                }
                throw new NullPointerException();
            case 7:
                break;
            case 8:
                if (zzbbm == null) {
                    synchronized (zzdvm.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmgv);
                        }
                    }
                }
                return zzbbm;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return zzmgv;
    }

    public final void zza(zzfhg zzfhg) {
        zzfjc zzfjc = this.zzmgu;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdvo.zzbpv();
            }
            zzfhg.zza(1, zzfjc);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzdvo zzbpq() {
        zzdvo zzdvo = this.zzmgu;
        return zzdvo == null ? zzdvo.zzbpv() : zzdvo;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        zzfjc zzfjc = this.zzmgu;
        int i2 = 0;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdvo.zzbpv();
            }
            i2 = 0 + zzfhg.zzc(1, zzfjc);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}
