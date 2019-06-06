package defpackage;

/* renamed from: gfe */
public final class gfe {
    public final String a;
    public final gcp b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final boolean g;

    public gfe(String str, gcp gcp, String str2, String str3, String str4, long j, boolean z) {
        akcr.b(gcp, "snapType");
        this.a = str;
        this.b = gcp;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gfe) {
                gfe gfe = (gfe) obj;
                if (akcr.a(this.a, gfe.a) && akcr.a(this.b, gfe.b) && akcr.a(this.c, gfe.c) && akcr.a(this.d, gfe.d) && akcr.a(this.e, gfe.e)) {
                    if ((this.f == gfe.f ? 1 : null) != null) {
                        if ((this.g == gfe.g ? 1 : null) != null) {
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
        gcp gcp = this.b;
        hashCode = (hashCode + (gcp != null ? gcp.hashCode() : 0)) * 31;
        String str2 = this.c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j = this.f;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        i = this.g;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaInfo(mediaId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mediaURL=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mediaIv=");
        stringBuilder.append(this.e);
        stringBuilder.append(", durationInMs=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isInfiniteSnap=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
