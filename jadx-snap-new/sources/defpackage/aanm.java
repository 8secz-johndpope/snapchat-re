package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aanm */
public final class aanm extends aadg {
    private String a;
    private String b;

    private aanm b() {
        aanm aanm = (aanm) super.clone();
        String str = this.a;
        if (str != null) {
            aanm.a = str;
        }
        str = this.b;
        if (str != null) {
            aanm.b = str;
        }
        return aanm;
    }

    public final /* synthetic */ aadg a() {
        return b();
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("sticker_geo_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("category_geo", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aanm) obj).asDictionary());
    }

    public final void g(String str) {
        this.b = str;
    }

    public final String getEventName() {
        return "GEOFILTER_CHAT_CHAT_SEND";
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
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
