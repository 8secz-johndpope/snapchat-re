package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaze */
public final class aaze implements Cloneable {
    public String a;

    public aaze(aaze aaze) {
        this.a = aaze.a;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("send_to_story_list", str);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final aaze clone() {
        aaze aaze = (aaze) super.clone();
        String str = this.a;
        if (str != null) {
            aaze.a = str;
        }
        return aaze;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aaze) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        return (str != null ? str.hashCode() : 0) + 381486;
    }
}
