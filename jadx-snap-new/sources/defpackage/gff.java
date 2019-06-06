package defpackage;

/* renamed from: gff */
public final class gff {
    public final gfc a;
    public final boolean b;
    public final long c;
    public final gfj d;
    public final gdz e;
    public final gfa f;
    public gdu g;
    public gdv h;

    public gff(gfc gfc, boolean z, long j, gfj gfj, gdz gdz, gfa gfa, gdu gdu, gdv gdv) {
        akcr.b(gfc, "loadSource");
        akcr.b(gdz, "cacheMetrics");
        this.a = gfc;
        this.b = z;
        this.c = j;
        this.d = gfj;
        this.e = gdz;
        this.f = gfa;
        this.g = gdu;
        this.h = gdv;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gff) {
                gff gff = (gff) obj;
                if (akcr.a(this.a, gff.a)) {
                    if ((this.b == gff.b ? 1 : null) != null) {
                        if (!((this.c == gff.c ? 1 : null) != null && akcr.a(this.d, gff.d) && akcr.a(this.e, gff.e) && akcr.a(this.f, gff.f) && akcr.a(this.g, gff.g) && akcr.a(this.h, gff.h))) {
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
        gfc gfc = this.a;
        int i = 0;
        int hashCode = (gfc != null ? gfc.hashCode() : 0) * 31;
        int i2 = this.b;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        long j = this.c;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        gfj gfj = this.d;
        hashCode = (hashCode + (gfj != null ? gfj.hashCode() : 0)) * 31;
        gdz gdz = this.e;
        hashCode = (hashCode + (gdz != null ? gdz.hashCode() : 0)) * 31;
        gfa gfa = this.f;
        hashCode = (hashCode + (gfa != null ? gfa.hashCode() : 0)) * 31;
        gdu gdu = this.g;
        hashCode = (hashCode + (gdu != null ? gdu.hashCode() : 0)) * 31;
        gdv gdv = this.h;
        if (gdv != null) {
            i = gdv.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Metrics(loadSource=");
        stringBuilder.append(this.a);
        stringBuilder.append(", alreadyLoading=");
        stringBuilder.append(this.b);
        stringBuilder.append(", totalLatency=");
        stringBuilder.append(this.c);
        stringBuilder.append(", networkMetrics=");
        stringBuilder.append(this.d);
        stringBuilder.append(", cacheMetrics=");
        stringBuilder.append(this.e);
        stringBuilder.append(", importMetrics=");
        stringBuilder.append(this.f);
        stringBuilder.append(", assetMetrics=");
        stringBuilder.append(this.g);
        stringBuilder.append(", boltMetrics=");
        stringBuilder.append(this.h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
