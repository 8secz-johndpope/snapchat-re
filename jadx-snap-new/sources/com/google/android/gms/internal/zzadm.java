package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbt;

@zzabh
public final class zzadm {
    public final boolean zzcvp;
    public final zzady zzcvq = null;
    public final zzip zzcvr;
    public final zzagy zzcvs;
    public final zznx zzcvt;
    public final zzaeh zzcvu;
    public final zzvm zzcvv;
    public final zzaei zzcvw;
    public final zzaej zzcvx;
    public final zzyw zzcvy;
    public final zzahc zzcvz;
    public final zzadr zzcwa;

    private zzadm(zzady zzady, zzip zzip, zzagy zzagy, zznx zznx, zzaeh zzaeh, zzvm zzvm, zzaei zzaei, zzaej zzaej, zzyw zzyw, zzahc zzahc, boolean z, zzadr zzadr) {
        this.zzcvr = zzip;
        this.zzcvs = zzagy;
        this.zzcvt = zznx;
        this.zzcvu = zzaeh;
        this.zzcvv = zzvm;
        this.zzcvw = zzaei;
        this.zzcvx = zzaej;
        this.zzcvy = zzyw;
        this.zzcvz = zzahc;
        this.zzcvp = true;
        this.zzcwa = zzadr;
    }

    public static zzadm zzk(Context context) {
        zzbt.zzfi().initialize(context);
        zzaen zzaen = new zzaen(context);
        return new zzadm(null, new zzis(), new zzagz(), new zznw(), new zzaef(context, zzaen.zzof()), new zzvn(), new zzael(), new zzaem(), new zzyv(), new zzaha(), true, zzaen);
    }
}
