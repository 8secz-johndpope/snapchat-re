package defpackage;

import defpackage.akue.a;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import org.joda.convert.ToString;

/* renamed from: akrl */
public final class akrl extends aksj implements akrx, Serializable {
    private static final Set<akrg> c;
    public final long a;
    public final akqx b;
    private transient int d;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add(akrg.g);
        c.add(akrg.f);
        c.add(akrg.e);
        c.add(akrg.c);
        c.add(akrg.d);
        c.add(akrg.b);
        c.add(akrg.a);
    }

    public akrl() {
        this(akrb.a(), aktc.b(akrc.a()));
    }

    public akrl(int i, int i2, int i3) {
        this(i, i2, i3, aktc.n);
    }

    private akrl(int i, int i2, int i3, akqx akqx) {
        akqx = akrb.a(akqx).b();
        long a = akqx.a(i, i2, i3, 0);
        this.b = akqx;
        this.a = a;
    }

    public akrl(long j) {
        this(j, aktc.b(akrc.a()));
    }

    public akrl(long j, akqx akqx) {
        akqx = akrb.a(akqx);
        j = akqx.a().a(akrc.a, j);
        akqx = akqx.b();
        this.a = akqx.u().d(j);
        this.b = akqx;
    }

    public final int a() {
        return 3;
    }

    public final int a(int i) {
        akqz E;
        if (i == 0) {
            E = this.b.E();
        } else if (i == 1) {
            E = this.b.C();
        } else if (i == 2) {
            E = this.b.u();
        } else {
            throw new IndexOutOfBoundsException("Invalid index: ".concat(String.valueOf(i)));
        }
        return E.a(this.a);
    }

    public final int a(akra akra) {
        if (akra == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (b(akra)) {
            return akra.a(this.b).a(this.a);
        } else {
            StringBuilder stringBuilder = new StringBuilder("Field '");
            stringBuilder.append(akra);
            stringBuilder.append("' is not supported");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final int compareTo(akrx akrx) {
        if (this == akrx) {
            return 0;
        }
        if (akrx instanceof akrl) {
            akrl akrl = (akrl) akrx;
            if (this.b.equals(akrl.b)) {
                long j = this.a;
                long j2 = akrl.a;
                return j < j2 ? -1 : j == j2 ? 0 : 1;
            }
        }
        return super.compareTo(akrx);
    }

    public final akqy a(akrc akrc) {
        akrc = akrb.a(akrc);
        akqx a = this.b.a(akrc);
        return new akqy(a.u().d(akrc.g(this.a + 21600000)), a);
    }

    public final akqz a(int i, akqx akqx) {
        if (i == 0) {
            return akqx.E();
        }
        if (i == 1) {
            return akqx.C();
        }
        if (i == 2) {
            return akqx.u();
        }
        throw new IndexOutOfBoundsException("Invalid index: ".concat(String.valueOf(i)));
    }

    public final akrl a(long j) {
        j = this.b.u().d(j);
        return j == this.a ? this : new akrl(j, this.b);
    }

    public final akqx b() {
        return this.b;
    }

    public final akrl b(int i) {
        return a(this.b.E().b(this.a, i));
    }

    public final boolean b(akra akra) {
        if (akra == null) {
            return false;
        }
        akrg a = akra.a();
        return (c.contains(a) || a.a(this.b).d() >= this.b.s().d()) ? akra.a(this.b).c() : false;
    }

    public final int c() {
        return this.b.E().a(this.a);
    }

    public final int d() {
        return this.b.C().a(this.a);
    }

    public final int e() {
        return this.b.v().a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akrl) {
            akrl akrl = (akrl) obj;
            if (this.b.equals(akrl.b)) {
                return this.a == akrl.a;
            }
        }
        return super.equals(obj);
    }

    public final int f() {
        return this.b.u().a(this.a);
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        i = super.hashCode();
        this.d = i;
        return i;
    }

    @ToString
    public final String toString() {
        return a.a.a((akrx) this);
    }
}
