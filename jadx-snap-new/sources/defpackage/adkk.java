package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;

/* renamed from: adkk */
public interface adkk {

    /* renamed from: adkk$b */
    public interface b {
        void a();

        void a(a aVar);

        void b();

        void c();
    }

    /* renamed from: adkk$a */
    public static abstract class a {

        /* renamed from: adkk$a$a */
        public static abstract class a extends a {
            public final Exception a;
            public final String b;

            /* renamed from: adkk$a$a$a */
            public static final class a extends a {
                public a(Exception exception) {
                    akcr.b(exception, "exception");
                    super(exception, "RELEASE_ERROR", (byte) 0);
                }
            }

            /* renamed from: adkk$a$a$b */
            public static final class b extends a {
                public b(Exception exception) {
                    akcr.b(exception, "exception");
                    super(exception, "RENDER_ERROR", (byte) 0);
                }
            }

            /* renamed from: adkk$a$a$c */
            public static final class c extends a {
                public c(Exception exception) {
                    akcr.b(exception, "exception");
                    super(exception, "SETUP_ERROR", (byte) 0);
                }
            }

            private a(Exception exception, String str) {
                super();
                this.a = exception;
                this.b = str;
            }

            public /* synthetic */ a(Exception exception, String str, byte b) {
                this(exception, str);
            }
        }

        /* renamed from: adkk$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        /* renamed from: adkk$a$c */
        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super();
            }
        }

        /* renamed from: adkk$a$d */
        public static final class d extends a {
            public static final d a = new d();

            private d() {
                super();
            }
        }

        /* renamed from: adkk$a$e */
        public static final class e extends a {
            public static final e a = new e();

            private e() {
                super();
            }
        }

        /* renamed from: adkk$a$f */
        public static final class f extends a {
            public static final f a = new f();

            private f() {
                super();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    void a(int i, int i2);

    void a(long j);

    void a(adie adie);

    void a(adiv adiv);

    void a(b bVar);

    void a(Bitmap bitmap);

    void a(Surface surface);

    void a(boolean z);

    boolean a();

    void b();

    void b(boolean z);

    void c();

    void c(boolean z);

    long d();
}
