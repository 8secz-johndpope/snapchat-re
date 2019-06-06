package defpackage;

/* renamed from: tyy */
public final class tyy {
    public final boolean a = tpn.a(this.f);
    public final boolean b = tpt.a(this.f);
    public final boolean c = tpt.b(this.f);
    public final boolean d = tpn.b(this.f);
    public final boolean e = tpn.c(this.f);
    public final tpl f;
    public final tpj g;

    public tyy(tpl tpl, tpj tpj) {
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(tpj, "preloadedConfigs");
        this.f = tpl;
        this.g = tpj;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.g, r3.g) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.tyy;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.tyy) r3;
        r0 = r2.f;
        r1 = r3.f;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.g;
        r3 = r3.g;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyy.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        tpl tpl = this.f;
        int i = 0;
        int hashCode = (tpl != null ? tpl.hashCode() : 0) * 31;
        tpj tpj = this.g;
        if (tpj != null) {
            i = tpj.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreviewToolConfig(previewStartUpConfig=");
        stringBuilder.append(this.f);
        stringBuilder.append(", preloadedConfigs=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
