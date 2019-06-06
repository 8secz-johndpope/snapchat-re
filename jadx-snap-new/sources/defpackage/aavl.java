package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavl */
public final class aavl extends aaxl {
    private aavm a;
    private aaua b;
    private String c;

    private aavl b() {
        aavl aavl = (aavl) super.clone();
        aavm aavm = this.a;
        if (aavm != null) {
            aavl.a = aavm;
        }
        aaua aaua = this.b;
        if (aaua != null) {
            aavl.b = aaua;
        }
        String str = this.c;
        if (str != null) {
            aavl.c = str;
        }
        return aavl;
    }

    public final /* synthetic */ aaxl a() {
        return b();
    }

    public final void a(aaua aaua) {
        this.b = aaua;
    }

    public final void a(aavm aavm) {
        this.a = aavm;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aavm aavm = this.a;
        if (aavm != null) {
            hashMap.put("event", aavm.toString());
        }
        aaua aaua = this.b;
        if (aaua != null) {
            hashMap.put("page", aaua.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("long_client_id", str);
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
        return asDictionary().equals(((aavl) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_FLOW_EVENT";
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
        aavm aavm = this.a;
        int i = 0;
        hashCode = (hashCode + (aavm != null ? aavm.hashCode() : 0)) * 31;
        aaua aaua = this.b;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
