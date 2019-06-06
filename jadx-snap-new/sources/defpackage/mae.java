package defpackage;

import defpackage.mhs.b;

/* renamed from: mae */
public interface mae extends mhu {

    /* renamed from: mae$a */
    public static abstract class a {

        /* renamed from: mae$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        /* renamed from: mae$a$a */
        public static final class a extends a {
            final b a;
            final String b;
            final boolean c;

            public a(b bVar, String str, boolean z) {
                akcr.b(bVar, "hintId");
                akcr.b(str, "hintTranslation");
                super();
                this.a = bVar;
                this.b = str;
                this.c = z;
            }

            public /* synthetic */ a(b bVar, String str, boolean z, int i) {
                if ((i & 2) != 0) {
                    str = "";
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                this(bVar, str, z);
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (akcr.a(this.a, aVar.a) && akcr.a(this.b, aVar.b)) {
                            if ((this.c == aVar.c ? 1 : null) != null) {
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
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                String str = this.b;
                if (str != null) {
                    i = str.hashCode();
                }
                hashCode = (hashCode + i) * 31;
                i = this.c;
                if (i != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Displayed(hintId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", hintTranslation=");
                stringBuilder.append(this.b);
                stringBuilder.append(", autoHide=");
                stringBuilder.append(this.c);
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
