package defpackage;

/* renamed from: mpb */
public interface mpb {

    /* renamed from: mpb$a */
    public static final class a {
        final int a;
        final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.a == aVar.a ? 1 : null) != null) {
                        if ((this.b == aVar.b ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ActivationRequest(x=");
            stringBuilder.append(this.a);
            stringBuilder.append(", y=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mpb$b */
    public static abstract class b {

        /* renamed from: mpb$b$a */
        public static final class a extends b {
            final int a;
            final int b;

            public a(int i, int i2) {
                super();
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if ((this.a == aVar.a ? 1 : null) != null) {
                            if ((this.b == aVar.b ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return (this.a * 31) + this.b;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("AtPoint(x=");
                stringBuilder.append(this.a);
                stringBuilder.append(", y=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mpb$b$b */
        public static final class b extends b {
            static {
                b bVar = new b();
            }

            private b() {
                super();
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    mid<a, Boolean> a();

    mid<b, Boolean> b();
}
