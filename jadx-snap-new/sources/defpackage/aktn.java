package defpackage;

import java.io.Serializable;

/* renamed from: aktn */
public final class aktn extends akrf implements Serializable {
    public static final akrf a = new aktn();

    private aktn() {
    }

    public final long a(long j, int i) {
        return aktl.a(j, (long) i);
    }

    public final long a(long j, long j2) {
        return aktl.a(j, j2);
    }

    public final akrg a() {
        return akrg.l;
    }

    public final int b(long j, long j2) {
        return aktl.a(aktl.b(j, j2));
    }

    public final boolean b() {
        return true;
    }

    public final long c(long j, long j2) {
        return aktl.b(j, j2);
    }

    public final boolean c() {
        return true;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        long d = ((akrf) obj).d();
        return 1 == d ? 0 : 1 < d ? -1 : 1;
    }

    public final long d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        return obj instanceof aktn;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
