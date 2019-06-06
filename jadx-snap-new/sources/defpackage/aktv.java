package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* renamed from: aktv */
public final class aktv extends akrf implements Serializable {
    private static HashMap<akrg, aktv> a;
    private final akrg b;

    private aktv(akrg akrg) {
        this.b = akrg;
    }

    public static synchronized aktv a(akrg akrg) {
        aktv aktv;
        synchronized (aktv.class) {
            if (a == null) {
                a = new HashMap(7);
                aktv = null;
            } else {
                aktv = (aktv) a.get(akrg);
            }
            if (aktv == null) {
                aktv = new aktv(akrg);
                a.put(akrg, aktv);
            }
        }
        return aktv;
    }

    private UnsupportedOperationException e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(" field is unsupported");
        return new UnsupportedOperationException(stringBuilder.toString());
    }

    public final long a(long j, int i) {
        throw e();
    }

    public final long a(long j, long j2) {
        throw e();
    }

    public final akrg a() {
        return this.b;
    }

    public final int b(long j, long j2) {
        throw e();
    }

    public final boolean b() {
        return false;
    }

    public final long c(long j, long j2) {
        throw e();
    }

    public final boolean c() {
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    public final long d() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aktv)) {
            return false;
        }
        aktv aktv = (aktv) obj;
        return aktv.b.m == null ? this.b.m == null : aktv.b.m.equals(this.b.m);
    }

    public final int hashCode() {
        return this.b.m.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UnsupportedDurationField[");
        stringBuilder.append(this.b.m);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
