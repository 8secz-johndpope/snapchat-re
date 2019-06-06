package defpackage;

import java.io.File;

/* renamed from: aoi */
public final class aoi<A, T, Z, R> implements aoj<A, T, Z, R> {
    private final akw<A, T> a;
    private final anm<Z, R> b;
    private final aof<T, Z> c;

    public aoi(akw<A, T> akw, anm<Z, R> anm, aof<T, Z> aof) {
        if (akw != null) {
            this.a = akw;
            if (anm != null) {
                this.b = anm;
                if (aof != null) {
                    this.c = aof;
                    return;
                }
                throw new NullPointerException("DataLoadProvider must not be null");
            }
            throw new NullPointerException("Transcoder must not be null");
        }
        throw new NullPointerException("ModelLoader must not be null");
    }

    public final aiq<File, Z> a() {
        return this.c.a();
    }

    public final aiq<T, Z> b() {
        return this.c.b();
    }

    public final ain<T> c() {
        return this.c.c();
    }

    public final air<Z> d() {
        return this.c.d();
    }

    public final akw<A, T> e() {
        return this.a;
    }

    public final anm<Z, R> f() {
        return this.b;
    }
}
