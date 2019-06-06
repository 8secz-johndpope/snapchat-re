package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aazw */
public final class aazw extends abhw {
    public String a;
    public Boolean b;
    private aazs c;

    private aazw a() {
        aazw aazw = (aazw) super.clone();
        String str = this.a;
        if (str != null) {
            aazw.a = str;
        }
        Boolean bool = this.b;
        if (bool != null) {
            aazw.b = bool;
        }
        aazs aazs = this.c;
        if (aazs != null) {
            aazw.a(aazs.clone());
        }
        return aazw;
    }

    public final void a(aazs aazs) {
        if (aazs == null) {
            this.c = null;
        } else {
            this.c = new aazs(aazs);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("from_feature", str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("with_video", bool);
        }
        aazs aazs = this.c;
        if (aazs != null) {
            hashMap.putAll(aazs.a());
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
        return asDictionary().equals(((aazw) obj).asDictionary());
    }

    public final String getEventName() {
        return "SHAKE_REPORT_CREATE";
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
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aazs aazs = this.c;
        if (aazs != null) {
            i = aazs.hashCode();
        }
        return hashCode + i;
    }
}
