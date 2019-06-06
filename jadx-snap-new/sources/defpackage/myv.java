package defpackage;

import com.snap.core.db.record.UnlockablesModel;

/* renamed from: myv */
public interface myv {

    /* renamed from: myv$a */
    public static final class a {
        public final String a;
        public final int b;

        private a(String str) {
            akcr.b(str, UnlockablesModel.DATA);
            this.a = str;
            this.b = 1;
        }

        public /* synthetic */ a(String str, byte b) {
            this(str);
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.myv.a) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.myv.a;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.myv.a) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.myv$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + 1;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ScanCardRequest(data=");
            stringBuilder.append(this.a);
            stringBuilder.append(", metadata=1");
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    ajdp<Object> a(a aVar);
}
