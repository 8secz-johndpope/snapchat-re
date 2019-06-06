package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzak;
import com.google.android.gms.common.util.zzj;
import com.google.android.gms.internal.zzbih;
import net.sqlcipher.database.SQLiteDatabase;

public class zzf {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final zzf zzfqz = new zzf();

    zzf() {
    }

    public static Intent zza(Context context, int i, String str) {
        String str2 = "com.google.android.gms";
        return (i == 1 || i == 2) ? (context == null || !zzj.zzcv(context)) ? zzak.zzt(str2, zzq(context, str)) : zzak.zzamw() : i != 3 ? null : zzak.zzgt(str2);
    }

    public static zzf zzahf() {
        return zzfqz;
    }

    public static int zzc(Context context, int i) {
        i = zzs.zzc(context, i);
        return zzs.zzd(context, i) ? 18 : i;
    }

    public static void zzcf(Context context) {
        zzs.zzcf(context);
    }

    public static int zzcg(Context context) {
        return zzs.zzcg(context);
    }

    public static boolean zzd(Context context, int i) {
        return zzs.zzd(context, i);
    }

    private static String zzq(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        String str2 = "-";
        stringBuilder.append(str2);
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append(str2);
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append(str2);
        if (context != null) {
            try {
                stringBuilder.append(zzbih.zzdd(context).getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException unused) {
            }
        }
        return stringBuilder.toString();
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return zza(context, i, i2, null);
    }

    public String getErrorString(int i) {
        return zzs.getErrorString(i);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return zzc(context, -1);
    }

    public boolean isUserResolvableError(int i) {
        return zzs.isUserRecoverableError(i);
    }

    public final PendingIntent zza(Context context, int i, int i2, String str) {
        Intent zza = zza(context, i, str);
        return zza == null ? null : PendingIntent.getActivity(context, i2, zza, SQLiteDatabase.CREATE_IF_NECESSARY);
    }

    @Deprecated
    public final Intent zzbo(int i) {
        return zza(null, i, null);
    }
}
