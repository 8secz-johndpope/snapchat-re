package defpackage;

import java.util.Map;

/* renamed from: goc */
public final class goc {
    final String a;
    final String b;
    final String c;
    final boolean d;
    final long e;
    final long f;
    final long g;
    final Map<String, String> h;
    private final String i;
    private final boolean j;

    public goc(String str, String str2, String str3, boolean z, boolean z2, long j, long j2, long j3, Map<String, String> map) {
        akcr.b(str, "processorKey");
        akcr.b(str2, "constraintName");
        akcr.b(str3, "uuid");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.j = z2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = map;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(':');
        stringBuilder.append(this.b);
        this.i = stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof goc) {
                goc goc = (goc) obj;
                if (akcr.a(this.a, goc.a) && akcr.a(this.b, goc.b) && akcr.a(this.c, goc.c)) {
                    if ((this.d == goc.d ? 1 : null) != null) {
                        if ((this.j == goc.j ? 1 : null) != null) {
                            if ((this.e == goc.e ? 1 : null) != null) {
                                if ((this.f == goc.f ? 1 : null) != null) {
                                    if ((this.g == goc.g ? 1 : null) == null || !akcr.a(this.h, goc.h)) {
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
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.d;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.j;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        long j = this.e;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.f;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.g;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        Map map = this.h;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BackgroundPrefetchJobMetadata(processorKey=");
        stringBuilder.append(this.a);
        stringBuilder.append(", constraintName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", uuid=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isWifiOnly=");
        stringBuilder.append(this.d);
        stringBuilder.append(", isChargingOnly=");
        stringBuilder.append(this.j);
        stringBuilder.append(", currentTimeMillis=");
        stringBuilder.append(this.e);
        stringBuilder.append(", delayInMinutes=");
        stringBuilder.append(this.f);
        stringBuilder.append(", timeoutInMinutes=");
        stringBuilder.append(this.g);
        stringBuilder.append(", extraProperties=");
        stringBuilder.append(this.h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
