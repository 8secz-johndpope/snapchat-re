package defpackage;

/* renamed from: mwt */
public final class mwt {
    static final mwt d = new mwt();
    public final mtx a;
    public final String b;
    public final String c;

    /* renamed from: mwt$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    private /* synthetic */ mwt() {
        this(null, null, null);
    }

    public mwt(mtx mtx, String str, String str2) {
        this.a = mtx;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof defpackage.mwt;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (defpackage.mwt) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwt.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        mtx mtx = this.a;
        int i = 0;
        int hashCode = (mtx != null ? mtx.hashCode() : 0) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TrackingInfo(adTrackInfo=");
        stringBuilder.append(this.a);
        stringBuilder.append(", encryptedGeoData=");
        stringBuilder.append(this.b);
        stringBuilder.append(", lensLink=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
