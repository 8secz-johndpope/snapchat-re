package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzf;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;
import java.util.List;

public final class zzdxd extends zzfhu<zzdxd, zza> implements zzfje {
    private static volatile zzfjl<zzdxd> zzbbm;
    private static final zzdxd zzmke;
    private int zzmjb;
    private String zzmkc = "";
    private zzfid<zzdwn> zzmkd = zzfhu.zzczs();

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdxd, zza> implements zzfje {
        private zza() {
            super(zzdxd.zzmke);
        }

        /* synthetic */ zza(zzdxe zzdxe) {
            this();
        }

        public final zza zzb(zzdwn zzdwn) {
            zzczv();
            ((zzdxd) this.zzppl).zza(zzdwn);
            return this;
        }

        public final zza zzox(String str) {
            zzczv();
            ((zzdxd) this.zzppl).zzow(str);
            return this;
        }
    }

    static {
        zzdxd zzdxd = new zzdxd();
        zzmke = zzdxd;
        zzdxd.zza(zzg.zzppw, null, null);
        zzdxd.zzpph.zzbkr();
    }

    private zzdxd() {
    }

    private final void zza(zzdwn zzdwn) {
        if (zzdwn != null) {
            if (!this.zzmkd.zzcxk()) {
                zzfid zzfid = this.zzmkd;
                int size = zzfid.size();
                this.zzmkd = zzfid.zzmo(size == 0 ? 10 : size << 1);
            }
            this.zzmkd.add(zzdwn);
            return;
        }
        throw new NullPointerException();
    }

    public static zza zzbsn() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmke.zza(zzg.zzppy, null, null));
    }

    private final void zzow(String str) {
        if (str != null) {
            this.zzmkc = str;
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxe.zzbbk[i - 1]) {
            case 1:
                return new zzdxd();
            case 2:
                return zzmke;
            case 3:
                this.zzmkd.zzbkr();
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdxd zzdxd = (zzdxd) obj2;
                this.zzmkc = zzh.zza(this.zzmkc.isEmpty() ^ 1, this.zzmkc, 1 ^ zzdxd.zzmkc.isEmpty(), zzdxd.zzmkc);
                this.zzmkd = zzh.zza(this.zzmkd, zzdxd.zzmkd);
                if (zzh == zzf.zzppq) {
                    this.zzmjb |= zzdxd.zzmjb;
                }
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                zzfhm zzfhm = (zzfhm) obj2;
                if (zzfhm != null) {
                    Object obj3 = null;
                    while (obj3 == null) {
                        try {
                            int zzcxx = zzfhb.zzcxx();
                            if (zzcxx != 0) {
                                int i2 = 10;
                                if (zzcxx == 10) {
                                    this.zzmkc = zzfhb.zzcye();
                                } else if (zzcxx == 18) {
                                    if (!this.zzmkd.zzcxk()) {
                                        zzfid zzfid = this.zzmkd;
                                        int size = zzfid.size();
                                        if (size != 0) {
                                            i2 = size << 1;
                                        }
                                        this.zzmkd = zzfid.zzmo(i2);
                                    }
                                    this.zzmkd.add((zzdwn) zzfhb.zza(zzdwn.zzbrh(), zzfhm));
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
                    synchronized (zzdxd.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmke);
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
        return zzmke;
    }

    public final void zza(zzfhg zzfhg) {
        if (!this.zzmkc.isEmpty()) {
            zzfhg.zzp(1, this.zzmkc);
        }
        for (int i = 0; i < this.zzmkd.size(); i++) {
            zzfhg.zza(2, (zzfjc) this.zzmkd.get(i));
        }
        this.zzpph.zza(zzfhg);
    }

    public final List<zzdwn> zzbsm() {
        return this.zzmkd;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        i = !this.zzmkc.isEmpty() ? zzfhg.zzq(1, this.zzmkc) + 0 : 0;
        while (i2 < this.zzmkd.size()) {
            i += zzfhg.zzc(2, (zzfjc) this.zzmkd.get(i2));
            i2++;
        }
        i += this.zzpph.zzhs();
        this.zzppi = i;
        return i;
    }
}
