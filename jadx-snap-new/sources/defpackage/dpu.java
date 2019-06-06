package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;

/* renamed from: dpu */
public abstract class dpu {

    /* renamed from: dpu$b */
    public static abstract class b extends dpu {

        /* renamed from: dpu$b$a */
        public static abstract class a extends b {

            /* renamed from: dpu$b$a$d */
            public static final class d extends a {
                public final String a;

                private /* synthetic */ d() {
                    this(null);
                }

                public d(String str) {
                    super();
                    this.a = str;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.dpu.b.a.d) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.dpu.b.a.d;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.dpu.b.a.d) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dpu$b$a$d.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    return str != null ? str.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Placeholder(lensIconUri=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: dpu$b$a$a */
            public static final class a extends a {
                public final String a;

                public a(String str) {
                    akcr.b(str, DiscoverStorySnapModel.LENSID);
                    super();
                    this.a = str;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.dpu.b.a.a) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.dpu.b.a.a;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.dpu.b.a.a) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dpu$b$a$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    return str != null ? str.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("ById(lensId=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: dpu$b$a$b */
            public static final class b extends a {
                public static final b a = new b();

                private b() {
                    super();
                }
            }

            /* renamed from: dpu$b$a$c */
            public static final class c extends a {
                public static final c a = new c();

                private c() {
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

        private b() {
            super();
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: dpu$a */
    public static abstract class a extends dpu {

        /* renamed from: dpu$a$a */
        public static abstract class a extends a {

            /* renamed from: dpu$a$a$a */
            public static final class a extends a {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            /* renamed from: dpu$a$a$b */
            public static final class b extends a {
                public static final b a = new b();

                private b() {
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

        private a() {
            super();
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    private dpu() {
    }

    public /* synthetic */ dpu(byte b) {
        this();
    }
}
