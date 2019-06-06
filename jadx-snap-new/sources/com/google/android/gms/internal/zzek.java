package com.google.android.gms.internal;

import java.util.List;

public final class zzek extends zzeu {
    private List<Long> zzakp = null;

    public zzek(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        super(zzdm, str, str2, zzba, i, 31);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        zzba zzba = this.zzakm;
        Long valueOf = Long.valueOf(-1);
        zzba.zzdw = valueOf;
        this.zzakm.zzdx = valueOf;
        if (this.zzakp == null) {
            this.zzakp = (List) this.zzaku.invoke(null, new Object[]{this.zzagq.getContext()});
        }
        List list = this.zzakp;
        if (list != null && list.size() == 2) {
            synchronized (this.zzakm) {
                this.zzakm.zzdw = Long.valueOf(((Long) this.zzakp.get(0)).longValue());
                this.zzakm.zzdx = Long.valueOf(((Long) this.zzakp.get(1)).longValue());
            }
        }
    }
}
