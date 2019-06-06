package defpackage;

import defpackage.jyg.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: jyf */
public final class jyf implements jwk {
    static final akbk<Integer> f = c.a;
    final ConcurrentHashMap<Long, a> a = new ConcurrentHashMap();
    final ConcurrentHashMap<String, Integer> b = new ConcurrentHashMap();
    final Object c = new Object();
    volatile int d;
    volatile int e = 157286400;
    private final AtomicLong g = new AtomicLong(0);
    private final ajwy<ilv> h;

    /* renamed from: jyf$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: jyf$c */
    static final class c extends akcs implements akbk<Integer> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(0);
        }
    }

    /* renamed from: jyf$a */
    static final class a {
        final String a;
        final int b;

        public a(String str, int i) {
            akcr.b(str, "featureName");
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (akcr.a(this.a, aVar.a)) {
                        if ((this.b == aVar.b ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("BitmapAttribution(featureName=");
            stringBuilder.append(this.a);
            stringBuilder.append(", size=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: jyf$d */
    static final class d extends akcs implements akbk<ajxw> {
        private /* synthetic */ jyf a;
        private /* synthetic */ long b;

        d(jyf jyf, long j) {
            this.a = jyf;
            this.b = j;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            jyf jyf = this.a;
            long j = this.b;
            synchronized (jyf.c) {
                a aVar = (a) jyf.a.remove(Long.valueOf(j));
                if (aVar != null) {
                    jyf.d = Math.max(0, jyf.d - aVar.b);
                    ConcurrentHashMap concurrentHashMap = jyf.b;
                    String str = aVar.a;
                    Map map = jyf.b;
                    String str2 = aVar.a;
                    akbk akbk = jyf.f;
                    Object obj = map.get(str2);
                    if (obj == null) {
                        obj = akbk.invoke();
                    }
                    concurrentHashMap.put(str, Integer.valueOf(Math.max(0, ((Number) obj).intValue() - aVar.b)));
                    if (jyf.d < jyf.e / 2) {
                        jyf.e = Math.min(157286400, jyf.e / 2);
                    }
                }
            }
            return ajxw.a;
        }
    }

    static {
        b bVar = new b();
    }

    public jyf(ajwy<ilv> ajwy) {
        akcr.b(ajwy, "graphene");
        this.h = ajwy;
    }

    private final void a(ily ily, Map<String, Integer> map, int i) {
        Iterator it = map.entrySet().iterator();
        long j = 0;
        while (true) {
            String str = "attribution";
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                String str2 = (String) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                if (intValue > 0) {
                    int i2 = i / 1048576;
                    String str3 = "threshold";
                    long j2 = (long) intValue;
                    ((ilv) this.h.get()).b(ily.a(str, str2).a(str3, String.valueOf(i2)), j2);
                    ((ilv) this.h.get()).c(ily.a(str, str2).a(str3, String.valueOf(i2)), j2);
                }
                j += (long) intValue;
            } else {
                String str4 = "all";
                ((ilv) this.h.get()).c(ily.a(str, str4), j);
                ((ilv) this.h.get()).b(ily.a(str, str4), j);
                return;
            }
        }
    }

    public final jwj a(jwj jwj, int i, idd idd) {
        akcr.b(jwj, "disposableBitmap");
        akcr.b(idd, "attribution");
        long andIncrement = this.g.getAndIncrement();
        synchronized (this.c) {
            String name = idd.a.getName();
            this.a.put(Long.valueOf(andIncrement), new a(name, i));
            ConcurrentHashMap concurrentHashMap = this.b;
            Map map = this.b;
            akbk akbk = f;
            Object obj = map.get(name);
            if (obj == null) {
                obj = akbk.invoke();
            }
            concurrentHashMap.put(name, Integer.valueOf(((Number) obj).intValue() + i));
            this.d += i;
        }
        akbk dVar = new d(this, andIncrement);
        akcr.b(jwj, "receiver$0");
        akcr.b(dVar, "doOnDispose");
        jwj aVar = new a(jwj, dVar);
        int i2 = 0;
        Map map2 = null;
        synchronized (this.c) {
            if (this.d > this.e) {
                i2 = this.e;
                map2 = ajzm.c((Map) this.b);
                this.e <<= 1;
            }
        }
        if (map2 != null && i2 > 0) {
            a((ily) iot.BITMAP_HIGH_USAGE, map2, i2);
        }
        return aVar;
    }

    public final jwj a(jwj jwj, idd idd) {
        akcr.b(jwj, "disposableBitmap");
        akcr.b(idd, "attribution");
        Object a = jwj.a();
        akcr.a(a, "disposableBitmap.underlyingBitmap");
        return a(jwj, a.getAllocationByteCount(), idd);
    }

    public final void a(ily ily) {
        Map c;
        akcr.b(ily, "metric");
        synchronized (this.c) {
            c = ajzm.c((Map) this.b);
        }
        a(ily, c, 0);
    }
}
