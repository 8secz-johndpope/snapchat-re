package defpackage;

/* renamed from: zsf */
public enum zsf {
    HIGH,
    LOW,
    UNKNOWN;
    
    public static final a Companion = null;

    /* renamed from: zsf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Companion = new a();
    }

    public final String toString() {
        String name = name();
        if (name != null) {
            Object toLowerCase = name.toLowerCase();
            akcr.a(toLowerCase, "(this as java.lang.String).toLowerCase()");
            return toLowerCase;
        }
        throw new ajxt("null cannot be cast to non-null type java.lang.String");
    }
}
