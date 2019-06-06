package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abcr */
public final class abcr extends abeb {
    private abcs a;
    private Long b;
    private Long c;
    private Long d;
    private Long e;
    private Long f;
    private Long g;
    private Long h;
    private Long i;
    private abbv j;

    private abcr a() {
        abcr abcr = (abcr) super.clone();
        abcs abcs = this.a;
        if (abcs != null) {
            abcr.a = abcs;
        }
        Long l = this.b;
        if (l != null) {
            abcr.b = l;
        }
        l = this.c;
        if (l != null) {
            abcr.c = l;
        }
        l = this.d;
        if (l != null) {
            abcr.d = l;
        }
        l = this.e;
        if (l != null) {
            abcr.e = l;
        }
        l = this.f;
        if (l != null) {
            abcr.f = l;
        }
        l = this.g;
        if (l != null) {
            abcr.g = l;
        }
        l = this.h;
        if (l != null) {
            abcr.h = l;
        }
        l = this.i;
        if (l != null) {
            abcr.i = l;
        }
        abbv abbv = this.j;
        if (abbv != null) {
            abcr.j = abbv;
        }
        return abcr;
    }

    public final void a(abbv abbv) {
        this.j = abbv;
    }

    public final void a(abcs abcs) {
        this.a = abcs;
    }

    public final void a(Long l) {
        this.b = l;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        abcs abcs = this.a;
        if (abcs != null) {
            hashMap.put("notification_type", abcs.toString());
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("amba_temperature", l);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("nordic_temperature", l);
        }
        l = this.d;
        if (l != null) {
            hashMap.put("coulomb_ctrl_temperature", l);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("image_sensor_temperature", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("wifi_temperature", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("qca_temperature", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("device_battery", l);
        }
        l = this.i;
        if (l != null) {
            hashMap.put("device_storage", l);
        }
        abbv abbv = this.j;
        if (abbv != null) {
            hashMap.put("firmware_crash_source", abbv.toString());
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Long l) {
        this.c = l;
    }

    public final /* synthetic */ abeb c() {
        return a();
    }

    public final void c(Long l) {
        this.d = l;
    }

    public final void d(Long l) {
        this.e = l;
    }

    public final void e(Long l) {
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abcr) obj).asDictionary());
    }

    public final void f(Long l) {
        this.h = l;
    }

    public final void g(Long l) {
        this.i = l;
    }

    public final String getEventName() {
        return "SPECTACLES_NRF_NOTIFICATION";
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
        abcs abcs = this.a;
        int i = 0;
        hashCode = (hashCode + (abcs != null ? abcs.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
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
        abbv abbv = this.j;
        if (abbv != null) {
            i = abbv.hashCode();
        }
        return hashCode + i;
    }
}
