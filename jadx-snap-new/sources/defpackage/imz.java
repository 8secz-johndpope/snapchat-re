package defpackage;

import java.util.Arrays;

/* renamed from: imz */
public interface imz {

    /* renamed from: imz$a */
    public static final class a {
        final byte[] a;
        final String b;

        public a(byte[] bArr, String str) {
            akcr.b(bArr, "metricFrame");
            akcr.b(str, "id");
            this.a = bArr;
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.imz.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.imz.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.imz$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            byte[] bArr = this.a;
            int i = 0;
            int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("NetworkFailure(metricFrame=");
            stringBuilder.append(Arrays.toString(this.a));
            stringBuilder.append(", id=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    ajdx<akxa<Void>> a(byte[] bArr, String str);
}
