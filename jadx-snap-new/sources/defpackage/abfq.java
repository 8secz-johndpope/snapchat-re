package defpackage;

import com.snap.core.db.record.UploadedMediaModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abfq */
public final class abfq extends abhw {
    private Boolean a;
    private abfo b;
    private Double c;
    private aasc d;
    private aasc e;
    private Long f;
    private Double g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private String n;
    private Boolean o;
    private String p;

    private abfq a() {
        abfq abfq = (abfq) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            abfq.a = bool;
        }
        abfo abfo = this.b;
        if (abfo != null) {
            abfq.b = abfo;
        }
        Double d = this.c;
        if (d != null) {
            abfq.c = d;
        }
        aasc aasc = this.d;
        if (aasc != null) {
            abfq.d = aasc;
        }
        aasc = this.e;
        if (aasc != null) {
            abfq.e = aasc;
        }
        Long l = this.f;
        if (l != null) {
            abfq.f = l;
        }
        d = this.g;
        if (d != null) {
            abfq.g = d;
        }
        bool = this.h;
        if (bool != null) {
            abfq.h = bool;
        }
        bool = this.i;
        if (bool != null) {
            abfq.i = bool;
        }
        bool = this.j;
        if (bool != null) {
            abfq.j = bool;
        }
        bool = this.k;
        if (bool != null) {
            abfq.k = bool;
        }
        bool = this.l;
        if (bool != null) {
            abfq.l = bool;
        }
        bool = this.m;
        if (bool != null) {
            abfq.m = bool;
        }
        String str = this.n;
        if (str != null) {
            abfq.n = str;
        }
        bool = this.o;
        if (bool != null) {
            abfq.o = bool;
        }
        str = this.p;
        if (str != null) {
            abfq.p = str;
        }
        return abfq;
    }

    public final void a(aasc aasc) {
        this.d = aasc;
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(Double d) {
        this.c = d;
    }

    public final void a(String str) {
        this.n = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("with_success", bool);
        }
        abfo abfo = this.b;
        if (abfo != null) {
            hashMap.put("context", abfo.toString());
        }
        Double d = this.c;
        if (d != null) {
            hashMap.put("total_latency_secs", d);
        }
        aasc aasc = this.d;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        aasc = this.e;
        if (aasc != null) {
            hashMap.put("original_media_type", aasc.toString());
        }
        Long l = this.f;
        if (l != null) {
            hashMap.put(UploadedMediaModel.UPLOAD_SIZE, l);
        }
        d = this.g;
        if (d != null) {
            hashMap.put("media_duration_secs", d);
        }
        bool = this.h;
        if (bool != null) {
            hashMap.put("with_multi_snap", bool);
        }
        bool = this.i;
        if (bool != null) {
            hashMap.put("with_direct_snap_send", bool);
        }
        bool = this.j;
        if (bool != null) {
            hashMap.put("with_animated", bool);
        }
        bool = this.k;
        if (bool != null) {
            hashMap.put("with_media_upload", bool);
        }
        bool = this.l;
        if (bool != null) {
            hashMap.put("with_direct_upload_url", bool);
        }
        bool = this.m;
        if (bool != null) {
            hashMap.put("with_overlay", bool);
        }
        String str = this.n;
        if (str != null) {
            hashMap.put("story_snap_id", str);
        }
        bool = this.o;
        if (bool != null) {
            hashMap.put("with_auto_retry", bool);
        }
        str = this.p;
        if (str != null) {
            hashMap.put("capture_session_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(aasc aasc) {
        this.e = aasc;
    }

    public final void b(Boolean bool) {
        this.h = bool;
    }

    public final void b(Double d) {
        this.g = d;
    }

    public final void c(Boolean bool) {
        this.i = bool;
    }

    public final void d(Boolean bool) {
        this.j = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abfq) obj).asDictionary());
    }

    public final String getEventName() {
        return "STORY_SNAP_POST_LATENCY";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 0.1d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abfo abfo = this.b;
        hashCode = (hashCode + (abfo != null ? abfo.hashCode() : 0)) * 31;
        Double d = this.c;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        aasc aasc = this.d;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        aasc = this.e;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        d = this.g;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.h;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.i;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.j;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.k;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.n;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.o;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.p;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
