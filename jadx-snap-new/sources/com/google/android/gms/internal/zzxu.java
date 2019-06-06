package com.google.android.gms.internal;

import com.google.android.gms.ads.zzb;
import defpackage.bbb.a;
import defpackage.bbc;
import defpackage.bbd;
import java.util.Date;
import java.util.HashSet;

@zzabh
public final class zzxu {
    public static int zza(a aVar) {
        int i = zzxv.zzckn[aVar.ordinal()];
        return i != 2 ? i != 3 ? i != 4 ? 0 : 3 : 2 : 1;
    }

    public static bbd zza(zzkk zzkk, boolean z) {
        HashSet hashSet = zzkk.zzbgx != null ? new HashSet(zzkk.zzbgx) : null;
        Date date = new Date(zzkk.zzbgv);
        int i = zzkk.zzbgw;
        int i2 = 2;
        if (i != 1) {
            i2 = i != 2 ? 1 : 3;
        }
        return new bbd(date, i2, hashSet, z, zzkk.zzbhd);
    }

    public static bbc zzb(zzko zzko) {
        r1 = new bbc[6];
        int i = 0;
        r1[0] = bbc.b;
        r1[1] = bbc.c;
        r1[2] = bbc.d;
        r1[3] = bbc.e;
        r1[4] = bbc.f;
        r1[5] = bbc.g;
        while (i < 6) {
            if (r1[i].a.getWidth() == zzko.width && r1[i].a.getHeight() == zzko.height) {
                return r1[i];
            }
            i++;
        }
        return new bbc(zzb.zza(zzko.width, zzko.height, zzko.zzbia));
    }
}
