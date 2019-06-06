package defpackage;

import java.util.Set;

/* renamed from: ssm */
public final class ssm {
    public static final zjm a = new zjm(ssl.a, "Opera", false, false, true, false, null, false, false, false, true, null, 2796);
    public static final ygh b = new a();
    private static acgu<zjm> c = acgu.a(acis.d, (achg) a, false);

    /* renamed from: ssm$a */
    public static final class a implements ygh {
        a() {
        }

        public final /* bridge */ /* synthetic */ ide a() {
            return ssl.a;
        }

        public final ygj b() {
            return ygj.b;
        }

        public final long c() {
            return 20971520;
        }

        public final boolean d() {
            return true;
        }

        public final String e() {
            return "opera";
        }

        public final /* synthetic */ Set f() {
            return ajyi.h(ssn.values());
        }

        public final boolean g() {
            return false;
        }

        public final /* bridge */ /* synthetic */ ygo h() {
            return null;
        }
    }

    public static final acgu<zjm> a(sti sti) {
        Object obj;
        String str;
        akcr.b(sti, "featureConfiguration");
        if (sti.q == null && sti.r == null && sti.s == null) {
            obj = c;
            str = "OPERA_PRESENT_DEFAULT";
        } else {
            idg idg = a.d;
            ide ide = idg.c;
            str = idg.d;
            akcr.b(ide, "feature");
            akcr.b(str, "tag");
            idg idg2 = new idg(ide, str);
            str = sti.q;
            if (str == null) {
                str = a.d.a;
            }
            idg2.a = str;
            zjm zjm = a;
            boolean z = zjm.e;
            boolean z2 = zjm.f;
            boolean z3 = zjm.g;
            boolean z4 = zjm.h;
            boolean z5 = zjm.i;
            boolean z6 = zjm.j;
            String str2 = zjm.k;
            akcr.b(idg2, "attribution");
            zjm zjm2 = new zjm(idg2, z, z2, z3, z4, z5, z6, str2);
            Boolean bool = sti.r;
            zjm2.a = bool != null ? bool.booleanValue() : a.a;
            Boolean bool2 = sti.s;
            zjm2.b = bool2 != null ? bool2.booleanValue() : a.b;
            obj = acgu.a(acis.d, (achg) zjm2, false);
            str = "NavigationAction.present…_TO_TOP, pageType, false)";
        }
        akcr.a(obj, str);
        return obj;
    }
}
