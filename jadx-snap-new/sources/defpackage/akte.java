package defpackage;

import defpackage.aksm.a;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: akte */
public final class akte extends aksm {

    /* renamed from: akte$b */
    static class b extends akth {
        private akrf b;
        private boolean c;
        private akrc d;

        b(akrf akrf, akrc akrc) {
            super(akrf.a());
            if (akrf.b()) {
                this.b = akrf;
                this.c = akte.a(akrf);
                this.d = akrc;
                return;
            }
            throw new IllegalArgumentException();
        }

        private int a(long j) {
            int b = this.d.b(j);
            long j2 = (long) b;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return b;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        private int b(long j) {
            int e = this.d.e(j);
            long j2 = (long) e;
            if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
                return e;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        public final long a(long j, int i) {
            int a = a(j);
            j = this.b.a(j + ((long) a), i);
            if (!this.c) {
                a = b(j);
            }
            return j - ((long) a);
        }

        public final long a(long j, long j2) {
            int a = a(j);
            j = this.b.a(j + ((long) a), j2);
            if (!this.c) {
                a = b(j);
            }
            return j - ((long) a);
        }

        public final int b(long j, long j2) {
            int a = a(j2);
            return this.b.b(j + ((long) (this.c ? a : a(j))), j2 + ((long) a));
        }

        public final long c(long j, long j2) {
            int a = a(j2);
            return this.b.c(j + ((long) (this.c ? a : a(j))), j2 + ((long) a));
        }

        public final boolean c() {
            return this.c ? this.b.c() : this.b.c() && this.d.d();
        }

        public final long d() {
            return this.b.d();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b.equals(bVar.b) && this.d.equals(bVar.d);
            }
        }

        public final int hashCode() {
            return this.b.hashCode() ^ this.d.hashCode();
        }
    }

    /* renamed from: akte$a */
    static final class a extends aktg {
        private akqz a;
        private akrc c;
        private akrf d;
        private boolean e;
        private akrf f;
        private akrf g;

        a(akqz akqz, akrc akrc, akrf akrf, akrf akrf2, akrf akrf3) {
            super(akqz.a());
            if (akqz.c()) {
                this.a = akqz;
                this.c = akrc;
                this.d = akrf;
                this.e = akte.a(akrf);
                this.f = akrf2;
                this.g = akrf3;
                return;
            }
            throw new IllegalArgumentException();
        }

        private int f(long j) {
            int b = this.c.b(j);
            long j2 = (long) b;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return b;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        public final int a(long j) {
            return this.a.a(this.c.f(j));
        }

        public final int a(Locale locale) {
            return this.a.a(locale);
        }

        public final long a(long j, int i) {
            if (this.e) {
                long f = (long) f(j);
                return this.a.a(j + f, i) - f;
            }
            return this.c.a(this.a.a(this.c.f(j), i), j);
        }

        public final long a(long j, long j2) {
            if (this.e) {
                long f = (long) f(j);
                return this.a.a(j + f, j2) - f;
            }
            return this.c.a(this.a.a(this.c.f(j), j2), j);
        }

        public final long a(long j, String str, Locale locale) {
            return this.c.a(this.a.a(this.c.f(j), str, locale), j);
        }

        public final String a(int i, Locale locale) {
            return this.a.a(i, locale);
        }

        public final String a(long j, Locale locale) {
            return this.a.a(this.c.f(j), locale);
        }

        public final int b(long j, long j2) {
            int f = f(j2);
            return this.a.b(j + ((long) (this.e ? f : f(j))), j2 + ((long) f));
        }

        public final long b(long j, int i) {
            long b = this.a.b(this.c.f(j), i);
            j = this.c.a(b, j);
            if (a(j) == i) {
                return j;
            }
            akrj akrj = new akrj(b, this.c.b);
            akri akri = new akri(this.a.a(), Integer.valueOf(i), akrj.getMessage());
            akri.initCause(akrj);
            throw akri;
        }

        public final String b(int i, Locale locale) {
            return this.a.b(i, locale);
        }

        public final String b(long j, Locale locale) {
            return this.a.b(this.c.f(j), locale);
        }

        public final boolean b(long j) {
            return this.a.b(this.c.f(j));
        }

        public final int c(long j) {
            return this.a.c(this.c.f(j));
        }

        public final long c(long j, long j2) {
            int f = f(j2);
            return this.a.c(j + ((long) (this.e ? f : f(j))), j2 + ((long) f));
        }

        public final long d(long j) {
            if (this.e) {
                long f = (long) f(j);
                return this.a.d(j + f) - f;
            }
            return this.c.a(this.a.d(this.c.f(j)), j);
        }

        public final akrf d() {
            return this.d;
        }

        public final long e(long j) {
            return this.a.e(this.c.f(j));
        }

        public final akrf e() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.f.equals(aVar.f);
            }
        }

        public final akrf f() {
            return this.g;
        }

        public final int g() {
            return this.a.g();
        }

        public final int h() {
            return this.a.h();
        }

        public final int hashCode() {
            return this.a.hashCode() ^ this.c.hashCode();
        }
    }

    private akte(akqx akqx, akrc akrc) {
        super(akqx, akrc);
    }

    private long a(long j) {
        if (j == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        akrc akrc = (akrc) this.b;
        int e = akrc.e(j);
        long j2 = j - ((long) e);
        if (j > 604800000 && j2 < 0) {
            return Long.MAX_VALUE;
        }
        if (j < -604800000 && j2 > 0) {
            return Long.MIN_VALUE;
        }
        if (e == akrc.b(j2)) {
            return j2;
        }
        throw new akrj(j, akrc.b);
    }

    private akqz a(akqz akqz, HashMap<Object, Object> hashMap) {
        if (akqz == null || !akqz.c()) {
            return akqz;
        }
        if (hashMap.containsKey(akqz)) {
            return (akqz) hashMap.get(akqz);
        }
        a aVar = new a(akqz, (akrc) this.b, a(akqz.d(), (HashMap) hashMap), a(akqz.e(), (HashMap) hashMap), a(akqz.f(), (HashMap) hashMap));
        hashMap.put(akqz, aVar);
        return aVar;
    }

    private akrf a(akrf akrf, HashMap<Object, Object> hashMap) {
        if (akrf == null || !akrf.b()) {
            return akrf;
        }
        if (hashMap.containsKey(akrf)) {
            return (akrf) hashMap.get(akrf);
        }
        b bVar = new b(akrf, (akrc) this.b);
        hashMap.put(akrf, bVar);
        return bVar;
    }

    public static akte a(akqx akqx, akrc akrc) {
        if (akqx != null) {
            akqx = akqx.b();
            if (akqx == null) {
                throw new IllegalArgumentException("UTC chronology must not be null");
            } else if (akrc != null) {
                return new akte(akqx, akrc);
            } else {
                throw new IllegalArgumentException("DateTimeZone must not be null");
            }
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    static boolean a(akrf akrf) {
        return akrf != null && akrf.d() < 43200000;
    }

    public final long a(int i, int i2, int i3, int i4) {
        return a(this.a.a(i, i2, i3, i4));
    }

    public final long a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return a(this.a.a(i, i2, i3, i4, i5, i6, i7));
    }

    public final akqx a(akrc akrc) {
        if (akrc == null) {
            akrc = akrc.a();
        }
        return akrc == this.b ? this : akrc == akrc.a ? this.a : new akte(this.a, akrc);
    }

    public final akrc a() {
        return (akrc) this.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(a aVar) {
        HashMap hashMap = new HashMap();
        aVar.l = a(aVar.l, hashMap);
        aVar.k = a(aVar.k, hashMap);
        aVar.j = a(aVar.j, hashMap);
        aVar.i = a(aVar.i, hashMap);
        aVar.h = a(aVar.h, hashMap);
        aVar.g = a(aVar.g, hashMap);
        aVar.f = a(aVar.f, hashMap);
        aVar.e = a(aVar.e, hashMap);
        aVar.d = a(aVar.d, hashMap);
        aVar.c = a(aVar.c, hashMap);
        aVar.b = a(aVar.b, hashMap);
        aVar.a = a(aVar.a, hashMap);
        aVar.E = a(aVar.E, hashMap);
        aVar.F = a(aVar.F, hashMap);
        aVar.G = a(aVar.G, hashMap);
        aVar.H = a(aVar.H, hashMap);
        aVar.I = a(aVar.I, hashMap);
        aVar.x = a(aVar.x, hashMap);
        aVar.y = a(aVar.y, hashMap);
        aVar.z = a(aVar.z, hashMap);
        aVar.D = a(aVar.D, hashMap);
        aVar.A = a(aVar.A, hashMap);
        aVar.B = a(aVar.B, hashMap);
        aVar.C = a(aVar.C, hashMap);
        aVar.m = a(aVar.m, hashMap);
        aVar.n = a(aVar.n, hashMap);
        aVar.o = a(aVar.o, hashMap);
        aVar.p = a(aVar.p, hashMap);
        aVar.q = a(aVar.q, hashMap);
        aVar.r = a(aVar.r, hashMap);
        aVar.s = a(aVar.s, hashMap);
        aVar.u = a(aVar.u, hashMap);
        aVar.t = a(aVar.t, hashMap);
        aVar.v = a(aVar.v, hashMap);
        aVar.w = a(aVar.w, hashMap);
    }

    public final akqx b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akte)) {
            return false;
        }
        akte akte = (akte) obj;
        return this.a.equals(akte.a) && ((akrc) this.b).equals((akrc) akte.b);
    }

    public final int hashCode() {
        return ((((akrc) this.b).hashCode() * 11) + 326565) + (this.a.hashCode() * 7);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ZonedChronology[");
        stringBuilder.append(this.a);
        stringBuilder.append(ppy.d);
        stringBuilder.append(((akrc) this.b).b);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
