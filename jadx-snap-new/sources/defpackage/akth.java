package defpackage;

import java.io.Serializable;

/* renamed from: akth */
public abstract class akth extends akrf implements Serializable {
    final akrg a;

    protected akth(akrg akrg) {
        if (akrg != null) {
            this.a = akrg;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    public final akrg a() {
        return this.a;
    }

    public int b(long j, long j2) {
        return aktl.a(c(j, j2));
    }

    public final boolean b() {
        return true;
    }

    public /* synthetic */ int compareTo(Object obj) {
        long d = ((akrf) obj).d();
        long d2 = d();
        return d2 == d ? 0 : d2 < d ? -1 : 1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DurationField[");
        stringBuilder.append(this.a.m);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
