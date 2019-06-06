package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzduy extends zzfhu<zzduy, zza> implements zzfje {
    private static volatile zzfjl<zzduy> zzbbm;
    private static final zzduy zzmgi;
    private int zzmgc;
    private zzdva zzmgg;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzduy, zza> implements zzfje {
        private zza() {
            super(zzduy.zzmgi);
        }

        /* synthetic */ zza(zzduz zzduz) {
            this();
        }
    }

    static {
        zzduy zzduy = new zzduy();
        zzmgi = zzduy;
        zzduy.zza(zzg.zzppw, null, null);
        zzduy.zzpph.zzbkr();
    }

    private zzduy() {
    }

    public static zzduy zzq(zzfgs zzfgs) {
        return (zzduy) zzfhu.zza(zzmgi, zzfgs);
    }

    public final int getKeySize() {
        return this.zzmgc;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzduz.zzbbk[i - 1]) {
            case 1:
                return new zzduy();
            case 2:
                return zzmgi;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzduy zzduy = (zzduy) obj2;
                this.zzmgg = (zzdva) zzh.zza(this.zzmgg, zzduy.zzmgg);
                boolean z2 = this.zzmgc != 0;
                int i2 = this.zzmgc;
                if (zzduy.zzmgc != 0) {
                    z = true;
                }
                this.zzmgc = zzh.zza(z2, i2, z, zzduy.zzmgc);
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
                                    if (this.zzmgg != null) {
                                        zzfhu zzfhu = this.zzmgg;
                                        com.google.android.gms.internal.zzfhu.zza zza2 = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza2.zza(zzfhu);
                                        zza = (com.google.android.gms.internal.zzdva.zza) zza2;
                                    } else {
                                        zza = null;
                                    }
                                    this.zzmgg = (zzdva) zzfhb.zza(zzdva.zzbpg(), zzfhm);
                                    if (zza != null) {
                                        zza.zza(this.zzmgg);
                                        this.zzmgg = (zzdva) zza.zzczw();
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
                    synchronized (zzduy.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmgi);
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
        return zzmgi;
    }

    public final void zza(zzfhg zzfhg) {
        zzfjc zzfjc = this.zzmgg;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdva.zzbpg();
            }
            zzfhg.zza(1, zzfjc);
        }
        int i = this.zzmgc;
        if (i != 0) {
            zzfhg.zzae(2, i);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzdva zzbpc() {
        zzdva zzdva = this.zzmgg;
        return zzdva == null ? zzdva.zzbpg() : zzdva;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        zzfjc zzfjc = this.zzmgg;
        int i2 = 0;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdva.zzbpg();
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
