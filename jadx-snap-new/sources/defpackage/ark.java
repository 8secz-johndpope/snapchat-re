package defpackage;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: ark */
public final class ark {
    private static final Set<String> a = new HashSet(Arrays.asList(new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));

    static Double a(Object obj) {
        String valueOf = String.valueOf(obj);
        return valueOf == null ? null : Double.valueOf(valueOf);
    }

    static String a(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_event";
        }
        String str2 = "fabric_";
        if (a.contains(str)) {
            return str2.concat(String.valueOf(str));
        }
        str = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (str.startsWith("ga_") || str.startsWith("google_") || str.startsWith("firebase_") || !Character.isLetter(str.charAt(0))) {
            str = str2.concat(String.valueOf(str));
        }
        if (str.length() > 40) {
            str = str.substring(0, 40);
        }
        return str;
    }

    static void a(Bundle bundle, String str, Double d) {
        d = ark.a((Object) d);
        if (d != null) {
            bundle.putDouble(str, d.doubleValue());
        }
    }

    static void a(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    static void a(Bundle bundle, Map<String, Object> map) {
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            if (str == null || str.length() == 0) {
                str = "fabric_unnamed_parameter";
            } else {
                str = str.replaceAll("[^\\p{Alnum}_]+", "_");
                if (str.startsWith("ga_") || str.startsWith("google_") || str.startsWith("firebase_") || !Character.isLetter(str.charAt(0))) {
                    str = "fabric_".concat(String.valueOf(str));
                }
                if (str.length() > 40) {
                    str = str.substring(0, 40);
                }
            }
            if (value instanceof String) {
                bundle.putString(str, entry.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Double) entry.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Long) entry.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(str, ((Integer) entry.getValue()).intValue());
            }
        }
    }

    static Double b(Object obj) {
        Long l = (Long) obj;
        return l == null ? null : Double.valueOf(new BigDecimal(l.longValue()).divide(aqt.a).doubleValue());
    }
}
