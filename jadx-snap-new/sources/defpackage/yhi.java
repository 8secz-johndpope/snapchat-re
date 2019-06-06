package defpackage;

import java.util.HashMap;

/* renamed from: yhi */
public final class yhi {
    private final ajxe a;
    private final ajxe b;
    private final HashMap<String, ihm> c = new HashMap();

    /* renamed from: yhi$b */
    static final class b extends akcq implements akbk<ilv> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yhi$a */
    static final class a extends akcq implements akbk<ihh> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(yhi.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;"), new akdc(akde.a(yhi.class), "clock", "getClock()Lcom/snap/framework/time/Clock;")};
    }

    public yhi(ajwy<ilv> ajwy, ajwy<ihh> ajwy2) {
        akcr.b(ajwy, "grapheneProvider");
        akcr.b(ajwy2, "clockProvider");
        this.a = ajxh.a(new b(ajwy));
        this.b = ajxh.a(new a(ajwy2));
    }

    public final void a(ipd ipd, String str, boolean z) {
        Long valueOf;
        akcr.b(ipd, "metric");
        akcr.b(str, "metricId");
        ihm ihm = (ihm) this.c.remove(str);
        if (ihm != null) {
            ihm.b();
            valueOf = Long.valueOf(ihm.c());
        } else {
            valueOf = null;
        }
        if (valueOf != null) {
            ((ilv) this.a.b()).a(ipd.a("isDeltaResponse", z), valueOf.longValue());
        }
    }

    public final void a(String str) {
        akcr.b(str, "metricId");
        Object obj = (ihh) this.b.b();
        akcr.a(obj, "clock");
        ihm ihm = new ihm(obj);
        this.c.put(str, ihm);
        ihm.a();
    }
}
