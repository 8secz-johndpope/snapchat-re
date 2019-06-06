package defpackage;

/* renamed from: idg */
public final class idg {
    public String a;
    public final idl b;
    public final ide c;
    public final String d;
    private final ajxe e;

    /* renamed from: idg$a */
    static final class a extends akcs implements akbk<String> {
        private /* synthetic */ idg a;

        a(idg idg) {
            this.a = idg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.toString();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(idg.class), "stringRepresentation", "getStringRepresentation()Ljava/lang/String;");
    }

    public idg(ide ide, String str) {
        akcr.b(ide, "feature");
        akcr.b(str, "tag");
        this.c = ide;
        this.d = str;
        this.b = this.c.getPage();
        this.e = ajxh.a(new a(this));
    }

    public idg(ide ide, String str, String str2) {
        akcr.b(ide, "feature");
        akcr.b(str, "tag");
        this(ide, str);
        this.a = str2;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.idg;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.idg) r3;
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.d;
        r3 = r3.d;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ide ide = this.c;
        int i = 0;
        int hashCode = (ide != null ? ide.hashCode() : 0) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return (String) this.e.b();
    }
}
