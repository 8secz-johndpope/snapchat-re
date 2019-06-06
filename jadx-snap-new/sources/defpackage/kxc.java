package defpackage;

/* renamed from: kxc */
public abstract class kxc {

    /* renamed from: kxc$c */
    public static final class c extends kxc {
        final Integer a;
        final Boolean b;
        final abpq c;
        final abpq d;
        final Float e;
        final Float f;
        final Float g;
        private final Float h;
        private final Float i;

        public /* synthetic */ c() {
            this(null, null, null, null, null, null, Float.valueOf(1.0f), null, null);
        }

        public c(Integer num, Boolean bool, abpq abpq, abpq abpq2, Float f, Float f2, Float f3, Float f4, Float f5) {
            super();
            this.a = num;
            this.b = bool;
            this.c = abpq;
            this.d = abpq2;
            this.h = f;
            this.i = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
        }

        /* JADX WARNING: Missing block: B:20:0x0060, code skipped:
            if (defpackage.akcr.a(r2.g, r3.g) != false) goto L_0x0065;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0065;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxc.c;
            if (r0 == 0) goto L_0x0063;
        L_0x0006:
            r3 = (defpackage.kxc.c) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0063;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0063;
        L_0x001c:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0063;
        L_0x0026:
            r0 = r2.d;
            r1 = r3.d;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0063;
        L_0x0030:
            r0 = r2.h;
            r1 = r3.h;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0063;
        L_0x003a:
            r0 = r2.i;
            r1 = r3.i;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0063;
        L_0x0044:
            r0 = r2.e;
            r1 = r3.e;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0063;
        L_0x004e:
            r0 = r2.f;
            r1 = r3.f;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0063;
        L_0x0058:
            r0 = r2.g;
            r3 = r3.g;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0063;
        L_0x0062:
            goto L_0x0065;
        L_0x0063:
            r3 = 0;
            return r3;
        L_0x0065:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxc$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Integer num = this.a;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            Boolean bool = this.b;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            abpq abpq = this.c;
            hashCode = (hashCode + (abpq != null ? abpq.hashCode() : 0)) * 31;
            abpq = this.d;
            hashCode = (hashCode + (abpq != null ? abpq.hashCode() : 0)) * 31;
            Float f = this.h;
            hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
            f = this.i;
            hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
            f = this.e;
            hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
            f = this.f;
            hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
            f = this.g;
            if (f != null) {
                i = f.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Incomplete(cameraOrientation=");
            stringBuilder.append(this.a);
            stringBuilder.append(", cameraFacingFront=");
            stringBuilder.append(this.b);
            stringBuilder.append(", inputSize=");
            stringBuilder.append(this.c);
            stringBuilder.append(", screenSize=");
            stringBuilder.append(this.d);
            stringBuilder.append(", horizontalFieldOfView=");
            stringBuilder.append(this.h);
            stringBuilder.append(", verticalFieldOfView=");
            stringBuilder.append(this.i);
            stringBuilder.append(", zoomRatio=");
            stringBuilder.append(this.e);
            stringBuilder.append(", horizontalViewAngle=");
            stringBuilder.append(this.f);
            stringBuilder.append(", verticalViewAngle=");
            stringBuilder.append(this.g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxc$a */
    public static final class a {
        Integer a;
        Boolean b;
        abpq c;
        abpq d;
        Float e;
        Float f;
        Float g;

        private /* synthetic */ a() {
            this(null, null, null, null, Float.valueOf(1.0f), null, null);
        }

        public a(Integer num, Boolean bool, abpq abpq, abpq abpq2, Float f, Float f2, Float f3) {
            this.a = num;
            this.b = bool;
            this.c = abpq;
            this.d = abpq2;
            this.e = f;
            this.f = f2;
            this.g = f3;
        }

        private static float a(float f, float f2) {
            double tan = Math.tan(Math.toRadians((double) (f2 / 2.0f)));
            double d = (double) f;
            Double.isNaN(d);
            return (float) (Math.toDegrees(Math.atan(tan / d)) * 2.0d);
        }

        private static Float a(Float f, Float f2) {
            return (f == null || f2 == null) ? null : Float.valueOf(a.a(f.floatValue(), f2.floatValue()));
        }

        public final kxc a() {
            Integer num = this.a;
            abpq abpq;
            abpq abpq2;
            if (num == null || this.b == null || this.c == null || this.d == null || this.e == null || this.f == null || this.g == null) {
                Integer num2 = this.a;
                Boolean bool = this.b;
                abpq = this.c;
                abpq2 = this.d;
                Float f = this.e;
                Float f2 = this.f;
                return new c(num2, bool, abpq, abpq2, a.a(f, f2), a.a(this.e, this.g), f, f2, this.g);
            }
            if (num == null) {
                akcr.a();
            }
            int intValue = num.intValue();
            Boolean bool2 = this.b;
            if (bool2 == null) {
                akcr.a();
            }
            boolean booleanValue = bool2.booleanValue();
            abpq = this.c;
            if (abpq == null) {
                akcr.a();
            }
            abpq2 = this.d;
            if (abpq2 == null) {
                akcr.a();
            }
            Float f3 = this.e;
            if (f3 == null) {
                akcr.a();
            }
            float floatValue = f3.floatValue();
            f3 = this.f;
            if (f3 == null) {
                akcr.a();
            }
            float floatValue2 = f3.floatValue();
            f3 = this.g;
            if (f3 == null) {
                akcr.a();
            }
            float floatValue3 = f3.floatValue();
            f3 = this.e;
            if (f3 == null) {
                akcr.a();
            }
            float floatValue4 = f3.floatValue();
            Float f4 = this.f;
            if (f4 == null) {
                akcr.a();
            }
            float a = a.a(floatValue4, f4.floatValue());
            f3 = this.e;
            if (f3 == null) {
                akcr.a();
            }
            floatValue4 = f3.floatValue();
            f4 = this.g;
            if (f4 == null) {
                akcr.a();
            }
            return new b(intValue, booleanValue, abpq, abpq2, a, a.a(floatValue4, f4.floatValue()), floatValue, floatValue2, floatValue3);
        }

        /* JADX WARNING: Missing block: B:16:0x004c, code skipped:
            if (defpackage.akcr.a(r2.g, r3.g) != false) goto L_0x0051;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0051;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxc.a;
            if (r0 == 0) goto L_0x004f;
        L_0x0006:
            r3 = (defpackage.kxc.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x004f;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x004f;
        L_0x001c:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x004f;
        L_0x0026:
            r0 = r2.d;
            r1 = r3.d;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x004f;
        L_0x0030:
            r0 = r2.e;
            r1 = r3.e;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x004f;
        L_0x003a:
            r0 = r2.f;
            r1 = r3.f;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x004f;
        L_0x0044:
            r0 = r2.g;
            r3 = r3.g;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x004f;
        L_0x004e:
            goto L_0x0051;
        L_0x004f:
            r3 = 0;
            return r3;
        L_0x0051:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxc$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Integer num = this.a;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            Boolean bool = this.b;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            abpq abpq = this.c;
            hashCode = (hashCode + (abpq != null ? abpq.hashCode() : 0)) * 31;
            abpq = this.d;
            hashCode = (hashCode + (abpq != null ? abpq.hashCode() : 0)) * 31;
            Float f = this.e;
            hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
            f = this.f;
            hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
            f = this.g;
            if (f != null) {
                i = f.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Builder(cameraOrientation=");
            stringBuilder.append(this.a);
            stringBuilder.append(", cameraFacingFront=");
            stringBuilder.append(this.b);
            stringBuilder.append(", inputSize=");
            stringBuilder.append(this.c);
            stringBuilder.append(", screenSize=");
            stringBuilder.append(this.d);
            stringBuilder.append(", zoomRatio=");
            stringBuilder.append(this.e);
            stringBuilder.append(", horizontalViewAngle=");
            stringBuilder.append(this.f);
            stringBuilder.append(", verticalViewAngle=");
            stringBuilder.append(this.g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxc$b */
    public static final class b extends kxc {
        final int a;
        final boolean b;
        final abpq c;
        final abpq d;
        final float e;
        final float f;
        final float g;
        final float h;
        final float i;

        public b(int i, boolean z, abpq abpq, abpq abpq2, float f, float f2, float f3, float f4, float f5) {
            akcr.b(abpq, "inputSize");
            akcr.b(abpq2, "screenSize");
            super();
            this.a = i;
            this.b = z;
            this.c = abpq;
            this.d = abpq2;
            this.e = f;
            this.f = f2;
            this.g = f3;
            this.h = f4;
            this.i = f5;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if ((this.a == bVar.a ? 1 : null) != null) {
                        if (!((this.b == bVar.b ? 1 : null) != null && akcr.a(this.c, bVar.c) && akcr.a(this.d, bVar.d) && Float.compare(this.e, bVar.e) == 0 && Float.compare(this.f, bVar.f) == 0 && Float.compare(this.g, bVar.g) == 0 && Float.compare(this.h, bVar.h) == 0 && Float.compare(this.i, bVar.i) == 0)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.a * 31;
            int i2 = this.b;
            if (i2 != 0) {
                i2 = 1;
            }
            i = (i + i2) * 31;
            abpq abpq = this.c;
            int i3 = 0;
            i = (i + (abpq != null ? abpq.hashCode() : 0)) * 31;
            abpq = this.d;
            if (abpq != null) {
                i3 = abpq.hashCode();
            }
            return ((((((((((i + i3) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Complete(cameraOrientation=");
            stringBuilder.append(this.a);
            stringBuilder.append(", cameraFacingFront=");
            stringBuilder.append(this.b);
            stringBuilder.append(", inputSize=");
            stringBuilder.append(this.c);
            stringBuilder.append(", screenSize=");
            stringBuilder.append(this.d);
            stringBuilder.append(", horizontalFieldOfView=");
            stringBuilder.append(this.e);
            stringBuilder.append(", verticalFieldOfView=");
            stringBuilder.append(this.f);
            stringBuilder.append(", zoomRatio=");
            stringBuilder.append(this.g);
            stringBuilder.append(", horizontalViewAngle=");
            stringBuilder.append(this.h);
            stringBuilder.append(", verticalViewAngle=");
            stringBuilder.append(this.i);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private kxc() {
    }

    public /* synthetic */ kxc(byte b) {
        this();
    }
}
