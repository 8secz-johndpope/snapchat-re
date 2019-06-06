package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: hmq */
public final class hmq implements gnb {
    final ajwy<dib> a;
    final hoy b;
    private final ajxe c = ajxh.a(new c(this));
    private final ajxe d = ajxh.a(new d(this));
    private final ajwy<hbv> e;

    /* renamed from: hmq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hmq$c */
    static final class c extends akcs implements akbk<Boolean> {
        private /* synthetic */ hmq a;

        c(hmq hmq) {
            this.a = hmq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.b().isEmpty() ^ 1);
        }
    }

    /* renamed from: hmq$d */
    static final class d extends akcs implements akbk<List<? extends gna>> {
        private /* synthetic */ hmq a;

        d(hmq hmq) {
            this.a = hmq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            hmq hmq = this.a;
            List arrayList = new ArrayList();
            if (hmq.b.s()) {
                long j;
                int v = hmq.b.v();
                long w = hmq.b.w();
                int[] x = hmq.b.x();
                int length = x.length;
                int i = 0;
                while (i < length) {
                    int i2 = x[i];
                    j = w;
                    gna gna = r5;
                    int i3 = i;
                    gna gna2 = new gna(gna.j.concat(String.valueOf(i2)), true, false, j, 0, true, new gnh(i2, 60, ""), null, 272);
                    arrayList.add(gna);
                    i = i3 + 1;
                }
                if (v >= 0) {
                    j = w;
                    arrayList.add(new gna(gna.k.concat(String.valueOf(v)), true, false, j, 0, true, null, new gnm(gnn.BACKGROUND, v), 272));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: hmq$b */
    static final class b implements gns {
        private /* synthetic */ hmq a;

        b(hmq hmq) {
            this.a = hmq;
        }

        public final void a(aajt aajt) {
            ((dib) this.a.a.get()).a(aajt);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hmq.class), "isActive", "isActive()Z"), new akdc(akde.a(hmq.class), "schedulingConstraints", "getSchedulingConstraints()Ljava/util/List;")};
        a aVar = new a();
    }

    public hmq(ajwy<hbv> ajwy, ajwy<dib> ajwy2, hoy hoy) {
        akcr.b(ajwy, "discoverFeedPrefetcher");
        akcr.b(ajwy2, "blizzardEventLogger");
        akcr.b(hoy, "featureFlagManager");
        this.e = ajwy;
        this.a = ajwy2;
        this.b = hoy;
    }

    public final ajdx<Integer> a(gfu gfu, Map<String, String> map) {
        akcr.b(gfu, "contentResolver");
        return ((hbv) this.e.get()).a(this.b.y(), this.b.t(), this.b.u(), gfu);
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
