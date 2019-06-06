package defpackage;

import defpackage.gel.a;
import defpackage.gel.b;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: gha */
public final class gha implements ggq {
    final ConcurrentHashMap<Long, a> a = new ConcurrentHashMap();
    final Object b = new Object();
    volatile int c;
    private final AtomicLong d = new AtomicLong(0);

    /* renamed from: gha$a */
    public static final class a implements b {
        private final gha a;
        private final long b;
        private final String c;
        private final int d;

        public a(gha gha, long j, String str, int i) {
            akcr.b(gha, "controller");
            akcr.b(str, "attribution");
            this.a = gha;
            this.b = j;
            this.c = str;
            this.d = i;
        }

        public final b a() {
            return this.a.a(this.b, this.c, this.d);
        }

        public final void close() {
            gha gha = this.a;
            long j = this.b;
            synchronized (gha.b) {
                defpackage.gel.a aVar = (defpackage.gel.a) gha.a.remove(Long.valueOf(j));
                if (aVar != null) {
                    gha.c = Math.max(0, gha.c - aVar.b);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final b a(long j, String str, int i) {
        b a;
        synchronized (this.b) {
            a aVar = (a) this.a.get(Long.valueOf(j));
            a = aVar != null ? a(aVar.a, aVar.b) : a(str, i);
        }
        return a;
    }

    public final b a(String str, int i) {
        akcr.b(str, "attribution");
        long andIncrement = this.d.getAndIncrement();
        synchronized (this.b) {
            if (i > 0) {
                this.a.put(Long.valueOf(andIncrement), new a(str, i));
            }
            this.c += i;
        }
        return new a(this, andIncrement, str, i);
    }

    public final List<a> a() {
        List k;
        synchronized (this.b) {
            Object values = this.a.values();
            akcr.a(values, "nonZeroFdMap.values");
            k = ajyu.k((Iterable) values);
        }
        return k;
    }

    public final int b() {
        return this.c;
    }

    public final void c() {
        synchronized (this.b) {
            this.a.clear();
            this.c = 0;
        }
    }
}
