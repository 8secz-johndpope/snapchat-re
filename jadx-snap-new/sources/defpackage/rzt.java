package defpackage;

/* renamed from: rzt */
public final class rzt {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    private final int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    public rzt(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.f = i2;
        this.g = z3;
        this.d = z4;
        this.e = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rzt) {
                rzt rzt = (rzt) obj;
                if ((this.a == rzt.a ? 1 : null) != null) {
                    if ((this.b == rzt.b ? 1 : null) != null) {
                        if ((this.c == rzt.c ? 1 : null) != null) {
                            if ((this.f == rzt.f ? 1 : null) != null) {
                                if ((this.g == rzt.g ? 1 : null) != null) {
                                    if ((this.d == rzt.d ? 1 : null) != null) {
                                        if ((this.e == rzt.e ? 1 : null) != null) {
                                            if ((this.h == rzt.h ? 1 : null) != null) {
                                                if ((this.i == rzt.i ? 1 : null) != null) {
                                                    if ((this.j == rzt.j ? 1 : null) != null) {
                                                        if ((this.k == rzt.k ? 1 : null) != null) {
                                                            if ((this.l == rzt.l ? 1 : null) != null) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
        int i = this.a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.b;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (((((i + i3) * 31) + this.c) * 31) + this.f) * 31;
        i3 = this.g;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.d;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.e;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (((((i + i3) * 31) + this.h) * 31) + this.i) * 31;
        i3 = this.j;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.k;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.l;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CacheControl(noCache=");
        stringBuilder.append(this.a);
        stringBuilder.append(", noStore=");
        stringBuilder.append(this.b);
        stringBuilder.append(", maxAgeSeconds=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sMaxAgeSeconds=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isPrivate=");
        stringBuilder.append(this.g);
        stringBuilder.append(", isPublic=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mustRevalidate=");
        stringBuilder.append(this.e);
        stringBuilder.append(", maxStaleSeconds=");
        stringBuilder.append(this.h);
        stringBuilder.append(", minFreshSeconds=");
        stringBuilder.append(this.i);
        stringBuilder.append(", onlyIfCached=");
        stringBuilder.append(this.j);
        stringBuilder.append(", noTransform=");
        stringBuilder.append(this.k);
        stringBuilder.append(", immutable=");
        stringBuilder.append(this.l);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
