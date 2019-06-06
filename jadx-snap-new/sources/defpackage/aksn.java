package defpackage;

import java.io.Serializable;

/* renamed from: aksn */
public abstract class aksn extends akqx implements Serializable {
    protected aksn() {
    }

    public akqz A() {
        return aktu.a(akra.i, y());
    }

    public akrf B() {
        return aktv.a(akrg.e);
    }

    public akqz C() {
        return aktu.a(akra.g, B());
    }

    public akrf D() {
        return aktv.a(akrg.d);
    }

    public akqz E() {
        return aktu.a(akra.e, D());
    }

    public akqz F() {
        return aktu.a(akra.b, D());
    }

    public akqz G() {
        return aktu.a(akra.d, D());
    }

    public akrf H() {
        return aktv.a(akrg.b);
    }

    public akqz I() {
        return aktu.a(akra.c, H());
    }

    public akrf J() {
        return aktv.a(akrg.a);
    }

    public akqz K() {
        return aktu.a(akra.a, J());
    }

    public long a(int i, int i2, int i3, int i4) {
        return e().b(u().b(C().b(E().b(0, i), i2), i3), i4);
    }

    public long a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return d().b(g().b(j().b(m().b(u().b(C().b(E().b(0, i), i2), i3), i4), i5), i6), i7);
    }

    public final long a(long j, long j2, int i) {
        return (j2 == 0 || i == 0) ? j : aktl.a(j, aktl.a(j2, i));
    }

    public final long a(akrx akrx, long j) {
        int a = akrx.a();
        for (int i = 0; i < a; i++) {
            j = akrx.c(i).a(this).b(j, akrx.a(i));
        }
        return j;
    }

    public final long a(akry akry, long j) {
        int d = akry.d();
        for (int i = 0; i < d; i++) {
            long c = (long) akry.c(i);
            if (c != 0) {
                j = akry.b(i).a(this).a(j, c);
            }
        }
        return j;
    }

    public final int[] a(akry akry) {
        return new int[akry.d()];
    }

    public final int[] a(akry akry, long j, long j2) {
        int d = akry.d();
        int[] iArr = new int[d];
        if (j != j2) {
            for (int i = 0; i < d; i++) {
                akrf a = akry.b(i).a(this);
                int b = a.b(j2, j);
                if (b != 0) {
                    j = a.a(j, b);
                }
                iArr[i] = b;
            }
        }
        return iArr;
    }

    public akrf c() {
        return aktv.a(akrg.l);
    }

    public akqz d() {
        return aktu.a(akra.w, c());
    }

    public akqz e() {
        return aktu.a(akra.v, c());
    }

    public akrf f() {
        return aktv.a(akrg.k);
    }

    public akqz g() {
        return aktu.a(akra.u, f());
    }

    public akqz h() {
        return aktu.a(akra.t, f());
    }

    public akrf i() {
        return aktv.a(akrg.j);
    }

    public akqz j() {
        return aktu.a(akra.s, i());
    }

    public akqz k() {
        return aktu.a(akra.r, i());
    }

    public akrf l() {
        return aktv.a(akrg.i);
    }

    public akqz m() {
        return aktu.a(akra.q, l());
    }

    public akqz n() {
        return aktu.a(akra.p, l());
    }

    public akrf o() {
        return aktv.a(akrg.h);
    }

    public akqz p() {
        return aktu.a(akra.n, l());
    }

    public akqz q() {
        return aktu.a(akra.o, l());
    }

    public akqz r() {
        return aktu.a(akra.m, o());
    }

    public akrf s() {
        return aktv.a(akrg.g);
    }

    public akqz t() {
        return aktu.a(akra.l, s());
    }

    public akqz u() {
        return aktu.a(akra.h, s());
    }

    public akqz v() {
        return aktu.a(akra.f, s());
    }

    public akrf w() {
        return aktv.a(akrg.f);
    }

    public akqz x() {
        return aktu.a(akra.k, w());
    }

    public akrf y() {
        return aktv.a(akrg.c);
    }

    public akqz z() {
        return aktu.a(akra.j, y());
    }
}
