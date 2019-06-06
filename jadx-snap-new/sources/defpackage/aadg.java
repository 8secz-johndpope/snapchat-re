package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aadg */
public abstract class aadg extends abhw {
    private Boolean A;
    private String B;
    private aadk C;
    private String D;
    private abhv E;
    private String a;
    private Long b;
    private aasc c;
    private abbd d;
    private String e;
    private String f;
    private aasd g;
    private aajo h;
    private aadp i;
    private String j;
    private String k;
    private Long l;
    private Double m;
    private Long n;
    private String o;
    private Long p;
    private String q;
    private String r;
    private String s;
    private String t;
    private Long u;
    private Long v;
    private aado w;
    private abfx x;
    private abfy y;
    private aarq z;

    /* renamed from: a */
    public aadg clone() {
        aadg aadg = (aadg) super.clone();
        String str = this.a;
        if (str != null) {
            aadg.a = str;
        }
        Long l = this.b;
        if (l != null) {
            aadg.b = l;
        }
        aasc aasc = this.c;
        if (aasc != null) {
            aadg.c = aasc;
        }
        abbd abbd = this.d;
        if (abbd != null) {
            aadg.d = abbd;
        }
        str = this.e;
        if (str != null) {
            aadg.e = str;
        }
        str = this.f;
        if (str != null) {
            aadg.f = str;
        }
        aasd aasd = this.g;
        if (aasd != null) {
            aadg.g = aasd;
        }
        aajo aajo = this.h;
        if (aajo != null) {
            aadg.h = aajo;
        }
        aadp aadp = this.i;
        if (aadp != null) {
            aadg.i = aadp;
        }
        str = this.j;
        if (str != null) {
            aadg.j = str;
        }
        str = this.k;
        if (str != null) {
            aadg.k = str;
        }
        l = this.l;
        if (l != null) {
            aadg.l = l;
        }
        Double d = this.m;
        if (d != null) {
            aadg.m = d;
        }
        l = this.n;
        if (l != null) {
            aadg.n = l;
        }
        str = this.o;
        if (str != null) {
            aadg.o = str;
        }
        l = this.p;
        if (l != null) {
            aadg.p = l;
        }
        str = this.q;
        if (str != null) {
            aadg.q = str;
        }
        str = this.r;
        if (str != null) {
            aadg.r = str;
        }
        str = this.s;
        if (str != null) {
            aadg.s = str;
        }
        str = this.t;
        if (str != null) {
            aadg.t = str;
        }
        l = this.u;
        if (l != null) {
            aadg.u = l;
        }
        l = this.v;
        if (l != null) {
            aadg.v = l;
        }
        aado aado = this.w;
        if (aado != null) {
            aadg.w = aado;
        }
        abfx abfx = this.x;
        if (abfx != null) {
            aadg.x = abfx;
        }
        abfy abfy = this.y;
        if (abfy != null) {
            aadg.y = abfy;
        }
        aarq aarq = this.z;
        if (aarq != null) {
            aadg.z = aarq;
        }
        Boolean bool = this.A;
        if (bool != null) {
            aadg.A = bool;
        }
        str = this.B;
        if (str != null) {
            aadg.B = str;
        }
        aadk aadk = this.C;
        if (aadk != null) {
            aadg.C = aadk;
        }
        str = this.D;
        if (str != null) {
            aadg.D = str;
        }
        abhv abhv = this.E;
        if (abhv != null) {
            abhv = abhv.clone();
            if (abhv == null) {
                aadg.E = null;
            } else {
                aadg.E = new abhv(abhv);
            }
        }
        return aadg;
    }

    public final void a(aadk aadk) {
        this.C = aadk;
    }

    public final void a(aasc aasc) {
        this.c = aasc;
    }

    public final void a(aasd aasd) {
        this.g = aasd;
    }

    public final void a(abbd abbd) {
        this.d = abbd;
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("correspondent_id", str);
        }
        Long l = this.b;
        if (l != null) {
            hashMap.put("char_count", l);
        }
        aasc aasc = this.c;
        if (aasc != null) {
            hashMap.put("media_type", aasc.toString());
        }
        abbd abbd = this.d;
        if (abbd != null) {
            hashMap.put("source", abbd.toString());
        }
        str = this.e;
        if (str != null) {
            hashMap.put("subpage_name", str);
        }
        str = this.f;
        if (str != null) {
            hashMap.put("additional_info", str);
        }
        aasd aasd = this.g;
        if (aasd != null) {
            hashMap.put("message_type", aasd.toString());
        }
        aajo aajo = this.h;
        if (aajo != null) {
            hashMap.put("drawer_view_mode", aajo.toString());
        }
        aadp aadp = this.i;
        if (aadp != null) {
            hashMap.put("chat_sticker_source", aadp.toString());
        }
        str = this.j;
        if (str != null) {
            hashMap.put("sticker_id", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("sticker_id_full", str);
        }
        l = this.l;
        if (l != null) {
            hashMap.put("position_index", l);
        }
        Double d = this.m;
        if (d != null) {
            hashMap.put("note_time_sec", d);
        }
        l = this.n;
        if (l != null) {
            hashMap.put("batch_stack_size", l);
        }
        str = this.o;
        if (str != null) {
            hashMap.put("section", str);
        }
        l = this.p;
        if (l != null) {
            hashMap.put("camera", l);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("laguna_user_agent", str);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("laguna_device_id", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("specs_content_id", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("mischief_id", str);
        }
        l = this.u;
        if (l != null) {
            hashMap.put("recipient_count", l);
        }
        l = this.v;
        if (l != null) {
            hashMap.put("user_present_count", l);
        }
        aado aado = this.w;
        if (aado != null) {
            hashMap.put("chat_source", aado.toString());
        }
        abfx abfx = this.x;
        if (abfx != null) {
            hashMap.put("story_type", abfx.toString());
        }
        abfy abfy = this.y;
        if (abfy != null) {
            hashMap.put("story_type_specific", abfy.toString());
        }
        aarq aarq = this.z;
        if (aarq != null) {
            hashMap.put("media_drawer_tab", aarq.toString());
        }
        Boolean bool = this.A;
        if (bool != null) {
            hashMap.put("forwarded", bool);
        }
        str = this.B;
        if (str != null) {
            hashMap.put("parcel_type", str);
        }
        aadk aadk = this.C;
        if (aadk != null) {
            hashMap.put("chat_erase_mode", aadk.toString());
        }
        str = this.D;
        if (str != null) {
            hashMap.put("ghost_correspondent_id", str);
        }
        abhv abhv = this.E;
        if (abhv != null) {
            hashMap.putAll(abhv.d());
        }
        hashMap.putAll(super.asDictionary());
        return hashMap;
    }

    public final void b(Long l) {
        this.b = l;
    }

    public final void b(String str) {
        this.a = str;
    }

    public final void c(Long l) {
        this.p = l;
    }

    public final void c(String str) {
        this.j = str;
    }

    public final void d(Long l) {
        this.u = l;
    }

    public final void d(String str) {
        this.k = str;
    }

    public final void e(Long l) {
        this.v = l;
    }

    public final void e(String str) {
        this.o = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aadg) obj).asDictionary());
    }

    public final void f(String str) {
        this.t = str;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aasc aasc = this.c;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        abbd abbd = this.d;
        hashCode = (hashCode + (abbd != null ? abbd.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aasd aasd = this.g;
        hashCode = (hashCode + (aasd != null ? aasd.hashCode() : 0)) * 31;
        aajo aajo = this.h;
        hashCode = (hashCode + (aajo != null ? aajo.hashCode() : 0)) * 31;
        aadp aadp = this.i;
        hashCode = (hashCode + (aadp != null ? aadp.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.m;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.n;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l = this.u;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.v;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aado aado = this.w;
        hashCode = (hashCode + (aado != null ? aado.hashCode() : 0)) * 31;
        abfx abfx = this.x;
        hashCode = (hashCode + (abfx != null ? abfx.hashCode() : 0)) * 31;
        abfy abfy = this.y;
        hashCode = (hashCode + (abfy != null ? abfy.hashCode() : 0)) * 31;
        aarq aarq = this.z;
        hashCode = (hashCode + (aarq != null ? aarq.hashCode() : 0)) * 31;
        Boolean bool = this.A;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.B;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aadk aadk = this.C;
        hashCode = (hashCode + (aadk != null ? aadk.hashCode() : 0)) * 31;
        str = this.D;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        abhv abhv = this.E;
        if (abhv != null) {
            i = abhv.hashCode();
        }
        return hashCode + i;
    }
}
