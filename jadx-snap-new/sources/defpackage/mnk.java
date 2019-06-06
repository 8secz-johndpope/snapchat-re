package defpackage;

/* renamed from: mnk */
public abstract class mnk {
    private final boolean a;

    /* renamed from: mnk$b */
    public static final class b extends mnk {
        public static final b a = new b();

        private b() {
            super(true, (byte) 0);
        }
    }

    /* renamed from: mnk$a */
    public static final class a extends mnk {
        public static final a a = new a();

        private a() {
            super(false, (byte) 0);
        }
    }

    /* renamed from: mnk$c */
    public static final class c extends mnk {
        private final String a;

        public c(String str) {
            akcr.b(str, "cpuAbi");
            super(false, (byte) 0);
            this.a = str;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mnk.c) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.mnk.c;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.mnk.c) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mnk$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            return str != null ? str.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("UnsupportedCpuAbi(cpuAbi=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private mnk(boolean z) {
        this.a = z;
    }

    public /* synthetic */ mnk(boolean z, byte b) {
        this(z);
    }
}
