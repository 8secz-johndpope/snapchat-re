package defpackage;

/* renamed from: nak */
public interface nak extends mhu {

    /* renamed from: nak$a */
    public static abstract class a {

        /* renamed from: nak$a$a */
        public static final class a extends a {
            public final boolean a;

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
                StringBuilder stringBuilder = new StringBuilder("UserStatus(isActiveLensUser=");
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
