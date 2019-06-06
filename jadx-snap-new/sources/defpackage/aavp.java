package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aavp */
public final class aavp extends aaxl {
    private aaua a;
    private aaua b;
    private String c;

    private aavp b() {
        aavp aavp = (aavp) super.clone();
        aaua aaua = this.a;
        if (aaua != null) {
            aavp.a = aaua;
        }
        aaua = this.b;
        if (aaua != null) {
            aavp.b = aaua;
        }
        String str = this.c;
        if (str != null) {
            aavp.c = str;
        }
        return aavp;
    }

    public final /* synthetic */ aaxl a() {
        return b();
    }

    public final void a(aaua aaua) {
        this.a = aaua;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaua aaua = this.a;
        if (aaua != null) {
            hashMap.put("page", aaua.toString());
        }
        aaua = this.b;
        if (aaua != null) {
            hashMap.put("page_from", aaua.toString());
        }
        String str = this.c;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(aaua aaua) {
        this.b = aaua;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aavp) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_PAGE_VIEW";
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
        aaua aaua = this.a;
        int i = 0;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        aaua = this.b;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
