package defpackage;

import defpackage.akue.a;
import java.util.Date;
import org.joda.convert.ToString;

/* renamed from: akse */
public abstract class akse implements akrw {
    protected akse() {
    }

    public int a(akra akra) {
        if (akra != null) {
            return akra.a(c()).a(b());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    /* renamed from: a */
    public final int compareTo(akrw akrw) {
        if (this == akrw) {
            return 0;
        }
        long b = akrw.b();
        long b2 = b();
        return b2 == b ? 0 : b2 < b ? -1 : 1;
    }

    public akrk aw_() {
        return new akrk(b());
    }

    public final boolean b(akrw akrw) {
        return c(akrb.a(akrw));
    }

    public final boolean c(long j) {
        return b() > j;
    }

    public final boolean c(akrw akrw) {
        return d(akrb.a(akrw));
    }

    public final boolean d(long j) {
        return b() < j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akrw)) {
            return false;
        }
        akrw akrw = (akrw) obj;
        return b() == akrw.b() && aktl.a(c(), akrw.c());
    }

    public int hashCode() {
        return ((int) (b() ^ (b() >>> 32))) + c().hashCode();
    }

    public final Date i() {
        return new Date(b());
    }

    @ToString
    public String toString() {
        return a.b.a((akrw) this);
    }
}
