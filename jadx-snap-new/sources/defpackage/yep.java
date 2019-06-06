package defpackage;

import defpackage.yes.b;

/* renamed from: yep */
public final class yep {
    final String a;
    int b;
    long[] c;
    long d;
    int e;
    b f;
    long g;
    long h;
    long i;

    public yep(String str) {
        this.a = str;
        this.b = 0;
        this.c = null;
    }

    public yep(String str, int i) {
        this.a = str;
        this.b = i;
        this.c = new long[this.b];
    }

    public final long a() {
        long j = 0;
        for (int i = 0; i < this.b; i++) {
            j += this.c[i];
        }
        return j;
    }

    /* Access modifiers changed, original: final */
    public final void a(long j) {
        this.i = j;
    }

    /* Access modifiers changed, original: final */
    public final void b(long j) {
        this.h = j;
    }

    public final boolean b() {
        return a() > 0;
    }
}
