package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.zzj;
import com.google.android.gms.internal.zzbih;
import defpackage.jh;

public final class zzu {
    private static final jh<String, String> zzgfv = new jh();

    private static String zzcn(Context context) {
        String packageName = context.getPackageName();
        try {
            context = zzbih.zzdd(context).zzhc(packageName).toString();
            return context;
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zzco(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    public static String zzf(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        String str2 = "GoogleApiAvailability";
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e(str2, "An invalid account was specified when connecting. Please provide a valid account.");
                return zzs(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e(str2, "Network error occurred. Please retry request later.");
                return zzs(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e(str2, "The specified account could not be signed in.");
                return zzs(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e(str2, "The current user profile is restricted and could not use authenticated features.");
                return zzs(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Unexpected error code ");
                stringBuilder.append(i);
                str = stringBuilder.toString();
                break;
        }
        Log.e(str2, str);
        return null;
    }

    public static String zzg(Context context, int i) {
        String zzs = i == 6 ? zzs(context, "common_google_play_services_resolution_required_title") : zzf(context, i);
        return zzs == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : zzs;
    }

    public static String zzh(Context context, int i) {
        Resources resources = context.getResources();
        String zzcn = zzcn(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{zzcn});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{zzcn});
            } else if (i == 5) {
                return zzl(context, "common_google_play_services_invalid_account_text", zzcn);
            } else {
                if (i == 7) {
                    return zzl(context, "common_google_play_services_network_error_text", zzcn);
                }
                if (i == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{zzcn});
                } else if (i == 20) {
                    return zzl(context, "common_google_play_services_restricted_profile_text", zzcn);
                } else {
                    switch (i) {
                        case 16:
                            return zzl(context, "common_google_play_services_api_unavailable_text", zzcn);
                        case 17:
                            return zzl(context, "common_google_play_services_sign_in_failed_text", zzcn);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{zzcn});
                        default:
                            return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{zzcn});
                    }
                }
            }
        } else if (zzj.zzcv(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{zzcn});
        }
    }

    public static String zzi(Context context, int i) {
        if (i != 6) {
            return zzh(context, i);
        }
        return zzl(context, "common_google_play_services_resolution_required_text", zzcn(context));
    }

    public static String zzj(Context context, int i) {
        Resources resources = context.getResources();
        i = i != 1 ? i != 2 ? i != 3 ? 17039370 : R.string.common_google_play_services_enable_button : R.string.common_google_play_services_update_button : R.string.common_google_play_services_install_button;
        return resources.getString(i);
    }

    private static String zzl(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zzs = zzs(context, str);
        if (zzs == null) {
            zzs = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zzs, new Object[]{str2});
    }

    private static String zzs(Context context, String str) {
        synchronized (zzgfv) {
            String str2 = (String) zzgfv.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            String str3;
            String str4;
            if (identifier == 0) {
                str3 = "GoogleApiAvailability";
                str4 = "Missing resource: ";
                str = String.valueOf(str);
                Log.w(str3, str.length() != 0 ? str4.concat(str) : new String(str4));
                return null;
            }
            str3 = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(str3)) {
                str3 = "GoogleApiAvailability";
                str4 = "Got empty resource: ";
                str = String.valueOf(str);
                Log.w(str3, str.length() != 0 ? str4.concat(str) : new String(str4));
                return null;
            }
            zzgfv.put(str, str3);
            return str3;
        }
    }
}
