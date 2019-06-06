package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhs.c;

/* renamed from: man */
public interface man extends ajfb<a> {

    /* renamed from: man$a */
    public static abstract class a {

        /* renamed from: man$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: man$a$b */
        public static final class b extends a {
            private final mhs a;
            private final String b;
            private final String c;

            private /* synthetic */ b() {
                String str = "";
                this(c.a, str, str);
            }

            public b(mhs mhs, String str, String str2) {
                akcr.b(mhs, DiscoverStorySnapModel.LENSID);
                akcr.b(str, "regressionMetrics");
                akcr.b(str2, "auxiliaryInfo");
                super();
                this.a = mhs;
                this.b = str;
                this.c = str2;
            }

            /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x0029;
            L_0x0002:
                r0 = r3 instanceof defpackage.man.a.b;
                if (r0 == 0) goto L_0x0027;
            L_0x0006:
                r3 = (defpackage.man.a.b) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0027;
            L_0x0012:
                r0 = r2.b;
                r1 = r3.b;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0027;
            L_0x001c:
                r0 = r2.c;
                r3 = r3.c;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.man$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mhs mhs = this.a;
                int i = 0;
                int hashCode = (mhs != null ? mhs.hashCode() : 0) * 31;
                String str = this.b;
                hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                str = this.c;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("PerformanceReport(lensId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", regressionMetrics=");
                stringBuilder.append(this.b);
                stringBuilder.append(", auxiliaryInfo=");
                stringBuilder.append(this.c);
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
