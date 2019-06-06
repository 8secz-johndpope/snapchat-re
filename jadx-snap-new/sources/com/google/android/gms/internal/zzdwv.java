package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdwv extends zzfhu<zzdwv, zza> implements zzfje {
    private static volatile zzfjl<zzdwv> zzbbm;
    private static final zzdwv zzmjp;
    private String zzmjo = "";

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwv, zza> implements zzfje {
        private zza() {
            super(zzdwv.zzmjp);
        }

        /* synthetic */ zza(zzdww zzdww) {
            this();
        }
    }

    static {
        zzdwv zzdwv = new zzdwv();
        zzmjp = zzdwv;
        zzdwv.zza(zzg.zzppw, null, null);
        zzdwv.zzpph.zzbkr();
    }

    private zzdwv() {
    }

    public static zzdwv zzak(zzfgs zzfgs) {
        return (zzdwv) zzfhu.zza(zzmjp, zzfgs);
    }

    public static zzdwv zzbsd() {
        return zzmjp;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdww.zzbbk[i - 1]) {
            case 1:
                return new zzdwv();
            case 2:
                return zzmjp;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzdwv zzdwv = (zzdwv) obj2;
                this.zzmjo = ((zzh) obj).zza(this.zzmjo.isEmpty() ^ 1, this.zzmjo, 1 ^ zzdwv.zzmjo.isEmpty(), zzdwv.zzmjo);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                if (((zzfhm) obj2) != null) {
                    Object obj3 = null;
                    while (obj3 == null) {
                        try {
                            int zzcxx = zzfhb.zzcxx();
                            if (zzcxx != 0) {
                                if (zzcxx == 10) {
                                    this.zzmjo = zzfhb.zzcye();
                                } else if (zza(zzcxx, zzfhb)) {
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
                    synchronized (zzdwv.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmjp);
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
        return zzmjp;
    }

    public final void zza(zzfhg zzfhg) {
        if (!this.zzmjo.isEmpty()) {
            zzfhg.zzp(1, this.zzmjo);
        }
        this.zzpph.zza(zzfhg);
    }

    public final String zzbsc() {
        return this.zzmjo;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.zzmjo.isEmpty()) {
            i2 = 0 + zzfhg.zzq(1, this.zzmjo);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}
