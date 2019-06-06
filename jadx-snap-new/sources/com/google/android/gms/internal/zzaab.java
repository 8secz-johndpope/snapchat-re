package com.google.android.gms.internal;

import java.util.List;

final class zzaab implements zzale<List<zzpj>, zzph> {
    private /* synthetic */ String zzcph;
    private /* synthetic */ Integer zzcpi;
    private /* synthetic */ Integer zzcpj;
    private /* synthetic */ int zzcpk;
    private /* synthetic */ int zzcpl;
    private /* synthetic */ int zzcpm;
    private /* synthetic */ int zzcpn;
    private /* synthetic */ boolean zzcpo;

    zzaab(zzzy zzzy, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.zzcph = str;
        this.zzcpi = num;
        this.zzcpj = num2;
        this.zzcpk = i;
        this.zzcpl = i2;
        this.zzcpm = i3;
        this.zzcpn = i4;
        this.zzcpo = z;
    }

    public final /* synthetic */ Object apply(Object obj) {
        List list = (List) obj;
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = this.zzcph;
        Integer num2 = this.zzcpi;
        Integer num3 = this.zzcpj;
        int i = this.zzcpk;
        if (i > 0) {
            num = Integer.valueOf(i);
        }
        return new zzph(str, list, num2, num3, num, this.zzcpl + this.zzcpm, this.zzcpn, this.zzcpo);
    }
}
