package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdvs extends zzfhu<zzdvs, zza> implements zzfje {
    private static volatile zzfjl<zzdvs> zzbbm;
    private static final zzdvs zzmhe;
    private int zzmfs;
    private zzdvo zzmgu;
    private zzfgs zzmhc = zzfgs.zzpnw;
    private zzfgs zzmhd = zzfgs.zzpnw;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdvs, zza> implements zzfje {
        private zza() {
            super(zzdvs.zzmhe);
        }

        /* synthetic */ zza(zzdvt zzdvt) {
            this();
        }

        public final zza zzac(zzfgs zzfgs) {
            zzczv();
            ((zzdvs) this.zzppl).zzz(zzfgs);
            return this;
        }

        public final zza zzad(zzfgs zzfgs) {
            zzczv();
            ((zzdvs) this.zzppl).zzaa(zzfgs);
            return this;
        }

        public final zza zzc(zzdvo zzdvo) {
            zzczv();
            ((zzdvs) this.zzppl).zzb(zzdvo);
            return this;
        }

        public final zza zzgj(int i) {
            zzczv();
            ((zzdvs) this.zzppl).setVersion(0);
            return this;
        }
    }

    static {
        zzdvs zzdvs = new zzdvs();
        zzmhe = zzdvs;
        zzdvs.zza(zzg.zzppw, null, null);
        zzdvs.zzpph.zzbkr();
    }

    private zzdvs() {
    }

    private final void setVersion(int i) {
        this.zzmfs = i;
    }

    private final void zzaa(zzfgs zzfgs) {
        if (zzfgs != null) {
            this.zzmhd = zzfgs;
            return;
        }
        throw new NullPointerException();
    }

    public static zzdvs zzab(zzfgs zzfgs) {
        return (zzdvs) zzfhu.zza(zzmhe, zzfgs);
    }

    private final void zzb(zzdvo zzdvo) {
        if (zzdvo != null) {
            this.zzmgu = zzdvo;
            return;
        }
        throw new NullPointerException();
    }

    public static zza zzbqc() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmhe.zza(zzg.zzppy, null, null));
    }

    public static zzdvs zzbqd() {
        return zzmhe;
    }

    private final void zzz(zzfgs zzfgs) {
        if (zzfgs != null) {
            this.zzmhc = zzfgs;
            return;
        }
        throw new NullPointerException();
    }

    public final int getVersion() {
        return this.zzmfs;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdvt.zzbbk[i - 1]) {
            case 1:
                return new zzdvs();
            case 2:
                return zzmhe;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdvs zzdvs = (zzdvs) obj2;
                this.zzmfs = zzh.zza(this.zzmfs != 0, this.zzmfs, zzdvs.zzmfs != 0, zzdvs.zzmfs);
                this.zzmgu = (zzdvo) zzh.zza(this.zzmgu, zzdvs.zzmgu);
                this.zzmhc = zzh.zza(this.zzmhc != zzfgs.zzpnw, this.zzmhc, zzdvs.zzmhc != zzfgs.zzpnw, zzdvs.zzmhc);
                boolean z2 = this.zzmhd != zzfgs.zzpnw;
                zzfgs zzfgs = this.zzmhd;
                if (zzdvs.zzmhd == zzfgs.zzpnw) {
                    z = false;
                }
                this.zzmhd = zzh.zza(z2, zzfgs, z, zzdvs.zzmhd);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                zzfhm zzfhm = (zzfhm) obj2;
                if (zzfhm != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzmfs = zzfhb.zzcyg();
                                } else if (i == 18) {
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
                                } else if (i == 26) {
                                    this.zzmhc = zzfhb.zzcyf();
                                } else if (i == 34) {
                                    this.zzmhd = zzfhb.zzcyf();
                                } else if (zza(i, zzfhb)) {
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
                    synchronized (zzdvs.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmhe);
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
        return zzmhe;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmfs;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        zzfjc zzfjc = this.zzmgu;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdvo.zzbpv();
            }
            zzfhg.zza(2, zzfjc);
        }
        if (!this.zzmhc.isEmpty()) {
            zzfhg.zza(3, this.zzmhc);
        }
        if (!this.zzmhd.isEmpty()) {
            zzfhg.zza(4, this.zzmhd);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzdvo zzbpq() {
        zzdvo zzdvo = this.zzmgu;
        return zzdvo == null ? zzdvo.zzbpv() : zzdvo;
    }

    public final zzfgs zzbqa() {
        return this.zzmhc;
    }

    public final zzfgs zzbqb() {
        return this.zzmhd;
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
        zzfjc zzfjc = this.zzmgu;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdvo.zzbpv();
            }
            i2 += zzfhg.zzc(2, zzfjc);
        }
        if (!this.zzmhc.isEmpty()) {
            i2 += zzfhg.zzc(3, this.zzmhc);
        }
        if (!this.zzmhd.isEmpty()) {
            i2 += zzfhg.zzc(4, this.zzmhd);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}
