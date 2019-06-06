package defpackage;

import java.io.Serializable;

/* renamed from: aksi */
public abstract class aksi extends aksd implements akrv, Serializable {
    public volatile long b;

    protected aksi(long j) {
        this.b = j;
    }

    protected aksi(long j, long j2) {
        this.b = aktl.b(j2, j);
    }

    protected aksi(akrw akrw, akrw akrw2) {
        long j;
        if (akrw == akrw2) {
            j = 0;
        } else {
            j = aktl.b(akrb.a(akrw2), akrb.a(akrw));
        }
        this.b = j;
    }

    public final long a() {
        return this.b;
    }
}
