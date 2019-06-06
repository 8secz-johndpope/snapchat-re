package defpackage;

/* renamed from: mws */
public abstract class mws {

    /* renamed from: mws$a */
    public static final class a extends mws {
        public static final a a = new a();

        private a() {
            super();
        }
    }

    /* renamed from: mws$c */
    public static final class c extends mws {
        public final b a;

        public c(b bVar) {
            super();
            this.a = bVar;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mws.c) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.mws.c;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.mws.c) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mws$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            b bVar = this.a;
            return bVar != null ? bVar.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Sponsored(slug=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mws$b */
    public static final class b {
        public final b a;
        public final long b = 3400;

        /* renamed from: mws$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: mws$b$b */
        public static abstract class b {

            /* renamed from: mws$b$b$a */
            public static final class a extends b {
                public final String a;

                public a(String str) {
                    akcr.b(str, "text");
                    super();
                    this.a = str;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mws.b.b.a) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.mws.b.b.a;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.mws.b.b.a) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mws$b$b$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    return str != null ? str.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Custom(text=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: mws$b$b$b */
            public static final class b extends b {
                public static final b a = new b();

                private b() {
                    super();
                }
            }

            private b() {
            }

            public /* synthetic */ b(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public b(b bVar) {
            akcr.b(bVar, "text");
            this.a = bVar;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mws.b) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.mws.b;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.mws.b) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mws$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            b bVar = this.a;
            return ((bVar != null ? bVar.hashCode() : 0) * 31) + 3400;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Slug(text=");
            stringBuilder.append(this.a);
            stringBuilder.append(", durationMs=3400");
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private mws() {
    }

    public /* synthetic */ mws(byte b) {
        this();
    }
}
