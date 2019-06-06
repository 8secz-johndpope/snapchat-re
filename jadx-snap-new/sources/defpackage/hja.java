package defpackage;

/* renamed from: hja */
public final class hja {
    public final hjc a;
    public final float b;

    private /* synthetic */ hja() {
        this(hjb.a);
    }

    public hja(byte b) {
        this();
    }

    private hja(hjc hjc) {
        akcr.b(hjc, "postViewStyle");
        this.a = hjc;
        this.b = 0.8625f;
    }

    /* JADX WARNING: Missing block: B:6:0x0019, code skipped:
            if (java.lang.Float.compare(0.8625f, 0.8625f) == 0) goto L_0x001e;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x001e;
    L_0x0002:
        r0 = r2 instanceof defpackage.hja;
        if (r0 == 0) goto L_0x001c;
    L_0x0006:
        r2 = (defpackage.hja) r2;
        r0 = r1.a;
        r2 = r2.a;
        r2 = defpackage.akcr.a(r0, r2);
        if (r2 == 0) goto L_0x001c;
    L_0x0012:
        r2 = 1063046349; // 0x3f5ccccd float:0.8625 double:5.25214681E-315;
        r2 = java.lang.Float.compare(r2, r2);
        if (r2 != 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001e;
    L_0x001c:
        r2 = 0;
        return r2;
    L_0x001e:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hja.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        hjc hjc = this.a;
        return ((hjc != null ? hjc.hashCode() : 0) * 31) + Float.floatToIntBits(0.8625f);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DiscoverFeedFriendSectionLayoutConfig(postViewStyle=");
        stringBuilder.append(this.a);
        stringBuilder.append(", thumbnailWidthPercentage=0.8625");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
