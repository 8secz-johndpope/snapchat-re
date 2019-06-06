package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhs.b;

/* renamed from: lqh */
public interface lqh extends mhu<a, b> {

    /* renamed from: lqh$a */
    public static abstract class a {

        /* renamed from: lqh$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        /* renamed from: lqh$a$a */
        public static abstract class a extends a {

            /* renamed from: lqh$a$a$a */
            public static final class a extends a {
                final int a;
                final int b;
                final String c;

                public a() {
                    this(null, 7);
                }

                public a(int i, int i2, String str) {
                    akcr.b(str, "tag");
                    super();
                    this.a = i;
                    this.b = i2;
                    this.c = str;
                }

                public /* synthetic */ a(String str, int i) {
                    if ((i & 4) != 0) {
                        str = lqi.a;
                    }
                    this(0, 0, str);
                }

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof a) {
                            a aVar = (a) obj;
                            if ((this.a == aVar.a ? 1 : null) != null) {
                                if ((this.b == aVar.b ? 1 : null) == null || !akcr.a(this.c, aVar.c)) {
                                    return false;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    int i = ((this.a * 31) + this.b) * 31;
                    String str = this.c;
                    return i + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Idle(x=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", y=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", tag=");
                    stringBuilder.append(this.c);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: lqh$a$a$c */
            public static final class c extends a {
                final b a;
                final boolean b;
                final String c;
                private final int d;
                private final int e;

                private c(b bVar, boolean z, String str) {
                    akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                    akcr.b(str, "tag");
                    super();
                    this.a = bVar;
                    this.b = z;
                    this.d = 0;
                    this.e = 0;
                    this.c = str;
                }

                public /* synthetic */ c(b bVar, boolean z, String str, int i) {
                    if ((i & 2) != 0) {
                        z = false;
                    }
                    if ((i & 16) != 0) {
                        str = lqi.a;
                    }
                    this(bVar, z, str);
                }

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof c) {
                            c cVar = (c) obj;
                            if (akcr.a(this.a, cVar.a)) {
                                if ((this.b == cVar.b ? 1 : null) == null || !akcr.a(this.c, cVar.c)) {
                                    return false;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    b bVar = this.a;
                    int i = 0;
                    int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                    int i2 = this.b;
                    if (i2 != 0) {
                        i2 = 1;
                    }
                    hashCode = (((hashCode + i2) * 31) * 31) * 31;
                    String str = this.c;
                    if (str != null) {
                        i = str.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("WithLens(lensId=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", reapply=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", x=0");
                    stringBuilder.append(", y=0");
                    stringBuilder.append(", tag=");
                    stringBuilder.append(this.c);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: lqh$a$a$b */
            public static final class b extends a {
                final String a;
                private final int b;
                private final int c;

                public b() {
                    this(null, 7);
                }

                private b(String str) {
                    akcr.b(str, "tag");
                    super();
                    this.b = 0;
                    this.c = 0;
                    this.a = str;
                }

                public /* synthetic */ b(String str, int i) {
                    if ((i & 4) != 0) {
                        str = lqi.a;
                    }
                    this(str);
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lqh.a.a.b) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.lqh.a.a.b;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.lqh.a.a.b) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lqh$a$a$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    return (str != null ? str.hashCode() : 0) + 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("WithFirstLens(x=0");
                    stringBuilder.append(", y=0");
                    stringBuilder.append(", tag=");
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
        }

        /* renamed from: lqh$a$c */
        public static final class c extends a {
            final int a;
            final int b;

            public c(int i, int i2) {
                super();
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        if ((this.a == cVar.a ? 1 : null) != null) {
                            if ((this.b == cVar.b ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (this.a * 31) + this.b;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Restart(x=");
                stringBuilder.append(this.a);
                stringBuilder.append(", y=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: lqh$b */
    public static abstract class b {

        /* renamed from: lqh$b$a */
        public static abstract class a extends b {

            /* renamed from: lqh$b$a$c */
            public static final class c extends a {
                public final defpackage.mhs.b a;
                final String b;

                public /* synthetic */ c(defpackage.mhs.b bVar) {
                    this(bVar, lqi.a);
                }

                public c(defpackage.mhs.b bVar, String str) {
                    akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                    akcr.b(str, "tag");
                    super();
                    this.a = bVar;
                    this.b = str;
                }

                /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f;
                L_0x0002:
                    r0 = r3 instanceof defpackage.lqh.b.a.c;
                    if (r0 == 0) goto L_0x001d;
                L_0x0006:
                    r3 = (defpackage.lqh.b.a.c) r3;
                    r0 = r2.a;
                    r1 = r3.a;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x001d;
                L_0x0012:
                    r0 = r2.b;
                    r3 = r3.b;
                    r3 = defpackage.akcr.a(r0, r3);
                    if (r3 == 0) goto L_0x001d;
                L_0x001c:
                    goto L_0x001f;
                L_0x001d:
                    r3 = 0;
                    return r3;
                L_0x001f:
                    r3 = 1;
                    return r3;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lqh$b$a$c.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    defpackage.mhs.b bVar = this.a;
                    int i = 0;
                    int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                    String str = this.b;
                    if (str != null) {
                        i = str.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("WithLens(lensId=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", tag=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: lqh$b$a$a */
            public static final class a extends a {
                final String a;

                public /* synthetic */ a() {
                    this(lqi.a);
                }

                public a(String str) {
                    akcr.b(str, "tag");
                    super();
                    this.a = str;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lqh.b.a.a) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.lqh.b.a.a;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.lqh.b.a.a) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lqh$b$a$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    return str != null ? str.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Idle(tag=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: lqh$b$a$b */
            public static abstract class b extends a {
                private final String a;

                /* renamed from: lqh$b$a$b$b */
                public static final class b extends b {
                    final defpackage.mhs.b a;
                    final String b;

                    public b(defpackage.mhs.b bVar, String str) {
                        akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                        akcr.b(str, "tag");
                        super(str, (byte) 0);
                        this.a = bVar;
                        this.b = str;
                    }

                    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
                    public final boolean equals(java.lang.Object r3) {
                        /*
                        r2 = this;
                        if (r2 == r3) goto L_0x001f;
                    L_0x0002:
                        r0 = r3 instanceof defpackage.lqh.b.a.b.b;
                        if (r0 == 0) goto L_0x001d;
                    L_0x0006:
                        r3 = (defpackage.lqh.b.a.b.b) r3;
                        r0 = r2.a;
                        r1 = r3.a;
                        r0 = defpackage.akcr.a(r0, r1);
                        if (r0 == 0) goto L_0x001d;
                    L_0x0012:
                        r0 = r2.b;
                        r3 = r3.b;
                        r3 = defpackage.akcr.a(r0, r3);
                        if (r3 == 0) goto L_0x001d;
                    L_0x001c:
                        goto L_0x001f;
                    L_0x001d:
                        r3 = 0;
                        return r3;
                    L_0x001f:
                        r3 = 1;
                        return r3;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqh$b$a$b$b.equals(java.lang.Object):boolean");
                    }

                    public final int hashCode() {
                        defpackage.mhs.b bVar = this.a;
                        int i = 0;
                        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                        String str = this.b;
                        if (str != null) {
                            i = str.hashCode();
                        }
                        return hashCode + i;
                    }

                    public final String toString() {
                        StringBuilder stringBuilder = new StringBuilder("LensById(lensId=");
                        stringBuilder.append(this.a);
                        stringBuilder.append(", tag=");
                        stringBuilder.append(this.b);
                        stringBuilder.append(")");
                        return stringBuilder.toString();
                    }
                }

                /* renamed from: lqh$b$a$b$a */
                public static final class a extends b {
                    private final String a;

                    private /* synthetic */ a() {
                        this(lqi.a);
                    }

                    public a(String str) {
                        akcr.b(str, "tag");
                        super(str, (byte) 0);
                        this.a = str;
                    }

                    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lqh.b.a.b.a) r2).a) != false) goto L_0x0015;
     */
                    public final boolean equals(java.lang.Object r2) {
                        /*
                        r1 = this;
                        if (r1 == r2) goto L_0x0015;
                    L_0x0002:
                        r0 = r2 instanceof defpackage.lqh.b.a.b.a;
                        if (r0 == 0) goto L_0x0013;
                    L_0x0006:
                        r2 = (defpackage.lqh.b.a.b.a) r2;
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
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqh$b$a$b$a.equals(java.lang.Object):boolean");
                    }

                    public final int hashCode() {
                        String str = this.a;
                        return str != null ? str.hashCode() : 0;
                    }

                    public final String toString() {
                        StringBuilder stringBuilder = new StringBuilder("FirstLens(tag=");
                        stringBuilder.append(this.a);
                        stringBuilder.append(")");
                        return stringBuilder.toString();
                    }
                }

                private b(String str) {
                    super();
                    this.a = str;
                }

                public /* synthetic */ b(String str, byte b) {
                    this(str);
                }
            }

            private a() {
                super();
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: lqh$b$b */
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
}
