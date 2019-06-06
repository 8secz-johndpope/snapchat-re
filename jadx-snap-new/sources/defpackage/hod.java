package defpackage;

/* renamed from: hod */
public final class hod {
    private final ajxe a;

    /* renamed from: hod$a */
    static final class a extends akcq implements akbk<ilv> {
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
            return (ilv) ((ajwy) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(hod.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;");
    }

    public hod(ajwy<ilv> ajwy) {
        akcr.b(ajwy, "grapheneProvider");
        this.a = ajxh.a(new a(ajwy));
    }

    /* Access modifiers changed, original: final */
    public final ilv a() {
        return (ilv) this.a.b();
    }
}
