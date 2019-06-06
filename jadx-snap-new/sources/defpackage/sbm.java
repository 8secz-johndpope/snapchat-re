package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sbm */
public class sbm<PayloadType> implements sak<PayloadType> {
    private final sac a;
    private final Map<String, String> b;
    private final PayloadType c;
    public final String d;
    private final Map<String, ?> e;
    private final boolean f;

    /* renamed from: sbm$a */
    public static class a<PayloadType> implements defpackage.sak.a<PayloadType> {
        protected String d;
        protected sac e;
        protected Map<String, String> f;
        protected Map<String, Object> g;
        protected Object h;
        protected boolean i;

        public a(String str, sac sac) {
            this(str, sac, Collections.emptyMap(), null, Collections.emptyMap(), true);
        }

        public a(String str, sac sac, Map<String, String> map, PayloadType payloadType, Map<String, ?> map2, boolean z) {
            this.d = str;
            this.e = sac;
            this.f = new HashMap(map);
            this.h = payloadType;
            this.g = map2 != null ? new HashMap(map2) : new HashMap();
            this.g.put("original_url", str);
            this.i = z;
        }

        public a(String str, sac sac, Map<String, String> map, Map<String, ?> map2) {
            this(str, sac, map, null, map2, true);
        }

        public a(sak<PayloadType> sak) {
            this(sak.i(), sak.k(), sak.l(), sak.n(), sak.m(), sak.o());
        }

        public defpackage.sak.a<PayloadType> a(String str) {
            this.d = str;
            return this;
        }

        public defpackage.sak.a<PayloadType> a(sac sac) {
            this.e = sac;
            return this;
        }

        public defpackage.sak.a<PayloadType> a(boolean z) {
            this.i = z;
            return this;
        }

        public <TargetType> defpackage.sak.a<TargetType> b(TargetType targetType) {
            this.h = targetType;
            return this;
        }

        public <V> defpackage.sak.a<PayloadType> b(String str, V v) {
            this.g.put(str, v);
            return this;
        }

        public defpackage.sak.a<PayloadType> c(Map<String, ?> map) {
            this.g = map == null ? new HashMap() : new HashMap(map);
            return this;
        }

        public defpackage.sak.a<PayloadType> d(Map<String, String> map) {
            this.f = new HashMap(map);
            return this;
        }

        /* renamed from: d */
        public sbm<PayloadType> e() {
            return new sbm(this.d, this.e, this.f, this.h, this.g, this.i);
        }
    }

    protected sbm(String str, sac sac, Map<String, String> map, PayloadType payloadType, Map<String, ?> map2, boolean z) {
        this.d = str;
        this.a = sac;
        this.b = Collections.unmodifiableMap(map);
        this.c = payloadType;
        this.e = map2 != null ? Collections.unmodifiableMap(map2) : null;
        this.f = z;
    }

    /* renamed from: g */
    public a<PayloadType> h() {
        return new a(this.d, this.a, this.b, this.c, this.e, this.f);
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        try {
            return new URL(this.d).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public final sac k() {
        return this.a;
    }

    public Map<String, String> l() {
        return this.b;
    }

    public final Map<String, ?> m() {
        return this.e;
    }

    public final PayloadType n() {
        return this.c;
    }

    public final boolean o() {
        return this.f;
    }

    public String toString() {
        return sbi.a(this);
    }
}
