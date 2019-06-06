package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: hmr */
public final class hmr implements gnb {
    final ajwy<dib> a;
    final hoy b;
    private final ajxe c = ajxh.a(new c(this));
    private final ajxe d = ajxh.a(new d(this));
    private final ajwy<hbt> e;

    /* renamed from: hmr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hmr$c */
    static final class c extends akcs implements akbk<Boolean> {
        private /* synthetic */ hmr a;

        c(hmr hmr) {
            this.a = hmr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.b().isEmpty() ^ 1);
        }
    }

    /* renamed from: hmr$d */
    static final class d extends akcs implements akbk<List<gna>> {
        private /* synthetic */ hmr a;

        d(hmr hmr) {
            this.a = hmr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            List arrayList = new ArrayList();
            if (this.a.b.z()) {
                int C = this.a.b.C();
                arrayList.add(new gna(gna.k.concat(String.valueOf(C)), true, false, this.a.b.D(), 0, true, null, new gnm(gnn.BACKGROUND, C), 272));
            }
            return arrayList;
        }
    }

    /* renamed from: hmr$b */
    static final class b implements gns {
        private /* synthetic */ hmr a;

        b(hmr hmr) {
            this.a = hmr;
        }

        public final void a(aajt aajt) {
            ((dib) this.a.a.get()).a(aajt);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hmr.class), "isActive", "isActive()Z"), new akdc(akde.a(hmr.class), "schedulingConstraints", "getSchedulingConstraints()Ljava/util/List;")};
        a aVar = new a();
    }

    public hmr(ajwy<hbt> ajwy, ajwy<dib> ajwy2, hoy hoy) {
        akcr.b(ajwy, "discoverStoryPrefetcher");
        akcr.b(ajwy2, "blizzardEventLogger");
        akcr.b(hoy, "featureFlagManager");
        this.e = ajwy;
        this.a = ajwy2;
        this.b = hoy;
    }

    public final ajdx<Integer> a(gfu gfu, Map<String, String> map) {
        akcr.b(gfu, "contentResolver");
        return ((hbt) this.e.get()).a(this.b.A(), this.b.B(), gfu);
    }

    public final boolean a() {
        return ((Boolean) this.c.b()).booleanValue();
    }

    public final List<gna> b() {
        return (List) this.d.b();
    }

    public final gno c() {
        return new god(new b(this));
    }
}
