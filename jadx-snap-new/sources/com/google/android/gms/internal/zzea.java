package com.google.android.gms.internal;

import java.lang.reflect.Method;

public final class zzea extends zzeu {
    private static final Object zzakj = new Object();
    private static volatile zzbw zzakk;
    private zzax zzakl = null;

    public zzea(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2, zzax zzax) {
        super(zzdm, str, str2, zzba, i, 27);
        this.zzakl = zzax;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        boolean z = false;
        Object obj = (zzakk == null || zzds.zzo(zzakk.zzcv) || zzakk.zzcv.equals("E") || zzakk.zzcv.equals("0000000000000000000000000000000000000000000000000000000000000000")) ? 1 : null;
        if (obj != null) {
            synchronized (zzakj) {
                int i;
                if (zzds.zzo(null)) {
                    zzds.zzo(null);
                    i = 2;
                } else {
                    i = 4;
                }
                Method method = this.zzaku;
                Object[] objArr = new Object[3];
                objArr[0] = this.zzagq.getContext();
                if (i == 2) {
                    z = true;
                }
                objArr[1] = Boolean.valueOf(z);
                objArr[2] = zzlc.zzio().zzd(zzoi.zzbrn);
                zzbw zzbw = new zzbw((String) method.invoke(null, objArr));
                zzakk = zzbw;
                if (zzds.zzo(zzbw.zzcv) || zzakk.zzcv.equals("E")) {
                    if (i == 3 || i == 4) {
                        zzakk.zzcv = null.zzcv;
                    }
                }
            }
        }
        synchronized (this.zzakm) {
            if (zzakk != null) {
                this.zzakm.zzcv = zzakk.zzcv;
                this.zzakm.zzdz = Long.valueOf(zzakk.zzyv);
                this.zzakm.zzcx = zzakk.zzcx;
                this.zzakm.zzcy = zzakk.zzcy;
                this.zzakm.zzcz = zzakk.zzcz;
            }
        }
    }
}
