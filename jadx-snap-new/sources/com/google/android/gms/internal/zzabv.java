package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@zzabh
public final class zzabv {
    private static boolean zzd(Context context, boolean z) {
        if (!z) {
            return true;
        }
        String str = ModuleDescriptor.MODULE_ID;
        int zzy = DynamiteModule.zzy(context, str);
        return zzy != 0 && zzy <= DynamiteModule.zzx(context, str);
    }
}
