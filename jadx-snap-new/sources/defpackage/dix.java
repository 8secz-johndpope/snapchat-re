package defpackage;

import com.google.common.collect.EvictingQueue;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* renamed from: dix */
public final class dix implements diw {
    private volatile double a;
    private volatile long b;
    private volatile aaat c;
    private volatile long d;
    private final LinkedList<ajxm<String, Double>> e = new LinkedList();
    private final EvictingQueue<ajxm<String, Double>> f = EvictingQueue.create(5);

    /* renamed from: dix$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public final void a() {
        this.b++;
    }

    public final void a(double d) {
        if (this.a == 0.0d) {
            this.a = d;
        }
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void a(aaat aaat) {
        akcr.b(aaat, "source");
        if (this.c == null) {
            this.c = aaat;
        }
    }

    public final void a(String str, double d) {
        akcr.b(str, "pageName");
        synchronized (this) {
            if (this.e.size() < 5) {
                this.e.add(new ajxm(str, Double.valueOf(d)));
            } else {
                this.f.offer(new ajxm(str, Double.valueOf(d)));
            }
        }
    }

    public final double b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final aaat d() {
        aaat aaat = this.c;
        return aaat == null ? aaat.NORMAL : aaat;
    }

    public final long e() {
        return this.d;
    }

    public final List<ajxm<String, Double>> f() {
        List h = ajyu.h((Collection) this.e);
        Object obj = this.f;
        akcr.a(obj, "lastFivePagesNameViewTsList");
        h.addAll((Collection) obj);
        return ajyu.k(h);
    }

    public final void g() {
        this.a = 0.0d;
        this.b = 0;
        this.c = null;
        this.d = 0;
        synchronized (this) {
            this.e.clear();
            this.f.clear();
        }
    }
}
