package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzduw extends zzfhu<zzduw, zza> implements zzfje {
    private static volatile zzfjl<zzduw> zzbbm;
    private static final zzduw zzmgh;
    private int zzmfs;
    private zzfgs zzmga = zzfgs.zzpnw;
    private zzdva zzmgg;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzduw, zza> implements zzfje {
        private zza() {
            super(zzduw.zzmgh);
        }

        /* synthetic */ zza(zzdux zzdux) {
            this();
        }

        public final zza zzb(zzdva zzdva) {
            zzczv();
            ((zzduw) this.zzppl).zza(zzdva);
            return this;
        }

        public final zza zzge(int i) {
            zzczv();
            ((zzduw) this.zzppl).setVersion(0);
            return this;
        }

        public final zza zzp(zzfgs zzfgs) {
            zzczv();
            ((zzduw) this.zzppl).zzk(zzfgs);
            return this;
        }
    }

    static {
        zzduw zzduw = new zzduw();
        zzmgh = zzduw;
        zzduw.zza(zzg.zzppw, null, null);
        zzduw.zzpph.zzbkr();
    }

    private zzduw() {
    }

    private final void setVersion(int i) {
        this.zzmfs = i;
    }

    private final void zza(zzdva zzdva) {
        if (zzdva != null) {
            this.zzmgg = zzdva;
            return;
        }
        throw new NullPointerException();
    }

    public static zza zzbpd() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmgh.zza(zzg.zzppy, null, null));
    }

    private final void zzk(zzfgs zzfgs) {
        if (zzfgs != null) {
            this.zzmga = zzfgs;
            return;
        }
        throw new NullPointerException();
    }

    public static zzduw zzo(zzfgs zzfgs) {
        return (zzduw) zzfhu.zza(zzmgh, zzfgs);
    }

    public final int getVersion() {
        return this.zzmfs;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdux.zzbbk[i - 1]) {
            case 1:
                return new zzduw();
            case 2:
                return zzmgh;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzduw zzduw = (zzduw) obj2;
                this.zzmfs = zzh.zza(this.zzmfs != 0, this.zzmfs, zzduw.zzmfs != 0, zzduw.zzmfs);
                this.zzmgg = (zzdva) zzh.zza(this.zzmgg, zzduw.zzmgg);
                boolean z2 = this.zzmga != zzfgs.zzpnw;
                zzfgs zzfgs = this.zzmga;
                if (zzduw.zzmga != zzfgs.zzpnw) {
                    z = true;
                }
                this.zzmga = zzh.zza(z2, zzfgs, z, zzduw.zzmga);
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
                    synchronized (zzduw.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmgh);
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
        return zzmgh;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmfs;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        zzfjc zzfjc = this.zzmgg;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdva.zzbpg();
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

    public final zzdva zzbpc() {
        zzdva zzdva = this.zzmgg;
        return zzdva == null ? zzdva.zzbpg() : zzdva;
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
        zzfjc zzfjc = this.zzmgg;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdva.zzbpg();
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
