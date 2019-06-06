package defpackage;

/* renamed from: mou */
public interface mou {

    /* renamed from: mou$a */
    public static abstract class a {

        /* renamed from: mou$a$a */
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
                StringBuilder stringBuilder = new StringBuilder("UpdateKeyboardState(keyboardOpen=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mou$a$b */
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
                StringBuilder stringBuilder = new StringBuilder("UpdateText(text=");
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

    /* renamed from: mou$b */
    public static final class b {
        public static ajdp<c> a() {
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return a;
        }
    }

    /* renamed from: mou$c */
    public static abstract class c {

        /* renamed from: mou$c$a */
        public static final class a extends c {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: mou$c$b */
        public static final class b extends c {
            public final String a;
            public final int b;
            public final int c;
            public final mmq d;
            public final mom e;

            public b(String str, int i, int i2, mmq mmq, mom mom) {
                akcr.b(str, "text");
                akcr.b(mmq, "keyboardType");
                akcr.b(mom, "returnKeyType");
                super();
                this.a = str;
                this.b = i;
                this.c = i2;
                this.d = mmq;
                this.e = mom;
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
                mmq mmq = this.d;
                hashCode = (hashCode + (mmq != null ? mmq.hashCode() : 0)) * 31;
                mom mom = this.e;
                if (mom != null) {
                    i = mom.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("KeyboardRequested(text=");
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

        /* renamed from: mou$c$c */
        public static final class c extends c {
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

        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    ajfb<a> c();

    ajdp<c> d();
}
