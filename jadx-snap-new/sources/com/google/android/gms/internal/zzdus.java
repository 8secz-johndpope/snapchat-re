package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdus extends zzfhu<zzdus, zza> implements zzfje {
    private static volatile zzfjl<zzdus> zzbbm;
    private static final zzdus zzmgd;
    private zzduu zzmfz;
    private int zzmgc;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdus, zza> implements zzfje {
        private zza() {
            super(zzdus.zzmgd);
        }

        /* synthetic */ zza(zzdut zzdut) {
            this();
        }
    }

    static {
        zzdus zzdus = new zzdus();
        zzmgd = zzdus;
        zzdus.zza(zzg.zzppw, null, null);
        zzdus.zzpph.zzbkr();
    }

    private zzdus() {
    }

    public static zzdus zzbox() {
        return zzmgd;
    }

    public static zzdus zzn(zzfgs zzfgs) {
        return (zzdus) zzfhu.zza(zzmgd, zzfgs);
    }

    public final int getKeySize() {
        return this.zzmgc;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdut.zzbbk[i - 1]) {
            case 1:
                return new zzdus();
            case 2:
                return zzmgd;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdus zzdus = (zzdus) obj2;
                this.zzmfz = (zzduu) zzh.zza(this.zzmfz, zzdus.zzmfz);
                boolean z2 = this.zzmgc != 0;
                int i2 = this.zzmgc;
                if (zzdus.zzmgc != 0) {
                    z = true;
                }
                this.zzmgc = zzh.zza(z2, i2, z, zzdus.zzmgc);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                zzfhm zzfhm = (zzfhm) obj2;
                if (zzfhm != null) {
                    while (!z) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 10) {
                                    com.google.android.gms.internal.zzfhu.zza zza;
                                    if (this.zzmfz != null) {
                                        zzfhu zzfhu = this.zzmfz;
                                        com.google.android.gms.internal.zzfhu.zza zza2 = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza2.zza(zzfhu);
                                        zza = (com.google.android.gms.internal.zzduu.zza) zza2;
                                    } else {
                                        zza = null;
                                    }
                                    this.zzmfz = (zzduu) zzfhb.zza(zzduu.zzbpa(), zzfhm);
                                    if (zza != null) {
                                        zza.zza(this.zzmfz);
                                        this.zzmfz = (zzduu) zza.zzczw();
                                    }
                                } else if (i == 16) {
                                    this.zzmgc = zzfhb.zzcyg();
                                } else if (zza(i, zzfhb)) {
                                }
                            }
                            z = true;
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
                    synchronized (zzdus.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmgd);
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
        return zzmgd;
    }

    public final void zza(zzfhg zzfhg) {
        zzfjc zzfjc = this.zzmfz;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzduu.zzbpa();
            }
            zzfhg.zza(1, zzfjc);
        }
        int i = this.zzmgc;
        if (i != 0) {
            zzfhg.zzae(2, i);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzduu zzbos() {
        zzduu zzduu = this.zzmfz;
        return zzduu == null ? zzduu.zzbpa() : zzduu;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        zzfjc zzfjc = this.zzmfz;
        int i2 = 0;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzduu.zzbpa();
            }
            i2 = 0 + zzfhg.zzc(1, zzfjc);
        }
        i = this.zzmgc;
        if (i != 0) {
            i2 += zzfhg.zzah(2, i);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}
