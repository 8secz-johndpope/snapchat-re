package defpackage;

/* renamed from: dnq */
public abstract class dnq {

    /* renamed from: dnq$a */
    public static final class a extends dnq {
        public static final a a = new a();

        private a() {
            super();
        }
    }

    /* renamed from: dnq$b */
    public static final class b extends dnq {
        public final String a;

        public b(String str) {
            akcr.b(str, "text");
            super();
            this.a = str;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.dnq.b) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.dnq.b;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.dnq.b) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dnq$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            return str != null ? str.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WithText(text=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private dnq() {
    }

    public /* synthetic */ dnq(byte b) {
        this();
    }
}
