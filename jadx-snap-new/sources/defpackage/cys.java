package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: cys */
public final class cys {
    public final cyr a;
    public final String b;
    public final Map<String, String> c;
    public final byte[] d;
    public final sac e;
    public final long f;
    public final cvp g;

    private cys(cyr cyr, String str, Map<String, String> map, byte[] bArr, sac sac, long j, cvp cvp) {
        akcr.b(cyr, "requestType");
        akcr.b(str, "url");
        akcr.b(map, "headers");
        akcr.b(bArr, "payload");
        akcr.b(sac, "method");
        this.a = cyr;
        this.b = str;
        this.c = map;
        this.d = bArr;
        this.e = sac;
        this.f = j;
        this.g = cvp;
    }

    public /* synthetic */ cys(cyr cyr, String str, Map map, byte[] bArr, sac sac, long j, cvp cvp, int i) {
        this(cyr, str, (i & 4) != 0 ? ajyx.a : map, bArr, (i & 16) != 0 ? sac.POST : sac, j, (i & 64) != 0 ? null : cvp);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            cys cys = (cys) obj;
            return (akcr.a(this.b, cys.b) ^ 1) == 0 && (akcr.a(this.c, cys.c) ^ 1) == 0 && Arrays.equals(this.d, cys.d) && this.e == cys.e && this.f == cys.f && this.g == cys.g;
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snap.ads.network.SnapAdsRequest");
        }
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + Long.valueOf(this.f).hashCode();
        cvp cvp = this.g;
        return cvp != null ? (hashCode * 31) + cvp.hashCode() : hashCode;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapAdsRequest(requestType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", url=");
        stringBuilder.append(this.b);
        stringBuilder.append(", headers=");
        stringBuilder.append(this.c);
        stringBuilder.append(", payload=");
        stringBuilder.append(Arrays.toString(this.d));
        stringBuilder.append(", method=");
        stringBuilder.append(this.e);
        stringBuilder.append(", timeoutSeconds=");
        stringBuilder.append(this.f);
        stringBuilder.append(", adProduct=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
