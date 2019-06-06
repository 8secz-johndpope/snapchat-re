package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;

/* renamed from: lum */
public interface lum extends ajfb<b> {

    /* renamed from: lum$b */
    public static abstract class b {

        /* renamed from: lum$b$b */
        public static final class b extends b {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        /* renamed from: lum$b$a */
        public static final class a extends b {
            final defpackage.mhs.b a;

            public a(defpackage.mhs.b bVar) {
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                super();
                this.a = bVar;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lum.b.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lum.b.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lum.b.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lum$b$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                defpackage.mhs.b bVar = this.a;
                return bVar != null ? bVar.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Displayed(lensId=");
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

    /* renamed from: lum$a */
    public static abstract class a {

        /* renamed from: lum$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
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
