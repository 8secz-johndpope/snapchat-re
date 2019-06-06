package defpackage;

/* renamed from: mhs */
public abstract class mhs {

    /* renamed from: mhs$b */
    public static final class b extends mhs {
        public final String a;

        public b(int i) {
            this(String.valueOf(i));
        }

        public b(long j) {
            this(String.valueOf(j));
        }

        public b(String str) {
            akcr.b(str, "value");
            super();
            this.a = str;
            if ((akgb.a(this.a) ^ 1) == 0) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mhs.b) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.mhs.b;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.mhs.b) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mhs$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            return str != null ? str.hashCode() : 0;
        }

        public final String toString() {
            return this.a;
        }
    }

    /* renamed from: mhs$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static mhs a(Object obj) {
            akcr.b(obj, "value");
            String obj2 = obj.toString();
            return akgb.a((CharSequence) obj2) ? c.a : new b(obj2);
        }
    }

    /* renamed from: mhs$c */
    public static final class c extends mhs {
        public static final c a = new c();

        private c() {
            super();
        }

        public final String toString() {
            return "Unknown";
        }
    }

    static {
        a aVar = new a();
    }

    private mhs() {
    }

    public /* synthetic */ mhs(byte b) {
        this();
    }
}
