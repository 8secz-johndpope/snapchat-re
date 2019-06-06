package defpackage;

/* renamed from: yfn */
public interface yfn {

    /* renamed from: yfn$a */
    public static final class a implements yfn {
        private final long a;
        private final String b;
        private final long c;
        private final long d;

        public a(long j, String str, long j2, long j3) {
            akcr.b(str, "path");
            this.a = j;
            this.b = str;
            this.c = j2;
            this.d = j3;
        }

        public final long a() {
            return this.a;
        }

        public final long b() {
            return this.c;
        }

        public final long c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.a == aVar.a ? 1 : null) != null && akcr.a(this.b, aVar.b)) {
                        if ((this.c == aVar.c ? 1 : null) != null) {
                            if ((this.d == aVar.d ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.b;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            long j2 = this.c;
            i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            j2 = this.d;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("\n        |Journal.Impl [\n        |  _id: ");
            stringBuilder.append(this.a);
            stringBuilder.append("\n        |  path: ");
            stringBuilder.append(this.b);
            stringBuilder.append("\n        |  size: ");
            stringBuilder.append(this.c);
            stringBuilder.append("\n        |  locked_size: ");
            stringBuilder.append(this.d);
            stringBuilder.append("\n        |]\n        ");
            return akfu.a(stringBuilder.toString(), "|");
        }
    }

    long a();

    long b();

    long c();
}
