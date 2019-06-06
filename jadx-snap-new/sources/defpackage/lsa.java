package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhs.b;
import defpackage.mhu.a;
import java.util.Collection;
import java.util.List;

/* renamed from: lsa */
public interface lsa extends mhu<a, d> {

    /* renamed from: lsa$d */
    public static abstract class d {

        /* renamed from: lsa$d$a */
        public static abstract class a extends d {
            private final ajxe a;
            private final List<mux> b;
            private final List<mux> c;
            private final lqe d;

            /* renamed from: lsa$d$a$b */
            public static final class b extends a {
                public final defpackage.mhs.b a;
                private final List<mux> b;
                private final List<mux> c;
                private final lqe d;
                private final b e;

                public b(defpackage.mhs.b bVar, List<mux> list, List<mux> list2, lqe lqe, b bVar2) {
                    akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                    akcr.b(list, "rightLenses");
                    akcr.b(list2, "leftLenses");
                    akcr.b(lqe, "cameraFacing");
                    akcr.b(bVar2, "tag");
                    super(list, list2, lqe, (byte) 0);
                    this.a = bVar;
                    this.b = list;
                    this.c = list2;
                    this.d = lqe;
                    this.e = bVar2;
                }

                public /* synthetic */ b(defpackage.mhs.b bVar, List list, b bVar2) {
                    this(bVar, list, ajyw.a, lqe.FRONT, bVar2);
                }

                public final List<mux> b() {
                    return this.b;
                }

                public final List<mux> c() {
                    return this.c;
                }

                public final /* bridge */ /* synthetic */ Object d() {
                    return this.e;
                }

                /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (defpackage.akcr.a(r2.e, r3.e) != false) goto L_0x003d;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x003d;
                L_0x0002:
                    r0 = r3 instanceof defpackage.lsa.d.a.b;
                    if (r0 == 0) goto L_0x003b;
                L_0x0006:
                    r3 = (defpackage.lsa.d.a.b) r3;
                    r0 = r2.a;
                    r1 = r3.a;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x003b;
                L_0x0012:
                    r0 = r2.b;
                    r1 = r3.b;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x003b;
                L_0x001c:
                    r0 = r2.c;
                    r1 = r3.c;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x003b;
                L_0x0026:
                    r0 = r2.d;
                    r1 = r3.d;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x003b;
                L_0x0030:
                    r0 = r2.e;
                    r3 = r3.e;
                    r3 = defpackage.akcr.a(r0, r3);
                    if (r3 == 0) goto L_0x003b;
                L_0x003a:
                    goto L_0x003d;
                L_0x003b:
                    r3 = 0;
                    return r3;
                L_0x003d:
                    r3 = 1;
                    return r3;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lsa$d$a$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    defpackage.mhs.b bVar = this.a;
                    int i = 0;
                    int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                    List list = this.b;
                    hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
                    list = this.c;
                    hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
                    lqe lqe = this.d;
                    hashCode = (hashCode + (lqe != null ? lqe.hashCode() : 0)) * 31;
                    b bVar2 = this.e;
                    if (bVar2 != null) {
                        i = bVar2.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("WithSelectedLens(lensId=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", rightLenses=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", leftLenses=");
                    stringBuilder.append(this.c);
                    stringBuilder.append(", cameraFacing=");
                    stringBuilder.append(this.d);
                    stringBuilder.append(", tag=");
                    stringBuilder.append(this.e);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: lsa$d$a$a */
            public static final class a extends a {
                final lqe a;
                private final List<mux> b;
                private final List<mux> c;
                private final b d;

                public a() {
                    this(null, null, null, null, 15);
                }

                public a(List<mux> list, List<mux> list2, lqe lqe, b bVar) {
                    akcr.b(list, "rightLenses");
                    akcr.b(list2, "leftLenses");
                    akcr.b(lqe, "cameraFacing");
                    akcr.b(bVar, "tag");
                    super(list, list2, lqe, (byte) 0);
                    this.b = list;
                    this.c = list2;
                    this.a = lqe;
                    this.d = bVar;
                }

                public /* synthetic */ a(List list, List list2, lqe lqe, b bVar, int i) {
                    if ((i & 1) != 0) {
                        list = ajyw.a;
                    }
                    if ((i & 2) != 0) {
                        list2 = ajyw.a;
                    }
                    if ((i & 4) != 0) {
                        lqe = lqe.FRONT;
                    }
                    if ((i & 8) != 0) {
                        bVar = b.EXTERNAL;
                    }
                    this(list, list2, lqe, bVar);
                }

                public final List<mux> b() {
                    return this.b;
                }

                public final List<mux> c() {
                    return this.c;
                }

                public final /* bridge */ /* synthetic */ Object d() {
                    return this.d;
                }

                /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0033;
                L_0x0002:
                    r0 = r3 instanceof defpackage.lsa.d.a.a;
                    if (r0 == 0) goto L_0x0031;
                L_0x0006:
                    r3 = (defpackage.lsa.d.a.a) r3;
                    r0 = r2.b;
                    r1 = r3.b;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x0031;
                L_0x0012:
                    r0 = r2.c;
                    r1 = r3.c;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x0031;
                L_0x001c:
                    r0 = r2.a;
                    r1 = r3.a;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x0031;
                L_0x0026:
                    r0 = r2.d;
                    r3 = r3.d;
                    r3 = defpackage.akcr.a(r0, r3);
                    if (r3 == 0) goto L_0x0031;
                L_0x0030:
                    goto L_0x0033;
                L_0x0031:
                    r3 = 0;
                    return r3;
                L_0x0033:
                    r3 = 1;
                    return r3;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lsa$d$a$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    List list = this.b;
                    int i = 0;
                    int hashCode = (list != null ? list.hashCode() : 0) * 31;
                    List list2 = this.c;
                    hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
                    lqe lqe = this.a;
                    hashCode = (hashCode + (lqe != null ? lqe.hashCode() : 0)) * 31;
                    b bVar = this.d;
                    if (bVar != null) {
                        i = bVar.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Idle(rightLenses=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", leftLenses=");
                    stringBuilder.append(this.c);
                    stringBuilder.append(", cameraFacing=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", tag=");
                    stringBuilder.append(this.d);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: lsa$d$a$c */
            static final class c extends akcs implements akbk<List<? extends mux>> {
                private /* synthetic */ a a;

                c(a aVar) {
                    this.a = aVar;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    return ajyu.d((Collection) this.a.c(), (Iterable) this.a.b());
                }
            }

            static {
                new aken[1][0] = new akdc(akde.a(a.class), "allLenses", "getAllLenses()Ljava/util/List;");
            }

            private a(List<mux> list, List<mux> list2, lqe lqe) {
                super();
                this.b = list;
                this.c = list2;
                this.d = lqe;
                this.a = ajxh.a(new c(this));
            }

            public /* synthetic */ a(List list, List list2, lqe lqe, byte b) {
                this(list, list2, lqe);
            }

            public final List<mux> a() {
                return (List) this.a.b();
            }

            public List<mux> b() {
                return this.b;
            }

            public List<mux> c() {
                return this.c;
            }

            public Object d() {
                return ajxw.a;
            }
        }

        /* renamed from: lsa$d$b */
        public static final class b extends d {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        private d() {
        }

        public /* synthetic */ d(byte b) {
            this();
        }
    }

    /* renamed from: lsa$a */
    public static abstract class a {

        /* renamed from: lsa$a$a */
        public static abstract class a extends a {

            /* renamed from: lsa$a$a$a */
            public static final class a extends a {
                final b a;

                public /* synthetic */ a() {
                    this(b.EXTERNAL);
                }

                public a(b bVar) {
                    akcr.b(bVar, "tag");
                    super();
                    this.a = bVar;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lsa.a.a.a) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.lsa.a.a.a;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.lsa.a.a.a) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lsa$a$a$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    b bVar = this.a;
                    return bVar != null ? bVar.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Idle(tag=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: lsa$a$a$c */
            public static final class c extends a {
                final b a;
                final b b;

                public /* synthetic */ c(b bVar) {
                    this(bVar, b.EXTERNAL);
                }

                public c(b bVar, b bVar2) {
                    akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                    akcr.b(bVar2, "tag");
                    super();
                    this.a = bVar;
                    this.b = bVar2;
                }

                /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f;
                L_0x0002:
                    r0 = r3 instanceof defpackage.lsa.a.a.c;
                    if (r0 == 0) goto L_0x001d;
                L_0x0006:
                    r3 = (defpackage.lsa.a.a.c) r3;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lsa$a$a$c.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    b bVar = this.a;
                    int i = 0;
                    int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                    b bVar2 = this.b;
                    if (bVar2 != null) {
                        i = bVar2.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("SelectLens(lensId=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", tag=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: lsa$a$a$b */
            public static final class b extends a {
                final b a;

                public /* synthetic */ b() {
                    this(b.EXTERNAL);
                }

                private b(b bVar) {
                    akcr.b(bVar, "tag");
                    super();
                    this.a = bVar;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lsa.a.a.b) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.lsa.a.a.b;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.lsa.a.a.b) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lsa$a$a$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    b bVar = this.a;
                    return bVar != null ? bVar.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("SelectFirstLens(tag=");
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

        /* renamed from: lsa$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: lsa$b */
    public enum b {
        INTERNAL,
        EXTERNAL
    }

    /* renamed from: lsa$c */
    public static final class c implements lsa {
        public static final c a = new c();

        private c() {
        }

        public final ajfb<a> a() {
            return myr.a();
        }

        public final ajdp<d> b() {
            return a.a();
        }
    }
}
