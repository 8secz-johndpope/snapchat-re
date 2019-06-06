package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdum extends zzfhu<zzdum, zza> implements zzfje {
    private static volatile zzfjl<zzdum> zzbbm;
    private static final zzdum zzmfv;
    private int zzmfs;
    private zzduq zzmft;
    private zzdwa zzmfu;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdum, zza> implements zzfje {
        private zza() {
            super(zzdum.zzmfv);
        }

        /* synthetic */ zza(zzdun zzdun) {
            this();
        }

        public final zza zzb(zzduq zzduq) {
            zzczv();
            ((zzdum) this.zzppl).zza(zzduq);
            return this;
        }

        public final zza zzb(zzdwa zzdwa) {
            zzczv();
            ((zzdum) this.zzppl).zza(zzdwa);
            return this;
        }

        public final zza zzgc(int i) {
            zzczv();
            ((zzdum) this.zzppl).setVersion(i);
            return this;
        }
    }

    static {
        zzdum zzdum = new zzdum();
        zzmfv = zzdum;
        zzdum.zza(zzg.zzppw, null, null);
        zzdum.zzpph.zzbkr();
    }

    private zzdum() {
    }

    private final void setVersion(int i) {
        this.zzmfs = i;
    }

    private final void zza(zzduq zzduq) {
        if (zzduq != null) {
            this.zzmft = zzduq;
            return;
        }
        throw new NullPointerException();
    }

    private final void zza(zzdwa zzdwa) {
        if (zzdwa != null) {
            this.zzmfu = zzdwa;
            return;
        }
        throw new NullPointerException();
    }

    public static zza zzbon() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmfv.zza(zzg.zzppy, null, null));
    }

    public static zzdum zzi(zzfgs zzfgs) {
        return (zzdum) zzfhu.zza(zzmfv, zzfgs);
    }

    public final int getVersion() {
        return this.zzmfs;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdun.zzbbk[i - 1]) {
            case 1:
                return new zzdum();
            case 2:
                return zzmfv;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdum zzdum = (zzdum) obj2;
                boolean z2 = this.zzmfs != 0;
                int i2 = this.zzmfs;
                if (zzdum.zzmfs != 0) {
                    z = true;
                }
                this.zzmfs = zzh.zza(z2, i2, z, zzdum.zzmfs);
                this.zzmft = (zzduq) zzh.zza(this.zzmft, zzdum.zzmft);
                this.zzmfu = (zzdwa) zzh.zza(this.zzmfu, zzdum.zzmfu);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                zzfhm zzfhm = (zzfhm) obj2;
                if (zzfhm != null) {
                    while (!z) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                zzfhu zzfhu;
                                com.google.android.gms.internal.zzfhu.zza zza;
                                com.google.android.gms.internal.zzfhu.zza zza2;
                                if (i == 8) {
                                    this.zzmfs = zzfhb.zzcyg();
                                } else if (i == 18) {
                                    if (this.zzmft != null) {
                                        zzfhu = this.zzmft;
                                        zza = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza.zza(zzfhu);
                                        zza2 = (com.google.android.gms.internal.zzduq.zza) zza;
                                    } else {
                                        zza2 = null;
                                    }
                                    this.zzmft = (zzduq) zzfhb.zza(zzduq.zzbov(), zzfhm);
                                    if (zza2 != null) {
                                        zza2.zza(this.zzmft);
                                        this.zzmft = (zzduq) zza2.zzczw();
                                    }
                                } else if (i == 26) {
                                    if (this.zzmfu != null) {
                                        zzfhu = this.zzmfu;
                                        zza = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza.zza(zzfhu);
                                        zza2 = (com.google.android.gms.internal.zzdwa.zza) zza;
                                    } else {
                                        zza2 = null;
                                    }
                                    this.zzmfu = (zzdwa) zzfhb.zza(zzdwa.zzbqm(), zzfhm);
                                    if (zza2 != null) {
                                        zza2.zza(this.zzmfu);
                                        this.zzmfu = (zzdwa) zza2.zzczw();
                                    }
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
                    synchronized (zzdum.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmfv);
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
        return zzmfv;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmfs;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        zzfjc zzfjc = this.zzmft;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzduq.zzbov();
            }
            zzfhg.zza(2, zzfjc);
        }
        zzfjc = this.zzmfu;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwa.zzbqm();
            }
            zzfhg.zza(3, zzfjc);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzduq zzbol() {
        zzduq zzduq = this.zzmft;
        return zzduq == null ? zzduq.zzbov() : zzduq;
    }

    public final zzdwa zzbom() {
        zzdwa zzdwa = this.zzmfu;
        return zzdwa == null ? zzdwa.zzbqm() : zzdwa;
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
        zzfjc zzfjc = this.zzmft;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzduq.zzbov();
            }
            i2 += zzfhg.zzc(2, zzfjc);
        }
        zzfjc = this.zzmfu;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwa.zzbqm();
            }
            i2 += zzfhg.zzc(3, zzfjc);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}
