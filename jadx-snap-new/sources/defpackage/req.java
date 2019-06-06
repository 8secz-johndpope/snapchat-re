package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: req */
public final class req {
    @SerializedName("snapId")
    final String a;
    @SerializedName("esId")
    final String b;
    @SerializedName("isReplayed")
    final boolean c;
    @SerializedName("screenshotCount")
    final int d;
    @SerializedName("currentTimeMs")
    final long e;

    public req(String str, String str2, boolean z, int i, long j) {
        akcr.b(str, "snapId");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof req) {
                req req = (req) obj;
                if (akcr.a(this.a, req.a) && akcr.a(this.b, req.b)) {
                    if ((this.c == req.c ? 1 : null) != null) {
                        if ((this.d == req.d ? 1 : null) != null) {
                            if ((this.e == req.e ? 1 : null) != null) {
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
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.c;
        if (i != 0) {
            i = 1;
        }
        hashCode = (((hashCode + i) * 31) + this.d) * 31;
        long j = this.e;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UpdateSnapJobMetadata(snapId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", esId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isReplayed=");
        stringBuilder.append(this.c);
        stringBuilder.append(", screenshotCount=");
        stringBuilder.append(this.d);
        stringBuilder.append(", currentTimeMillis=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
