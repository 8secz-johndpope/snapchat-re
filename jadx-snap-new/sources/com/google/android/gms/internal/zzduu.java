package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzduu extends zzfhu<zzduu, zza> implements zzfje {
    private static volatile zzfjl<zzduu> zzbbm;
    private static final zzduu zzmgf;
    private int zzmge;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzduu, zza> implements zzfje {
        private zza() {
            super(zzduu.zzmgf);
        }

        /* synthetic */ zza(zzduv zzduv) {
            this();
        }
    }

    static {
        zzduu zzduu = new zzduu();
        zzmgf = zzduu;
        zzduu.zza(zzg.zzppw, null, null);
        zzduu.zzpph.zzbkr();
    }

    private zzduu() {
    }

    public static zzduu zzbpa() {
        return zzmgf;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzduv.zzbbk[i - 1]) {
            case 1:
                return new zzduu();
            case 2:
                return zzmgf;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzduu zzduu = (zzduu) obj2;
                boolean z2 = this.zzmge != 0;
                int i2 = this.zzmge;
                if (zzduu.zzmge != 0) {
                    z = true;
                }
                this.zzmge = zzh.zza(z2, i2, z, zzduu.zzmge);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                if (((zzfhm) obj2) != null) {
                    while (!z) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzmge = zzfhb.zzcyg();
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
                    synchronized (zzduu.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmgf);
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
        return zzmgf;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmge;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        this.zzpph.zza(zzfhg);
    }

    public final int zzboz() {
        return this.zzmge;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        i = this.zzmge;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + zzfhg.zzah(1, i);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}
