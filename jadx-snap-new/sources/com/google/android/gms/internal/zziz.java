package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.zzc;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@zzabh
public final class zziz {
    zzfm zzbcp;
    boolean zzbcq;

    public zziz(Context context) {
        zzoi.initialize(context);
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbvc)).booleanValue()) {
            try {
                this.zzbcp = zzfn.zzb(DynamiteModule.zza(context, DynamiteModule.zzhdi, ModuleDescriptor.MODULE_ID).zzhk("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                zzn.zzz(context);
                this.zzbcp.zza(zzn.zzz(context), "GMA_SDK");
                this.zzbcq = true;
            } catch (RemoteException | zzc | NullPointerException unused) {
                zzaky.zzby("Cannot dynamite load clearcut");
            }
        }
    }

    public zziz(Context context, String str, String str2) {
        zzoi.initialize(context);
        try {
            this.zzbcp = zzfn.zzb(DynamiteModule.zza(context, DynamiteModule.zzhdi, ModuleDescriptor.MODULE_ID).zzhk("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            zzn.zzz(context);
            this.zzbcp.zza(zzn.zzz(context), str, null);
            this.zzbcq = true;
        } catch (RemoteException | zzc | NullPointerException unused) {
            zzaky.zzby("Cannot dynamite load clearcut");
        }
    }

    public final zzjb zzd(byte[] bArr) {
        return new zzjb(this, bArr, null);
    }
}
