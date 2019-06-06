package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: dyx */
public final class dyx implements eda {
    private static final int a = ecw.values.size();
    private final Set<ecw> b = EnumSet.noneOf(ecw.class);
    private final long[] c;
    private final long[] d;
    private final long[] e;
    private long f;
    private long g;
    private long h;

    public dyx() {
        int i = a;
        this.c = new long[i];
        this.d = new long[i];
        this.e = new long[i];
    }

    public final long a() {
        return this.f;
    }

    public final long a(ecw ecw) {
        return this.d[ecw.ordinal()];
    }

    public final void a(long j) {
        this.f = j;
    }

    public final void a(ecw ecw, long j) {
        this.d[ecw.ordinal()] = j;
    }

    public final long b() {
        return this.g;
    }

    public final long b(ecw ecw) {
        return this.e[ecw.ordinal()];
    }

    public final void b(long j) {
        this.g = j;
    }

    public final void b(ecw ecw, long j) {
        this.e[ecw.ordinal()] = j;
    }

    public final long c() {
        return this.h;
    }

    public final long c(ecw ecw) {
        return this.c[ecw.ordinal()];
    }

    public final void c(long j) {
        this.h = j;
    }

    public final void c(ecw ecw, long j) {
        this.b.add(ecw);
        this.c[ecw.ordinal()] = j;
    }

    public final Collection<ecw> d() {
        return this.b;
    }

    public final void e() {
        this.b.clear();
    }
}
