package defpackage;

/* renamed from: ebs */
public abstract class ebs {
    public final String a;

    /* renamed from: ebs$d */
    public static final class d extends ebs {
        public static final d b = new d();

        private d() {
            super("Streaming", (byte) 0);
        }
    }

    /* renamed from: ebs$b */
    public static final class b extends ebs {
        public final edl b;

        public b(edl edl) {
            akcr.b(edl, "error");
            super("Failed", (byte) 0);
            this.b = edl;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.ebs.b) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.ebs.b;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.ebs.b) r2;
            r0 = r1.b;
            r2 = r2.b;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ebs$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            edl edl = this.b;
            return edl != null ? edl.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Failed(error=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: ebs$c */
    public static final class c extends ebs {
        public static final c b = new c();

        private c() {
            super("Null", (byte) 0);
        }
    }

    /* renamed from: ebs$a */
    public static final class a extends ebs {
        public final edk b;

        public a(edk edk) {
            akcr.b(edk, "reason");
            super("Ended", (byte) 0);
            this.b = edk;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.ebs.a) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.ebs.a;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.ebs.a) r2;
            r0 = r1.b;
            r2 = r2.b;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ebs$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            edk edk = this.b;
            return edk != null ? edk.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Ended(reason=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private ebs(String str) {
        this.a = str;
    }

    public /* synthetic */ ebs(String str, byte b) {
        this(str);
    }
}
