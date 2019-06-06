package defpackage;

import java.util.Arrays;

/* renamed from: gux */
public final class gux {
    final String[] a;

    public gux(String[] strArr) {
        akcr.b(strArr, "dataIds");
        this.a = strArr;
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.gux) r2).a) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof defpackage.gux;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (defpackage.gux) r2;
        r0 = r1.a;
        r2 = r2.a;
        r2 = defpackage.akcr.a(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gux.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String[] strArr = this.a;
        return strArr != null ? Arrays.hashCode(strArr) : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FetchModelsAndTrainMetaData(dataIds=");
        stringBuilder.append(Arrays.toString(this.a));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
