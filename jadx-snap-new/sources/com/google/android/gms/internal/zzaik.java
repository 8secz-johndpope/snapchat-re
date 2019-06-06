package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

final class zzaik implements zzpg {
    private /* synthetic */ Context val$context;
    private /* synthetic */ List zzdft;
    private /* synthetic */ zzpf zzdfu;

    zzaik(zzaij zzaij, List list, zzpf zzpf, Context context) {
        this.zzdft = list;
        this.zzdfu = zzpf;
        this.val$context = context;
    }

    public final void zzju() {
        for (String str : this.zzdft) {
            String str2 = "Pinging url: ";
            String valueOf = String.valueOf(str);
            zzaky.zzcy(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.zzdfu.mayLaunchUrl(Uri.parse(str), null, null);
        }
        this.zzdfu.zzc((Activity) this.val$context);
    }

    public final void zzjv() {
    }
}
