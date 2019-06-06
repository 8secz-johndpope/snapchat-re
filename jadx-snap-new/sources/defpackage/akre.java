package defpackage;

import java.io.Serializable;

/* renamed from: akre */
public final class akre extends aksi implements akrv, Serializable {
    public static final akre a = new akre(0);

    public akre(long j) {
        super(j);
    }

    public akre(long j, long j2) {
        super(j, j2);
    }

    public akre(akrw akrw, akrw akrw2) {
        super(akrw, akrw2);
    }

    public static akre a(long j) {
        return j == 0 ? a : new akre(aktl.a(j, 86400000));
    }
}
