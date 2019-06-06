package defpackage;

/* renamed from: dva */
public abstract class dva {
    public final duz a;
    private final String b;

    /* renamed from: dva$b */
    public static final class b extends dva {
        public final acih b;

        public /* synthetic */ b() {
            this(null);
        }

        public b(byte b) {
            this();
        }

        public b(acih acih) {
            super(duz.PARTIALLY_VISIBLE, "enteringCameraPage", (byte) 0);
            this.b = acih;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.dva.b) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.dva.b;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.dva.b) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dva$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            acih acih = this.b;
            return acih != null ? acih.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("EnteringCameraPage(payload=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: dva$c */
    public static final class c extends dva {
        private final acih b;

        private /* synthetic */ c() {
            this(null);
        }

        public c(byte b) {
            this();
        }

        public c(acih acih) {
            super(duz.PARTIALLY_VISIBLE, "leavingCameraPage", (byte) 0);
            this.b = acih;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.dva.c) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.dva.c;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.dva.c) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dva$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            acih acih = this.b;
            return acih != null ? acih.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("LeavingCameraPage(payload=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: dva$a */
    public static final class a extends dva {
        private final acih b;

        public /* synthetic */ a() {
            this(null);
        }

        public a(byte b) {
            this();
        }

        public a(acih acih) {
            super(duz.FULLY_VISIBLE, "enteredCameraPage", (byte) 0);
            this.b = acih;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.dva.a) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.dva.a;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.dva.a) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dva$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            acih acih = this.b;
            return acih != null ? acih.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("EnteredCameraPage(payload=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: dva$d */
    public static final class d extends dva {
        public final String b;
        private final acih c;

        public d() {
            this(null, 3);
        }

        public d(acih acih) {
            this(acih, 2);
        }

        public d(acih acih, aciv<zjm, zjk> aciv) {
            String b;
            if (aciv != null) {
                zjm zjm = (zjm) aciv.e();
                if (zjm != null) {
                    b = zjm.b();
                    this(acih, b);
                }
            }
            b = null;
            this(acih, b);
        }

        private d(acih acih, String str) {
            super(duz.HIDDEN, "leftCameraPage", (byte) 0);
            this.c = acih;
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.dva.d;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.dva.d) r3;
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dva$d.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            acih acih = this.c;
            int i = 0;
            int hashCode = (acih != null ? acih.hashCode() : 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("LeftCameraPage(payload=");
            stringBuilder.append(this.c);
            stringBuilder.append(", otherPageType=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private dva(duz duz, String str) {
        this.a = duz;
        this.b = str;
    }

    public /* synthetic */ dva(duz duz, String str, byte b) {
        this(duz, str);
    }
}
