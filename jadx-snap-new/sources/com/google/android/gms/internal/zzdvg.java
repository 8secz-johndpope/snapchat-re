package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdvg extends zzfhu<zzdvg, zza> implements zzfje {
    private static volatile zzfjl<zzdvg> zzbbm;
    private static final zzdvg zzmgm;
    private int zzmfs;
    private zzfgs zzmga = zzfgs.zzpnw;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdvg, zza> implements zzfje {
        private zza() {
            super(zzdvg.zzmgm);
        }

        /* synthetic */ zza(zzdvh zzdvh) {
            this();
        }

        public final zza zzgg(int i) {
            zzczv();
            ((zzdvg) this.zzppl).setVersion(0);
            return this;
        }

        public final zza zzv(zzfgs zzfgs) {
            zzczv();
            ((zzdvg) this.zzppl).zzk(zzfgs);
            return this;
        }
    }

    static {
        zzdvg zzdvg = new zzdvg();
        zzmgm = zzdvg;
        zzdvg.zza(zzg.zzppw, null, null);
        zzdvg.zzpph.zzbkr();
    }

    private zzdvg() {
    }

    private final void setVersion(int i) {
        this.zzmfs = i;
    }

    public static zza zzbpl() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmgm.zza(zzg.zzppy, null, null));
    }

    private final void zzk(zzfgs zzfgs) {
        if (zzfgs != null) {
            this.zzmga = zzfgs;
            return;
        }
        throw new NullPointerException();
    }

    public static zzdvg zzu(zzfgs zzfgs) {
        return (zzdvg) zzfhu.zza(zzmgm, zzfgs);
    }

    public final int getVersion() {
        return this.zzmfs;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdvh.zzbbk[i - 1]) {
            case 1:
                return new zzdvg();
            case 2:
                return zzmgm;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdvg zzdvg = (zzdvg) obj2;
                this.zzmfs = zzh.zza(this.zzmfs != 0, this.zzmfs, zzdvg.zzmfs != 0, zzdvg.zzmfs);
                boolean z2 = this.zzmga != zzfgs.zzpnw;
                zzfgs zzfgs = this.zzmga;
                if (zzdvg.zzmga == zzfgs.zzpnw) {
                    z = false;
                }
                this.zzmga = zzh.zza(z2, zzfgs, z, zzdvg.zzmga);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                if (((zzfhm) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzmfs = zzfhb.zzcyg();
                                } else if (i == 18) {
                                    this.zzmga = zzfhb.zzcyf();
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
                    synchronized (zzdvg.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmgm);
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
        return zzmgm;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmfs;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        if (!this.zzmga.isEmpty()) {
            zzfhg.zza(2, this.zzmga);
        }
        this.zzpph.zza(zzfhg);
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
        if (!this.zzmga.isEmpty()) {
            i2 += zzfhg.zzc(2, this.zzmga);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}