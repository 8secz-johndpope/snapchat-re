package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abhw */
public abstract class abhw extends aajt {
    private String a;
    private Boolean b;
    private String c;

    public abhw(abhw abhw) {
        super(abhw);
        setUserId(abhw.a);
        setUserNotTracked(abhw.b);
        setGhost_user_id(abhw.c);
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("user_id", str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            hashMap.put("user_not_tracked", bool);
        }
        str = this.c;
        if (str != null) {
            hashMap.put("ghost_user_id", str);
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public abhw clone() {
        abhw abhw = (abhw) super.clone();
        String str = this.a;
        if (str != null) {
            abhw.setUserId(str);
        }
        Boolean bool = this.b;
        if (bool != null) {
            abhw.setUserNotTracked(bool);
        }
        str = this.c;
        if (str != null) {
            abhw.setGhost_user_id(str);
        }
        return abhw;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abhw) obj).asDictionary());
    }

    public String getGhost_user_id() {
        return this.c;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public String getUserId() {
        return this.a;
    }

    public Boolean getUserNotTracked() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public void setGhost_user_id(String str) {
        this.c = str;
    }

    public void setUserId(String str) {
        this.a = str;
    }

    public void setUserNotTracked(Boolean bool) {
        this.b = bool;
    }
}
