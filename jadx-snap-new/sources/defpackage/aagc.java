package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagc */
public final class aagc extends aafl {
    public aagb d;

    private aagc c() {
        aagc aagc = (aagc) super.clone();
        aagb aagb = this.d;
        if (aagb != null) {
            aagc.d = aagb;
        }
        return aagc;
    }

    public final /* synthetic */ aafl a() {
        return c();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aagb aagb = this.d;
        if (aagb != null) {
            hashMap.put("target", aagb.toString());
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
        return asDictionary().equals(((aagc) obj).asDictionary());
    }

    public final String getEventName() {
        return "COMMERCE_LINK_ACTION_EVENT";
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
        aagb aagb = this.d;
        return hashCode + (aagb != null ? aagb.hashCode() : 0);
    }
}
