package defpackage;

/* renamed from: adkz */
public final class adkz {
    final aarx a;
    final adla b;
    final Throwable c;

    public adkz(aarx aarx, adla adla, Throwable th) {
        akcr.b(aarx, "failureStage");
        akcr.b(adla, "failureType");
        akcr.b(th, "throwable");
        this.a = aarx;
        this.b = adla;
        this.c = th;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof defpackage.adkz;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (defpackage.adkz) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adkz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        aarx aarx = this.a;
        int i = 0;
        int hashCode = (aarx != null ? aarx.hashCode() : 0) * 31;
        adla adla = this.b;
        hashCode = (hashCode + (adla != null ? adla.hashCode() : 0)) * 31;
        Throwable th = this.c;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FailureEvent(failureStage=");
        stringBuilder.append(this.a);
        stringBuilder.append(", failureType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", throwable=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
