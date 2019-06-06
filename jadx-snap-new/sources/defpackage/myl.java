package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhs.b;
import java.util.List;

/* renamed from: myl */
public interface myl extends mhu<a, b> {

    /* renamed from: myl$a */
    public static abstract class a {

        /* renamed from: myl$a$a */
        public static final class a extends a {
            final b a;

            public a(b bVar) {
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                super();
                this.a = bVar;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.myl.a.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.myl.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.myl.a.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.myl$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.a;
                return bVar != null ? bVar.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("SelectLens(lensId=");
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

    /* renamed from: myl$b */
    public static abstract class b {

        /* renamed from: myl$b$a */
        public static final class a extends b {
            public final mhs a;
            public final List<mux> b;

            public a(mhs mhs, List<mux> list) {
                akcr.b(mhs, "appliedLensId");
                akcr.b(list, "lenses");
                super();
                this.a = mhs;
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
                r0 = r3 instanceof defpackage.myl.b.a;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.myl.b.a) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.myl$b$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mhs mhs = this.a;
                int i = 0;
                int hashCode = (mhs != null ? mhs.hashCode() : 0) * 31;
                List list = this.b;
                if (list != null) {
                    i = list.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Activated(appliedLensId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", lenses=");
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
}
