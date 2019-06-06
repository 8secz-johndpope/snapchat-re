package defpackage;

import java.util.Arrays;

/* renamed from: gbm */
public interface gbm {

    /* renamed from: gbm$a */
    public static final class a {
        public final aina<hwt, Long> a;
        public final aina<hwp, Long> b;

        public a(aina<hwt, Long> aina, aina<hwp, Long> aina2) {
            akcr.b(aina, "stateAdapter");
            akcr.b(aina2, "scopeAdapter");
            this.a = aina;
            this.b = aina2;
        }
    }

    /* renamed from: gbm$b */
    public static final class b implements gbm {
        private final long a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final long f;
        private final hwt g;
        private final hwp h;
        private final byte[] i;
        private final byte[] j;
        private final long k;

        public b(long j, String str, String str2, String str3, String str4, long j2, hwt hwt, hwp hwp, byte[] bArr, byte[] bArr2, long j3) {
            akcr.b(str, "uuid");
            akcr.b(str2, "type");
            akcr.b(str3, "uniqueTag");
            akcr.b(str4, "groupTag");
            akcr.b(hwt, "state");
            akcr.b(hwp, "scope");
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = j2;
            this.g = hwt;
            this.h = hwp;
            this.i = bArr;
            this.j = bArr2;
            this.k = j3;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public final long d() {
            return this.f;
        }

        public final byte[] e() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if ((this.a == bVar.a ? 1 : null) != null && akcr.a(this.b, bVar.b) && akcr.a(this.c, bVar.c) && akcr.a(this.d, bVar.d) && akcr.a(this.e, bVar.e)) {
                        if ((this.f == bVar.f ? 1 : null) != null && akcr.a(this.g, bVar.g) && akcr.a(this.h, bVar.h) && akcr.a(this.i, bVar.i) && akcr.a(this.j, bVar.j)) {
                            if ((this.k == bVar.k ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final byte[] f() {
            return this.j;
        }

        public final long g() {
            return this.k;
        }

        public final int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.b;
            int i2 = 0;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            str = this.c;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            str = this.d;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            str = this.e;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            long j2 = this.f;
            i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            hwt hwt = this.g;
            i = (i + (hwt != null ? hwt.hashCode() : 0)) * 31;
            hwp hwp = this.h;
            i = (i + (hwp != null ? hwp.hashCode() : 0)) * 31;
            byte[] bArr = this.i;
            i = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
            bArr = this.j;
            if (bArr != null) {
                i2 = Arrays.hashCode(bArr);
            }
            i = (i + i2) * 31;
            long j3 = this.k;
            return i + ((int) (j3 ^ (j3 >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("\n        |DurableJob.Impl [\n        |  _id: ");
            stringBuilder.append(this.a);
            stringBuilder.append("\n        |  uuid: ");
            stringBuilder.append(this.b);
            stringBuilder.append("\n        |  type: ");
            stringBuilder.append(this.c);
            stringBuilder.append("\n        |  uniqueTag: ");
            stringBuilder.append(this.d);
            stringBuilder.append("\n        |  groupTag: ");
            stringBuilder.append(this.e);
            stringBuilder.append("\n        |  scheduledTimestamp: ");
            stringBuilder.append(this.f);
            stringBuilder.append("\n        |  state: ");
            stringBuilder.append(this.g);
            stringBuilder.append("\n        |  scope: ");
            stringBuilder.append(this.h);
            stringBuilder.append("\n        |  config: ");
            stringBuilder.append(this.i);
            stringBuilder.append("\n        |  metadata: ");
            stringBuilder.append(this.j);
            stringBuilder.append("\n        |  attempt: ");
            stringBuilder.append(this.k);
            stringBuilder.append("\n        |]\n        ");
            return akfu.a(stringBuilder.toString(), "|");
        }
    }

    String a();

    String b();

    String c();

    long d();

    byte[] e();

    byte[] f();

    long g();
}
