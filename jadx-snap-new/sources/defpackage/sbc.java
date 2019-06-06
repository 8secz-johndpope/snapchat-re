package defpackage;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.net.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: sbc */
public final class sbc {
    public static MediaType a(Map<String, List<String>> map) {
        String c = sbc.c(map, "Content-Type");
        if (c == null) {
            return null;
        }
        try {
            return MediaType.parse(c);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String a(MediaType mediaType) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mediaType.type());
        stringBuilder.append('/');
        stringBuilder.append(mediaType.subtype());
        return stringBuilder.toString();
    }

    private static String a(List<String> list) {
        return Joiner.on(ppy.b).join((Iterable) list);
    }

    public static List<String> a(Map<String, List<String>> map, String str) {
        for (Entry entry : map.entrySet()) {
            if (((String) entry.getKey()).equalsIgnoreCase(str)) {
                return (List) entry.getValue();
            }
        }
        return null;
    }

    public static Map<String, String> a(Map<String, List<String>> map, Predicate<Entry<String, List<String>>> predicate) {
        HashMap hashMap = new HashMap();
        for (Entry entry : ((Map) Preconditions.checkNotNull(map)).entrySet()) {
            if (predicate.apply(entry)) {
                hashMap.put(entry.getKey(), sbc.a((List) entry.getValue()));
            }
        }
        return hashMap;
    }

    public static long b(Map<String, List<String>> map) {
        String c = sbc.c(map, "Content-Length");
        if (c == null) {
            return -1;
        }
        try {
            long parseLong = Long.parseLong(c);
            return parseLong < 0 ? -1 : parseLong;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String b(Map<String, String> map, String str) {
        for (Entry entry : map.entrySet()) {
            if (((String) entry.getKey()).equalsIgnoreCase(str)) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    public static String c(Map<String, String> map) {
        String str = (String) map.get("X-Snapchat-UUID");
        return str == null ? (String) map.get("x-amz-cf-id") : str;
    }

    private static String c(Map<String, List<String>> map, String str) {
        List a = sbc.a((Map) map, str);
        return a == null ? null : sbc.a(a);
    }

    public static String d(Map<String, String> map) {
        return sbc.b(map, "X-Snapchat-Server-Latency");
    }

    public static String e(Map<String, String> map) {
        String b = sbc.b(map, "x-amz-cf-id");
        if (!Strings.isNullOrEmpty(b)) {
            return b;
        }
        String format = (Strings.isNullOrEmpty(sbc.b(map, "x-amz-request-id")) && Strings.isNullOrEmpty(sbc.b(map, "x-amz-id-2"))) ? null : String.format(Locale.US, "%s@%s", new Object[]{sbc.b(map, "x-amz-request-id"), sbc.b(map, "x-amz-id-2")});
        return !Strings.isNullOrEmpty(format) ? format : null;
    }

    public static boolean f(Map<String, String> map) {
        String str = "X-Cache";
        if (sbc.b(map, str) == null) {
            return sbc.b(map, "Age") != null;
        } else {
            return "Hit from cloudfront".equals(sbc.b(map, str));
        }
    }
}
