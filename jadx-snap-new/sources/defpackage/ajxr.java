package defpackage;

import java.io.Serializable;

/* renamed from: ajxr */
public final class ajxr<A, B, C> implements Serializable {
    public final A a;
    public final B b;
    public final C c;

    public ajxr(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof defpackage.ajxr;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (defpackage.ajxr) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajxr.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        hashCode = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        obj2 = this.c;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(this.a);
        String str = ppy.d;
        stringBuilder.append(str);
        stringBuilder.append(this.b);
        stringBuilder.append(str);
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
