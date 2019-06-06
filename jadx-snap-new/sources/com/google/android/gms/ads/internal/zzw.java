package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzacl;
import com.google.android.gms.internal.zzagq;
import com.google.android.gms.internal.zzaij;

@zzabh
public final class zzw {
    private final Context mContext;
    private boolean zzaoo;
    private zzagq zzaop;
    private zzacl zzaoq;

    public zzw(Context context, zzagq zzagq, zzacl zzacl) {
        this.mContext = context;
        this.zzaop = zzagq;
        this.zzaoq = zzacl;
        if (this.zzaoq == null) {
            this.zzaoq = new zzacl();
        }
    }

    private final boolean zzcy() {
        zzagq zzagq = this.zzaop;
        return (zzagq != null && zzagq.zzpe().zzdbs) || this.zzaoq.zzcun;
    }

    public final void recordClick() {
        this.zzaoo = true;
    }

    public final boolean zzcz() {
        return !zzcy() || this.zzaoo;
    }

    public final void zzt(String str) {
        if (zzcy()) {
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            zzagq zzagq = this.zzaop;
            if (zzagq != null) {
                zzagq.zza(str, null, 3);
                return;
            }
            if (this.zzaoq.zzcun && this.zzaoq.zzcuo != null) {
                for (String str3 : this.zzaoq.zzcuo) {
                    String str32;
                    if (!TextUtils.isEmpty(str32)) {
                        str32 = str32.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzbt.zzel();
                        zzaij.zze(this.mContext, str2, str32);
                    }
                }
            }
        }
    }
}
