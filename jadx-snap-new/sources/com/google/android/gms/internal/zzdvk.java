package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdvk extends zzfhu<zzdvk, zza> implements zzfje {
    private static volatile zzfjl<zzdvk> zzbbm;
    private static final zzdvk zzmgt;
    private zzdwl zzmgs;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdvk, zza> implements zzfje {
        private zza() {
            super(zzdvk.zzmgt);
        }

        /* synthetic */ zza(zzdvl zzdvl) {
            this();
        }
    }

    static {
        zzdvk zzdvk = new zzdvk();
        zzmgt = zzdvk;
        zzdvk.zza(zzg.zzppw, null, null);
        zzdvk.zzpph.zzbkr();
    }

    private zzdvk() {
    }

    public static zzdvk zzbpo() {
        return zzmgt;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvl.zzbbk[i - 1]) {
            case 1:
                return new zzdvk();
            case 2:
                return zzmgt;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                this.zzmgs = (zzdwl) ((zzh) obj).zza(this.zzmgs, ((zzdvk) obj2).zzmgs);
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
                                if (zzcxx == 18) {
                                    com.google.android.gms.internal.zzfhu.zza zza;
                                    if (this.zzmgs != null) {
                                        zzfhu zzfhu = this.zzmgs;
                                        com.google.android.gms.internal.zzfhu.zza zza2 = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza2.zza(zzfhu);
                                        zza = (com.google.android.gms.internal.zzdwl.zza) zza2;
                                    } else {
                                        zza = null;
                                    }
                                    this.zzmgs = (zzdwl) zzfhb.zza(zzdwl.zzbra(), zzfhm);
                                    if (zza != null) {
                                        zza.zza(this.zzmgs);
                                        this.zzmgs = (zzdwl) zza.zzczw();
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
                    synchronized (zzdvk.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmgt);
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
        return zzmgt;
    }

    public final void zza(zzfhg zzfhg) {
        zzfjc zzfjc = this.zzmgs;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwl.zzbra();
            }
            zzfhg.zza(2, zzfjc);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzdwl zzbpn() {
        zzdwl zzdwl = this.zzmgs;
        return zzdwl == null ? zzdwl.zzbra() : zzdwl;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        zzfjc zzfjc = this.zzmgs;
        int i2 = 0;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwl.zzbra();
            }
            i2 = 0 + zzfhg.zzc(2, zzfjc);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}
