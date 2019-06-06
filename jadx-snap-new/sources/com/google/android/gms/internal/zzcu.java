package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzcu extends zzct {
    private zzcu(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzcu zza(String str, Context context, boolean z) {
        zzct.zza(context, z);
        return new zzcu(context, str, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final List<Callable<Void>> zza(zzdm zzdm, zzba zzba, zzax zzax) {
        if (zzdm.getExecutorService() == null || !this.zzahq) {
            return super.zza(zzdm, zzba, zzax);
        }
        int zzab = zzdm.zzab();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zza(zzdm, zzba, zzax));
        arrayList.add(new zzee(zzdm, "b0nS9elqzY5/VJmQt0NlC62dB7yCaB6LeKUB+YXUuuDDycP369v3LvQySmqqDQ6y", "vfxPDbj+Gh4UJloJgP7FDEw0pUJBChFkLoiSG9W3S+I=", zzba, zzab, 24));
        return arrayList;
    }
}
