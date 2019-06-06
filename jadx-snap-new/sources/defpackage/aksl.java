package defpackage;

import java.io.Serializable;

/* renamed from: aksl */
public abstract class aksl implements akry, Serializable, Comparable<aksl> {
    protected volatile int p;

    protected aksl(int i) {
        this.p = i;
    }

    public static int a(akrw akrw, akrw akrw2, akrg akrg) {
        if (akrw != null && akrw2 != null) {
            return akrg.a(akrb.b(akrw)).b(akrw2.b(), akrw.b());
        }
        throw new IllegalArgumentException("ReadableInstant objects must not be null");
    }

    public final int a(akrg akrg) {
        return akrg == a() ? this.p : 0;
    }

    public abstract akrg a();

    public final akrg b(int i) {
        if (i == 0) {
            return a();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public abstract akrr b();

    public final int c(int i) {
        if (i == 0) {
            return this.p;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public /* synthetic */ int compareTo(Object obj) {
        aksl aksl = (aksl) obj;
        if (aksl.getClass() == getClass()) {
            int i = aksl.p;
            int i2 = this.p;
            return i2 > i ? 1 : i2 < i ? -1 : 0;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass());
            stringBuilder.append(" cannot be compared to ");
            stringBuilder.append(aksl.getClass());
            throw new ClassCastException(stringBuilder.toString());
        }
    }

    public final int d() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akry)) {
            return false;
        }
        akry akry = (akry) obj;
        return akry.b() == b() && akry.c(0) == this.p;
    }

    public int hashCode() {
        return ((this.p + 459) * 27) + a().hashCode();
    }
}
