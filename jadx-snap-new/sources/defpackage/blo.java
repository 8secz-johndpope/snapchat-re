package defpackage;

import defpackage.bsj.a;

/* renamed from: blo */
final class blo {
    public final bly a;
    public final Object b;
    public final a c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final bss h;
    public final bww i;
    public volatile long j;
    public volatile long k;

    public blo(bly bly, long j, bss bss, bww bww) {
        this(bly, null, new a(0), j, -9223372036854775807L, 1, false, bss, bww);
    }

    public blo(bly bly, Object obj, a aVar, long j, long j2, int i, boolean z, bss bss, bww bww) {
        this.a = bly;
        this.b = obj;
        this.c = aVar;
        this.d = j;
        this.e = j2;
        this.j = j;
        this.k = j;
        this.f = i;
        this.g = z;
        this.h = bss;
        this.i = bww;
    }

    static void a(blo blo, blo blo2) {
        blo2.j = blo.j;
        blo2.k = blo.k;
    }

    public final blo a(int i) {
        blo blo = new blo(this.a, this.b, this.c, this.d, this.e, i, this.g, this.h, this.i);
        blo.a(this, blo);
        return blo;
    }

    public final blo a(a aVar, long j, long j2) {
        return new blo(this.a, this.b, aVar, j, aVar.a() ? j2 : -9223372036854775807L, this.f, this.g, this.h, this.i);
    }

    public final blo a(bss bss, bww bww) {
        blo blo = new blo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, bss, bww);
        blo.a(this, blo);
        return blo;
    }

    public final blo a(boolean z) {
        blo blo = new blo(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i);
        blo.a(this, blo);
        return blo;
    }
}
