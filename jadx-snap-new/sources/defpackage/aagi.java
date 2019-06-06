package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aagi */
public abstract class aagi extends aaga {
    public aagf b;

    /* renamed from: a */
    public aagi clone() {
        aagi aagi = (aagi) super.clone();
        aagf aagf = this.b;
        if (aagf != null) {
            aagi.b = aagf;
        }
        return aagi;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aagf aagf = this.b;
        if (aagf != null) {
            hashMap.put("current_page", aagf.toString());
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aagi) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        aagf aagf = this.b;
        return hashCode + (aagf != null ? aagf.hashCode() : 0);
    }
}
