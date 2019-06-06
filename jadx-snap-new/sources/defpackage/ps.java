package defpackage;

import android.annotation.SuppressLint;

/* renamed from: ps */
public interface ps {
    @SuppressLint({"SyntheticAccessor"})
    public static final c a = new c();
    @SuppressLint({"SyntheticAccessor"})
    public static final b b = new b();

    /* renamed from: ps$a */
    public static abstract class a {

        /* renamed from: ps$a$c */
        public static final class c extends a {
            private c() {
            }

            /* synthetic */ c(byte b) {
                this();
            }

            public final String toString() {
                return "SUCCESS";
            }
        }

        /* renamed from: ps$a$b */
        public static final class b extends a {
            private b() {
            }

            /* synthetic */ b(byte b) {
                this();
            }

            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: ps$a$a */
        public static final class a extends a {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.a.getMessage()});
            }
        }

        a() {
        }
    }
}
