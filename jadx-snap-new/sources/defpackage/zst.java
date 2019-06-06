package defpackage;

import android.location.Location;
import java.util.Map;

/* renamed from: zst */
public abstract class zst {

    /* renamed from: zst$a */
    public static final class a extends zst {
        public final Location a;
        public final long b;
        public final Map<Long, byte[]> c;
        public final idd d;
        private final boolean e;

        private a(Location location, long j, Map<Long, byte[]> map, idd idd) {
            akcr.b(map, "localChecksumMap");
            akcr.b(idd, "callsite");
            super();
            this.a = location;
            this.b = j;
            this.c = map;
            this.e = false;
            this.d = idd;
        }

        public /* synthetic */ a(Location location, long j, Map map, idd idd, byte b) {
            this(location, j, map, idd);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (akcr.a(this.a, aVar.a)) {
                        if (!((this.b == aVar.b ? 1 : null) != null && akcr.a(this.c, aVar.c) && akcr.a(this.d, aVar.d))) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            Location location = this.a;
            int i = 0;
            int hashCode = (location != null ? location.hashCode() : 0) * 31;
            long j = this.b;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            Map map = this.c;
            hashCode = ((hashCode + (map != null ? map.hashCode() : 0)) * 31) * 31;
            idd idd = this.d;
            if (idd != null) {
                i = idd.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("FullSync(location=");
            stringBuilder.append(this.a);
            stringBuilder.append(", requestTimeMillis=");
            stringBuilder.append(this.b);
            stringBuilder.append(", localChecksumMap=");
            stringBuilder.append(this.c);
            stringBuilder.append(", shouldForce=false");
            stringBuilder.append(", callsite=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: zst$b */
    public static abstract class b extends zst {
        private final String a;
        private final boolean b;

        /* renamed from: zst$b$a */
        public static abstract class a extends b {
            private final String a;

            /* renamed from: zst$b$a$a */
            public static final class a extends a {
                public final Map<String, String> a;
                public final String b;
                private final String c;

                public final String a() {
                    return this.c;
                }

                /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x0029;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0029;
                L_0x0002:
                    r0 = r3 instanceof defpackage.zst.b.a.a;
                    if (r0 == 0) goto L_0x0027;
                L_0x0006:
                    r3 = (defpackage.zst.b.a.a) r3;
                    r0 = r2.c;
                    r1 = r3.c;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x0027;
                L_0x0012:
                    r0 = r2.a;
                    r1 = r3.a;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x0027;
                L_0x001c:
                    r0 = r2.b;
                    r3 = r3.b;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zst$b$a$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.c;
                    int i = 0;
                    int hashCode = (str != null ? str.hashCode() : 0) * 31;
                    Map map = this.a;
                    hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
                    String str2 = this.b;
                    if (str2 != null) {
                        i = str2.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Deeplink(id=");
                    stringBuilder.append(this.c);
                    stringBuilder.append(", deeplinkProperties=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", deeplinkAppId=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: zst$b$a$b */
            public static final class b extends a {
                private final String a;

                public b(String str) {
                    akcr.b(str, "id");
                    super(str, (byte) 0);
                    this.a = str;
                }

                public final String a() {
                    return this.a;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.zst.b.a.b) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.zst.b.a.b;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.zst.b.a.b) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zst$b$a$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    return str != null ? str.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Snapcode(id=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            private a(String str) {
                super(str, true, (byte) 0);
                this.a = str;
            }

            public /* synthetic */ a(String str, byte b) {
                this(str);
            }

            public String a() {
                return this.a;
            }
        }

        /* renamed from: zst$b$b */
        public static final class b extends b {
            public final aenr a;
            private final String b;
            private final boolean c;

            public b(String str, boolean z, aenr aenr) {
                akcr.b(str, "id");
                super(str, z, (byte) 0);
                this.b = str;
                this.c = z;
                this.a = aenr;
            }

            public final String a() {
                return this.b;
            }

            public final boolean b() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (akcr.a(this.b, bVar.b)) {
                            if ((this.c == bVar.c ? 1 : null) == null || !akcr.a(this.a, bVar.a)) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                String str = this.b;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                int i2 = this.c;
                if (i2 != 0) {
                    i2 = 1;
                }
                hashCode = (hashCode + i2) * 31;
                aenr aenr = this.a;
                if (aenr != null) {
                    i = aenr.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Lens(id=");
                stringBuilder.append(this.b);
                stringBuilder.append(", forceSync=");
                stringBuilder.append(this.c);
                stringBuilder.append(", response=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: zst$b$c */
        public static abstract class c extends b {
            private final String a;

            /* renamed from: zst$b$c$a */
            public static final class a extends c {
                private final String a;

                public final String a() {
                    return this.a;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.zst.b.c.a) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.zst.b.c.a;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.zst.b.c.a) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zst$b$c$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    return str != null ? str.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Pinned(id=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: zst$b$c$b */
            public static final class b extends c {
                private final String a;

                public b(String str) {
                    akcr.b(str, "id");
                    super(str, (byte) 0);
                    this.a = str;
                }

                public final String a() {
                    return this.a;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.zst.b.c.b) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.zst.b.c.b;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.zst.b.c.b) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zst$b$c$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    return str != null ? str.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Snapcode(id=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            private c(String str) {
                super(str, true, (byte) 0);
                this.a = str;
            }

            public /* synthetic */ c(String str, byte b) {
                this(str);
            }

            public String a() {
                return this.a;
            }
        }

        private b(String str, boolean z) {
            super();
            this.a = str;
            this.b = z;
        }

        public /* synthetic */ b(String str, boolean z, byte b) {
            this(str, z);
        }

        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    private zst() {
    }

    public /* synthetic */ zst(byte b) {
        this();
    }
}
