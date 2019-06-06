package defpackage;

import java.util.UUID;

/* renamed from: rwy */
public final class rwy {
    final UUID a;
    final long b;
    final boolean c;
    final boolean d;

    public rwy(UUID uuid, long j, boolean z, boolean z2) {
        akcr.b(uuid, "uuid");
        this.a = uuid;
        this.b = j;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rwy) {
                rwy rwy = (rwy) obj;
                if (akcr.a(this.a, rwy.a)) {
                    if ((this.b == rwy.b ? 1 : null) != null) {
                        if ((this.c == rwy.c ? 1 : null) != null) {
                            if ((this.d == rwy.d ? 1 : null) != null) {
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
        UUID uuid = this.a;
        int hashCode = (uuid != null ? uuid.hashCode() : 0) * 31;
        long j = this.b;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        int i = this.c;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.d;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BandwidthSample(uuid=");
        stringBuilder.append(this.a);
        stringBuilder.append(", contentLength=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isStart=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isClosed=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
