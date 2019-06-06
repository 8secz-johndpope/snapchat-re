package defpackage;

/* renamed from: mep */
public interface mep extends ajfb<b> {

    /* renamed from: mep$b */
    public static abstract class b {

        /* renamed from: mep$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* renamed from: mep$b$b */
        public static final class b extends b {
            public static final b a = new b();

            private b() {
                super();
            }

            public final String toString() {
                return "Shown";
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mep$a */
    public static abstract class a {

        /* renamed from: mep$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }

            public final String toString() {
                return "Clicked";
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    ajdp<a> a();
}
