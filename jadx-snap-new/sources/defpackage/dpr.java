package defpackage;

/* renamed from: dpr */
public abstract class dpr {
    public final String a;

    /* renamed from: dpr$b */
    public static final class b extends dpr {
        public static final b b = new b();

        private b() {
            super("LIVE_CAMERA", (byte) 0);
        }
    }

    /* renamed from: dpr$d */
    public static final class d extends dpr {
        public static final d b = new d();

        private d() {
            super("VIDEO_CHAT", (byte) 0);
        }
    }

    /* renamed from: dpr$c */
    public static final class c extends dpr {
        public final String b;

        private /* synthetic */ c() {
            this(null);
        }

        public c(byte b) {
            this();
        }

        public c(String str) {
            super("REPLY_CAMERA", (byte) 0);
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.dpr.c) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.dpr.c;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.dpr.c) r2;
            r0 = r1.b;
            r2 = r2.b;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dpr$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.b;
            return str != null ? str.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ReplyCamera(recipientUserId=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: dpr$a */
    public static final class a extends dpr {
        public static final a b = new a();

        private a() {
            super("AD_TO_LENS", (byte) 0);
        }
    }

    private dpr(String str) {
        this.a = str;
    }

    public /* synthetic */ dpr(String str, byte b) {
        this(str);
    }
}
