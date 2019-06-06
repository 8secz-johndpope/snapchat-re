package com.snap.core.db.column;

import com.google.gson.annotations.SerializedName;
import defpackage.ajzm;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class DdmlRecord {
    @SerializedName("booleanMap")
    private Map<String, Boolean> booleanMap;
    @SerializedName("doubleMap")
    private Map<String, Double> doubleMap;
    @SerializedName("stringMap")
    private Map<String, String> stringMap;

    public DdmlRecord() {
        this.doubleMap = new LinkedHashMap();
        this.booleanMap = new LinkedHashMap();
        this.stringMap = new LinkedHashMap();
    }

    public DdmlRecord(Map<String, Double> map, Map<String, Boolean> map2, Map<String, String> map3) {
        this();
        if (map != null) {
            this.doubleMap = ajzm.d(map);
        }
        if (map2 != null) {
            this.booleanMap = ajzm.d(map2);
        }
        if (map3 != null) {
            this.stringMap = ajzm.d(map3);
        }
    }

    public final Boolean getBoolean(String str) {
        akcr.b(str, "key");
        return (Boolean) this.booleanMap.get(str);
    }

    public final Map<String, Boolean> getBooleanMap() {
        return this.booleanMap;
    }

    public final Double getDouble(String str) {
        akcr.b(str, "key");
        return (Double) this.doubleMap.get(str);
    }

    public final Map<String, Double> getDoubleMap() {
        return this.doubleMap;
    }

    public final String getString(String str) {
        akcr.b(str, "key");
        return (String) this.stringMap.get(str);
    }

    public final Map<String, String> getStringMap() {
        return this.stringMap;
    }

    public final void set(String str, double d) {
        akcr.b(str, "key");
        this.doubleMap.put(str, Double.valueOf(d));
    }

    public final void set(String str, String str2) {
        akcr.b(str, "key");
        akcr.b(str2, "value");
        this.stringMap.put(str, str2);
    }

    public final void set(String str, boolean z) {
        akcr.b(str, "key");
        this.booleanMap.put(str, Boolean.valueOf(z));
    }
}
