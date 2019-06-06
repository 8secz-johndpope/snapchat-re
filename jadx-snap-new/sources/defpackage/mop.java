package defpackage;

import java.util.List;

/* renamed from: mop */
public interface mop {

    /* renamed from: mop$b */
    public static abstract class b {

        /* renamed from: mop$b$b */
        public static final class b extends b {
            public static final b a = new b();

            private b() {
                super();
            }

            public final String toString() {
                return "FullFrame";
            }
        }

        /* renamed from: mop$b$e */
        public static final class e extends b {
            final boolean a;
            final float b;
            final float c;
            final float d;
            final float e;

            private /* synthetic */ e() {
                this(false, -10.0f, -10.0f, -10.0f, -10.0f);
            }

            public e(boolean z, float f, float f2, float f3, float f4) {
                super();
                this.a = z;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof e) {
                        e eVar = (e) obj;
                        if (!((this.a == eVar.a ? 1 : null) != null && Float.compare(this.b, eVar.b) == 0 && Float.compare(this.c, eVar.c) == 0 && Float.compare(this.d, eVar.d) == 0 && Float.compare(this.e, eVar.e) == 0)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = this.a;
                if (i != 0) {
                    i = 1;
                }
                return (((((((i * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("TopBar(isEnabled=");
                stringBuilder.append(this.a);
                stringBuilder.append(", bottomLeftX=");
                stringBuilder.append(this.b);
                stringBuilder.append(", bottomLeftY=");
                stringBuilder.append(this.c);
                stringBuilder.append(", topRightX=");
                stringBuilder.append(this.d);
                stringBuilder.append(", topRightY=");
                stringBuilder.append(this.e);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mop$b$d */
        public static final class d extends b {
            final boolean a;
            final float b;
            final float c;
            final float d;
            final float e;

            private /* synthetic */ d() {
                this(false, -10.0f, -10.0f, -10.0f, -10.0f);
            }

            public d(boolean z, float f, float f2, float f3, float f4) {
                super();
                this.a = z;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof d) {
                        d dVar = (d) obj;
                        if (!((this.a == dVar.a ? 1 : null) != null && Float.compare(this.b, dVar.b) == 0 && Float.compare(this.c, dVar.c) == 0 && Float.compare(this.d, dVar.d) == 0 && Float.compare(this.e, dVar.e) == 0)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = this.a;
                if (i != 0) {
                    i = 1;
                }
                return (((((((i * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("RoundButton(isEnabled=");
                stringBuilder.append(this.a);
                stringBuilder.append(", bottomLeftX=");
                stringBuilder.append(this.b);
                stringBuilder.append(", bottomLeftY=");
                stringBuilder.append(this.c);
                stringBuilder.append(", topRightX=");
                stringBuilder.append(this.d);
                stringBuilder.append(", topRightY=");
                stringBuilder.append(this.e);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mop$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }

            public final String toString() {
                return "Capture";
            }
        }

        /* renamed from: mop$b$c */
        public static final class c extends b {
            public static final c a = new c();

            private c() {
                super();
            }

            public final String toString() {
                return "Preview";
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mop$a */
    public static final class a {
        final List<b> a;
        final abpq b;
        final abpq c;

        public a(List<? extends b> list, abpq abpq, abpq abpq2) {
            akcr.b(list, "screenZones");
            akcr.b(abpq, "inputSize");
            akcr.b(abpq2, "previewSize");
            this.a = list;
            this.b = abpq;
            this.c = abpq2;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.mop.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.mop.a) r3;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mop$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            List list = this.a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            abpq abpq = this.b;
            hashCode = (hashCode + (abpq != null ? abpq.hashCode() : 0)) * 31;
            abpq = this.c;
            if (abpq != null) {
                i = abpq.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Result(screenZones=");
            stringBuilder.append(this.a);
            stringBuilder.append(", inputSize=");
            stringBuilder.append(this.b);
            stringBuilder.append(", previewSize=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    mid<a, ajxw> a();
}
