package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdve extends zzfhu<zzdve, zza> implements zzfje {
    private static volatile zzfjl<zzdve> zzbbm;
    private static final zzdve zzmgl;
    private int zzmgc;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdve, zza> implements zzfje {
        private zza() {
            super(zzdve.zzmgl);
        }

        /* synthetic */ zza(zzdvf zzdvf) {
            this();
        }
    }

    static {
        zzdve zzdve = new zzdve();
        zzmgl = zzdve;
        zzdve.zza(zzg.zzppw, null, null);
        zzdve.zzpph.zzbkr();
    }

    private zzdve() {
    }

    public static zzdve zzt(zzfgs zzfgs) {
        return (zzdve) zzfhu.zza(zzmgl, zzfgs);
    }

    public final int getKeySize() {
        return this.zzmgc;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdvf.zzbbk[i - 1]) {
            case 1:
                return new zzdve();
            case 2:
                return zzmgl;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdve zzdve = (zzdve) obj2;
                boolean z2 = this.zzmgc != 0;
                int i2 = this.zzmgc;
                if (zzdve.zzmgc != 0) {
                    z = true;
                }
                this.zzmgc = zzh.zza(z2, i2, z, zzdve.zzmgc);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                if (((zzfhm) obj2) != null) {
                    while (!z) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 16) {
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
                    synchronized (zzdve.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmgl);
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
        return zzmgl;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmgc;
        if (i != 0) {
            zzfhg.zzae(2, i);
        }
        this.zzpph.zza(zzfhg);
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        i = this.zzmgc;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + zzfhg.zzah(2, i);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}
