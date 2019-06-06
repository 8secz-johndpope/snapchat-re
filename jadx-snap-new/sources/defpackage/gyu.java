package defpackage;

/* renamed from: gyu */
public final class gyu extends gyt {
    public final Integer a;

    public gyu(Integer num) {
        akcr.b(num, "hours");
        super();
        this.a = num;
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.gyu) r2).a) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof defpackage.gyu;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (defpackage.gyu) r2;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyu.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Integer num = this.a;
        return num != null ? num.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MaxLifeHours(hours=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
