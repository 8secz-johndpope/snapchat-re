package defpackage;

import defpackage.mny.a;
import defpackage.mny.b;

/* renamed from: loj */
public interface loj extends mhu<a, b> {

    /* renamed from: loj$a */
    public static final class a {
        final b a;

        public a(b bVar) {
            akcr.b(bVar, "remoteAssetRequest");
            this.a = bVar;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.loj.a) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.loj.a;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.loj.a) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.loj$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            b bVar = this.a;
            return bVar != null ? bVar.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Action(remoteAssetRequest=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: loj$b */
    public static final class b {
        final a a;

        public b(a aVar) {
            akcr.b(aVar, "remoteAssetDescriptor");
            this.a = aVar;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.loj.b) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.loj.b;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.loj.b) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.loj$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            a aVar = this.a;
            return aVar != null ? aVar.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Result(remoteAssetDescriptor=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }
}
