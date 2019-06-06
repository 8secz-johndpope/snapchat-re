package defpackage;

/* renamed from: acpq */
public final class acpq extends acps {
    final acld a;
    final acxn b;

    public acpq(acld acld, acxn acxn) {
        akcr.b(acld, "param");
        akcr.b(acxn, "textureEntry");
        super();
        this.a = acld;
        this.b = acxn;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.acpq;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.acpq) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acpq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        acld acld = this.a;
        int i = 0;
        int hashCode = (acld != null ? acld.hashCode() : 0) * 31;
        acxn acxn = this.b;
        if (acxn != null) {
            i = acxn.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WorldEffectParam(param=");
        stringBuilder.append(this.a);
        stringBuilder.append(", textureEntry=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
