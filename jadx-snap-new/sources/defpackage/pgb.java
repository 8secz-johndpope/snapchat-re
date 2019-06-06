package defpackage;

import android.content.Context;

/* renamed from: pgb */
public final class pgb implements ods {
    private final ajwy<Context> a;
    private final ajwy<owc> b;
    private final ajwy<ihh> c;
    private final ajwy<ilv> d;

    public pgb(ajwy<Context> ajwy, ajwy<owc> ajwy2, ajwy<ihh> ajwy3, ajwy<ilv> ajwy4) {
        akcr.b(ajwy, "context");
        akcr.b(ajwy2, "uploadSessionsRepository");
        akcr.b(ajwy3, "clock");
        akcr.b(ajwy4, "graphene");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
        this.d = ajwy4;
    }

    public final boolean a() {
        try {
            boolean z;
            ilz a;
            long c = ((ihh) this.c.get()).c();
            boolean exists = ((Context) this.a.get()).getDatabasePath("memories.db").exists();
            if (exists) {
                owc owc = (owc) this.b.get();
                Long l = (Long) owc.a().queryFirst("hasAnySession", owc.b().y().b());
                if (l != null && l.longValue() > 0) {
                    z = true;
                    a = iom.DMPD_RESULT.a("db", exists).a("session", z);
                    ((ilv) this.d.get()).c(a, 1);
                    ((ilv) this.d.get()).a(a, ((ihh) this.c.get()).c() - c);
                    return z;
                }
            }
            z = false;
            a = iom.DMPD_RESULT.a("db", exists).a("session", z);
            ((ilv) this.d.get()).c(a, 1);
            ((ilv) this.d.get()).a(a, ((ihh) this.c.get()).c() - c);
            return z;
        } catch (Exception e) {
            Object simpleName = e.getClass().getSimpleName();
            akcr.a(simpleName, "it");
            int min = Math.min(simpleName.length(), 32);
            if (simpleName != null) {
                String substring = simpleName.substring(0, min);
                akcr.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                ((ilv) this.d.get()).c(iom.DMPD_ERROR.a("name", substring), 1);
                return true;
            }
            throw new ajxt("null cannot be cast to non-null type java.lang.String");
        }
    }
}
