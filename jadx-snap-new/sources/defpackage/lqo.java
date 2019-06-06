package defpackage;

/* renamed from: lqo */
public abstract class lqo {

    /* renamed from: lqo$a */
    public static abstract class a {

        /* renamed from: lqo$a$c */
        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super();
            }
        }

        /* renamed from: lqo$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        /* renamed from: lqo$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: lqo$c */
    public static final class c extends lqo {
        private final a a;

        public c(a aVar) {
            akcr.b(aVar, "control");
            super();
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lqo.c) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.lqo.c;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.lqo.c) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lqo$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            a aVar = this.a;
            return aVar != null ? aVar.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Show(control=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: lqo$b */
    public static final class b extends lqo {
        private final a a;

        public b(a aVar) {
            akcr.b(aVar, "control");
            super();
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lqo.b) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.lqo.b;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.lqo.b) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lqo$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            a aVar = this.a;
            return aVar != null ? aVar.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Hide(control=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private lqo() {
    }

    public /* synthetic */ lqo(byte b) {
        this();
    }

    public abstract a a();
}
