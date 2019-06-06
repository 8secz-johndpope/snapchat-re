package defpackage;

/* renamed from: sar */
public final class sar {
    public final boolean a = false;
    public final boolean b = false;
    public final boolean c = false;
    public final ifl d;
    public final ifl e;
    public final ifl f;
    public final ifl g;
    public final ifl h;
    public final String i;
    private final ifl j;
    private final ifl k;
    private final boolean l;

    /* renamed from: sar$a */
    public static final class a {
        public boolean a = true;
        public ifl b = sas.a;
        public ifl c = sas.a;
        private ifl d = sas.a;
        private ifl e = sas.a;
        private ifl f = sas.a;
        private ifl g = sas.a;
        private String h = "";
        private ifl i = sas.a;

        public final sar a() {
            return new sar(this.d, this.b, this.c, this.e, this.g, this.f, this.i, this.a, this.h);
        }

        public final void a(ifl ifl) {
            akcr.b(ifl, "<set-?>");
            this.d = ifl;
        }

        public final void a(String str) {
            akcr.b(str, "<set-?>");
            this.h = str;
        }

        public final void b(ifl ifl) {
            akcr.b(ifl, "<set-?>");
            this.e = ifl;
        }

        public final void c(ifl ifl) {
            akcr.b(ifl, "<set-?>");
            this.f = ifl;
        }

        public final void d(ifl ifl) {
            akcr.b(ifl, "<set-?>");
            this.g = ifl;
        }

        public final void e(ifl ifl) {
            akcr.b(ifl, "<set-?>");
            this.c = ifl;
        }

        public final void f(ifl ifl) {
            akcr.b(ifl, "value");
            if (akcr.a(this.g, sas.a)) {
                this.g = ifl;
            }
            this.i = ifl;
        }
    }

    public sar(ifl ifl, ifl ifl2, ifl ifl3, ifl ifl4, ifl ifl5, ifl ifl6, ifl ifl7, boolean z, String str) {
        akcr.b(ifl, "requestReceivedTimestamp");
        akcr.b(ifl2, "requestRejectedTimestamp");
        akcr.b(ifl3, "userInitiatedRequestReceiveTimeStamp");
        akcr.b(ifl4, "requestStartTimestamp");
        akcr.b(ifl5, "responseStartTimestamp");
        akcr.b(ifl6, "redirectReceivedTimestamp");
        akcr.b(ifl7, "responseEndTimestamp");
        akcr.b(str, "redirectDestinationUrl");
        this.d = ifl;
        this.j = ifl2;
        this.k = ifl3;
        this.e = ifl4;
        this.f = ifl5;
        this.g = ifl6;
        this.h = ifl7;
        this.l = z;
        this.i = str;
    }

    public final long a() {
        return Math.max(this.e.a(this.d), -1);
    }

    public final long b() {
        return Math.max(this.h.a(this.e), -1);
    }

    public final Long c() {
        return akcr.a(this.k, sas.a) ? null : Long.valueOf(Math.max(Math.min(this.e.a(this.k), this.e.a(this.d)), -1));
    }

    public final Long d() {
        return akcr.a(this.k, sas.a) ? null : Long.valueOf(Math.max(Math.min(this.h.a(this.k), this.h.a(this.e)), -1));
    }

    public final Long e() {
        return akcr.a(this.j, sas.a) ? null : Long.valueOf(this.j.a(this.d));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sar) {
                sar sar = (sar) obj;
                if (akcr.a(this.d, sar.d) && akcr.a(this.j, sar.j) && akcr.a(this.k, sar.k) && akcr.a(this.e, sar.e) && akcr.a(this.f, sar.f) && akcr.a(this.g, sar.g) && akcr.a(this.h, sar.h)) {
                    if ((this.l == sar.l ? 1 : null) == null || !akcr.a(this.i, sar.i)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ifl ifl = this.d;
        int i = 0;
        int hashCode = ((ifl != null ? ifl.hashCode() : 0) + 0) * 31;
        ifl ifl2 = this.j;
        hashCode = (hashCode + (ifl2 != null ? ifl2.hashCode() : 0)) * 31;
        ifl2 = this.k;
        hashCode = (hashCode + (ifl2 != null ? ifl2.hashCode() : 0)) * 31;
        ifl2 = this.e;
        hashCode = (hashCode + (ifl2 != null ? ifl2.hashCode() : 0)) * 31;
        ifl2 = this.f;
        hashCode = (hashCode + (ifl2 != null ? ifl2.hashCode() : 0)) * 31;
        ifl2 = this.g;
        hashCode = (hashCode + (ifl2 != null ? ifl2.hashCode() : 0)) * 31;
        ifl2 = this.h;
        hashCode = (hashCode + (ifl2 != null ? ifl2.hashCode() : 0)) * 31;
        int i2 = this.l;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        String str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ResponseInfo(isResumable=false");
        stringBuilder.append(", isPaused=false");
        stringBuilder.append(", isResumed=false");
        stringBuilder.append(", requestReceivedTimestamp=");
        stringBuilder.append(this.d);
        stringBuilder.append(", requestRejectedTimestamp=");
        stringBuilder.append(this.j);
        stringBuilder.append(", userInitiatedRequestReceiveTimeStamp=");
        stringBuilder.append(this.k);
        stringBuilder.append(", requestStartTimestamp=");
        stringBuilder.append(this.e);
        stringBuilder.append(", responseStartTimestamp=");
        stringBuilder.append(this.f);
        stringBuilder.append(", redirectReceivedTimestamp=");
        stringBuilder.append(this.g);
        stringBuilder.append(", responseEndTimestamp=");
        stringBuilder.append(this.h);
        stringBuilder.append(", isStreaming=");
        stringBuilder.append(this.l);
        stringBuilder.append(", redirectDestinationUrl=");
        stringBuilder.append(this.i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
