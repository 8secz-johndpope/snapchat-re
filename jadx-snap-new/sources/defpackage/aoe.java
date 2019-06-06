package defpackage;

import java.io.File;

/* renamed from: aoe */
public final class aoe<A, T, Z, R> implements aoj<A, T, Z, R>, Cloneable {
    public aiq<T, Z> a;
    public ain<T> b;
    private final aoj<A, T, Z, R> c;

    public aoe(aoj<A, T, Z, R> aoj) {
        this.c = aoj;
    }

    public final aiq<File, Z> a() {
        return this.c.a();
    }

    public final aiq<T, Z> b() {
        aiq aiq = this.a;
        return aiq != null ? aiq : this.c.b();
    }

    public final ain<T> c() {
        ain ain = this.b;
        return ain != null ? ain : this.c.c();
    }

    public final air<Z> d() {
        return this.c.d();
    }

    public final akw<A, T> e() {
        return this.c.e();
    }

    public final anm<Z, R> f() {
        return this.c.f();
    }

    /* renamed from: g */
    public final aoe<A, T, Z, R> clone() {
        try {
            return (aoe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
