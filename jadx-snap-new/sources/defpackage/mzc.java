package defpackage;

/* renamed from: mzc */
public interface mzc extends mhu {

    /* renamed from: mzc$a */
    public static abstract class a {

        /* renamed from: mzc$a$a */
        public static abstract class a {

            /* renamed from: mzc$a$a$a */
            public static final class a extends a {
                public static final a a = new a();

                private a() {
                    super();
                }

                public final String toString() {
                    return "CameraFlipButton";
                }
            }

            /* renamed from: mzc$a$a$b */
            public static final class b extends a {
                public static final b a = new b();

                private b() {
                    super();
                }

                public final String toString() {
                    return "TakeSnapButton";
                }
            }

            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: mzc$a$b */
        public static final class b extends a {
            final a a;
            final mih b;

            public b(a aVar, mih mih) {
                akcr.b(aVar, "control");
                akcr.b(mih, "rectangle");
                super();
                this.a = aVar;
                this.b = mih;
            }

            public final a a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.mzc.a.b;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.mzc.a.b) r3;
                r0 = r2.a;
                r1 = r3.a;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mzc$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                a aVar = this.a;
                int i = 0;
                int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
                mih mih = this.b;
                if (mih != null) {
                    i = mih.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Process(control=");
                stringBuilder.append(this.a);
                stringBuilder.append(", rectangle=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public abstract a a();
    }
}
