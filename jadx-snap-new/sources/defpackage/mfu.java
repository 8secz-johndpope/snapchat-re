package defpackage;

/* renamed from: mfu */
public interface mfu extends ajfb<b> {

    /* renamed from: mfu$b */
    public static abstract class b {

        /* renamed from: mfu$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* renamed from: mfu$b$b */
        public static abstract class b extends b {

            /* renamed from: mfu$b$b$a */
            public static final class a extends b {
                public static final a a = new a();

                private a() {
                    super();
                }

                public final String toString() {
                    return "Loading";
                }
            }

            /* renamed from: mfu$b$b$b */
            public static final class b extends b {
                public static final b a = new b();

                private b() {
                    super();
                }

                public final String toString() {
                    return "Start";
                }
            }

            private b() {
                super();
            }

            public /* synthetic */ b(byte b) {
                this();
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mfu$a */
    public static abstract class a {

        /* renamed from: mfu$a$a */
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
