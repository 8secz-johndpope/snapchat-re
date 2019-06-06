package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;

/* renamed from: dpv */
public abstract class dpv {

    /* renamed from: dpv$a */
    public static abstract class a extends dpv {

        /* renamed from: dpv$a$a */
        public static abstract class a extends a {

            /* renamed from: dpv$a$a$b */
            public static final class b extends a {
                public static final b a = new b();

                private b() {
                    super();
                }
            }

            /* renamed from: dpv$a$a$a */
            public static abstract class a extends a {

                /* renamed from: dpv$a$a$a$b */
                public static final class b extends a {
                    public static final b a = new b();

                    private b() {
                        super();
                    }
                }

                /* renamed from: dpv$a$a$a$a */
                public static final class a extends a {
                    public final String a;

                    public a(String str) {
                        akcr.b(str, DiscoverStorySnapModel.LENSID);
                        super();
                        this.a = str;
                    }

                    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.dpv.a.a.a.a) r2).a) != false) goto L_0x0015;
     */
                    public final boolean equals(java.lang.Object r2) {
                        /*
                        r1 = this;
                        if (r1 == r2) goto L_0x0015;
                    L_0x0002:
                        r0 = r2 instanceof defpackage.dpv.a.a.a.a;
                        if (r0 == 0) goto L_0x0013;
                    L_0x0006:
                        r2 = (defpackage.dpv.a.a.a.a) r2;
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
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpv$a$a$a$a.equals(java.lang.Object):boolean");
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

                /* renamed from: dpv$a$a$a$c */
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

            private a() {
                super();
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: dpv$a$b */
        public static abstract class b extends a {

            /* renamed from: dpv$a$b$c */
            public static final class c extends b {
                private final String a;
                private final String b;

                public c(String str, String str2) {
                    akcr.b(str, DiscoverStorySnapModel.LENSID);
                    super();
                    this.a = str;
                    this.b = str2;
                }

                public final String a() {
                    return this.a;
                }

                public final String b() {
                    return this.b;
                }

                /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f;
                L_0x0002:
                    r0 = r3 instanceof defpackage.dpv.a.b.c;
                    if (r0 == 0) goto L_0x001d;
                L_0x0006:
                    r3 = (defpackage.dpv.a.b.c) r3;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dpv$a$b$c.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    int i = 0;
                    int hashCode = (str != null ? str.hashCode() : 0) * 31;
                    String str2 = this.b;
                    if (str2 != null) {
                        i = str2.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("FromStory(lensId=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", payload=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: dpv$a$b$a */
            public static final class a extends b {
                private final String a;
                private final String b;

                public a(String str, String str2) {
                    akcr.b(str, DiscoverStorySnapModel.LENSID);
                    super();
                    this.a = str;
                    this.b = str2;
                }

                public final String a() {
                    return this.a;
                }

                public final String b() {
                    return this.b;
                }

                /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f;
                L_0x0002:
                    r0 = r3 instanceof defpackage.dpv.a.b.a;
                    if (r0 == 0) goto L_0x001d;
                L_0x0006:
                    r3 = (defpackage.dpv.a.b.a) r3;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dpv$a$b$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    int i = 0;
                    int hashCode = (str != null ? str.hashCode() : 0) * 31;
                    String str2 = this.b;
                    if (str2 != null) {
                        i = str2.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("FromDirectSnap(lensId=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", payload=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: dpv$a$b$b */
            public static final class b extends b {
                private final String a;
                private final String b;

                public b(String str, String str2) {
                    akcr.b(str, DiscoverStorySnapModel.LENSID);
                    super();
                    this.a = str;
                    this.b = str2;
                }

                public final String a() {
                    return this.a;
                }

                public final String b() {
                    return this.b;
                }

                /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f;
                L_0x0002:
                    r0 = r3 instanceof defpackage.dpv.a.b.b;
                    if (r0 == 0) goto L_0x001d;
                L_0x0006:
                    r3 = (defpackage.dpv.a.b.b) r3;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dpv$a$b$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    int i = 0;
                    int hashCode = (str != null ? str.hashCode() : 0) * 31;
                    String str2 = this.b;
                    if (str2 != null) {
                        i = str2.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("FromMap(lensId=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", payload=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: dpv$a$b$d */
            public static final class d extends b {
                private final String a;
                private final String b;

                private d(String str) {
                    akcr.b(str, DiscoverStorySnapModel.LENSID);
                    super();
                    this.a = str;
                    this.b = null;
                }

                public /* synthetic */ d(String str, byte b) {
                    this(str);
                }

                public final String a() {
                    return this.a;
                }

                public final String b() {
                    return null;
                }

                /* JADX WARNING: Missing block: B:6:0x0017, code skipped:
            if (defpackage.akcr.a(null, null) != false) goto L_0x001c;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x001c;
                L_0x0002:
                    r0 = r2 instanceof defpackage.dpv.a.b.d;
                    if (r0 == 0) goto L_0x001a;
                L_0x0006:
                    r2 = (defpackage.dpv.a.b.d) r2;
                    r0 = r1.a;
                    r2 = r2.a;
                    r2 = defpackage.akcr.a(r0, r2);
                    if (r2 == 0) goto L_0x001a;
                L_0x0012:
                    r2 = 0;
                    r2 = defpackage.akcr.a(r2, r2);
                    if (r2 == 0) goto L_0x001a;
                L_0x0019:
                    goto L_0x001c;
                L_0x001a:
                    r2 = 0;
                    return r2;
                L_0x001c:
                    r2 = 1;
                    return r2;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dpv$a$b$d.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    String str = this.a;
                    return (str != null ? str.hashCode() : 0) * 31;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("FromSwipeToLens(lensId=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", payload=");
                    stringBuilder.append(null);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            private b() {
                super();
            }

            public /* synthetic */ b(byte b) {
                this();
            }

            public abstract String a();

            public abstract String b();
        }

        private a() {
            super();
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    private dpv() {
    }

    public /* synthetic */ dpv(byte b) {
        this();
    }
}
