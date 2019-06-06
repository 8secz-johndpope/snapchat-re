package defpackage;

/* renamed from: yfq */
public interface yfq {

    /* renamed from: yfq$a */
    public static final class a {
        public final aina<yfk, Long> a;
        public final aina<yfj, byte[]> b;

        public a(aina<yfk, Long> aina, aina<yfj, byte[]> aina2) {
            akcr.b(aina, "statusAdapter");
            akcr.b(aina2, "value_sizesAdapter");
            this.a = aina;
            this.b = aina2;
        }
    }

    /* renamed from: yfq$b */
    public static final class b implements yfq {
        private final long a;
        private final long b;
        private final String c;
        private final long d;
        private final int e;
        private final yfk f;
        private final long g;
        private final long h;
        private final long i;
        private final long j;
        private final yfj k;
        private final Long l;

        public b(long j, long j2, String str, long j3, int i, yfk yfk, long j4, long j5, long j6, long j7, yfj yfj, Long l) {
            String str2 = str;
            yfk yfk2 = yfk;
            akcr.b(str, "key");
            akcr.b(yfk, "status");
            this.a = j;
            this.b = j2;
            this.c = str2;
            this.d = j3;
            this.e = i;
            this.f = yfk2;
            this.g = j4;
            this.h = j5;
            this.i = j6;
            this.j = j7;
            this.k = yfj;
            this.l = l;
        }

        public final String a() {
            return this.c;
        }

        public final long b() {
            return this.d;
        }

        public final int c() {
            return this.e;
        }

        public final yfk d() {
            return this.f;
        }

        public final long e() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if ((this.a == bVar.a ? 1 : null) != null) {
                        if ((this.b == bVar.b ? 1 : null) != null && akcr.a(this.c, bVar.c)) {
                            if ((this.d == bVar.d ? 1 : null) != null) {
                                if ((this.e == bVar.e ? 1 : null) != null && akcr.a(this.f, bVar.f)) {
                                    if ((this.g == bVar.g ? 1 : null) != null) {
                                        if ((this.h == bVar.h ? 1 : null) != null) {
                                            if ((this.i == bVar.i ? 1 : null) != null) {
                                                if (!((this.j == bVar.j ? 1 : null) != null && akcr.a(this.k, bVar.k) && akcr.a(this.l, bVar.l))) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final long f() {
            return this.h;
        }

        public final long g() {
            return this.i;
        }

        public final yfj h() {
            return this.k;
        }

        public final int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            String str = this.c;
            int i2 = 0;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            long j3 = this.d;
            i = (((i + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.e) * 31;
            yfk yfk = this.f;
            i = (i + (yfk != null ? yfk.hashCode() : 0)) * 31;
            j3 = this.g;
            i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            j3 = this.h;
            i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            j3 = this.i;
            i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            j3 = this.j;
            i = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            yfj yfj = this.k;
            i = (i + (yfj != null ? yfj.hashCode() : 0)) * 31;
            Long l = this.l;
            if (l != null) {
                i2 = l.hashCode();
            }
            return i + i2;
        }

        public final Long i() {
            return this.l;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("\n        |Journal_entry.Impl [\n        |  _id: ");
            stringBuilder.append(this.a);
            stringBuilder.append("\n        |  journal_id: ");
            stringBuilder.append(this.b);
            stringBuilder.append("\n        |  key: ");
            stringBuilder.append(this.c);
            stringBuilder.append("\n        |  sequence_number: ");
            stringBuilder.append(this.d);
            stringBuilder.append("\n        |  value_count: ");
            stringBuilder.append(this.e);
            stringBuilder.append("\n        |  status: ");
            stringBuilder.append(this.f);
            stringBuilder.append("\n        |  last_update_time: ");
            stringBuilder.append(this.g);
            stringBuilder.append("\n        |  last_read_time: ");
            stringBuilder.append(this.h);
            stringBuilder.append("\n        |  lock_count: ");
            stringBuilder.append(this.i);
            stringBuilder.append("\n        |  total_size: ");
            stringBuilder.append(this.j);
            stringBuilder.append("\n        |  value_sizes: ");
            stringBuilder.append(this.k);
            stringBuilder.append("\n        |  expiration: ");
            stringBuilder.append(this.l);
            stringBuilder.append("\n        |]\n        ");
            return akfu.a(stringBuilder.toString(), "|");
        }
    }

    String a();

    long b();

    int c();

    yfk d();

    long e();

    long f();

    long g();

    yfj h();

    Long i();
}
