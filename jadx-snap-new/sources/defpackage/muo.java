package defpackage;

import java.util.List;

/* renamed from: muo */
public abstract class muo {

    /* renamed from: muo$a */
    public static final class a extends muo {
        public static final a a = new a();

        private a() {
            super();
        }
    }

    /* renamed from: muo$b */
    public static final class b extends muo {
        final defpackage.mhs.b a;
        final List<defpackage.mhs.b> b;

        private /* synthetic */ b() {
            this(null, ajyw.a);
        }

        public b(defpackage.mhs.b bVar, List<defpackage.mhs.b> list) {
            akcr.b(list, "lensIds");
            super();
            this.a = bVar;
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
            r0 = r3 instanceof defpackage.muo.b;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.muo.b) r3;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.muo$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            defpackage.mhs.b bVar = this.a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            List list = this.b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("SelectedByUser(selectedId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", lensIds=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private muo() {
    }

    public /* synthetic */ muo(byte b) {
        this();
    }
}
