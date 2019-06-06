package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdvq extends zzfhu<zzdvq, zza> implements zzfje {
    private static volatile zzfjl<zzdvq> zzbbm;
    private static final zzdvq zzmhb;
    private int zzmfs;
    private zzfgs zzmga = zzfgs.zzpnw;
    private zzdvs zzmha;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdvq, zza> implements zzfje {
        private zza() {
            super(zzdvq.zzmhb);
        }

        /* synthetic */ zza(zzdvr zzdvr) {
            this();
        }

        public final zza zzb(zzdvs zzdvs) {
            zzczv();
            ((zzdvq) this.zzppl).zza(zzdvs);
            return this;
        }

        public final zza zzgi(int i) {
            zzczv();
            ((zzdvq) this.zzppl).setVersion(0);
            return this;
        }

        public final zza zzy(zzfgs zzfgs) {
            zzczv();
            ((zzdvq) this.zzppl).zzk(zzfgs);
            return this;
        }
    }

    static {
        zzdvq zzdvq = new zzdvq();
        zzmhb = zzdvq;
        zzdvq.zza(zzg.zzppw, null, null);
        zzdvq.zzpph.zzbkr();
    }

    private zzdvq() {
    }

    private final void setVersion(int i) {
        this.zzmfs = i;
    }

    private final void zza(zzdvs zzdvs) {
        if (zzdvs != null) {
            this.zzmha = zzdvs;
            return;
        }
        throw new NullPointerException();
    }

    public static zza zzbpy() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmhb.zza(zzg.zzppy, null, null));
    }

    private final void zzk(zzfgs zzfgs) {
        if (zzfgs != null) {
            this.zzmga = zzfgs;
            return;
        }
        throw new NullPointerException();
    }

    public static zzdvq zzx(zzfgs zzfgs) {
        return (zzdvq) zzfhu.zza(zzmhb, zzfgs);
    }

    public final int getVersion() {
        return this.zzmfs;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdvr.zzbbk[i - 1]) {
            case 1:
                return new zzdvq();
            case 2:
                return zzmhb;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdvq zzdvq = (zzdvq) obj2;
                this.zzmfs = zzh.zza(this.zzmfs != 0, this.zzmfs, zzdvq.zzmfs != 0, zzdvq.zzmfs);
                this.zzmha = (zzdvs) zzh.zza(this.zzmha, zzdvq.zzmha);
                boolean z2 = this.zzmga != zzfgs.zzpnw;
                zzfgs zzfgs = this.zzmga;
                if (zzdvq.zzmga != zzfgs.zzpnw) {
                    z = true;
                }
                this.zzmga = zzh.zza(z2, zzfgs, z, zzdvq.zzmga);
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
                                    if (this.zzmha != null) {
                                        zzfhu zzfhu = this.zzmha;
                                        com.google.android.gms.internal.zzfhu.zza zza2 = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza2.zza(zzfhu);
                                        zza = (com.google.android.gms.internal.zzdvs.zza) zza2;
                                    } else {
                                        zza = null;
                                    }
                                    this.zzmha = (zzdvs) zzfhb.zza(zzdvs.zzbqd(), zzfhm);
                                    if (zza != null) {
                                        zza.zza(this.zzmha);
                                        this.zzmha = (zzdvs) zza.zzczw();
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
                    synchronized (zzdvq.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmhb);
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
        return zzmhb;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmfs;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        zzfjc zzfjc = this.zzmha;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdvs.zzbqd();
            }
            zzfhg.zza(2, zzfjc);
        }
        if (!this.zzmga.isEmpty()) {
            zzfhg.zza(3, this.zzmga);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzfgs zzbot() {
        return this.zzmga;
    }

    public final zzdvs zzbpx() {
        zzdvs zzdvs = this.zzmha;
        return zzdvs == null ? zzdvs.zzbqd() : zzdvs;
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
        zzfjc zzfjc = this.zzmha;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdvs.zzbqd();
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
