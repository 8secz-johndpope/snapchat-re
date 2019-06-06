package defpackage;

import java.util.Map;

/* renamed from: lxr */
public interface lxr extends mhu<a, b> {

    /* renamed from: lxr$a */
    public static abstract class a {

        /* renamed from: lxr$a$b */
        public static abstract class b extends a {

            /* renamed from: lxr$a$b$a */
            public static final class a extends b {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            /* renamed from: lxr$a$b$b */
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

        /* renamed from: lxr$a$a */
        public static abstract class a extends a {

            /* renamed from: lxr$a$a$b */
            public static final class b extends a {
                public static final b a = new b();

                private b() {
                    super();
                }
            }

            /* renamed from: lxr$a$a$a */
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

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: lxr$b */
    public static abstract class b {

        /* renamed from: lxr$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: lxr$b$b */
        public static final class b extends b {
            final min a;
            final double b;

            public b(min min, double d) {
                akcr.b(min, "processingTime");
                super();
                this.a = min;
                this.b = d;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (java.lang.Double.compare(r4.b, r5.b) == 0) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r5) {
                /*
                r4 = this;
                if (r4 == r5) goto L_0x001f;
            L_0x0002:
                r0 = r5 instanceof defpackage.lxr.b.b;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r5 = (defpackage.lxr.b.b) r5;
                r0 = r4.a;
                r1 = r5.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x001d;
            L_0x0012:
                r0 = r4.b;
                r2 = r5.b;
                r5 = java.lang.Double.compare(r0, r2);
                if (r5 != 0) goto L_0x001d;
            L_0x001c:
                goto L_0x001f;
            L_0x001d:
                r5 = 0;
                return r5;
            L_0x001f:
                r5 = 1;
                return r5;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lxr$b$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                min min = this.a;
                int hashCode = (min != null ? min.hashCode() : 0) * 31;
                long doubleToLongBits = Double.doubleToLongBits(this.b);
                return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("FrameStats(processingTime=");
                stringBuilder.append(this.a);
                stringBuilder.append(", cameraAverageFps=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lxr$b$e */
        public static final class e extends b {
            final Map<String, min> a;

            private /* synthetic */ e() {
                this(ajyx.a);
            }

            public e(Map<String, min> map) {
                akcr.b(map, "scopeStatistics");
                super();
                this.a = map;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lxr.b.e) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lxr.b.e;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lxr.b.e) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lxr$b$e.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Map map = this.a;
                return map != null ? map.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ProfilerStats(scopeStatistics=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lxr$b$d */
        public static final class d extends b {
            final long a;
            final long b;
            final long c;

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

        /* renamed from: lxr$b$c */
        public static final class c extends b {
            public static final c a = new c();

            private c() {
                super();
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }
}
