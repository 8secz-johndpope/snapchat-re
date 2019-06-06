package defpackage;

import com.google.common.base.Objects;

/* renamed from: hjd */
public final class hjd {
    public final int a;
    public final String b;
    public final hjv c;
    public final boolean d;
    public final boolean e;

    public hjd(int i, String str, hjv hjv, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = hjv;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hjd)) {
            return false;
        }
        hjd hjd = (hjd) obj;
        return Objects.equal(Boolean.valueOf(hjd.d), Boolean.valueOf(this.d)) && Objects.equal(Integer.valueOf(hjd.a), Integer.valueOf(this.a)) && Objects.equal(hjd.b, this.b) && Objects.equal(Boolean.valueOf(hjd.e), Boolean.valueOf(this.e));
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.d), Integer.valueOf(this.a), this.b, Boolean.valueOf(this.e));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DiscoverFeedSection(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", loggingKey=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sectionKeyName=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isLocal=");
        stringBuilder.append(this.d);
        stringBuilder.append(", useLargeTiles=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
