package defpackage;

/* renamed from: acoq */
public final class acoq extends acop {
    private final nkh b;

    public acoq(nkh nkh) {
        akcr.b(nkh, "fd");
        super(nkh, (byte) 0);
        this.b = nkh;
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.acoq) r2).b) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof defpackage.acoq;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (defpackage.acoq) r2;
        r0 = r1.b;
        r2 = r2.b;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acoq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        nkh nkh = this.b;
        return nkh != null ? nkh.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SecondRowBehaviorAddFriend(fd=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
