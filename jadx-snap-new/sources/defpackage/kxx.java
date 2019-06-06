package defpackage;

/* renamed from: kxx */
final class kxx {
    static final kxx c = new kxx(null, 3);
    final mmf a;
    final boolean b;

    /* renamed from: kxx$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public kxx() {
        this(null, 3);
    }

    public kxx(mmf mmf, boolean z) {
        akcr.b(mmf, "lensCore");
        this.a = mmf;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kxx) {
                kxx kxx = (kxx) obj;
                if (akcr.a(this.a, kxx.a)) {
                    if ((this.b == kxx.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        mmf mmf = this.a;
        int hashCode = (mmf != null ? mmf.hashCode() : 0) * 31;
        int i = this.b;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensCoreState(lensCore=");
        stringBuilder.append(this.a);
        stringBuilder.append(", markedForDisposal=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
