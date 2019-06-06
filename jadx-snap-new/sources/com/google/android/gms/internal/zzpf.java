package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import defpackage.cb;
import defpackage.cd;
import defpackage.ce;
import java.util.List;
import org.opencv.imgproc.Imgproc;

@zzabh
public final class zzpf implements zzfxf {
    private ce zzbxb;
    private cb zzbxc;
    private cd zzbxd;
    private zzpg zzbxe;

    public static boolean zzh(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, Imgproc.FLOODFILL_FIXED_RANGE);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzfxd.zzfk(context));
                }
            }
        }
        return false;
    }

    public final boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        cb cbVar = this.zzbxc;
        if (cbVar == null) {
            return false;
        }
        if (cbVar == null) {
            this.zzbxb = null;
        } else if (this.zzbxb == null) {
            this.zzbxb = cbVar.a(null);
        }
        ce ceVar = this.zzbxb;
        return ceVar == null ? false : ceVar.a(uri);
    }

    public final void zza(cb cbVar) {
        this.zzbxc = cbVar;
        this.zzbxc.a();
        zzpg zzpg = this.zzbxe;
        if (zzpg != null) {
            zzpg.zzju();
        }
    }

    public final void zza(zzpg zzpg) {
        this.zzbxe = zzpg;
    }

    public final void zzc(Activity activity) {
        cd cdVar = this.zzbxd;
        if (cdVar != null) {
            activity.unbindService(cdVar);
            this.zzbxc = null;
            this.zzbxb = null;
            this.zzbxd = null;
        }
    }

    public final void zzd(Activity activity) {
        if (this.zzbxc == null) {
            String zzfk = zzfxd.zzfk(activity);
            if (zzfk != null) {
                this.zzbxd = new zzfxe(this);
                cb.a(activity, zzfk, this.zzbxd);
            }
        }
    }

    public final void zzjt() {
        this.zzbxc = null;
        this.zzbxb = null;
        zzpg zzpg = this.zzbxe;
        if (zzpg != null) {
            zzpg.zzjv();
        }
    }
}
