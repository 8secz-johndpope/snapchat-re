package defpackage;

import defpackage.alkn.a;
import java.util.Set;

/* renamed from: acph */
public final class acph {
    public static final acpt a = new acpt(null);

    private static a a(a aVar, Set<String> set) {
        akcr.b(set, "sessionSet");
        return aVar == null ? null : (aVar.h() && set.contains(aVar.i())) ? null : aVar;
    }

    public static final a a(alkn alkn, double d, Set<String> set, boolean z) {
        akcr.b(set, "sessionSet");
        if (alkn == null || alkn.a == null) {
            return null;
        }
        for (Object obj : alkn.a) {
            String str = "variant";
            if (obj.c()) {
                akcr.a(obj, str);
                if (obj.b() >= 0) {
                    continue;
                }
            }
            akcr.a(obj, str);
            if (((d >= obj.d() && d <= obj.e()) || (z && obj.g())) && acph.a(obj, set) != null) {
                return obj;
            }
        }
        return null;
    }
}
