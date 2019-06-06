package com.brightcove.player.model;

import android.util.Log;
import com.brightcove.player.util.ErrorUtil;
import java.io.Serializable;
import java.util.Map;

public abstract class MetadataObject implements Serializable {
    public static final String TAG = "MetadataObject";
    protected Map<String, Object> a;

    public MetadataObject(Map<String, Object> map) {
        if (map != null) {
            this.a = map;
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.PROPERTIES_REQUIRED));
    }

    public static Integer getIntegerProperty(Map<String, Object> map, String str) {
        String str2 = "'";
        if (map.containsKey(str)) {
            try {
                Object obj = map.get(str);
                return obj != null ? obj instanceof Integer ? (Integer) obj : Integer.valueOf(Integer.parseInt(obj.toString())) : null;
            } catch (NumberFormatException unused) {
                String str3 = TAG;
                StringBuilder stringBuilder = new StringBuilder("Error converting value of <");
                stringBuilder.append(map.get(str));
                stringBuilder.append("> for key '");
                stringBuilder.append(str);
                stringBuilder.append(str2);
                Log.e(str3, stringBuilder.toString());
                return null;
            }
        }
        String str4 = TAG;
        StringBuilder stringBuilder2 = new StringBuilder("Could not find property with name '");
        stringBuilder2.append(str);
        stringBuilder2.append(str2);
        Log.w(str4, stringBuilder2.toString());
        return null;
    }

    public static String getStringProperty(Map<String, Object> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    public Integer getIntegerProperty(String str) {
        return getIntegerProperty(this.a, str);
    }

    public Map<String, Object> getProperties() {
        return this.a;
    }

    public String getStringProperty(String str) {
        return getStringProperty(this.a, str);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append("{properties: ");
        stringBuilder.append(this.a.size());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
