package defpackage;

/* renamed from: gfw */
public abstract class gfw {
    private final String a;

    /* renamed from: gfw$c */
    public static final class c extends gfw {
        public static final c a = new c();

        private c() {
            super("Idle", (byte) 0);
        }
    }

    /* renamed from: gfw$a */
    public static final class a extends gfw {
        public final gff a;

        public a(gff gff) {
            akcr.b(gff, "metrics");
            super("Complete", (byte) 0);
            this.a = gff;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.gfw.a) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.gfw.a;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.gfw.a) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gfw$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            gff gff = this.a;
            return gff != null ? gff.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Complete(metrics=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: gfw$b */
    public static final class b extends gfw {
        public static final b a = new b();

        private b() {
            super("Downloading", (byte) 0);
        }
    }

    /* renamed from: gfw$d */
    public static final class d extends gfw {
        public static final d a = new d();

        private d() {
            super("Importing", (byte) 0);
        }
    }

    private gfw(String str) {
        this.a = str;
    }

    public /* synthetic */ gfw(String str, byte b) {
        this(str);
    }

    public String toString() {
        return this.a;
    }
}
