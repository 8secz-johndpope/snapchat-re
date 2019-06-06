package defpackage;

/* renamed from: dpq */
public abstract class dpq {

    /* renamed from: dpq$b */
    public static abstract class b extends dpq {

        /* renamed from: dpq$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        private b() {
            super();
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: dpq$a */
    public static abstract class a extends dpq {

        /* renamed from: dpq$a$b */
        public static final class b extends a {
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
            if (defpackage.akcr.a(r1.a, ((defpackage.dpq.a.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.dpq.a.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.dpq.a.b) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dpq$a$b.equals(java.lang.Object):boolean");
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

        /* renamed from: dpq$a$a */
        public static abstract class a {

            /* renamed from: dpq$a$a$a */
            public static final class a extends a {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            /* renamed from: dpq$a$a$b */
            public static final class b extends a {
                public static final b a = new b();

                private b() {
                    super();
                }
            }

            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: dpq$a$c */
        public static final class c extends a {
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
            if (defpackage.akcr.a(r1.a, ((defpackage.dpq.a.c) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.dpq.a.c;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.dpq.a.c) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dpq$a$c.equals(java.lang.Object):boolean");
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

        private a() {
            super();
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public abstract a a();
    }

    /* renamed from: dpq$c */
    public static abstract class c extends dpq {

        /* renamed from: dpq$c$a */
        public static abstract class a extends c {

            /* renamed from: dpq$c$a$b */
            public static final class b extends a {
                public static final b a = new b();

                private b() {
                    super();
                }
            }

            /* renamed from: dpq$c$a$a */
            public static final class a extends a {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            private a() {
                super();
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: dpq$c$c */
        public static abstract class c extends c {

            /* renamed from: dpq$c$c$a */
            public static final class a extends c {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            /* renamed from: dpq$c$c$b */
            public static final class b extends c {
                public static final b a = new b();

                private b() {
                    super();
                }
            }

            private c() {
                super();
            }

            public /* synthetic */ c(byte b) {
                this();
            }
        }

        /* renamed from: dpq$c$b */
        public static final class b extends c {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        private c() {
            super();
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    private dpq() {
    }

    public /* synthetic */ dpq(byte b) {
        this();
    }
}
