package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: sbi */
public final class sbi {
    public static String a(String str, String str2, String str3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        stringBuilder.append("->");
        stringBuilder.append(str3);
        return stringBuilder.substring(0, Math.min(stringBuilder.length(), 100));
    }

    public static String a(sak<?> sak) {
        if (sak == null) {
            return "REQ[null]";
        }
        StringBuilder stringBuilder = new StringBuilder("[name=");
        stringBuilder.append(sap.a((sak) sak));
        stringBuilder.append(",method=");
        stringBuilder.append(sak.k());
        String str = ppy.b;
        stringBuilder.append(str);
        if (sbi.a(sbi.d(sak), (sak) sak)) {
            stringBuilder.append("originalUrl=");
            stringBuilder.append(sbi.d(sak));
            stringBuilder.append(str);
        }
        stringBuilder.append("url=");
        stringBuilder.append(sak.i());
        stringBuilder.append(",contentId=");
        stringBuilder.append(sap.a((sak) sak));
        stringBuilder.append(",payload=<");
        stringBuilder.append(sbg.b(sak.n()));
        stringBuilder.append(">,streaming=");
        stringBuilder.append(sak.o());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static sak<sai> a(sak<sai> sak, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return sak;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(sak.l());
        for (Entry entry : map.entrySet()) {
            if (!treeMap.containsKey(((String) entry.getKey()).toLowerCase(Locale.US))) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        return sak.h().d(treeMap).e();
    }

    private static boolean a(String str, sak<?> sak) {
        return !sak.i().equalsIgnoreCase(str);
    }

    public static String b(sak<sai> sak) {
        URL c = sbi.c(sak);
        return c == null ? "" : c.getPath();
    }

    public static URL c(sak<?> sak) {
        try {
            return new URL(sak.i());
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private static String d(sak<?> sak) {
        Map m = sak.m();
        if (m != null) {
            Object obj = m.get("original_url");
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return "";
    }
}
