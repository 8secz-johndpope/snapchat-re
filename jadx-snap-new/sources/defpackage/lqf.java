package defpackage;

/* renamed from: lqf */
public abstract class lqf {

    /* renamed from: lqf$b */
    public static abstract class b extends lqf {
        private final lqe a;

        /* renamed from: lqf$b$b */
        public static abstract class b extends b {
            private final lqe a;
            private final abpq b;
            private final abpq c;

            /* renamed from: lqf$b$b$b */
            public static final class b extends b {
                private final lqe a;
                private final abpq b;
                private final abpq c;

                public b(lqe lqe, abpq abpq, abpq abpq2) {
                    akcr.b(lqe, "cameraFacing");
                    akcr.b(abpq, "inputSize");
                    akcr.b(abpq2, "previewSize");
                    super(lqe, abpq, abpq2, (byte) 0);
                    this.a = lqe;
                    this.b = abpq;
                    this.c = abpq2;
                }

                public final lqe a() {
                    return this.a;
                }

                public final abpq b() {
                    return this.b;
                }

                public final abpq c() {
                    return this.c;
                }

                /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0029;
                L_0x0002:
                    r0 = r3 instanceof defpackage.lqf.b.b.b;
                    if (r0 == 0) goto L_0x0027;
                L_0x0006:
                    r3 = (defpackage.lqf.b.b.b) r3;
                    r0 = r2.a;
                    r1 = r3.a;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x0027;
                L_0x0012:
                    r0 = r2.b;
                    r1 = r3.b;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x0027;
                L_0x001c:
                    r0 = r2.c;
                    r3 = r3.c;
                    r3 = defpackage.akcr.a(r0, r3);
                    if (r3 == 0) goto L_0x0027;
                L_0x0026:
                    goto L_0x0029;
                L_0x0027:
                    r3 = 0;
                    return r3;
                L_0x0029:
                    r3 = 1;
                    return r3;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lqf$b$b$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    lqe lqe = this.a;
                    int i = 0;
                    int hashCode = (lqe != null ? lqe.hashCode() : 0) * 31;
                    abpq abpq = this.b;
                    hashCode = (hashCode + (abpq != null ? abpq.hashCode() : 0)) * 31;
                    abpq = this.c;
                    if (abpq != null) {
                        i = abpq.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Preview(cameraFacing=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", inputSize=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", previewSize=");
                    stringBuilder.append(this.c);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: lqf$b$b$c */
            public static final class c extends b {
                private final lqe a;
                private final abpq b;
                private final abpq c;

                public c(lqe lqe, abpq abpq, abpq abpq2) {
                    akcr.b(lqe, "cameraFacing");
                    akcr.b(abpq, "inputSize");
                    akcr.b(abpq2, "previewSize");
                    super(lqe, abpq, abpq2, (byte) 0);
                    this.a = lqe;
                    this.b = abpq;
                    this.c = abpq2;
                }

                public final lqe a() {
                    return this.a;
                }

                public final abpq b() {
                    return this.b;
                }

                public final abpq c() {
                    return this.c;
                }

                /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0029;
                L_0x0002:
                    r0 = r3 instanceof defpackage.lqf.b.b.c;
                    if (r0 == 0) goto L_0x0027;
                L_0x0006:
                    r3 = (defpackage.lqf.b.b.c) r3;
                    r0 = r2.a;
                    r1 = r3.a;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x0027;
                L_0x0012:
                    r0 = r2.b;
                    r1 = r3.b;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x0027;
                L_0x001c:
                    r0 = r2.c;
                    r3 = r3.c;
                    r3 = defpackage.akcr.a(r0, r3);
                    if (r3 == 0) goto L_0x0027;
                L_0x0026:
                    goto L_0x0029;
                L_0x0027:
                    r3 = 0;
                    return r3;
                L_0x0029:
                    r3 = 1;
                    return r3;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lqf$b$b$c.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    lqe lqe = this.a;
                    int i = 0;
                    int hashCode = (lqe != null ? lqe.hashCode() : 0) * 31;
                    abpq abpq = this.b;
                    hashCode = (hashCode + (abpq != null ? abpq.hashCode() : 0)) * 31;
                    abpq = this.c;
                    if (abpq != null) {
                        i = abpq.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("VideoRecording(cameraFacing=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", inputSize=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", previewSize=");
                    stringBuilder.append(this.c);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: lqf$b$b$a */
            public static final class a extends b {
                private final lqe a;
                private final abpq b;
                private final abpq c;

                public a(lqe lqe, abpq abpq, abpq abpq2) {
                    akcr.b(lqe, "cameraFacing");
                    akcr.b(abpq, "inputSize");
                    akcr.b(abpq2, "previewSize");
                    super(lqe, abpq, abpq2, (byte) 0);
                    this.a = lqe;
                    this.b = abpq;
                    this.c = abpq2;
                }

                public final lqe a() {
                    return this.a;
                }

                public final abpq b() {
                    return this.b;
                }

                public final abpq c() {
                    return this.c;
                }

                /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0029;
                L_0x0002:
                    r0 = r3 instanceof defpackage.lqf.b.b.a;
                    if (r0 == 0) goto L_0x0027;
                L_0x0006:
                    r3 = (defpackage.lqf.b.b.a) r3;
                    r0 = r2.a;
                    r1 = r3.a;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x0027;
                L_0x0012:
                    r0 = r2.b;
                    r1 = r3.b;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x0027;
                L_0x001c:
                    r0 = r2.c;
                    r3 = r3.c;
                    r3 = defpackage.akcr.a(r0, r3);
                    if (r3 == 0) goto L_0x0027;
                L_0x0026:
                    goto L_0x0029;
                L_0x0027:
                    r3 = 0;
                    return r3;
                L_0x0029:
                    r3 = 1;
                    return r3;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lqf$b$b$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    lqe lqe = this.a;
                    int i = 0;
                    int hashCode = (lqe != null ? lqe.hashCode() : 0) * 31;
                    abpq abpq = this.b;
                    hashCode = (hashCode + (abpq != null ? abpq.hashCode() : 0)) * 31;
                    abpq = this.c;
                    if (abpq != null) {
                        i = abpq.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("PhotoCapture(cameraFacing=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", inputSize=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", previewSize=");
                    stringBuilder.append(this.c);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            private b(lqe lqe, abpq abpq, abpq abpq2) {
                super(lqe, (byte) 0);
                this.a = lqe;
                this.b = abpq;
                this.c = abpq2;
            }

            public /* synthetic */ b(lqe lqe, abpq abpq, abpq abpq2, byte b) {
                this(lqe, abpq, abpq2);
            }

            public lqe a() {
                return this.a;
            }

            public abpq b() {
                return this.b;
            }

            public abpq c() {
                return this.c;
            }
        }

        /* renamed from: lqf$b$a */
        public static final class a extends b {
            private final lqe a;

            public a(lqe lqe) {
                akcr.b(lqe, "cameraFacing");
                super(lqe, (byte) 0);
                this.a = lqe;
            }

            public final lqe a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lqf.b.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lqf.b.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lqf.b.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lqf$b$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                lqe lqe = this.a;
                return lqe != null ? lqe.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("NotStreaming(cameraFacing=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private b(lqe lqe) {
            super();
            this.a = lqe;
        }

        public /* synthetic */ b(lqe lqe, byte b) {
            this(lqe);
        }

        public lqe a() {
            return this.a;
        }
    }

    /* renamed from: lqf$a */
    public static final class a extends lqf {
        public static final a a = new a();

        private a() {
            super();
        }
    }

    private lqf() {
    }

    public /* synthetic */ lqf(byte b) {
        this();
    }
}
