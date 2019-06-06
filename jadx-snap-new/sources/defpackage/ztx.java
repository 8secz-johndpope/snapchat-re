package defpackage;

/* renamed from: ztx */
public final class ztx {
    final ajxe a = ajxh.a(new a(this));
    final ajwy<iha> b;

    /* renamed from: ztx$a */
    static final class a extends akcs implements akbk<iha> {
        private /* synthetic */ ztx a;

        a(ztx ztx) {
            this.a = ztx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iha) this.a.b.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ztx.class), "serializationHelper", "getSerializationHelper()Lcom/snap/framework/serialization/SerializationHelper;");
    }

    public ztx(ajwy<iha> ajwy) {
        akcr.b(ajwy, "serializationHelperProvider");
        this.b = ajwy;
    }
}
