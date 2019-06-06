package defpackage;

/* renamed from: mxb */
public final class mxb {

    /* renamed from: mxb$a */
    public static final class a implements mxa {
        private /* synthetic */ ajxe a;

        a(ajxe ajxe) {
            this.a = ajxe;
        }

        public final <T> T a(Class<T> cls) {
            akcr.b(cls, "t");
            return ((mxa) this.a.b()).a(cls);
        }
    }

    public static final mxa a(akbk<? extends mxa> akbk) {
        akcr.b(akbk, "receiver$0");
        return new a(ajxh.a(akbk));
    }
}
