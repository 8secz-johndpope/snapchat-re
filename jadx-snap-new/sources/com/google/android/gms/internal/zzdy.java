package com.google.android.gms.internal;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

public final class zzdy extends zzeu {
    public zzdy(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        super(zzdm, str, str2, zzba, i, 49);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        this.zzakm.zzek = Integer.valueOf(2);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzaku.invoke(null, new Object[]{this.zzagq.getContext()})).booleanValue();
            zzba zzba = this.zzakm;
            if (!booleanValue) {
                i = 0;
            }
            zzba.zzek = Integer.valueOf(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
