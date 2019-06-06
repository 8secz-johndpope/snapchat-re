package defpackage;

import java.io.IOException;

/* renamed from: fst */
public final class fst {
    public static final <T> T a(akxa<T> akxa) {
        akcr.b(akxa, "receiver$0");
        if (akxa.c()) {
            Throwable b = akxa.b();
            if (b == null) {
                b = new IOException("Error result ".concat(String.valueOf(akxa)));
            }
            throw b;
        }
        akws a = akxa.a();
        String str = null;
        StringBuilder stringBuilder;
        akws a2;
        if (a == null || !a.e()) {
            stringBuilder = new StringBuilder("Error response ");
            akws a3 = akxa.a();
            stringBuilder.append(a3 != null ? Integer.valueOf(a3.b()) : null);
            stringBuilder.append(' ');
            a2 = akxa.a();
            if (a2 != null) {
                akhw g = a2.g();
                if (g != null) {
                    str = g.g();
                }
            }
            stringBuilder.append(str);
            throw new IOException(stringBuilder.toString());
        }
        Object g2;
        a = akxa.a();
        if (a != null) {
            Object f = a.f();
            if (f != null) {
                return f;
            }
        }
        stringBuilder = new StringBuilder("Null response body ");
        a2 = akxa.a();
        if (a2 != null) {
            g2 = a2.g();
        }
        stringBuilder.append(g2);
        throw new IOException(stringBuilder.toString());
    }
}
