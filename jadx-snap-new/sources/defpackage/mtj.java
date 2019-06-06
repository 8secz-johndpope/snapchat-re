package defpackage;

import java.util.List;

/* renamed from: mtj */
public interface mtj {

    /* renamed from: mtj$b */
    public static final class b implements mtj {
        public static final b a = new b();

        private b() {
        }

        public final ajdp<c> a(a aVar) {
            akcr.b(aVar, "criteria");
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return a;
        }
    }

    /* renamed from: mtj$a */
    public static abstract class a {

        /* renamed from: mtj$a$a */
        public static final class a extends a {
            private final ajdp<?> a;
            private final int b = 50;

            public a(ajdp<?> ajdp) {
                akcr.b(ajdp, "nextPageTrigger");
                super();
                this.a = ajdp;
            }

            public final ajdp<?> a() {
                return this.a;
            }

            public final int b() {
                return 50;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mtj.a.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.mtj.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.mtj.a.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mtj$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                ajdp ajdp = this.a;
                return ((ajdp != null ? ajdp.hashCode() : 0) * 31) + 50;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("All(nextPageTrigger=");
                stringBuilder.append(this.a);
                stringBuilder.append(", itemsPerPage=50)");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mtj$a$b */
        public static final class b extends a {
            private final ajdp<?> a;
            private final int b = 15;

            public b(ajdp<?> ajdp) {
                akcr.b(ajdp, "nextPageTrigger");
                super();
                this.a = ajdp;
            }

            public final ajdp<?> a() {
                return this.a;
            }

            public final int b() {
                return 15;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mtj.a.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.mtj.a.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.mtj.a.b) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mtj$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                ajdp ajdp = this.a;
                return ((ajdp != null ? ajdp.hashCode() : 0) * 31) + 15;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Faces(nextPageTrigger=");
                stringBuilder.append(this.a);
                stringBuilder.append(", itemsPerPage=15)");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public abstract ajdp<?> a();

        public abstract int b();
    }

    /* renamed from: mtj$c */
    public static abstract class c {

        /* renamed from: mtj$c$a */
        public static final class a extends c {
            private final int a;
            private final List<mtl> b;

            private /* synthetic */ a() {
                this(0, ajyw.a);
            }

            public a(int i, List<? extends mtl> list) {
                akcr.b(list, "images");
                super();
                this.a = i;
                this.b = list;
            }

            public final int a() {
                return this.a;
            }

            public final List<mtl> b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if ((this.a == aVar.a ? 1 : null) == null || !akcr.a(this.b, aVar.b)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = this.a * 31;
                List list = this.b;
                return i + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Idle(loadedImagesCount=");
                stringBuilder.append(this.a);
                stringBuilder.append(", images=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mtj$c$b */
        public static final class b extends c {
            private final int a;
            private final List<mtl> b;

            private /* synthetic */ b() {
                this(0, ajyw.a);
            }

            public b(int i, List<? extends mtl> list) {
                akcr.b(list, "images");
                super();
                this.a = i;
                this.b = list;
            }

            public final int a() {
                return this.a;
            }

            public final List<mtl> b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if ((this.a == bVar.a ? 1 : null) == null || !akcr.a(this.b, bVar.b)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = this.a * 31;
                List list = this.b;
                return i + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Processing(loadedImagesCount=");
                stringBuilder.append(this.a);
                stringBuilder.append(", images=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }

        public abstract int a();

        public abstract List<mtl> b();
    }

    ajdp<c> a(a aVar);
}
