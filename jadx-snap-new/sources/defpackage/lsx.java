package defpackage;

import java.util.List;

/* renamed from: lsx */
abstract class lsx {
    private final String a;
    private final List<mux> b;

    /* renamed from: lsx$a */
    public static final class a extends lsx {
        private final List<mux> a;

        public a(List<mux> list) {
            akcr.b(list, "lenses");
            super(list, (byte) 0);
            this.a = list;
        }

        public final List<mux> a() {
            return this.a;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lsx.a) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.lsx.a;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.lsx.a) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lsx$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            List list = this.a;
            return list != null ? list.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Front(lenses=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: lsx$b */
    public static final class b extends lsx {
        private final List<mux> a;

        public b(List<mux> list) {
            akcr.b(list, "lenses");
            super(list, (byte) 0);
            this.a = list;
        }

        public final List<mux> a() {
            return this.a;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lsx.b) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.lsx.b;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.lsx.b) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lsx$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            List list = this.a;
            return list != null ? list.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Rear(lenses=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private lsx(List<mux> list) {
        this.b = list;
        Object simpleName = getClass().getSimpleName();
        akcr.a(simpleName, "javaClass.simpleName");
        this.a = simpleName;
    }

    public /* synthetic */ lsx(List list, byte b) {
        this(list);
    }

    public List<mux> a() {
        return this.b;
    }
}
