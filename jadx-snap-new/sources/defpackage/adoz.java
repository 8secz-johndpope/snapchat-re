package defpackage;

/* renamed from: adoz */
public final class adoz {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final Long e;
    public final gcp f;

    public adoz() {
        this(null, null, null, null, null, null, 63);
    }

    private adoz(String str, String str2, Long l, String str3, Long l2, gcp gcp) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = l2;
        this.f = gcp;
    }

    public /* synthetic */ adoz(String str, String str2, Long l, String str3, Long l2, gcp gcp, int i) {
        String str4 = (i & 1) != 0 ? null : str;
        this(str4, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : gcp);
    }

    /* JADX WARNING: Missing block: B:14:0x0042, code skipped:
            if (defpackage.akcr.a(r2.f, r3.f) != false) goto L_0x0047;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0047;
    L_0x0002:
        r0 = r3 instanceof defpackage.adoz;
        if (r0 == 0) goto L_0x0045;
    L_0x0006:
        r3 = (defpackage.adoz) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x001c:
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0026:
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0030:
        r0 = r2.e;
        r1 = r3.e;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x003a:
        r0 = r2.f;
        r3 = r3.f;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0047;
    L_0x0045:
        r3 = 0;
        return r3;
    L_0x0047:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adoz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        gcp gcp = this.f;
        if (gcp != null) {
            i = gcp.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LastReadWriteInfo(lastWriter=");
        stringBuilder.append(this.a);
        stringBuilder.append(", lastWriteType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", lastWriteTimestamp=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lastReader=");
        stringBuilder.append(this.d);
        stringBuilder.append(", lastReadTimestamp=");
        stringBuilder.append(this.e);
        stringBuilder.append(", lastSnapType=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
