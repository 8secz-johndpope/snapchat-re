package defpackage;

import java.util.Map;

/* renamed from: gfj */
public final class gfj {
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    final String g;
    final Map<String, String> h;

    private /* synthetic */ gfj() {
        this(0, -1, -1, -1, -1, -1, "", ajyx.a);
    }

    public gfj(int i, long j, long j2, long j3, int i2, long j4, String str, Map<String, String> map) {
        akcr.b(str, "requestUrl");
        akcr.b(map, "responseHeaders");
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = j4;
        this.g = str;
        this.h = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gfj) {
                gfj gfj = (gfj) obj;
                if ((this.a == gfj.a ? 1 : null) != null) {
                    if ((this.b == gfj.b ? 1 : null) != null) {
                        if ((this.c == gfj.c ? 1 : null) != null) {
                            if ((this.d == gfj.d ? 1 : null) != null) {
                                if ((this.e == gfj.e ? 1 : null) != null) {
                                    if (!((this.f == gfj.f ? 1 : null) != null && akcr.a(this.g, gfj.g) && akcr.a(this.h, gfj.h))) {
                                        return false;
                                    }
                                }
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
        int i = this.a * 31;
        long j = this.b;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.c;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.d;
        i = (((i + ((int) (j ^ (j >>> 32)))) * 31) + this.e) * 31;
        j = this.f;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.g;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Map map = this.h;
        if (map != null) {
            i2 = map.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkMetrics(statusCode=");
        stringBuilder.append(this.a);
        stringBuilder.append(", totalLatencyMillis=");
        stringBuilder.append(this.b);
        stringBuilder.append(", queuingLatencyMillis=");
        stringBuilder.append(this.c);
        stringBuilder.append(", networkLatencyMillis=");
        stringBuilder.append(this.d);
        stringBuilder.append(", wireSizeBytes=");
        stringBuilder.append(this.e);
        stringBuilder.append(", payloadProcessingMillis=");
        stringBuilder.append(this.f);
        stringBuilder.append(", requestUrl=");
        stringBuilder.append(this.g);
        stringBuilder.append(", responseHeaders=");
        stringBuilder.append(this.h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
