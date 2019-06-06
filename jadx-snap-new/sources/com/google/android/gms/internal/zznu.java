package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.zzbq;
import defpackage.iep;

@zzabh
public final class zznu {
    private final Context mContext;

    public zznu(Context context) {
        zzbq.checkNotNull(context, "Context can not be null");
        this.mContext = context;
    }

    private final boolean zza(Intent intent) {
        zzbq.checkNotNull(intent, "Intent can not be null");
        return !this.mContext.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean zzja() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(iep.a));
        return zza(intent);
    }

    public final boolean zzjb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return zza(intent);
    }

    public final boolean zzjc() {
        return ((Boolean) zzakg.zza(this.mContext, new zznv())).booleanValue() && zzbih.zzdd(this.mContext).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    public final boolean zzjd() {
        return zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
