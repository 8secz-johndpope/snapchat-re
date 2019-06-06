package defpackage;

/* renamed from: mft */
public interface mft extends mhu<a, b> {

    /* renamed from: mft$a */
    public static abstract class a {

        /* renamed from: mft$a$b */
        public static abstract class b extends a {

            /* renamed from: mft$a$b$a */
            public static final class a extends b {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            /* renamed from: mft$a$b$b */
            public static final class b extends b {
                public static final b a = new b();

                private b() {
                    super();
                }
            }

            private b() {
                super();
            }

            public /* synthetic */ b(byte b) {
                this();
            }
        }

        /* renamed from: mft$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: mft$a$c */
        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: mft$b */
    public static abstract class b {

        /* renamed from: mft$b$b */
        public static abstract class b extends b {

            /* renamed from: mft$b$b$b */
            public static final class b extends b {
                public static final b a = new b();

                private b() {
                    super();
                }

                public final String toString() {
                    return "Start";
                }
            }

            /* renamed from: mft$b$b$a */
            public static final class a extends b {
                public static final a a = new a();

                private a() {
                    super();
                }

                public final String toString() {
                    return "Loading";
                }
            }

            private b() {
                super();
            }

            public /* synthetic */ b(byte b) {
                this();
            }
        }

        /* renamed from: mft$b$c */
        public static final class c extends b {
            public static final c a = new c();

            private c() {
                super();
            }

            public final String toString() {
                return "Triggered";
            }
        }

        /* renamed from: mft$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }

            public final String toString() {
                return "Hidden";
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }
}
