package defpackage;

/* renamed from: addb */
public final class addb {
    public aljx a;
    public alkl b;
    public alhy c;
    public Double d;

    private addb() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public /* synthetic */ addb(byte b) {
        this();
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof defpackage.addb;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (defpackage.addb) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.addb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        aljx aljx = this.a;
        int i = 0;
        int hashCode = (aljx != null ? aljx.hashCode() : 0) * 31;
        alkl alkl = this.b;
        hashCode = (hashCode + (alkl != null ? alkl.hashCode() : 0)) * 31;
        alhy alhy = this.c;
        hashCode = (hashCode + (alhy != null ? alhy.hashCode() : 0)) * 31;
        Double d = this.d;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapMapState(mapLocation=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tileSetId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", viewport=");
        stringBuilder.append(this.c);
        stringBuilder.append(", zoom=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
