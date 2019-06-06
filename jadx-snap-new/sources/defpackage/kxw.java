package defpackage;

import defpackage.kxz.a;
import java.util.Arrays;

/* renamed from: kxw */
final class kxw {
    final kya a;
    final nau b;
    final byte[] c;
    final a d;

    public kxw(kya kya, nau nau, byte[] bArr, a aVar) {
        akcr.b(aVar, "entryPoint");
        this.a = kya;
        this.b = nau;
        this.c = bArr;
        this.d = aVar;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof defpackage.kxw;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (defpackage.kxw) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.d;
        r3 = r3.d;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        kya kya = this.a;
        int i = 0;
        int hashCode = (kya != null ? kya.hashCode() : 0) * 31;
        nau nau = this.b;
        hashCode = (hashCode + (nau != null ? nau.hashCode() : 0)) * 31;
        byte[] bArr = this.c;
        hashCode = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        a aVar = this.d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LaunchDataRequirements(externalMetadata=");
        stringBuilder.append(this.a);
        stringBuilder.append(", userData=");
        stringBuilder.append(this.b);
        stringBuilder.append(", persistentStore=");
        stringBuilder.append(Arrays.toString(this.c));
        stringBuilder.append(", entryPoint=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
