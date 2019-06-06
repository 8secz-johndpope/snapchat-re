package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aair */
public final class aair extends aaiq {
    private String a;
    private String b;
    private aapp c;
    private String d;
    private Long e;
    private String f;
    private String g;
    private Long h;
    private Double i;
    private String j;

    private aair E() {
        aair aair = (aair) super.clone();
        String str = this.a;
        if (str != null) {
            aair.a = str;
        }
        str = this.b;
        if (str != null) {
            aair.b = str;
        }
        aapp aapp = this.c;
        if (aapp != null) {
            aair.c = aapp;
        }
        str = this.d;
        if (str != null) {
            aair.d = str;
        }
        Long l = this.e;
        if (l != null) {
            aair.e = l;
        }
        str = this.f;
        if (str != null) {
            aair.f = str;
        }
        str = this.g;
        if (str != null) {
            aair.g = str;
        }
        l = this.h;
        if (l != null) {
            aair.h = l;
        }
        Double d = this.i;
        if (d != null) {
            aair.i = d;
        }
        str = this.j;
        if (str != null) {
            aair.j = str;
        }
        return aair;
    }

    public final /* synthetic */ aaiq a() {
        return E();
    }

    public final void a(Double d) {
        this.i = d;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("filter_lens_id", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("lens_option_id", str);
        }
        aapp aapp = this.c;
        if (aapp != null) {
            hashMap.put("lens_source", aapp.toString());
        }
        str = this.d;
        if (str != null) {
            hashMap.put("snap_session_id", str);
        }
        Long l = this.e;
        if (l != null) {
            hashMap.put("device_score", l);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("save_session_id", str);
        }
        str = this.g;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("size_byte", l);
        }
        Double d = this.i;
        if (d != null) {
            hashMap.put("snap_time_sec", d);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aair) obj).asDictionary());
    }

    public final String getEventName() {
        return "DIRECT_SNAP_SAVE_LOSS";
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
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aapp aapp = this.c;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.j;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
