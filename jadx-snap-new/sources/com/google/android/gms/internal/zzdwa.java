package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdwa extends zzfhu<zzdwa, zza> implements zzfje {
    private static volatile zzfjl<zzdwa> zzbbm;
    private static final zzdwa zzmhy;
    private int zzmfs;
    private zzfgs zzmga = zzfgs.zzpnw;
    private zzdwe zzmhx;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwa, zza> implements zzfje {
        private zza() {
            super(zzdwa.zzmhy);
        }

        /* synthetic */ zza(zzdwb zzdwb) {
            this();
        }

        public final zza zzaf(zzfgs zzfgs) {
            zzczv();
            ((zzdwa) this.zzppl).zzk(zzfgs);
            return this;
        }

        public final zza zzc(zzdwe zzdwe) {
            zzczv();
            ((zzdwa) this.zzppl).zzb(zzdwe);
            return this;
        }

        public final zza zzgm(int i) {
            zzczv();
            ((zzdwa) this.zzppl).setVersion(0);
            return this;
        }
    }

    static {
        zzdwa zzdwa = new zzdwa();
        zzmhy = zzdwa;
        zzdwa.zza(zzg.zzppw, null, null);
        zzdwa.zzpph.zzbkr();
    }

    private zzdwa() {
    }

    private final void setVersion(int i) {
        this.zzmfs = i;
    }

    public static zzdwa zzae(zzfgs zzfgs) {
        return (zzdwa) zzfhu.zza(zzmhy, zzfgs);
    }

    private final void zzb(zzdwe zzdwe) {
        if (zzdwe != null) {
            this.zzmhx = zzdwe;
            return;
        }
        throw new NullPointerException();
    }

    public static zza zzbql() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmhy.zza(zzg.zzppy, null, null));
    }

    public static zzdwa zzbqm() {
        return zzmhy;
    }

    private final void zzk(zzfgs zzfgs) {
        if (zzfgs != null) {
            this.zzmga = zzfgs;
            return;
        }
        throw new NullPointerException();
    }

    public final int getVersion() {
        return this.zzmfs;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdwb.zzbbk[i - 1]) {
            case 1:
                return new zzdwa();
            case 2:
                return zzmhy;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdwa zzdwa = (zzdwa) obj2;
                this.zzmfs = zzh.zza(this.zzmfs != 0, this.zzmfs, zzdwa.zzmfs != 0, zzdwa.zzmfs);
                this.zzmhx = (zzdwe) zzh.zza(this.zzmhx, zzdwa.zzmhx);
                boolean z2 = this.zzmga != zzfgs.zzpnw;
                zzfgs zzfgs = this.zzmga;
                if (zzdwa.zzmga != zzfgs.zzpnw) {
                    z = true;
                }
                this.zzmga = zzh.zza(z2, zzfgs, z, zzdwa.zzmga);
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
                    synchronized (zzdwa.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmhy);
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
        return zzmhy;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmfs;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        zzfjc zzfjc = this.zzmhx;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwe.zzbqs();
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

    public final zzdwe zzbqk() {
        zzdwe zzdwe = this.zzmhx;
        return zzdwe == null ? zzdwe.zzbqs() : zzdwe;
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
        zzfjc zzfjc = this.zzmhx;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwe.zzbqs();
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
