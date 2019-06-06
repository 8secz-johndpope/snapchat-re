package defpackage;

import android.graphics.Matrix;

/* renamed from: jvy */
public interface jvy {
    public static final b a = new a().c();
    public static final a b = new 1();

    /* renamed from: jvy$a */
    public interface a {
        void a();

        void a(Throwable th);
    }

    /* renamed from: jvy$b */
    public static class b {
        public final boolean a;
        public final int b;
        private Matrix c = null;

        /* renamed from: jvy$b$a */
        public static class a {
            boolean a;
            int b = 0;
            private Matrix c = null;

            public final a a() {
                this.a = true;
                return this;
            }

            public final a b() {
                this.b = 3;
                return this;
            }

            public final b c() {
                return new b(this);
            }
        }

        public b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
        }
    }

    /* renamed from: jvy$1 */
    static class 1 implements a {
        1() {
        }

        public final void a() {
        }

        public final void a(Throwable th) {
        }
    }
}
