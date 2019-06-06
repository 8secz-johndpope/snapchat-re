package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aars */
public final class aars implements Cloneable {
    private String a;
    private aarr b;
    private Long c;
    private Double d;
    private Long e;
    private Long f;
    private Long g;
    private Long h;
    private aatq i;
    private aaxu j;

    public aars(aars aars) {
        this.a = aars.a;
        this.b = aars.b;
        this.c = aars.c;
        this.d = aars.d;
        this.e = aars.e;
        this.f = aars.f;
        this.g = aars.g;
        this.h = aars.h;
        this.i = aars.i;
        a(aars.j);
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("media_format", str);
        }
        aarr aarr = this.b;
        if (aarr != null) {
            hashMap.put("data_format", aarr.toString());
        }
        Long l = this.c;
        if (l != null) {
            hashMap.put("file_size", l);
        }
        Double d = this.d;
        if (d != null) {
            hashMap.put("video_frame_rate", d);
        }
        l = this.e;
        if (l != null) {
            hashMap.put("gop_size", l);
        }
        l = this.f;
        if (l != null) {
            hashMap.put("video_duration_ms", l);
        }
        l = this.g;
        if (l != null) {
            hashMap.put("video_bitrate", l);
        }
        l = this.h;
        if (l != null) {
            hashMap.put("audio_bitrate", l);
        }
        aatq aatq = this.i;
        if (aatq != null) {
            hashMap.put("orientation", aatq.toString());
        }
        aaxu aaxu = this.j;
        if (aaxu != null) {
            hashMap.putAll(aaxu.a());
        }
        return hashMap;
    }

    public final void a(aatq aatq) {
        this.i = aatq;
    }

    public final void a(aaxu aaxu) {
        if (aaxu == null) {
            this.j = null;
        } else {
            this.j = new aaxu(aaxu);
        }
    }

    public final void a(Double d) {
        this.d = d;
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final void a(String str) {
        this.a = str;
    }

    /* renamed from: b */
    public final aars clone() {
        aars aars = (aars) super.clone();
        String str = this.a;
        if (str != null) {
            aars.a = str;
        }
        aarr aarr = this.b;
        if (aarr != null) {
            aars.b = aarr;
        }
        Long l = this.c;
        if (l != null) {
            aars.c = l;
        }
        Double d = this.d;
        if (d != null) {
            aars.d = d;
        }
        l = this.e;
        if (l != null) {
            aars.e = l;
        }
        l = this.f;
        if (l != null) {
            aars.f = l;
        }
        l = this.g;
        if (l != null) {
            aars.g = l;
        }
        l = this.h;
        if (l != null) {
            aars.h = l;
        }
        aatq aatq = this.i;
        if (aatq != null) {
            aars.i = aatq;
        }
        aaxu aaxu = this.j;
        if (aaxu != null) {
            aars.a(aaxu.clone());
        }
        return aars;
    }

    public final void b(Long l) {
        this.f = l;
    }

    public final void c(Long l) {
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a().equals(((aars) obj).a());
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        aarr aarr = this.b;
        hashCode = (hashCode + (aarr != null ? aarr.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aatq aatq = this.i;
        hashCode = (hashCode + (aatq != null ? aatq.hashCode() : 0)) * 31;
        aaxu aaxu = this.j;
        if (aaxu != null) {
            i = aaxu.hashCode();
        }
        return hashCode + i;
    }
}
