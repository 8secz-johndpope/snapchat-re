package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: iac */
public final class iac {
    public static final List<ice> a(List<? extends iah> list) {
        akcr.b(list, "dbModels");
        Iterable<iah> iterable = list;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (iah iah : iterable) {
            String a = iah.a();
            String b = iah.b();
            if (b == null) {
                akcr.a();
            }
            byte[] c = iah.c();
            Long d = iah.d();
            if (d == null) {
                akcr.a();
            }
            arrayList.add(new ice(a, b, c, Integer.valueOf((int) d.longValue())));
        }
        return (List) arrayList;
    }
}
