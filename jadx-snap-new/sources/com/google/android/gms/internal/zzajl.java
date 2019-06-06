package com.google.android.gms.internal;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@zzabh
public final class zzajl extends zzaj {
    private final Context mContext;

    private zzajl(Context context, zzar zzar) {
        super(zzar);
        this.mContext = context;
    }

    public static zzv zzax(Context context) {
        zzv zzv = new zzv(new zzam(new File(context.getCacheDir(), "admob_volley")), new zzajl(context, new zzas()));
        zzv.start();
        return zzv;
    }

    public final zzp zzc(zzr<?> zzr) {
        if (zzr.zzg() && zzr.getMethod() == 0) {
            if (Pattern.matches((String) zzlc.zzio().zzd(zzoi.zzbum), zzr.getUrl())) {
                zzlc.zzij();
                if (zzako.zzbb(this.mContext)) {
                    zzp zzc = new zzte(this.mContext).zzc((zzr) zzr);
                    String str;
                    if (zzc != null) {
                        str = "Got gmscore asset response: ";
                        String valueOf = String.valueOf(zzr.getUrl());
                        zzahw.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        return zzc;
                    }
                    String str2 = "Failed to get gmscore asset response: ";
                    str = String.valueOf(zzr.getUrl());
                    zzahw.v(str.length() != 0 ? str2.concat(str) : new String(str2));
                }
            }
        }
        return super.zzc(zzr);
    }
}
