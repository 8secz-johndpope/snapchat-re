package defpackage;

import com.snap.core.db.record.FriendWhoAddedMeModel;

/* renamed from: mde */
public interface mde extends ajfb<b> {

    /* renamed from: mde$a */
    public static abstract class a {

        /* renamed from: mde$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: mde$a$b */
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

    /* renamed from: mde$b */
    public static abstract class b implements mis<mih, b> {

        /* renamed from: mde$b$b */
        public static final class b extends b {
            public final boolean a;

            public /* synthetic */ b() {
                this(false);
            }

            public b(boolean z) {
                super();
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        if ((this.a == ((b) obj).a ? 1 : null) != null) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                boolean z = this.a;
                return z ? 1 : z;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((mih) obj, FriendWhoAddedMeModel.IGNORED);
                return this;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Hidden(animate=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mde$b$a */
        public static final class a extends b {
            public final defpackage.mws.b a;
            public final mih b;

            public /* synthetic */ a(defpackage.mws.b bVar) {
                this(bVar, mih.e);
            }

            private a(defpackage.mws.b bVar, mih mih) {
                akcr.b(bVar, "sponsoredSlug");
                akcr.b(mih, "windowRectangle");
                super();
                this.a = bVar;
                this.b = mih;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.mde.b.a;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.mde.b.a) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mde$b$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                defpackage.mws.b bVar = this.a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                mih mih = this.b;
                if (mih != null) {
                    i = mih.hashCode();
                }
                return hashCode + i;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                obj = (mih) obj;
                akcr.b(obj, "rectangle");
                if ((akcr.a(this.b, obj) ^ 1) == 0) {
                    return this;
                }
                defpackage.mws.b bVar = this.a;
                akcr.b(bVar, "sponsoredSlug");
                akcr.b(obj, "windowRectangle");
                return new a(bVar, obj);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Displayed(sponsoredSlug=");
                stringBuilder.append(this.a);
                stringBuilder.append(", windowRectangle=");
                stringBuilder.append(this.b);
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

    ajdp<a> a();
}
