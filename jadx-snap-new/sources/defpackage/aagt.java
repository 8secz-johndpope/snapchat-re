package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagt */
public final class aagt extends aagr {
    public Long a;
    public Long b;
    public String c;

    private aagt c() {
        aagt aagt = (aagt) super.clone();
        Long l = this.a;
        if (l != null) {
            aagt.a = l;
        }
        l = this.b;
        if (l != null) {
            aagt.b = l;
        }
        String str = this.c;
        if (str != null) {
            aagt.c = str;
        }
        return aagt;
    }

    public final /* synthetic */ aagr a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("tile_row", l);
        }
        l = this.b;
        if (l != null) {
            hashMap.put("tile_column", l);
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("tile_product_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ aaga b() {
        return c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aagt) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_STORE_PRODUCT_TILE_TAP_EVENT";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Long l = this.a;
        int i = 0;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
