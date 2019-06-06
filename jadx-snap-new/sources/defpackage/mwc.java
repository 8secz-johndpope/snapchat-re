package defpackage;

import com.snap.core.db.record.MessageMediaRefModel;

/* renamed from: mwc */
public interface mwc {

    /* renamed from: mwc$a */
    public static abstract class a {

        /* renamed from: mwc$a$a */
        public static final class a extends a {
            private final mux a;
            private final Throwable b;

            public a(mux mux, Throwable th) {
                akcr.b(mux, "lens");
                super();
                this.a = mux;
                this.b = th;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.mwc.a.a;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.mwc.a.a) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mwc$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mux mux = this.a;
                int i = 0;
                int hashCode = (mux != null ? mux.hashCode() : 0) * 31;
                Throwable th = this.b;
                if (th != null) {
                    i = th.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Failed(lens=");
                stringBuilder.append(this.a);
                stringBuilder.append(", error=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mwc$a$b */
        public static final class b extends a {
            final mux a;
            final defpackage.miq.c.a b;

            public b(mux mux, defpackage.miq.c.a aVar) {
                akcr.b(mux, "lens");
                akcr.b(aVar, MessageMediaRefModel.URI);
                super();
                this.a = mux;
                this.b = aVar;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.mwc.a.b;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.mwc.a.b) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mwc$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mux mux = this.a;
                int i = 0;
                int hashCode = (mux != null ? mux.hashCode() : 0) * 31;
                defpackage.miq.c.a aVar = this.b;
                if (aVar != null) {
                    i = aVar.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Success(lens=");
                stringBuilder.append(this.a);
                stringBuilder.append(", uri=");
                stringBuilder.append(this.b);
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

    ajdx<a> a(mux mux);
}
