package defpackage;

/* renamed from: rxk */
public final class rxk {
    public final String a;
    public final String b;
    public final iex c;
    public final long d;
    public final rxm e;
    public final long f;
    public final rxm g;
    private final long h;

    /* renamed from: rxk$a */
    public static final class a {
        public String a;
        public String b;
        public iex c = iex.UNRECOGNIZED_VALUE;
        public long d = -1;
        public rxm e = rxm.UNRECOGNIZED_VALUE;
        public long f = -1;
        public rxm g = rxm.UNRECOGNIZED_VALUE;
        public long h = -1;

        public a() {
            String str = "";
            this.a = str;
            this.b = str;
        }
    }

    public rxk(String str, String str2, iex iex, long j, rxm rxm, long j2, rxm rxm2, long j3) {
        akcr.b(str, "carrierName");
        akcr.b(str2, "connectionType");
        akcr.b(iex, "reachability");
        akcr.b(rxm, "bandwidthClassDownload");
        akcr.b(rxm2, "bandwidthClassUpload");
        this.a = str;
        this.b = str2;
        this.c = iex;
        this.d = j;
        this.e = rxm;
        this.f = j2;
        this.g = rxm2;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rxk) {
                rxk rxk = (rxk) obj;
                if (akcr.a(this.a, rxk.a) && akcr.a(this.b, rxk.b) && akcr.a(this.c, rxk.c)) {
                    if ((this.d == rxk.d ? 1 : null) != null && akcr.a(this.e, rxk.e)) {
                        if ((this.f == rxk.f ? 1 : null) != null && akcr.a(this.g, rxk.g)) {
                            if ((this.h == rxk.h ? 1 : null) != null) {
                                return true;
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
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        iex iex = this.c;
        hashCode = (hashCode + (iex != null ? iex.hashCode() : 0)) * 31;
        long j = this.d;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        rxm rxm = this.e;
        hashCode = (hashCode + (rxm != null ? rxm.hashCode() : 0)) * 31;
        j = this.f;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        rxm = this.g;
        if (rxm != null) {
            i = rxm.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j2 = this.h;
        return hashCode + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkCondition(carrierName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", connectionType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", reachability=");
        stringBuilder.append(this.c);
        stringBuilder.append(", bandwidthEstimationDownload=");
        stringBuilder.append(this.d);
        stringBuilder.append(", bandwidthClassDownload=");
        stringBuilder.append(this.e);
        stringBuilder.append(", bandwidthEstimationUpload=");
        stringBuilder.append(this.f);
        stringBuilder.append(", bandwidthClassUpload=");
        stringBuilder.append(this.g);
        stringBuilder.append(", rttEstimation=");
        stringBuilder.append(this.h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
