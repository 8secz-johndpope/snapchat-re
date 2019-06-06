package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdwn extends zzfhu<zzdwn, zza> implements zzfje {
    private static volatile zzfjl<zzdwn> zzbbm;
    private static final zzdwn zzmja;
    private String zzmid;
    private String zzmiw;
    private int zzmix;
    private boolean zzmiy;
    private String zzmiz;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwn, zza> implements zzfje {
        private zza() {
            super(zzdwn.zzmja);
        }

        /* synthetic */ zza(zzdwo zzdwo) {
            this();
        }

        public final zza zzch(boolean z) {
            zzczv();
            ((zzdwn) this.zzppl).zzcg(true);
            return this;
        }

        public final zza zzgq(int i) {
            zzczv();
            ((zzdwn) this.zzppl).zzgp(0);
            return this;
        }

        public final zza zzos(String str) {
            zzczv();
            ((zzdwn) this.zzppl).zzoq(str);
            return this;
        }

        public final zza zzot(String str) {
            zzczv();
            ((zzdwn) this.zzppl).zzoo(str);
            return this;
        }

        public final zza zzou(String str) {
            zzczv();
            ((zzdwn) this.zzppl).zzor(str);
            return this;
        }
    }

    static {
        zzdwn zzdwn = new zzdwn();
        zzmja = zzdwn;
        zzdwn.zza(zzg.zzppw, null, null);
        zzdwn.zzpph.zzbkr();
    }

    private zzdwn() {
        String str = "";
        this.zzmiw = str;
        this.zzmid = str;
        this.zzmiz = str;
    }

    public static zza zzbrg() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmja.zza(zzg.zzppy, null, null));
    }

    public static zzdwn zzbrh() {
        return zzmja;
    }

    private final void zzcg(boolean z) {
        this.zzmiy = z;
    }

    private final void zzgp(int i) {
        this.zzmix = i;
    }

    private final void zzoo(String str) {
        if (str != null) {
            this.zzmid = str;
            return;
        }
        throw new NullPointerException();
    }

    private final void zzoq(String str) {
        if (str != null) {
            this.zzmiw = str;
            return;
        }
        throw new NullPointerException();
    }

    private final void zzor(String str) {
        if (str != null) {
            this.zzmiz = str;
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdwo.zzbbk[i - 1]) {
            case 1:
                return new zzdwn();
            case 2:
                return zzmja;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdwn zzdwn = (zzdwn) obj2;
                this.zzmiw = zzh.zza(this.zzmiw.isEmpty() ^ 1, this.zzmiw, zzdwn.zzmiw.isEmpty() ^ 1, zzdwn.zzmiw);
                this.zzmid = zzh.zza(this.zzmid.isEmpty() ^ 1, this.zzmid, zzdwn.zzmid.isEmpty() ^ 1, zzdwn.zzmid);
                boolean z2 = this.zzmix != 0;
                int i2 = this.zzmix;
                if (zzdwn.zzmix != 0) {
                    z = true;
                }
                this.zzmix = zzh.zza(z2, i2, z, zzdwn.zzmix);
                z2 = this.zzmiy;
                z = zzdwn.zzmiy;
                this.zzmiy = zzh.zza(z2, z2, z, z);
                this.zzmiz = zzh.zza(this.zzmiz.isEmpty() ^ 1, this.zzmiz, 1 ^ zzdwn.zzmiz.isEmpty(), zzdwn.zzmiz);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                if (((zzfhm) obj2) != null) {
                    while (!z) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 10) {
                                    this.zzmiw = zzfhb.zzcye();
                                } else if (i == 18) {
                                    this.zzmid = zzfhb.zzcye();
                                } else if (i == 24) {
                                    this.zzmix = zzfhb.zzcyg();
                                } else if (i == 32) {
                                    this.zzmiy = zzfhb.zzcyd();
                                } else if (i == 42) {
                                    this.zzmiz = zzfhb.zzcye();
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
                    synchronized (zzdwn.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmja);
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
        return zzmja;
    }

    public final void zza(zzfhg zzfhg) {
        if (!this.zzmiw.isEmpty()) {
            zzfhg.zzp(1, this.zzmiw);
        }
        if (!this.zzmid.isEmpty()) {
            zzfhg.zzp(2, this.zzmid);
        }
        int i = this.zzmix;
        if (i != 0) {
            zzfhg.zzae(3, i);
        }
        boolean z = this.zzmiy;
        if (z) {
            zzfhg.zzl(4, z);
        }
        if (!this.zzmiz.isEmpty()) {
            zzfhg.zzp(5, this.zzmiz);
        }
        this.zzpph.zza(zzfhg);
    }

    public final String zzbqu() {
        return this.zzmid;
    }

    public final String zzbrc() {
        return this.zzmiw;
    }

    public final int zzbrd() {
        return this.zzmix;
    }

    public final boolean zzbre() {
        return this.zzmiy;
    }

    public final String zzbrf() {
        return this.zzmiz;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.zzmiw.isEmpty()) {
            i2 = 0 + zzfhg.zzq(1, this.zzmiw);
        }
        if (!this.zzmid.isEmpty()) {
            i2 += zzfhg.zzq(2, this.zzmid);
        }
        i = this.zzmix;
        if (i != 0) {
            i2 += zzfhg.zzah(3, i);
        }
        boolean z = this.zzmiy;
        if (z) {
            i2 += zzfhg.zzm(4, z);
        }
        if (!this.zzmiz.isEmpty()) {
            i2 += zzfhg.zzq(5, this.zzmiz);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}
