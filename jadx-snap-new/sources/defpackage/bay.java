package defpackage;

import defpackage.bau.a;
import defpackage.bau.b;
import defpackage.bau.c;
import java.util.List;

/* renamed from: bay */
public final class bay {
    public static final c a = new c();

    public static a a(List<baw> list) {
        if (list != null && !list.isEmpty()) {
            return new a(list);
        }
        throw new IllegalArgumentException("Uris must not be null or empty.");
    }

    public static b a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Window start can't be less than 0");
        } else if (i2 >= i) {
            return new b(i, i2);
        } else {
            throw new IllegalArgumentException("Window end can't be less than window start");
        }
    }
}
