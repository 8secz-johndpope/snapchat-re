package defpackage;

/* renamed from: mii */
public abstract class mii {

    /* renamed from: mii$a */
    public static final class a extends mii {
        public final int a;

        public a(int i) {
            super();
            this.a = i;
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
            return this.a;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ItemCentered(position=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mii$b */
    public static final class b extends mii {
        public static final b a = new b();

        private b() {
            super();
        }
    }

    private mii() {
    }

    public /* synthetic */ mii(byte b) {
        this();
    }
}
