package defpackage;

/* renamed from: abkb */
public final class abkb {
    private final abka a;
    private volatile a b;
    private final abpt<c> c = new abpt();

    /* renamed from: abkb$1 */
    static class 1 extends abpo<abkb> {
        1() {
        }

        public final /* bridge */ /* synthetic */ Object a() {
            return b.a;
        }
    }

    /* renamed from: abkb$a */
    public static class a {
        private final long a;
        private long b = 60000;

        public a(long j) {
            this.a = j;
        }

        public final long a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.a == ((a) obj).a;
        }

        public final int hashCode() {
            long j = this.a;
            return (((int) (j ^ (j >>> 32))) * 31) + 60000;
        }
    }

    /* renamed from: abkb$c */
    public interface c {
    }

    /* renamed from: abkb$b */
    public static class b {
        public static final abkb a = new abkb(new abjz());
    }

    static {
        1 1 = new 1();
    }

    public abkb(abka abka) {
        this.a = abka;
        this.b = this.a.a();
    }

    public final void a(c cVar) {
        this.c.c(cVar);
    }
}
