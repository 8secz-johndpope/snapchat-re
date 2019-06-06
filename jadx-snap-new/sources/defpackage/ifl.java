package defpackage;

/* renamed from: ifl */
public final class ifl {
    public final ajxe a;
    public final long b;
    public final long c;

    /* renamed from: ifl$a */
    static final class a extends akcs implements akbk<Long> {
        private /* synthetic */ ifl a;

        a(ifl ifl) {
            this.a = ifl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(this.a.c / 1000);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ifl.class), "utcSeconds", "getUtcSeconds()J");
    }

    public ifl(long j, long j2) {
        this.b = j;
        this.c = j2;
        this.a = ajxh.a(new a(this));
    }

    public ifl(ihh ihh) {
        akcr.b(ihh, "clock");
        this(ihh.c(), ihh.a());
    }

    public final long a(ifl ifl) {
        akcr.b(ifl, "other");
        return this.b - ifl.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ifl) {
                ifl ifl = (ifl) obj;
                if ((this.b == ifl.b ? 1 : null) != null) {
                    if ((this.c == ifl.c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkTimeStamp(elapsedMillis=");
        stringBuilder.append(this.b);
        stringBuilder.append(", utcMillis=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
