package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abeg */
public final class abeg extends abei {
    public abee a;

    private abeg e() {
        abeg abeg = (abeg) super.clone();
        abee abee = this.a;
        if (abee != null) {
            abeg.a = abee;
        }
        return abeg;
    }

    public final /* synthetic */ abbp a() {
        return e();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abee abee = this.a;
        if (abee != null) {
            hashMap.put("transfer_interrupt_type", abee.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abea b() {
        return e();
    }

    public final /* synthetic */ abeb c() {
        return e();
    }

    public final /* synthetic */ abei d() {
        return e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abeg) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_TRANSFER_SESSION_INTERRUPT";
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
        abee abee = this.a;
        return hashCode + (abee != null ? abee.hashCode() : 0);
    }
}
