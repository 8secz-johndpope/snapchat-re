package defpackage;

/* renamed from: mgk */
public interface mgk extends ajfb<b> {

    /* renamed from: mgk$b */
    public static abstract class b {

        /* renamed from: mgk$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: mgk$b$b */
        public static final class b extends b {
            public final String a;
            public final int b;
            public final int c;
            public final mgc d;
            public final mgd e;

            public b(String str, int i, int i2, mgc mgc, mgd mgd) {
                akcr.b(str, "text");
                akcr.b(mgc, "keyboardType");
                akcr.b(mgd, "returnKeyType");
                super();
                this.a = str;
                this.b = i;
                this.c = i2;
                this.d = mgc;
                this.e = mgd;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (akcr.a(this.a, bVar.a)) {
                            if ((this.b == bVar.b ? 1 : null) != null) {
                                if (!((this.c == bVar.c ? 1 : null) != null && akcr.a(this.d, bVar.d) && akcr.a(this.e, bVar.e))) {
                                    return false;
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                String str = this.a;
                int i = 0;
                int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
                mgc mgc = this.d;
                hashCode = (hashCode + (mgc != null ? mgc.hashCode() : 0)) * 31;
                mgd mgd = this.e;
                if (mgd != null) {
                    i = mgd.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("KeyboardShown(text=");
                stringBuilder.append(this.a);
                stringBuilder.append(", start=");
                stringBuilder.append(this.b);
                stringBuilder.append(", end=");
                stringBuilder.append(this.c);
                stringBuilder.append(", keyboardType=");
                stringBuilder.append(this.d);
                stringBuilder.append(", returnKeyType=");
                stringBuilder.append(this.e);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mgk$b$c */
        public static final class c extends b {
            public final int a;
            public final int b;

            public c(int i, int i2) {
                super();
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        if ((this.a == cVar.a ? 1 : null) != null) {
                            if ((this.b == cVar.b ? 1 : null) != null) {
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
                StringBuilder stringBuilder = new StringBuilder("TextSelected(start=");
                stringBuilder.append(this.a);
                stringBuilder.append(", end=");
                stringBuilder.append(this.b);
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

    /* renamed from: mgk$a */
    public static abstract class a {

        /* renamed from: mgk$a$a */
        public static final class a extends a {
            final boolean a;

            public a(boolean z) {
                super();
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        if ((this.a == ((a) obj).a ? 1 : null) != null) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                boolean z = this.a;
                return z ? 1 : z;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("KeyboardStateChanged(keyboardOpen=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mgk$a$b */
        public static final class b extends a {
            final String a;
            final int b;
            final int c;
            final boolean d;
            final boolean e;

            public b(String str, int i, int i2, boolean z, boolean z2) {
                akcr.b(str, "text");
                super();
                this.a = str;
                this.b = i;
                this.c = i2;
                this.d = z;
                this.e = z2;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (akcr.a(this.a, bVar.a)) {
                            if ((this.b == bVar.b ? 1 : null) != null) {
                                if ((this.c == bVar.c ? 1 : null) != null) {
                                    if ((this.d == bVar.d ? 1 : null) != null) {
                                        if ((this.e == bVar.e ? 1 : null) != null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
                int i = this.d;
                if (i != 0) {
                    i = 1;
                }
                hashCode = (hashCode + i) * 31;
                i = this.e;
                if (i != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("TextChanged(text=");
                stringBuilder.append(this.a);
                stringBuilder.append(", start=");
                stringBuilder.append(this.b);
                stringBuilder.append(", end=");
                stringBuilder.append(this.c);
                stringBuilder.append(", done=");
                stringBuilder.append(this.d);
                stringBuilder.append(", shouldNotify=");
                stringBuilder.append(this.e);
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
