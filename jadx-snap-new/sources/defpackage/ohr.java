package defpackage;

import java.util.Set;

/* renamed from: ohr */
public final class ohr implements ygh {
    final ajwy<ygi> a;
    private final odl b;

    /* renamed from: ohr$a */
    public static final class a implements ygo<ygk> {
        private /* synthetic */ ohr a;

        a(ohr ohr) {
            this.a = ohr;
        }

        public final void a(ygl<ygk> ygl) {
            akcr.b(ygl, "group");
            ((ygi) this.a.a.get()).b((ygl) (ygh) ygl);
        }
    }

    public ohr(odl odl, ajwy<ygi> ajwy) {
        akcr.b(odl, "mediaRenderingFeature");
        akcr.b(ajwy, "fileManager");
        this.b = odl;
        this.a = ajwy;
    }

    public final ide a() {
        return this.b;
    }

    public final ygj b() {
        return ygj.b;
    }

    public final long c() {
        return 41943040;
    }

    public final boolean d() {
        return true;
    }

    public final String e() {
        return "media";
    }

    public final Set<ygk> f() {
        return ajyi.h(ohq.values());
    }

    public final boolean g() {
        return false;
    }

    public final ygo<ygk> h() {
        return new a(this);
    }
}
