package defpackage;

import java.util.List;

/* renamed from: eaa */
public abstract class eaa {

    /* renamed from: eaa$a */
    public interface a {
        boolean shouldSelect(abtl abtl);
    }

    private static boolean a(double d, double d2) {
        return Math.abs(d - d2) < 0.05d;
    }

    protected static boolean a(int i, abtl abtl, abtl abtl2) {
        return (abtl.c() >= i && abtl.c() < abtl2.c()) || (abtl.c() > abtl2.c() && i > abtl2.c());
    }

    protected static boolean b(abtl abtl, abtl abtl2, abtl abtl3) {
        double abs = Math.abs(abtl.f() - abtl2.f());
        double abs2 = Math.abs(abtl.f() - abtl3.f());
        return abs < abs2 && !eaa.a(abs, abs2);
    }

    protected static boolean c(abtl abtl, abtl abtl2, abtl abtl3) {
        double abs = Math.abs(abtl.f() - abtl2.f());
        double abs2 = Math.abs(abtl.f() - abtl3.f());
        return abs > abs2 && !eaa.a(abs, abs2);
    }

    protected static boolean d(abtl abtl, abtl abtl2, abtl abtl3) {
        return (abtl2.b(abtl) && abtl3.a(abtl2)) || (abtl2.a(abtl3) && abtl.a(abtl3));
    }

    public final abtl a(abtl abtl, List<abtl> list) {
        return a(abtl, (List) list, null);
    }

    public final abtl a(abtl abtl, List<abtl> list, a aVar) {
        abtl abtl2 = null;
        for (abtl abtl3 : list) {
            if ((aVar == null || aVar.shouldSelect(abtl3)) && (abtl2 == null || a(abtl, abtl3, abtl2))) {
                abtl2 = abtl3;
            }
        }
        return abtl2;
    }

    public abstract boolean a(abtl abtl, abtl abtl2, abtl abtl3);
}
