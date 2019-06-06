package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;

/* renamed from: map */
public interface map extends mhu {

    /* renamed from: map$a */
    public static abstract class a {

        /* renamed from: map$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: map$a$b */
        public static final class b extends a {
            final mhs a;

            public b(mhs mhs) {
                akcr.b(mhs, DiscoverStorySnapModel.LENSID);
                super();
                this.a = mhs;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.map.a.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.map.a.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.map.a.b) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.map$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mhs mhs = this.a;
                return mhs != null ? mhs.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ProfilingInitiated(lensId=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: map$a$c */
        public static final class c extends a {
            final mhs a;
            final String b;
            final String c;
            final String d;

            public c(mhs mhs, String str, String str2, String str3) {
                akcr.b(mhs, DiscoverStorySnapModel.LENSID);
                akcr.b(str, "topLevelCpuProfile");
                akcr.b(str2, "topLevelGpuProfile");
                akcr.b(str3, "rawProfile");
                super();
                this.a = mhs;
                this.b = str;
                this.c = str2;
                this.d = str3;
            }

            /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x0033;
            L_0x0002:
                r0 = r3 instanceof defpackage.map.a.c;
                if (r0 == 0) goto L_0x0031;
            L_0x0006:
                r3 = (defpackage.map.a.c) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0031;
            L_0x0012:
                r0 = r2.b;
                r1 = r3.b;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0031;
            L_0x001c:
                r0 = r2.c;
                r1 = r3.c;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.map$a$c.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mhs mhs = this.a;
                int i = 0;
                int hashCode = (mhs != null ? mhs.hashCode() : 0) * 31;
                String str = this.b;
                hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                str = this.c;
                hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                str = this.d;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ProfilingReport(lensId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", topLevelCpuProfile=");
                stringBuilder.append(this.b);
                stringBuilder.append(", topLevelGpuProfile=");
                stringBuilder.append(this.c);
                stringBuilder.append(", rawProfile=");
                stringBuilder.append(this.d);
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
