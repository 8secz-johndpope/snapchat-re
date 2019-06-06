package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdwc extends zzfhu<zzdwc, zza> implements zzfje {
    private static volatile zzfjl<zzdwc> zzbbm;
    private static final zzdwc zzmhz;
    private int zzmgc;
    private zzdwe zzmhx;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwc, zza> implements zzfje {
        private zza() {
            super(zzdwc.zzmhz);
        }

        /* synthetic */ zza(zzdwd zzdwd) {
            this();
        }
    }

    static {
        zzdwc zzdwc = new zzdwc();
        zzmhz = zzdwc;
        zzdwc.zza(zzg.zzppw, null, null);
        zzdwc.zzpph.zzbkr();
    }

    private zzdwc() {
    }

    public static zzdwc zzag(zzfgs zzfgs) {
        return (zzdwc) zzfhu.zza(zzmhz, zzfgs);
    }

    public static zzdwc zzbqo() {
        return zzmhz;
    }

    public final int getKeySize() {
        return this.zzmgc;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdwd.zzbbk[i - 1]) {
            case 1:
                return new zzdwc();
            case 2:
                return zzmhz;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdwc zzdwc = (zzdwc) obj2;
                this.zzmhx = (zzdwe) zzh.zza(this.zzmhx, zzdwc.zzmhx);
                boolean z2 = this.zzmgc != 0;
                int i2 = this.zzmgc;
                if (zzdwc.zzmgc != 0) {
                    z = true;
                }
                this.zzmgc = zzh.zza(z2, i2, z, zzdwc.zzmgc);
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
                                    if (this.zzmhx != null) {
                                        zzfhu zzfhu = this.zzmhx;
                                        com.google.android.gms.internal.zzfhu.zza zza2 = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza2.zza(zzfhu);
                                        zza = (com.google.android.gms.internal.zzdwe.zza) zza2;
                                    } else {
                                        zza = null;
                                    }
                                    this.zzmhx = (zzdwe) zzfhb.zza(zzdwe.zzbqs(), zzfhm);
                                    if (zza != null) {
                                        zza.zza(this.zzmhx);
                                        this.zzmhx = (zzdwe) zza.zzczw();
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
                    synchronized (zzdwc.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmhz);
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
        return zzmhz;
    }

    public final void zza(zzfhg zzfhg) {
        zzfjc zzfjc = this.zzmhx;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwe.zzbqs();
            }
            zzfhg.zza(1, zzfjc);
        }
        int i = this.zzmgc;
        if (i != 0) {
            zzfhg.zzae(2, i);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzdwe zzbqk() {
        zzdwe zzdwe = this.zzmhx;
        return zzdwe == null ? zzdwe.zzbqs() : zzdwe;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        zzfjc zzfjc = this.zzmhx;
        int i2 = 0;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwe.zzbqs();
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
