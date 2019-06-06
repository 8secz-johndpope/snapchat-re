package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.zzs;

public abstract class zzp<T> {
    private final String zzhcz;
    private T zzhda;

    protected zzp(String str) {
        this.zzhcz = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final T zzdg(Context context) {
        if (this.zzhda == null) {
            zzbq.checkNotNull(context);
            context = zzs.getRemoteContext(context);
            if (context != null) {
                try {
                    this.zzhda = zze((IBinder) context.getClassLoader().loadClass(this.zzhcz).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new zzq("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new zzq("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new zzq("Could not access creator.", e3);
                }
            }
            throw new zzq("Could not get remote context.");
        }
        return this.zzhda;
    }

    public abstract T zze(IBinder iBinder);
}
