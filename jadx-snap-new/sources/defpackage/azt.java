package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: azt */
public final class azt {
    private static int m;
    azu a;
    public boolean b;
    final String c;
    public final a d = new a();
    final a e = new a();
    final a f = new a();
    double g;
    double h;
    boolean i = true;
    public double j = 0.005d;
    CopyOnWriteArraySet<azv> k = new CopyOnWriteArraySet();
    double l = 0.0d;
    private double n = 0.005d;
    private final azr o;

    /* renamed from: azt$a */
    public static class a {
        public double a;
        public double b;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    azt(azr azr) {
        this.o = azr;
        StringBuilder stringBuilder = new StringBuilder("spring:");
        int i = m;
        m = i + 1;
        stringBuilder.append(i);
        this.c = stringBuilder.toString();
        a(azu.c);
    }

    private double a(a aVar) {
        return Math.abs(this.h - aVar.a);
    }

    public final azt a(double d) {
        this.g = d;
        this.d.a = d;
        this.o.a(this.c);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((azv) it.next()).onSpringUpdate(this);
        }
        c();
        return this;
    }

    public final azt a(azu azu) {
        if (azu != null) {
            this.a = azu;
            return this;
        }
        throw new IllegalArgumentException("springConfig is required");
    }

    public final azt a(azv azv) {
        if (azv != null) {
            this.k.add(azv);
            return this;
        }
        throw new IllegalArgumentException("newListener is required");
    }

    public final void a() {
        this.k.clear();
        azr azr = this.o;
        azr.b.remove(this);
        azr.a.remove(this.c);
    }

    public final azt b(double d) {
        if (this.h == d && b()) {
            return this;
        }
        this.g = this.d.a;
        this.h = d;
        this.o.a(this.c);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((azv) it.next()).onSpringEndStateChange(this);
        }
        return this;
    }

    public final boolean b() {
        return Math.abs(this.d.b) <= this.n && (a(this.d) <= this.j || this.a.b == 0.0d);
    }

    public final azt c() {
        this.h = this.d.a;
        this.f.a = this.d.a;
        this.d.b = 0.0d;
        return this;
    }

    public final azt c(double d) {
        if (d == this.d.b) {
            return this;
        }
        this.d.b = d;
        this.o.a(this.c);
        return this;
    }

    public final azt d() {
        this.k.clear();
        return this;
    }
}
