package defpackage;

import defpackage.mhs.b;

/* renamed from: maf */
public interface maf extends ajfb<a> {

    /* renamed from: maf$a */
    public static abstract class a {

        /* renamed from: maf$a$a */
        public static abstract class a extends a {
            private final b a;
            private final boolean b;
            private final boolean c;

            /* renamed from: maf$a$a$b */
            public static final class b extends a {
                public final String a;
                public final boolean b;
                final boolean c;
                private final defpackage.mhs.b d;

                private b(defpackage.mhs.b bVar, String str, boolean z) {
                    akcr.b(bVar, "hintId");
                    akcr.b(str, "hintTranslation");
                    super(bVar, z, true, (byte) 0);
                    this.d = bVar;
                    this.a = str;
                    this.b = z;
                    this.c = true;
                }

                public /* synthetic */ b(defpackage.mhs.b bVar, String str, boolean z, byte b) {
                    this(bVar, str, z);
                }

                public final defpackage.mhs.b a() {
                    return this.d;
                }

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof b) {
                            b bVar = (b) obj;
                            if (akcr.a(this.d, bVar.d) && akcr.a(this.a, bVar.a)) {
                                if ((this.b == bVar.b ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    defpackage.mhs.b bVar = this.d;
                    int i = 0;
                    int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                    String str = this.a;
                    if (str != null) {
                        i = str.hashCode();
                    }
                    hashCode = (hashCode + i) * 31;
                    i = this.b;
                    if (i != 0) {
                        i = 1;
                    }
                    return ((hashCode + i) * 31) + 1;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Translated(hintId=");
                    stringBuilder.append(this.d);
                    stringBuilder.append(", hintTranslation=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", autoHide=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", animated=true");
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: maf$a$a$a */
            public static final class a extends a {
                public final b a;
                public final boolean b;
                final boolean c;

                private a(b bVar, boolean z) {
                    akcr.b(bVar, "hintId");
                    super(bVar, z, true, (byte) 0);
                    this.a = bVar;
                    this.b = z;
                    this.c = true;
                }

                public /* synthetic */ a(b bVar, boolean z, byte b) {
                    this(bVar, z);
                }

                public final b a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof a) {
                            a aVar = (a) obj;
                            if (akcr.a(this.a, aVar.a)) {
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
                    b bVar = this.a;
                    int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                    int i = this.b;
                    if (i != 0) {
                        i = 1;
                    }
                    return ((hashCode + i) * 31) + 1;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("NonTranslated(hintId=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", autoHide=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", animated=true");
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            private a(b bVar, boolean z, boolean z2) {
                super();
                this.a = bVar;
                this.b = z;
                this.c = z2;
            }

            public /* synthetic */ a(b bVar, boolean z, boolean z2, byte b) {
                this(bVar, z, true);
            }

            public b a() {
                return this.a;
            }
        }

        /* renamed from: maf$a$b */
        public static final class b extends a {
            public final boolean a;

            public /* synthetic */ b() {
                this(true);
            }

            public b(boolean z) {
                super();
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        if ((this.a == ((b) obj).a ? 1 : null) != null) {
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
                StringBuilder stringBuilder = new StringBuilder("Hidden(animated=");
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
}
