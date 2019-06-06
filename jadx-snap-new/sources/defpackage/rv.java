package defpackage;

import android.os.Build.VERSION;
import defpackage.pv.a;

/* renamed from: rv */
public final class rv {
    public static final String a = pq.a("WorkSpec");
    public String b;
    public a c = a.ENQUEUED;
    public String d;
    public String e;
    public po f = po.a;
    public po g = po.a;
    public long h;
    public long i;
    public long j;
    public pm k = pm.a;
    public int l;
    public pk m = pk.EXPONENTIAL;
    public long n = 30000;
    public long o;
    public long p;
    public long q = -1;

    /* renamed from: rv$1 */
    static class 1 {
        1() {
        }
    }

    /* renamed from: rv$a */
    public static class a {
        public String a;
        public defpackage.pv.a b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b != aVar.b ? false : this.a.equals(aVar.a);
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    static {
        1 1 = new 1();
    }

    public rv(String str, String str2) {
        this.b = str;
        this.d = str2;
    }

    public rv(rv rvVar) {
        this.b = rvVar.b;
        this.d = rvVar.d;
        this.c = rvVar.c;
        this.e = rvVar.e;
        this.f = new po(rvVar.f);
        this.g = new po(rvVar.g);
        this.h = rvVar.h;
        this.i = rvVar.i;
        this.j = rvVar.j;
        this.k = new pm(rvVar.k);
        this.l = rvVar.l;
        this.m = rvVar.m;
        this.n = rvVar.n;
        this.o = rvVar.o;
        this.p = rvVar.p;
        this.q = rvVar.q;
    }

    public final boolean a() {
        return this.i != 0;
    }

    public final boolean b() {
        return this.c == a.ENQUEUED && this.l > 0;
    }

    public final long c() {
        Object obj = null;
        if (b()) {
            if (this.m == pk.LINEAR) {
                obj = 1;
            }
            return this.o + Math.min(18000000, obj != null ? this.n * ((long) this.l) : (long) Math.scalb((float) this.n, this.l - 1));
        } else if (!a()) {
            return this.o + this.h;
        } else {
            if (VERSION.SDK_INT > 22) {
                return (this.o + this.i) - this.j;
            }
            if (this.j != this.i) {
                obj = 1;
            }
            if (obj == null) {
                return this.o + this.i;
            }
            long j = this.o == 0 ? -1 * this.j : 0;
            long j2 = this.o;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            return (j2 + this.i) + j;
        }
    }

    public final boolean d() {
        return !pm.a.equals(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            rv rvVar = (rv) obj;
            if (this.h != rvVar.h || this.i != rvVar.i || this.j != rvVar.j || this.l != rvVar.l || this.n != rvVar.n || this.o != rvVar.o || this.p != rvVar.p || this.q != rvVar.q || !this.b.equals(rvVar.b) || this.c != rvVar.c || !this.d.equals(rvVar.d)) {
                return false;
            }
            String str = this.e;
            if (!str == null ? str.equals(rvVar.e) : rvVar.e == null) {
                return false;
            }
            if (this.f.equals(rvVar.f) && this.g.equals(rvVar.g) && this.k.equals(rvVar.k) && this.m == rvVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        hashCode = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        long j = this.h;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.i;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.j;
        hashCode = (((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.k.hashCode()) * 31) + this.l) * 31) + this.m.hashCode()) * 31;
        j = this.n;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.o;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.p;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.q;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("{WorkSpec: ");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
