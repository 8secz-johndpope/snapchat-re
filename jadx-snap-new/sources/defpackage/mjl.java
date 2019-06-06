package defpackage;

import defpackage.mhs.b;
import java.util.List;

/* renamed from: mjl */
public interface mjl {

    /* renamed from: mjl$a */
    public static final class a {
        public static ajdp<b> a() {
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return a;
        }
    }

    /* renamed from: mjl$b */
    public static final class b {
        public static final b a = new b();

        private b() {
        }
    }

    /* renamed from: mjl$c */
    public static abstract class c {

        /* renamed from: mjl$c$a */
        public static final class a {
            final mhs a;
            final String b;
            private final b c;
            private final List<muc> d;

            public a(b bVar, mhs mhs, String str, List<muc> list) {
                akcr.b(bVar, "userId");
                akcr.b(mhs, "avatarId");
                akcr.b(list, "assets");
                this.c = bVar;
                this.a = mhs;
                this.b = str;
                this.d = list;
            }

            /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x0033;
            L_0x0002:
                r0 = r3 instanceof defpackage.mjl.c.a;
                if (r0 == 0) goto L_0x0031;
            L_0x0006:
                r3 = (defpackage.mjl.c.a) r3;
                r0 = r2.c;
                r1 = r3.c;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0031;
            L_0x0012:
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0031;
            L_0x001c:
                r0 = r2.b;
                r1 = r3.b;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mjl$c$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.c;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                mhs mhs = this.a;
                hashCode = (hashCode + (mhs != null ? mhs.hashCode() : 0)) * 31;
                String str = this.b;
                hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                List list = this.d;
                if (list != null) {
                    i = list.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("AvatarMetadata(userId=");
                stringBuilder.append(this.c);
                stringBuilder.append(", avatarId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", metadata=");
                stringBuilder.append(this.b);
                stringBuilder.append(", assets=");
                stringBuilder.append(this.d);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mjl$c$b */
        public static abstract class b extends c {

            /* renamed from: mjl$c$b$a */
            public static final class a extends b {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            /* renamed from: mjl$c$b$b */
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

        /* renamed from: mjl$c$c */
        public static final class c extends c {
            final a a;
            final List<a> b;

            public c(a aVar, List<a> list) {
                akcr.b(aVar, "selfMetadata");
                akcr.b(list, "friendsMetadata");
                super();
                this.a = aVar;
                this.b = list;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.mjl.c.c;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.mjl.c.c) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mjl$c$c.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                a aVar = this.a;
                int i = 0;
                int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
                List list = this.b;
                if (list != null) {
                    i = list.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Metadata(selfMetadata=");
                stringBuilder.append(this.a);
                stringBuilder.append(", friendsMetadata=");
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
    }

    ajdp<b> a();

    mid<c, ajxw> b();
}
