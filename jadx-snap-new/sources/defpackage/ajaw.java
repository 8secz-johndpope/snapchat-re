package defpackage;

import com.google.common.primitives.Longs;

/* renamed from: ajaw */
public abstract class ajaw implements Comparable<ajaw> {
    static {
        ajav ajav = new ajav();
    }

    ajaw() {
    }

    public abstract long a();

    public abstract int b();

    public /* synthetic */ int compareTo(Object obj) {
        ajaw ajaw = (ajaw) obj;
        int compare = Longs.compare(a(), ajaw.a());
        return compare != 0 ? compare : Longs.compare((long) b(), (long) ajaw.b());
    }
}
