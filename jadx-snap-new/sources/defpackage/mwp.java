package defpackage;

/* renamed from: mwp */
public interface mwp {

    /* renamed from: mwp$a */
    public static abstract class a {

        /* renamed from: mwp$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        /* renamed from: mwp$a$a */
        public static final class a extends a {
            public final Throwable a;

            public a(Throwable th) {
                akcr.b(th, "throwable");
                super();
                this.a = th;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mwp.a.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.mwp.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.mwp.a.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mwp$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Throwable th = this.a;
                return th != null ? th.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Failed(throwable=");
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

    a a(String str, String str2);
}
