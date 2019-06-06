package defpackage;

import java.util.Collection;
import java.util.Date;
import java.util.concurrent.Executor;

/* renamed from: akpi */
public abstract class akpi {

    /* renamed from: akpi$b */
    public static abstract class b {
        public abstract Date a();

        public abstract Date b();

        public abstract Date c();

        public abstract Date d();

        public abstract Date e();

        public abstract Date f();

        public abstract Date g();

        public abstract Date h();

        public abstract Date i();

        public abstract boolean j();

        public abstract Long k();

        public abstract Long l();
    }

    /* renamed from: akpi$a */
    public static abstract class a {
        private final Executor a;

        public a(Executor executor) {
            if (executor != null) {
                this.a = executor;
                return;
            }
            throw new IllegalStateException("Executor must not be null");
        }

        public Executor a() {
            return this.a;
        }

        public abstract void a(akpi akpi);
    }

    public abstract Collection<Object> a();

    public abstract b b();
}
