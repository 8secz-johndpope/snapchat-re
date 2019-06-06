package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhr */
public abstract class abhr extends aajt {
    public abhr(abhr abhr) {
        super(abhr);
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public abhr clone() {
        return (abhr) super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abhr) obj).asDictionary());
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
