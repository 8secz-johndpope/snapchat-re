package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzduq extends zzfhu<zzduq, zza> implements zzfje {
    private static volatile zzfjl<zzduq> zzbbm;
    private static final zzduq zzmgb;
    private int zzmfs;
    private zzduu zzmfz;
    private zzfgs zzmga = zzfgs.zzpnw;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzduq, zza> implements zzfje {
        private zza() {
            super(zzduq.zzmgb);
        }

        /* synthetic */ zza(zzdur zzdur) {
            this();
        }

        public final zza zzc(zzduu zzduu) {
            zzczv();
            ((zzduq) this.zzppl).zzb(zzduu);
            return this;
        }

        public final zza zzgd(int i) {
            zzczv();
            ((zzduq) this.zzppl).setVersion(0);
            return this;
        }

        public final zza zzm(zzfgs zzfgs) {
            zzczv();
            ((zzduq) this.zzppl).zzk(zzfgs);
            return this;
        }
    }

    static {
        zzduq zzduq = new zzduq();
        zzmgb = zzduq;
        zzduq.zza(zzg.zzppw, null, null);
        zzduq.zzpph.zzbkr();
    }

    private zzduq() {
    }

    private final void setVersion(int i) {
        this.zzmfs = i;
    }

    private final void zzb(zzduu zzduu) {
        if (zzduu != null) {
            this.zzmfz = zzduu;
            return;
        }
        throw new NullPointerException();
    }

    public static zza zzbou() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmgb.zza(zzg.zzppy, null, null));
    }

    public static zzduq zzbov() {
        return zzmgb;
    }

    private final void zzk(zzfgs zzfgs) {
        if (zzfgs != null) {
            this.zzmga = zzfgs;
            return;
        }
        throw new NullPointerException();
    }

    public static zzduq zzl(zzfgs zzfgs) {
        return (zzduq) zzfhu.zza(zzmgb, zzfgs);
    }

    public final int getVersion() {
        return this.zzmfs;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdur.zzbbk[i - 1]) {
            case 1:
                return new zzduq();
            case 2:
                return zzmgb;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzduq zzduq = (zzduq) obj2;
                this.zzmfs = zzh.zza(this.zzmfs != 0, this.zzmfs, zzduq.zzmfs != 0, zzduq.zzmfs);
                this.zzmfz = (zzduu) zzh.zza(this.zzmfz, zzduq.zzmfz);
                boolean z2 = this.zzmga != zzfgs.zzpnw;
                zzfgs zzfgs = this.zzmga;
                if (zzduq.zzmga != zzfgs.zzpnw) {
                    z = true;
                }
                this.zzmga = zzh.zza(z2, zzfgs, z, zzduq.zzmga);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                zzfhm zzfhm = (zzfhm) obj2;
                if (zzfhm != null) {
                    while (!z) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzmfs = zzfhb.zzcyg();
                                } else if (i == 18) {
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
                                } else if (i == 26) {
                                    this.zzmga = zzfhb.zzcyf();
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
                    synchronized (zzduq.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmgb);
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
        return zzmgb;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmfs;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        zzfjc zzfjc = this.zzmfz;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzduu.zzbpa();
            }
            zzfhg.zza(2, zzfjc);
        }
        if (!this.zzmga.isEmpty()) {
            zzfhg.zza(3, this.zzmga);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzduu zzbos() {
        zzduu zzduu = this.zzmfz;
        return zzduu == null ? zzduu.zzbpa() : zzduu;
    }

    public final zzfgs zzbot() {
        return this.zzmga;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        i = this.zzmfs;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + zzfhg.zzah(1, i);
        }
        zzfjc zzfjc = this.zzmfz;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzduu.zzbpa();
            }
            i2 += zzfhg.zzc(2, zzfjc);
        }
        if (!this.zzmga.isEmpty()) {
            i2 += zzfhg.zzc(3, this.zzmga);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}
