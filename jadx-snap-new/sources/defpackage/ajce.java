package defpackage;

import com.google.common.base.Preconditions;
import defpackage.ajbz.a;

/* renamed from: ajce */
public abstract class ajce extends ajcb {

    /* renamed from: ajce$a */
    public static abstract class a {
        a() {
        }

        public abstract a a(long j);

        public abstract a a(b bVar);

        public abstract ajce a();

        public abstract a b(long j);

        public abstract a c(long j);
    }

    /* renamed from: ajce$b */
    public enum b {
        SENT,
        RECEIVED
    }

    ajce() {
    }

    public static a a(b bVar, long j) {
        return new a().a((b) Preconditions.checkNotNull(bVar, "type")).a(j).b(0).c(0);
    }

    public abstract b a();

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
