package defpackage;

/* renamed from: bns */
public interface bns {

    /* renamed from: bns$a */
    public static final class a {
        public final bnt a;
        public final bnt b;

        public a(bnt bnt) {
            this(bnt, bnt);
        }

        public a(bnt bnt, bnt bnt2) {
            this.a = (bnt) byo.a((Object) bnt);
            this.b = (bnt) byo.a((Object) bnt2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b);
            }
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public final String toString() {
            String str;
            StringBuilder stringBuilder = new StringBuilder("[");
            stringBuilder.append(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(ppy.d);
                stringBuilder2.append(this.b);
                str = stringBuilder2.toString();
            }
            stringBuilder.append(str);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: bns$b */
    public static final class b implements bns {
        private final long a;
        private final a b;

        public b(long j) {
            this(j, 0);
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? bnt.a : new bnt(0, j2));
        }

        public final long b() {
            return this.a;
        }

        public final a b(long j) {
            return this.b;
        }

        public final boolean k_() {
            return false;
        }
    }

    long b();

    a b(long j);

    boolean k_();
}
