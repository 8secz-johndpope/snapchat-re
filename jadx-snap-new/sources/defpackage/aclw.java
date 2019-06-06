package defpackage;

import java.util.Collection;

/* renamed from: aclw */
public final class aclw {
    public final aclu a;

    public aclw(aclu aclu) {
        akcr.b(aclu, "mapAnalyticsSession");
        this.a = aclu;
    }

    public final void a(String str, aarb aarb) {
        akcr.b(str, "userId");
        aclu aclu = this.a;
        if (!aclu.c().b(str) && aarb != null) {
            aclt b = aclu.b();
            Collection a = aclu.c().a(str);
            Object c = aclu.c();
            String str2 = "dataProvider";
            akcr.a(c, str2);
            long b2 = (long) c.b();
            c = aclu.c();
            akcr.a(c, str2);
            b.a(aarb, a, b2, (long) c.f().size());
        }
    }

    public final void a(zyr zyr) {
        akcr.b(zyr, "swipeDirection");
        this.a.b().a(zyr);
    }
}
