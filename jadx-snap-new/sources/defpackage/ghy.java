package defpackage;

import defpackage.rzh.a;
import java.util.Collection;

/* renamed from: ghy */
public final class ghy {
    static final String a(geg geg) {
        StringBuilder stringBuilder = new StringBuilder("REQ[type:");
        stringBuilder.append(geg.f().a());
        stringBuilder.append(" context:");
        Collection g = geg.g();
        akcr.b(g, "receiver$0");
        String str = "";
        stringBuilder.append(ajyu.a((Iterable) g, (CharSequence) ppy.b, (CharSequence) str, (CharSequence) str, 0, null, (akbl) a.a, 24));
        return stringBuilder.toString();
    }
}
