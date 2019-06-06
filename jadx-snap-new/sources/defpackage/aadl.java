package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aadl */
public final class aadl extends abhw {
    private String a;
    private Long b;
    private aado c;

    private aadl a() {
        aadl aadl = (aadl) super.clone();
        String str = this.a;
        if (str != null) {
            aadl.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aadl.b = l;
        }
        aado aado = this.c;
        if (aado != null) {
            aadl.c = aado;
        }
        return aadl;
    }

    public final void a(aado aado) {
        this.c = aado;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("mischief_id", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("recipient_count", l);
        }
        aado aado = this.c;
        if (aado != null) {
            hashMap.put("chat_source", aado.toString());
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
        return asDictionary().equals(((aadl) obj).asDictionary());
    }

    public final String getEventName() {
        return "CHAT_MISCHIEF_CREATE";
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
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aado aado = this.c;
        if (aado != null) {
            i = aado.hashCode();
        }
        return hashCode + i;
    }
}
