package defpackage;

/* renamed from: lxc */
public interface lxc extends ajfb<b> {

    /* renamed from: lxc$c */
    public static final class c implements ajfb<b>, lxc {
        public static final c a = new c();
        private static final ajdp<a> b;
        private final /* synthetic */ ajfb c = myr.a();

        static {
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty<Event>()");
            b = a;
        }

        private c() {
        }

        public final ajdp<a> a() {
            return b;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.c.accept((b) obj);
        }
    }

    /* renamed from: lxc$b */
    public static abstract class b {

        /* renamed from: lxc$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: lxc$b$b */
        public static final class b extends b {
            public final mva a;

            public b(mva mva) {
                akcr.b(mva, "lensAttachment");
                super();
                this.a = mva;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lxc.b.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lxc.b.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lxc.b.b) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lxc$b$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mva mva = this.a;
                return mva != null ? mva.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Shown(lensAttachment=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lxc$a */
    public static abstract class a {

        /* renamed from: lxc$a$a */
        public static final class a extends a {
            final mva a;

            public a(mva mva) {
                akcr.b(mva, "lensAttachment");
                super();
                this.a = mva;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lxc.a.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lxc.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lxc.a.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lxc$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mva mva = this.a;
                return mva != null ? mva.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ActionButtonClicked(lensAttachment=");
                stringBuilder.append(this.a);
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

    ajdp<a> a();
}
