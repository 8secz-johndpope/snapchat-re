package defpackage;

import java.util.Arrays;

/* renamed from: iak */
public interface iak {

    /* renamed from: iak$a */
    public static final class a implements iak {
        private final String a;
        private final byte[] b;
        private final byte[] c;

        public a(String str, byte[] bArr, byte[] bArr2) {
            akcr.b(str, "hashed_beta");
            this.a = str;
            this.b = bArr;
            this.c = bArr2;
        }

        public final String a() {
            return this.a;
        }

        public final byte[] b() {
            return this.b;
        }

        public final byte[] c() {
            return this.c;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.iak.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.iak.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.iak$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            byte[] bArr = this.b;
            hashCode = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
            bArr = this.c;
            if (bArr != null) {
                i = Arrays.hashCode(bArr);
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("\n        |Fidelius_user_identity.Impl [\n        |  hashed_beta: ");
            stringBuilder.append(this.a);
            stringBuilder.append("\n        |  out_beta: ");
            stringBuilder.append(this.b);
            stringBuilder.append("\n        |  in_beta: ");
            stringBuilder.append(this.c);
            stringBuilder.append("\n        |]\n        ");
            return akfu.a(stringBuilder.toString(), "|");
        }
    }

    String a();

    byte[] b();

    byte[] c();
}
