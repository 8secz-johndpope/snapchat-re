package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import defpackage.iha.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: dih */
public final class dih {
    private static String a = ".";

    public static long a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return Math.round(d / 1000.0d);
    }

    public static String a(String str, Map<String, String> map) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.toString();
    }

    public static String a(Map<String, ?> map) {
        try {
            if (map.isEmpty()) {
                return "{}";
            }
            StringBuilder stringBuilder = new StringBuilder(800);
            stringBuilder.append('{');
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    stringBuilder.append('\"');
                    stringBuilder.append(str);
                    stringBuilder.append("\":");
                    if (value instanceof String) {
                        stringBuilder.append(JSONObject.quote((String) value));
                    } else {
                        if (!((value instanceof Long) || (value instanceof Integer) || (value instanceof Boolean) || (value instanceof Float))) {
                            if (!(value instanceof Double)) {
                                throw new IllegalArgumentException();
                            }
                        }
                        stringBuilder.append(value);
                    }
                    stringBuilder.append(',');
                }
            }
            stringBuilder.setCharAt(stringBuilder.length() - 1, '}');
            return stringBuilder.toString();
        } catch (IllegalArgumentException unused) {
            return a.a.b(map);
        }
    }

    public static Map<String, Object> a(String str) {
        HashMap hashMap = new HashMap();
        for (Entry entry : ((JsonObject) new JsonParser().parse(str)).entrySet()) {
            Object obj;
            String str2 = (String) entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (jsonElement.isJsonNull()) {
                obj = null;
            } else if (!jsonElement.isJsonPrimitive()) {
                throw new IllegalArgumentException("Unsupported value type");
            } else if (jsonElement.getAsJsonPrimitive().isBoolean()) {
                obj = Boolean.valueOf(jsonElement.getAsBoolean());
            } else if (jsonElement.getAsJsonPrimitive().isNumber()) {
                obj = jsonElement.getAsString().contains(a) ? Double.valueOf(jsonElement.getAsDouble()) : Long.valueOf(jsonElement.getAsLong());
            } else if (jsonElement.getAsJsonPrimitive().isString()) {
                obj = jsonElement.getAsString();
            }
            hashMap.put(str2, obj);
        }
        return hashMap;
    }

    public static String b(String str) {
        return str.isEmpty() ? "gae" : str;
    }
}
