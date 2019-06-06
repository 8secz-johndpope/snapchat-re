package defpackage;

/* renamed from: mtx */
public final class mtx {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public mtx(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mtx) {
                mtx mtx = (mtx) obj;
                if (akcr.a(this.a, mtx.a) && akcr.a(this.b, mtx.b)) {
                    if (!((this.c == mtx.c ? 1 : null) != null && akcr.a(this.d, mtx.d) && akcr.a(this.e, mtx.e) && akcr.a(this.f, mtx.f) && akcr.a(this.g, mtx.g) && akcr.a(this.h, mtx.h))) {
                        return false;
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
        int i2 = this.c;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdTrackInfo(adServeRequestId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", rawAdData=");
        stringBuilder.append(this.b);
        stringBuilder.append(", skipTrack=");
        stringBuilder.append(this.c);
        stringBuilder.append(", encryptedSponsoredUnlockableTargetingInfoData=");
        stringBuilder.append(this.d);
        stringBuilder.append(", adTrackUrl=");
        stringBuilder.append(this.e);
        stringBuilder.append(", rankingId=");
        stringBuilder.append(this.f);
        stringBuilder.append(", rankingData=");
        stringBuilder.append(this.g);
        stringBuilder.append(", encryptedUserTrackData=");
        stringBuilder.append(this.h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
