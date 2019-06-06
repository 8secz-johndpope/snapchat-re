package defpackage;

/* renamed from: krv */
public final class krv {
    public static final krv c = new krv(-1, "UN");
    public final long a;
    public final String b;

    /* renamed from: krv$a */
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

    public krv(long j, String str) {
        akcr.b(str, "value");
        this.a = j;
        this.b = str;
    }

    public final aaph a() {
        long j = this.a;
        return j == 50 ? aaph.BARELY_WORKING : j == 75 ? aaph.LOW_END : j == 83 ? aaph.MID_END : j == 92 ? aaph.HIGH_END : aaph.UNKNOWN;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof krv) {
                krv krv = (krv) obj;
                if ((this.a == krv.a ? 1 : null) == null || !akcr.a(this.b, krv.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnalyticsDeviceClass(score=");
        stringBuilder.append(this.a);
        stringBuilder.append(", value=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
