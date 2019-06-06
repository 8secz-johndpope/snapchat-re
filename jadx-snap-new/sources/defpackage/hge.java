package defpackage;

import java.util.HashMap;

/* renamed from: hge */
public final class hge {
    public final ajxe a;
    public final HashMap<Long, hjx> b = new HashMap();

    /* renamed from: hge$a */
    static final class a extends akcq implements akbk<hpg> {
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
            return (hpg) ((ajwy) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(hge.class), "clientModelFactory", "getClientModelFactory()Lcom/snap/discoverfeed/shared/modelfactory/ClientModelFactory;");
    }

    public hge(ajwy<hpg> ajwy) {
        akcr.b(ajwy, "clientModelFactoryProvider");
        this.a = ajxh.a(new a(ajwy));
    }
}
