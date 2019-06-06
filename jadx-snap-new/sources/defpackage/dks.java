package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: dks */
public final class dks {
    public Map<String, Object> a;
    public boolean b;
    public final long c;
    private Long d;
    private Long e;
    private aavd f;

    public dks(aajt aajt) {
        this(aajt, aajt.getEventQoS() == aavd.BUSINESS_CRITICAL);
    }

    private dks(aajt aajt, boolean z) {
        this.f = aajt.getEventQoS();
        this.a = aajt.asDictionary();
        this.b = z;
        this.c = aajt.getClientTs() == null ? System.currentTimeMillis() : (long) (aajt.getClientTs().doubleValue() * 1000.0d);
    }

    public dks(Long l, String str, boolean z, Long l2) {
        this.d = l;
        this.a = dih.a(str);
        this.b = z;
        this.e = l2;
        Double d = (Double) this.a.get("client_ts");
        this.c = d == null ? System.currentTimeMillis() : (long) (d.doubleValue() * 1000.0d);
    }

    public final aavd a() {
        return this.f;
    }

    public final boolean a(String str) {
        return this.a.containsKey(str);
    }

    public final Long b() {
        Long l = this.e;
        return (l == null || l.longValue() == 0) ? null : this.e;
    }

    public final Object b(String str) {
        return this.a.get(str);
    }

    public final String c() {
        return (String) b("event_name");
    }

    public final Map<String, Object> d() {
        return new HashMap(this.a);
    }
}
