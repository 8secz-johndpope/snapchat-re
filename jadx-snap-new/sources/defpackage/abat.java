package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abat */
public final class abat extends abhw {
    public String a;
    public String b;
    public Boolean c;
    private String d;
    private aave e;

    private abat a() {
        abat abat = (abat) super.clone();
        String str = this.a;
        if (str != null) {
            abat.a = str;
        }
        str = this.b;
        if (str != null) {
            abat.b = str;
        }
        Boolean bool = this.c;
        if (bool != null) {
            abat.c = bool;
        }
        str = this.d;
        if (str != null) {
            abat.d = str;
        }
        aave aave = this.e;
        if (aave != null) {
            abat.a(aave.clone());
        }
        return abat;
    }

    public final void a(aave aave) {
        if (aave == null) {
            this.e = null;
        } else {
            this.e = new aave(aave);
        }
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("cell_ids", str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("sections_available", str);
        }
        Boolean bool = this.c;
        if (bool != null) {
            hashMap.put("with_snap_send", bool);
        }
        str = this.d;
        if (str != null) {
            hashMap.put("ghost_cell_ids", str);
        }
        aave aave = this.e;
        if (aave != null) {
            hashMap.putAll(aave.a());
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
        return asDictionary().equals(((abat) obj).asDictionary());
    }

    public final String getEventName() {
        return "SNAP_SEND_TO_CELL_VIEW";
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
        Boolean bool = this.c;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aave aave = this.e;
        if (aave != null) {
            i = aave.hashCode();
        }
        return hashCode + i;
    }
}
