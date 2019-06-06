package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhu.a;

/* renamed from: mec */
public interface mec extends mhu<a, c> {

    /* renamed from: mec$a */
    public static abstract class a {

        /* renamed from: mec$a$d */
        public static abstract class d extends a {

            /* renamed from: mec$a$d$a */
            public static final class a extends d {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            /* renamed from: mec$a$d$b */
            public static final class b extends d {
                public static final b a = new b();

                private b() {
                    super();
                }
            }

            private d() {
                super();
            }

            public /* synthetic */ d(byte b) {
                this();
            }
        }

        /* renamed from: mec$a$c */
        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super();
            }
        }

        /* renamed from: mec$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: mec$a$b */
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

    /* renamed from: mec$c */
    public static abstract class c {

        /* renamed from: mec$c$d */
        public static abstract class d extends c {

            /* renamed from: mec$c$d$a */
            public static final class a extends d {
                public static final a a = new a();

                private a() {
                    super();
                }

                public final String toString() {
                    return "Loading";
                }
            }

            /* renamed from: mec$c$d$b */
            public static final class b extends d {
                public static final b a = new b();

                private b() {
                    super();
                }

                public final String toString() {
                    return "Start";
                }
            }

            private d() {
                super();
            }

            public /* synthetic */ d(byte b) {
                this();
            }
        }

        /* renamed from: mec$c$c */
        public static final class c extends c {
            public static final c a = new c();

            private c() {
                super();
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* renamed from: mec$c$a */
        public static final class a extends c {
            public static final a a = new a();

            private a() {
                super();
            }

            public final String toString() {
                return "Activated";
            }
        }

        /* renamed from: mec$c$b */
        public static final class b extends c {
            public final defpackage.mhs.b a;

            public b(defpackage.mhs.b bVar) {
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                super();
                this.a = bVar;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mec.c.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.mec.c.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.mec.c.b) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mec$c$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                defpackage.mhs.b bVar = this.a;
                return bVar != null ? bVar.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Deactivated(lensId=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: mec$b */
    public static final class b implements mec {
        public static final b a = new b();

        private b() {
        }

        public final ajfb<a> a() {
            return myr.a();
        }

        public final ajdp<c> b() {
            return a.a();
        }
    }
}
