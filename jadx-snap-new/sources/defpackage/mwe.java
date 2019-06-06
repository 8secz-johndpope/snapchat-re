package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import java.util.List;

/* renamed from: mwe */
public interface mwe {

    /* renamed from: mwe$a */
    public static abstract class a {

        /* renamed from: mwe$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }

            public final String toString() {
                return "QueryCriteria.All";
            }
        }

        /* renamed from: mwe$a$b */
        public static final class b extends a {
            public final defpackage.mhs.b a;

            public b(defpackage.mhs.b bVar) {
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                super();
                this.a = bVar;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mwe.a.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.mwe.a.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.mwe.a.b) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mwe$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                defpackage.mhs.b bVar = this.a;
                return bVar != null ? bVar.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("QueryCriteria.ById[");
                stringBuilder.append(this.a);
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    ajde<List<mux>> a(a aVar);
}
