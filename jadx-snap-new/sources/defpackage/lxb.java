package defpackage;

/* renamed from: lxb */
public interface lxb extends mhu<a, b> {

    /* renamed from: lxb$b */
    public static abstract class b {

        /* renamed from: lxb$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: lxb$b$b */
        public static final class b extends b {
            final mva a;

            public b(mva mva) {
                akcr.b(mva, "lensAttachment");
                super();
                this.a = mva;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lxb.b.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lxb.b.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lxb.b.b) r2;
                r0 = r1.a;
                r2 = r2.a;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lxb$b$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mva mva = this.a;
                return mva != null ? mva.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Shown(lensAttachment=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lxb$a */
    public static abstract class a {

        /* renamed from: lxb$a$a */
        public static final class a extends a {
            final mva a;

            public a(mva mva) {
                akcr.b(mva, "attachment");
                super();
                this.a = mva;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lxb.a.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lxb.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lxb.a.a) r2;
                r0 = r1.a;
                r2 = r2.a;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lxb$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mva mva = this.a;
                return mva != null ? mva.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Open(attachment=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
