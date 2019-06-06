package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzahw;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzoi;
import net.sqlcipher.database.SQLiteDatabase;

@zzabh
public final class zza {
    private static boolean zza(Context context, Intent intent, zzt zzt) {
        try {
            String str = "Launching an intent: ";
            String valueOf = String.valueOf(intent.toURI());
            zzahw.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            zzbt.zzel();
            zzaij.zza(context, intent);
            if (zzt != null) {
                zzt.zzbr();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zzaky.zzcz(e.getMessage());
            return false;
        }
    }

    public static boolean zza(Context context, zzc zzc, zzt zzt) {
        String str;
        int i = false;
        if (zzc == null) {
            str = "No intent data for launcher overlay.";
        } else {
            zzoi.initialize(context);
            if (zzc.intent != null) {
                return zza(context, zzc.intent, zzt);
            }
            Intent intent = new Intent();
            if (TextUtils.isEmpty(zzc.url)) {
                str = "Open GMSG did not contain a URL.";
            } else {
                String valueOf;
                if (TextUtils.isEmpty(zzc.mimeType)) {
                    intent.setData(Uri.parse(zzc.url));
                } else {
                    intent.setDataAndType(Uri.parse(zzc.url), zzc.mimeType);
                }
                intent.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(zzc.packageName)) {
                    intent.setPackage(zzc.packageName);
                }
                if (!TextUtils.isEmpty(zzc.zzcmh)) {
                    String[] split = zzc.zzcmh.split("/", 2);
                    if (split.length < 2) {
                        str = "Could not parse component name from open GMSG: ";
                        valueOf = String.valueOf(zzc.zzcmh);
                        zzaky.zzcz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        return false;
                    }
                    intent.setClassName(split[0], split[1]);
                }
                valueOf = zzc.zzcmi;
                if (!TextUtils.isEmpty(valueOf)) {
                    try {
                        i = Integer.parseInt(valueOf);
                    } catch (NumberFormatException unused) {
                        zzaky.zzcz("Could not parse intent flags.");
                    }
                    intent.addFlags(i);
                }
                if (((Boolean) zzlc.zzio().zzd(zzoi.zzbuq)).booleanValue()) {
                    intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                    intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) zzlc.zzio().zzd(zzoi.zzbup)).booleanValue()) {
                        zzbt.zzel();
                        zzaij.zzb(context, intent);
                    }
                }
                return zza(context, intent, zzt);
            }
        }
        zzaky.zzcz(str);
        return false;
    }
}
