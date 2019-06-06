package defpackage;

import java.util.Map;

/* renamed from: lxs */
public interface lxs extends ajfb<b> {

    /* renamed from: lxs$b */
    public static abstract class b {

        /* renamed from: lxs$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: lxs$b$b */
        public static final class b extends b {
            public final double a;
            public final double b;
            public final double c;
            public final double d;
            public final double e;

            private /* synthetic */ b() {
                this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
            }

            public b(double d, double d2, double d3, double d4, double d5) {
                super();
                this.a = d;
                this.b = d2;
                this.c = d3;
                this.d = d4;
                this.e = d5;
            }

            /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (java.lang.Double.compare(r4.e, r5.e) == 0) goto L_0x003d;
     */
            public final boolean equals(java.lang.Object r5) {
                /*
                r4 = this;
                if (r4 == r5) goto L_0x003d;
            L_0x0002:
                r0 = r5 instanceof defpackage.lxs.b.b;
                if (r0 == 0) goto L_0x003b;
            L_0x0006:
                r5 = (defpackage.lxs.b.b) r5;
                r0 = r4.a;
                r2 = r5.a;
                r0 = java.lang.Double.compare(r0, r2);
                if (r0 != 0) goto L_0x003b;
            L_0x0012:
                r0 = r4.b;
                r2 = r5.b;
                r0 = java.lang.Double.compare(r0, r2);
                if (r0 != 0) goto L_0x003b;
            L_0x001c:
                r0 = r4.c;
                r2 = r5.c;
                r0 = java.lang.Double.compare(r0, r2);
                if (r0 != 0) goto L_0x003b;
            L_0x0026:
                r0 = r4.d;
                r2 = r5.d;
                r0 = java.lang.Double.compare(r0, r2);
                if (r0 != 0) goto L_0x003b;
            L_0x0030:
                r0 = r4.e;
                r2 = r5.e;
                r5 = java.lang.Double.compare(r0, r2);
                if (r5 != 0) goto L_0x003b;
            L_0x003a:
                goto L_0x003d;
            L_0x003b:
                r5 = 0;
                return r5;
            L_0x003d:
                r5 = 1;
                return r5;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lxs$b$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                long doubleToLongBits = Double.doubleToLongBits(this.a);
                int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
                long doubleToLongBits2 = Double.doubleToLongBits(this.b);
                i = (i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
                doubleToLongBits2 = Double.doubleToLongBits(this.c);
                i = (i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
                doubleToLongBits2 = Double.doubleToLongBits(this.d);
                i = (i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
                doubleToLongBits2 = Double.doubleToLongBits(this.e);
                return i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("FrameStats(processingTimeAverageMs=");
                stringBuilder.append(this.a);
                stringBuilder.append(", processingTimeStandardDeviation=");
                stringBuilder.append(this.b);
                stringBuilder.append(", processingTimeAverageFps=");
                stringBuilder.append(this.c);
                stringBuilder.append(", cameraAverageMs=");
                stringBuilder.append(this.d);
                stringBuilder.append(", cameraAverageFps=");
                stringBuilder.append(this.e);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lxs$b$c */
        public static final class c extends b {
            public static final c a = new c();

            private c() {
                super();
            }
        }

        /* renamed from: lxs$b$d */
        public static final class d extends b {
            public final long a;
            public final long b;
            public final long c;

            private /* synthetic */ d() {
                this(0, 0, 0);
            }

            public d(long j, long j2, long j3) {
                super();
                this.a = j;
                this.b = j2;
                this.c = j3;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof d) {
                        d dVar = (d) obj;
                        if ((this.a == dVar.a ? 1 : null) != null) {
                            if ((this.b == dVar.b ? 1 : null) != null) {
                                if ((this.c == dVar.c ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                long j = this.a;
                int i = ((int) (j ^ (j >>> 32))) * 31;
                long j2 = this.b;
                i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
                j2 = this.c;
                return i + ((int) (j2 ^ (j2 >>> 32)));
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("LensInfo(memory=");
                stringBuilder.append(this.a);
                stringBuilder.append(", size=");
                stringBuilder.append(this.b);
                stringBuilder.append(", lastUpdatedTimestamp=");
                stringBuilder.append(this.c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lxs$b$e */
        public static final class e extends b {
            public final Map<String, Double> a;

            private /* synthetic */ e() {
                this(ajyx.a);
            }

            public e(Map<String, Double> map) {
                akcr.b(map, "scopeToAverageMs");
                super();
                this.a = map;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lxs.b.e) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lxs.b.e;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lxs.b.e) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lxs$b$e.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Map map = this.a;
                return map != null ? map.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ProfilerStats(scopeToAverageMs=");
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

    /* renamed from: lxs$a */
    public static abstract class a {

        /* renamed from: lxs$a$a */
        public static abstract class a extends a {

            /* renamed from: lxs$a$a$a */
            public static final class a extends a {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            /* renamed from: lxs$a$a$b */
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

        /* renamed from: lxs$a$b */
        public static abstract class b extends a {

            /* renamed from: lxs$a$b$a */
            public static final class a extends b {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            /* renamed from: lxs$a$b$b */
            public static final class b extends b {
                public static final b a = new b();

                private b() {
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

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    ajdp<a> a();
}
