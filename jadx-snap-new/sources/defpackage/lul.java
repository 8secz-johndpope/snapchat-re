package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhs.b;

/* renamed from: lul */
public interface lul extends mhu<a, b> {

    /* renamed from: lul$b */
    public static abstract class b {

        /* renamed from: lul$b$b */
        public static final class b extends b {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        /* renamed from: lul$b$a */
        public static final class a extends b {
            final defpackage.mhs.b a;

            public a(defpackage.mhs.b bVar) {
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                super();
                this.a = bVar;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lul.b.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lul.b.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lul.b.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lul$b$a.equals(java.lang.Object):boolean");
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

    /* renamed from: lul$a */
    public static abstract class a {

        /* renamed from: lul$a$a */
        public static final class a extends a {
            final b a;

            public a(b bVar) {
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                super();
                this.a = bVar;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lul.a.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lul.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lul.a.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lul$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.a;
                return bVar != null ? bVar.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ShowScanCard(lensId=");
                stringBuilder.append(this.a);
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
}
