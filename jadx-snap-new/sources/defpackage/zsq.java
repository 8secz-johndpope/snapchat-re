package defpackage;

/* renamed from: zsq */
public final class zsq {
    public final zsw a;
    public final boolean b;
    public final boolean c;

    private zsq(zsw zsw) {
        akcr.b(zsw, "userContext");
        this.a = zsw;
        this.b = true;
        this.c = true;
    }

    public /* synthetic */ zsq(zsw zsw, byte b) {
        this(zsw);
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.zsq) r2).a) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof defpackage.zsq;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (defpackage.zsq) r2;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        zsw zsw = this.a;
        return ((((zsw != null ? zsw.hashCode() : 0) * 31) + 1) * 31) + 1;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UnlockablesNetworkConfiguration(userContext=");
        stringBuilder.append(this.a);
        stringBuilder.append(", shouldIncludeSyncInfo=true");
        stringBuilder.append(", shouldIncludeAdsPayload=true");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
