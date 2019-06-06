package defpackage;

/* renamed from: abzb */
public final class abzb {
    public final aama a;
    public final boolean b;
    public final aalw c;
    public final aamf d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final long i;

    public abzb(aama aama, boolean z, aalw aalw, aamf aamf, String str, boolean z2, String str2, String str3, long j) {
        akcr.b(aama, "filterMotion");
        this.a = aama;
        this.b = z;
        this.c = aalw;
        this.d = aamf;
        this.e = str;
        this.f = z2;
        this.g = str2;
        this.h = str3;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof abzb) {
                abzb abzb = (abzb) obj;
                if (akcr.a(this.a, abzb.a)) {
                    if ((this.b == abzb.b ? 1 : null) != null && akcr.a(this.c, abzb.c) && akcr.a(this.d, abzb.d) && akcr.a(this.e, abzb.e)) {
                        if ((this.f == abzb.f ? 1 : null) != null && akcr.a(this.g, abzb.g) && akcr.a(this.h, abzb.h)) {
                            if ((this.i == abzb.i ? 1 : null) != null) {
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
        aama aama = this.a;
        int i = 0;
        int hashCode = (aama != null ? aama.hashCode() : 0) * 31;
        int i2 = this.b;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        aalw aalw = this.c;
        hashCode = (hashCode + (aalw != null ? aalw.hashCode() : 0)) * 31;
        aamf aamf = this.d;
        hashCode = (hashCode + (aamf != null ? aamf.hashCode() : 0)) * 31;
        String str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        i2 = this.f;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j = this.i;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FilterMetrics(filterMotion=");
        stringBuilder.append(this.a);
        stringBuilder.append(", filterReverse=");
        stringBuilder.append(this.b);
        stringBuilder.append(", filterInfo=");
        stringBuilder.append(this.c);
        stringBuilder.append(", filterVisualType=");
        stringBuilder.append(this.d);
        stringBuilder.append(", filterGeo=");
        stringBuilder.append(this.e);
        stringBuilder.append(", contextFilterEnabled=");
        stringBuilder.append(this.f);
        stringBuilder.append(", contextFilterId=");
        stringBuilder.append(this.g);
        stringBuilder.append(", contextFilterSkyType=");
        stringBuilder.append(this.h);
        stringBuilder.append(", animatedFilterCount=");
        stringBuilder.append(this.i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
