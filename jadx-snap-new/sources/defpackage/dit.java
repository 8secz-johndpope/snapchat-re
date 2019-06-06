package defpackage;

/* renamed from: dit */
public final class dit {
    final boolean a;
    final diu b;
    private final String c;

    /* renamed from: dit$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static dit a(String str) {
            akcr.b(str, "blurb");
            return new dit(diu.MANUAL, str);
        }

        public static dit a(String str, boolean z) {
            akcr.b(str, "blurb");
            return new dit(z ? diu.LEGACY_FORCED : diu.LEGACY, str);
        }

        public static dit b(String str) {
            akcr.b(str, "blurb");
            return a.a(str, false);
        }
    }

    static {
        a aVar = new a();
    }

    public dit(diu diu, String str) {
        akcr.b(diu, "type");
        akcr.b(str, "blurb");
        this.b = diu;
        this.c = str;
        boolean z = this.b == diu.FORCED || this.b == diu.LEGACY_FORCED || this.b == diu.DURABLE_JOB_FORCED;
        this.a = z;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.dit;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.dit) r3;
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.c;
        r3 = r3.c;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dit.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        diu diu = this.b;
        int i = 0;
        int hashCode = (diu != null ? diu.hashCode() : 0) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(':');
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}
