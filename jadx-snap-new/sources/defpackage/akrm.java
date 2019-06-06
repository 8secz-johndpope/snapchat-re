package defpackage;

import defpackage.akue.a;
import java.io.Serializable;
import org.joda.convert.ToString;

/* renamed from: akrm */
public final class akrm extends aksj implements akrx, Serializable {
    private final long a;
    private final akqx b;

    public akrm() {
        this(akrb.a(), aktc.b(akrc.a()));
    }

    public akrm(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, i3, i4, i5, i6, i7, aktc.n);
    }

    private akrm(int i, int i2, int i3, int i4, int i5, int i6, int i7, akqx akqx) {
        akqx b = akrb.a(akqx).b();
        long a = b.a(i, i2, i3, i4, i5, i6, i7);
        this.b = b;
        this.a = a;
    }

    private akrm(long j, akqx akqx) {
        akqx = akrb.a(akqx);
        this.a = akqx.a().a(akrc.a, j);
        this.b = akqx.b();
    }

    public akrm(long j, akrc akrc) {
        this(j, aktc.b(akrc));
    }

    public final int a() {
        return 4;
    }

    public final int a(int i) {
        akqz E;
        if (i == 0) {
            E = this.b.E();
        } else if (i == 1) {
            E = this.b.C();
        } else if (i == 2) {
            E = this.b.u();
        } else if (i == 3) {
            E = this.b.e();
        } else {
            throw new IndexOutOfBoundsException("Invalid index: ".concat(String.valueOf(i)));
        }
        return E.a(this.a);
    }

    public final int a(akra akra) {
        if (akra != null) {
            return akra.a(this.b).a(this.a);
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    /* renamed from: a */
    public final int compareTo(akrx akrx) {
        if (this == akrx) {
            return 0;
        }
        if (akrx instanceof akrm) {
            akrm akrm = (akrm) akrx;
            if (this.b.equals(akrm.b)) {
                long j = this.a;
                long j2 = akrm.a;
                return j < j2 ? -1 : j == j2 ? 0 : 1;
            }
        }
        return super.a(akrx);
    }

    public final akqy a(akrc akrc) {
        return new akqy(c(), d(), e(), f(), g(), h(), i(), this.b.a(akrb.a(akrc)));
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
        if (i == 3) {
            return akqx.e();
        }
        throw new IndexOutOfBoundsException("Invalid index: ".concat(String.valueOf(i)));
    }

    public final akqx b() {
        return this.b;
    }

    public final boolean b(akra akra) {
        return akra == null ? false : akra.a(this.b).c();
    }

    public final int c() {
        return this.b.E().a(this.a);
    }

    public final int d() {
        return this.b.C().a(this.a);
    }

    public final int e() {
        return this.b.u().a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akrm) {
            akrm akrm = (akrm) obj;
            if (this.b.equals(akrm.b)) {
                return this.a == akrm.a;
            }
        }
        return super.equals(obj);
    }

    public final int f() {
        return this.b.m().a(this.a);
    }

    public final int g() {
        return this.b.j().a(this.a);
    }

    public final int h() {
        return this.b.g().a(this.a);
    }

    public final int i() {
        return this.b.d().a(this.a);
    }

    @ToString
    public final String toString() {
        return a.b.a((akrx) this);
    }
}
