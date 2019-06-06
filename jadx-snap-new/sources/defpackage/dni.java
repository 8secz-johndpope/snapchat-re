package defpackage;

/* renamed from: dni */
public interface dni {

    /* renamed from: dni$a */
    public enum a {
        NONE(0),
        LEFT(1),
        DISMISS(2);
        
        public static final a Companion = null;
        private final int value;

        /* renamed from: dni$a$a */
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

        private a(int i) {
            this.value = i;
        }
    }

    int a();

    zjm b();

    boolean c();

    boolean d();

    boolean e();

    a f();

    boolean g();

    boolean h();

    boolean i();
}
