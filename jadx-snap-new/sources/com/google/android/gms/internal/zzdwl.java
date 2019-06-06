package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdwl extends zzfhu<zzdwl, zza> implements zzfje {
    private static volatile zzfjl<zzdwl> zzbbm;
    private static final zzdwl zzmiv;
    private String zzmid = "";
    private zzfgs zzmie = zzfgs.zzpnw;
    private int zzmiu;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwl, zza> implements zzfje {
        private zza() {
            super(zzdwl.zzmiv);
        }

        /* synthetic */ zza(zzdwm zzdwm) {
            this();
        }
    }

    static {
        zzdwl zzdwl = new zzdwl();
        zzmiv = zzdwl;
        zzdwl.zza(zzg.zzppw, null, null);
        zzdwl.zzpph.zzbkr();
    }

    private zzdwl() {
    }

    public static zzdwl zzbra() {
        return zzmiv;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdwm.zzbbk[i - 1]) {
            case 1:
                return new zzdwl();
            case 2:
                return zzmiv;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdwl zzdwl = (zzdwl) obj2;
                this.zzmid = zzh.zza(this.zzmid.isEmpty() ^ 1, this.zzmid, zzdwl.zzmid.isEmpty() ^ 1, zzdwl.zzmid);
                this.zzmie = zzh.zza(this.zzmie != zzfgs.zzpnw, this.zzmie, zzdwl.zzmie != zzfgs.zzpnw, zzdwl.zzmie);
                boolean z2 = this.zzmiu != 0;
                int i2 = this.zzmiu;
                if (zzdwl.zzmiu == 0) {
                    z = false;
                }
                this.zzmiu = zzh.zza(z2, i2, z, zzdwl.zzmiu);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                if (((zzfhm) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 10) {
                                    this.zzmid = zzfhb.zzcye();
                                } else if (i == 18) {
                                    this.zzmie = zzfhb.zzcyf();
                                } else if (i == 24) {
                                    this.zzmiu = zzfhb.zzcyh();
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
                    synchronized (zzdwl.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmiv);
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
        return zzmiv;
    }

    public final void zza(zzfhg zzfhg) {
        if (!this.zzmid.isEmpty()) {
            zzfhg.zzp(1, this.zzmid);
        }
        if (!this.zzmie.isEmpty()) {
            zzfhg.zza(2, this.zzmie);
        }
        if (this.zzmiu != zzdxb.UNKNOWN_PREFIX.zzhu()) {
            zzfhg.zzad(3, this.zzmiu);
        }
        this.zzpph.zza(zzfhg);
    }

    public final String zzbqu() {
        return this.zzmid;
    }

    public final zzfgs zzbqv() {
        return this.zzmie;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.zzmid.isEmpty()) {
            i2 = 0 + zzfhg.zzq(1, this.zzmid);
        }
        if (!this.zzmie.isEmpty()) {
            i2 += zzfhg.zzc(2, this.zzmie);
        }
        if (this.zzmiu != zzdxb.UNKNOWN_PREFIX.zzhu()) {
            i2 += zzfhg.zzaj(3, this.zzmiu);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}
