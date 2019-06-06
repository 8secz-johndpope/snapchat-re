package defpackage;

import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.miq.f.b;

/* renamed from: lny */
public abstract class lny {

    /* renamed from: lny$a */
    public static abstract class a extends lny {

        /* renamed from: lny$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super();
            }

            public final String toString() {
                return "Static.Default";
            }
        }

        /* renamed from: lny$a$a */
        public static final class a extends a {
            final b a;

            public a(b bVar) {
                akcr.b(bVar, MessageMediaRefModel.URI);
                super();
                this.a = bVar;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lny.a.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lny.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lny.a.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lny$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.a;
                return bVar != null ? bVar.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ByUri(uri=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
            super();
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: lny$b */
    public static final class b extends lny {
        public static final b a = new b();

        private b() {
            super();
        }

        public final String toString() {
            return "UserGenerated";
        }
    }

    private lny() {
    }

    public /* synthetic */ lny(byte b) {
        this();
    }
}
