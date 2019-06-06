package defpackage;

/* renamed from: kqr */
public final class kqr {
    public final String a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Long k;
    public final boolean l;
    public final boolean m;

    public /* synthetic */ kqr() {
        this(null, null, null, null, null, null, null, null, null, null, false, false);
    }

    public kqr(String str, String str2, Long l, Long l2, Long l3, Long l4, String str3, String str4, String str5, Long l5, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = str3;
        this.h = null;
        this.i = str4;
        this.j = str5;
        this.k = l5;
        this.l = z;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kqr) {
                kqr kqr = (kqr) obj;
                if (akcr.a(this.a, kqr.a) && akcr.a(this.b, kqr.b) && akcr.a(this.c, kqr.c) && akcr.a(this.d, kqr.d) && akcr.a(this.e, kqr.e) && akcr.a(this.f, kqr.f) && akcr.a(this.g, kqr.g) && akcr.a(null, null) && akcr.a(this.i, kqr.i) && akcr.a(this.j, kqr.j) && akcr.a(this.k, kqr.k)) {
                    if ((this.l == kqr.l ? 1 : null) != null) {
                        if ((this.m == kqr.m ? 1 : null) != null) {
                            return true;
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
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str2 = this.g;
        hashCode = ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.j;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        l = this.k;
        if (l != null) {
            i = l.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.l;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.m;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensInfoPackage(lensId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", lensBundleUrl=");
        stringBuilder.append(this.b);
        stringBuilder.append(", lensIndexPos=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lensIndexCount=");
        stringBuilder.append(this.d);
        stringBuilder.append(", faceCountFrontCamera=");
        stringBuilder.append(this.e);
        stringBuilder.append(", faceCountBackCamera=");
        stringBuilder.append(this.f);
        stringBuilder.append(", lensInfo=");
        stringBuilder.append(this.g);
        stringBuilder.append(", lensOptionId=");
        stringBuilder.append(null);
        stringBuilder.append(", lensSource=");
        stringBuilder.append(this.i);
        stringBuilder.append(", combinedLensSessionId=");
        stringBuilder.append(this.j);
        stringBuilder.append(", cameraFacing=");
        stringBuilder.append(this.k);
        stringBuilder.append(", isGeo=");
        stringBuilder.append(this.l);
        stringBuilder.append(", isSnappable=");
        stringBuilder.append(this.m);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
