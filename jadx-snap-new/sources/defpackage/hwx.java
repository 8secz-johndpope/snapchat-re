package defpackage;

import defpackage.fth.a;

/* renamed from: hwx */
public final class hwx implements fth {
    final String a;
    final String b;
    private final ftg c;
    private boolean d = true;
    private final a<?> e;

    /* renamed from: hwx$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static hwx a(ftg ftg, String str, String str2, String str3) {
            akcr.b(ftg, "feature");
            akcr.b(str, "studyName");
            akcr.b(str2, "variableName");
            akcr.b(str3, "defaultValue");
            Object a = defpackage.fth.a.a(str3);
            akcr.a(a, "ConfigurationKey.Delegate.fromString(defaultValue)");
            return new hwx(ftg, str, str2, a);
        }
    }

    static {
        a aVar = new a();
    }

    public hwx(ftg ftg, String str, String str2, a<?> aVar) {
        akcr.b(ftg, "feature");
        akcr.b(str, "studyName");
        akcr.b(str2, "variableName");
        akcr.b(aVar, "delegate");
        this.c = ftg;
        this.a = str;
        this.b = str2;
        this.e = aVar;
    }

    public final a<?> a() {
        return this.e;
    }

    public final ftg b() {
        return this.c;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.e, r3.e) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof defpackage.hwx;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (defpackage.hwx) r3;
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.e;
        r3 = r3.e;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ftg ftg = this.c;
        int i = 0;
        int hashCode = (ftg != null ? ftg.hashCode() : 0) * 31;
        String str = this.a;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + 1) * 31;
        a aVar = this.e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String name() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append('.');
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DynamicABConfigurationKey(feature=");
        stringBuilder.append(this.c);
        stringBuilder.append(", studyName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", variableName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", autoExposure=true, delegate=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
