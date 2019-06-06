package defpackage;

import defpackage.hhm.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: hms */
public final class hms implements hhm {
    private final Map<hka, Map<String, Object>> a = new ConcurrentHashMap();
    private final List<a> b = new ArrayList();
    private final abqo c = abqp.a.a;

    /* renamed from: hms$a */
    static class a implements defpackage.hhm.a {
        private final String a;
        private final long b;

        a(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public final String a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }
    }

    public final Object a(hka hka, String str) {
        return !this.a.containsKey(hka) ? null : ((Map) this.a.get(hka)).get(str);
    }

    public final List<a> a() {
        return new ArrayList(this.b);
    }

    public final Map<String, Object> a(hka hka) {
        return (Map) this.a.get(hka);
    }

    public final void a(hka hka, String str, Object obj) {
        if (!this.a.containsKey(hka)) {
            this.a.put(hka, new HashMap());
        }
        ((Map) this.a.get(hka)).put(str, obj);
    }

    public final void a(String str) {
        this.b.add(new a(str, System.currentTimeMillis()));
    }

    public final a b() {
        if (this.b.isEmpty()) {
            return null;
        }
        List list = this.b;
        return (a) list.get(list.size() - 1);
    }
}
