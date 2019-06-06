package defpackage;

import com.snap.core.db.record.UploadedMediaModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abbm */
public final class abbm extends abbp {
    private Long I;
    private Long J;
    private Long K;
    private Long L;
    private Long M;
    private Long N;
    public String a;
    public String b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public Long l;
    public abbg m;
    public Boolean n;
    public abbu o;
    public Double p;
    public Boolean q;
    public Long r;

    private abbm d() {
        abbm abbm = (abbm) super.clone();
        String str = this.a;
        if (str != null) {
            abbm.a = str;
        }
        str = this.b;
        if (str != null) {
            abbm.b = str;
        }
        Long l = this.I;
        if (l != null) {
            abbm.I = l;
        }
        l = this.c;
        if (l != null) {
            abbm.c = l;
        }
        l = this.d;
        if (l != null) {
            abbm.d = l;
        }
        l = this.J;
        if (l != null) {
            abbm.J = l;
        }
        l = this.K;
        if (l != null) {
            abbm.K = l;
        }
        l = this.e;
        if (l != null) {
            abbm.e = l;
        }
        l = this.f;
        if (l != null) {
            abbm.f = l;
        }
        l = this.g;
        if (l != null) {
            abbm.g = l;
        }
        l = this.h;
        if (l != null) {
            abbm.h = l;
        }
        l = this.i;
        if (l != null) {
            abbm.i = l;
        }
        l = this.j;
        if (l != null) {
            abbm.j = l;
        }
        l = this.k;
        if (l != null) {
            abbm.k = l;
        }
        l = this.l;
        if (l != null) {
            abbm.l = l;
        }
        abbg abbg = this.m;
        if (abbg != null) {
            abbm.m = abbg;
        }
        Boolean bool = this.n;
        if (bool != null) {
            abbm.n = bool;
        }
        abbu abbu = this.o;
        if (abbu != null) {
            abbm.o = abbu;
        }
        Double d = this.p;
        if (d != null) {
            abbm.p = d;
        }
        bool = this.q;
        if (bool != null) {
            abbm.q = bool;
        }
        l = this.r;
        if (l != null) {
            abbm.r = l;
        }
        l = this.L;
        if (l != null) {
            abbm.L = l;
        }
        l = this.M;
        if (l != null) {
            abbm.M = l;
        }
        l = this.N;
        if (l != null) {
            abbm.N = l;
        }
        return abbm;
    }

    public final /* synthetic */ abbp a() {
        return d();
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put(UploadedMediaModel.CONTENT_ID, str);
        }
        str = this.b;
        if (str != null) {
            hashMap.put("multi_snap_id", str);
        }
        Long l = this.I;
        if (l != null) {
            hashMap.put("multi_snap_count", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("multi_snap_index", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("ambient_light_intensity", l);
        }
        l = this.J;
        if (l != null) {
            hashMap.put("dropped_frames_vin0", l);
        }
        l = this.K;
        if (l != null) {
            hashMap.put("dropped_frames_vin1", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("sensor_begin_temperature", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("sensor_end_temperature", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("image_sensor_current_dgc", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("image_sensor_current_agc", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("ev_index_start", l);
        }
        l = this.j;
        if (l != null) {
            hashMap.put("ev_index_end", l);
        }
        l = this.k;
        if (l != null) {
            hashMap.put("nordic_last_boot_session", l);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("time_of_capture", l);
        }
        abbg abbg = this.m;
        if (abbg != null) {
            hashMap.put("button_press_type", abbg.toString());
        }
        Boolean bool = this.n;
        if (bool != null) {
            hashMap.put("ble_connected", bool);
        }
        abbu abbu = this.o;
        if (abbu != null) {
            hashMap.put("file_type", abbu.toString());
        }
        Double d = this.p;
        if (d != null) {
            hashMap.put("snap_time_sec", d);
        }
        bool = this.q;
        if (bool != null) {
            hashMap.put("hevc_mode", bool);
        }
        l = this.r;
        if (l != null) {
            hashMap.put("utc_offset_seconds", l);
        }
        l = this.L;
        if (l != null) {
            hashMap.put("gps_fix_duration", l);
        }
        l = this.M;
        if (l != null) {
            hashMap.put("gps_fix_utc", l);
        }
        l = this.N;
        if (l != null) {
            hashMap.put("gps_fix_radius", l);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final /* synthetic */ abea b() {
        return d();
    }

    public final /* synthetic */ abeb c() {
        return d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abbm) obj).asDictionary());
    }

    public final String getEventName() {
        return "SPECTACLES_CONTENT_CAPTURE";
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
        Long l = this.I;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.J;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.K;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        abbg abbg = this.m;
        hashCode = (hashCode + (abbg != null ? abbg.hashCode() : 0)) * 31;
        Boolean bool = this.n;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        abbu abbu = this.o;
        hashCode = (hashCode + (abbu != null ? abbu.hashCode() : 0)) * 31;
        Double d = this.p;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        bool = this.q;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        l = this.r;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.L;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.M;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.N;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
